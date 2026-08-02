package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: ComposedModifier.kt */
/* loaded from: classes11.dex */
public final class qri {

    /* compiled from: ComposedModifier.kt */
    public static final class a extends Lambda implements izs<q630.b, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(q630.b bVar) {
            return Boolean.valueOf(!(bVar instanceof pri));
        }
    }

    /* compiled from: ComposedModifier.kt */
    public static final class b extends Lambda implements wzs<q630, q630.b, q630> {
        final /* synthetic */ androidx.compose.runtime.a $this_materializeImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.runtime.a aVar) {
            super(2);
            this.$this_materializeImpl = aVar;
        }

        @Override // xsna.wzs
        public final q630 invoke(q630 q630Var, q630.b bVar) {
            q630 q630Var2 = q630Var;
            q630.b bVar2 = bVar;
            if (bVar2 instanceof pri) {
                yzs<q630, androidx.compose.runtime.a, Integer, q630> yzsVar = ((pri) bVar2).b;
                ttp0.d(3, yzsVar);
                bVar2 = qri.b(this.$this_materializeImpl, yzsVar.invoke(q630.a.a, this.$this_materializeImpl, 0));
            }
            return q630Var2.g(bVar2);
        }
    }

    public static final q630 a(q630 q630Var, izs<? super z5x, s3q0> izsVar, yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, ? extends q630> yzsVar) {
        return q630Var.g(new pri(yzsVar, izsVar));
    }

    public static final q630 b(androidx.compose.runtime.a aVar, q630 q630Var) {
        if (q630Var.b(a.i)) {
            return q630Var;
        }
        aVar.T(1219399079);
        q630 q630Var2 = (q630) q630Var.a(q630.a.a, new b(aVar));
        aVar.b0();
        return q630Var2;
    }

    public static final q630 c(androidx.compose.runtime.a aVar, q630 q630Var) {
        aVar.K(439770924);
        q630 b2 = b(aVar, q630Var);
        aVar.j();
        return b2;
    }
}
