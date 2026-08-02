package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w9y0 implements dhz0 {
    public final String a;

    public w9y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || w9y0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((w9y0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
