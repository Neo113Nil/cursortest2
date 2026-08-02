package xsna;

import androidx.activity.ComponentActivity;

/* compiled from: TemplatesKeyboardFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class ck3 {
    public final ComponentActivity a;
    public final xla b;
    public final b9o0 c;
    public final int d;

    public ck3(int i, ComponentActivity componentActivity, xla xlaVar, b9o0 b9o0Var) {
        this.a = componentActivity;
        this.b = xlaVar;
        this.c = b9o0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck3)) {
            return false;
        }
        ck3 ck3Var = (ck3) obj;
        return epx.f(this.a, ck3Var.a) && this.b.equals(ck3Var.b) && this.c.equals(ck3Var.c) && this.d == ck3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArgumentsWrapper(owner=");
        sb.append(this.a);
        sb.append(", handler=");
        sb.append(this.b);
        sb.append(", args=");
        sb.append(this.c);
        sb.append(", maxHeight=");
        return vu5.b(sb, this.d, ')');
    }
}
