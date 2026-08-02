package xsna;

import android.content.DialogInterface;
import com.vk.method.selector.impl.MethodSelectorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tcg implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ tcg(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        gzs gzsVar = this.c;
        switch (i2) {
            case 0:
                ((nh3) gzsVar).invoke();
                break;
            default:
                int i3 = MethodSelectorView.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
