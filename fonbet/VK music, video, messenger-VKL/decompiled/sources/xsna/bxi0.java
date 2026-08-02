package xsna;

import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* compiled from: SessionRoomsListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class bxi0 implements SessionRoomsManager.OwnRoomsListener {
    public final cxi0 b;

    public bxi0(dxi0 dxi0Var) {
        this.b = dxi0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.onActiveRoomChanged(sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.onProposedRoomChanged(sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.onRoomRemoved(sessionRoomInfo);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.onRoomUpdated(sessionRoomInfo);
    }
}
