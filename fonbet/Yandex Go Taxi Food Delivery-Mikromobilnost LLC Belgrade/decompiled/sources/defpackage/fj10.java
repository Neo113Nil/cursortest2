package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.messaging.internal.view.chat.input.a;

/* loaded from: classes15.dex */
public final class fj10 extends BottomSheetBehavior.a {
    public final /* synthetic */ a a;

    public fj10(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            ai91.c(this.a.x, false);
        }
    }
}
