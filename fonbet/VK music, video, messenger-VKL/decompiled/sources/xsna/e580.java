package xsna;

import java.util.Collection;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class e580 extends a1s {
    public final int b;
    public final Collection<Long> c;
    public final Collection<Long> d;
    public final boolean e;

    public e580(int i, Collection<Long> collection, Collection<Long> collection2, boolean z) {
        this.b = i;
        this.c = collection;
        this.d = collection2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e580)) {
            return false;
        }
        e580 e580Var = (e580) obj;
        return this.b == e580Var.b && epx.f(this.c, e580Var.c) && epx.f(this.d, e580Var.d) && this.e == e580Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + s3j0.a(s3j0.a(Integer.hashCode(this.b) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderEdited(id: "), this.b, ')');
    }
}
