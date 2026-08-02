package yads;

import android.content.Context;
import java.util.List;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class al3 {
    public final qi3 a;

    public al3(Context context) {
        this.a = new qi3(context);
    }

    public final void a(zk3 zk3Var, String str) {
        List list = (List) zk3Var.a().get(str);
        if (list != null) {
            this.a.a(list, jgp.b);
        }
    }
}
