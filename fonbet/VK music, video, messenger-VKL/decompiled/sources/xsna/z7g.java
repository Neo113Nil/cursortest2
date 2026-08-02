package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import xsna.cut0;

/* compiled from: ColorSource.kt */
@vby
/* loaded from: classes17.dex */
public final class z7g implements cut0 {
    public final int a;

    public final /* synthetic */ int a() {
        return this.a;
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
        if (obj instanceof z7g) {
            return this.a == ((z7g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("ColorSourceRes(res=", this.a, ')');
    }
}
