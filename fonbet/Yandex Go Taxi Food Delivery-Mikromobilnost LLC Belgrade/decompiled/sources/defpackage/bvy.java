package defpackage;

import androidx.lifecycle.v;

/* loaded from: classes10.dex */
public abstract class bvy {
    public final pq60 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ v w;

    public bvy(v vVar, pq60 pq60Var) {
        this.w = vVar;
        this.a = pq60Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        v vVar = this.w;
        int i2 = vVar.c;
        vVar.c = i + i2;
        if (!vVar.d) {
            vVar.d = true;
            while (true) {
                try {
                    int i3 = vVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        vVar.h();
                    } else if (z3) {
                        vVar.i();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    vVar.d = false;
                    throw th;
                }
            }
            vVar.d = false;
        }
        if (this.b) {
            vVar.c(this);
        }
    }

    public void b() {
    }

    public boolean c(pey peyVar) {
        return false;
    }

    public abstract boolean d();
}
