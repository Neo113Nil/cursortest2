package xsna;

/* compiled from: TemplateDetailsAction.kt */
/* loaded from: classes3.dex */
public final class i8o0 implements com.vk.messagetemplates.impl.details.a {
    public final int b;

    public i8o0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8o0) && this.b == ((i8o0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Template(id="), this.b, ')');
    }
}
