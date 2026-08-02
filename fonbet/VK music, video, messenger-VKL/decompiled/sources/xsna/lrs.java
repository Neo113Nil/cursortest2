package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FriendsOnboardingDelegate.kt */
/* loaded from: classes16.dex */
public final class lrs implements czt0 {
    public final q7v0 a;
    public final s77 b;
    public final Object c;

    public lrs(q7v0 q7v0Var, s77 s77Var) {
        this.a = q7v0Var;
        this.b = s77Var;
        if (!q7v0Var.isReady()) {
            q7v0Var.init();
        }
        this.c = msy.a(LazyThreadSafetyMode.NONE, new y3i(this, 10));
    }

    @Override // xsna.czt0
    public final void a(View view, UIBlock uIBlock) {
        boolean f;
        if (uIBlock instanceof UIBlockHeader) {
            UIBlockActionOpenScreen uIBlockActionOpenScreen = ((UIBlockHeader) uIBlock).I;
            f = epx.f(uIBlockActionOpenScreen != null ? uIBlockActionOpenScreen.A : null, "myfollowers");
        } else {
            f = false;
        }
        if (f) {
            this.a.c(new k4(7, this, view));
        }
    }
}
