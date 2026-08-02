package coil.intercept;

import android.content.Context;
import defpackage.cgo;
import defpackage.hev;
import defpackage.n8w;
import defpackage.nev;
import defpackage.ny61;
import defpackage.q8w;
import defpackage.wis0;
import defpackage.xpb1;
import defpackage.yci0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b implements n8w {
    public final hev a;
    public final List b;
    public final int c;
    public final hev d;
    public final wis0 e;
    public final cgo f;
    public final boolean g;

    public b(hev hevVar, List list, int i, hev hevVar2, wis0 wis0Var, cgo cgoVar, boolean z) {
        this.a = hevVar;
        this.b = list;
        this.c = i;
        this.d = hevVar2;
        this.e = wis0Var;
        this.f = cgoVar;
        this.g = z;
    }

    public final void a(hev hevVar, q8w q8wVar) {
        Context context = hevVar.a;
        hev hevVar2 = this.a;
        if (context != hevVar2.a) {
            yci0.n("Interceptor '", q8wVar, "' cannot modify the request's context.");
            return;
        }
        if (hevVar.b == xpb1.L) {
            yci0.n("Interceptor '", q8wVar, "' cannot set the request's data to null.");
            return;
        }
        if (hevVar.c != hevVar2.c) {
            yci0.n("Interceptor '", q8wVar, "' cannot modify the request's target.");
        } else if (hevVar.x != hevVar2.x) {
            yci0.n("Interceptor '", q8wVar, "' cannot modify the request's lifecycle.");
        } else {
            if (hevVar.y == hevVar2.y) {
                return;
            }
            yci0.n("Interceptor '", q8wVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    public final cgo b() {
        return this.f;
    }

    public final hev c() {
        return this.d;
    }

    public final wis0 d() {
        return this.e;
    }

    public final boolean e() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r13v5, types: [q8w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(hev hevVar, ContinuationImpl continuationImpl) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        a aVar;
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
                    if (i3 > 0) {
                        a(hevVar, (q8w) list.get(i3 - 1));
                    }
                    q8w q8wVar = (q8w) list.get(i3);
                    b bVar = new b(this.a, this.b, i3 + 1, hevVar, this.e, this.f, this.g);
                    realInterceptorChain$proceed$1.L$0 = this;
                    realInterceptorChain$proceed$1.L$1 = q8wVar;
                    realInterceptorChain$proceed$1.label = 1;
                    aVar = (a) q8wVar;
                    obj = aVar.d(bVar, realInterceptorChain$proceed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r13 = (q8w) realInterceptorChain$proceed$1.L$1;
                    b bVar2 = (b) realInterceptorChain$proceed$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r13;
                    this = bVar2;
                }
                nev nevVar = (nev) obj;
                this.a(nevVar.b(), aVar);
                return nevVar;
            }
        }
        realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
        Object obj2 = realInterceptorChain$proceed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        nev nevVar2 = (nev) obj2;
        this.a(nevVar2.b(), aVar);
        return nevVar2;
    }
}
