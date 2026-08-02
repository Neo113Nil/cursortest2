package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class csj implements JsonParser {
    @Override // ru.ok.android.api.json.JsonParser
    public final Object parse(JsonReader jsonReader) {
        ConversationParams parseCallParams;
        parseCallParams = ConversationParams.parseCallParams(jsonReader);
        return parseCallParams;
    }
}
