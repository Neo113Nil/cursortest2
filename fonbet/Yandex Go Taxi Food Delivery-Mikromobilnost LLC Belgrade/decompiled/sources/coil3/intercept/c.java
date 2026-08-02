package coil3.intercept;

import android.content.Context;
import defpackage.ago;
import defpackage.gev;
import defpackage.l8w;
import defpackage.mev;
import defpackage.mm60;
import defpackage.ny61;
import defpackage.o8w;
import defpackage.xis0;
import defpackage.yci0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c implements l8w {
    public final gev a;
    public final List b;
    public final int c;
    public final gev d;
    public final xis0 e;
    public final ago f;
    public final boolean g;

    public c(gev gevVar, List list, int i, gev gevVar2, xis0 xis0Var, ago agoVar, boolean z) {
        this.a = gevVar;
        this.b = list;
        this.c = i;
        this.d = gevVar2;
        this.e = xis0Var;
        this.f = agoVar;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        o8w o8wVar;
        Context context;
        gev gevVar;
        if (continuationImpl instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuationImpl;
            int i2 = realInterceptorChain$proceed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = realInterceptorChain$proceed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInterceptorChain$proceed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = this.b;
                    int i3 = this.c;
                    o8w o8wVar2 = (o8w) list.get(i3);
                    ago agoVar = this.f;
                    boolean z = this.g;
                    c cVar = new c(this.a, this.b, i3 + 1, this.d, this.e, agoVar, z);
                    realInterceptorChain$proceed$1.L$0 = o8wVar2;
                    realInterceptorChain$proceed$1.label = 1;
                    Object a = o8wVar2.a(cVar, realInterceptorChain$proceed$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o8wVar = o8wVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o8wVar = (o8w) realInterceptorChain$proceed$1.L$0;
                    kotlin.b.b(obj);
                }
                mev mevVar = (mev) obj;
                gev request = mevVar.getRequest();
                context = request.a;
                gevVar = this.a;
                if (context == gevVar.a) {
                    yci0.n("Interceptor '", o8wVar, "' cannot modify the request's context.");
                    return null;
                }
                if (request.b == mm60.a) {
                    yci0.n("Interceptor '", o8wVar, "' cannot set the request's data to null.");
                    return null;
                }
                if (request.c != gevVar.c) {
                    yci0.n("Interceptor '", o8wVar, "' cannot modify the request's target.");
                    return null;
                }
                if (request.q == gevVar.q) {
                    return mevVar;
                }
                yci0.n("Interceptor '", o8wVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
                return null;
            }
        }
        realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
        Object obj2 = realInterceptorChain$proceed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        mev mevVar2 = (mev) obj2;
        gev request2 = mevVar2.getRequest();
        context = request2.a;
        gevVar = this.a;
        if (context == gevVar.a) {
        }
    }
}
