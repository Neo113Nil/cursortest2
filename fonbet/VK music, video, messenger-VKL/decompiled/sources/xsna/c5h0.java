package xsna;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes12.dex */
public final class c5h0 implements zjr0<b5h0> {
    public static final c5h0 b = new c5h0();

    @Override // xsna.zjr0
    public final b5h0 b(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.q() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float n = (float) jsonReader.n();
        float n2 = (float) jsonReader.n();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new b5h0((n / 100.0f) * f, (n2 / 100.0f) * f);
    }
}
