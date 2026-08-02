package yads;

import java.util.List;
import xsna.kq9;
import xsna.lq9;

/* loaded from: classes10.dex */
public final class zh3 implements up2 {
    public final /* synthetic */ kq9 a;

    public zh3(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // yads.up2
    public final void a(ff3 ff3Var) {
        ff3Var.a();
        if (this.a.isActive()) {
            this.a.resumeWith(new wh3(ff3Var));
        }
    }

    @Override // yads.up2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (this.a.isActive()) {
            this.a.resumeWith(new xh3(list));
        }
    }
}
