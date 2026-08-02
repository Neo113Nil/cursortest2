package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.api.json.PlainJsonReader;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.fo8;
import xsna.zcl;

/* compiled from: CallInfo.kt */
/* loaded from: classes9.dex */
public final class CallInfo {
    public static final Companion Companion;
    private static final JsonParser<CallInfo> PARSER;
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isConcurrent;
    public final boolean isP2PForbidden;
    public final String joinLink;
    public final List<PeerConnection.IceServer> stunServer;
    public final String token;
    public final List<PeerConnection.IceServer> turnServer;
    public final List<String> wsIps;
    public final String wtEndpoint;
    public final List<String> wtIps;

    /* compiled from: CallInfo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CallInfo parse(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
            EmptyList emptyList = EmptyList.b;
            jsonReader.beginObject();
            List<PeerConnection.IceServer> list = emptyList;
            List<PeerConnection.IceServer> list2 = list;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = false;
            boolean z2 = false;
            int i = 0;
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                switch (name.hashCode()) {
                    case -494324241:
                        if (!name.equals(ApiProtocol.KEY_JOIN_LINK)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str6 = jsonReader.stringValue();
                            break;
                        }
                    case -173671634:
                        if (!name.equals("client_type")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str5 = jsonReader.stringValue();
                            break;
                        }
                    case -17633304:
                        if (!name.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            z2 = jsonReader.booleanValue();
                            break;
                        }
                    case 3355:
                        if (!name.equals("id")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str3 = jsonReader.stringValue();
                            break;
                        }
                    case 110541305:
                        if (!name.equals("token")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str4 = jsonReader.stringValue();
                            break;
                        }
                    case 781502804:
                        if (!name.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            i = jsonReader.intValue();
                            break;
                        }
                    case 828977132:
                        if (!name.equals(ApiProtocol.KEY_IS_CONCURRENT)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            z = jsonReader.booleanValue();
                            break;
                        }
                    case 836670789:
                        if (!name.equals(ApiProtocol.KEY_TURN_SERVER)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list = CallInfoParser.parseTurn(jsonReader);
                            break;
                        }
                    case 1422043319:
                        if (!name.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str2 = jsonReader.stringValue();
                            break;
                        }
                    case 1702739560:
                        if (!name.equals(ApiProtocol.KEY_STUN_SERVER)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list2 = CallInfoParser.parseStun(jsonReader);
                            break;
                        }
                    case 1741102485:
                        if (!name.equals("endpoint")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str = jsonReader.stringValue();
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new CallInfo(str, null, str2, null, str3, str4, str5, str6, z, list, list2, z2, i, 10, null);
        }

        private final CallInfo startConversationDelegateResultParse(JsonReader jsonReader, String str, boolean z) {
            EmptyList emptyList = EmptyList.b;
            jsonReader.beginObject();
            List<PeerConnection.IceServer> list = emptyList;
            List<PeerConnection.IceServer> list2 = list;
            String str2 = null;
            List<String> list3 = null;
            String str3 = null;
            List<String> list4 = null;
            String str4 = null;
            boolean z2 = false;
            int i = 0;
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                switch (name.hashCode()) {
                    case 3541178:
                        if (!name.equals("stun")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list2 = CallInfoParser.parseStun(jsonReader);
                            break;
                        }
                    case 3571837:
                        if (!name.equals("turn")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list = CallInfoParser.parseTurn(jsonReader);
                            break;
                        }
                    case 25188487:
                        if (!name.equals("deviceIdx")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            i = jsonReader.intValue();
                            break;
                        }
                    case 684155794:
                        if (!name.equals("wtEndpoint")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str3 = jsonReader.stringValue();
                            break;
                        }
                    case 694870657:
                        if (!name.equals(SignalingProtocol.KEY_IS_CONCURRENT)) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            z2 = jsonReader.booleanValue();
                            break;
                        }
                    case 1102453157:
                        if (!name.equals("clientType")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str4 = jsonReader.stringValue();
                            break;
                        }
                    case 1419796927:
                        if (!name.equals("wsIpAddresses")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!z) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list3 = CallInfoParser.parseIpAddresses(jsonReader);
                            break;
                        }
                    case 1548879646:
                        if (!name.equals("wtIpAddresses")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!z) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            list4 = CallInfoParser.parseIpAddresses(jsonReader);
                            break;
                        }
                    case 1741102485:
                        if (!name.equals("endpoint")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            str2 = jsonReader.stringValue();
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new CallInfo(str2, list3, str3, list4, str, null, str4, null, z2, list, list2, false, i);
        }

        public final CallInfo createFromStartConversationDelegateResult$calls_sdk_release(StartConversationDelegate.Result.Success success, boolean z) {
            return startConversationDelegateResultParse(new PlainJsonReader(success.getInternalCallerParams()), success.getConversationId(), z);
        }

        public final JsonParser<CallInfo> getPARSER() {
            return CallInfo.PARSER;
        }

        private Companion() {
        }
    }

    static {
        final Companion companion = new Companion(null);
        Companion = companion;
        PARSER = new JsonParser() { // from class: xsna.z39
            @Override // ru.ok.android.api.json.JsonParser
            public final Object parse(JsonReader jsonReader) {
                return CallInfo.Companion.this.parse(jsonReader);
            }
        };
    }

    public CallInfo() {
        this(null, null, null, null, null, null, null, null, false, null, null, false, 0, 8191, null);
    }

    private static final CallInfo parse(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        return Companion.parse(jsonReader);
    }

    public final String getFormattedJoinLink(String str) {
        return fo8.a(str, this.joinLink);
    }

    public final ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turnServer);
        linkedList.addAll(this.stunServer);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        return conversationParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallInfo(String str, List<String> list, String str2, List<String> list2, String str3, String str4, String str5, String str6, boolean z, List<? extends PeerConnection.IceServer> list3, List<? extends PeerConnection.IceServer> list4, boolean z2, int i) {
        this.endpoint = str;
        this.wsIps = list;
        this.wtEndpoint = str2;
        this.wtIps = list2;
        this.id = str3;
        this.token = str4;
        this.clientType = str5;
        this.joinLink = str6;
        this.isConcurrent = z;
        this.turnServer = list3;
        this.stunServer = list4;
        this.isP2PForbidden = z2;
        this.deviceIndex = i;
    }

    public CallInfo(String str, List list, String str2, List list2, String str3, String str4, String str5, String str6, boolean z, List list3, List list4, boolean z2, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) == 0 ? str6 : null, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? EmptyList.b : list3, (i2 & 1024) != 0 ? EmptyList.b : list4, (i2 & 2048) != 0 ? false : z2, (i2 & 4096) != 0 ? 0 : i);
    }
}
