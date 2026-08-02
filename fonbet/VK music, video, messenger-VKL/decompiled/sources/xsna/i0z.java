package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ams0;
import xsna.u8f0;

/* compiled from: LegacyCatalogFocusStrategy.kt */
/* loaded from: classes6.dex */
public final class i0z implements ams0 {
    @Override // xsna.ams0
    public final ams0.a a(u8f0 u8f0Var, ArrayList arrayList, LinkedHashMap linkedHashMap, iht0 iht0Var) {
        Map.Entry entry;
        jht0 jht0Var;
        if (!(u8f0Var instanceof u8f0.b)) {
            if (u8f0Var instanceof u8f0.a) {
                return ams0.a.b.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iht0Var != null && (jht0Var = (jht0) linkedHashMap.get(iht0Var)) != null) {
            l0z l0zVar = jht0Var instanceof l0z ? (l0z) jht0Var : null;
            if (l0zVar != null && l0zVar.d) {
                return ams0.a.b.a;
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
            jht0 jht0Var2 = (jht0) entry.getValue();
            l0z l0zVar2 = jht0Var2 instanceof l0z ? (l0z) jht0Var2 : null;
            if (l0zVar2 == null || !l0zVar2.d) {
                entry = null;
            }
            if (entry != null) {
                break;
            }
        }
        if (entry == null) {
            return iht0Var == null ? ams0.a.b.a : new ams0.a.C2550a(new bms0(iht0Var, null, false, "Legacy Focus (No Focus)"));
        }
        iht0 iht0Var2 = (iht0) entry.getKey();
        jht0 jht0Var3 = (jht0) entry.getValue();
        jht0 jht0Var4 = (jht0) linkedHashMap.get(iht0Var);
        return new ams0.a.C2550a(new bms0(iht0Var, iht0Var2, epx.f(jht0Var4 != null ? jht0Var4.a() : null, jht0Var3.a()), "Legacy Focus"));
    }
}
