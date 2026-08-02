package defpackage;

import ru.yandex.taxi.design.NotificationItemComponent;

/* loaded from: classes9.dex */
public final class axx0 implements sj60 {
    public final /* synthetic */ bxx0 a;

    public axx0(bxx0 bxx0Var) {
        this.a = bxx0Var;
    }

    @Override // defpackage.sj60
    public final void a(NotificationItemComponent notificationItemComponent) {
        bxx0 bxx0Var = this.a;
        bxx0Var.b.add(notificationItemComponent.getId());
        qv10.B(!r0.isEmpty(), bxx0Var.a, null);
    }

    @Override // defpackage.sj60
    public final void b(NotificationItemComponent notificationItemComponent, boolean z) {
        bxx0 bxx0Var = this.a;
        bxx0Var.b.remove(notificationItemComponent.getId());
        qv10.B(!r2.isEmpty(), bxx0Var.a, null);
    }
}
