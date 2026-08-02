package xsna;

import com.ironsource.adapters.fyber.FyberConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.Message;
import org.json.JSONObject;
import xsna.bv90;

/* compiled from: ApiEventHubMessageHandler.kt */
/* loaded from: classes3.dex */
public final class cy2 extends ozp {
    public final bv90 a;
    public final byte b = 2;

    public cy2(bv90 bv90Var) {
        this.a = bv90Var;
    }

    @Override // xsna.ozp
    public final byte a() {
        return this.b;
    }

    @Override // xsna.ozp
    public final boolean b(Message message) {
        JSONObject a = message.a();
        long optLong = a.optLong("id", Long.MIN_VALUE);
        if (optLong != Long.MIN_VALUE) {
            JSONObject optJSONObject = a.optJSONObject("error");
            bv90 bv90Var = this.a;
            if (optJSONObject == null) {
                JSONObject optJSONObject2 = a.optJSONObject("result");
                if (optJSONObject2 == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"ApiEventHubMessageHandler", qlb0.a(optLong, "Unknown message format for id=", " on Service(2)")});
                        return false;
                    }
                } else if (!optJSONObject2.has("success")) {
                    if (!optJSONObject2.has("response")) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.w, new Object[]{"ApiEventHubMessageHandler", qlb0.a(optLong, "Unknown result format for id=", " on Service(2)")});
                            return true;
                        }
                    } else {
                        if (bv90Var.a.containsKey(Long.valueOf(optLong))) {
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("response");
                            if (optJSONObject3 != null) {
                                bv90Var.a(optLong, optJSONObject3);
                                return true;
                            }
                            bv90Var.a(optLong, optJSONObject2);
                            return true;
                        }
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.w, new Object[]{"ApiEventHubMessageHandler", qlb0.a(optLong, "No pending request for id=", " on Service(2)")});
                            return true;
                        }
                    }
                }
            } else {
                if (bv90Var.a.containsKey(Long.valueOf(optLong))) {
                    bv90.a aVar = bv90Var.a.get(Long.valueOf(optLong));
                    xy2<?> xy2Var = aVar != null ? aVar.b : null;
                    bv90Var.b(optLong, xy2Var != null ? new VKApiExecutionException(optJSONObject.optInt("code", 1), xy2Var.b(), false, optJSONObject.optString("message", ""), null, null, null, xy2Var.getParamsMap(), 0, null, null, null, 3952) : new VKApiExecutionException(optJSONObject.optInt("code", -1), "unknown", false, optJSONObject.optString("message", FyberConstants.Logs.UNKNOWN_ERROR), null, null, null, null, 0, null, null, null, 3952));
                    return true;
                }
                L l4 = L.a;
                l4.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l4, L.LogType.w, new Object[]{"ApiEventHubMessageHandler", qlb0.a(optLong, "No pending request for id=", " on Service(2)")});
                    return true;
                }
            }
            return true;
        }
        L l5 = L.a;
        l5.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l5, L.LogType.w, new Object[]{"ApiEventHubMessageHandler", "Message without id field received on Service(2)"});
            return false;
        }
        return false;
    }

    @Override // xsna.ozp
    public final void c(IllegalArgumentException illegalArgumentException) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.w(l, L.LogType.e, illegalArgumentException, new Object[]{"ApiEventHubMessageHandler", "Failed to handle message on Service(2)"}, null, null, 24);
    }

    @Override // xsna.ozp
    public final void d(Message message) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ApiEventHubMessageHandler", "Service(2) handle " + ((Object) yni0.a(message.c()))});
    }
}
