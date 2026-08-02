package defpackage;

import androidx.camera.core.j;

/* loaded from: classes10.dex */
public final class dmp implements fmp {
    public final j a;

    public dmp(j jVar) {
        this.a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmp) && this.a.equals(((dmp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.a + ')';
    }
}
