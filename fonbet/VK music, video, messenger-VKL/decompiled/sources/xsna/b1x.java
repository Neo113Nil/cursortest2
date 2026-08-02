package xsna;

/* compiled from: RectRulers.kt */
/* loaded from: classes11.dex */
public final class b1x implements iif0 {
    public final iif0[] a;
    public final xor0 b;
    public final ofv c;
    public final xor0 d;
    public final ofv e;

    public b1x(iif0[] iif0VarArr) {
        this.a = iif0VarArr;
        int length = iif0VarArr.length;
        xor0[] xor0VarArr = new xor0[length];
        for (int i = 0; i < length; i++) {
            xor0VarArr[i] = this.a[i].getLeft();
        }
        this.b = new xor0(new vor0(xor0VarArr));
        int length2 = this.a.length;
        ofv[] ofvVarArr = new ofv[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            ofvVarArr[i2] = this.a[i2].getTop();
        }
        this.c = new ofv(new mfv(ofvVarArr));
        int length3 = this.a.length;
        xor0[] xor0VarArr2 = new xor0[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            xor0VarArr2[i3] = this.a[i3].getRight();
        }
        this.d = new xor0(new wor0(xor0VarArr2));
        int length4 = this.a.length;
        ofv[] ofvVarArr2 = new ofv[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            ofvVarArr2[i4] = this.a[i4].getBottom();
        }
        this.e = new ofv(new nfv(ofvVarArr2));
    }

    @Override // xsna.iif0
    public final ofv getBottom() {
        return this.e;
    }

    @Override // xsna.iif0
    public final xor0 getLeft() {
        return this.b;
    }

    @Override // xsna.iif0
    public final xor0 getRight() {
        return this.d;
    }

    @Override // xsna.iif0
    public final ofv getTop() {
        return this.c;
    }

    public final String toString() {
        return rl3.Z(this.a, null, "innermostOf(", ")", null, 57);
    }
}
