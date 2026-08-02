package defpackage;

/* loaded from: classes15.dex */
public final class kaz0 implements haz0 {
    public final int a;
    public final int b;

    public kaz0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.haz0
    public final void a(daz0 daz0Var) {
        daz0Var.e(this);
    }

    public final boolean equals(Object obj) {
        return kaz0.class.isInstance(obj) && ((jaz0) obj).a == this.a && ((kaz0) obj).b == this.b;
    }
}
