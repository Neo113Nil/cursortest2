package defpackage;

import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.fragment.CopiedNotification;

/* loaded from: classes12.dex */
public final class lim implements sj60 {
    public final /* synthetic */ mim a;

    public lim(mim mimVar) {
        this.a = mimVar;
    }

    @Override // defpackage.sj60
    public final void a(NotificationItemComponent notificationItemComponent) {
        if (notificationItemComponent instanceof CopiedNotification) {
            CopiedNotification copiedNotification = (CopiedNotification) notificationItemComponent;
            if (jl40.l(copiedNotification.getUid(), "driver_full_name_copied")) {
                this.a.g = copiedNotification.getUid();
            }
        }
    }

    @Override // defpackage.sj60
    public final void b(NotificationItemComponent notificationItemComponent, boolean z) {
        mim mimVar = this.a;
        String str = mimVar.g;
        if (str == null) {
            str = "";
        }
        if (str.equals(notificationItemComponent.getUid())) {
            NotificationStackComponent notificationStackComponent = mimVar.b.a;
            if (notificationStackComponent != null) {
                notificationStackComponent.removeListener(this);
            }
            mimVar.g = null;
        }
    }
}
