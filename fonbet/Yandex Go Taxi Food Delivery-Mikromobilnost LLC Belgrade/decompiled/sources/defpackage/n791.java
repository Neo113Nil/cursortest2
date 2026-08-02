package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class n791 {
    public final ArrayList a = new ArrayList();

    public abstract r691 a(String str, cr71 cr71Var, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(cwa1.i(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
