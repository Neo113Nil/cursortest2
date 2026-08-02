package xsna;

import com.vk.dto.specials.SpecialEvent;

/* compiled from: SpecialEventsNavigationDelegate.kt */
/* loaded from: classes.dex */
public final class ojk0 implements a780 {
    public final /* synthetic */ pjk0 b;

    public ojk0(pjk0 pjk0Var) {
        this.b = pjk0Var;
    }

    @Override // xsna.a780
    public final void a() {
        SpecialEvent.Popup e;
        pjk0 pjk0Var = this.b;
        SpecialEvent specialEvent = pjk0Var.h;
        if (specialEvent == null || (e = specialEvent.e()) == null) {
            return;
        }
        u1u0.f(e.d(), pjk0Var.p);
    }

    @Override // xsna.a780
    public final void onSuccess() {
        SpecialEvent.Popup e;
        SpecialEvent.Animation d;
        pjk0 pjk0Var = this.b;
        SpecialEvent specialEvent = pjk0Var.h;
        if (specialEvent != null && (d = specialEvent.d()) != null) {
            u1u0.f(d.d(), pjk0Var.m);
        }
        if (specialEvent == null || (e = specialEvent.e()) == null) {
            return;
        }
        u1u0.f(e.d(), pjk0Var.p);
    }
}
