package xsna;

import android.net.Uri;

/* compiled from: SelectedImageItem.kt */
/* loaded from: classes17.dex */
public final class uai0 {
    public final int a;
    public final Uri b;

    public uai0(int i, Uri uri) {
        this.a = i;
        this.b = uri;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uai0)) {
            return false;
        }
        uai0 uai0Var = (uai0) obj;
        return this.a == uai0Var.a && epx.f(this.b, uai0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedImageItem(id=");
        sb.append(this.a);
        sb.append(", imageSource=");
        return alb0.b(sb, this.b, ')');
    }
}
