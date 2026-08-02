package xsna;

import androidx.compose.ui.window.SecureFlagPolicy;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class gxb0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public gxb0(boolean z, boolean z2, int i) {
        this((i & 1) == 0, (i & 4) != 0 ? true : z, SecureFlagPolicy.Inherit, (i & 8) != 0 ? true : z2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxb0)) {
            return false;
        }
        gxb0 gxb0Var = (gxb0) obj;
        return this.a == gxb0Var.a && this.b == gxb0Var.b && this.c == gxb0Var.c && this.d == gxb0Var.d && this.e == gxb0Var.e && this.f == gxb0Var.f && this.g == gxb0Var.g;
    }

    public final int hashCode() {
        return (qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + this.g) * 31;
    }

    public gxb0(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        this(z, true, secureFlagPolicy, z2, false);
    }

    public gxb0(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        pqo pqoVar = nb2.a;
        int i = !z ? 262152 : SQLiteDatabase.OPEN_PRIVATECACHE;
        i = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i | 8192 : i;
        i = z3 ? i : i | 512;
        boolean z5 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.a = i;
        this.b = z5;
        this.c = true;
        this.d = z2;
        this.e = true;
        this.f = z4;
        this.g = 1002;
    }
}
