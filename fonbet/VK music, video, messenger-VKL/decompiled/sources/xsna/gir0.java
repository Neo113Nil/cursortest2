package xsna;

import xsna.nju;

/* compiled from: Vector.kt */
/* loaded from: classes11.dex */
public abstract class gir0 {
    public izs<? super gir0, s3q0> a;

    public abstract void a(oio oioVar);

    public izs<gir0, s3q0> b() {
        return this.a;
    }

    public final void c() {
        izs<gir0, s3q0> b = b();
        if (b != null) {
            b.invoke(this);
        }
    }

    public void d(nju.a aVar) {
        this.a = aVar;
    }
}
