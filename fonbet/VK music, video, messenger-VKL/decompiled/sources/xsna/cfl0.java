package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dz40;

/* compiled from: StickyMusicPlayerContentView.kt */
/* loaded from: classes3.dex */
public final class cfl0 extends i6v0<dz40, sx40> {
    public final com.vk.music.pref.a f;
    public final BottomPlayerAppearance g;
    public final g950 h;
    public final f3b0 i;
    public final sxi j;

    /* compiled from: StickyMusicPlayerContentView.kt */
    @b6l(c = "com.vk.music.stickyplayer.StickyMusicPlayerContentView$ThemedContent$1$2$1", f = "StickyMusicPlayerContentView.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return cfl0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (ktu.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            mzp0 mzp0Var = (mzp0) cfl0.this.j.c;
            if (mzp0Var != null) {
                mzp0Var.d(null);
                mzp0Var.h();
            }
            return s3q0.a;
        }
    }

    public cfl0(f5z f5zVar, Context context, sxi sxiVar, com.vk.music.pref.a aVar, BottomPlayerAppearance bottomPlayerAppearance, g950 g950Var) {
        super(context, f5zVar);
        this.f = aVar;
        this.g = bottomPlayerAppearance;
        this.h = g950Var;
        this.i = new f3b0();
        this.j = sxiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((dz40) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.i6v0
    public final void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1526162639);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1526162639, i2, -1, "com.vk.music.stickyplayer.StickyMusicPlayerContentView.Theme (StickyMusicPlayerContentView.kt:62)");
            }
            iyk0 iyk0Var = uvi.h;
            rvi.a(iyk0Var.b(new dzl(((azl) M.r(iyk0Var)).getDensity(), 1.0f)), kai.c(1822840847, new x76(jaiVar, 10), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sac(this, jaiVar, i, 3);
        }
    }

    public final void h(dz40 dz40Var, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        sxi sxiVar;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(703472482);
        int i3 = i | (M.J(dz40Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(703472482, i3, -1, "com.vk.music.stickyplayer.StickyMusicPlayerContentView.ThemedContent (StickyMusicPlayerContentView.kt:74)");
            }
            fm50 fm50Var = (fm50) d(dz40.i.a, (n0u0[]) Arrays.copyOf(new n0u0[]{dz40Var.a, dz40Var.b, dz40Var.c, dz40Var.d}, 4), M, (((((i3 << 3) & 7168) | 6) >> 3) & 896) | 6).getValue();
            boolean z = fm50Var instanceof dz40.t;
            sxi sxiVar2 = this.j;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(-844291482);
                k0b0.b((dz40.t) fm50Var, this.i, this.g, izsVar, M, (i3 << 6) & 7168);
                M.j();
                i2 = 6;
                sxiVar = sxiVar2;
                c0012a = c0012a2;
            } else if (fm50Var instanceof dz40.l) {
                M.K(-843921590);
                dz40.l lVar = (dz40.l) fm50Var;
                boolean z2 = (i3 & 896) == 256;
                Object x = M.x();
                if (z2 || x == c0012a2) {
                    x = new afl0(this, 0);
                    M.R(x);
                }
                i2 = 6;
                c0012a = c0012a2;
                bg50.e(lVar, this.i, this.g, (gzs) x, this.h.b(), (mzp0) sxiVar2.b, izsVar, M, (i3 << 15) & 3670016);
                M = M;
                M.j();
                sxiVar = sxiVar2;
            } else {
                i2 = 6;
                sxiVar = sxiVar2;
                c0012a = c0012a2;
                if (fm50Var instanceof dz40.p) {
                    M.K(1219727992);
                    vkb0.d((dz40.p) fm50Var, this.i, this.g, izsVar, M, (i3 << 6) & 7168);
                    M.j();
                } else if (fm50Var instanceof dz40.b) {
                    M.K(1219737466);
                    zk4.b((dz40.b) fm50Var, this.i, this.g, izsVar, M, (i3 << 6) & 7168);
                    M.j();
                } else {
                    if (fm50Var instanceof dz40.r) {
                        M.K(1219746870);
                        awe0.c((dz40.r) fm50Var, this.i, this.g, izsVar, M, (i3 << 6) & 7168);
                    } else {
                        M.K(-847675659);
                    }
                    M.j();
                }
            }
            mzp0 mzp0Var = (mzp0) sxiVar.c;
            if (mzp0Var == null) {
                M.K(-842232184);
            } else {
                M.K(1219757209);
                mzp0Var.e((View) M.r(AndroidCompositionLocals_androidKt.f));
            }
            M.j();
            s3q0 s3q0Var = s3q0.a;
            boolean z3 = (i3 & 896) == 256;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new a(null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wo7(this, dz40Var, izsVar, i, 5);
        }
    }
}
