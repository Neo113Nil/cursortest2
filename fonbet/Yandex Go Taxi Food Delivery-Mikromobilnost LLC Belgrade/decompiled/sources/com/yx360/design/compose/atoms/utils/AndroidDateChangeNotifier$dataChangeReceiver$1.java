package com.yx360.design.compose.atoms.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.csg;
import defpackage.e92;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yx360/design/compose/atoms/utils/AndroidDateChangeNotifier$dataChangeReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidDateChangeNotifier$dataChangeReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ e92 this$0;

    public AndroidDateChangeNotifier$dataChangeReceiver$1(e92 e92Var) {
        this.this$0 = e92Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object value;
        r0 r0Var = this.this$0.a;
        do {
            value = r0Var.getValue();
            ((Number) value).intValue();
        } while (!r0Var.k(value, Integer.valueOf(csg.a())));
        this.this$0.a();
    }
}
