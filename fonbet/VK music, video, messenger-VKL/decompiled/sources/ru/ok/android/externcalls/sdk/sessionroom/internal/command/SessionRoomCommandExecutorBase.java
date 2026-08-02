package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomInactiveException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomNotAdminException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomCommandExecutorBase.kt */
/* loaded from: classes9.dex */
public class SessionRoomCommandExecutorBase {
    public final void parseErrorResponse(String str, JSONObject jSONObject, izs<? super Throwable, s3q0> izsVar) {
        SessionRoomException sessionRoomException;
        if (izsVar != null) {
            String optString = jSONObject.optString("error");
            if (epx.f(optString, SignalingProtocol.ERROR_ROOM_INACTIVE)) {
                sessionRoomException = new SessionRoomInactiveException();
            } else if (epx.f(optString, SignalingProtocol.ERROR_ROOM_NOT_ADMIN)) {
                sessionRoomException = new SessionRoomNotAdminException();
            } else {
                sessionRoomException = new SessionRoomException("Error response for " + str + " command " + jSONObject, null, 2, null);
            }
            izsVar.invoke(sessionRoomException);
        }
    }
}
