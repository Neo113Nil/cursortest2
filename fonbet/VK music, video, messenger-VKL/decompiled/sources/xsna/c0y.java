package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c0y implements JsonParser {
    @Override // ru.ok.android.api.json.JsonParser
    public final Object parse(JsonReader jsonReader) {
        JoinConversation.Response PARSER$lambda$0;
        PARSER$lambda$0 = JoinConversation.Response.PARSER$lambda$0(jsonReader);
        return PARSER$lambda$0;
    }
}
