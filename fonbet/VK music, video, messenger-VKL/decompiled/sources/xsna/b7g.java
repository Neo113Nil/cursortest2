package xsna;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* loaded from: classes12.dex */
public final class b7g implements zjr0<Integer> {
    public static final b7g b = new b7g();

    @Override // xsna.zjr0
    public final Integer b(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.q() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        double n = jsonReader.n();
        double n2 = jsonReader.n();
        double n3 = jsonReader.n();
        double n4 = jsonReader.q() == JsonReader.Token.NUMBER ? jsonReader.n() : 1.0d;
        if (z) {
            jsonReader.endArray();
        }
        if (n <= 1.0d && n2 <= 1.0d && n3 <= 1.0d) {
            n *= 255.0d;
            n2 *= 255.0d;
            n3 *= 255.0d;
            if (n4 <= 1.0d) {
                n4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) n4, (int) n, (int) n2, (int) n3));
    }
}
