package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class j8e {
    public final Uri a;
    public final boolean b;

    public j8e(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j8e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j8e j8eVar = (j8e) obj;
        return this.a.equals(j8eVar.a) && this.b == j8eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
