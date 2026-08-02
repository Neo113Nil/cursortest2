package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.d;
import xsna.bdn;
import xsna.hpj;
import xsna.myc0;
import xsna.vhn0;
import xsna.wgl;
import xsna.whn0;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class ji {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile hi b;

    public static void a(Context context, bu1 bu1Var) {
        y10 y10Var = new y10(bu1Var);
        vhn0 a2 = whn0.a();
        bdn bdnVar = bdn.a;
        hpj a3 = zvj.a(d.a.a(a2, wgl.c).plus(y10Var));
        if (a.getAndSet(true)) {
            return;
        }
        myc0.h(a3, null, null, new ii(context, bu1Var, a3, null), 3);
    }
}
