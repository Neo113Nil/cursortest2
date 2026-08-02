package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class dvc {
    public final Drawable a;
    public final Integer b;
    public final String c;

    public dvc(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.a = drawable;
        this.b = Integer.valueOf(i);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dvc)) {
            return false;
        }
        dvc dvcVar = (dvc) obj;
        return jl40.l(this.b, dvcVar.b) && jl40.l(this.c, dvcVar.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.c;
        return intValue + (str != null ? str.hashCode() : 0);
    }

    public dvc(String str, Drawable drawable) {
        this.a = drawable;
        this.c = str;
        this.b = null;
    }
}
