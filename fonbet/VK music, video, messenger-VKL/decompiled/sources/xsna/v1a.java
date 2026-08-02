package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CatalogBlockInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.CatalogBlockInlineActorKt$loadNextBlock$2", f = "CatalogBlockInlineActor.kt", l = {262}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class v1a extends SuspendLambda implements wzs<Result<? extends List<? extends CatalogBlockState>>, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Result<Object>, spj<? super s3q0>, Object> $onResult;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1a(wzs<? super Result<Object>, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super v1a> spjVar) {
        super(2, spjVar);
        this.$onResult = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        v1a v1aVar = new v1a(this.$onResult, spjVar);
        v1aVar.L$0 = ((Result) obj).d();
        return v1aVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Result<? extends List<? extends CatalogBlockState>> result, spj<? super s3q0> spjVar) {
        return ((v1a) create(new Result(result.d()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wzs<Result<Object>, spj<? super s3q0>, Object> wzsVar = this.$onResult;
            if (!(obj2 instanceof Result.Failure)) {
                try {
                    List list = (List) obj2;
                    if (list.size() != 1) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{"loadNextBlock should have only 1 item, actual = " + list.size()});
                        }
                    }
                    obj2 = (CatalogBlockState) j5g.Y(list);
                } catch (Throwable th) {
                    obj2 = new Result.Failure(th);
                }
            }
            Result<Object> result = new Result<>(obj2);
            this.L$0 = null;
            this.label = 1;
            if (wzsVar.invoke(result, this) == coroutineSingletons) {
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
