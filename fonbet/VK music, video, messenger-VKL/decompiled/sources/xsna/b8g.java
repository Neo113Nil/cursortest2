package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import xsna.cut0;

/* compiled from: ColorSource.kt */
@vby
/* loaded from: classes17.dex */
public final class b8g implements ipi, cut0 {
    public final int a;

    public /* synthetic */ b8g(int i) {
        this.a = i;
    }

    public static final /* synthetic */ b8g d(int i) {
        return new b8g(i);
    }

    @Override // xsna.ipi
    public final long a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-566167544);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-566167544, i, -1, "com.vk.core.view.model.ColorSourceValue.asComposeColor (ColorSource.kt:89)");
        }
        long c = f870.c(this.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c;
    }

    @Override // xsna.cut0
    public final int b(Context context) {
        return cut0.a.a(this, context);
    }

    @Override // xsna.cut0
    public final ColorStateList c(Context context) {
        return cut0.a.b(this, context);
    }

    public final /* synthetic */ int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b8g) {
            return this.a == ((b8g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("ColorSourceValue(color=", this.a, ')');
    }
}
