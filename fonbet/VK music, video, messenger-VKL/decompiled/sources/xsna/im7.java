package xsna;

import android.widget.CompoundButton;
import xsna.vl7;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class im7 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ im7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        mcy<Object> mcyVar;
        switch (this.b) {
            case 0:
                km7 km7Var = (km7) this.c;
                vl7.b bVar = km7Var.p;
                if (bVar != null) {
                    jbc<hfz> jbcVar = km7Var.l;
                    km7Var.getAdapterPosition();
                    jbcVar.a(bVar);
                    break;
                }
                break;
            case 1:
                ((r79) this.c).q(new xcw0.z(z));
                break;
            default:
                wif0 wif0Var = (wif0) this.c;
                if (z && (mcyVar = wif0Var.n) != null) {
                    mcyVar.set(wif0Var.m);
                    break;
                }
                break;
        }
    }
}
