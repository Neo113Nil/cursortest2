package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class osi0 implements xre {
    public final float a;

    public osi0(float f) {
        this.a = f;
    }

    public static osi0 b(RectF rectF, xre xreVar) {
        return xreVar instanceof osi0 ? (osi0) xreVar : new osi0(xreVar.a(rectF) / Math.min(rectF.width(), rectF.height()));
    }

    @Override // defpackage.xre
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osi0) && this.a == ((osi0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return oyr.m((int) (this.a * 100.0f), "%", new StringBuilder());
    }
}
