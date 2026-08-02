package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sy5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sy5(UserId userId, JSONObject jSONObject) {
        this.b = 5;
        this.c = userId;
        this.d = jSONObject;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((wy5) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                vu7 vu7Var = (vu7) this.c;
                z37 z37Var = (z37) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1434904264, intValue, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreen.<anonymous>.<anonymous> (BookingRecordCompletedScreen.kt:90)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(z37Var, 9);
                        aVar.R(x);
                    }
                    fu7.b(vu7Var, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                vol.a((jdo0) this.c, (vco0) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                trp0.b((mtk0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                q2q0.a(ne7.I(49), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            default:
                UserId userId = (UserId) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                ((com.vk.voip.b) obj).f(com.vk.voip.ui.c.b);
                com.vk.voip.ui.c.J().g(userId);
                ((gzs) obj2).invoke();
                ysw yswVar = (ysw) com.vk.voip.ui.c.G0.getValue();
                yswVar.getClass();
                String optString = jSONObject.optString("call_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("caller_info");
                UserId userId2 = optJSONObject != null ? new UserId(optJSONObject.optLong("user_id")) : null;
                L.p("IncomingPushLogger", go9.b("messages.callReceived run callId=", optString));
                String s = yswVar.b.s(userId);
                io.reactivex.rxjava3.kotlin.c.d(new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.v(new slf(yswVar, 2)).q(asu0.a.c()), new bo(21), null), new q40(new com.vk.voip.ui.push.c(yswVar, optString, userId2, jSONObject, s), 21)), new xr4(optString, 1), new alb(optString, s, 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sy5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ sy5(vu7 vu7Var, z37 z37Var) {
        this.b = 1;
        this.c = vu7Var;
        this.d = z37Var;
    }
}
