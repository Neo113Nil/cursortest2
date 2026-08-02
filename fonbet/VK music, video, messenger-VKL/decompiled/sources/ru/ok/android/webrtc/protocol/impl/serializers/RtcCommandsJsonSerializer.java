package ru.ok.android.webrtc.protocol.impl.serializers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayout;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayoutItem;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandSerializer;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastCommand;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastResponse;
import ru.ok.android.webrtc.protocol.commands.ReportNetworkStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatResponse;
import ru.ok.android.webrtc.protocol.commands.RequestAsrCommand;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Response;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandExecutionException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.android.webrtc.utils.JsonUtils;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;

/* loaded from: classes9.dex */
public class RtcCommandsJsonSerializer implements RtcCommandSerializer {
    public static JSONObject a(long j, RtcCommand rtcCommand) {
        if (rtcCommand instanceof ReportPerfStatCommand) {
            ReportPerfStatCommand reportPerfStatCommand = (ReportPerfStatCommand) rtcCommand;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RTCStatsConstants.KEY_FRAMES_RECEIVED, reportPerfStatCommand.framesReceived);
            jSONObject.put(RTCStatsConstants.KEY_FRAMES_DECODED, reportPerfStatCommand.framesDecoded);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SignalingProtocol.KEY_SEQUENCE, j);
            jSONObject2.put("command", "report-perf-stat");
            jSONObject2.put("report", jSONObject);
            return jSONObject2;
        }
        if (rtcCommand instanceof UpdateDisplayLayoutV2Command) {
            UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command = (UpdateDisplayLayoutV2Command) rtcCommand;
            JSONObject jSONObject3 = new JSONObject();
            for (ServerDisplayLayoutItem serverDisplayLayoutItem : updateDisplayLayoutV2Command.layouts) {
                ServerDisplayLayout layout = serverDisplayLayoutItem.getLayout();
                jSONObject3.put(SignalingProtocol.getUpdateDisplayLayoutKey(serverDisplayLayoutItem), layout.shouldStopStream() ? "ss" : "sz=" + layout.getWidth() + "x" + layout.getHeight() + ":fit=" + layout.getFit().serverValue);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(SignalingProtocol.KEY_SEQUENCE, j);
            jSONObject4.put("command", "update-display-layout");
            jSONObject4.put(SignalingProtocol.KEY_LAYOUTS, jSONObject3);
            if (updateDisplayLayoutV2Command.isSnapshot) {
                jSONObject4.put("snapshot", true);
            }
            return jSONObject4;
        }
        if (rtcCommand instanceof RequestAsrCommand) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(SignalingProtocol.KEY_SEQUENCE, j);
            jSONObject5.put("command", "request-asr");
            jSONObject5.put("start", ((RequestAsrCommand) rtcCommand).start);
            return jSONObject5;
        }
        if (rtcCommand instanceof ReportNetworkStatCommand) {
            ReportNetworkStatCommand reportNetworkStatCommand = (ReportNetworkStatCommand) rtcCommand;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(SignalingProtocol.KEY_SEQUENCE, j);
            jSONObject6.put("command", "report-network-stat");
            jSONObject6.put("timestamp", reportNetworkStatCommand.timestamp);
            jSONObject6.put(BadConnectionSignaling.KEY_BAD_NET_BITRATE, reportNetworkStatCommand.sendBitrate);
            return jSONObject6;
        }
        if (!(rtcCommand instanceof ChangeSimulcastCommand)) {
            return null;
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put(SignalingProtocol.KEY_SEQUENCE, j);
        jSONObject7.put("command", "change-simulcast");
        jSONObject7.put("mediaSource", "CAMERA");
        JSONArray jSONArray = new JSONArray();
        for (SimulcastLayerInfo simulcastLayerInfo : ((ChangeSimulcastCommand) rtcCommand).getLayers()) {
            if (simulcastLayerInfo.isActive()) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("rid", simulcastLayerInfo.getRid());
                jSONObject8.put("width", simulcastLayerInfo.getWidth());
                jSONObject8.put("height", simulcastLayerInfo.getHeight());
                jSONObject8.put("fps", simulcastLayerInfo.getMaxFps());
                jSONObject8.put("bitrateKbps", simulcastLayerInfo.getMaxBitrate() / 1000);
                jSONArray.put(jSONObject8);
            }
        }
        jSONObject7.put("layers", jSONArray);
        return jSONObject7;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandSerializer
    @Nullable
    public RtcCommandSerializer.DeserializeResult deserialize(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) throws RtcCommandException {
        if (bArr == null) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Illegal 'value' value: null"));
        }
        if (rtcFormat == null) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (rtcFormat != RtcFormat.TEXT) {
            throw new RtcCommandSerializeException(null, false, new UnsupportedOperationException("Only text format is supported"));
        }
        try {
            String str = new String(bArr);
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    Long valueOf = jSONObject.has(SignalingProtocol.KEY_SEQUENCE) ? Long.valueOf(jSONObject.getLong(SignalingProtocol.KEY_SEQUENCE)) : null;
                    String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                    if (!"response".equals(string)) {
                        if ("error".equals(string)) {
                            throw new RtcCommandExecutionException(valueOf, jSONObject.optBoolean(SignalingProtocol.KEY_ERROR_RECOVERABLE, false), jSONObject.optString("error", ""), JsonUtils.toStringMap(jSONObject));
                        }
                        return null;
                    }
                    if (valueOf == null) {
                        throw new RtcCommandSerializeException(valueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                    }
                    try {
                        RtcResponse a = a(jSONObject);
                        if (a == null) {
                            return null;
                        }
                        return new RtcCommandSerializer.DeserializeResult(valueOf.longValue(), a);
                    } catch (Throwable th) {
                        throw new RtcCommandSerializeException(valueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                    }
                } catch (Throwable th2) {
                    throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                }
            } catch (Throwable th3) {
                throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
            }
        } catch (Throwable th4) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as string", th4));
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandSerializer
    @NonNull
    public RtcCommandSerializer.SerializeResult serialize(long j, @NonNull RtcCommand rtcCommand) throws RtcCommandException {
        if (rtcCommand == null) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
        try {
            JSONObject a = a(j, rtcCommand);
            if (a != null) {
                return new RtcCommandSerializer.SerializeResult(a.toString().getBytes(), RtcFormat.TEXT);
            }
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalStateException("No serializer for command: " + rtcCommand.getClass()));
        } catch (JSONException e) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Unable to serialize command: " + rtcCommand.getClass(), e));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static RtcResponse a(JSONObject jSONObject) {
        char c;
        UpdateDisplayLayoutV2Response.Error error;
        String string = jSONObject.getString("response");
        string.getClass();
        switch (string.hashCode()) {
            case 286221663:
                if (string.equals("report-perf-stat")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 526843920:
                if (string.equals("change-simulcast")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1233713177:
                if (string.equals("update-display-layout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new ReportPerfStatResponse(jSONObject.has(PreferencesHelper.ESTIMATED_PERFORMANCE_INDEX_KEY) ? Integer.valueOf(jSONObject.getInt(PreferencesHelper.ESTIMATED_PERFORMANCE_INDEX_KEY)) : null);
            case 1:
                return new ChangeSimulcastResponse(jSONObject.getInt("errorCode"));
            case 2:
                if (jSONObject.has("errorCodeByParticipantId")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        CallVideoTrackParticipantKey parseVideoTrackParticipantKey = SignalingProtocol.parseVideoTrackParticipantKey(next);
                        if (jSONObject2.getInt(next) == -1) {
                            error = UpdateDisplayLayoutV2Response.Error.NOT_ENOUGH_VIDEO_TRACKS;
                        } else {
                            error = UpdateDisplayLayoutV2Response.Error.UNKNOWN;
                        }
                        hashMap.put(parseVideoTrackParticipantKey, error);
                    }
                    return new UpdateDisplayLayoutV2Response(hashMap);
                }
                return new UpdateDisplayLayoutV2Response(Collections.EMPTY_MAP);
            default:
                return null;
        }
    }
}
