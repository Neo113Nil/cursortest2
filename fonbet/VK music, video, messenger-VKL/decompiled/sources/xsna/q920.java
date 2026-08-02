package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.util.Map;

/* compiled from: MessageGroupNotification.kt */
/* loaded from: classes5.dex */
public final class q920 extends ri6 {
    public final Context c;
    public final int d;
    public final String e;
    public final boolean f;
    public final Long g;
    public final String h;
    public final nuv i;
    public final int j;
    public final String k;

    public q920(Context context, int i, String str, boolean z, Long l, String str2, nuv nuvVar) {
        super(context);
        this.c = context;
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = l;
        this.h = str2;
        this.i = nuvVar;
        this.j = 3;
        this.k = "group_msg_notification_" + l;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ri6
    public final Notification a() {
        int i;
        String str = this.e;
        Context context = this.c;
        NotificationCompat.h hVar = new NotificationCompat.h(context, str);
        hVar.e = NotificationCompat.h.d(context.getString(R.string.messages));
        Resources resources = context.getResources();
        int i2 = this.d;
        hVar.f = NotificationCompat.h.d(resources.getQuantityString(R.plurals.notification_dialogs_unread, i2, Integer.valueOf(i2)));
        if (((Boolean) this.i.invoke()).booleanValue()) {
            i = R.drawable.vk_icon_new_logo_vk_24;
        } else {
            g2v.c().getClass();
            i = R.drawable.vk_icon_message_24;
        }
        hVar.I.icon = i;
        hVar.w = context.getColor(R.color.vk_blue_400);
        hVar.r = "message_group_group_msg_notification_" + this.g;
        hVar.F = 2;
        hVar.s = true;
        if (this.f) {
            hVar.C(this.h);
        }
        hVar.u = NotificationCompat.CATEGORY_MESSAGE;
        hVar.n(16, true);
        hVar.g = t2i0.a(context, i35.c.e(), g2v.c().b().K(context), 167772160);
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
        return this.j;
    }

    @Override // xsna.ri6
    public final String f() {
        return this.k;
    }
}
