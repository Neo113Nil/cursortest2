package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pl9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ pl9(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                View view = (View) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(view);
                }
                return s3q0.a;
            case 1:
                this.c.invoke((zqe.i) obj);
                return s3q0.a;
            case 2:
                this.c.invoke((rma0) obj);
                return s3q0.a;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new cu9(tf3.b(viewGroup, R.layout.list_money_card_item, viewGroup, false), this.c);
        }
    }
}
