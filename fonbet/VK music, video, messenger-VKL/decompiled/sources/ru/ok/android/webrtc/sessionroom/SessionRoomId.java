package ru.ok.android.webrtc.sessionroom;

import xsna.tgw;

/* loaded from: classes9.dex */
public interface SessionRoomId {

    public static final class MainCall implements SessionRoomId {
        public static final MainCall INSTANCE = new MainCall();
    }

    public static final class Room implements SessionRoomId {
        public final int a;

        public Room(int i) {
            this.a = i;
        }

        public static /* synthetic */ Room copy$default(Room room, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = room.a;
            }
            return room.copy(i);
        }

        public final int component1() {
            return this.a;
        }

        public final Room copy(int i) {
            return new Room(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Room) && this.a == ((Room) obj).a;
        }

        public final int getId() {
            return this.a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return tgw.b(this.a, "Room(id=", ")");
        }
    }
}
