package defpackage;

import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;

/* loaded from: classes8.dex */
public final /* synthetic */ class owj0 implements v941 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ owj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v941
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ResponsivenessTracker responsivenessTracker = (ResponsivenessTracker) obj;
                kdh kdhVar = responsivenessTracker.e;
                if (!responsivenessTracker.c) {
                    responsivenessTracker.h = false;
                    responsivenessTracker.i.clear();
                    pwj0.a.removeFrameCallback(responsivenessTracker.f);
                    responsivenessTracker.g = false;
                }
                Long a = kdhVar.a();
                if (a != null) {
                    responsivenessTracker.a.a(a.longValue(), kdhVar.a, "");
                    break;
                }
                break;
            default:
                TimeToInteractiveTracker timeToInteractiveTracker = (TimeToInteractiveTracker) obj;
                timeToInteractiveTracker.g = new lwa0(timeToInteractiveTracker.j);
                timeToInteractiveTracker.b.a(null);
                zu20 zu20Var = timeToInteractiveTracker.a;
                lwa0 lwa0Var = timeToInteractiveTracker.g;
                long j = timeToInteractiveTracker.k;
                ev20 ev20Var = zu20Var.b;
                ev20Var.a("TimeToInteractive", lwa0Var.a - ev20Var.b().a, "", ev20Var.m);
                ev20Var.a("TotalBlockingTime", j, "", ev20Var.l);
                ev20Var.g.stop();
                ev20Var.p.d().a();
                break;
        }
    }
}
