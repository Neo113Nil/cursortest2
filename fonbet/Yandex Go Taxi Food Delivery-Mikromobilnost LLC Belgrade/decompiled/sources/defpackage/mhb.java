package defpackage;

/* loaded from: classes3.dex */
public final class mhb extends ohb {
    public final Throwable a;
    public final Integer b;

    public mhb(Throwable th, Integer num, int i) {
        th = (i & 1) != 0 ? null : th;
        num = (i & 2) != 0 ? null : num;
        this.a = th;
        this.b = num;
    }

    @Override // defpackage.ohb
    public final Throwable c() {
        return this.a;
    }

    public mhb() {
        this(null, null, 3);
    }
}
