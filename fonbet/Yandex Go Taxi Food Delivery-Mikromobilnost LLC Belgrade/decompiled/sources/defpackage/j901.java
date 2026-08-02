package defpackage;

import com.yandex.mapkit.traffic.TrafficLevel;
import com.yandex.mapkit.traffic.TrafficListener;
import com.yandex.payment.common.result.ResultType;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes7.dex */
public final class j901 implements TrafficListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j901(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficChanged(TrafficLevel trafficLevel) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((k901) obj).c(new zgz0(18, trafficLevel));
                break;
            default:
                r0 r0Var = ((m901) obj).c;
                if (trafficLevel != null) {
                    o901 o901Var = new o901(trafficLevel.getColor(), trafficLevel.getLevel());
                    r0Var.getClass();
                    r0Var.m(null, o901Var);
                    break;
                } else {
                    r0Var.getClass();
                    r0Var.m(null, q901.a);
                    break;
                }
        }
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficExpired() {
        yeo yeoVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k901 k901Var = (k901) obj;
                try {
                    Map e = gw00.e(new Pair("type", "expired"));
                    if (!(e instanceof zy11) && (yeoVar = k901Var.b) != null) {
                        yeoVar.success(e);
                        break;
                    }
                } catch (Throwable th) {
                    yeo yeoVar2 = k901Var.b;
                    if (yeoVar2 != null) {
                        yeoVar2.error(k901.class.getSimpleName(), ljo.b(th), null);
                        return;
                    }
                    return;
                }
                break;
            default:
                r0 r0Var = ((m901) obj).c;
                r0Var.getClass();
                r0Var.m(null, q901.a);
                break;
        }
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficLoading() {
        yeo yeoVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k901 k901Var = (k901) obj;
                try {
                    Map e = gw00.e(new Pair("type", ResultType.RESULT_TYPE_LOADING));
                    if (!(e instanceof zy11) && (yeoVar = k901Var.b) != null) {
                        yeoVar.success(e);
                        break;
                    }
                } catch (Throwable th) {
                    yeo yeoVar2 = k901Var.b;
                    if (yeoVar2 != null) {
                        yeoVar2.error(k901.class.getSimpleName(), ljo.b(th), null);
                        return;
                    }
                    return;
                }
                break;
            default:
                r0 r0Var = ((m901) obj).c;
                r0Var.getClass();
                r0Var.m(null, p901.a);
                break;
        }
    }
}
