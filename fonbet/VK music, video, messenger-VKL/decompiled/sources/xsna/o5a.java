package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: CatalogFragmentRouter.kt */
/* loaded from: classes16.dex */
public class o5a extends nda {
    public final FragmentImpl b;
    public CatalogRootViewHolder c;

    public o5a(FragmentImpl fragmentImpl) {
        this.b = fragmentImpl;
    }

    @Override // xsna.nda
    public final View a(LayoutInflater layoutInflater, CatalogConfiguration catalogConfiguration, CatalogRootViewHolder catalogRootViewHolder, Bundle bundle) {
        this.c = catalogRootViewHolder;
        return catalogRootViewHolder.X(layoutInflater, new FitSystemWindowsFrameLayout(layoutInflater.getContext(), null), null);
    }

    @Override // xsna.nda
    public final CatalogRootViewHolder b() {
        return this.c;
    }

    @Override // xsna.nda
    public final boolean c(boolean z) {
        CatalogRootViewHolder catalogRootViewHolder = this.c;
        if (catalogRootViewHolder != null && catalogRootViewHolder.W()) {
            return true;
        }
        if (z) {
            return false;
        }
        this.b.finish();
        return false;
    }

    @Override // xsna.nda
    public void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
        if (lpg0Var == null) {
            CatalogShowAllFragment.a aVar = new CatalogShowAllFragment.a();
            aVar.B(catalogConfiguration);
            aVar.F(str);
            aVar.G(str2);
            aVar.j.putString(TtmlNode.TAG_LAYOUT, str3);
            aVar.C(this.a);
            aVar.E(searchStatsLoggingInfo);
            aVar.k(context);
            return;
        }
        CatalogShowAllFragment.b bVar = new CatalogShowAllFragment.b();
        iw50 iw50Var = bVar.b;
        Bundle bundle = iw50Var.a;
        Bundle bundle2 = iw50Var.a;
        bundle.putBundle("catalog_state", catalogConfiguration.r());
        iw50Var.a.putString("section", str);
        iw50Var.a.putString("title", str2);
        bundle2.putString(TtmlNode.TAG_LAYOUT, str3);
        iw50Var.a.putString("entry_point", this.a);
        bundle2.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        lpg0Var.a(context, bVar);
    }
}
