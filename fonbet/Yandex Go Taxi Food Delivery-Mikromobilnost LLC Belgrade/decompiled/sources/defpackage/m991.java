package defpackage;

import android.app.Activity;
import android.util.Log;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.c;

/* loaded from: classes11.dex */
public abstract class m991 {
    public static final z3k a = new z3k(6);

    public static final void a(sls slsVar, sej sejVar, a aVar, fid fidVar, int i) {
        int i2;
        sej sejVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1121440774);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            sej sejVar3 = new sej(3);
            Object m = btsVar.m(AndroidCompositionLocals_androidKt.b);
            boolean z = (m instanceof Activity ? (Activity) m : null) != null;
            if (!z) {
                jgz jgzVar = jgz.a;
                jgz.c(new IllegalStateException("Dialog requires activity context. Can't open."));
            }
            if (z) {
                btsVar.e0(1708708462);
                c.a(slsVar, sejVar3, aVar, btsVar, i3 & 1022, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(1708794952);
                btsVar.t(false);
            }
            sejVar2 = sejVar3;
        } else {
            btsVar.Y();
            sejVar2 = sejVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(slsVar, sejVar2, aVar, i, 21);
        }
    }

    public static final void b(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
