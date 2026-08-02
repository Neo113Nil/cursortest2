package xsna;

import java.io.File;

/* compiled from: CoverChooseEvent.kt */
/* loaded from: classes7.dex */
public final class j0k implements m0k {
    public final File a;

    public j0k(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0k) && epx.f(this.a, ((j0k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoverSaved(cover=" + this.a + ')';
    }
}
