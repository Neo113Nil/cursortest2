package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SlotIdControllerImpl.kt */
/* loaded from: classes3.dex */
public final class q2k0 implements p2k0 {
    public Integer c;
    public final HashMap<Object, o2k0> b = new HashMap<>();
    public String d = "";

    @Override // xsna.o2k0
    public final void G(Integer num) {
        Iterator<Map.Entry<Object, o2k0>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().G(num);
        }
        this.c = num;
    }

    @Override // xsna.p2k0
    public final void M(o2k0 o2k0Var, o2k0 o2k0Var2) {
        this.b.put(o2k0Var, o2k0Var2);
    }

    @Override // xsna.o2k0
    public final Integer a() {
        return this.c;
    }

    @Override // xsna.p2k0
    public final void d(o2k0 o2k0Var) {
        this.b.remove(o2k0Var);
    }

    @Override // xsna.p2k0
    public final void u(String str) {
        this.d = str;
    }

    @Override // xsna.x1i0
    public final String v0() {
        return this.d;
    }
}
