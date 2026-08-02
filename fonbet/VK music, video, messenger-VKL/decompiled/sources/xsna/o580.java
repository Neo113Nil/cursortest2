package xsna;

import android.util.ArraySet;

/* compiled from: DialogsListLoaderUpdate.kt */
/* loaded from: classes18.dex */
public final class o580 implements zsm {
    public final ArraySet a;

    public o580(ArraySet arraySet) {
        this.a = arraySet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o580) && this.a.equals(((o580) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnDialogsUpdate(ids=" + this.a + ')';
    }
}
