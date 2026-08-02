package ru.ok.android.webrtc.sessionroom.update;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.update.ParameterUpdate;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CallSessionRoomAddOrUpdateParams {
    public final SessionRoomId.Room a;
    public final ParameterUpdate b;
    public final ParameterUpdate c;
    public final ParameterUpdate d;
    public final ParameterUpdate e;
    public final ParameterUpdate f;
    public final ParameterUpdate g;
    public final ParameterUpdate h;
    public final ParameterUpdate i;
    public final boolean j;

    public static final class Builder {
        public final SessionRoomId.Room a;
        public ParameterUpdate b;
        public ParameterUpdate c;
        public ParameterUpdate d;
        public ParameterUpdate e;
        public ParameterUpdate f;
        public ParameterUpdate g;
        public ParameterUpdate h;
        public ParameterUpdate i;
        public boolean j;

        public Builder(SessionRoomId.Room room) {
            this.a = room;
            ParameterUpdate.Companion companion = ParameterUpdate.Companion;
            this.b = companion.noUpdates();
            this.c = companion.noUpdates();
            this.d = companion.noUpdates();
            this.e = companion.noUpdates();
            this.f = companion.noUpdates();
            this.g = companion.noUpdates();
            this.h = companion.noUpdates();
            this.i = companion.noUpdates();
        }

        public final CallSessionRoomAddOrUpdateParams build() {
            return new CallSessionRoomAddOrUpdateParams(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public final Builder setActive(boolean z) {
            this.c = ParameterUpdate.Companion.newValue(Boolean.valueOf(z));
            return this;
        }

        public final Builder setAddParticipantIds(List<CallParticipant.ParticipantId> list) {
            this.e = ParameterUpdate.Companion.newValue(list);
            return this;
        }

        public final Builder setIsImplicitUpdate(boolean z) {
            this.j = z;
            return this;
        }

        public final Builder setName(String str) {
            this.b = ParameterUpdate.Companion.newValue(str);
            return this;
        }

        public final Builder setParticipantCount(int i) {
            this.g = ParameterUpdate.Companion.newValue(Integer.valueOf(i));
            return this;
        }

        public final Builder setParticipantIds(List<CallParticipant.ParticipantId> list) {
            this.d = ParameterUpdate.Companion.newValue(list);
            return this;
        }

        public final Builder setPinnedParticipantId(CallParticipant.ParticipantId participantId) {
            this.h = ParameterUpdate.Companion.newValue(participantId);
            return this;
        }

        public final Builder setRemoveParticipantIds(List<CallParticipant.ParticipantId> list) {
            this.f = ParameterUpdate.Companion.newValue(list);
            return this;
        }

        public final Builder setTimeoutMs(Long l) {
            this.i = ParameterUpdate.Companion.newValue(l);
            return this;
        }
    }

    public CallSessionRoomAddOrUpdateParams(SessionRoomId.Room room, ParameterUpdate parameterUpdate, ParameterUpdate parameterUpdate2, ParameterUpdate parameterUpdate3, ParameterUpdate parameterUpdate4, ParameterUpdate parameterUpdate5, ParameterUpdate parameterUpdate6, ParameterUpdate parameterUpdate7, ParameterUpdate parameterUpdate8, boolean z, zcl zclVar) {
        this.a = room;
        this.b = parameterUpdate;
        this.c = parameterUpdate2;
        this.d = parameterUpdate3;
        this.e = parameterUpdate4;
        this.f = parameterUpdate5;
        this.g = parameterUpdate6;
        this.h = parameterUpdate7;
        this.i = parameterUpdate8;
        this.j = z;
    }

    public final ParameterUpdate<List<CallParticipant.ParticipantId>> getAddParticipantIds() {
        return this.e;
    }

    public final SessionRoomId.Room getId() {
        return this.a;
    }

    public final ParameterUpdate<String> getName() {
        return this.b;
    }

    public final ParameterUpdate<Integer> getParticipantCount() {
        return this.g;
    }

    public final ParameterUpdate<List<CallParticipant.ParticipantId>> getParticipantIds() {
        return this.d;
    }

    public final ParameterUpdate<CallParticipant.ParticipantId> getPinnedParticipantId() {
        return this.h;
    }

    public final ParameterUpdate<List<CallParticipant.ParticipantId>> getRemoveParticipantIds() {
        return this.f;
    }

    public final ParameterUpdate<Long> getTimeoutMs() {
        return this.i;
    }

    public final ParameterUpdate<Boolean> isActive() {
        return this.c;
    }

    public final boolean isImplicitUpdate() {
        return this.j;
    }
}
