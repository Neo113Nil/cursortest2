package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.dxs;
import xsna.gi0;
import xsna.j11;
import xsna.mo6;
import xsna.ukk0;
import xsna.y31;

/* compiled from: AdvertisementControllerImpl.kt */
/* loaded from: classes6.dex */
public final class z31 implements y31 {
    public final a a;
    public final r31 b;
    public final mm6 c;
    public final sni d;
    public aj0 e;
    public final bpn0 f;
    public gzs<Boolean> g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    /* compiled from: AdvertisementControllerImpl.kt */
    public static final class a {
        public final d41 a;
        public final i16 b;
        public final zws c;
        public final del0 d;
        public final mel0 e;
        public final C4153a f;

        /* compiled from: AdvertisementControllerImpl.kt */
        /* renamed from: xsna.z31$a$a, reason: collision with other inner class name */
        public static final class C4153a {
            public static final C4153a a = new C4153a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4153a);
            }

            public final int hashCode() {
                return -317297649;
            }

            public final String toString() {
                return "Features";
            }
        }

        public a(d41 d41Var, i16 i16Var, zws zwsVar, del0 del0Var, mel0 mel0Var) {
            C4153a c4153a = C4153a.a;
            this.a = d41Var;
            this.b = i16Var;
            this.c = zwsVar;
            this.d = del0Var;
            this.e = mel0Var;
            this.f = c4153a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
            this.f.getClass();
            return hashCode - 317297649;
        }

        public final String toString() {
            return "AdvertisementContext(advertisementCallback=" + this.a + ", bannerCallback=" + this.b + ", fullscreenAdFactory=" + this.c + ", stickyBannerAdFactory=" + this.d + ", stickyBannerViewFactoryProvider=" + this.e + ", features=" + this.f + ')';
        }
    }

    public z31(a aVar, r31 r31Var, mm6 mm6Var) {
        sni sniVar = new sni(14);
        this.a = aVar;
        this.b = r31Var;
        this.c = mm6Var;
        this.d = sniVar;
        this.e = new aj0(0);
        this.f = new bpn0(new ac(this, 3));
        this.g = new c24(0);
        this.h = new bpn0(new f5(this, 3));
        this.i = new bpn0(new g5(this, 1));
        this.j = new bpn0(new i70(this, 1));
    }

    @Override // xsna.y31
    public final void a() {
        bel0 o = o();
        io.reactivex.rxjava3.disposables.c cVar = o.k;
        if (cVar != null) {
            cVar.dispose();
        }
        o.k = null;
    }

    @Override // xsna.y31
    public final void b(Context context) {
        bel0 o = o();
        o.getClass();
        bel0.x(o, context, new rei(7), null, new h13(23), 4);
    }

    @Override // xsna.y31
    public final void c(BannerAdUiData bannerAdUiData, long j, Context context, WebAdConfig webAdConfig) {
        o().c(bannerAdUiData, j, context, webAdConfig);
    }

    @Override // xsna.y31
    public final void d(Activity activity, y31.a aVar, WebAdConfig webAdConfig) {
        fxs fxsVar = (fxs) this.i.getValue();
        fxsVar.getClass();
        AdvertisementType advertisementType = aVar.b;
        dxs.a a2 = fxsVar.s().a(advertisementType);
        if (!(a2 != null ? a2.a(fxsVar.g.i()) : false)) {
            fxsVar.w(activity, aVar, webAdConfig, true, AdRequestPurpose.CHECK_INSTANCE);
            return;
        }
        y31.b bVar = fxsVar.e;
        dxs.a a3 = fxsVar.s().a(advertisementType);
        bVar.d(advertisementType, true, a3 != null ? a3.c : null);
    }

    @Override // xsna.y31
    public final void e(Activity activity, y31.a aVar, WebAdConfig webAdConfig) {
        ((fxs) this.i.getValue()).w(activity, aVar, webAdConfig, false, AdRequestPurpose.LOAD_INITIAL_INSTANCE);
    }

    @Override // xsna.y31
    public final void f(Activity activity, k1y k1yVar) {
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        gnlVar.c.getClass();
        k1yVar.invoke(null);
    }

    @Override // xsna.y31
    public final BannerParamsSnapshot g() {
        bel0 o = o();
        return o.s(o.g);
    }

    @Override // xsna.y31
    public final boolean h(WebAdConfig webAdConfig) {
        if (webAdConfig == null) {
            return false;
        }
        ArrayList d = webAdConfig.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() != -1) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            gnl gnlVar = e370.m;
            if (gnlVar == null) {
                gnlVar = null;
            }
            if (gnlVar.a().j0().x(Integer.valueOf(intValue)) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.y31
    public final void i(Activity activity, long j, WebAdConfig webAdConfig, y31.d dVar) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        AdvertisementConfig.SlotConfig g;
        List<Integer> d;
        bpn0 bpn0Var = this.h;
        aj0 a3 = ((b41) bpn0Var.getValue()).a();
        df0 df0Var = new df0(a3.a, a3.d, a3.b, a3.c, ((b41) bpn0Var.getValue()).isTestModeEnabled(), ((b41) bpn0Var.getValue()).b());
        tkk0 tkk0Var = dVar.b;
        zws zwsVar = this.a.c;
        r31 r31Var = dVar.a;
        ukk0 ukk0Var = new ukk0(tkk0Var, zwsVar, df0Var, new ukk0.a(r31Var, new vh0(this.c, AdRequestEvent.RequestType.SPLASH)), dVar.c);
        r31Var.b = ukk0.g;
        r31Var.a = false;
        gnl gnlVar = e370.m;
        EmptyList emptyList = null;
        if (gnlVar == null) {
            gnlVar = null;
        }
        com.vk.superapp.advertisement.b f = gnlVar.a().f();
        int i = webAdConfig.b;
        AdvertisementConfig v = f.v();
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                        break;
                    }
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null && (g = configItem.g()) != null && (d = g.d()) != null) {
                List<Integer> list = d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new gi0.a(((Number) it2.next()).intValue(), null, AdvertisementType.INTERSTITIAL, i));
                }
                emptyList = arrayList;
            }
        }
        if (emptyList == null) {
            emptyList = EmptyList.b;
        }
        ukk0Var.a(new uh0(AdRequestPurpose.SHOW_INSTANCE), activity, j, emptyList, new j11.a(2004, "No slots available", "Hasn't banners error"));
    }

    @Override // xsna.y31
    public final boolean j() {
        return o().k != null;
    }

    @Override // xsna.y31
    public final void k(Activity activity, y31.a aVar, WebAdConfig webAdConfig) {
        fxs fxsVar = (fxs) this.i.getValue();
        r31 r31Var = (r31) fxsVar.b;
        r31Var.b = aVar.b;
        r31Var.a = aVar.c;
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        gnlVar.a().m();
        fxsVar.x(activity, aVar, webAdConfig);
    }

    @Override // xsna.y31
    public final void l(aj0 aj0Var, m1y m1yVar) {
        this.e = aj0Var;
        this.g = m1yVar;
    }

    @Override // xsna.y31
    public final void m(boolean z) {
        bel0 o = o();
        io.reactivex.rxjava3.disposables.c cVar = o.k;
        if (cVar != null) {
            cVar.dispose();
        }
        o.k = null;
        BannerParamsSnapshot s = o.s(o.g);
        mo6.a aVar = o.g;
        String str = aVar != null ? aVar.b : null;
        if (aVar != null) {
            aVar.a.a();
        }
        o.g = null;
        ydl0 ydl0Var = o.h;
        if (ydl0Var != null) {
            ydl0Var.c();
        }
        o.h = null;
        if (z) {
            o.e.e(s, str);
        }
    }

    @Override // xsna.y31
    public final void n(Context context, WebAdConfig webAdConfig) {
        bel0 o = o();
        o.getClass();
        bel0.x(o, context, null, new fjh(o, context, webAdConfig, 4), new iud0(5), 2);
    }

    public final bel0 o() {
        return (bel0) this.j.getValue();
    }

    @Override // xsna.y31
    public final void release() {
        cxs cxsVar;
        HashMap hashMap = ((fxs) this.i.getValue()).s().a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            dxs.a aVar = (dxs.a) ((Map.Entry) it.next()).getValue();
            if (aVar != null && (cxsVar = aVar.f) != null) {
                cxsVar.a();
            }
        }
        hashMap.clear();
        bel0 o = o();
        io.reactivex.rxjava3.disposables.c cVar = o.k;
        if (cVar != null) {
            cVar.dispose();
        }
        o.k = null;
        r31 r31Var = this.b;
        r31Var.i();
        r31Var.i = null;
        r31Var.k = null;
        r31Var.g = null;
    }
}
