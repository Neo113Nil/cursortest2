package yads;

import android.util.SparseBooleanArray;

/* loaded from: classes10.dex */
public final class dw0 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final dw0 a(int i) {
        if (this.b) {
            throw new IllegalStateException();
        }
        this.a.append(i, true);
        return this;
    }

    public final ew0 a() {
        if (!this.b) {
            this.b = true;
            return new ew0(this.a);
        }
        throw new IllegalStateException();
    }
}
