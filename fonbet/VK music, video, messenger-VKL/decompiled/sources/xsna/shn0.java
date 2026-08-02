package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;

/* compiled from: SuperappVkPayCheckoutAnalytics.kt */
/* loaded from: classes6.dex */
public final class shn0 {
    public final uen0 a;

    public shn0(uen0 uen0Var) {
        this.a = uen0Var;
    }

    public final void a(SchemeStatSak$TypeVkPayCheckoutItem.EventType eventType) {
        uen0 uen0Var = this.a;
        String str = uen0Var.a;
        Integer num = uen0Var.b;
        String str2 = uen0Var.c;
        Integer b = uen0Var.e.b();
        String a = this.a.e.a();
        SchemeStatSak$TypeVkPayCheckoutItem schemeStatSak$TypeVkPayCheckoutItem = new SchemeStatSak$TypeVkPayCheckoutItem(eventType, str, this.a.g.getMethodsCount(), this.a.g.a(), num, "", "", null, this.a.f.a(), this.a.f.b(), str2, b, a, this.a.d.get());
        jbv0 jbv0Var = new jbv0(true);
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.VK_PAY_CHECKOUT;
        SchemeStatSak$TypeAction a2 = SchemeStatSak$TypeAction.a.a(schemeStatSak$TypeVkPayCheckoutItem);
        jbv0Var.f = schemeStatSak$EventScreen;
        jbv0Var.g = a2;
        jbv0Var.c = true;
        jbv0Var.q();
    }
}
