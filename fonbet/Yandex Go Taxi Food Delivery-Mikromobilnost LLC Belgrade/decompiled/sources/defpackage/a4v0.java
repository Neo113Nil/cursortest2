package defpackage;

import android.content.Context;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes12.dex */
public final class a4v0 {
    public final Context a;
    public final tj60 b;

    public a4v0(tj60 tj60Var, Context context) {
        this.a = context;
        this.b = tj60Var;
    }

    public final void a(String str) {
        LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
        x3z x3zVar = new x3z();
        x3zVar.d = str;
        x3zVar.a = str;
        x3zVar.c = f1h0.ic_success_change;
        localNotificationItemComponent.init(x3zVar.a());
        localNotificationItemComponent.setExpiresListener(new qn5(13, this, localNotificationItemComponent));
        this.b.d(localNotificationItemComponent);
    }
}
