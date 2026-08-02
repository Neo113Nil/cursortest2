package ru.ok.android.webrtc.signaling.participant;

import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.participant.GetParticipantListChunkCommand;
import ru.ok.android.webrtc.signaling.participant.model.ParticipantListType;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.yq;

/* loaded from: classes9.dex */
public final class GetParticipantListChunkCommand {
    public final ParticipantListChunkParser a;
    public final gzs b;

    public static final class Params {
        public final ParticipantListType a;
        public final int b;
        public final SessionRoomId c;

        public Params(ParticipantListType participantListType, int i, SessionRoomId sessionRoomId) {
            this.a = participantListType;
            this.b = i;
            this.c = sessionRoomId;
        }

        public final int getCount() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.c;
        }

        public final ParticipantListType getType() {
            return this.a;
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParticipantListType.values().length];
            try {
                iArr[ParticipantListType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParticipantListType.SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParticipantListType.ADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GetParticipantListChunkCommand(ParticipantListChunkParser participantListChunkParser, gzs<? extends Signaling> gzsVar) {
        this.a = participantListChunkParser;
        this.b = gzsVar;
    }

    public static final void a(GetParticipantListChunkCommand getParticipantListChunkCommand, Params params, izs izsVar, izs izsVar2, JSONObject jSONObject) {
        getParticipantListChunkCommand.a(jSONObject, params.getRoomId(), izsVar, izsVar2);
    }

    public final void requestChunk(final Params params, final izs<? super SignalingParticipantListChunk, s3q0> izsVar, final izs<? super Throwable, s3q0> izsVar2) {
        String str;
        Signaling signaling = (Signaling) this.b.invoke();
        if (signaling == null) {
            izsVar2.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject d = yq.d("command", SignalingProtocol.COMMAND_GET_PARTICIPANT_LIST_CHUNK);
        d.put("count", params.getCount());
        int i = WhenMappings.$EnumSwitchMapping$0[params.getType().ordinal()];
        if (i == 1) {
            str = SignalingProtocol.KEY_GRID;
        } else if (i == 2) {
            str = SignalingProtocol.KEY_SIDE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ADMIN";
        }
        d.put(SignalingProtocol.KEY_LIST_TYPE, str);
        if (params.getRoomId() instanceof SessionRoomId.Room) {
            d.put(SignalingProtocol.KEY_ROOM_ID, ((SessionRoomId.Room) params.getRoomId()).getId());
        }
        signaling.send(d, new Signaling.Listener() { // from class: xsna.gtt
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                GetParticipantListChunkCommand.a(GetParticipantListChunkCommand.this, params, izsVar2, izsVar, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.htt
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                GetParticipantListChunkCommand.a(GetParticipantListChunkCommand.this, izsVar2, jSONObject);
            }
        });
    }

    public static final void a(GetParticipantListChunkCommand getParticipantListChunkCommand, izs izsVar, JSONObject jSONObject) {
        getParticipantListChunkCommand.getClass();
        a(izsVar, jSONObject);
    }

    public final void a(JSONObject jSONObject, SessionRoomId sessionRoomId, izs izsVar, izs izsVar2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("chunk");
        SignalingParticipantListChunk parse = optJSONObject != null ? this.a.parse(optJSONObject, sessionRoomId) : null;
        if (parse == null) {
            izsVar.invoke(new RuntimeException(cq.c("Can't parse chunk ", jSONObject)));
        } else {
            izsVar2.invoke(parse);
        }
    }

    public static void a(izs izsVar, JSONObject jSONObject) {
        izsVar.invoke(new RuntimeException(cq.c("get-participant-list-chunk error ", jSONObject)));
    }
}
