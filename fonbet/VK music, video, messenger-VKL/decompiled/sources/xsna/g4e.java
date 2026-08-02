package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.favorites.impl.ui.folders.renaming.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.f;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipsFavoritesFolderRenamingComposeView.kt */
/* loaded from: classes16.dex */
public final class g4e extends ame<com.vk.clips.favorites.impl.ui.folders.renaming.f, com.vk.clips.favorites.impl.ui.folders.renaming.a> {

    /* compiled from: ClipsFavoritesFolderRenamingComposeView.kt */
    @b6l(c = "com.vk.clips.favorites.impl.ui.folders.renaming.content.ClipsFavoritesFolderRenamingComposeView$ThemedContent$3$1", f = "ClipsFavoritesFolderRenamingComposeView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<com.vk.clips.favorites.impl.ui.folders.renaming.a, s3q0> $onAction;
        final /* synthetic */ SpinnerState $spinnerState;
        int label;

        /* compiled from: ClipsFavoritesFolderRenamingComposeView.kt */
        /* renamed from: xsna.g4e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2911a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpinnerState.values().length];
                try {
                    iArr[SpinnerState.Loading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpinnerState.Custom.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SpinnerState.Done.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SpinnerState.Error.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SpinnerState spinnerState, izs<? super com.vk.clips.favorites.impl.ui.folders.renaming.a, s3q0> izsVar, spj<? super a> spjVar) {
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
            int i = spinnerState == null ? -1 : C2911a.$EnumSwitchMapping$0[spinnerState.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$onAction.invoke(a.c.b.b);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((com.vk.clips.favorites.impl.ui.folders.renaming.f) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(com.vk.clips.favorites.impl.ui.folders.renaming.f fVar, izs<? super com.vk.clips.favorites.impl.ui.folders.renaming.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1732244521);
        int i2 = i | (M.y(fVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1732244521, i2, -1, "com.vk.clips.favorites.impl.ui.folders.renaming.content.ClipsFavoritesFolderRenamingComposeView.ThemedContent (ClipsFavoritesFolderRenamingComposeView.kt:33)");
            }
            fm50 fm50Var = (fm50) d(f.a.a, new n0u0[]{fVar.a}, M, (i2 & 896) | 518).getValue();
            if (fm50Var instanceof f.a) {
                M.K(1760341371);
                M.j();
                aVar2 = M;
            } else {
                if (fm50Var instanceof f.b) {
                    M.K(-1263887844);
                    SpinnerState spinnerState = (SpinnerState) jk50.a(((f.b) fm50Var).d, M, 48, 2).getValue();
                    if (spinnerState != null) {
                        M.K(-1263691273);
                        q630 d = txj0.d(q630.a.a, 1.0f);
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = new com.vk.movika.sdk.base.logic.interactor.l(10);
                            M.R(x);
                        }
                        q630 c = ojc.c(d, false, null, null, (gzs) x, 14);
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.f, false);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, c);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d2, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c2, cri.a.d);
                        int i3 = i2 & 112;
                        boolean z = i3 == 32;
                        Object x2 = M.x();
                        if (z || x2 == c0012a) {
                            x2 = new j87(izsVar, 2);
                            M.R(x2);
                        }
                        zfr0.d(spinnerState, null, null, null, (gzs) x2, 0L, 0L, null, null, M, 0, 494);
                        aVar2 = M;
                        aVar2.G();
                        boolean o = aVar2.o(spinnerState.ordinal()) | (i3 == 32);
                        Object x3 = aVar2.x();
                        if (o || x3 == c0012a) {
                            x3 = new a(spinnerState, izsVar, null);
                            aVar2.R(x3);
                        }
                        bap.g(spinnerState, (wzs) x3, aVar2, 0);
                    } else {
                        aVar2 = M;
                        aVar2.K(-1265699701);
                    }
                    aVar2.j();
                } else {
                    aVar2 = M;
                    aVar2.K(-1265699701);
                }
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
            s.d = new k71(i, 4, this, fVar, izsVar);
        }
    }
}
