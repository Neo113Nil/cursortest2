package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.sct;

/* compiled from: GamesCatalogEventBusImpl.kt */
@b6l(c = "com.vk.games.event.GamesCatalogEventBusImpl$deleteNotification$1", f = "GamesCatalogEventBusImpl.kt", l = {JsonToken.END_ARRAY}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class obt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $requestId;
    int label;
    final /* synthetic */ rbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obt(rbt rbtVar, int i, spj<? super obt> spjVar) {
        super(2, spjVar);
        this.this$0 = rbtVar;
        this.$requestId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new obt(this.this$0, this.$requestId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((obt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            kdt kdtVar = this.this$0.a;
            int i2 = this.$requestId;
            this.label = 1;
            if (kdtVar.c(i2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.c.e(new sct.a(this.$requestId));
        return s3q0.a;
    }
}
