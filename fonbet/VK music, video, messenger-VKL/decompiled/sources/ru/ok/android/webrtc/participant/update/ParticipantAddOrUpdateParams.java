package ru.ok.android.webrtc.participant.update;

import java.util.List;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.Peer;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.update.ParameterUpdate;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ParticipantAddOrUpdateParams {
    public final CallParticipant.ParticipantId a;
    public final ParameterUpdate b;
    public final ParameterUpdate c;
    public final ParameterUpdate d;
    public final ParameterUpdate e;
    public final ParameterUpdate f;
    public final ParameterUpdate g;
    public final ParameterUpdate h;
    public final ParameterUpdate i;

    public static final class Builder {
        public final CallParticipant.ParticipantId a;
        public ParameterUpdate b;
        public ParameterUpdate c;
        public ParameterUpdate d;
        public ParameterUpdate e;
        public ParameterUpdate f;
        public ParameterUpdate g;
        public ParameterUpdate h;
        public ParameterUpdate i;

        public Builder(CallParticipant.ParticipantId participantId) {
            this.a = participantId;
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

        public final ParticipantAddOrUpdateParams build() {
            return new ParticipantAddOrUpdateParams(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
        }

        public final Builder setAcceptedCallPeer(Peer peer) {
            this.b = ParameterUpdate.Companion.newValue(peer);
            return this;
        }

        public final Builder setCapabilities(Integer num) {
            if (num != null) {
                this.h = ParameterUpdate.Companion.newValue(num);
            }
            return this;
        }

        public final Builder setExternalId(CallExternalId callExternalId) {
            this.f = ParameterUpdate.Companion.newValue(callExternalId);
            return this;
        }

        public final Builder setExternalIdIfNotNull(CallExternalId callExternalId) {
            if (callExternalId != null) {
                this.f = ParameterUpdate.Companion.newValue(callExternalId);
            }
            return this;
        }

        public final Builder setMediaOptions(MutableMediaOptions mutableMediaOptions) {
            this.c = ParameterUpdate.Companion.newValue(mutableMediaOptions);
            return this;
        }

        public final Builder setMediaSettings(MutableMediaSettings mutableMediaSettings) {
            this.d = ParameterUpdate.Companion.newValue(mutableMediaSettings);
            return this;
        }

        public final Builder setMediaSettingsIfNotNull(MutableMediaSettings mutableMediaSettings) {
            if (mutableMediaSettings != null) {
                this.d = ParameterUpdate.Companion.newValue(mutableMediaSettings);
            }
            return this;
        }

        public final Builder setMovies(List<Movie> list) {
            this.g = ParameterUpdate.Companion.newValue(list);
            return this;
        }

        public final Builder setRoles(List<? extends CallParticipant.Role> list) {
            this.e = ParameterUpdate.Companion.newValue(list);
            return this;
        }

        public final Builder setSessionState(CallParticipant.SessionState sessionState) {
            if (sessionState != null) {
                this.i = ParameterUpdate.Companion.newValue(sessionState);
            }
            return this;
        }
    }

    public ParticipantAddOrUpdateParams(CallParticipant.ParticipantId participantId, ParameterUpdate parameterUpdate, ParameterUpdate parameterUpdate2, ParameterUpdate parameterUpdate3, ParameterUpdate parameterUpdate4, ParameterUpdate parameterUpdate5, ParameterUpdate parameterUpdate6, ParameterUpdate parameterUpdate7, ParameterUpdate parameterUpdate8, zcl zclVar) {
        this.a = participantId;
        this.b = parameterUpdate;
        this.c = parameterUpdate2;
        this.d = parameterUpdate3;
        this.e = parameterUpdate4;
        this.f = parameterUpdate5;
        this.g = parameterUpdate6;
        this.h = parameterUpdate7;
        this.i = parameterUpdate8;
    }

    public final ParameterUpdate<Peer> getAcceptedCallPeerUpdate() {
        return this.b;
    }

    public final ParameterUpdate<Integer> getCapabilitiesUpdate() {
        return this.h;
    }

    public final ParameterUpdate<CallExternalId> getExternalIdUpdate() {
        return this.f;
    }

    public final ParameterUpdate<MutableMediaOptions> getMediaOptionsUpdate() {
        return this.c;
    }

    public final ParameterUpdate<MutableMediaSettings> getMediaSettingsUpdate() {
        return this.d;
    }

    public final ParameterUpdate<List<Movie>> getMoviesUpdate() {
        return this.g;
    }

    public final CallParticipant.ParticipantId getParticipantId() {
        return this.a;
    }

    public final ParameterUpdate<List<CallParticipant.Role>> getRolesUpdate() {
        return this.e;
    }

    public final ParameterUpdate<CallParticipant.SessionState> getSessionStateUpdate() {
        return this.i;
    }
}
