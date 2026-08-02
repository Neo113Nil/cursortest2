package defpackage;

import androidx.view.j;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public class ke50 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(j jVar) {
        String e = urb1.e(jVar.getClass());
        if (e.length() <= 0) {
            ny61.g("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        j jVar2 = (j) linkedHashMap.get(e);
        if (jl40.l(jVar2, jVar)) {
            return;
        }
        if (jVar2 != null && jVar2.b) {
            xfo.m("Navigator ", jVar, " is replacing an already attached ", jVar2);
        } else if (jVar.b) {
            yci0.n("Navigator ", jVar, " is already attached to another NavController");
        }
    }

    public final j b(String str) {
        if (str.length() <= 0) {
            ny61.g("navigator name cannot be an empty string");
            return null;
        }
        j jVar = (j) this.a.get(str);
        if (jVar != null) {
            return jVar;
        }
        ny61.r(oyr.p("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
