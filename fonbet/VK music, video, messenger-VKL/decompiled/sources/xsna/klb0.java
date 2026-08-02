package xsna;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes12.dex */
public final class klb0 implements zjr0<PointF> {
    public static final klb0 b = new klb0();

    @Override // xsna.zjr0
    public final PointF b(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token q = jsonReader.q();
        if (q == JsonReader.Token.BEGIN_ARRAY) {
            return mby.b(jsonReader, f);
        }
        if (q == JsonReader.Token.BEGIN_OBJECT) {
            return mby.b(jsonReader, f);
        }
        if (q != JsonReader.Token.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + q);
        }
        PointF pointF = new PointF(((float) jsonReader.n()) * f, ((float) jsonReader.n()) * f);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
