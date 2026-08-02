package xsna;

import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* compiled from: GroupCallUiSessionRoomsListener.kt */
/* loaded from: classes7.dex */
public final class siu implements SessionRoomsManager.OwnRoomsListener {
    public final ta50 b;

    public siu(ta50 ta50Var) {
        this.b = ta50Var;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.invoke();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        this.b.invoke();
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }
}
