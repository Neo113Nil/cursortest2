package xsna;

/* compiled from: VkCompositeActionButtonView.kt */
/* loaded from: classes18.dex */
public final class omu0 {
    public final tlo0 a;

    public omu0(tlo0 tlo0Var) {
        this.a = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omu0) && epx.f(this.a, ((omu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bt.a(new StringBuilder("Title(title="), this.a, ')');
    }
}
