package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class ce2 extends po {
    public static final int w = (int) TimeUnit.SECONDS.toMillis(10);

    public ce2(Context context, String str, oo ooVar) {
        super(context, str, ooVar);
        a(context);
        l();
        m();
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        return new wq2(g92Var, x11.a(g92Var));
    }

    public final void a(Context context) {
        int i;
        Integer num;
        Integer num2;
        qu2 a = gx2.a().a(context);
        if (a != null && (num2 = a.x0) != null) {
            i = num2.intValue();
        } else {
            i = w;
        }
        qu2 a2 = gx2.a().a(context);
        this.o = new qe0(1.0f, i, (a2 == null || (num = a2.N) == null) ? 0 : num.intValue());
    }
}
