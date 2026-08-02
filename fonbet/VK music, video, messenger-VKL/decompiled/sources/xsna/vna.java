package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PrivacyEntryPointCell2.kt */
/* loaded from: classes4.dex */
public final class vna implements Cell$Middle.d {
    public final wh50 a;
    public final wh50 b;

    /* compiled from: PrivacyEntryPointCell2.kt */
    @b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CellOnboardingTitle$Content$2$1", f = "PrivacyEntryPointCell2.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return vna.this.new a(spjVar);
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
            ((gzs) ((zak0) vna.this.b).getValue()).invoke();
            return s3q0.a;
        }
    }

    public vna(String str, gzs<s3q0> gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(final q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-40456232);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-40456232, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CellOnboardingTitle.Content (PrivacyEntryPointCell2.kt:114)");
            }
            String str = (String) ((zak0) this.a).getValue();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new v5v(str, new Pair(0, Integer.valueOf(str.length())));
                M.R(x);
            }
            v5v v5vVar = (v5v) x;
            int i3 = i2;
            d8v0.a(v5vVar.b, null, null, null, false, false, true, null, kai.c(-2085559916, new tna(q630Var, size, v5vVar, 0), M), M, 806879232, 446);
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i3 & 896) == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new a(null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.una
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    vna.this.c(q630Var, size, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
