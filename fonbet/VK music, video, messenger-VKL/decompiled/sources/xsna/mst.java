package xsna;

import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.mst;

/* compiled from: GetLogUploadUrl.kt */
/* loaded from: classes8.dex */
public final class mst {
    public static final lst b;
    public final String a;

    /* compiled from: GetLogUploadUrl.kt */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.lst] */
    static {
        final a aVar = new a();
        b = new JsonParser() { // from class: xsna.lst
            @Override // ru.ok.android.api.json.JsonParser
            public final Object parse(JsonReader jsonReader) {
                String str;
                mst.a.this.getClass();
                jsonReader.beginObject();
                while (true) {
                    if (!jsonReader.hasNext()) {
                        str = null;
                        break;
                    }
                    if (epx.f(jsonReader.name(), ApiProtocol.KEY_UPLOAD_URL)) {
                        str = jsonReader.stringValue();
                        break;
                    }
                }
                jsonReader.endObject();
                return new mst(str);
            }
        };
    }

    public mst() {
        this(null);
    }

    public mst(String str) {
        this.a = str;
    }
}
