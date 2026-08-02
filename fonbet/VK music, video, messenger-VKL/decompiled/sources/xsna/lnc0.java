package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class lnc0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ enc0 a;

    public lnc0(enc0 enc0Var) {
        this.a = enc0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        if (i == 5) {
            this.a.U.invoke(PostingAction.Mentions.CloseMentionBottomSheet.b);
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }
}
