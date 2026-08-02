package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.util.Map;

/* compiled from: BusinessNotifyGroupNotification.kt */
/* loaded from: classes5.dex */
public final class qo8 extends ri6 {
    public final Context c;
    public final int d;
    public final String e;
    public final int f;

    public qo8(Context context, int i, String str) {
        super(context);
        this.c = context;
        this.d = i;
        this.e = str;
        this.f = 12;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ri6
    public final Notification a() {
        g2v.c().getClass();
        String str = this.e;
        Context context = this.c;
        NotificationCompat.h hVar = new NotificationCompat.h(context, str);
        hVar.e = NotificationCompat.h.d(context.getString(R.string.messages));
        hVar.f = NotificationCompat.h.d(enj.f(R.plurals.notification_business_notify_unread, this.d, context));
        hVar.I.icon = R.drawable.vk_icon_message_24;
        hVar.w = context.getColor(R.color.vk_blue_400);
        hVar.r = "business_notify_group";
        hVar.F = 2;
        hVar.s = true;
        hVar.u = NotificationCompat.CATEGORY_MESSAGE;
        hVar.n(16, true);
        hVar.I.deleteIntent = (PendingIntent) this.b.getValue();
        return hVar.c();
    }

    @Override // xsna.ri6
    public final String c() {
        return this.e;
    }

    @Override // xsna.ri6
    public final Map<String, String> d() {
        return null;
    }

    @Override // xsna.ri6
    public final int e() {
        return this.f;
    }

    @Override // xsna.ri6
    public final String f() {
        return null;
    }
}
