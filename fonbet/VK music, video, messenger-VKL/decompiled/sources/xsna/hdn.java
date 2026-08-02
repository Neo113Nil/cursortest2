package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;
import xsna.ken;
import xsna.q630;

/* compiled from: DisplayAudioBookChaptersContentView.kt */
/* loaded from: classes3.dex */
public final class hdn extends i6v0<ken, gdn> {
    public final geb0 f;
    public final KidsModeRestrictionRenderer g;
    public final mzp0 h;
    public final wh50<Integer> i;

    /* compiled from: DisplayAudioBookChaptersContentView.kt */
    @b6l(c = "com.vk.music.playlist.display.audiobook.presentation.DisplayAudioBookChaptersContentView$ThemedContent$1$1", f = "DisplayAudioBookChaptersContentView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return hdn.this.new a(spjVar);
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
            hdn hdnVar = hdn.this;
            mzp0 mzp0Var = hdnVar.h;
            if (mzp0Var != null) {
                mzp0Var.d(hdnVar.c());
            }
            return s3q0.a;
        }
    }

    /* compiled from: DisplayAudioBookChaptersContentView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Float, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Float f) {
            ((geb0) this.receiver).a(f.floatValue());
            return s3q0.a;
        }
    }

    public hdn(geb0 geb0Var, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, mzp0 mzp0Var, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = geb0Var;
        this.g = kidsModeRestrictionRenderer;
        this.h = mzp0Var;
        this.i = androidx.compose.runtime.k.b(0);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ken) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ken kenVar, izs<? super gdn, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-318402716);
        int i2 = i | (M.J(kenVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-318402716, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.DisplayAudioBookChaptersContentView.ThemedContent (DisplayAudioBookChaptersContentView.kt:49)");
            }
            n0u0[] n0u0VarArr = {kenVar.a, kenVar.c};
            int i3 = i2 & 896;
            ken.a.c cVar = ken.a.c.a;
            ken.a aVar2 = (ken.a) d(cVar, n0u0VarArr, M, i3 | 6).getValue();
            boolean f = epx.f(aVar2, cVar);
            wh50<Integer> wh50Var = this.i;
            if (f) {
                M.K(2047948508);
                kh4.a(izsVar, wh50Var, M, (i2 >> 3) & 14);
                M.j();
            } else {
                boolean z = aVar2 instanceof ken.a.C3177a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(2048208412);
                    s3q0 s3q0Var = s3q0.a;
                    boolean z2 = i3 == 256;
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new a(null);
                        M.R(x);
                    }
                    bap.g(s3q0Var, (wzs) x, M, 6);
                    ken.a.C3177a c3177a = (ken.a.C3177a) aVar2;
                    geb0 geb0Var = this.f;
                    boolean J = M.J(geb0Var);
                    Object x2 = M.x();
                    if (J || x2 == c0012a) {
                        b bVar = new b(1, geb0Var, geb0.class, "onFraction", "onFraction(F)V", 0);
                        M.R(bVar);
                        x2 = bVar;
                    }
                    fdn.a(c3177a, izsVar, (izs) ((fcy) x2), wh50Var, M, i2 & 112);
                    M.j();
                } else {
                    if (!(aVar2 instanceof ken.a.b)) {
                        throw alb0.c(-1042317548, M);
                    }
                    M.K(2048716688);
                    if (((Boolean) jk50.d(((ken.a.b) aVar2).a, Boolean.FALSE, M, 48).getValue()).booleanValue()) {
                        M.K(2048811579);
                        KidsModeRestrictionRenderer.Source source = KidsModeRestrictionRenderer.Source.ADULT_CONTENT;
                        int i4 = i2 & 112;
                        boolean z3 = i4 == 32;
                        Object x3 = M.x();
                        if (z3 || x3 == c0012a) {
                            x3 = new zn1(izsVar, 4);
                            M.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean z4 = i4 == 32;
                        Object x4 = M.x();
                        if (z4 || x4 == c0012a) {
                            x4 = new gc0(izsVar, 3);
                            M.R(x4);
                        }
                        KidsModeRestrictionRenderer.b.a(source, gzsVar, (gzs) x4, this.g, M, 6);
                        M.j();
                    } else {
                        M.K(2049249609);
                        q630 H = s200.H(p490.D(txj0.f(txj0.h(q630.a.a, ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenHeightDp), 1.0f), p490.x(M), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((azl) M.r(uvi.h)).j1(((Number) ((zak0) wh50Var).getValue()).intValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        Integer valueOf = k840.a.h() ? Integer.valueOf(R.string.music_offline_mode_kids_error_description) : null;
                        int i5 = i2 & 112;
                        boolean z5 = i5 == 32;
                        Object x5 = M.x();
                        if (z5 || x5 == c0012a) {
                            x5 = new z8c(izsVar, 2);
                            M.R(x5);
                        }
                        gzs gzsVar2 = (gzs) x5;
                        boolean z6 = i5 == 32;
                        Object x6 = M.x();
                        if (z6 || x6 == c0012a) {
                            x6 = new z87(izsVar, 3);
                            M.R(x6);
                        }
                        xj40.a(gzsVar2, (gzs) x6, H, false, valueOf, M, 0, 8);
                        M = M;
                        M.j();
                    }
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9c(this, kenVar, izsVar, i, 1);
        }
    }
}
