package xsna;

/* compiled from: FullScreenCommand.kt */
/* loaded from: classes16.dex */
public final class nvf extends uvs {
    public final boolean a = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvf) && this.a == ((nvf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CloseViewCmd(isIgnoreConsume="), this.a, ')');
    }
}
