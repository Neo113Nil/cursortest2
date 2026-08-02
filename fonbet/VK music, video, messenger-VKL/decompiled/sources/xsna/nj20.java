package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj20 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nj20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                oj20 oj20Var = (oj20) this.c;
                com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogInterface;
                View findViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    bVar.o().X(3);
                    oj20Var.Ln(findViewById);
                    break;
                }
                break;
            default:
                ((prq0) this.c).invoke();
                break;
        }
    }
}
