package com.yandex.passport.sloth.command;

import com.yandex.passport.common.web.BridgeMethod;
import com.yandex.passport.sloth.SlothMetricaEvent$Event;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.z0;
import defpackage.g8e;
import defpackage.iqn;
import defpackage.jl40;
import defpackage.kqn;
import defpackage.mqn;
import defpackage.ny61;
import defpackage.w511;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class f {
    public final k a;
    public final p b;
    public final z0 c;

    public f(k kVar, p pVar, z0 z0Var) {
        this.a = kVar;
        this.b = pVar;
        this.c = z0Var;
    }

    public final String a(String str, String str2, String str3) {
        if (str3 == null) {
            return null;
        }
        if (!jl40.l(str, BridgeMethod.GetEbsAgeConfirmState.getMethodName())) {
            this.c.a(new n0(SlothMetricaEvent$Event.MESSAGE_SENT, g8e.z(Constants.KEY_MESSAGE, str)));
        }
        String quote = JSONObject.quote(str3);
        return "window.nativeAMResponse.receive(" + JSONObject.quote(String.valueOf(str2)) + Extension.FIX_SPACE + quote + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c cVar, ContinuationImpl continuationImpl) {
        JsCommandInterpreter$performJsCommand$1 jsCommandInterpreter$performJsCommand$1;
        int i;
        q qVar;
        s sVar;
        mqn mqnVar;
        if (continuationImpl instanceof JsCommandInterpreter$performJsCommand$1) {
            jsCommandInterpreter$performJsCommand$1 = (JsCommandInterpreter$performJsCommand$1) continuationImpl;
            int i2 = jsCommandInterpreter$performJsCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsCommandInterpreter$performJsCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsCommandInterpreter$performJsCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsCommandInterpreter$performJsCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsCommandInterpreter$performJsCommand$1.L$0 = this;
                    jsCommandInterpreter$performJsCommand$1.L$1 = cVar;
                    jsCommandInterpreter$performJsCommand$1.label = 1;
                    p pVar = this.b;
                    pVar.getClass();
                    BridgeMethod bridgeMethod = cVar.a;
                    switch (n.a[bridgeMethod.ordinal()]) {
                        case 1:
                            qVar = pVar.c;
                            break;
                        case 2:
                            qVar = pVar.e;
                            break;
                        case 3:
                            qVar = pVar.d;
                            break;
                        case 4:
                            qVar = pVar.f;
                            break;
                        case 5:
                            qVar = pVar.g;
                            break;
                        case 6:
                            qVar = pVar.h;
                            break;
                        case 7:
                            qVar = pVar.i;
                            break;
                        case 8:
                            qVar = pVar.j;
                            break;
                        case 9:
                            qVar = pVar.k;
                            break;
                        case 10:
                            qVar = pVar.l;
                            break;
                        case 11:
                            qVar = pVar.m;
                            break;
                        case 12:
                            qVar = pVar.n;
                            break;
                        case 13:
                            qVar = pVar.o;
                            break;
                        case 14:
                            qVar = pVar.p;
                            break;
                        case 15:
                            qVar = pVar.q;
                            break;
                        case 16:
                            qVar = pVar.r;
                            break;
                        case 17:
                            qVar = pVar.s;
                            break;
                        case 18:
                            qVar = pVar.u;
                            break;
                        case 19:
                            qVar = pVar.v;
                            break;
                        default:
                            Iterator it = pVar.b.a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    sVar = ((com.yandex.passport.sloth.dependencies.e) it.next()).a(bridgeMethod);
                                    if (sVar != null) {
                                    }
                                } else {
                                    sVar = null;
                                }
                            }
                            qVar = sVar != null ? new com.yandex.passport.internal.core.accounts.p(pVar.a, sVar) : null;
                            if (qVar == null) {
                                qVar = n.a[bridgeMethod.ordinal()] == 20 ? pVar.t : null;
                                if (qVar == null) {
                                    qVar = new o();
                                    break;
                                }
                            }
                            break;
                    }
                    obj = qVar.a(cVar.c, jsCommandInterpreter$performJsCommand$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) jsCommandInterpreter$performJsCommand$1.L$1;
                    this = (f) jsCommandInterpreter$performJsCommand$1.L$0;
                    kotlin.b.b(obj);
                }
                mqnVar = (mqn) obj;
                if (!(mqnVar instanceof iqn)) {
                    return this.a(cVar.a.getMethodName(), cVar.b, ((r) ((iqn) mqnVar).a).a());
                }
                if (!(mqnVar instanceof kqn)) {
                    w511.b();
                    return null;
                }
                e eVar = (e) ((kqn) mqnVar).a;
                String methodName = cVar.a.getMethodName();
                String str = cVar.b;
                this.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", eVar.a);
                return this.a(methodName, str, jSONObject.toString());
            }
        }
        jsCommandInterpreter$performJsCommand$1 = new JsCommandInterpreter$performJsCommand$1(this, continuationImpl);
        Object obj2 = jsCommandInterpreter$performJsCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsCommandInterpreter$performJsCommand$1.label;
        if (i != 0) {
        }
        mqnVar = (mqn) obj2;
        if (!(mqnVar instanceof iqn)) {
        }
    }
}
