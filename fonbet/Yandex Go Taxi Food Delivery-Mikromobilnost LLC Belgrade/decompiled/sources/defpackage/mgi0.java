package defpackage;

/* loaded from: classes4.dex */
public final class mgi0 extends o2 implements y1 {
    public o2 a;

    public mgi0(p0x p0xVar) {
        this.a = p0xVar;
    }

    public static mgi0 n(a2 a2Var) {
        if (a2Var == null || (a2Var instanceof mgi0)) {
            return (mgi0) a2Var;
        }
        if (a2Var instanceof p0x) {
            return new mgi0((p0x) a2Var);
        }
        if (a2Var instanceof w2) {
            mgi0 mgi0Var = new mgi0();
            mgi0Var.a = new oqf(2, 128, 0, (w2) a2Var, 0);
            return mgi0Var;
        }
        if (!(a2Var instanceof b3)) {
            ny61.g("Illegal object in RecipientIdentifier: ".concat(a2Var.getClass().getName()));
            return null;
        }
        mgi0 mgi0Var2 = new mgi0();
        mgi0Var2.a = (b3) a2Var;
        return mgi0Var2;
    }

    public final o2 m() {
        o2 o2Var = this.a;
        if (!(o2Var instanceof s3)) {
            return p0x.m(o2Var);
        }
        return (w2) w2.b.Hg((s3) o2Var, false);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a.toASN1Primitive();
    }
}
