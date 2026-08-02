package xsna;

import android.view.View;
import com.vk.core.view.components.cell.right.VkCellRight;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pt00 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ pt00(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(view);
                break;
            default:
                int i2 = VkCellRight.z;
                izsVar.invoke(view);
                break;
        }
    }
}
