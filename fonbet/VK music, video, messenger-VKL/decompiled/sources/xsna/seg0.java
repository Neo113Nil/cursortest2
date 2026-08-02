package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.uic;

/* compiled from: Retained.kt */
/* loaded from: classes3.dex */
public final class seg0<Instance extends uic> extends nyt0 {
    public String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public static void i(LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            uic uicVar = (uic) ((Map.Entry) it.next()).getValue();
            if (uicVar != null) {
                uicVar.clear();
            }
        }
    }

    @Override // xsna.nyt0
    public final void h() {
        i(this.c);
        i(this.d);
    }
}
