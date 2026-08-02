package xsna;

import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NotificationListComponent) ((BridgeComponentImpl) this.c).m.getValue()).a();
            case 1:
                return ((MarketOrdersComponent) ((LinksBridgeComponentImpl) this.c).e.getValue()).S4();
            case 2:
                aid0 aid0Var = (aid0) this.c;
                sqo0 sqo0Var = aid0Var.e;
                xhd0 xhd0Var = aid0Var.b;
                if (!lhs.d()) {
                    return new rqo0(aid0Var.j(new guz(xhd0Var.i.b(), xhd0Var.j, xhd0Var.a)), sqo0Var);
                }
                lhs.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
                try {
                    return new rqo0(aid0Var.j(new guz(xhd0Var.i.b(), xhd0Var.j, xhd0Var.a)), sqo0Var);
                } finally {
                    lhs.b();
                }
            default:
                olu0 olu0Var = (olu0) this.c;
                return new x1e(olu0Var.a, olu0Var.b);
        }
    }
}
