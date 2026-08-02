package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

/* compiled from: SessionRoomsListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class dxi0 implements cxi0 {
    public final CopyOnWriteArraySet<SessionRoomsManager.OwnRoomsListener> b = new CopyOnWriteArraySet<>();

    public final void a(SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        this.b.add(ownRoomsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Iterator<SessionRoomsManager.OwnRoomsListener> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onActiveRoomChanged(sessionRoomInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Iterator<SessionRoomsManager.OwnRoomsListener> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onProposedRoomChanged(sessionRoomInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomRemoved(sessionRoomInfo);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
    public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomUpdated(sessionRoomInfo);
        }
    }
}
