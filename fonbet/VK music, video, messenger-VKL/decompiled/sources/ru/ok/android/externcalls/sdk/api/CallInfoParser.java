package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* compiled from: CallInfoParser.kt */
/* loaded from: classes9.dex */
public final class CallInfoParser {
    public static final CallInfoParser INSTANCE = new CallInfoParser();

    private CallInfoParser() {
    }

    public static final List<String> parseIpAddresses(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.stringValue());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static final List<PeerConnection.IceServer> parseStun(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            if (name.hashCode() == 3598564 && name.equals("urls")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(jsonReader.stringValue());
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).createIceServer());
            }
        }
        return arrayList2;
    }

    public static final List<PeerConnection.IceServer> parseTurn(JsonReader jsonReader) throws IOException, JsonTypeMismatchException {
        ArrayList<String> arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            int hashCode = name.hashCode();
            if (hashCode != -683415465) {
                if (hashCode != -265713450) {
                    if (hashCode == 3598564 && name.equals("urls")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.stringValue());
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.skipValue();
                } else if (name.equals("username")) {
                    str2 = jsonReader.nullableStringValue();
                } else {
                    jsonReader.skipValue();
                }
            } else if (name.equals("credential")) {
                str = jsonReader.nullableStringValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : arrayList) {
            if (str3.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str3).setUsername(str2).setPassword(str).setTlsCertPolicy(PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE).createIceServer());
            }
        }
        return arrayList2;
    }
}
