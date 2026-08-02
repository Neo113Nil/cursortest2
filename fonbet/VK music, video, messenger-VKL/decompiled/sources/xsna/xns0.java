package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.util.Map;

/* compiled from: VideoGroupNotification.kt */
/* loaded from: classes5.dex */
public final class xns0 extends ri6 {
    public final Context c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;
    public final String i;

    public xns0(Context context, String str, String str2, int i, String str3) {
        super(context);
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = 16;
        this.i = str3;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ri6
    public final Notification a() {
        NotificationCompat.h hVar = new NotificationCompat.h(this.c, this.d);
        hVar.I.icon = this.f;
        hVar.r = this.g;
        hVar.F = 2;
        hVar.s = true;
        hVar.u = this.e;
        hVar.n(16, true);
        hVar.I.deleteIntent = (PendingIntent) this.b.getValue();
        return hVar.c();
    }

    @Override // xsna.ri6
    public final String c() {
        return this.d;
    }

    @Override // xsna.ri6
    public final Map<String, String> d() {
        return null;
    }

    @Override // xsna.ri6
    public final int e() {
        return this.h;
    }

    @Override // xsna.ri6
    public final String f() {
        return this.i;
    }
}
