package defpackage;

import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.List;

/* loaded from: classes9.dex */
public final class f5f0 {
    public final g5f0 a;

    public f5f0(g5f0 g5f0Var) {
        this.a = g5f0Var;
    }

    public final DeeplinkAction a() {
        g5f0 g5f0Var = this.a;
        return ((List) g5f0Var.a.getValue()).size() > 1 ? new DeeplinkAction.ProTopupMethodsBottomSheet((List) g5f0Var.a.getValue()) : new DeeplinkAction.Topup(null, false, null, null, false, null, false, false, null, null, null, 2047, null);
    }
}
