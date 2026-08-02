package defpackage;

import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public abstract class mha1 extends r8 {
    public boolean c;

    public mha1(g gVar) {
        super(gVar);
        ((g) this.b).T++;
    }

    public abstract boolean Hg();

    public final void Ig() {
        if (this.c) {
            return;
        }
        ny61.r("Not initialized");
    }

    public final void Jg() {
        if (this.c) {
            ny61.r("Can't initialize twice");
        } else {
            if (Hg()) {
                return;
            }
            ((g) this.b).V.incrementAndGet();
            this.c = true;
        }
    }
}
