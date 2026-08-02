package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.voip.ui.settings.CallParticipantsFragment;

/* compiled from: CallParticipantsFragment.kt */
/* loaded from: classes7.dex */
public final class k89 extends BottomSheetBehavior.d {
    public final /* synthetic */ CallParticipantsFragment a;

    public k89(CallParticipantsFragment callParticipantsFragment) {
        this.a = callParticipantsFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            this.a.tn();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
