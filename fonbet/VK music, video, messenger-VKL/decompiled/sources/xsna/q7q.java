package xsna;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: ExpandBottomSheetOnShowListener.java */
/* loaded from: classes3.dex */
public final class q7q implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R$id.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior.L(frameLayout).X(3);
        }
    }
}
