package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginatableLazyListState.kt */
@b6l(c = "com.vk.core.compose.utils.paging.PaginatableLazyListStateKt$rememberPaginatableLazyListState$2$1", f = "PaginatableLazyListState.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class jd90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasNext;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ int $offset;
    final /* synthetic */ gzs<s3q0> $onScrolledToEnd;
    int label;

    /* compiled from: PaginatableLazyListState.kt */
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
    public jd90(xvy xvyVar, int i, boolean z, gzs<s3q0> gzsVar, spj<? super jd90> spjVar) {
        super(2, spjVar);
        this.$listState = xvyVar;
        this.$offset = i;
        this.$hasNext = z;
        this.$onScrolledToEnd = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jd90(this.$listState, this.$offset, this.$hasNext, this.$onScrolledToEnd, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jd90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new id90(this.$listState, this.$offset, 0));
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
