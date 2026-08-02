package xsna;

import android.app.PendingIntent;
import android.content.Context;
import com.vk.pushes.notifications.base.a;
import kotlin.Pair;

/* compiled from: SubscriptionNotification.kt */
/* loaded from: classes3.dex */
public final class wym0 extends com.vk.pushes.notifications.base.a {
    public final PendingIntent A;
    public final boolean B;
    public final String x;
    public final int y;
    public final String z;

    /* compiled from: SubscriptionNotification.kt */
    public static final class a extends a.C1751a {
        public a(String str, String str2) {
            super(pn00.k(new Pair("title", str), new Pair("body", str2)));
        }
    }

    public wym0(Context context, a.C1751a c1751a) {
        super(context, c1751a);
        this.x = "subscription_push_channel";
        this.y = 2;
        this.z = "music_subscription";
        this.A = l(k(null, "music_subscription_clicked"));
        this.B = true;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String c() {
        return this.x;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final int e() {
        return this.y;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.z;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return this.A;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean s() {
        return this.B;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean v() {
        return false;
    }
}
