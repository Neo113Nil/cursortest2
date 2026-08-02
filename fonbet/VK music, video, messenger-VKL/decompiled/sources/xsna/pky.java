package xsna;

import java.util.Iterator;
import xsna.hml;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class pky implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = (String) obj;
        Iterator it = hml.c.a.iterator();
        while (it.hasNext()) {
            hml.a aVar = (hml.a) it.next();
            str = str != null ? aVar.a().h(str, aVar.b()) : null;
        }
        return str == null ? "" : str;
    }
}
