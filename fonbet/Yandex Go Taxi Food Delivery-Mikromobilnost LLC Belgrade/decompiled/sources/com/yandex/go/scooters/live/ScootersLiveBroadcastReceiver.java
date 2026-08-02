package com.yandex.go.scooters.live;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.y;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.eja1;
import defpackage.jst;
import defpackage.tje;
import defpackage.twn0;
import defpackage.vwn0;
import defpackage.wwg;
import defpackage.wwn0;
import defpackage.zzf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/live/ScootersLiveBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersLiveBroadcastReceiver extends BroadcastReceiver {
    public static final int $stable = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        twn0 twn0Var = (twn0) wwg.e(context, twn0.class);
        wwn0 a = ((vwn0) ((zzf) twn0Var).Jg.get()).a(intent);
        if (a == null) {
            return;
        }
        ScootersLiveAction scootersLiveAction = a.b;
        if (scootersLiveAction == null) {
            jst.e.c("Action null cannot be processed");
        } else {
            tje.N(eja1.s(y.A), null, null, new ScootersLiveBroadcastReceiver$onReceive$1(twn0Var, scootersLiveAction, a, null), 3);
        }
    }
}
