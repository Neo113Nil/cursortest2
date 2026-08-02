package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.IConsumerController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalStateVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import yads.ig2;

/* loaded from: classes7.dex */
public final class o021 implements IVerificationFlowBridge {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public o021(ge71 ge71Var) {
        mo71 mo71Var = new mo71();
        gf71 gf71Var = new gf71();
        pm61 pm61Var = new pm61();
        h291 h291Var = new h291();
        zi81 zi81Var = new zi81();
        t481 t481Var = new t481();
        ra81 ra81Var = new ra81();
        yq71 yq71Var = new yq71();
        po81 po81Var = new po81();
        this.a = ge71Var;
        this.b = mo71Var;
        this.c = gf71Var;
        this.d = pm61Var;
        this.e = h291Var;
        this.f = zi81Var;
        this.g = t481Var;
        this.h = ra81Var;
        this.i = yq71Var;
        this.j = po81Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object failure;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            failure = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Integer) (failure instanceof Result.Failure ? null : failure);
    }

    public static ListBuilder b(JSONArray jSONArray) {
        ig2 ig2Var;
        Object obj;
        if (jSONArray != null && jSONArray.length() != 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ListBuilder a = rcc.a();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id", null);
                    if (optString.length() <= 0) {
                        optString = null;
                    }
                    if (optString != null) {
                        fd71 fd71Var = ig2.Companion;
                        String optString2 = optJSONObject.optString("format", null);
                        fd71Var.getClass();
                        if (optString2 != null) {
                            if (optString2.length() <= 0) {
                                optString2 = null;
                            }
                            if (optString2 != null) {
                                Iterator<E> it = ig2.e.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (jl40.l(((ig2) obj).b, optString2)) {
                                        break;
                                    }
                                }
                                ig2Var = (ig2) obj;
                                if (ig2Var != null && linkedHashSet.add(new Pair(optString, ig2Var))) {
                                    a.add(new u671(optString, ig2Var));
                                }
                            }
                        }
                        ig2Var = null;
                        if (ig2Var != null) {
                            a.add(new u671(optString, ig2Var));
                        }
                    }
                }
            }
            ListBuilder j = a.j();
            if (!j.isEmpty()) {
                return j;
            }
        }
        return null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IAdapterController getAdapterController() {
        return ((boj0) this.e).getAdapterController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public ICommonController getCommonController() {
        return ((an8) this.i).getCommonController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IConsumerController getConsumerController() {
        return ((an8) this.g).getConsumerController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IEbsController getEbsController() {
        return ((w3i) this.f).getEbsController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IInitializationController getInitializationController() {
        return ((wrr) this.b).getInitializationController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IInstructionsController getInstructionsController() {
        return ((q4g) this.d).getInstructionsController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IMetadataController getMetadataController() {
        return ((ht10) this.h).getMetadataController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IVerificationRouter getRouter() {
        IVerificationRouter iVerificationRouter = (IVerificationRouter) this.j;
        if (iVerificationRouter != null) {
            return iVerificationRouter;
        }
        throw new IllegalStateVerificationFlowEbsException("Router not registered");
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public ISecurityController getSecurityController() {
        return ((hwo0) this.c).getSecurityController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public IVerificationSessionController getVerificationSessionController() {
        return ((s421) this.a).getVerificationSessionController();
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public void registerRouter(IVerificationRouter iVerificationRouter) {
        this.j = iVerificationRouter;
    }

    @Override // ru.rt.ebs.cryptosdk.core.di.IVerificationFlowBridge
    public void unregisterRouter() {
        this.j = null;
    }

    public o021(s421 s421Var, wrr wrrVar, hwo0 hwo0Var, q4g q4gVar, boj0 boj0Var, w3i w3iVar, an8 an8Var, ht10 ht10Var, an8 an8Var2) {
        this.a = s421Var;
        this.b = wrrVar;
        this.c = hwo0Var;
        this.d = q4gVar;
        this.e = boj0Var;
        this.f = w3iVar;
        this.g = an8Var;
        this.h = ht10Var;
        this.i = an8Var2;
    }

    public o021(Context context, qcp0 qcp0Var, jwh jwhVar, hwy0 hwy0Var, l7x0 l7x0Var, dci dciVar, e eVar, qdc qdcVar, q8s q8sVar, yuj0 yuj0Var) {
        this.a = context;
        this.b = qcp0Var;
        this.c = jwhVar;
        this.d = hwy0Var;
        this.e = l7x0Var;
        this.f = dciVar;
        this.g = eVar;
        this.h = qdcVar;
        this.i = q8sVar;
        this.j = yuj0Var;
    }

    public o021(xvf0 xvf0Var, z6x0 z6x0Var, xvf0 xvf0Var2, mg11 mg11Var, rct0 rct0Var, on11 on11Var, xvf0 xvf0Var3, xvf0 xvf0Var4, mg11 mg11Var2, xvf0 xvf0Var5) {
        this.a = xvf0Var;
        this.f = z6x0Var;
        this.b = xvf0Var2;
        this.g = mg11Var;
        this.h = rct0Var;
        this.i = on11Var;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.j = mg11Var2;
        this.e = xvf0Var5;
    }
}
