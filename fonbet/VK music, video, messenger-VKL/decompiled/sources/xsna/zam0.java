package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: StoryReactionItem.kt */
/* loaded from: classes6.dex */
public final class zam0 {
    public final int a;
    public final Drawable b;
    public final String c;
    public final String d;
    public final String e;

    public zam0(int i, Drawable drawable, String str, String str2, String str3) {
        this.a = i;
        this.b = drawable;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zam0)) {
            return false;
        }
        zam0 zam0Var = (zam0) obj;
        return this.a == zam0Var.a && this.b.equals(zam0Var.b) && this.c.equals(zam0Var.c) && this.d.equals(zam0Var.d) && this.e.equals(zam0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryReactionItem(id=");
        sb.append(this.a);
        sb.append(", drawable=");
        sb.append(this.b);
        sb.append(", reactionJson=");
        sb.append(this.c);
        sb.append(", mainReactionJson=");
        sb.append(this.d);
        sb.append(", analyticsDescription=");
        return ho8.a(sb, this.e, ')');
    }
}
