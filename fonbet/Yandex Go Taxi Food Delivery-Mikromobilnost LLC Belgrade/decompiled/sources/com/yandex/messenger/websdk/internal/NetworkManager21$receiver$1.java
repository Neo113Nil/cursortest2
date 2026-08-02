package com.yandex.messenger.websdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.d240;
import defpackage.jl40;
import defpackage.tw50;
import defpackage.vx21;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yandex/messenger/websdk/internal/NetworkManager21$receiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NetworkManager21$receiver$1 extends BroadcastReceiver {
    final /* synthetic */ tw50 this$0;

    public NetworkManager21$receiver$1(tw50 tw50Var) {
        this.this$0 = tw50Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onReceive$lambda$0(tw50 tw50Var) {
        jl40.m();
        vx21.a(tw50Var.x, new zo1(tw50Var, tw50Var.a(), 12));
        return zy11.a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        tw50 tw50Var = this.this$0;
        vx21.a(tw50Var.x, new d240(24, tw50Var));
    }
}
