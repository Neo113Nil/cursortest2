package com.yandex.go.yb.domain;

import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.ybsdk.api.YBSdk;
import defpackage.ai51;
import defpackage.aw51;
import defpackage.c170;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.hit;
import defpackage.hst;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.jpb;
import defpackage.jst;
import defpackage.lr51;
import defpackage.mdh;
import defpackage.mq4;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tf51;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v770;
import defpackage.vmp0;
import defpackage.xf51;
import defpackage.yh51;
import defpackage.ymp0;
import defpackage.zv51;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes8.dex */
public final class y implements vmp0 {
    public final com.yandex.go.yb.data.e a;
    public final jj3 b;
    public final mq4 c;
    public final lr51 d;
    public final hit e;
    public final tt2 f;
    public final h3y g;
    public final c170 h;
    public final ExternalSchemesInteractor i;
    public jpb j;

    public y(com.yandex.go.yb.data.e eVar, jj3 jj3Var, mq4 mq4Var, lr51 lr51Var, hit hitVar, tt2 tt2Var, h3y h3yVar, c170 c170Var, ExternalSchemesInteractor externalSchemesInteractor, Lifecycle lifecycle) {
        this.a = eVar;
        this.b = jj3Var;
        this.c = mq4Var;
        this.d = lr51Var;
        this.e = hitVar;
        this.f = tt2Var;
        this.g = h3yVar;
        this.h = c170Var;
        this.i = externalSchemesInteractor;
        eVar.d(this);
        ru.yandex.taxi.lifecycle.c.a(lifecycle, new ymp0(17, this));
    }

    public static final YbScreenSource c(y yVar, v770 v770Var) {
        yVar.getClass();
        if (jl40.l(v770Var, v770.m)) {
            return YbScreenSource.PROMO_OBJECT;
        }
        if (jl40.l(v770Var, v770.c)) {
            return YbScreenSource.DEEPLINK;
        }
        if (jl40.l(v770Var, v770.s)) {
            return YbScreenSource.PUSH;
        }
        hst hstVar = jst.e;
        new Throwable(g8e.o("Unsupported or unhandled openReason=", v770Var.a));
        hstVar.getClass();
        return YbScreenSource.DEEPLINK;
    }

    @Override // defpackage.vmp0
    public final void a() {
        u uVar;
        jpb jpbVar = this.j;
        if (jpbVar != null) {
            synchronized (jpbVar) {
                uVar = (u) jpbVar.c;
                jpbVar.c = null;
            }
            if (uVar != null) {
                if (SystemClock.uptimeMillis() - jpbVar.b > 30000) {
                    hst hstVar = jst.e;
                    SystemClock.uptimeMillis();
                    hstVar.getClass();
                } else {
                    uVar.run();
                }
            }
        }
        this.j = null;
    }

    @Override // defpackage.vmp0
    public final void b() {
        jst.e.getClass();
        this.j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, BigDecimal bigDecimal, YbScreenSource ybScreenSource, ContinuationImpl continuationImpl) {
        YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$1 ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1;
        Object obj;
        int i;
        String str2;
        BigDecimal bigDecimal2;
        YbScreenSource ybScreenSource2;
        List list;
        Object obj2;
        tf51 tf51Var;
        if (continuationImpl instanceof YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$1) {
            ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1 = (YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$1) continuationImpl;
            int i2 = ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = new w(YBSdk.INSTANCE.observeStateChanges());
                    ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$0 = str;
                    ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$1 = bigDecimal;
                    ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$2 = ybScreenSource;
                    ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(wVar, ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybScreenSource2 = (YbScreenSource) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$2;
                        bigDecimal2 = (BigDecimal) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$1;
                        str2 = (String) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$0;
                        kotlin.b.b(obj);
                        List list2 = (List) obj;
                        list = list2;
                        if (list != null || list.isEmpty()) {
                            return new aw51(ybScreenSource2);
                        }
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            tf51 tf51Var2 = ((xf51) obj2).f;
                            if (jl40.l(tf51Var2 != null ? tf51Var2.b : null, str2)) {
                                break;
                            }
                        }
                        xf51 xf51Var = (xf51) obj2;
                        if (xf51Var == null || (tf51Var = xf51Var.f) == null) {
                            return new aw51(ybScreenSource2);
                        }
                        BigDecimal subtract = bigDecimal2.subtract(tf51Var.a);
                        if (subtract.compareTo(BigDecimal.ZERO) <= 0) {
                            return null;
                        }
                        return new aw51(new zv51(str2, subtract), ybScreenSource2);
                    }
                    ybScreenSource = (YbScreenSource) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$2;
                    bigDecimal = (BigDecimal) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$1;
                    str = (String) ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((ai51) obj) instanceof yh51) {
                    return new aw51(ybScreenSource);
                }
                this.f.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1 ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1 = new YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1();
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$0 = str;
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$1 = bigDecimal;
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$2 = ybScreenSource;
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.L$3 = null;
                ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label = 2;
                obj = tje.k0(mdhVar, ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1, ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1);
                if (obj != coroutineSingletons) {
                    BigDecimal bigDecimal3 = bigDecimal;
                    str2 = str;
                    bigDecimal2 = bigDecimal3;
                    ybScreenSource2 = ybScreenSource;
                    List list22 = (List) obj;
                    list = list22;
                    if (list != null) {
                    }
                    return new aw51(ybScreenSource2);
                }
                return coroutineSingletons;
            }
        }
        ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1 = new YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$1(this, continuationImpl);
        obj = ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkDeeplinkHandlerImpl$createUpToAmountIntent$1.label;
        if (i != 0) {
        }
        if (((ai51) obj) instanceof yh51) {
        }
    }
}
