package defpackage;

import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.YbPushSubscribeConditionsConfig;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scheduleride.deeplink.ScheduleRideNext;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes9.dex */
public final class lnm0 {
    public final h3y a;
    public final h3y b;

    public /* synthetic */ lnm0(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    public boolean a() {
        SessionEntity$Action sessionEntity$Action = ((gff) this.a.get()).b;
        if (sessionEntity$Action == null) {
            return false;
        }
        b bVar = (b) this.b.get();
        bVar.getClass();
        return aab1.e(sessionEntity$Action, ((YbPushSubscribeConditionsConfig) bVar.d(au51.a).getData()).getActions());
    }

    public Object b(inm0 inm0Var, ContinuationImpl continuationImpl) {
        Object obj;
        pzt0 b;
        knm0 knm0Var = ScheduleRideNext.Companion;
        String a = inm0Var.a();
        if (a == null) {
            a = "";
        }
        knm0Var.getClass();
        Iterator<E> it = ScheduleRideNext.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ScheduleRideNext) obj).getTitle(), a)) {
                break;
            }
        }
        ScheduleRideNext scheduleRideNext = (ScheduleRideNext) obj;
        if (scheduleRideNext == null) {
            scheduleRideNext = ScheduleRideNext.UNKNOWN;
        }
        if (scheduleRideNext != ScheduleRideNext.UNKNOWN) {
            ((zwm) this.a.get()).a.e = scheduleRideNext;
        }
        String b2 = inm0Var.b();
        return (b2 == null || evu0.J(b2) || (b = ((c4r0) this.b.get()).b(SelectionOrigin.DEEPLINK, b2, "", false)) == null) ? zy11.a : b.u0(continuationImpl);
    }
}
