package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.ite;
import xsna.jse;
import xsna.q630;

/* compiled from: ClipsPlaylistsFolderNamingLoadingDialog.kt */
/* loaded from: classes16.dex */
public final class zse extends ame<ite, jse> {
    public final xqi<ite.a<gte>> f;

    /* compiled from: ClipsPlaylistsFolderNamingLoadingDialog.kt */
    @b6l(c = "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingLoadingDialog$ThemedContent$1$2$1", f = "ClipsPlaylistsFolderNamingLoadingDialog.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<jse, s3q0> $onAction;
        final /* synthetic */ SpinnerState $spinnerState;
        int label;

        /* compiled from: ClipsPlaylistsFolderNamingLoadingDialog.kt */
        /* renamed from: xsna.zse$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4197a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpinnerState.values().length];
                try {
                    iArr[SpinnerState.Error.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpinnerState.Done.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SpinnerState.Loading.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SpinnerState.Custom.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SpinnerState spinnerState, izs<? super jse, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$spinnerState = spinnerState;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$spinnerState, this.$onAction, spjVar);
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
            SpinnerState spinnerState = this.$spinnerState;
            int i = spinnerState == null ? -1 : C4197a.$EnumSwitchMapping$0[spinnerState.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    this.$onAction.invoke(jse.f.b);
                } else if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return s3q0.a;
        }
    }

    public zse(xqi xqiVar, kse kseVar, Context context, boolean z) {
        super(context, kseVar, z);
        this.f = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((ite) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final void g(ite iteVar, izs<? super jse, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        SpinnerState spinnerState;
        ?? r0;
        spj spjVar;
        androidx.compose.runtime.a M = aVar.M(-2082080102);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2082080102, i2, -1, "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingLoadingDialog.ThemedContent (ClipsPlaylistsFolderNamingLoadingDialog.kt:34)");
            }
            ite.a aVar3 = (ite.a) ((zak0) this.f.e).getValue();
            if (aVar3 instanceof ite.a.b) {
                M.K(59450642);
                M.j();
                aVar2 = M;
            } else {
                if (!(aVar3 instanceof ite.a.C3080a)) {
                    throw alb0.c(59448861, M);
                }
                M.K(1843078590);
                SpinnerState spinnerState2 = (SpinnerState) jk50.a(((ite.a.C3080a) aVar3).e, M, 0, 3).getValue();
                q630.a aVar4 = q630.a.a;
                q630 E = ahn.E(txj0.d(aVar4, 1.0f), "PlaylistNamingLoading");
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (spinnerState2 != null) {
                    M.K(478514976);
                    spjVar = null;
                    r0 = 0;
                    zfr0.d(spinnerState2, ra8.a.b(aVar4, dt1.a.f), null, null, null, 0L, 0L, null, null, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                    spinnerState = spinnerState2;
                    aVar2 = M;
                } else {
                    spinnerState = spinnerState2;
                    r0 = 0;
                    aVar2 = M;
                    spjVar = null;
                    aVar2.K(476467085);
                }
                aVar2.j();
                aVar2.G();
                boolean o = aVar2.o(spinnerState == null ? -1 : spinnerState.ordinal()) | ((i2 & 112) != 32 ? r0 : true);
                Object x = aVar2.x();
                if (o || x == a.C0011a.a) {
                    x = new a(spinnerState, izsVar, spjVar);
                    aVar2.R(x);
                }
                bap.g(spinnerState, (wzs) x, aVar2, r0);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new tnc(i, 1, this, iteVar, izsVar);
        }
    }
}
