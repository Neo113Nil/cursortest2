package xsna;

import android.content.DialogInterface;
import xsna.lr40;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gpd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gpd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                jpd jpdVar = (jpd) obj;
                if (!jpdVar.F) {
                    jpdVar.p();
                    break;
                } else {
                    jpdVar.q(false);
                    break;
                }
            default:
                rt40 rt40Var = (rt40) obj;
                tzp0.c.a aVar = rt40.s1;
                lr40.a aVar2 = new lr40.a(false, false);
                rt40Var.getClass();
                xn50.a.c(rt40Var, aVar2);
                break;
        }
    }
}
