package defpackage;

import android.app.PendingIntent;

/* loaded from: classes10.dex */
public final class fl6 {
    public final String a;
    public final PendingIntent b;
    public final Runnable c;

    public fl6(Runnable runnable, String str) {
        this.a = str;
        this.b = null;
        this.c = runnable;
    }

    public fl6(String str, PendingIntent pendingIntent) {
        this.a = str;
        this.b = pendingIntent;
    }
}
