package com.ybsdk.common.domain;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.i18;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ybsdk/common/domain/PinShortcutInteractor$requestShortcutAdding$2$1$receiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinShortcutInteractor$requestShortcutAdding$2$1$receiver$1 extends BroadcastReceiver {
    final /* synthetic */ i18 $continuation;

    public PinShortcutInteractor$requestShortcutAdding$2$1$receiver$1(i18 i18Var) {
        this.$continuation = i18Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (jl40.l(intent.getAction(), "com.yandex.yb.ACTION_SHORTCUT_PINNED_CALLBACK")) {
            this.$continuation.resumeWith(Boolean.TRUE);
            context.unregisterReceiver(this);
        }
    }
}
