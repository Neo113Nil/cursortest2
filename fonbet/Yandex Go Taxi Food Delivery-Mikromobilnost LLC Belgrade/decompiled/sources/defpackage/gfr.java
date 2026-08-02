package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes10.dex */
public final class gfr {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final void a(int i) {
        d6z.x(!this.b);
        this.a.append(i, true);
    }

    public final hfr b() {
        d6z.x(!this.b);
        this.b = true;
        return new hfr(this.a);
    }
}
