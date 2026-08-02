package ru.ok.android.webrtc.sessionroom.admin;

import java.util.ArrayList;
import java.util.Collection;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class RemoveRoomsParams {
    public final Collection a;

    public static final class Builder {
        public final ArrayList a = new ArrayList();

        public final Builder addRoomId(SessionRoomId.Room room) {
            this.a.add(room);
            return this;
        }

        public final RemoveRoomsParams build() {
            return new RemoveRoomsParams(this.a, null);
        }

        public final Builder setRoomIds(Collection<SessionRoomId.Room> collection) {
            this.a.clear();
            this.a.addAll(collection);
            return this;
        }
    }

    public RemoveRoomsParams(Collection collection, zcl zclVar) {
        this.a = collection;
    }

    public final Collection<SessionRoomId.Room> getRoomIds() {
        return this.a;
    }
}
