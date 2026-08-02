package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* loaded from: classes10.dex */
public class fyv {
    public final InputConfiguration a;

    public fyv(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fyv)) {
            return false;
        }
        return Objects.equals(this.a, ((fyv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
