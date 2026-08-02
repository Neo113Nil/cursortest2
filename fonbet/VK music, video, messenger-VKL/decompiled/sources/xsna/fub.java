package xsna;

import com.vk.dto.live.LiveEventModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fub implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ fub(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((LiveEventModel) obj).m == this.c);
            default:
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, new y7p0(mol0Var.c.a, Integer.valueOf(this.c)), null, null, null, null, null, 253);
        }
    }
}
