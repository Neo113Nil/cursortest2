package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dto.search.SearchStatsLoggingInfo;
import java.util.ArrayDeque;
import kotlin.Pair;

/* compiled from: CatalogViewRouter.kt */
/* loaded from: classes16.dex */
public final class yia extends nda {
    public final Context b;
    public final a c;
    public final FitSystemWindowsFrameLayout d;
    public CatalogRootViewHolder e;
    public final ArrayDeque f = new ArrayDeque();

    /* compiled from: CatalogViewRouter.kt */
    public interface a {
        void a();

        boolean a0();
    }

    public yia(FragmentActivity fragmentActivity, a aVar) {
        this.b = fragmentActivity;
        this.c = aVar;
        this.d = new FitSystemWindowsFrameLayout(fragmentActivity, null);
    }

    @Override // xsna.nda
    public final View a(LayoutInflater layoutInflater, CatalogConfiguration catalogConfiguration, CatalogRootViewHolder catalogRootViewHolder, Bundle bundle) {
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.d;
        View X = catalogRootViewHolder.X(layoutInflater, fitSystemWindowsFrameLayout, null);
        fitSystemWindowsFrameLayout.removeAllViews();
        this.f.offerLast(new Pair(catalogRootViewHolder, X));
        this.e = catalogRootViewHolder;
        if ((catalogRootViewHolder instanceof ShowAllListRootVh) || bundle == null || !bundle.containsKey("section")) {
            fitSystemWindowsFrameLayout.addView(X, -1, -1);
            return fitSystemWindowsFrameLayout;
        }
        String string = bundle.getString("section");
        String str = string == null ? "" : string;
        String string2 = bundle.getString("title");
        nda.e(this, layoutInflater.getContext(), catalogConfiguration, str, string2 == null ? "" : string2, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
        return fitSystemWindowsFrameLayout;
    }

    @Override // xsna.nda
    public final CatalogRootViewHolder b() {
        return this.e;
    }

    @Override // xsna.nda
    public final boolean c(boolean z) {
        CatalogRootViewHolder catalogRootViewHolder;
        CatalogRootViewHolder catalogRootViewHolder2 = this.e;
        if (catalogRootViewHolder2 == null) {
            if (BuildInfo.h()) {
                throw new RuntimeException("You must set rootCatalogViewHolder!");
            }
            return false;
        }
        if (catalogRootViewHolder2.W()) {
            return true;
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.size() > 1) {
            FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.d;
            fitSystemWindowsFrameLayout.removeAllViews();
            Pair pair = (Pair) arrayDeque.pollLast();
            if (pair != null && (catalogRootViewHolder = (CatalogRootViewHolder) pair.i()) != null) {
                catalogRootViewHolder.L();
            }
            Pair pair2 = (Pair) arrayDeque.peekLast();
            if (pair2 != null) {
                CatalogRootViewHolder catalogRootViewHolder3 = (CatalogRootViewHolder) pair2.d();
                View view = (View) pair2.g();
                this.e = catalogRootViewHolder3;
                fitSystemWindowsFrameLayout.addView(view, -1, -1);
                return true;
            }
        }
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a0();
        }
        return false;
    }

    @Override // xsna.nda
    public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
        CatalogRootViewHolder catalogRootViewHolder = this.e;
        if (catalogRootViewHolder == null) {
            if (BuildInfo.h()) {
                throw new RuntimeException("You must set rootCatalogViewHolder!");
            }
            return;
        }
        Bundle bundle = new Bundle(catalogRootViewHolder.h);
        bundle.putString("section", str);
        bundle.putString("title", str2);
        bundle.putString("entry_point", this.a);
        bundle.remove("___CTLG_KEY_CLASS__");
        CatalogRootViewHolder catalogRootViewHolder2 = this.e;
        Class<?> cls = catalogRootViewHolder2 != null ? catalogRootViewHolder2.g : null;
        bpn0 bpn0Var = enj.a;
        new ShowAllListRootVh(cls, bundle, e3m.h(this.b), this, this.e).k5(e3m.b(context), this.d, null);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
