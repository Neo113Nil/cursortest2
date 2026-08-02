package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeAdsBottomBanner;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.kd0;
import xsna.lyr0;
import xsna.zu50;

/* compiled from: VideoAdBannerRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class myr0 implements lyr0 {
    public final od0 a;
    public final bpn0 b = new bpn0(new ia90(12));
    public final io.reactivex.rxjava3.subjects.d<lyr0.a> c = io.reactivex.rxjava3.subjects.d.O0(new lyr0.a.C3311a(false));
    public String d;

    public myr0(od0 od0Var) {
        this.a = od0Var;
    }

    public static void c(MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype eventSubtype, String str, Long l) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeAdsBottomBanner(eventSubtype, str, l, null, null, null, 56, null), 8)).q();
    }

    public static /* synthetic */ void d(MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype eventSubtype, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        c(eventSubtype, str, null);
    }

    @Override // xsna.lyr0
    public final void a(String str, String str2) {
        if (!((Boolean) this.b.getValue()).booleanValue() || epx.f(str2, this.d)) {
            return;
        }
        kd0.b a2 = this.a.a();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        zu50 zu50Var = new zu50(1765027, a2, context);
        qnk qnkVar = zu50Var.a.a;
        if (str != null) {
            qnkVar.g(CommonUrlParts.REQUEST_ID, str);
        }
        if (str2 != null) {
            qnkVar.g("video_id", str2);
        }
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        qnkVar.g("device_id", b6m.b(context2));
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        qnkVar.g("user_id", String.valueOf(((b25) bpn0Var.getValue()).o().b().c.b));
        zu50Var.i = new b();
        zu50Var.l = new a();
        d(MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype.REQUEST, null, 6);
        zu50Var.g();
        this.d = str2;
    }

    @Override // xsna.lyr0
    public final io.reactivex.rxjava3.core.q<lyr0.a> b() {
        return this.c;
    }

    /* compiled from: VideoAdBannerRepositoryImpl.kt */
    public final class b implements zu50.c {
        public b() {
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            String str;
            myr0.this.c.onNext(new lyr0.a.C3311a(true));
            MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype eventSubtype = MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype.ERROR;
            String valueOf = String.valueOf(iaz0Var.a);
            cw50 d = zu50Var.d();
            myr0.c(eventSubtype, valueOf, (d == null || (str = d.f) == null) ? null : arm0.n(str));
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            myr0 myr0Var = myr0.this;
            myr0Var.a.c(cw50Var);
            myr0Var.c.onNext(new lyr0.a.b(cw50Var, zu50Var));
            MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype eventSubtype = MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype.RESPONSE;
            myr0.d(eventSubtype, "1", 4);
            if (cw50Var.f == null || zu50Var.d() == null) {
                myr0.d(eventSubtype, "0", 4);
            }
        }

        @Override // xsna.zu50.c
        public final void onClick() {
        }

        @Override // xsna.zu50.c
        public final void onVideoComplete() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPause() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPlay() {
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
        }
    }

    /* compiled from: VideoAdBannerRepositoryImpl.kt */
    public final class a implements zu50.b {
        public a() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            myr0.d(MobileOfficialAppsVideoStat$TypeAdsBottomBanner.EventSubtype.HIDE, "2", 4);
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            zu50Var.a();
            myr0.this.c.onNext(new lyr0.a.C3311a(false));
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
