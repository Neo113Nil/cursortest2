package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;

/* loaded from: classes10.dex */
public final class i421 implements ComposeAnimation {
    public static final boolean a;

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (jl40.l(values[i].name(), "UNSUPPORTED")) {
                z = true;
                break;
            }
            i++;
        }
        a = z;
    }

    public i421() {
        ComposeAnimationType composeAnimationType = ComposeAnimationType.UNSUPPORTED;
    }
}
