package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class reo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ reo(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                return s3q0.a;
            case 1:
                gzsVar.invoke();
                return s3q0.a;
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new wbv0(tf3.b(viewGroup, R.layout.list_money_card_item, viewGroup, false), gzsVar);
            default:
                int i2 = yhi0.f1;
                gzsVar.invoke();
                return s3q0.a;
        }
    }
}
