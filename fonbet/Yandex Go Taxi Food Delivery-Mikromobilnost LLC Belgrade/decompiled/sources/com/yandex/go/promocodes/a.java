package com.yandex.go.promocodes;

import com.adjust.sdk.Constants;
import com.yandex.go.promocodes.experiment.BenefitsCenterExperiment;
import defpackage.an5;
import defpackage.fx60;
import defpackage.gd;
import defpackage.jj0;
import defpackage.jo0;
import defpackage.kj0;
import defpackage.mn5;
import defpackage.mrf0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.sb0;
import defpackage.sls;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class a extends kj0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;
    public final yvf0 d;
    public final fx60 e;
    public final an5 f;

    public a(com.yandex.go.lifecycle.a aVar, yvf0 yvf0Var, gd gdVar, fx60 fx60Var, an5 an5Var) {
        this.b = aVar;
        this.c = yvf0Var;
        this.d = gdVar;
        this.e = fx60Var;
        this.f = an5Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (jj0) obj, v770Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, jj0 jj0Var, v770 v770Var, ContinuationImpl continuationImpl) {
        AddpromocodeTypedDeeplinkHandler$handleDeeplink$1 addpromocodeTypedDeeplinkHandler$handleDeeplink$1;
        int i;
        Object b;
        oep0 oep0Var2;
        v770 v770Var2;
        jj0 jj0Var2;
        if (continuationImpl instanceof AddpromocodeTypedDeeplinkHandler$handleDeeplink$1) {
            addpromocodeTypedDeeplinkHandler$handleDeeplink$1 = (AddpromocodeTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = addpromocodeTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addpromocodeTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                AddpromocodeTypedDeeplinkHandler$handleDeeplink$1 addpromocodeTypedDeeplinkHandler$handleDeeplink$12 = addpromocodeTypedDeeplinkHandler$handleDeeplink$1;
                Object obj = addpromocodeTypedDeeplinkHandler$handleDeeplink$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addpromocodeTypedDeeplinkHandler$handleDeeplink$12.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = oep0Var;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = jj0Var;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = v770Var;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.label = 1;
                    b = ((q) this.f.b).b(addpromocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (b != obj2) {
                        oep0Var2 = oep0Var;
                        v770Var2 = v770Var;
                        jj0Var2 = jj0Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                    } else if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                v770 v770Var3 = (v770) addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$2;
                jj0Var2 = (jj0) addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$1;
                oep0 oep0Var3 = (oep0) addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$0;
                kotlin.b.b(obj);
                b = obj;
                v770Var2 = v770Var3;
                oep0Var2 = oep0Var3;
                String a = jj0Var2.a();
                if (((BenefitsCenterExperiment) b).b) {
                    mrf0 mrf0Var = new mrf0(jj0Var2.b(), v770Var2, 2);
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$4 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$5 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.label = 3;
                    Object e = e(new sb0(i3, oep0Var2, this, mrf0Var), addpromocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (e != obj2) {
                        return e;
                    }
                } else {
                    String queryParameter = jj0Var2.b().getQueryParameter("origin");
                    if (queryParameter == null) {
                        queryParameter = Constants.DEEPLINK;
                    }
                    String str = queryParameter;
                    mn5 mn5Var = new mn5(a);
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$0 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$1 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$2 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$4 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$5 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$6 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.L$7 = null;
                    addpromocodeTypedDeeplinkHandler$handleDeeplink$12.label = 2;
                    Object e2 = e(new jo0(oep0Var2, this, str, mn5Var, 0), addpromocodeTypedDeeplinkHandler$handleDeeplink$12);
                    if (e2 != obj2) {
                        return e2;
                    }
                }
                return obj2;
            }
        }
        addpromocodeTypedDeeplinkHandler$handleDeeplink$1 = new AddpromocodeTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        AddpromocodeTypedDeeplinkHandler$handleDeeplink$1 addpromocodeTypedDeeplinkHandler$handleDeeplink$122 = addpromocodeTypedDeeplinkHandler$handleDeeplink$1;
        Object obj3 = addpromocodeTypedDeeplinkHandler$handleDeeplink$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addpromocodeTypedDeeplinkHandler$handleDeeplink$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        String a2 = jj0Var2.a();
        if (((BenefitsCenterExperiment) b).b) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r5.b.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sls slsVar, ContinuationImpl continuationImpl) {
        AddpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1 addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        sls slsVar2;
        if (continuationImpl instanceof AddpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1) {
            addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1 = (AddpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1) continuationImpl;
            int i2 = addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = i2 - Integer.MIN_VALUE;
                obj = addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
                    addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar2 = (sls) addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            slsVar2.invoke();
                        }
                        return zy11.a;
                    }
                    slsVar = (sls) addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0;
                    kotlin.b.b(obj);
                }
                Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
                addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
                obj = this.e.c(events$Zalogin$LoginContext, addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1);
                if (obj != coroutineSingletons) {
                    slsVar2 = slsVar;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1 = new AddpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1(this, continuationImpl);
        obj = addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label;
        if (i != 0) {
        }
        Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = Events$Zalogin$LoginContext.DEEPLINK;
        addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.L$0 = slsVar;
        addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1.label = 2;
        obj = this.e.c(events$Zalogin$LoginContext2, addpromocodeTypedDeeplinkHandler$waitForUserAuthorized$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
