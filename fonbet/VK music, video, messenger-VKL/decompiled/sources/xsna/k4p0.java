package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.core.tips.Tooltip;
import com.vkontakte.android.R;
import xsna.ebv0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k4p0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4p0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById;
        switch (this.b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = ((Tooltip) this.c).d;
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                    break;
                }
                break;
            default:
                ebv0 ebv0Var = (ebv0) this.c;
                com.google.android.material.bottomsheet.b bVar = dialogInterface instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialogInterface : null;
                if (bVar != null && (findViewById = bVar.findViewById(R.id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior.L(findViewById).D(ebv0Var.new c());
                    ((com.google.android.material.bottomsheet.b) dialogInterface).setOnDismissListener(new o6m0(ebv0Var, 2));
                    break;
                }
                break;
        }
    }
}
