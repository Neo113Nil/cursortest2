package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g59 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g59(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new SimpleDateFormat(((Context) obj2).getString(i2), ((i59) obj).d);
            case 1:
                ((izs) obj2).invoke(new OrderListAction.e(i2, ((OrdersListItem.Order.Action) obj).c));
                return s3q0.a;
            case 2:
                ubb0 ubb0Var = (ubb0) obj2;
                ArrayList arrayList = (ArrayList) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", uq.b(arrayList, ji.b(i2, "moosicUid=", " insert playlists size="))});
                }
                ubb0Var.c.k(arrayList);
                return s3q0.a;
            default:
                int i3 = PollsWebView.h;
                return new WebView((Context) obj2, (AttributeSet) obj, i2);
        }
    }

    public /* synthetic */ g59(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
