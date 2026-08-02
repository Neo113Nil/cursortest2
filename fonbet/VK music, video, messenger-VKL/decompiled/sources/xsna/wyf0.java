package xsna;

import androidx.annotation.Nullable;

/* compiled from: RendererConfiguration.java */
/* loaded from: classes12.dex */
public final class wyf0 {
    public static final wyf0 c = new wyf0(0, false);
    public final int a;
    public final boolean b;

    public wyf0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wyf0.class != obj.getClass()) {
            return false;
        }
        wyf0 wyf0Var = (wyf0) obj;
        return this.a == wyf0Var.a && this.b == wyf0Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
