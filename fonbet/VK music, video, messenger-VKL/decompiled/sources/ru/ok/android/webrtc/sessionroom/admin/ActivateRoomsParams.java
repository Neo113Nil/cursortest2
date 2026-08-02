package ru.ok.android.webrtc.sessionroom.admin;

import java.util.ArrayList;
import java.util.Collection;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ActivateRoomsParams {
    public final Collection a;
    public final boolean b;

    public static final class Builder {
        public final ArrayList a = new ArrayList();
        public boolean b;

        public final Builder addRoomId(SessionRoomId.Room room) {
            this.a.add(room);
            return this;
        }

        public final ActivateRoomsParams build() {
            return new ActivateRoomsParams(this.a, this.b, null);
        }

        public final Builder setDeactivate(boolean z) {
            this.b = z;
            return this;
        }

        public final Builder setRoomIds(Collection<SessionRoomId.Room> collection) {
            this.a.clear();
            this.a.addAll(collection);
            return this;
        }
    }

    public ActivateRoomsParams(Collection collection, boolean z, zcl zclVar) {
        this.a = collection;
        this.b = z;
    }

    public final boolean getDeactivate() {
        return this.b;
    }

    public final Collection<SessionRoomId.Room> getRoomIds() {
        return this.a;
    }
}
