package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kby extends of8 {
    public final ArrayList a;

    public kby(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        if (this.a.contains(Integer.valueOf(((pk8) nf8Var).a.length()))) {
            return null;
        }
        return up8.b;
    }
}
