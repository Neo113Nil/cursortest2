package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class n93 {
    public final za a;
    public final bv b;

    public /* synthetic */ n93(za zaVar) {
        this(zaVar, new bv());
    }

    public final void a(List list, yu yuVar) {
        this.b.a.getClass();
        Map b = xsna.dt.b("{CLICK_DEST}", av.a(yuVar));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                za zaVar = this.a;
                ee2 ee2Var = new ee2(zaVar.c, zaVar.a, zaVar.b, o93.d);
                if (str.length() > 0) {
                    za.d.execute(new ya(str, ee2Var, b));
                }
            }
        }
    }

    public n93(za zaVar, bv bvVar) {
        this.a = zaVar;
        this.b = bvVar;
    }
}
