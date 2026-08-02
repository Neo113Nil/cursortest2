package xsna;

import android.view.View;
import com.vk.core.view.components.formitem.VkTextArea;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qf10 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qf10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                o99 o99Var = (o99) obj;
                xzp0 xzp0Var = ((rf10) obj2).m;
                if (xzp0Var != null) {
                    o99Var.invoke(xzp0Var);
                    break;
                }
                break;
            default:
                int i2 = VkTextArea.r;
                ((VkTextArea.c) obj2).getClass();
                ((VkTextArea) obj).i.getText().clear();
                break;
        }
    }
}
