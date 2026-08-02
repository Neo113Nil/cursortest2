package ru.ok.android.externcalls.sdk.api;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.api.json.org.OrgJsonReaders;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.rate.Question;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.util.compressor.LZ4;
import xsna.csj;
import xsna.i5s;

/* loaded from: classes9.dex */
public class ConversationParams {
    private static final String LOG_TAG = "ConversationParams";
    public static final JsonParser<ConversationParams> PARSER = new csj();
    public String clientType;
    public int deviceIndex;
    public String endpoint;
    public String id;
    public boolean isP2PForbidden;

    @Nullable
    public Integer ispAsNo;

    @Nullable
    public String ispAsOrg;

    @Nullable
    public String locCc;

    @Nullable
    public String locReg;
    public RateCallData rateCallData;
    public List<PeerConnection.IceServer> stunTurnServers = new ArrayList();
    public String token;
    public List<String> wsIps;
    public String wtEndpoint;
    public List<String> wtIps;

    public static ConversationParams decode(String str) {
        int parseInt;
        try {
            String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (split.length < 2 || (parseInt = Integer.parseInt(split[0])) <= 0) {
                return null;
            }
            byte[] bArr = new byte[parseInt];
            if (LZ4.decompress(Base64.decode(split[1], 0), bArr) != parseInt) {
                return null;
            }
            return parseCallParamsCompact(new JSONObject(new String(bArr)));
        } catch (Throwable th) {
            throw new RuntimeException("Error decode conversation params", th);
        }
    }

    @Nullable
    public static ConversationParams fromInternalParams(String str, JsonReader jsonReader, boolean z) {
        char c;
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.id = str;
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                switch (name.hashCode()) {
                    case 3541178:
                        if (name.equals("stun")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3571837:
                        if (name.equals("turn")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 684155794:
                        if (name.equals("wtEndpoint")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1102453157:
                        if (name.equals("clientType")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1419796927:
                        if (name.equals("wsIpAddresses")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1548879646:
                        if (name.equals("wtIpAddresses")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1741102485:
                        if (name.equals("endpoint")) {
                            c = 0;
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
                        conversationParams.endpoint = jsonReader.stringValue();
                        break;
                    case 1:
                        conversationParams.wtEndpoint = jsonReader.stringValue();
                        break;
                    case 2:
                        conversationParams.clientType = jsonReader.stringValue();
                        break;
                    case 3:
                        arrayList.addAll(CallInfoParser.parseStun(jsonReader));
                        break;
                    case 4:
                        arrayList.addAll(CallInfoParser.parseTurn(jsonReader));
                        break;
                    case 5:
                        if (!z) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            conversationParams.wsIps = CallInfoParser.parseIpAddresses(jsonReader);
                            break;
                        }
                    case 6:
                        if (!z) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            conversationParams.wtIps = CallInfoParser.parseIpAddresses(jsonReader);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            conversationParams.stunTurnServers = arrayList;
            return conversationParams;
        } catch (Exception e) {
            GlobalRTCLogger.logException(LOG_TAG, e.getMessage() == null ? "Exception during parsing internal params ".concat(e.getClass().getName()) : e.getMessage(), e);
            return null;
        }
    }

    private static List<String> jsonArrayToStringList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i, null);
            if (optString != null) {
                linkedList.add(optString);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    @Nullable
    public static ConversationParams parseCallParams(JSONObject jSONObject) {
        try {
            ConversationParams conversationParams = new ConversationParams();
            conversationParams.token = jSONObject.getString("token");
            conversationParams.deviceIndex = jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX, 0);
            conversationParams.clientType = jSONObject.optString("client_type");
            conversationParams.rateCallData = parseRateCallData(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject(ApiProtocol.KEY_TURN_SERVER);
            if (optJSONObject == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null turn", new NullPointerException("null turn"));
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("urls");
                String optString = optJSONObject.optString("username", null);
                String optString2 = optJSONObject.optString("credential", null);
                if (optJSONArray != null && optString != null && optString2 != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(optJSONArray.getString(i)).setUsername(optString).setPassword(optString2).createIceServer());
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(ApiProtocol.KEY_STUN_SERVER);
            if (optJSONObject2 == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null stun", new NullPointerException("null stun"));
            } else {
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("urls");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(optJSONArray2.getString(i2)).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString("endpoint");
            conversationParams.wtEndpoint = jSONObject.optString(ApiProtocol.KEY_WT_ENDPOINT, null);
            if (jSONObject.has("isp_as_no")) {
                conversationParams.ispAsNo = Integer.valueOf(jSONObject.optInt("isp_as_no"));
            }
            conversationParams.ispAsOrg = jSONObject.optString("isp_as_org");
            conversationParams.locCc = jSONObject.optString("loc_cc");
            conversationParams.locReg = jSONObject.optString("loc_reg");
            return conversationParams;
        } catch (JSONException e) {
            GlobalRTCLogger.logException(LOG_TAG, "json exception", e);
            return null;
        }
    }

    private static ConversationParams parseCallParamsCompact(@NonNull JSONObject jSONObject) {
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.token = jSONObject.getString("tkn");
            conversationParams.clientType = jSONObject.optString("srcp");
            String optString = jSONObject.optString("trne", null);
            String optString2 = jSONObject.optString("trnu", null);
            String optString3 = jSONObject.optString("trnp", null);
            if (optString != null && !optString.isEmpty() && optString2 != null && optString3 != null) {
                for (String str : optString.split(StringUtils.COMMA)) {
                    if (!str.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str).setUsername(optString2).setPassword(optString3).createIceServer());
                    }
                }
            }
            String optString4 = jSONObject.optString("stne", null);
            if (optString4 != null && !optString4.isEmpty()) {
                for (String str2 : optString4.split(StringUtils.COMMA)) {
                    if (!str2.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str2).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString("wse");
            conversationParams.wsIps = jsonArrayToStringList(jSONObject.optJSONArray("wsip"));
            conversationParams.wtEndpoint = jSONObject.optString("wte", null);
            conversationParams.wtIps = jsonArrayToStringList(jSONObject.optJSONArray("wtip"));
            return conversationParams;
        } catch (JSONException e) {
            throw new RuntimeException("No token provided", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @NonNull
    public static RateCallData parseRateCallData(JSONObject jSONObject) throws JSONException {
        ?? r2;
        int optInt = jSONObject.optInt("max_rate_for_question", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("questions");
        if (optJSONArray != null) {
            r2 = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                r2.add(new Question(jSONObject2.getInt("id"), jSONObject2.getString("text")));
            }
        } else {
            r2 = Collections.EMPTY_LIST;
        }
        return new RateCallData(optInt, r2);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationParams{endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        sb.append(this.token);
        sb.append("', rateCallData=");
        sb.append(this.rateCallData);
        sb.append(", deviceIndex=");
        sb.append(this.deviceIndex);
        sb.append(", stunTurnServers=");
        sb.append(this.stunTurnServers);
        sb.append(", ispAsNo=");
        sb.append(this.ispAsNo);
        sb.append(", ispAsOrg='");
        sb.append(this.ispAsOrg);
        sb.append("', locCc='");
        sb.append(this.locCc);
        sb.append("', locReg='");
        return i5s.a(sb, this.locReg, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static ConversationParams parseCallParams(@NonNull JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        return parseCallParams(OrgJsonReaders.orgJsonObjectValue(jsonReader));
    }
}
