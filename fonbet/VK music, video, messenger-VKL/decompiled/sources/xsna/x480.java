package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class x480 extends a1s {
    public final String b;
    public final Throwable c;

    public x480(String str, Throwable th) {
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x480)) {
            return false;
        }
        x480 x480Var = (x480) obj;
        return epx.f(this.b, x480Var.b) && epx.f(this.c, x480Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Throwable th = this.c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogsFolderCreationFailed ");
        Throwable th = this.c;
        sb.append(th != null ? th.toString() : null);
        return sb.toString();
    }
}
