package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class kxb implements xre {
    public final float a;

    public kxb(float f) {
        this.a = f;
    }

    @Override // defpackage.xre
    public final float a(RectF rectF) {
        return sb2.j(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxb) && this.a == ((kxb) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
