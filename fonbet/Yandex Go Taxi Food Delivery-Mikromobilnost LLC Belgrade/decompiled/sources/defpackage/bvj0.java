package defpackage;

/* loaded from: classes4.dex */
public class bvj0 extends o2 implements y1 {
    private a2 value;

    public bvj0(w2 w2Var) {
        this.value = w2Var;
    }

    public static bvj0 getInstance(Object obj) {
        if (obj instanceof bvj0) {
            return (bvj0) obj;
        }
        if (obj instanceof dqf) {
            return new bvj0((dqf) obj);
        }
        if (!(obj instanceof s3)) {
            return new bvj0(jc51.m(obj));
        }
        s3 s3Var = (s3) obj;
        if (s3Var.c != 1) {
            return new bvj0((w2) w2.b.Hg(s3Var, true));
        }
        xc4 xc4Var = jc51.y;
        return new bvj0(jc51.m((i3) i3.b.Hg(s3Var, true)));
    }

    public byte[] getKeyHash() {
        a2 a2Var = this.value;
        if (a2Var instanceof w2) {
            return ((w2) a2Var).a;
        }
        return null;
    }

    public jc51 getName() {
        a2 a2Var = this.value;
        if (a2Var instanceof w2) {
            return null;
        }
        return jc51.m(a2Var);
    }

    @Override // defpackage.a2
    public b3 toASN1Primitive() {
        a2 a2Var = this.value;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        if (a2Var instanceof w2) {
            return new oqf(z, 2, a2Var, 0);
        }
        return new oqf(c2 == true ? 1 : 0, c == true ? 1 : 0, a2Var, 0);
    }

    public bvj0(jc51 jc51Var) {
        this.value = jc51Var;
    }

    public static bvj0 getInstance(s3 s3Var, boolean z) {
        if (z) {
            return getInstance(s3Var.y());
        }
        ny61.g("choice item must be explicitly tagged");
        return null;
    }
}
