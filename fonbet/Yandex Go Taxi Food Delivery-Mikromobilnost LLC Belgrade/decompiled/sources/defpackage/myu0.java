package defpackage;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class myu0 {
    public final HashMap a = new HashMap();
    public eys b;
    public int c;

    public final kyu0 a() {
        int i = this.c;
        this.c = i + 1;
        kyu0 kyu0Var = new kyu0(this, i);
        this.a.put(Integer.valueOf(i), kyu0Var);
        return kyu0Var;
    }
}
