package coil3.network;

import coil3.graphics.EnumC0136DataSource;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojt0;
import defpackage.oz50;
import defpackage.wls;
import defpackage.xev;
import defpackage.zct0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz50;", "response", "Lzct0;", "<anonymous>", "(Loz50;)Lzct0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.network.NetworkFetcher$doFetch$2", f = "NetworkFetcher.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class NetworkFetcher$doFetch$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(this.this$0, continuation);
        networkFetcher$doFetch$2.L$0 = obj;
        return networkFetcher$doFetch$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$doFetch$2) create((oz50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oz50 oz50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oz50 oz50Var2 = (oz50) this.L$0;
            b bVar = this.this$0;
            ojt0 ojt0Var = oz50Var2.e;
            if (ojt0Var == null) {
                ny61.r("body == null");
                return null;
            }
            this.L$0 = oz50Var2;
            this.label = 1;
            Object c = b.c(bVar, ojt0Var, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            oz50Var = oz50Var2;
            obj = c;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oz50Var = (oz50) this.L$0;
            kotlin.b.b(obj);
        }
        b bVar2 = this.this$0;
        return new zct0((xev) obj, bVar2.f(bVar2.a, oz50Var.d.a("Content-Type")), EnumC0136DataSource.NETWORK);
    }
}
