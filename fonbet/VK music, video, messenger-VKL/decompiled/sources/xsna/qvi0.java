package xsna;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomStatistics.kt */
/* loaded from: classes7.dex */
public final class qvi0 {
    public final pvw0 a;
    public SessionRoomId b = SessionRoomId.MainCall.INSTANCE;

    public qvi0(pvw0 pvw0Var) {
        this.a = pvw0Var;
    }

    public final void a(SessionRoomId sessionRoomId) {
        if (epx.f(this.b, sessionRoomId)) {
            return;
        }
        boolean z = sessionRoomId instanceof SessionRoomId.Room;
        pvw0 pvw0Var = this.a;
        if (z) {
            pvw0Var.j0(((SessionRoomId.Room) sessionRoomId).getId());
        } else {
            pvw0Var.g0();
        }
        this.b = sessionRoomId;
    }

    public final void b() {
        this.a.W();
    }

    public final void c() {
        SessionRoomId sessionRoomId = this.b;
        SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
        if (!epx.f(sessionRoomId, mainCall)) {
            this.a.g0();
        }
        this.b = mainCall;
    }
}
