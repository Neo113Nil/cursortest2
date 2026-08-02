package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class utu implements JsonParser {
    public final /* synthetic */ int a;

    public /* synthetic */ utu(int i) {
        this.a = i;
    }

    @Override // ru.ok.android.api.json.JsonParser
    public final Object parse(JsonReader jsonReader) {
        HangupConversation.Response PARSER$lambda$0;
        switch (this.a) {
            case 0:
                PARSER$lambda$0 = HangupConversation.Response.PARSER$lambda$0(jsonReader);
                return PARSER$lambda$0;
            default:
                return jsonReader.stringValue();
        }
    }
}
