package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qlc implements JsonParser {
    @Override // ru.ok.android.api.json.JsonParser
    public final Object parse(JsonReader jsonReader) {
        ClientSupportedCodecs.Response _get_okParser_$lambda$0;
        _get_okParser_$lambda$0 = ClientSupportedCodecs.Request._get_okParser_$lambda$0(jsonReader);
        return _get_okParser_$lambda$0;
    }
}
