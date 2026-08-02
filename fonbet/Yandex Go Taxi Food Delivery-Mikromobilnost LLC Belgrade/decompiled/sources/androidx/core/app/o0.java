package androidx.core.app;

import android.app.Notification;
import defpackage.oyr;

/* loaded from: classes10.dex */
public final class o0 implements r0 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public o0(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return oyr.t(sb, this.c, "]");
    }
}
