package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2r implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2r(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                r2r r2rVar = (r2r) this.c;
                dw20 dw20Var = (dw20) this.d;
                a5 a5Var = r2rVar.e;
                if (a5Var != null) {
                    a5Var.invoke(Boolean.TRUE);
                }
                r2rVar.e = null;
                dw20Var.hide();
                break;
            default:
                qcc0 qcc0Var = (qcc0) this.c;
                qcc0Var.r.c((Attachment) this.d);
                break;
        }
    }
}
