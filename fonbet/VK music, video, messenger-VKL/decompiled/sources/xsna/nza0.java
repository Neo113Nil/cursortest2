package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.ironsource.X3;
import com.vk.libvideo.api.di.VideoStatsComponent;
import com.vk.media.player.VideoMode;
import com.vk.media.player.VideoPlayerType;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.reefton.Reef;
import com.vk.toggle.Features;
import com.vk.toggle.features.VideoFeatures;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.random.Random;
import one.video.player.OneVideoPlayer;
import one.video.statistics.ContentType;
import xsna.gkl;
import xsna.gof0;

/* compiled from: PlayerAnalyticsWrapper.kt */
/* loaded from: classes3.dex */
public final class nza0 implements xnv {
    public static final a x;
    public static final /* synthetic */ qcy<Object>[] y;
    public static final Object z;
    public final VkHttpCallFactory a;
    public final ry70 b;
    public Reef c;
    public final Object d;
    public en80 e;
    public gof0 f;
    public final bj80 g;
    public final fit0 h;
    public oyk0 i;
    public final b j;
    public final gkl.a k;
    public gkl l;
    public final uxs0 m;
    public final jme n;
    public final uuv0 o;
    public mza0 p;
    public final boolean q;
    public Integer r;
    public VideoMode s;
    public final pgn t;
    public g4b0 u;
    public Pair<? extends List<? extends zpa0>, ? extends Uri> v;
    public cx1 w;

    /* compiled from: PlayerAnalyticsWrapper.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        public static final boolean a(a aVar) {
            aVar.getClass();
            return ((Boolean) nza0.z.getValue()).booleanValue();
        }
    }

    /* compiled from: PlayerAnalyticsWrapper.kt */
    public static final class b {
        public OneVideoPlayer a;
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(nza0.class, "statsModeDisposable", "getStatsModeDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        y = new qcy[]{mutablePropertyReference1Impl};
        x = new a();
        z = msy.a(LazyThreadSafetyMode.PUBLICATION, new o2a0(1));
    }

    public nza0(Context context, VkHttpCallFactory vkHttpCallFactory) {
        this.a = vkHttpCallFactory;
        o260 o260Var = d260.a;
        ry70 ry70Var = new ry70(dt.b("User-Agent", (o260Var == null ? null : o260Var).l.a()));
        this.b = ry70Var;
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new z34(28));
        this.d = a2;
        this.e = ((Boolean) a2.getValue()).booleanValue() ? new hwl0() : null;
        ww40 ww40Var = new ww40(context);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_EXTERNAL_ERROR_LOGGER;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.g = new bj80(ww40Var, bVar.a(videoFeatures));
        VideoFeatures videoFeatures2 = VideoFeatures.STALL_CUSTOM_STAT;
        videoFeatures2.getClass();
        this.h = (bVar.a(videoFeatures2) ? this : null) != null ? new fit0() : null;
        b bVar2 = new b();
        this.j = bVar2;
        gkl.a aVar = new gkl.a(context, ry70Var, bVar2);
        aVar.d = b6m.b(context);
        aVar.h = true;
        aVar.g = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        this.k = aVar;
        this.l = b(true);
        this.m = new uxs0();
        this.n = new jme();
        asu0.a.getClass();
        uuv0 uuv0Var = new uuv0(asu0.o());
        uuv0Var.b.add(new qza0(this));
        this.o = uuv0Var;
        this.q = bVar.a(Features.Type.FEATURE_REEF_TEST_DEFAULTS);
        this.s = VideoMode.EMPTY;
        this.t = new pgn();
        asu0.o().submit(new o1(this, 14));
    }

    @Override // xsna.xnv
    public final void a(OneVideoPlayer oneVideoPlayer, cx1 cx1Var) {
        Long l;
        dk80 dk80Var = cx1Var.c;
        if (epx.f(this.w, cx1Var)) {
            return;
        }
        this.w = cx1Var;
        fit0 fit0Var = this.h;
        if (fit0Var != null) {
            fit0Var.a = dk80Var;
        }
        oneVideoPlayer.getClass();
        a aVar = x;
        if (a.a(aVar)) {
            oneVideoPlayer.toString();
            cx1Var.toString();
        }
        qcy<Object>[] qcyVarArr = y;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.t;
        if (((io.reactivex.rxjava3.disposables.c) pgnVar.b) == null) {
            ((VideoStatsComponent) ((k7m) m7m.f(new pza0())).a(fpf0.a(VideoStatsComponent.class))).M6();
            io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.internal.operators.observable.g0.b.a0(asu0.a.d()).subscribe(new zk30(new xgv(this, 24), 11));
            qcy<Object> qcyVar2 = qcyVarArr[0];
            pgnVar.b(subscribe);
        }
        this.j.a = oneVideoPlayer;
        oneVideoPlayer.c0(this.l);
        oneVideoPlayer.d0(this.l);
        uuv0 uuv0Var = this.o;
        oneVideoPlayer.r(uuv0Var);
        oneVideoPlayer.W(uuv0Var);
        if (this.q) {
            gof0 gof0Var = this.f;
            if (gof0Var != null) {
                gof0.c cVar = gof0Var.e;
                gof0.a aVar2 = gof0Var.d;
                gof0.b bVar = gof0Var.c;
                if (!epx.f(gof0Var.b, oneVideoPlayer)) {
                    OneVideoPlayer oneVideoPlayer2 = gof0Var.b;
                    if (oneVideoPlayer2 != null) {
                        oneVideoPlayer2.c0(bVar);
                    }
                    OneVideoPlayer oneVideoPlayer3 = gof0Var.b;
                    if (oneVideoPlayer3 != null) {
                        oneVideoPlayer3.K(aVar2);
                    }
                    OneVideoPlayer oneVideoPlayer4 = gof0Var.b;
                    if (oneVideoPlayer4 != null) {
                        oneVideoPlayer4.T(cVar);
                    }
                    oneVideoPlayer.d0(bVar);
                    oneVideoPlayer.D(aVar2);
                    oneVideoPlayer.s(cVar);
                    gof0Var.b = oneVideoPlayer;
                }
            }
        } else {
            en80 en80Var = this.e;
            if (en80Var != null) {
                en80Var.setPlayer(oneVideoPlayer);
            }
        }
        en80 en80Var2 = this.e;
        VkHttpCallFactory vkHttpCallFactory = this.a;
        if (en80Var2 != null) {
            HashSet<Pair<VkHttpCallFactory.a, Executor>> hashSet = VkHttpCallFactory.k.get(Integer.valueOf(vkHttpCallFactory.e));
            if (hashSet != null) {
                hashSet.removeIf(new wqk(new egt0(en80Var2, 4), 1));
            }
            asu0.a.getClass();
            vkHttpCallFactory.b(en80Var2, asu0.o());
        }
        if (this.f != null) {
            oza0 oza0Var = new oza0(this);
            asu0.a.getClass();
            vkHttpCallFactory.b(oza0Var, asu0.o());
        }
        lwe0 lwe0Var = cx1Var.b;
        if (lwe0Var == null) {
            this.p = null;
        } else {
            long j = lwe0Var.b;
            int i = lwe0Var.a;
            mza0 mza0Var = this.p;
            if (mza0Var == null) {
                this.p = new mza0(i, j);
            } else {
                qg90<Long, Integer> qg90Var = mza0Var.b;
                Integer num = qg90Var.b;
                if (num == null || i != num.intValue() || (l = qg90Var.a) == null || j != l.longValue()) {
                    mza0 mza0Var2 = this.p;
                    if (mza0Var2 != null) {
                        mza0Var2.a();
                    }
                    this.p = new mza0(i, j);
                }
            }
        }
        lt50 lt50Var = cx1Var.a;
        uxs0 uxs0Var = this.m;
        uxs0Var.a(null);
        VideoPlayerType videoPlayerType = VideoPlayerType.UNKNOWN;
        jme jmeVar = this.n;
        jmeVar.a(null);
        jmeVar.b(videoPlayerType);
        if (lt50Var.b) {
            uxs0Var.a(oneVideoPlayer);
        }
        if (lt50Var.a) {
            jmeVar.a(oneVideoPlayer);
        }
        bj80 bj80Var = this.g;
        if (dk80Var != null) {
            if (fit0Var != null) {
                fit0Var.d(oneVideoPlayer);
            }
            bj80Var.z(oneVideoPlayer);
            oyk0 oyk0Var = this.i;
            if (oyk0Var != null) {
                oyk0Var.z(oneVideoPlayer);
            }
            if (a.a(aVar)) {
                oneVideoPlayer.toString();
                Objects.toString(dk80Var);
                Objects.toString(this.s);
                new Exception();
            }
            Random.b.getClass();
            gg ggVar = Random.c;
            new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
            String bigInteger = new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z2 = dk80Var.b;
            boolean z3 = dk80Var.c;
            String str = dk80Var.d;
            String str2 = dk80Var.h;
            String str3 = dk80Var.j;
            String str4 = dk80Var.i;
            String str5 = dk80Var.f;
            if (str5 != null) {
                linkedHashMap.put("track_code", str5);
            }
            String h = this.s.h();
            if (h != null) {
                linkedHashMap.put(X3.a.t, h);
            }
            String str6 = dk80Var.e;
            if (str6 != null) {
                linkedHashMap.put("ct", str6);
            }
            ContentType contentType = dk80Var.g;
            g4b0 g4b0Var = new g4b0(str3, str4, bigInteger, str, contentType != null ? contentType : null, str2, z2, z3, false, linkedHashMap);
            if (fit0Var != null) {
                fit0Var.d = g4b0Var;
            }
            bj80Var.y(g4b0Var);
            oyk0 oyk0Var2 = this.i;
            if (oyk0Var2 != null) {
                oyk0Var2.y(g4b0Var);
            }
            this.u = g4b0Var;
            VideoFeatures videoFeatures = VideoFeatures.WC_HEARTBEAT_CLIPS_OFF;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                bj80Var.p = dk80Var.a;
            }
        } else {
            if (a.a(aVar)) {
                Objects.toString(bj80Var.f);
            }
            if (fit0Var != null) {
                fit0Var.d(null);
            }
            bj80Var.z(null);
            oyk0 oyk0Var3 = this.i;
            if (oyk0Var3 != null) {
                oyk0Var3.z(null);
            }
        }
        aqa0 aqa0Var = cx1Var.e;
        if (aqa0Var == null) {
            this.v = null;
        } else {
            Pair<? extends List<? extends zpa0>, ? extends Uri> pair = new Pair<>(aqa0Var.b, aqa0Var.a);
            this.l.F(pair.d(), pair.g());
            this.v = pair;
        }
        vmf0 vmf0Var = cx1Var.d;
        if (vmf0Var.d) {
            en80 en80Var3 = this.e;
            if (en80Var3 != null) {
                en80Var3.i();
                return;
            }
            return;
        }
        en80 en80Var4 = this.e;
        if (en80Var4 != null) {
            en80Var4.h(vmf0Var.a, vmf0Var.b, vmf0Var.c);
        }
    }

    public final gkl b(boolean z2) {
        gkl.a aVar = this.k;
        if (z2) {
            aVar.e = ((rw1) tw1.a.getValue()).a();
        } else {
            aVar.e = null;
        }
        Context context = aVar.a;
        ry70 ry70Var = aVar.b;
        b bVar = aVar.c;
        String str = aVar.d;
        String str2 = aVar.e;
        boolean z3 = aVar.h;
        String str3 = aVar.f;
        String str4 = aVar.g;
        gkl gklVar = new gkl(z3);
        new String();
        new String();
        new String();
        new String();
        ky70 ky70Var = new ky70(ry70Var, bVar, str, context.getPackageName(), str2, str3, str4);
        y200 y200Var = new y200();
        ArrayList arrayList = gklVar.b;
        arrayList.add(y200Var);
        arrayList.add(new v8o0(ky70Var, bVar));
        arrayList.add(new lfx(ry70Var));
        return gklVar;
    }

    public final void c(boolean z2) {
        String str = z2 ? "auto" : "";
        bj80 bj80Var = this.g;
        bj80Var.c(str, "stat_type");
        bj80Var.c(Boolean.valueOf(z2), "auto");
        fit0 fit0Var = this.h;
        if (fit0Var != null) {
            Boolean valueOf = Boolean.valueOf(z2);
            g4b0 g4b0Var = fit0Var.c;
            if (g4b0Var != null) {
                g4b0Var.j.put("auto", valueOf);
            }
        }
    }
}
