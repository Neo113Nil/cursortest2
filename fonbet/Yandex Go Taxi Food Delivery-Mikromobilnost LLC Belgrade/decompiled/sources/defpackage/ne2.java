package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class ne2 implements ComposeAnimation {
    public static final boolean d;
    public final ztz0 a;
    public final jj2 b;
    public final a c;

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (jl40.l(values[i].name(), "ANIMATE_X_AS_STATE")) {
                z = true;
                break;
            }
            i++;
        }
        d = z;
    }

    public ne2(ztz0 ztz0Var, jj2 jj2Var, a aVar) {
        this.a = ztz0Var;
        this.b = jj2Var;
        this.c = aVar;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATE_X_AS_STATE;
        Object e = aVar.e();
        Object[] enumConstants = e.getClass().getEnumConstants();
        if (enumConstants != null) {
            j73.f0(enumConstants);
        } else {
            Collections.singleton(e);
        }
    }
}
