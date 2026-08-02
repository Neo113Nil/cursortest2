package xsna;

import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import xsna.nke0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mke0 implements wzs {
    public final /* synthetic */ nke0 b;
    public final /* synthetic */ nke0.a c;
    public final /* synthetic */ akq d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Boolean f;

    public /* synthetic */ mke0(nke0 nke0Var, nke0.a aVar, akq akqVar, boolean z, Boolean bool) {
        this.b = nke0Var;
        this.c = aVar;
        this.d = akqVar;
        this.e = z;
        this.f = bool;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        nke0 nke0Var = this.b;
        nke0.a aVar = this.c;
        akq akqVar = this.d;
        boolean z = this.e;
        Boolean bool = this.f;
        if (((Throwable) obj2) == null) {
            ohp0 ohp0Var = nke0Var.d;
            if (ohp0Var != null) {
                el3 el3Var = Event.b;
                Event.a aVar2 = new Event.a();
                aVar2.f();
                aVar2.g("push_subscribe_completed");
                aVar2.b("attempt", Integer.valueOf(nke0Var.e));
                ohp0Var.k(aVar2.e());
            }
            try {
                nke0Var.j = Boolean.valueOf(zqn0.a.f());
                ((ebl) ((uev0) nke0Var).m.getValue()).b(aVar);
                x870.b(nke0Var.c, 6);
                ((yjq) nke0Var.b.getValue()).c();
                nke0Var.i = false;
                z4g.d().getClass();
                L.p("PushSubscriberNew", "Subscribed");
            } catch (Throwable th) {
                ohp0 ohp0Var2 = nke0Var.d;
                if (ohp0Var2 != null) {
                    ohp0Var2.a(th);
                }
                throw th;
            }
        } else {
            ohp0 ohp0Var3 = nke0Var.d;
            if (ohp0Var3 != null) {
                el3 el3Var2 = Event.b;
                Event.a aVar3 = new Event.a();
                aVar3.f();
                aVar3.g("push_subscribe_error");
                aVar3.b("attempt", Integer.valueOf(nke0Var.e));
                ohp0Var3.k(aVar3.e());
            }
            if (((yjq) nke0Var.b.getValue()).a()) {
                ((yjq) nke0Var.b.getValue()).b(akqVar);
                nke0Var.f.dispose();
            } else {
                nke0Var.h(z, false, bool);
            }
        }
        return s3q0.a;
    }
}
