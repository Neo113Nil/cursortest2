package xsna;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes12.dex */
public final class aun implements zjr0<DocumentData> {
    public static final aun b = new aun();
    public static final JsonReader.a c = JsonReader.a.a("t", InneractiveMediationDefs.GENDER_FEMALE, UcumUtils.UCUM_SECONDS, com.mbridge.msdk.foundation.same.report.j.b, "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", DatabaseHelper.SIZE_COLUMN_NAME);

    @Override // xsna.zjr0
    public final DocumentData b(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        String str = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.s(c)) {
                case 0:
                    str = jsonReader.p();
                    break;
                case 1:
                    str2 = jsonReader.p();
                    break;
                case 2:
                    f2 = (float) jsonReader.n();
                    break;
                case 3:
                    int o = jsonReader.o();
                    DocumentData.Justification justification2 = DocumentData.Justification.CENTER;
                    if (o <= justification2.ordinal() && o >= 0) {
                        justification = DocumentData.Justification.values()[o];
                        break;
                    } else {
                        justification = justification2;
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.o();
                    break;
                case 5:
                    f3 = (float) jsonReader.n();
                    break;
                case 6:
                    f4 = (float) jsonReader.n();
                    break;
                case 7:
                    i2 = mby.a(jsonReader);
                    break;
                case 8:
                    i3 = mby.a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.n();
                    break;
                case 10:
                    z = jsonReader.m();
                    break;
                case 11:
                    jsonReader.beginArray();
                    pointF = new PointF(((float) jsonReader.n()) * f, ((float) jsonReader.n()) * f);
                    jsonReader.endArray();
                    break;
                case 12:
                    jsonReader.beginArray();
                    pointF2 = new PointF(((float) jsonReader.n()) * f, ((float) jsonReader.n()) * f);
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.t();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        DocumentData documentData = new DocumentData();
        documentData.a = str;
        documentData.b = str2;
        documentData.c = f2;
        documentData.d = justification;
        documentData.e = i;
        documentData.f = f3;
        documentData.g = f4;
        documentData.h = i2;
        documentData.i = i3;
        documentData.j = f5;
        documentData.k = z;
        documentData.l = pointF;
        documentData.m = pointF2;
        return documentData;
    }
}
