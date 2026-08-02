package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.NotImplementedError;
import org.json.JSONObject;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes11.dex */
public final class nl7 implements tsr, ca20 {
    public static volatile boolean A;
    public static v5c0 B;
    public static q6c0 C;
    public static ll7 D;
    public static String[] E;
    public static final q501 b = new q501(10);
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static boolean w;
    public static sls x;
    public static ea20 y;
    public static tzt z;
    public ea20 a;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "calls_go");
        this.a = ea20Var;
        ea20Var.b(this);
        ea20 ea20Var2 = this.a;
        if (ea20Var2 == null) {
            ea20Var2 = null;
        }
        y = ea20Var2;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        y = null;
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        try {
            Objects.toString(obj);
            String str = x920Var.a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1821121633:
                        if (!str.equals("hideStatusBar")) {
                            break;
                        } else {
                            q6c0 q6c0Var = C;
                            if (q6c0Var == null) {
                                q6c0Var = null;
                            }
                            mjv mjvVar = ((njv) q6c0Var.w).b;
                            mjvVar.getClass();
                            mjvVar.a.a("InAppCalls.CollapsedCallStatusBar.Hide", new HashMap(), 1, new HashMap());
                            ((t270) q6c0Var.c).a.l(null);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case -1622540943:
                        if (!str.equals("hideActiveCallNotification")) {
                            break;
                        } else {
                            ll7 ll7Var = D;
                            if (ll7Var == null) {
                                ll7Var = null;
                            }
                            ll7Var.a.cancel(228);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case -270619340:
                        if (!str.equals("reportError")) {
                            break;
                        } else {
                            Map map = (Map) obj;
                            String str2 = (String) map.get("errorGroupId");
                            String str3 = (String) map.get(ErrorResponseData.JSON_ERROR_MESSAGE);
                            v5c0 v5c0Var = B;
                            if (v5c0Var == null) {
                                v5c0Var = null;
                            }
                            v5c0Var.K(str2, str3);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case -270512698:
                        if (!str.equals("reportEvent")) {
                            break;
                        } else {
                            Map map2 = (Map) obj;
                            String str4 = (String) map2.get(Constants.KEY_MESSAGE);
                            Map map3 = (Map) map2.get("parameters");
                            v5c0 v5c0Var2 = B;
                            if (v5c0Var2 == null) {
                                v5c0Var2 = null;
                            }
                            i d = ((j) ((njv) ((yiv) v5c0Var2.b)).a).d(str4);
                            if (map3 != null) {
                                d.a.putAll(map3);
                            }
                            d.m();
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case -43724045:
                        if (!str.equals("notifyEngineDestroying")) {
                            break;
                        } else {
                            w = true;
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case 26149580:
                        if (!str.equals("showIncomingCallNotification")) {
                            break;
                        } else {
                            String jSONObject = new JSONObject((Map) obj).toString();
                            rbx rbxVar = sbx.d;
                            rbxVar.getClass();
                            tpv tpvVar = (tpv) rbxVar.b(tpv.Companion.serializer(), jSONObject);
                            ll7 ll7Var2 = D;
                            if (ll7Var2 == null) {
                                ll7Var2 = null;
                            }
                            ll7Var2.a(tpvVar.a);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case 989736172:
                        if (!str.equals("showActiveCallNotification")) {
                            break;
                        } else {
                            Map map4 = (Map) obj;
                            String str5 = (String) map4.get("title");
                            String str6 = (String) map4.get("subtitle");
                            ll7 ll7Var3 = D;
                            if (ll7Var3 == null) {
                                ll7Var3 = null;
                            }
                            ll7Var3.b(str5, str6);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case 1446191836:
                        if (!str.equals("destroyEngine")) {
                            break;
                        } else {
                            ((ba20) da20Var).success(null);
                            q501.q();
                            return;
                        }
                    case 1451470794:
                        if (!str.equals("openFallbackCall")) {
                            break;
                        } else {
                            tzt tztVar = z;
                            if (tztVar == null) {
                                ((ba20) da20Var).error("CALLBACK_NOT_PROVIDED", "openFallbackCall is not provider", null);
                                return;
                            } else {
                                tztVar.invoke();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                        }
                    case 1451477188:
                        if (!str.equals("openFallbackChat")) {
                            break;
                        } else {
                            ((ba20) da20Var).error("CALLBACK_NOT_PROVIDED", "openFallbackChat is not provider", null);
                            return;
                        }
                    case 1482682185:
                        if (!str.equals("cancelIncomingCallNotification")) {
                            break;
                        } else {
                            ll7 ll7Var4 = D;
                            if (ll7Var4 == null) {
                                ll7Var4 = null;
                            }
                            ll7Var4.a.cancel(228);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    case 1583425604:
                        if (!str.equals("showStatusBar")) {
                            break;
                        } else {
                            String jSONObject2 = new JSONObject((Map) obj).toString();
                            rbx rbxVar2 = sbx.d;
                            rbxVar2.getClass();
                            i9s0 i9s0Var = (i9s0) rbxVar2.b(i9s0.Companion.serializer(), jSONObject2);
                            q6c0 q6c0Var2 = C;
                            if (q6c0Var2 == null) {
                                q6c0Var2 = null;
                            }
                            q6c0Var2.T(i9s0Var);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                }
            }
            ((ba20) da20Var).notImplemented();
        } catch (Throwable th) {
            if (th instanceof NotImplementedError) {
                ((ba20) da20Var).notImplemented();
            } else {
                ((ba20) da20Var).error(th.toString(), null, null);
            }
        }
    }
}
