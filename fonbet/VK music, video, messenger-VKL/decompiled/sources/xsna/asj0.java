package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;

/* compiled from: SimplePostingCreateBottomSheet.kt */
/* loaded from: classes4.dex */
public final class asj0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ com.vk.newsfeed.impl.items.posting.item.modals.d a;

    public asj0(com.vk.newsfeed.impl.items.posting.item.modals.d dVar) {
        this.a = dVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        utk0 utk0Var = this.a.f;
        Boolean valueOf = Boolean.valueOf(i == 3);
        utk0Var.getClass();
        utk0Var.i(null, valueOf);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }
}
