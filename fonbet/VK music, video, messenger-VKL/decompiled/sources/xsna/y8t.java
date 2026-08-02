package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y8t implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ y8t(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new o9t.m((djc) obj));
                return s3q0.a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new ccv0(tf3.b(viewGroup, R.layout.list_money_card_item, viewGroup, false), this.c);
            default:
                this.c.invoke((tho0) obj);
                return s3q0.a;
        }
    }
}
