package coil;

import defpackage.hev;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnev;", "<anonymous>", "(Ltse;)Lnev;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ hev $request;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(hev hevVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$request = hevVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$2$job$1(this.$request, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        hev hevVar = this.$request;
        this.label = 1;
        Object a = c.a(cVar, hevVar, 1, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
