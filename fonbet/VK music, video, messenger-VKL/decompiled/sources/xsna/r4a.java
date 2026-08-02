package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: CatalogEmptyRouter.kt */
/* loaded from: classes16.dex */
public final class r4a extends nda {
    @Override // xsna.nda
    public final View a(LayoutInflater layoutInflater, CatalogConfiguration catalogConfiguration, CatalogRootViewHolder catalogRootViewHolder, Bundle bundle) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new View(context);
    }

    @Override // xsna.nda
    public final CatalogRootViewHolder b() {
        return null;
    }

    @Override // xsna.nda
    public final boolean c(boolean z) {
        return false;
    }

    @Override // xsna.nda
    public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
    }
}
