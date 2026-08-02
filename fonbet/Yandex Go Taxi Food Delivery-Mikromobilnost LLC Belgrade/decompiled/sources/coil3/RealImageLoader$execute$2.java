package coil3;

import defpackage.fse;
import defpackage.gev;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.umf;
import defpackage.wls;
import defpackage.yo40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmev;", "<anonymous>", "(Ltse;)Lmev;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class RealImageLoader$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ gev $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(c cVar, gev gevVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$request = gevVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.this$0, this.$request, continuation);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        qoh h = tje.h((tse) this.L$0, (fse) this.this$0.a.c.getValue(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2);
        umf umfVar = this.$request.c;
        noh f = (umfVar instanceof umf ? qje.v(umfVar.a).getDisposable(h) : new yo40(h)).f();
        this.label = 1;
        Object k = f.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
