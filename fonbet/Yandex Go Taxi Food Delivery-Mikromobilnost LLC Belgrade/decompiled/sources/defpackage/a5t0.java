package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La5t0;", "", "Companion", "y4t0", "z4t0", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a5t0 {
    public static final z4t0 Companion = new z4t0();
    public final int a;
    public final boolean b;

    public /* synthetic */ a5t0(int i, int i2, boolean z) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = this.a == 0;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a5t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a5t0 a5t0Var = (a5t0) obj;
        return this.a == a5t0Var.a && this.b == a5t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a * 31);
    }

    public a5t0() {
        this(0);
    }

    public a5t0(int i) {
        this.a = 0;
        this.b = true;
    }
}
