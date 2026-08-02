package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginatableLazyListState.kt */
@b6l(c = "com.vk.core.compose.utils.paging.PaginatableLazyListStateKt$rememberPaginatableLazyListState$3$1", f = "PaginatableLazyListState.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ld90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasPrevious;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ int $offset;
    final /* synthetic */ gzs<s3q0> $onScrolledToStart;
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
    public ld90(xvy xvyVar, int i, boolean z, gzs<s3q0> gzsVar, spj<? super ld90> spjVar) {
        super(2, spjVar);
        this.$listState = xvyVar;
        this.$offset = i;
        this.$hasPrevious = z;
        this.$onScrolledToStart = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ld90(this.$listState, this.$offset, this.$hasPrevious, this.$onScrolledToStart, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ld90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final xvy xvyVar = this.$listState;
            final int i2 = this.$offset;
            izg0 M = nr2.M(new gzs() { // from class: xsna.kd90
                @Override // xsna.gzs
                public final Object invoke() {
                    xuy xuyVar = (xuy) j5g.a0(xvy.this.j().f());
                    return Boolean.valueOf((xuyVar != null ? xuyVar.getIndex() : Integer.MAX_VALUE) < i2);
                }
            });
            a aVar = new a(this.$hasPrevious, this.$onScrolledToStart);
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
