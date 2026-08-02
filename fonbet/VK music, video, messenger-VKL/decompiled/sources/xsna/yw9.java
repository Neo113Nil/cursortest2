package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;

/* compiled from: CartInnerRouter.kt */
/* loaded from: classes18.dex */
public final class yw9 extends o5a {
    public final FragmentImpl d;
    public final izs<rv9, s3q0> e;
    public final Context f;
    public final Object g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;

    /* JADX WARN: Multi-variable type inference failed */
    public yw9(FragmentImpl fragmentImpl, izs<? super rv9, s3q0> izsVar) {
        super(fragmentImpl);
        this.d = fragmentImpl;
        this.e = izsVar;
        this.f = fragmentImpl.requireContext();
        this.g = msy.a(LazyThreadSafetyMode.NONE, new i13(5));
        this.h = new bpn0(new j70(this, 10));
        this.i = new bpn0(new defpackage.r(this, 17));
        this.j = new bpn0(new yh(this, 14));
        this.k = new bpn0(new ic(this, 14));
        this.l = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 16));
        this.m = new bpn0(new h9(this, 10));
        bpn0 bpn0Var = new bpn0(new defpackage.k(this, 7));
        this.n = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 12));
        ((zd3) bpn0Var.getValue()).c(new com.vk.movika.sdk.base.observable.w(this, 16));
    }

    @Override // xsna.o5a, xsna.nda
    public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
        ((dhc) this.h.getValue()).d(context, new ngc(null, str, null, null, null, null, null, null, null, null, new MarketAnalyticsParams(null, null, CommonMarketStat$TypeRefSource.EMPTY_CART, null, null, null, null, false, null, false, false, null, false, 8187, null), null, false, str2, 1507323));
    }

    public final void f(int i, int i2, String str) {
        ikv0.a aVar = new ikv0.a(this.f);
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(i2), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.b().c();
    }
}
