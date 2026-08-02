package xsna;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.InstreamAd;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.toggle.features.VideoFeatures;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.zu50;

/* compiled from: VideoAdvertisementsRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class s0s0 implements VideoAdvertisementsRepository {
    public final x11 a;
    public final kmk0 b;
    public final od0 c;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public zu50 g;
    public g2d0 i;
    public io.reactivex.rxjava3.disposables.c m;
    public final bpn0 d = new bpn0(new h13(27));
    public final io.reactivex.rxjava3.subjects.d<VideoAdvertisementsRepository.a> h = io.reactivex.rxjava3.subjects.d.O0(new VideoAdvertisementsRepository.a.C1194a(false));
    public final LinkedHashSet j = new LinkedHashSet();
    public final io.reactivex.rxjava3.subjects.d<a21> k = io.reactivex.rxjava3.subjects.d.O0(new a21("", null, null, null, null, null));
    public final LinkedHashMap l = new LinkedHashMap();

    /* compiled from: VideoAdvertisementsRepositoryImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAdvertisementsRepository.AdType.values().length];
            try {
                iArr[VideoAdvertisementsRepository.AdType.SPORT_ODDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAdvertisementsRepository.AdType.SPORT_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAdvertisementsRepository.AdType.INSTREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAdvertisementsRepository.AdType.OVERLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s0s0(x11 x11Var, kmk0 kmk0Var, dmx0 dmx0Var, od0 od0Var) {
        this.a = x11Var;
        this.b = kmk0Var;
        this.c = od0Var;
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final io.reactivex.rxjava3.core.q<List<Long>> a() {
        return new io.reactivex.rxjava3.internal.operators.observable.y(this.k.U(new cfz(new eyp0(6), 16)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final void b(String str, AdSection adSection) {
        x11.a(str, this.k.P0().a, adSection != null ? adSection.name() : null).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe();
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final void c(VideoAdvertisementsRepository.AdType adType) {
        int i = c.$EnumSwitchMapping$0[adType.ordinal()];
        io.reactivex.rxjava3.subjects.d<a21> dVar = this.k;
        if (i == 1 || i == 2) {
            io.reactivex.rxjava3.disposables.c cVar = this.m;
            if (cVar != null) {
                cVar.dispose();
            }
            dVar.onNext(a21.a(dVar.P0(), 47));
            this.l.clear();
            return;
        }
        if (i == 3) {
            dVar.onNext(a21.a(dVar.P0(), 55));
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        zu50 zu50Var = this.g;
        if (zu50Var != null) {
            zu50Var.a();
        }
        this.g = null;
        this.h.onNext(new VideoAdvertisementsRepository.a.C1194a(false));
        this.i = null;
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final void d(long j) {
        Object obj;
        String str;
        List<? extends d290> list = this.k.P0().f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((d290) obj).b == j) {
                        break;
                    }
                }
            }
            d290 d290Var = (d290) obj;
            if (d290Var == null || (str = d290Var.a) == null) {
                return;
            }
            this.i = new g2d0(str, j, 4);
            List singletonList = Collections.singletonList(str);
            a290 a290Var = this.a.c;
            String a2 = m8f0.a();
            tfx tfxVar = new tfx("video.getAdsData", new koi0(8), new thl0(7));
            tfxVar.i("banner_ids", singletonList);
            tfx.o(tfxVar, "device_id", a2, 0, 0, 12);
            dz2 x = yfb.x(tfxVar);
            ahn.D(x);
            this.f = rsg0.l0(x, null, 3).U(new hi70(new u9e(a290Var, 6), 1)).subscribe(new k5j0(new mcj0(this, 19), 14));
        }
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final io.reactivex.rxjava3.core.q<VideoAdvertisementsRepository.a> e(VideoAdvertisementsRepository.AdType adType, String str) {
        int i = c.$EnumSwitchMapping$0[adType.ordinal()];
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        io.reactivex.rxjava3.subjects.d<a21> dVar = this.k;
        if (i == 1 || i == 2) {
            return new io.reactivex.rxjava3.internal.operators.observable.y(dVar.U(new fe60(new bws(24), 16)), qVar, aVar).s0(new qu50(new zo8(this, adType, str, 12), 17));
        }
        if (i != 3) {
            if (i == 4) {
                return this.h;
            }
            throw new NoWhenBranchMatchedException();
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_INSTREAM_LOGIC;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            return io.reactivex.rxjava3.core.q.T(new VideoAdvertisementsRepository.a.C1194a(false));
        }
        ac20 ac20Var = new ac20(new yaq0(2), 21);
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, ac20Var).U(new uf20(new puq0(2), 20)), qVar, aVar).U(new osk0(new zlm0(7), 11));
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final VideoAdvertisementsRepository.a.c f() {
        VideoAdvertisementsRepository.a P0 = this.h.P0();
        if (P0 instanceof VideoAdvertisementsRepository.a.c) {
            return (VideoAdvertisementsRepository.a.c) P0;
        }
        return null;
    }

    @Override // com.vk.libvideo.api.ad.VideoAdvertisementsRepository
    public final void g(String str, InstreamAd instreamAd, String str2, String str3, long j) {
        if (str == null) {
            return;
        }
        io.reactivex.rxjava3.subjects.d<a21> dVar = this.k;
        if (epx.f(dVar.P0().a, str)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        zu50 zu50Var = this.g;
        if (zu50Var != null) {
            zu50Var.a();
        }
        this.g = null;
        boolean z = false;
        this.h.onNext(new VideoAdvertisementsRepository.a.C1194a(false));
        this.i = null;
        this.j.clear();
        dVar.onNext(new a21("", null, null, null, null, null));
        this.l.clear();
        if (((Boolean) this.d.getValue()).booleanValue() && dmx0.i.get() && dmx0.c()) {
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : instreamAd.d.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        if (BuildInfo.q()) {
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "com.vk.vkvideo");
        }
        if (z) {
            jSONObject.put("is_whitelist_internet", 1);
        }
        JSONObject f = com.vkontakte.android.data.b.f();
        if (f != null) {
            for (Map.Entry entry2 : f370.M(f).entrySet()) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        jSONObject.put(CommonUrlParts.REQUEST_ID, str3);
        String jSONObject2 = jSONObject.toString();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b2 = b6m.b(context);
        tfx tfxVar = new tfx("video.getAds", new com.vk.movika.sdk.base.model.n(29), new xul0(5));
        tfx.o(tfxVar, "video", str, 0, 0, 12);
        tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        if (b2 != null) {
            tfx.o(tfxVar, "device_id", b2, 0, 0, 12);
        }
        if (jSONObject2 != null) {
            tfx.o(tfxVar, "query_params", jSONObject2, 0, 0, 12);
        }
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        this.e = rsg0.l0(x, null, 3).U(new e10(new q11(this.a, str, str3, j), 2)).subscribe(new wx00(new k7l0(this, 15), 25), new uk40(new u5p0(this, 7), 22));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 h(String str, String str2, VideoAdvertisementsRepository.AdType adType, String str3) {
        boolean z = adType == VideoAdvertisementsRepository.AdType.SPORT_ODDS;
        nmk0 nmk0Var = this.a.b;
        if (str3 != null) {
            lmk0 lmk0Var = nmk0Var.a;
            (z ? lmk0Var.b : lmk0Var.a).a(str3);
        }
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.s0(new mc6(str2, nmk0Var)), new qu50(new f1s(29), 10));
        k5j0 k5j0Var = new k5j0(new sd1(nmk0Var, z, 3), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.core.q<R> L = p1Var.E(k5j0Var, lVar, kVar, kVar).r0(asu0.a.c()).L(new xx40(new o82(nmk0Var, str, z, 2), 8), false);
        did0 did0Var = new did0(new ow60(15), 5);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(L, did0Var).U(new xx40(new oan0(6), 14));
    }

    /* compiled from: VideoAdvertisementsRepositoryImpl.kt */
    public final class b implements zu50.c {
        public final g2d0 a;

        public b(g2d0 g2d0Var) {
            this.a = g2d0Var;
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            s0s0.this.h.onNext(new VideoAdvertisementsRepository.a.C1194a(true));
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            s0s0 s0s0Var = s0s0.this;
            io.reactivex.rxjava3.subjects.d<VideoAdvertisementsRepository.a> dVar = s0s0Var.h;
            g2d0 g2d0Var = this.a;
            dVar.onNext(new VideoAdvertisementsRepository.a.c(cw50Var, zu50Var, g2d0Var != null ? g2d0Var.c : 0L, g2d0Var != null ? g2d0Var.b : -1L, new mdm0(s0s0Var, 13), new eg1(18, s0s0Var, this)));
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

    /* compiled from: VideoAdvertisementsRepositoryImpl.kt */
    public final class a implements zu50.b {
        public a() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            zu50Var.a();
            s0s0.this.h.onNext(new VideoAdvertisementsRepository.a.C1194a(false));
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
