package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import xsna.vzi0;

/* compiled from: SettingChangeSideEffect.kt */
/* loaded from: classes5.dex */
public final class wzi0 {
    public static final SpinnerState a(vzi0 vzi0Var) {
        if (vzi0Var.equals(vzi0.a.a)) {
            return SpinnerState.Error;
        }
        if (vzi0Var.equals(vzi0.b.a)) {
            return null;
        }
        if (vzi0Var.equals(vzi0.c.a)) {
            return SpinnerState.Done;
        }
        if (vzi0Var.equals(vzi0.d.a)) {
            return SpinnerState.Loading;
        }
        throw new NoWhenBranchMatchedException();
    }
}
