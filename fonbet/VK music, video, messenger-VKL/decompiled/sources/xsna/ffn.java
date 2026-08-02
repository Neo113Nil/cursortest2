package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.music.playlist.display.domain.i;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DisplayMusicPlaylistContentView.kt */
/* loaded from: classes3.dex */
public final class ffn extends i6v0<com.vk.music.playlist.display.domain.i, com.vk.music.playlist.display.domain.a> {
    public final geb0 f;
    public final boolean g;
    public final boolean h;
    public final KidsModeRestrictionRenderer i;
    public final mzp0 j;
    public final wh50<Integer> k;
    public final kg50 l;

    /* compiled from: DisplayMusicPlaylistContentView.kt */
    @b6l(c = "com.vk.music.playlist.display.presentation.DisplayMusicPlaylistContentView$ThemedContent$1$1", f = "DisplayMusicPlaylistContentView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ffn.this.new a(spjVar);
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
            ffn ffnVar = ffn.this;
            ffnVar.f.a(((vak0) ffnVar.l).getFloatValue());
            return s3q0.a;
        }
    }

    /* compiled from: DisplayMusicPlaylistContentView.kt */
    @b6l(c = "com.vk.music.playlist.display.presentation.DisplayMusicPlaylistContentView$ThemedContent$2$1", f = "DisplayMusicPlaylistContentView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ffn.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ffn ffnVar = ffn.this;
            mzp0 mzp0Var = ffnVar.j;
            if (mzp0Var != null) {
                mzp0Var.d(ffnVar.c());
            }
            return s3q0.a;
        }
    }

    public ffn(geb0 geb0Var, boolean z, boolean z2, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, mzp0 mzp0Var, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = geb0Var;
        this.g = z;
        this.h = z2;
        this.i = kidsModeRestrictionRenderer;
        this.j = mzp0Var;
        this.k = androidx.compose.runtime.k.b(0);
        this.l = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((com.vk.music.playlist.display.domain.i) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(com.vk.music.playlist.display.domain.i iVar, izs<? super com.vk.music.playlist.display.domain.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(134270439);
        int i2 = i | (M.J(iVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(134270439, i2, -1, "com.vk.music.playlist.display.presentation.DisplayMusicPlaylistContentView.ThemedContent (DisplayMusicPlaylistContentView.kt:41)");
            }
            n0u0[] n0u0VarArr = {iVar.a, iVar.b, iVar.c};
            int i3 = i2 & 896;
            i.a.c cVar = i.a.c.a;
            i.a aVar2 = (i.a) d(cVar, n0u0VarArr, M, i3 | 6).getValue();
            boolean f = epx.f(aVar2, cVar);
            wh50<Integer> wh50Var = this.k;
            if (f) {
                M.K(1436681358);
                if (((Number) ((zak0) wh50Var).getValue()).intValue() != 0) {
                    M.K(1436895227);
                    u150.e(izsVar, wh50Var, null, this.g, this.h, M, (i2 >> 3) & 14);
                } else {
                    M.K(1434512443);
                }
                M.j();
                M.j();
            } else if (aVar2 instanceof i.a.b) {
                M.K(1437287005);
                uz40.a(wh50Var, (ivp) jk50.d(((i.a.b) aVar2).a, new ivp(R.string.music_playlist_access_denied, false, false), M, 0).getValue(), this.i, izsVar, null, M, (i2 << 6) & 7168);
                M.j();
            } else {
                if (!(aVar2 instanceof i.a.C1350a)) {
                    throw alb0.c(184889581, M);
                }
                M.K(1437969222);
                Float valueOf = Float.valueOf(((vak0) this.l).getFloatValue());
                boolean z = i3 == 256;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new a(null);
                    M.R(x);
                }
                bap.g(valueOf, (wzs) x, M, 0);
                s3q0 s3q0Var = s3q0.a;
                boolean z2 = i3 == 256;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new b(null);
                    M.R(x2);
                }
                bap.g(s3q0Var, (wzs) x2, M, 6);
                i.a.C1350a c1350a = (i.a.C1350a) aVar2;
                boolean z3 = i3 == 256;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new wzf(this, 12);
                    M.R(x3);
                }
                oz40.a(c1350a, izsVar, (izs) x3, wh50Var, M, i2 & 112);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ex(i, 4, this, iVar, izsVar);
        }
    }
}
