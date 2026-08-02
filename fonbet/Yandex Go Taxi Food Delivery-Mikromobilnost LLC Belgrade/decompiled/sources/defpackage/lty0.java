package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.messaging.internal.view.chat.input.textsuggest.a;

/* loaded from: classes15.dex */
public final class lty0 extends BottomSheetBehavior.a {
    public final /* synthetic */ a a;

    public lty0(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        a aVar = this.a;
        if (i == 5) {
            aVar.r();
        }
        aVar.C = Integer.valueOf(i);
    }
}
