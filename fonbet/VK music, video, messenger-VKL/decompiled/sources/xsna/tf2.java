package xsna;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes12.dex */
public final class tf2 {
    public static final JsonReader.a a = JsonReader.a.a(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static sf2 a(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (aVar.q() == JsonReader.Token.BEGIN_ARRAY) {
            aVar.beginArray();
            while (aVar.hasNext()) {
                com.airbnb.lottie.parser.moshi.a aVar2 = aVar;
                i700 i700Var2 = i700Var;
                arrayList.add(new mq90(i700Var2, qhy.b(aVar2, i700Var2, b3r0.c(), jgz.h, aVar.q() == JsonReader.Token.BEGIN_OBJECT, false)));
                aVar = aVar2;
                i700Var = i700Var2;
            }
            aVar.endArray();
            rhy.b(arrayList);
        } else {
            arrayList.add(new nhy(mby.b(aVar, b3r0.c())));
        }
        return new sf2(arrayList);
    }

    public static fg2 b(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        aVar.beginObject();
        sf2 sf2Var = null;
        nf2 nf2Var = null;
        boolean z = false;
        nf2 nf2Var2 = null;
        while (aVar.q() != JsonReader.Token.END_OBJECT) {
            int s = aVar.s(a);
            if (s == 0) {
                sf2Var = a(aVar, i700Var);
            } else if (s != 1) {
                if (s != 2) {
                    aVar.t();
                    aVar.skipValue();
                } else if (aVar.q() == JsonReader.Token.STRING) {
                    aVar.skipValue();
                    z = true;
                } else {
                    nf2Var = r490.l(aVar, i700Var, true);
                }
            } else if (aVar.q() == JsonReader.Token.STRING) {
                aVar.skipValue();
                z = true;
            } else {
                nf2Var2 = r490.l(aVar, i700Var, true);
            }
        }
        aVar.endObject();
        if (z) {
            i700Var.a("Lottie doesn't support expressions.");
        }
        return sf2Var != null ? sf2Var : new xf2(nf2Var2, nf2Var);
    }
}
