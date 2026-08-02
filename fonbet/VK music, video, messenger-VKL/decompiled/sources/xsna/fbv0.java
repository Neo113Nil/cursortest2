package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: VkPayCheckoutBottomSheet.kt */
/* loaded from: classes6.dex */
public final class fbv0 extends BottomSheetBehavior.d {
    public boolean a;
    public final /* synthetic */ WeakReference<DialogInterface> b;

    public fbv0(WeakReference<DialogInterface> weakReference, ebv0 ebv0Var) {
        this.b = weakReference;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            DialogInterface dialogInterface = this.b.get();
            if (dialogInterface != null) {
                dialogInterface.cancel();
                return;
            }
            return;
        }
        if (i != 3 || this.a) {
            return;
        }
        this.a = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
    }
}
