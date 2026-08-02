package xsna;

import java.util.ArrayList;

/* compiled from: DateIntervalHelpersFactory.kt */
/* loaded from: classes7.dex */
public final class rxk {
    public final g7h0 a;
    public final sxk b;
    public final ArrayList c;

    public rxk(g7h0 g7h0Var, sxk sxkVar) {
        this.a = g7h0Var;
        this.b = sxkVar;
        sxkVar.prepare();
        txk txkVar = new txk(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pxk(this, txkVar));
        arrayList.add(new qxk(this, txkVar));
        arrayList.add(new oxk(this, txkVar));
        arrayList.add(new nxk(this, txkVar));
        arrayList.add(new mxk(this, txkVar));
        this.c = arrayList;
    }
}
