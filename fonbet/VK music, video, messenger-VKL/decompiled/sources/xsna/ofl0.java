package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlayerTrack;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: StickyPlayerBackground.kt */
/* loaded from: classes3.dex */
public final class ofl0 implements pfl0 {
    public static final ConcurrentHashMap k = new ConcurrentHashMap();
    public final yvj a;
    public final boolean b;
    public String c;
    public String d;
    public String e;
    public final wh50 f;
    public final wh50 g;
    public final kg50 h;
    public if2<Float, ?> i;
    public final bpn0 j;

    /* compiled from: StickyPlayerBackground.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground$onColorsExtracted$2", f = "StickyPlayerBackground.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List $colors;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ ofl0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List list, ofl0 ofl0Var, spj spjVar) {
            super(2, spjVar);
            this.$url = str;
            this.$colors = list;
            this.this$0 = ofl0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$url, this.$colors, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ofl0.k.put(this.$url, new sfl0(this.$colors));
            if (epx.f(this.this$0.d, this.$url)) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"!late right color extraction"});
                }
                this.this$0.k(this.$url);
            }
            if (epx.f(this.this$0.c, this.$url)) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"!late left color extraction"});
                }
                ofl0 ofl0Var = this.this$0;
                ofl0Var.j(this.$url, ((vak0) ofl0Var.h).getFloatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            return s3q0.a;
        }
    }

    /* compiled from: StickyPlayerBackground.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground$onCoversChange$2", f = "StickyPlayerBackground.kt", l = {151}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ofl0.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, ?> if2Var = ofl0.this.i;
                if (if2Var != null) {
                    this.label = 1;
                    if (if2Var.f(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ofl0.this.i = null;
            return s3q0.a;
        }
    }

    public ofl0(yvj yvjVar, boolean z) {
        this.a = yvjVar;
        this.b = z;
        List list = sfl0.b;
        this.f = androidx.compose.runtime.k.b(new sfl0(list));
        this.g = androidx.compose.runtime.k.b(new sfl0(list));
        this.h = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = new bpn0(new sqf0(4));
    }

    @Override // xsna.pfl0
    public final void a(wow wowVar) {
        ConcurrentHashMap concurrentHashMap = k;
        int size = concurrentHashMap.size();
        SetBuilder setBuilder = new SetBuilder();
        Iterator<T> it = wowVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                setBuilder.add(str);
            }
        }
        p4g.o(setBuilder.d(), concurrentHashMap);
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.LogType logType = L.LogType.d;
        StringBuilder b2 = ji.b(size, "colors size changed from ", " to ");
        b2.append(concurrentHashMap.size());
        L.u(l, logType, new Object[]{b2.toString()});
    }

    @Override // xsna.pfl0
    public final void b(String str, List list) {
        if (this.b || str == null) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{i(str) + " (url=" + str + ')'});
        }
        myc0.h(this.a, null, null, new a(str, list, this, null), 3);
    }

    @Override // xsna.pfl0
    public final boolean d(String str) {
        if (str == null) {
            return false;
        }
        return k.containsKey(str);
    }

    @Override // xsna.pfl0
    public final void e(final String str, String str2, final float f) {
        if (this.b) {
            return;
        }
        boolean z = false;
        boolean z2 = (epx.f(str, this.c) || epx.f(str, this.e) || f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
        if (z2) {
            L.d(new gzs() { // from class: xsna.kfl0
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("jump ");
                    ofl0 ofl0Var = ofl0.this;
                    sb.append(ofl0Var.i(ofl0Var.c));
                    sb.append(" -> ");
                    String str3 = str;
                    sb.append(ofl0Var.i(str3));
                    sb.append(" fraction=");
                    sb.append(f);
                    sb.append(" (");
                    return h5s.d(sb, ofl0Var.c, " -> ", str3, " )");
                }
            });
        } else {
            myc0.h(this.a, null, null, new b(null), 3);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.v, new Object[]{"swipe " + i(str) + " -> " + i(str2) + " fraction=" + f + " (" + str + " -> " + str2 + ')'});
            }
        }
        this.e = str2;
        if (!epx.f(this.d, str2)) {
            k(str2);
        }
        if (!epx.f(this.c, str)) {
            if (z2 && this.c != null) {
                z = true;
            }
            j(str, z);
        }
        ((vak0) this.h).g(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        yzs yzsVar;
        androidx.compose.runtime.a M = aVar.M(-81212657);
        int i2 = i | (M.J(q630Var) ? 4 : 2) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-81212657, i2, -1, "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground.Content (StickyPlayerBackground.kt:76)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new uco(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new com.vk.movika.tools.controls.seekbar.g(19, this, wh50Var));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bbk0.b(new jtb(this, azlVar, wh50Var, 5));
                M.R(x3);
            }
            mtk0 mtk0Var2 = (mtk0) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = bbk0.b(new fu5(this, azlVar, wh50Var, 6));
                M.R(x4);
            }
            mtk0 mtk0Var3 = (mtk0) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(new l5g(sfl0.a(sfl0.b)));
                M.R(x5);
            }
            wh50 wh50Var2 = (wh50) x5;
            boolean z = this.b;
            wh50 wh50Var3 = this.g;
            if (z) {
                M.K(-1342625261);
            } else {
                M.K(-1338803116);
                sfl0 sfl0Var = new sfl0(h());
                sfl0 sfl0Var2 = new sfl0(((sfl0) ((zak0) wh50Var3).getValue()).a);
                boolean z2 = (i2 & 896) == 256;
                Object x6 = M.x();
                if (z2 || x6 == c0012a) {
                    x6 = new mfl0(this, wh50Var2, null);
                    M.R(x6);
                }
                bap.f(sfl0Var, sfl0Var2, (wzs) x6, M, 0);
            }
            M.j();
            q630 d = txj0.d(q630Var, 1.0f);
            boolean J = M.J(azlVar);
            Object x7 = M.x();
            if (J || x7 == c0012a) {
                x7 = new prd0(3, azlVar, wh50Var);
                M.R(x7);
            }
            q630 o = egi.o(d, (izs) x7);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, o);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(2022124854);
            if (uco.a(((uco) wh50Var.getValue()).a, 0L)) {
                M.j();
                yzsVar = jaiVar;
            } else {
                List h = h();
                q630 q630Var2 = (q630) mtk0Var.getValue();
                int i3 = i2 & 896;
                boolean z3 = i3 == 256;
                Object x8 = M.x();
                if (z3 || x8 == c0012a) {
                    x8 = new exi0(this, 4);
                    M.R(x8);
                }
                cx5.a(0, M, h, rdu.a(q630Var2, (izs) x8));
                List list = ((sfl0) ((zak0) wh50Var3).getValue()).a;
                q630 q630Var3 = (q630) mtk0Var.getValue();
                boolean z4 = i3 == 256;
                Object x9 = M.x();
                if (z4 || x9 == c0012a) {
                    x9 = new qhg0(this, 6);
                    M.R(x9);
                }
                cx5.a(0, M, list, rdu.a(q630Var3, (izs) x9));
                g((yk8) mtk0Var2.getValue(), (yk8) mtk0Var3.getValue(), M, ((i2 << 3) & 7168) | 6);
                yzsVar = jaiVar;
                yzsVar.invoke(wh50Var2, M, 54);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            yzsVar = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vb5(i, 7, (Object) this, (xzs) yzsVar, q630Var);
        }
    }

    public final void g(final yk8 yk8Var, final yk8 yk8Var2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1632011089);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(yk8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(yk8Var2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1632011089, i2, -1, "com.vk.music.stickyplayer.presentation.components.background.StickyPlayerBackground.DimOverlays (StickyPlayerBackground.kt:129)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new l5g(l5g.c(14, l5g.b, 0.3f));
                M.R(x);
            }
            final long j = ((l5g) x).a;
            q630 a2 = ra8Var.a(q630.a.a);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.lfl0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        oio.P(oioVar, j, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        oio.x1(oioVar, yk8Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        oio.x1(oioVar, yk8Var2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            xa4.i(0, M, (izs) x2, a2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mhf(i, 3, this, yk8Var, yk8Var2);
        }
    }

    public final List h() {
        return ((sfl0) ((zak0) this.f).getValue()).a;
    }

    public final String i(String str) {
        Object obj;
        MusicTrack musicTrack;
        if (str != null) {
            Iterator<T> it = ((u2b0) this.j.getValue()).g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((PlayerTrack) obj).b.Kb(1200), str)) {
                    break;
                }
            }
            PlayerTrack playerTrack = (PlayerTrack) obj;
            if (playerTrack != null && (musicTrack = playerTrack.b) != null) {
                StringBuilder sb = new StringBuilder("\"");
                String str2 = musicTrack.d;
                if (str2 == null) {
                    str2 = musicTrack.e;
                }
                return ho8.a(sb, str2, '\"');
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(String str, boolean z) {
        List list;
        this.c = str;
        if (z) {
            myc0.h(this.a, null, null, new nfl0(str, this, null), 3);
        } else {
            if (str != null) {
                sfl0 sfl0Var = (sfl0) k.get(str);
                List list2 = sfl0Var != null ? sfl0Var.a : null;
                sfl0 sfl0Var2 = list2 != null ? new sfl0(list2) : null;
                list = sfl0Var2 != null ? sfl0Var2.a : null;
            }
            list = sfl0.b;
            ((zak0) this.f).setValue(new sfl0(list));
        }
        L.d(new dy0(26, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(String str) {
        List list;
        this.d = str;
        if (str != null) {
            sfl0 sfl0Var = (sfl0) k.get(str);
            List list2 = sfl0Var != null ? sfl0Var.a : null;
            sfl0 sfl0Var2 = list2 != null ? new sfl0(list2) : null;
            list = sfl0Var2 != null ? sfl0Var2.a : null;
        }
        list = sfl0.b;
        l(list);
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"set colors for right " + i(str) + " (url=" + str + ')'});
    }

    public final void l(List list) {
        ((zak0) this.g).setValue(new sfl0(list));
    }
}
