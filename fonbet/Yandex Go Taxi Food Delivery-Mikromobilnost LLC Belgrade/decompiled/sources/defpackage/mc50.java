package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class mc50 implements h3v {
    public g3v a;
    public final ArrayList b = new ArrayList();

    public final void a(t2v... t2vVarArr) {
        g3v g3vVar = this.a;
        if (g3vVar != null) {
            ((o3) g3vVar).n(t2vVarArr);
        } else {
            this.b.add(t2vVarArr);
        }
    }
}
