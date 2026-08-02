package xsna;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lbc implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior.L(findViewById).X(3);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = -1;
            findViewById.setLayoutParams(layoutParams);
        }
    }
}
