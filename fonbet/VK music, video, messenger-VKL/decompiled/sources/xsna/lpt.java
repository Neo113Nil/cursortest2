package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class lpt implements JsonParser {
    @Override // ru.ok.android.api.json.JsonParser
    public final Object parse(JsonReader jsonReader) {
        GetAnonymTokenByLinkRequest.Response lambda$static$0;
        lambda$static$0 = GetAnonymTokenByLinkRequest.lambda$static$0(jsonReader);
        return lambda$static$0;
    }
}
