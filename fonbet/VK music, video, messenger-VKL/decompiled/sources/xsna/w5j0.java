package xsna;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes12.dex */
public final class w5j0 implements zjr0<v5j0> {
    public static final w5j0 b = new w5j0();
    public static final JsonReader.a c = JsonReader.a.a("c", "v", "i", "o");

    @Override // xsna.zjr0
    public final v5j0 b(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.q() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int s = jsonReader.s(c);
            if (s == 0) {
                z = jsonReader.m();
            } else if (s == 1) {
                arrayList = mby.c(jsonReader, f);
            } else if (s == 2) {
                arrayList2 = mby.c(jsonReader, f);
            } else if (s != 3) {
                jsonReader.t();
                jsonReader.skipValue();
            } else {
                arrayList3 = mby.c(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.q() == JsonReader.Token.END_ARRAY) {
            jsonReader.endArray();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new v5j0(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i2 = i - 1;
            arrayList4.add(new qkk(ls20.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), ls20.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i3 = size - 1;
            arrayList4.add(new qkk(ls20.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), ls20.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new v5j0(pointF, z, arrayList4);
    }
}
