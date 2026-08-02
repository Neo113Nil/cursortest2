package xsna;

/* compiled from: MarketMultiPickerItemAdapter.kt */
/* loaded from: classes18.dex */
public final class h810 implements g530 {
    public final /* synthetic */ i810 b;

    public h810(i810 i810Var) {
        this.b = i810Var;
    }

    @Override // xsna.g530
    public final void H2() {
        i810 i810Var = this.b;
        int i = 0;
        for (Object obj : i810Var.h) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if ((hfzVar instanceof g810) && ((g810) hfzVar).e.e.b) {
                i810Var.notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // xsna.g530
    public final void g3() {
        i0q0.j(new vq3(this, 7));
    }
}
