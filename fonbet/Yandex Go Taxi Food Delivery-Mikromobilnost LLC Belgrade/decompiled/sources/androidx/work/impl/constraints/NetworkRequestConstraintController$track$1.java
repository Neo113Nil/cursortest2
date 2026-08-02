package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.cvu0;
import defpackage.hgz;
import defpackage.k8e;
import defpackage.ksv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8e;
import defpackage.sls;
import defpackage.tje;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zl50;
import defpackage.zvr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Ls8e;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements wls {
    final /* synthetic */ k8e $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1(k8e k8eVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$constraints = k8eVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, continuation);
        networkRequestConstraintController$track$1.L$0 = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkRequestConstraintController$track$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sls slsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y6f0 y6f0Var = (y6f0) this.L$0;
        NetworkRequest a = this.$constraints.a();
        if (a == null) {
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.getClass();
            x6f0Var.l(null);
            return zy11Var;
        }
        zl50 zl50Var = new zl50(3, tje.N(y6f0Var, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, y6f0Var, null), 3), y6f0Var);
        if (Build.VERSION.SDK_INT >= 30) {
            slsVar = SharedNetworkCallback.INSTANCE.addCallback(this.this$0.a, a, zl50Var);
        } else {
            ksv ksvVar = IndividualNetworkCallback.Companion;
            final ConnectivityManager connectivityManager = this.this$0.a;
            ksvVar.getClass();
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(zl50Var, null);
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            try {
                hgz g = hgz.g();
                int i2 = d.a;
                g.getClass();
                connectivityManager.registerNetworkCallback(a, individualNetworkCallback);
                ref$BooleanRef.element = true;
            } catch (RuntimeException e) {
                if (!cvu0.s(e.getClass().getName(), "TooManyRequestsException", false)) {
                    throw e;
                }
                hgz g2 = hgz.g();
                int i3 = d.a;
                g2.getClass();
                zl50Var.invoke(new r8e(7));
            }
            slsVar = new sls() { // from class: androidx.work.impl.constraints.a
                @Override // defpackage.sls
                public final Object invoke() {
                    if (Ref$BooleanRef.this.element) {
                        hgz g3 = hgz.g();
                        int i4 = d.a;
                        g3.getClass();
                        connectivityManager.unregisterNetworkCallback(individualNetworkCallback);
                    }
                    return zy11.a;
                }
            };
        }
        zvr zvrVar = new zvr(14, slsVar);
        this.label = 1;
        return kotlinx.coroutines.channels.b.a(y6f0Var, zvrVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
