package androidx.core.app;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes10.dex */
public final class q {
    public final Bundle a;
    public IconCompat b;
    public final z0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public q(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, z0[] z0VarArr, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if ((i == -1 ? ((Icon) iconCompat.b).getType() : i) == 2) {
                this.f = iconCompat.e();
            }
        }
        this.g = v.d(charSequence);
        this.h = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = z0VarArr;
        this.d = z;
        this.e = z2;
    }

    public q(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d("", null, i) : null, charSequence, pendingIntent, new Bundle(), null, true, true);
    }
}
