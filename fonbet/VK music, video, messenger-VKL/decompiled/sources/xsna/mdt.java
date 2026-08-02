package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogRepositoryImpl.kt */
@b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$deleteNotification$2", f = "GamesCatalogRepositoryImpl.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class mdt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $requestId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdt(int i, spj<? super mdt> spjVar) {
        super(2, spjVar);
        this.$requestId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mdt(this.$requestId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mdt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            List singletonList = Collections.singletonList(new Integer(this.$requestId));
            ufx ufxVar = new ufx("apps.deleteRequest", new pm0(2), new tf3(0));
            ufxVar.h("request_ids", singletonList);
            iz2 A = yfb.A(ufxVar);
            this.label = 1;
            if (evj.p(A, this) == coroutineSingletons) {
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
