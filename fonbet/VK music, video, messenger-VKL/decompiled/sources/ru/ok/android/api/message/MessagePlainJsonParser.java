package ru.ok.android.api.message;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;

/* compiled from: MessagePlainJsonParser.kt */
/* loaded from: classes9.dex */
public final class MessagePlainJsonParser implements JsonParser<String> {
    public static final MessagePlainJsonParser INSTANCE = new MessagePlainJsonParser();

    private MessagePlainJsonParser() {
    }

    @Override // ru.ok.android.api.json.JsonParser
    public String parse(JsonReader jsonReader) {
        int peek = jsonReader.peek();
        String str = null;
        if (peek == 110) {
            jsonReader.skipValue();
            return null;
        }
        if (peek != 123) {
            return jsonReader.stringValue();
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            if (name.hashCode() == 106748362 && name.equals("plain")) {
                str = jsonReader.stringValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return str;
    }
}
