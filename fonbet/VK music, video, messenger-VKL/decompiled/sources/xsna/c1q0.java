package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: UiTrackingDialog.kt */
/* loaded from: classes17.dex */
public class c1q0 extends Dialog {
    public final xyp0 b;

    public c1q0(int i, Context context, boolean z) {
        super(context, i);
        this.b = new xyp0(new b1q0(), z);
        super.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.z0q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                c1q0.this.b.d();
            }
        });
        super.setOnDismissListener(new v56(this, 1));
    }

    public void Y() {
        dismiss();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(new smh(1, this, onDismissListener));
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(final DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.a1q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                c1q0.this.b.d();
                DialogInterface.OnShowListener onShowListener2 = onShowListener;
                if (onShowListener2 != null) {
                    onShowListener2.onShow(dialogInterface);
                }
            }
        });
    }
}
