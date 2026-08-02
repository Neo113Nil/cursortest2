package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public abstract class ist0 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final gxg a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        fwi fwiVar = (fwi) btsVar.m(j.h);
        boolean b = btsVar.b(fwiVar.getDensity());
        Object Q = btsVar.Q();
        if (b || Q == did.a) {
            Q = new hxg(new wor0(fwiVar));
            btsVar.o0(Q);
        }
        return (gxg) Q;
    }
}
