package xsna;

import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wv80 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wv80(int i, OrdersListItem.Order.Action action, izs izsVar, q630 q630Var, int i2) {
        this.c = i;
        this.e = action;
        this.f = izsVar;
        this.g = q630Var;
        this.d = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                cw80.a(this.c, (OrdersListItem.Order.Action) this.e, (izs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                qkk0 qkk0Var = (qkk0) this.e;
                String str = (String) this.f;
                String str2 = (String) this.g;
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                qkk0Var.e(this.c, I, (androidx.compose.runtime.a) obj, str, str2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wv80(qkk0 qkk0Var, int i, String str, String str2, int i2) {
        this.e = qkk0Var;
        this.c = i;
        this.f = str;
        this.g = str2;
        this.d = i2;
    }
}
