package xsna;

import com.vk.voip.ui.sessionrooms.f;
import com.vk.voip.ui.sessionrooms.view.SessionRoomIndicatorView;
import com.vkontakte.android.R;
import xsna.wwi0;

/* compiled from: SessionRoomIndicatorDelegate.kt */
/* loaded from: classes7.dex */
public final class kvi0 {
    public final SessionRoomIndicatorView a;
    public final izs<Boolean, s3q0> b;
    public f.a c = f.a.C2082a.a;
    public boolean d;
    public boolean e;
    public boolean f;

    public kvi0(SessionRoomIndicatorView sessionRoomIndicatorView, jan0 jan0Var) {
        this.a = sessionRoomIndicatorView;
        this.b = jan0Var;
    }

    public final void a(boolean z) {
        SessionRoomIndicatorView sessionRoomIndicatorView = this.a;
        if (z) {
            sessionRoomIndicatorView.setRoomCountdownTimerBackgroundTint(R.color.vk_red);
            SessionRoomIndicatorView.a(sessionRoomIndicatorView, cn70.b(6), cn70.b(6));
        } else {
            sessionRoomIndicatorView.setRoomCountdownTimerBackgroundTint(android.R.color.transparent);
            SessionRoomIndicatorView.a(sessionRoomIndicatorView, cn70.b(0), cn70.b(0));
        }
    }

    public final void b(wwi0.a aVar) {
        boolean z = aVar.b;
        SessionRoomIndicatorView sessionRoomIndicatorView = this.a;
        if (!z) {
            this.f = false;
            a(false);
            this.e = false;
            sessionRoomIndicatorView.setRoomCountdownTimerVisible(false);
            return;
        }
        long j = aVar.a;
        if (!this.f && aVar.c) {
            this.f = true;
            a(true);
        }
        if (!this.e) {
            this.e = true;
            sessionRoomIndicatorView.setRoomCountdownTimerVisible(true);
        }
        sessionRoomIndicatorView.setRoomCountdownTimer(j);
    }

    public final void c() {
        f.a aVar = this.c;
        boolean z = aVar instanceof f.a.b;
        izs<Boolean, s3q0> izsVar = this.b;
        SessionRoomIndicatorView sessionRoomIndicatorView = this.a;
        if (!z) {
            sessionRoomIndicatorView.setRoomName("");
            bwt0.p0(sessionRoomIndicatorView, false);
            if (izsVar != null) {
                izsVar.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        sessionRoomIndicatorView.setRoomName(((f.a.b) aVar).b);
        boolean z2 = this.d;
        bwt0.p0(sessionRoomIndicatorView, z2);
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(z2));
        }
    }

    public final void d(f.a aVar) {
        this.c = aVar;
        c();
    }
}
