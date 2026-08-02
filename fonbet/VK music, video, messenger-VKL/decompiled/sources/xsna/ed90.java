package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginatableLazyGridState.kt */
@b6l(c = "com.vk.core.compose.utils.paging.PaginatableLazyGridStateKt$rememberPaginatableLazyGridState$1$1", f = "PaginatableLazyGridState.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ed90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasNext;
    final /* synthetic */ dsy $listState;
    final /* synthetic */ int $offset;
    final /* synthetic */ gzs<s3q0> $onScrolledToEnd;
    int label;

    /* compiled from: PaginatableLazyGridState.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ gzs<s3q0> c;

        public a(boolean z, gzs<s3q0> gzsVar) {
            this.b = z;
            this.c = gzsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (this.b && booleanValue) {
                this.c.invoke();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed90(dsy dsyVar, int i, boolean z, gzs<s3q0> gzsVar, spj<? super ed90> spjVar) {
        super(2, spjVar);
        this.$listState = dsyVar;
        this.$offset = i;
        this.$hasNext = z;
        this.$onScrolledToEnd = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ed90(this.$listState, this.$offset, this.$hasNext, this.$onScrolledToEnd, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ed90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final dsy dsyVar = this.$listState;
            final int i2 = this.$offset;
            izg0 M = nr2.M(new gzs() { // from class: xsna.dd90
                @Override // xsna.gzs
                public final Object invoke() {
                    dsy dsyVar2 = dsy.this;
                    xqy xqyVar = (xqy) j5g.k0(dsyVar2.i().f());
                    return Boolean.valueOf((xqyVar != null ? xqyVar.getIndex() : Integer.MIN_VALUE) >= dsyVar2.i().d() - i2);
                }
            });
            a aVar = new a(this.$hasNext, this.$onScrolledToEnd);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
