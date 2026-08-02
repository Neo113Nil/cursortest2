package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;

/* compiled from: MentionsController.kt */
/* loaded from: classes2.dex */
public final class p420 extends VkBottomSheetBehavior.a {
    public final /* synthetic */ o420 a;

    public p420(o420 o420Var) {
        this.a = o420Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
    public final void j(int i, View view) {
        if (i == 5) {
            o420 o420Var = this.a;
            o420Var.g = false;
            o420Var.e();
        }
    }
}
