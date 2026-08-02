package com.yandex.go.taxi.order.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.e5y0;
import defpackage.oew0;
import defpackage.ofb;
import defpackage.y5y0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yandex/go/taxi/order/listener/TaxiOrderSentActivityListener$orderSentReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxiOrderSentActivityListener$orderSentReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ y5y0 this$0;

    public TaxiOrderSentActivityListener$orderSentReceiver$1(y5y0 y5y0Var) {
        this.this$0 = y5y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return "maybeStartOrder by intent=" + intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (((ofb) this.this$0.d.get()).a()) {
            this.this$0.e.f(new oew0(12, intent), "onReceive");
            e5y0.f((e5y0) this.this$0.c.get(), "check existing orders by order broadcast received");
        }
    }
}
