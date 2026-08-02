package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.q630;

/* compiled from: MarketPaginationDots.kt */
/* loaded from: classes18.dex */
public final class s910 {

    /* compiled from: MarketPaginationDots.kt */
    @b6l(c = "com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsKt$MarketPaginationDots$1$1", f = "MarketPaginationDots.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $coroutineScope;
        final /* synthetic */ int $currentPage;
        final /* synthetic */ long $dotColor;
        final /* synthetic */ List<if2<l5g, vq2>> $dotColors;
        final /* synthetic */ rg50 $previousPage$delegate;
        final /* synthetic */ long $selectedDotColor;
        int label;

        /* compiled from: MarketPaginationDots.kt */
        @b6l(c = "com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsKt$MarketPaginationDots$1$1$1", f = "MarketPaginationDots.kt", l = {62}, m = "invokeSuspend")
        /* renamed from: xsna.s910$a$a, reason: collision with other inner class name */
        public static final class C3654a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ long $dotColor;
            final /* synthetic */ List<if2<l5g, vq2>> $dotColors;
            final /* synthetic */ int $previous;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3654a(int i, List<if2<l5g, vq2>> list, long j, spj<? super C3654a> spjVar) {
                super(2, spjVar);
                this.$previous = i;
                this.$dotColors = list;
                this.$dotColor = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3654a(this.$previous, this.$dotColors, this.$dotColor, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3654a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    int i2 = this.$previous;
                    if (i2 >= 0 && i2 < this.$dotColors.size()) {
                        if2<l5g, vq2> if2Var = this.$dotColors.get(this.$previous);
                        l5g l5gVar = new l5g(this.$dotColor);
                        this.label = 1;
                        if (if2.c(if2Var, l5gVar, null, null, this, 14) == coroutineSingletons) {
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

        /* compiled from: MarketPaginationDots.kt */
        @b6l(c = "com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsKt$MarketPaginationDots$1$1$2", f = "MarketPaginationDots.kt", l = {67}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $currentPage;
            final /* synthetic */ List<if2<l5g, vq2>> $dotColors;
            final /* synthetic */ long $selectedDotColor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, List<if2<l5g, vq2>> list, long j, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$currentPage = i;
                this.$dotColors = list;
                this.$selectedDotColor = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$currentPage, this.$dotColors, this.$selectedDotColor, spjVar);
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
                    int i2 = this.$currentPage;
                    if (i2 >= 0 && i2 < this.$dotColors.size()) {
                        if2<l5g, vq2> if2Var = this.$dotColors.get(this.$currentPage);
                        l5g l5gVar = new l5g(this.$selectedDotColor);
                        this.label = 1;
                        if (if2.c(if2Var, l5gVar, null, null, this, 14) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, yvj yvjVar, rg50 rg50Var, List<if2<l5g, vq2>> list, long j, long j2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$currentPage = i;
            this.$coroutineScope = yvjVar;
            this.$previousPage$delegate = rg50Var;
            this.$dotColors = list;
            this.$dotColor = j;
            this.$selectedDotColor = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$currentPage, this.$coroutineScope, this.$previousPage$delegate, this.$dotColors, this.$dotColor, this.$selectedDotColor, spjVar);
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
            int intValue = this.$previousPage$delegate.getIntValue();
            this.$previousPage$delegate.C(this.$currentPage);
            myc0.h(this.$coroutineScope, null, null, new C3654a(intValue, this.$dotColors, this.$dotColor, null), 3);
            myc0.h(this.$coroutineScope, null, null, new b(this.$currentPage, this.$dotColors, this.$selectedDotColor, null), 3);
            return s3q0.a;
        }
    }

    /* compiled from: MarketPaginationDots.kt */
    public static final class b implements cp10 {
        public final /* synthetic */ int a;
        public final /* synthetic */ o910 b;

        public b(int i, o910 o910Var) {
            this.a = i;
            this.b = o910Var;
        }

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            int i = o6j.i(j);
            o910 o910Var = this.b;
            int r0 = ep10Var.r0(o910Var.a);
            int i2 = this.a;
            return ep10Var.Q(Math.min(i, (ep10Var.r0(o910Var.d) * 2) + (ep10Var.r0(o910Var.b) * (i2 - 1)) + (r0 * i2)), Math.min(o6j.h(j), (ep10Var.r0(o910Var.c) * 2) + ep10Var.r0(o910Var.a)), jgp.b, new scw0(1));
        }
    }

    public static final void a(final int i, final int i2, q630 q630Var, MarketPaginationDotsSize marketPaginationDotsSize, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        int i6;
        final MarketPaginationDotsSize marketPaginationDotsSize2;
        final q630 q630Var3;
        q630 q630Var4;
        List list;
        int i7;
        long j;
        Integer num;
        boolean z;
        int i8;
        Object obj;
        q630 q630Var5;
        int i9 = i2;
        androidx.compose.runtime.a M = aVar.M(1733474979);
        if ((i3 & 6) == 0) {
            i5 = (M.o(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i10 = i5 | (M.o(i9) ? 32 : 16);
        int i11 = i4 & 4;
        if (i11 != 0) {
            i6 = i10 | 384;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i6 = i10 | (M.J(q630Var2) ? 256 : 128);
        }
        int i12 = i4 & 8;
        if (i12 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= M.o(marketPaginationDotsSize == null ? -1 : marketPaginationDotsSize.ordinal()) ? 2048 : 1024;
        }
        int i13 = i6;
        if (M.t(i13 & 1, (i13 & 1171) != 1170)) {
            q630 q630Var6 = i11 != 0 ? q630.a.a : q630Var2;
            MarketPaginationDotsSize marketPaginationDotsSize3 = i12 != 0 ? MarketPaginationDotsSize.Large : marketPaginationDotsSize;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1733474979, i13, -1, "com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDots (MarketPaginationDots.kt:32)");
            }
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            long c = l5g.c(14, wlb0.h(M).j().a, 0.4f);
            long c2 = l5g.c(14, wlb0.h(M).getIcon().c, 0.3f);
            long j2 = wlb0.h(M).getIcon().c;
            boolean z2 = (i13 & 7168) == 2048;
            Object x2 = M.x();
            if (z2 || x2 == obj2) {
                int i14 = p910.$EnumSwitchMapping$0[marketPaginationDotsSize3.ordinal()];
                if (i14 == 1) {
                    q630Var4 = q630Var6;
                    float f = 4;
                    x2 = new o910(f, f, 2, f);
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f2 = 6;
                    q630Var4 = q630Var6;
                    x2 = new o910(7, f2, 4, f2);
                }
                M.R(x2);
            } else {
                q630Var4 = q630Var6;
            }
            final o910 o910Var = (o910) x2;
            Object x3 = M.x();
            if (x3 == obj2) {
                x3 = androidx.compose.runtime.i.a(-1);
                M.R(x3);
            }
            rg50 rg50Var = (rg50) x3;
            int i15 = i13 & 14;
            boolean z3 = i15 == 4;
            Object x4 = M.x();
            Object obj3 = x4;
            if (z3 || x4 == obj2) {
                ArrayList arrayList = new ArrayList(i);
                int i16 = 0;
                while (i16 < i) {
                    arrayList.add(lwj0.a(i16 == i9 ? j2 : c2));
                    i16++;
                    i9 = i2;
                }
                M.R(arrayList);
                obj3 = arrayList;
            }
            List list2 = (List) obj3;
            Integer valueOf = Integer.valueOf(i2);
            boolean y = ((i13 & 112) == 32) | M.y(yvjVar) | M.y(list2) | M.p(c2) | M.p(j2);
            Object x5 = M.x();
            if (y || x5 == obj2) {
                list = list2;
                i7 = i15;
                j = c;
                num = valueOf;
                z = true;
                i8 = i13;
                obj = obj2;
                Object aVar2 = new a(i2, yvjVar, rg50Var, list, c2, j2, null);
                M.R(aVar2);
                x5 = aVar2;
            } else {
                j = c;
                i7 = i15;
                list = list2;
                num = valueOf;
                z = true;
                i8 = i13;
                obj = obj2;
            }
            bap.g(num, (wzs) x5, M, (i8 >> 3) & 14);
            boolean J = (i7 == 4 ? z : false) | M.J(o910Var);
            Object x6 = M.x();
            if (J || x6 == obj) {
                x6 = new b(i, o910Var);
                M.R(x6);
            }
            cp10 cp10Var = (cp10) x6;
            final long j3 = j;
            boolean p = M.p(j3) | M.J(o910Var) | (i7 == 4 ? z : false) | M.y(list);
            Object x7 = M.x();
            if (p || x7 == obj) {
                final List list3 = list;
                q630Var5 = q630Var4;
                Object obj4 = new izs() { // from class: xsna.q910
                    @Override // xsna.izs
                    public final Object invoke(Object obj5) {
                        oio oioVar = (oio) obj5;
                        float f3 = 2;
                        float min = Math.min(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / f3, Float.intBitsToFloat((int) (oioVar.d() >> 32)) / f3);
                        oio.C1(oioVar, j3, 0L, 0L, (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L), null, 244);
                        fr9 fr9Var = oioVar.a0().a;
                        o910 o910Var2 = o910Var;
                        float f4 = o910Var2.d;
                        float f5 = o910Var2.a;
                        fr9Var.l(oioVar.I0(f4), oioVar.I0(o910Var2.c));
                        for (int i17 = 0; i17 < i; i17++) {
                            if (i17 > 0) {
                                oioVar.a0().a.l(oioVar.I0(o910Var2.b) + oioVar.I0(f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            float r0 = oioVar.r0(f5) / 2.0f;
                            oio.V1(oioVar, ((l5g) ((if2) list3.get(i17)).d()).a, oioVar.r0(f5) / 2.0f, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        }
                        return s3q0.a;
                    }
                };
                M.R(obj4);
                x7 = obj4;
            } else {
                q630Var5 = q630Var4;
            }
            q630 c3 = bu00.c(q630Var5, (izs) x7);
            int hashCode = Long.hashCode(n34.n(M));
            q630 c4 = qri.c(M, c3);
            sy90 D = M.D();
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c4, cri.a.d);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var5;
            marketPaginationDotsSize2 = marketPaginationDotsSize3;
        } else {
            M.h();
            marketPaginationDotsSize2 = marketPaginationDotsSize;
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r910
                @Override // xsna.wzs
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    s910.a(i, i2, q630Var3, marketPaginationDotsSize2, (androidx.compose.runtime.a) obj5, ne7.I(i3 | 1), i4);
                    return s3q0.a;
                }
            };
        }
    }
}
