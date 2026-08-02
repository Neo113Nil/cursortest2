package defpackage;

/* loaded from: classes4.dex */
public final class mr60 extends o2 {
    public i3 a;

    public mr60(nr60[] nr60VarArr) {
        this.a = new jqf(nr60VarArr);
    }

    public final nr60[] m() {
        i3 i3Var = this.a;
        int size = i3Var.size();
        nr60[] nr60VarArr = new nr60[size];
        for (int i = 0; i < size; i++) {
            nr60VarArr[i] = nr60.m(i3Var.A(i));
        }
        return nr60VarArr;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new jqf(this.a);
    }
}
