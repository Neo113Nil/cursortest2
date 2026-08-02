package xsna;

import android.app.NotificationManager;
import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.ui.VoipViewModelState;
import xsna.rew0;

/* compiled from: VoipViewModel.kt */
/* loaded from: classes7.dex */
public final class l4x0 implements rew0.b {
    @Override // xsna.rew0.b
    public final void a(UserId userId) {
        L.e("VoipViewModel", b4q.b(userId, "Current call user id did change to "));
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        boolean z = com.vk.voip.ui.c.K0 != VoipViewModelState.Idle;
        if (z) {
            L.e("VoipViewModel", "Call in progress, let us hang it on");
            L.A("VoipViewModel", "onAuthStatusChanged declineOrHang");
            com.vk.voip.ui.c.C(cVar, null, 0L, false, false, false, null, 211);
        } else {
            try {
                x870 x870Var = x870.a;
                com.vk.voip.ui.c.p.getClass();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                if (gz80.a(26)) {
                    NotificationManager f = ca70.f(context);
                    f.deleteNotificationChannelGroup("calls");
                    f.deleteNotificationChannel("incoming_calls");
                    f.deleteNotificationChannel("ongoing_call");
                }
            } catch (SecurityException e) {
                L.f("VoipViewModel", "Can't delete notification channels", e);
            }
        }
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.c0.getClass();
        q39.e.a();
        if (z) {
            com.vk.voip.ui.c.n0(1500L);
            return;
        }
        wd2 wd2Var = com.vk.voip.ui.c.P0;
        if (wd2Var != null) {
            com.vk.voip.ui.c.N0.post(wd2Var);
        }
        com.vk.voip.ui.c.P0 = null;
    }

    @Override // xsna.rew0.b
    public final void b() {
        String str;
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.K0 != VoipViewModelState.ReceivingCallFromPeer || com.vk.voip.ui.c.f) {
            return;
        }
        com.vk.voip.ui.notifications.incoming.b bVar = (com.vk.voip.ui.notifications.incoming.b) com.vk.voip.ui.c.v0.getValue();
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        if (dhw0Var == null || (str = dhw0Var.h()) == null) {
            str = "";
        }
        bVar.c(str, com.vk.voip.ui.c.N, false);
    }
}
