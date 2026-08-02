package xsna;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: JsonUtils.java */
/* loaded from: classes12.dex */
public final class mby {
    public static final JsonReader.a a = JsonReader.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int n = (int) (jsonReader.n() * 255.0d);
        int n2 = (int) (jsonReader.n() * 255.0d);
        int n3 = (int) (jsonReader.n() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, n, n2, n3);
    }

    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        int i = a.a[jsonReader.q().ordinal()];
        if (i == 1) {
            float n = (float) jsonReader.n();
            float n2 = (float) jsonReader.n();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return new PointF(n * f, n2 * f);
        }
        if (i == 2) {
            jsonReader.beginArray();
            float n3 = (float) jsonReader.n();
            float n4 = (float) jsonReader.n();
            while (jsonReader.q() != JsonReader.Token.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new PointF(n3 * f, n4 * f);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + jsonReader.q());
        }
        jsonReader.beginObject();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            int s = jsonReader.s(a);
            if (s == 0) {
                f2 = d(jsonReader);
            } else if (s != 1) {
                jsonReader.t();
                jsonReader.skipValue();
            } else {
                f3 = d(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    public static ArrayList c(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.q() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) throws IOException {
        JsonReader.Token q = jsonReader.q();
        int i = a.a[q.ordinal()];
        if (i == 1) {
            return (float) jsonReader.n();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + q);
        }
        jsonReader.beginArray();
        float n = (float) jsonReader.n();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return n;
    }
}
