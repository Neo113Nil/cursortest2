package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import xsna.aqe0;

/* compiled from: QuestionnaireBottomSheet.kt */
/* loaded from: classes16.dex */
public final class bqe0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ aqe0.a a;

    public bqe0(aqe0.a aVar) {
        this.a = aVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        if (i == 5) {
            this.a.d.invoke(Boolean.TRUE);
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }
}
