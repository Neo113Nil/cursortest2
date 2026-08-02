package xsna;

import android.graphics.PorterDuff;

/* compiled from: BubbleColorParamsProvider.kt */
/* loaded from: classes2.dex */
public final class xbl implements hl8 {
    @Override // xsna.hl8
    public final PorterDuff.Mode a() {
        return PorterDuff.Mode.SRC_IN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return xbl.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return xbl.class.hashCode();
    }

    public final String toString() {
        return "DefaultBubbleColorParamsProvider";
    }
}
