package ru.ok.android.webrtc.sessionroom.admin;

import java.util.ArrayList;
import java.util.Collection;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.c5g;
import xsna.zcl;

/* loaded from: classes9.dex */
public class UpdateRoomsParams {
    public final Collection a;
    public final boolean b;

    public static class Builder {
        public final ArrayList a = new ArrayList();
        public boolean b;

        public final Builder addRoom(Room.Builder builder) {
            this.a.add(builder);
            return this;
        }

        public final UpdateRoomsParams build() {
            ArrayList arrayList = this.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(((Room.Builder) obj).build());
            }
            return new UpdateRoomsParams(arrayList2, this.b, null);
        }

        public final Builder setAssignRandomly(boolean z) {
            this.b = z;
            return this;
        }

        public final Builder setRooms(Collection<? extends Room.Builder> collection) {
            this.a.clear();
            this.a.addAll(collection);
            return this;
        }
    }

    public static final class Room {
        public final SessionRoomId.Room a;
        public final String b;
        public final Integer c;
        public final Long d;
        public final Integer e;
        public final Collection f;
        public final Collection g;
        public final Collection h;

        public static class Builder {
            public SessionRoomId.Room a;
            public String b;
            public Integer c;
            public Long d;
            public Integer e;
            public Collection f;
            public Collection g;
            public Collection h;

            public final Room build() {
                return new Room(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
            }

            public final Builder setAddParticipantIds(Collection<CallParticipant.ParticipantId> collection) {
                this.g = collection;
                return this;
            }

            public final Builder setCountdownSec(Integer num) {
                this.c = num;
                return this;
            }

            public final Builder setId(SessionRoomId.Room room) {
                this.a = room;
                return this;
            }

            public final Builder setName(String str) {
                this.b = str;
                return this;
            }

            public final Builder setParticipantCount(Integer num) {
                this.e = num;
                return this;
            }

            public final Builder setParticipantIds(Collection<CallParticipant.ParticipantId> collection) {
                this.f = collection;
                return this;
            }

            public final Builder setRemoveParticipantIds(Collection<CallParticipant.ParticipantId> collection) {
                this.h = collection;
                return this;
            }

            public final Builder setTimeoutMs(Long l) {
                this.d = l;
                return this;
            }
        }

        public Room(SessionRoomId.Room room, String str, Integer num, Long l, Integer num2, Collection collection, Collection collection2, Collection collection3, zcl zclVar) {
            this.a = room;
            this.b = str;
            this.c = num;
            this.d = l;
            this.e = num2;
            this.f = collection;
            this.g = collection2;
            this.h = collection3;
        }

        public final Collection<CallParticipant.ParticipantId> getAddParticipantIds() {
            return this.g;
        }

        public final Integer getCountdownSec() {
            return this.c;
        }

        public final SessionRoomId.Room getId() {
            return this.a;
        }

        public final String getName() {
            return this.b;
        }

        public final Integer getParticipantCount() {
            return this.e;
        }

        public final Collection<CallParticipant.ParticipantId> getParticipantIds() {
            return this.f;
        }

        public final Collection<CallParticipant.ParticipantId> getRemoveParticipantIds() {
            return this.h;
        }

        public final Long getTimeoutMs() {
            return this.d;
        }
    }

    public UpdateRoomsParams(Collection collection, boolean z, zcl zclVar) {
        this.a = collection;
        this.b = z;
    }

    public final boolean getAssignRandomly() {
        return this.b;
    }

    public final Collection<Room> getRooms() {
        return this.a;
    }
}
