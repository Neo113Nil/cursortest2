package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class j0a0 extends m0a0 {
    public final Drawable a;

    public j0a0(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.m0a0
    public final Drawable a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j0a0.class == obj.getClass();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
