package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class gj2 implements fj2 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gj2(ArrayList arrayList) {
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nh2 nh2Var = (nh2) it.next();
            nh2Var.getClass();
            Pair pair = new Pair("GenericAnimation", nh2Var.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) ((LinkedHashMap) obj).get(str);
                if (slsVar != null) {
                    return (KSerializer) slsVar.invoke();
                }
                return null;
            default:
                return ((mjd) obj).decoder(str);
        }
    }

    public gj2(mjd mjdVar) {
        this.b = mjdVar;
    }
}
