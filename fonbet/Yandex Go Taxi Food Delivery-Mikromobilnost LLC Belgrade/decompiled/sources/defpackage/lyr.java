package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class lyr {
    public static final hzk a = hzk.n("fFamily", "fName", "fStyle", "ascent");

    public static xxr a(c cVar) {
        cVar.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                str2 = cVar.nextString();
            } else if (o == 2) {
                str3 = cVar.nextString();
            } else if (o != 3) {
                cVar.v();
                cVar.skipValue();
            } else {
                cVar.nextDouble();
            }
        }
        cVar.e();
        return new xxr(str, str2, str3);
    }
}
