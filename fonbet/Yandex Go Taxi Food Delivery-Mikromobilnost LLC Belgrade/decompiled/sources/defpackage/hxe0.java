package defpackage;

import com.caverock.androidsvg.PreserveAspectRatio$Alignment;
import com.caverock.androidsvg.PreserveAspectRatio$Scale;

/* loaded from: classes10.dex */
public final class hxe0 {
    public static final hxe0 c = new hxe0(PreserveAspectRatio$Alignment.none, null);
    public static final hxe0 d = new hxe0(PreserveAspectRatio$Alignment.xMidYMid, PreserveAspectRatio$Scale.meet);
    public final PreserveAspectRatio$Alignment a;
    public final PreserveAspectRatio$Scale b;

    public hxe0(PreserveAspectRatio$Alignment preserveAspectRatio$Alignment, PreserveAspectRatio$Scale preserveAspectRatio$Scale) {
        this.a = preserveAspectRatio$Alignment;
        this.b = preserveAspectRatio$Scale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hxe0.class != obj.getClass()) {
            return false;
        }
        hxe0 hxe0Var = (hxe0) obj;
        return this.a == hxe0Var.a && this.b == hxe0Var.b;
    }

    public final String toString() {
        return this.a + " " + this.b;
    }
}
