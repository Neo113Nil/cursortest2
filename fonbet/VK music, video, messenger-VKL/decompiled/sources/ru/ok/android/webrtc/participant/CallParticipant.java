package ru.ok.android.webrtc.participant;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.task.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.internal.MutableMediaOptions;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.cjl0;
import xsna.tn;

/* loaded from: classes9.dex */
public final class CallParticipant {

    @Deprecated
    public static final Peer FAKE_PEER = new Peer("peerid");
    public ParticipantId a;
    public final ArrayList b;
    public final List c;
    public final HashMap d;
    public SessionState e;
    public boolean f;
    public float g;
    public NetworkStatus h;
    public Peer i;
    public boolean isOnHold;
    public String j;
    public String k;
    public long l;
    public boolean m;
    public final MutableMediaOptions mediaOptions;
    public final MutableMediaSettings mediaSettings;
    public boolean n;
    public CallExternalId o;
    public List p;
    public int q;

    public static final class ParticipantId {
        public final int deviceIndex;
        public final long id;
        public final Type type;

        public enum Type {
            USER('u'),
            GROUP('g');

            public final char a;

            Type(char c) {
                this.a = c;
            }

            @Override // java.lang.Enum
            @NonNull
            public String toString() {
                return String.valueOf(this.a);
            }
        }

        public ParticipantId(long j, Type type, int i) {
            this.id = j;
            this.type = type;
            this.deviceIndex = i;
        }

        @NonNull
        public static ParticipantId fromStringValue(@NonNull String str) {
            Type type = Type.USER;
            long j = 0;
            int i = 0;
            for (String str2 : str.split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if (str2.startsWith("d")) {
                    i = Integer.parseInt(str2.substring(1));
                } else {
                    boolean startsWith = str2.startsWith(g.e);
                    boolean startsWith2 = str2.startsWith("u");
                    if (startsWith || startsWith2) {
                        type = startsWith ? Type.GROUP : Type.USER;
                        j = Long.parseLong(str2.substring(1));
                    } else {
                        char charAt = str2.charAt(0);
                        if (Character.isDigit(charAt) || charAt == '-') {
                            j = Long.parseLong(str2);
                        }
                    }
                }
            }
            return new ParticipantId(j, type, i);
        }

        @Nullable
        public static ParticipantId fromStringValueSafe(String str) {
            try {
                return fromStringValue(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ParticipantId.class == obj.getClass()) {
                ParticipantId participantId = (ParticipantId) obj;
                if (this.id == participantId.id && this.deviceIndex == participantId.deviceIndex && this.type == participantId.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.id), this.type, Integer.valueOf(this.deviceIndex));
        }

        @NonNull
        public String toString() {
            return toStringValue();
        }

        @NonNull
        public String toStringValue() {
            return this.type.toString() + this.id + ":d" + this.deviceIndex;
        }
    }

    public static class ParticipantState {
        public final Map<String, ParticipantStateItem> items = new HashMap();
        public final ParticipantId participantId;

        public static class ParticipantStateItem {
            public final String state;
            public final long updateTs;
            public final String value;

            public ParticipantStateItem(String str, String str2, long j) {
                this.state = str;
                this.value = str2;
                this.updateTs = j;
            }
        }

        public ParticipantState(ParticipantId participantId) {
            this.participantId = participantId;
        }

        public void add(@NonNull String str, @NonNull String str2, long j) {
            this.items.put(str, new ParticipantStateItem(str, str2, j));
        }

        @NonNull
        public String toString() {
            return cjl0.a(new StringBuilder("ParticipantState{items="), this.items, '}');
        }
    }

    public enum Role {
        CREATOR,
        ADMIN,
        SPEAKER
    }

    public static final class SessionState {
        public final Boolean a;

        public SessionState(Boolean bool) {
            this.a = bool;
        }

        @NonNull
        public Boolean isConnected() {
            return this.a;
        }

        @NonNull
        public String toString() {
            return tn.a(new StringBuilder("SessionState{isConnected="), this.a, '}');
        }
    }

    public CallParticipant(@NonNull ParticipantId participantId, @Nullable Peer peer, @Nullable MutableMediaOptions mutableMediaOptions, @Nullable MutableMediaSettings mutableMediaSettings) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = new HashMap();
        this.e = new SessionState(Boolean.FALSE);
        this.g = 1.0f;
        this.h = NetworkStatus.GOOD;
        this.p = Collections.EMPTY_LIST;
        this.q = 0;
        this.isOnHold = false;
        this.a = participantId;
        setCallAccepted(peer);
        this.mediaOptions = mutableMediaOptions == null ? new MutableMediaOptions() : mutableMediaOptions;
        this.mediaSettings = mutableMediaSettings == null ? new MutableMediaSettings() : mutableMediaSettings;
    }

    public static boolean isPeerEquals(Peer peer, Peer peer2) {
        return Objects.equals(peer, peer2);
    }

    public void addRoles(@NonNull List<Role> list) {
        this.b.addAll(list);
    }

    public boolean equals(Object obj) {
        ParticipantId participantId;
        if (this == obj) {
            return true;
        }
        return obj != null && CallParticipant.class == obj.getClass() && (participantId = this.a) != null && participantId.equals(((CallParticipant) obj).a);
    }

    public long getAcceptCallEpochMs() {
        return this.l;
    }

    public String getAcceptedCallClientType() {
        return this.j;
    }

    public Peer getAcceptedCallPeer() {
        return this.i;
    }

    public String getAcceptedCallPlatform() {
        return this.k;
    }

    @NonNull
    public MediaOptionState getAudioOptionState() {
        return this.mediaOptions.getAudioState();
    }

    public int getCapabilities() {
        return this.q;
    }

    @Nullable
    public CallExternalId getExternalId() {
        return this.o;
    }

    @NonNull
    public List<Movie> getMovies() {
        return this.p;
    }

    public NetworkStatus getNetworkStatus() {
        return this.h;
    }

    @Nullable
    public ParticipantId getParticipantId() {
        return this.a;
    }

    @NonNull
    public List<Role> getRoles() {
        return this.c;
    }

    @NonNull
    public MediaOptionState getScreenshareOptionState() {
        return this.mediaOptions.getScreenshareState();
    }

    @NonNull
    public SessionState getSessionState() {
        return this.e;
    }

    @NonNull
    public MediaOptionState getVideoOptionState() {
        return this.mediaOptions.getVideoState();
    }

    @NonNull
    public MediaOptionState getWatchTogetherOptionState() {
        return this.mediaOptions.getMovieSharingState();
    }

    public boolean hasRegisteredPeers() {
        return (this.i == null && this.d.isEmpty()) ? false : true;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public boolean isAdmin() {
        return this.c.contains(Role.ADMIN);
    }

    public boolean isAdminOrCreator() {
        return isAdmin() || isCreator();
    }

    public boolean isAnimojiEnabled() {
        return this.mediaSettings.isAnimojiEnabled();
    }

    public boolean isAudioEnabled() {
        return this.mediaSettings.isAudioEnabled();
    }

    public boolean isCallAccepted() {
        return this.i != null;
    }

    public boolean isConnected() {
        return this.f;
    }

    public boolean isCreator() {
        return this.c.contains(Role.CREATOR);
    }

    public boolean isIdEquals(ParticipantId participantId) {
        ParticipantId participantId2 = this.a;
        return participantId2 != null && participantId2.equals(participantId);
    }

    public boolean isPrimarySpeaker() {
        return isTalkingWithAudioCheck() && this.n;
    }

    public boolean isTalkingWithAudioCheck() {
        return isAudioEnabled() && this.m;
    }

    public boolean isVideoEnabled() {
        return this.mediaSettings.isVideoEnabled();
    }

    public void removeRoles(@NonNull List<Role> list) {
        this.b.removeAll(list);
    }

    public boolean setCallAccepted() {
        return setCallAccepted(FAKE_PEER);
    }

    public void setCapabilities(int i) {
        this.q = i;
    }

    public void setConnected(boolean z) {
        this.f = z;
    }

    public void setDeviceIndex(int i) {
        ParticipantId participantId = this.a;
        if (participantId == null) {
            return;
        }
        this.a = new ParticipantId(participantId.id, participantId.type, i);
        CallExternalId callExternalId = this.o;
        if (callExternalId != null) {
            this.o = new CallExternalId(callExternalId.getId(), this.o.getType(), i);
        }
    }

    public void setExternalId(@Nullable CallExternalId callExternalId) {
        this.o = callExternalId;
    }

    public void setMovies(@NonNull List<Movie> list) {
        this.p = list;
    }

    public void setRoles(@NonNull List<Role> list) {
        this.b.clear();
        this.b.addAll(list);
    }

    public void setSessionState(SessionState sessionState) {
        this.e = sessionState;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CallParticipant{");
        sb.append(this.a);
        if (hasRegisteredPeers()) {
            sb.append("|registered");
        }
        sb.append("|isOnHold = ");
        sb.append(this.isOnHold);
        Peer peer = this.i;
        if (peer != null) {
            sb.append("|accepted(");
            sb.append(peer.getId());
            sb.append(',');
            sb.append(this.k);
            sb.append('/');
            sb.append(this.j);
            sb.append(')');
        }
        if (isConnected()) {
            sb.append("|connected");
        }
        sb.append('|');
        sb.append(this.mediaSettings);
        sb.append('}');
        return sb.toString();
    }

    public void updateId(@NonNull ParticipantId participantId) {
        this.a = participantId;
    }

    public boolean setCallAccepted(Peer peer) {
        if (peer == null || TextUtils.isEmpty(peer.getId()) || isPeerEquals(this.i, peer)) {
            return false;
        }
        if (this.i == null) {
            this.l = System.currentTimeMillis();
        }
        this.i = peer;
        Pair pair = (Pair) this.d.get(peer);
        if (pair == null) {
            return true;
        }
        this.k = (String) pair.i();
        this.j = (String) pair.j();
        return true;
    }
}
