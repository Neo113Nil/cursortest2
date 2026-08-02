package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.dto.search.SearchStatsLoggingInfo;

/* compiled from: CatalogRouter.kt */
/* loaded from: classes16.dex */
public abstract class nda {
    public String a = "CatalogRouter.NOT_SET";

    public static /* synthetic */ void e(nda ndaVar, Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 128) != 0) {
            lpg0Var = null;
        }
        ndaVar.d(context, catalogConfiguration, str, str2, str3, searchStatsLoggingInfo, lpg0Var);
    }

    public abstract View a(LayoutInflater layoutInflater, CatalogConfiguration catalogConfiguration, CatalogRootViewHolder catalogRootViewHolder, Bundle bundle);

    public abstract CatalogRootViewHolder b();

    public abstract boolean c(boolean z);

    public abstract void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var);
}
