package xsna;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes.dex */
public final class mc implements uuj {
    public final float a;

    public mc(float f) {
        this.a = f;
    }

    @Override // xsna.uuj
    public final float a(@NonNull RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc) && this.a == ((mc) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
