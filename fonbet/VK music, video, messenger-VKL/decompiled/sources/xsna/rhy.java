package xsna;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: KeyframesParser.java */
/* loaded from: classes12.dex */
public final class rhy {
    public static final JsonReader.a a = JsonReader.a.a(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(JsonReader jsonReader, i700 i700Var, float f, zjr0 zjr0Var, boolean z) throws IOException {
        JsonReader jsonReader2;
        i700 i700Var2;
        float f2;
        zjr0 zjr0Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.q() == JsonReader.Token.STRING) {
            i700Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.s(a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.q() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.q() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    i700 i700Var3 = i700Var;
                    float f3 = f;
                    zjr0 zjr0Var3 = zjr0Var;
                    boolean z3 = z;
                    nhy b = qhy.b(jsonReader3, i700Var3, f3, zjr0Var3, false, z3);
                    jsonReader2 = jsonReader3;
                    i700Var2 = i700Var3;
                    f2 = f3;
                    zjr0Var2 = zjr0Var3;
                    z2 = z3;
                    arrayList.add(b);
                } else {
                    jsonReader2 = jsonReader;
                    i700Var2 = i700Var;
                    f2 = f;
                    zjr0Var2 = zjr0Var;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(qhy.b(jsonReader2, i700Var2, f2, zjr0Var2, true, z2));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                i700Var = i700Var2;
                f = f2;
                zjr0Var = zjr0Var2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(qhy.b(jsonReader4, i700Var, f, zjr0Var, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            nhy nhyVar = (nhy) arrayList.get(i2);
            i2++;
            nhy nhyVar2 = (nhy) arrayList.get(i2);
            nhyVar.h = Float.valueOf(nhyVar2.g);
            if (nhyVar.c == 0 && (t = nhyVar2.b) != 0) {
                nhyVar.c = t;
                if (nhyVar instanceof mq90) {
                    ((mq90) nhyVar).d();
                }
            }
        }
        nhy nhyVar3 = (nhy) arrayList.get(i);
        if ((nhyVar3.b == 0 || nhyVar3.c == 0) && arrayList.size() > 1) {
            arrayList.remove(nhyVar3);
        }
    }
}
