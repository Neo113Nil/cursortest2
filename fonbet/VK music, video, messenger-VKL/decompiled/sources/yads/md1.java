package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import xsna.xq8;

/* loaded from: classes10.dex */
public final class md1 {
    public final fd1 a;
    public final ul2 b;
    public final si1 c;
    public final ni1 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public md1(fd1 fd1Var, ul2 ul2Var, si1 si1Var, ni1 ni1Var) {
        this.a = fd1Var;
        this.b = ul2Var;
        this.c = si1Var;
        this.d = ni1Var;
        fd1Var.a(ul2Var);
    }

    public final void a(Activity activity) {
        this.c.a();
        this.d.a(new xq8(10, this, activity));
    }

    public static final void a(md1 md1Var, Activity activity) {
        if (!md1Var.e.getAndSet(true)) {
            Throwable a = Result.a(md1Var.a.a(activity));
            if (a != null) {
                md1Var.b.a(new n7(String.valueOf(a.getMessage())));
                return;
            }
            return;
        }
        md1Var.b.a(o7.a);
    }
}
