package xsna;

import android.content.DialogInterface;
import com.vk.auth.ui.fastlogin.VkFastLoginView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4g0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ y4g0(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        gzs gzsVar = this.c;
        switch (i2) {
            case 0:
                int i3 = a5g0.k1;
                gzsVar.invoke();
                break;
            default:
                int i4 = VkFastLoginView.v;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
