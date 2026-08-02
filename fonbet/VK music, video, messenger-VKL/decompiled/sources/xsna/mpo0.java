package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ThemeHelperMediator.kt */
/* loaded from: classes2.dex */
public final class mpo0 implements ipo0 {
    public final ArrayList a = new ArrayList();
    public LinkedHashMap b = new LinkedHashMap();
    public boolean c;

    @Override // xsna.ipo0
    public final boolean a() {
        return this.c;
    }

    @Override // xsna.ipo0
    public final void b(qtr0 qtr0Var) {
        this.a.add(qtr0Var);
    }

    @Override // xsna.ipo0
    public final void c(qtr0 qtr0Var) {
        this.a.remove(qtr0Var);
    }

    @Override // xsna.ipo0
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.b.get(str);
        return str2 == null ? "" : str2;
    }
}
