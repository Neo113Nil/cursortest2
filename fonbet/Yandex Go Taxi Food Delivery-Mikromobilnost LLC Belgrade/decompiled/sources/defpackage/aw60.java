package defpackage;

import java.util.Map;

/* loaded from: classes10.dex */
public final class aw60 implements vuu {
    public final wuu a = new wuu();
    public final xf7 b;
    public cj01 c;
    public za7 w;

    public aw60(xf7 xf7Var) {
        this.b = xf7Var;
    }

    @Override // defpackage.ipg
    public final kpg createDataSource() {
        bw60 bw60Var = new bw60(this.b, this.w, this.a);
        cj01 cj01Var = this.c;
        if (cj01Var != null) {
            bw60Var.addTransferListener(cj01Var);
        }
        return bw60Var;
    }

    @Override // defpackage.vuu
    public final vuu setDefaultRequestProperties(Map map) {
        this.a.b(map);
        return this;
    }

    @Override // defpackage.vuu, defpackage.ipg
    public final xuu createDataSource() {
        bw60 bw60Var = new bw60(this.b, this.w, this.a);
        cj01 cj01Var = this.c;
        if (cj01Var != null) {
            bw60Var.addTransferListener(cj01Var);
        }
        return bw60Var;
    }
}
