package xsna;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: Label.java */
/* loaded from: classes12.dex */
public final class zky {

    @Nullable
    public final String a;
    public final String b;

    static {
        y2r0.L(0);
        y2r0.L(1);
    }

    public zky(@Nullable String str, String str2) {
        this.a = y2r0.T(str);
        this.b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zky.class == obj.getClass()) {
            zky zkyVar = (zky) obj;
            if (Objects.equals(this.a, zkyVar.a) && Objects.equals(this.b, zkyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
