package ru.ok.android.externcalls.sdk.sessionroom.internal.listener;

import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* compiled from: SessionRoomListenerManager.kt */
/* loaded from: classes9.dex */
public interface SessionRoomListenerManager {
    void addListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener);

    void removeListener(SessionRoomsManager.OwnRoomsListener ownRoomsListener);
}
