package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes7.dex */
public final class je71 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final hh71 a() {
        if (this.b) {
            ny61.k();
            return null;
        }
        this.b = true;
        return new hh71(this.a);
    }

    public final void b(int i) {
        if (this.b) {
            ny61.k();
        } else {
            this.a.append(i, true);
        }
    }
}
