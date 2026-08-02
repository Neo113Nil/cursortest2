package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import xsna.cut0;

/* compiled from: ColorSource.kt */
@vby
/* loaded from: classes.dex */
public final class x7g implements cut0 {
    public final int a;

    public /* synthetic */ x7g(int i) {
        this.a = i;
    }

    @Override // xsna.cut0
    public final int b(Context context) {
        return cut0.a.a(this, context);
    }

    @Override // xsna.cut0
    public final ColorStateList c(Context context) {
        return cut0.a.b(this, context);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x7g) {
            return this.a == ((x7g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("ColorSourceAttr(attr=", this.a, ')');
    }
}
