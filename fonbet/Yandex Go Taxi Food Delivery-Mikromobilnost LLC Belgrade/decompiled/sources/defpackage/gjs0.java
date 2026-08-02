package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public final class gjs0 implements c6e0 {
    public final hzz a;
    public int b;
    public Bitmap.Config c;

    public gjs0(hzz hzzVar) {
        this.a = hzzVar;
    }

    @Override // defpackage.c6e0
    public final void a() {
        this.a.Kg(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gjs0) {
            gjs0 gjs0Var = (gjs0) obj;
            if (this.b == gjs0Var.b && pw21.b(this.c, gjs0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return hjs0.c(this.b, this.c);
    }
}
