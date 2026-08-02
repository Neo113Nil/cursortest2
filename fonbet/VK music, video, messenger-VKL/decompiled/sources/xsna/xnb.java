package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import xsna.dob;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xnb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xnb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                xn50.a.c((ynb) this.c, new wmb.e(((dob.c) this.d).b));
                break;
            case 1:
                pcc0 pcc0Var = (pcc0) this.c;
                pcc0Var.e.c((Attachment) this.d);
                break;
            default:
                t0f0 t0f0Var = (t0f0) this.c;
                t0f0Var.e.invoke((k0f0) this.d);
                break;
        }
    }
}
