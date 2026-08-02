package ru.ok.android.webrtc.sessionroom;

import org.json.JSONObject;
import ru.ok.android.webrtc.sessionroom.GetRoomsCommand;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomsParser;
import ru.ok.android.webrtc.signaling.sessionroom.event.SignalingSessionRooms;
import xsna.cq;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.yq;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class GetRoomsCommand {
    public final SessionRoomsParser a;
    public final gzs b;

    public static final class Params {
        public final boolean a;

        public Params() {
            this(false, 1, null);
        }

        public final boolean getWithParticipants() {
            return this.a;
        }

        public Params(boolean z) {
            this.a = z;
        }

        public /* synthetic */ Params(boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z);
        }
    }

    public GetRoomsCommand(SessionRoomsParser sessionRoomsParser, gzs<? extends Signaling> gzsVar) {
        this.a = sessionRoomsParser;
        this.b = gzsVar;
    }

    public static final void a(GetRoomsCommand getRoomsCommand, izs izsVar, izs izsVar2, JSONObject jSONObject) {
        getRoomsCommand.a(jSONObject, izsVar, izsVar2);
    }

    public final void requestRooms(Params params, final izs<? super SignalingSessionRooms, s3q0> izsVar, final izs<? super Throwable, s3q0> izsVar2) {
        Signaling signaling = (Signaling) this.b.invoke();
        if (signaling == null) {
            izsVar2.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject d = yq.d("command", SignalingProtocol.COMMAND_GET_ROOMS);
        if (params.getWithParticipants()) {
            d.put(SignalingProtocol.KEY_WITH_PARTICIPANTS, true);
        }
        signaling.send(d, new Signaling.Listener() { // from class: xsna.ztt
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                GetRoomsCommand.a(GetRoomsCommand.this, izsVar2, izsVar, jSONObject);
            }
        }, new Signaling.Listener() { // from class: xsna.aut
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                GetRoomsCommand.a(GetRoomsCommand.this, izsVar2, jSONObject);
            }
        });
    }

    public static final void a(GetRoomsCommand getRoomsCommand, izs izsVar, JSONObject jSONObject) {
        getRoomsCommand.getClass();
        a(izsVar, jSONObject);
    }

    public final void a(JSONObject jSONObject, izs izsVar, izs izsVar2) {
        JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_ROOMS);
        SignalingSessionRooms parse = optJSONObject != null ? this.a.parse(optJSONObject) : null;
        if (parse == null) {
            izsVar.invoke(new RuntimeException(cq.c("Can't parse rooms from ", jSONObject)));
        } else {
            izsVar2.invoke(parse);
        }
    }

    public static void a(izs izsVar, JSONObject jSONObject) {
        izsVar.invoke(new RuntimeException(cq.c("get-rooms error ", jSONObject)));
    }
}
