package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes10.dex */
public final class fy80 {
    public final OutputConfiguration a;
    public long b = 1;

    public fy80(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fy80)) {
            return false;
        }
        fy80 fy80Var = (fy80) obj;
        return this.a.equals(fy80Var.a) && this.b == fy80Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((hashCode << 5) - hashCode);
    }
}
