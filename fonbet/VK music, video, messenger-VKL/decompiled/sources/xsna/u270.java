package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.s270;
import xsna.w270;

/* compiled from: NoMemoryFeature.kt */
/* loaded from: classes3.dex */
public final class u270 extends wk50<z270, v270, s270, x270> {
    public final ezs0 f;
    public final f4z g;

    public u270(ezs0 ezs0Var, y270 y270Var) {
        super(null, y270Var);
        this.f = ezs0Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(v270 v270Var, s270 s270Var) {
        s270 s270Var2 = s270Var;
        boolean equals = s270Var2.equals(s270.a.b);
        f4z f4zVar = this.g;
        if (equals) {
            f4zVar.b(w270.a.a);
        } else {
            if (!s270Var2.equals(s270.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new w270.b(this.f.p()));
        }
    }
}
