package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.messaging.views.bottomsheet.a;
import com.yandex.messaging.views.bottomsheet.b;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class gg6 extends BottomSheetBehavior.a {
    public final /* synthetic */ a a;

    public gg6(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        a aVar = this.a;
        BottomSheetBehavior bottomSheetBehavior = aVar.e;
        LinkedList linkedList = aVar.d;
        if (i == 4 && aVar.l) {
            aVar.l = false;
            aVar.c.dismiss();
        }
        if (i == 6) {
            bottomSheetBehavior.W(4);
        }
        if (i == 3) {
            if (!((b) linkedList.getLast()).k().c) {
                bottomSheetBehavior.W(4);
                return;
            }
            aVar.l = true;
            if (linkedList.size() >= 2) {
                bottomSheetBehavior.V(bottomSheetBehavior.G() + (((b) linkedList.get(linkedList.size() - 2)).k().a - ((b) linkedList.get(linkedList.size() - 1)).k().a), false);
            }
        }
    }
}
