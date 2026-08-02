package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ddw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ ddw(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ikv0 ikv0Var = (ikv0) obj;
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                ikv0Var.a();
                return s3q0.a;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new g3h0(tf3.b(viewGroup, R.layout.list_money_card_item, viewGroup, false), this.c);
        }
    }
}
