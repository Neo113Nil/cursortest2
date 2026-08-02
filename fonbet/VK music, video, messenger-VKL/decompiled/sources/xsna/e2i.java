package xsna;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: CommunityShortcutArgs.kt */
/* loaded from: classes5.dex */
public final class e2i {
    public final long a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final Uri e;

    public e2i(long j, String str, String str2, Bitmap bitmap, Uri uri) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = bitmap;
        this.e = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2i)) {
            return false;
        }
        e2i e2iVar = (e2i) obj;
        return this.a == e2iVar.a && epx.f(this.b, e2iVar.b) && epx.f(this.c, e2iVar.c) && epx.f(this.d, e2iVar.d) && epx.f(this.e, e2iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityShortcutArgs(userId=");
        sb.append(this.a);
        sb.append(", shortcutId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", uri=");
        return alb0.b(sb, this.e, ')');
    }
}
