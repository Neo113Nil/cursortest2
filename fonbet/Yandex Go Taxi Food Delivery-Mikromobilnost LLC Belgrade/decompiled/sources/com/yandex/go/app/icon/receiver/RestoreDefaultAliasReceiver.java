package com.yandex.go.app.icon.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.go.app.icon.api.RestoreSource;
import defpackage.h6r;
import defpackage.q5h;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/app/icon/receiver/RestoreDefaultAliasReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RestoreDefaultAliasReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            zzf zzfVar = (zzf) ((h6r) wwg.e(context, h6r.class));
            zzfVar.r().a("AppIconDelegate.Receiver");
            ((q5h) zzfVar.h7.get()).e(RestoreSource.RECEIVER);
        }
    }
}
