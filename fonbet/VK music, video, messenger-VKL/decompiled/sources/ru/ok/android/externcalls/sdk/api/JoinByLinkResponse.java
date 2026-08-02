package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import xsna.azx;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class JoinByLinkResponse {
    public static final JsonParser<JoinByLinkResponse> PARSER = new azx();
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isP2PForbidden;
    public final List<PeerConnection.IceServer> stun;
    public final String token;
    public final List<PeerConnection.IceServer> turn;
    public final String wtEndpoint;

    public JoinByLinkResponse(String str, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.id = str;
        this.deviceIndex = i;
        this.turn = list;
        this.endpoint = str2;
        this.wtEndpoint = str3;
        this.token = str4;
        this.isP2PForbidden = z;
        this.stun = list2;
        this.clientType = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JoinByLinkResponse lambda$static$0(JsonReader jsonReader) throws IOException, JsonParseException {
        List<PeerConnection.IceServer> list = Collections.EMPTY_LIST;
        jsonReader.beginObject();
        List<PeerConnection.IceServer> list2 = list;
        List<PeerConnection.IceServer> list3 = list2;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            name.getClass();
            switch (name) {
                case "client_type":
                    str5 = jsonReader.stringValue();
                    break;
                case "p2p_forbidden":
                    z = jsonReader.booleanValue();
                    break;
                case "id":
                    str = jsonReader.stringValue();
                    break;
                case "token":
                    str4 = jsonReader.stringValue();
                    break;
                case "device_idx":
                    i = jsonReader.intValue();
                    break;
                case "turn_server":
                    list2 = CallInfoParser.parseTurn(jsonReader);
                    break;
                case "wt_endpoint":
                    str3 = jsonReader.stringValue();
                    break;
                case "stun_server":
                    list3 = CallInfoParser.parseStun(jsonReader);
                    break;
                case "endpoint":
                    str2 = jsonReader.stringValue();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new JoinByLinkResponse(str, list2, list3, str2, str3, str4, str5, z, i);
    }

    public ConversationParams toParams(@Nullable ConversationParams conversationParams) {
        ConversationParams conversationParams2 = new ConversationParams();
        LinkedList linkedList = new LinkedList(this.turn);
        if (conversationParams != null) {
            conversationParams2.rateCallData = conversationParams.rateCallData;
            linkedList.addAll(conversationParams.stunTurnServers);
        } else {
            conversationParams2.rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
        }
        conversationParams2.endpoint = this.endpoint;
        conversationParams2.deviceIndex = this.deviceIndex;
        conversationParams2.token = this.token;
        conversationParams2.stunTurnServers = linkedList;
        return conversationParams2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("JoinByLinkResponse{id='");
        sb.append(this.id);
        sb.append("', deviceIndex='");
        sb.append(this.deviceIndex);
        sb.append("', turn=");
        sb.append(this.turn);
        sb.append(", endpoint='");
        sb.append(this.endpoint);
        sb.append("', wtEndpoint='");
        sb.append(this.wtEndpoint);
        sb.append("', token='");
        return i5s.a(sb, this.token, "'}");
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turn);
        linkedList.addAll(this.stun);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.wtEndpoint = this.wtEndpoint;
        conversationParams.deviceIndex = this.deviceIndex;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        conversationParams.isP2PForbidden = this.isP2PForbidden;
        return conversationParams;
    }
}
