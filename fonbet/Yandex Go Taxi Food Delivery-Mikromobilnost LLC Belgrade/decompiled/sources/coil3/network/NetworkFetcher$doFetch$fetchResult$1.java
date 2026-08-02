package coil3.network;

import coil3.graphics.EnumC0136DataSource;
import defpackage.b0r;
import defpackage.bdt0;
import defpackage.eja1;
import defpackage.iz50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ojt0;
import defpackage.oz50;
import defpackage.qci0;
import defpackage.wls;
import defpackage.yp6;
import defpackage.zct0;
import defpackage.zu50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz50;", "networkResponse", "Lzct0;", "<anonymous>", "(Loz50;)Lzct0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.network.NetworkFetcher$doFetch$fetchResult$1", f = "NetworkFetcher.kt", l = {HProv.PP_SET_PIN, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class NetworkFetcher$doFetch$fetchResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<oz50> $cacheResponse;
    final /* synthetic */ iz50 $networkRequest;
    final /* synthetic */ Ref$ObjectRef<qci0> $snapshot;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(Ref$ObjectRef ref$ObjectRef, b bVar, Ref$ObjectRef ref$ObjectRef2, iz50 iz50Var, Continuation continuation) {
        super(2, continuation);
        this.$snapshot = ref$ObjectRef;
        this.this$0 = bVar;
        this.$cacheResponse = ref$ObjectRef2;
        this.$networkRequest = iz50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(this.$snapshot, this.this$0, this.$cacheResponse, this.$networkRequest, continuation);
        networkFetcher$doFetch$fetchResult$1.L$0 = obj;
        return networkFetcher$doFetch$fetchResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$doFetch$fetchResult$1) create((oz50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, oz50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<qci0> ref$ObjectRef;
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1;
        oz50 oz50Var;
        T t;
        oz50 oz50Var2;
        zu50 zu50Var;
        Object obj2;
        yp6 yp6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            oz50 oz50Var3 = (oz50) this.L$0;
            ref$ObjectRef = this.$snapshot;
            b bVar = this.this$0;
            qci0 qci0Var = ref$ObjectRef.element;
            oz50 oz50Var4 = this.$cacheResponse.element;
            iz50 iz50Var = this.$networkRequest;
            this.L$0 = oz50Var3;
            this.L$1 = ref$ObjectRef;
            this.label = 1;
            networkFetcher$doFetch$fetchResult$1 = this;
            Object d = b.d(bVar, qci0Var, oz50Var4, iz50Var, oz50Var3, networkFetcher$doFetch$fetchResult$1);
            if (d != coroutineSingletons) {
                oz50Var = oz50Var3;
                t = d;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oz50Var2 = (oz50) this.L$0;
            kotlin.b.b(obj);
            networkFetcher$doFetch$fetchResult$1 = this;
            obj2 = obj;
            yp6Var = (yp6) obj2;
            if (yp6Var.b > 0) {
                return null;
            }
            bdt0 b = eja1.b(yp6Var, networkFetcher$doFetch$fetchResult$1.this$0.e());
            b bVar2 = networkFetcher$doFetch$fetchResult$1.this$0;
            return new zct0(b, bVar2.f(bVar2.a, oz50Var2.d.a("Content-Type")), EnumC0136DataSource.NETWORK);
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        oz50Var = (oz50) this.L$0;
        kotlin.b.b(obj);
        networkFetcher$doFetch$fetchResult$1 = this;
        t = obj;
        ref$ObjectRef.element = t;
        networkFetcher$doFetch$fetchResult$1.this$0.getClass();
        int i2 = oz50Var.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new HttpException(oz50Var);
        }
        qci0 qci0Var2 = networkFetcher$doFetch$fetchResult$1.$snapshot.element;
        if (qci0Var2 != null) {
            networkFetcher$doFetch$fetchResult$1.$cacheResponse.element = networkFetcher$doFetch$fetchResult$1.this$0.i(qci0Var2);
            b0r h = networkFetcher$doFetch$fetchResult$1.this$0.h(networkFetcher$doFetch$fetchResult$1.$snapshot.element);
            b bVar3 = networkFetcher$doFetch$fetchResult$1.this$0;
            String str2 = bVar3.a;
            oz50 oz50Var5 = networkFetcher$doFetch$fetchResult$1.$cacheResponse.element;
            if (oz50Var5 != null && (zu50Var = oz50Var5.d) != null) {
                str = zu50Var.a("Content-Type");
            }
            return new zct0(h, bVar3.f(str2, str), EnumC0136DataSource.NETWORK);
        }
        ojt0 ojt0Var = oz50Var.e;
        if (ojt0Var == null) {
            ny61.r("body == null");
            return null;
        }
        networkFetcher$doFetch$fetchResult$1.L$0 = oz50Var;
        networkFetcher$doFetch$fetchResult$1.L$1 = null;
        networkFetcher$doFetch$fetchResult$1.label = 2;
        Object a = coil3.network.internal.a.a(ojt0Var, networkFetcher$doFetch$fetchResult$1);
        if (a != coroutineSingletons) {
            oz50Var2 = oz50Var;
            obj2 = a;
            yp6Var = (yp6) obj2;
            if (yp6Var.b > 0) {
            }
        }
        return coroutineSingletons;
    }
}
