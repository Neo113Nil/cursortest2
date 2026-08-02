package xsna;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes12.dex */
public final class hv6 implements ggz {
    public final ggz b;
    public int c = 0;
    public int d = -1;
    public int e = -1;
    public Object f = null;

    public hv6(@NonNull ggz ggzVar) {
        this.b = ggzVar;
    }

    public final void a() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        ggz ggzVar = this.b;
        if (i == 1) {
            ggzVar.onInserted(this.d, this.e);
        } else if (i == 2) {
            ggzVar.onRemoved(this.d, this.e);
        } else if (i == 3) {
            ggzVar.onChanged(this.d, this.e, this.f);
        }
        this.f = null;
        this.c = 0;
    }

    @Override // xsna.ggz
    @SuppressLint({"UnknownNullness"})
    public final void onChanged(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.c == 3 && i <= (i4 = this.e + (i3 = this.d)) && (i5 = i + i2) >= i3 && this.f == obj) {
            this.d = Math.min(i, i3);
            this.e = Math.max(i4, i5) - this.d;
            return;
        }
        a();
        this.d = i;
        this.e = i2;
        this.f = obj;
        this.c = 3;
    }

    @Override // xsna.ggz
    public final void onInserted(int i, int i2) {
        int i3;
        if (this.c == 1 && i >= (i3 = this.d)) {
            int i4 = this.e;
            if (i <= i3 + i4) {
                this.e = i4 + i2;
                this.d = Math.min(i, i3);
                return;
            }
        }
        a();
        this.d = i;
        this.e = i2;
        this.c = 1;
    }

    @Override // xsna.ggz
    public final void onMoved(int i, int i2) {
        a();
        this.b.onMoved(i, i2);
    }

    @Override // xsna.ggz
    public final void onRemoved(int i, int i2) {
        int i3;
        if (this.c == 2 && (i3 = this.d) >= i && i3 <= i + i2) {
            this.e += i2;
            this.d = i;
        } else {
            a();
            this.d = i;
            this.e = i2;
            this.c = 2;
        }
    }
}
