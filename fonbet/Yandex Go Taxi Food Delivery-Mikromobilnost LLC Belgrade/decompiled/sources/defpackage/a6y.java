package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a6y {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ c6y c;

    public a6y(c6y c6yVar, int i) {
        this.c = c6yVar;
        this.a = i;
    }

    public final void a(int i) {
        c6y c6yVar = this.c;
        kzo kzoVar = c6yVar.c;
        if (kzoVar == null) {
            return;
        }
        this.b.add(new pne0(kzoVar, i, c6yVar.b, null));
    }
}
