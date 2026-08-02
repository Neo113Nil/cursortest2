package xsna;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes.dex */
public final class xsf0 implements uuj {
    public final float a;

    public xsf0(float f) {
        this.a = f;
    }

    @Override // xsna.uuj
    public final float a(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsf0) && this.a == ((xsf0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
