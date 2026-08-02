package defpackage;

import android.app.Activity;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.messaging.activity.MessengerActivityBase;

/* loaded from: classes15.dex */
public final class j40 extends b {
    public final Activity e;

    public j40(MessengerActivityBase messengerActivityBase) {
        super(messengerActivityBase);
        this.e = messengerActivityBase;
    }

    @Override // com.yandex.alicekit.core.permissions.b
    public final void h(int i, String[] strArr) {
        androidx.core.app.b.J(this.e, strArr, i);
    }
}
