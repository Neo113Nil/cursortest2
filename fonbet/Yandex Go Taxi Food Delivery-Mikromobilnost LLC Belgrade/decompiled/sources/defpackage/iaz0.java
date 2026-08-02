package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public class iaz0 {
    public final ArrayList a = new ArrayList();
    public final laz0 b = new laz0(this);

    public static class a implements haz0 {
        @Override // defpackage.haz0
        public final void a(daz0 daz0Var) {
            daz0Var.b(this);
        }

        public final boolean equals(Object obj) {
            return getClass().isInstance(obj);
        }
    }

    public final void a(haz0 haz0Var) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            arrayList.add(haz0Var);
        } else {
            ((haz0) unr0.k(1, arrayList)).a(new gaz0(this, haz0Var));
        }
    }
}
