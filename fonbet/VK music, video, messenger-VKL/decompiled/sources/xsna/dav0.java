package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.core.ui.modal.VkModal;
import xsna.eav0;
import xsna.k7x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dav0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dav0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                eav0.a aVar = (eav0.a) this.c;
                eav0 eav0Var = (eav0) this.d;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.e;
                if (aVar == null || !aVar.a) {
                    eav0Var.b.a(null);
                } else {
                    eav0Var.b.a(Boolean.valueOf(appCompatCheckBox.isChecked()));
                }
                dw20 dw20Var = eav0Var.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            default:
                k7x0.a aVar2 = (k7x0.a) this.c;
                aVar2.c.invoke((VkModal) this.d, (Context) this.e);
                break;
        }
    }
}
