package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class no01 extends BroadcastReceiver {
    public final /* synthetic */ ep01 a;

    public /* synthetic */ no01(ep01 ep01Var) {
        this.a = ep01Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bs01 bs01Var = (bs01) this.a;
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        gtz0 m = olk0.m(bundleExtra);
        bs01Var.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", m);
        xd01 h = ((com.google.android.play.core.splitinstall.zzo) bs01Var.h).h();
        if (m.h() != 3 || h == null) {
            bs01Var.d(m);
        } else {
            h.a(m.l(), new srn0(bs01Var, m, intent, context));
        }
    }
}
