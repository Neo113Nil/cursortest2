package xsna;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.Lambda;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes11.dex */
public final class qzx0 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ iri $composeViewContext;
    final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ rzx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qzx0(rzx0 rzx0Var, iri iriVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        super(2);
        this.this$0 = rzx0Var;
        this.$composeViewContext = iriVar;
        this.$content = wzsVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1723985096, intValue, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:126)");
            }
            rzx0 rzx0Var = this.this$0;
            p52 p52Var = rzx0Var.b;
            boolean y = aVar2.y(rzx0Var);
            rzx0 rzx0Var2 = this.this$0;
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new ozx0(rzx0Var2, null);
                aVar2.R(x);
            }
            bap.g(p52Var, (wzs) x, aVar2, 0);
            rzx0 rzx0Var3 = this.this$0;
            p52 p52Var2 = rzx0Var3.b;
            boolean y2 = aVar2.y(rzx0Var3);
            rzx0 rzx0Var4 = this.this$0;
            Object x2 = aVar2.x();
            if (y2 || x2 == c0012a) {
                x2 = new pzx0(rzx0Var4, null);
                aVar2.R(x2);
            }
            bap.g(p52Var2, (wzs) x2, aVar2, 0);
            this.$composeViewContext.a(this.this$0.b, this.$content, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
