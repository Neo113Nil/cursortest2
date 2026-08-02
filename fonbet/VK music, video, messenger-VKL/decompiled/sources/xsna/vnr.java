package xsna;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* compiled from: FlagSet.java */
/* loaded from: classes12.dex */
public final class vnr {
    public final SparseBooleanArray a;

    /* compiled from: FlagSet.java */
    public static final class a {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        public final void a(int i) {
            fxc0.z(!this.b);
            this.a.append(i, true);
        }

        public final vnr b() {
            fxc0.z(!this.b);
            this.b = true;
            return new vnr(this.a);
        }
    }

    public vnr(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vnr) {
            return this.a.equals(((vnr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
