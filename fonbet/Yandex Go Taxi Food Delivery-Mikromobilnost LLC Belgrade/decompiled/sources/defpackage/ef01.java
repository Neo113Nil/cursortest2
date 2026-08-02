package defpackage;

import android.net.Uri;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class ef01 {
    public final b a;

    public ef01(b bVar) {
        this.a = bVar;
    }

    public final DeeplinkAction a(Uri uri) {
        b bVar = this.a;
        bVar.getClass();
        if (!((CommonFeatureFlag) bVar.d(wlp.D).getData()).isEnabled()) {
            return null;
        }
        String o = bzk0.o(uri, SdkUri$QueryParam.PRODUCT);
        boolean i = bzk0.i(uri, SdkUri$QueryParam.SHOW_TABBAR, false);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.HEADER_STYLE);
        boolean i2 = bzk0.i(uri, SdkUri$QueryParam.HIDE_FILTERS, false);
        String o3 = bzk0.o(uri, SdkUri$QueryParam.FILTER_STYLE);
        if (jl40.l(uri.getPath(), "/transactions_feed") && o == null) {
            return new DeeplinkAction.TransactionsFeed(null, i, i2);
        }
        if (jl40.l(uri.getPath(), "/transactions_feed") && o != null) {
            return new DeeplinkAction.TransactionsFeed(new DeeplinkAction.TransactionsFeed.Filter(o, bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID), o2, o3), i, i2);
        }
        if (jl40.l(uri.getPath(), "/transaction_feed_filter_selected") && o == null) {
            return DeeplinkAction.TransactionsFeedFilterSelected.Empty.INSTANCE;
        }
        if (!jl40.l(uri.getPath(), "/transaction_feed_filter_selected") || o == null) {
            return null;
        }
        return new DeeplinkAction.TransactionsFeedFilterSelected.ByProduct(o, bzk0.o(uri, SdkUri$QueryParam.AGREEMENT_ID), o2, o3);
    }
}
