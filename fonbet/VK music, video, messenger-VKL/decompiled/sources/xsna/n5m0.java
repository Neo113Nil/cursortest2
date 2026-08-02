package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;

/* compiled from: StoryLinkDelegate.kt */
/* loaded from: classes16.dex */
public final class n5m0 extends ModalBottomSheetBehavior.d {
    public boolean a;
    public final /* synthetic */ m5m0 b;

    public n5m0(m5m0 m5m0Var) {
        this.b = m5m0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        m5m0 m5m0Var = this.b;
        if (i == 3 && !this.a) {
            mhy.j(m5m0Var.getKeyboardFocusView());
            this.a = true;
        } else if (i == 5) {
            mhy.d(m5m0Var);
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }
}
