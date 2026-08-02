package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class pzg extends vzg {
    public final Uri a;

    public pzg(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzg) && jl40.l(this.a, ((pzg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MailTo(url=" + this.a + ')';
    }
}
