package com.yandex.voip_calls.calls_go;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import defpackage.nl7;
import defpackage.q501;
import defpackage.zi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/voip_calls/calls_go/NotificationActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "calls_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        String action = intent.getAction();
        if (jl40.l(action, IncomingCallAction.DECLINE.getAction()) || jl40.l(action, IncomingCallAction.DELETE.getAction())) {
            q501 q501Var = nl7.b;
            if (q501.z()) {
                nl7.c.post(new zi(23));
            } else {
                q501.C("notification_reject_after_call_ended", "User clicked reject on notification but no active call exists");
            }
        }
    }
}
