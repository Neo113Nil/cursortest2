package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;
import com.vk.ecomm.market.good.GoodFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProductPropertyVariantsPreviewHolder.kt */
/* loaded from: classes18.dex */
public final class qrd0 extends vif0<ird0> {
    public final ComposeView n;
    public final qob o;

    /* compiled from: ProductPropertyVariantsPreviewHolder.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<Integer, s3q0> b;
        public final /* synthetic */ kd10 c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super Integer, s3q0> izsVar, kd10 kd10Var) {
            this.b = izsVar;
            this.c = kd10Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(Integer.valueOf(this.c.a));
            return s3q0.a;
        }
    }

    /* compiled from: ProductPropertyVariantsPreviewHolder.kt */
    @b6l(c = "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsPreviewHolder$Content$2$1", f = "ProductPropertyVariantsPreviewHolder.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $indexOfSelected;
        final /* synthetic */ xvy $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, spj spjVar, xvy xvyVar) {
            super(2, spjVar);
            this.$indexOfSelected = i;
            this.$listState = xvyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$indexOfSelected, spjVar, this.$listState);
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
                int i2 = this.$indexOfSelected;
                if (i2 >= 0) {
                    xvy xvyVar = this.$listState;
                    this.label = 1;
                    fh9 fh9Var = xvy.y;
                    if (xvyVar.f(i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ c3v b;
        public final /* synthetic */ wow c;

        public c(c3v c3vVar, wow wowVar) {
            this.b = c3vVar;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public d(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;

        public e(wow wowVar, izs izsVar) {
            this.b = wowVar;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                kd10 kd10Var = (kd10) this.b.b.get(intValue);
                aVar2.K(885192485);
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar) | aVar2.y(kd10Var);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar, kd10Var);
                    aVar2.R(x);
                }
                pd10.a(kd10Var, (gzs) x, null, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ProductPropertyVariantsPreviewHolder.kt */
    public static final class f {
        public final String a;
        public final ArrayList b;

        public f(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageProperty(title=");
            sb.append(this.a);
            sb.append(", allVariants=");
            return bo.c(')', sb, this.b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qrd0(ViewGroup viewGroup, GoodFragment goodFragment) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.n = (ComposeView) this.itemView;
        this.o = new qob(goodFragment);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, xsna.ird0] */
    @Override // xsna.vif0
    public final void i6(ird0 ird0Var) {
        ird0 ird0Var2 = ird0Var;
        if (ird0Var2 == 0) {
            return;
        }
        this.m = ird0Var2;
        this.n.setContent(new jai(-266552571, new au7(8, ird0Var2, this), true));
    }

    public final void q6(f fVar, izs<? super Integer, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-500250777);
        int i2 = i | (M.J(fVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            int i3 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-500250777, i2, -1, "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsPreviewHolder.Content (ProductPropertyVariantsPreviewHolder.kt:52)");
            }
            xvy a2 = zvy.a(0, 3, M);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                Iterator it = fVar.b.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    MarketProperty$VariantState marketProperty$VariantState = ((kd10) it.next()).c;
                    if (marketProperty$VariantState == MarketProperty$VariantState.SELECTED || marketProperty$VariantState == MarketProperty$VariantState.RUN_OUT) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                x = Integer.valueOf(i3);
                M.R(x);
            }
            int intValue = ((Number) x).intValue();
            String str = fVar.a;
            boolean z2 = (i4 == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new sf4(18, fVar, izsVar);
                M.R(x2);
            }
            nd10.a(str, a2, null, (izs) x2, M, 0);
            boolean o = M.o(intValue) | M.J(a2);
            Object x3 = M.x();
            if (o || x3 == obj) {
                x3 = new b(intValue, null, a2);
                M.R(x3);
            }
            bap.g(fVar, (wzs) x3, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 8, this, fVar, izsVar);
        }
    }
}
