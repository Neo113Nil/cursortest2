package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {
    public Notification B;
    public RemoteViews C;
    public RemoteViews D;
    public RemoteViews E;
    public String F;
    public String G;
    public long H;
    public boolean J;
    public final Notification K;
    public boolean L;
    public Icon M;
    public final ArrayList N;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public String g;
    public PendingIntent h;
    public PendingIntent i;
    public IconCompat j;
    public CharSequence k;
    public int l;
    public int m;
    public boolean o;
    public t.g p;
    public CharSequence q;
    public String r;
    public boolean s;
    public String t;
    public boolean v;
    public boolean w;
    public String x;
    public Bundle y;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean n = true;
    public boolean u = false;
    public int z = 0;
    public int A = 0;
    public int I = 0;

    public v(Context context, String str) {
        Notification notification = new Notification();
        this.K = notification;
        this.a = context;
        this.F = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.m = 0;
        this.N = new ArrayList();
        this.J = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new q(i, str, pendingIntent));
    }

    public final Notification b() {
        return new m0(this).b();
    }

    public final Bundle c() {
        if (this.y == null) {
            this.y = new Bundle();
        }
        return this.y;
    }

    public final void e(CharSequence charSequence) {
        this.f = d(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void g(int i) {
        Notification notification = this.K;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(int i, boolean z) {
        Notification notification = this.K;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void i(Bitmap bitmap) {
        this.j = bitmap == null ? null : IconCompat.b(bitmap);
    }

    public final void j(int i, int i2, int i3) {
        Notification notification = this.K;
        notification.ledARGB = i;
        notification.ledOnMS = i2;
        notification.ledOffMS = i3;
        notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    public final void k(Uri uri) {
        Notification notification = this.K;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = u.a(u.d(u.c(u.b(), 4), 5));
    }

    public final void l(t.g gVar) {
        if (this.p != gVar) {
            this.p = gVar;
            if (gVar != null) {
                gVar.d(this);
            }
        }
    }

    public final void m(CharSequence charSequence) {
        this.K.tickerText = d(charSequence);
    }
}
