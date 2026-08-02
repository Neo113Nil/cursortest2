package defpackage;

import com.airbnb.lottie.parser.moshi.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class cyr {
    public static final hzk a = hzk.n("ch", "size", "w", "style", "fFamily", Constants.KEY_DATA);
    public static final hzk b = hzk.n("shapes");

    public static byr a(c cVar, nsz nszVar) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                c = cVar.nextString().charAt(0);
            } else if (o == 1) {
                cVar.nextDouble();
            } else if (o == 2) {
                d = cVar.nextDouble();
            } else if (o == 3) {
                str = cVar.nextString();
            } else if (o == 4) {
                str2 = cVar.nextString();
            } else if (o != 5) {
                cVar.v();
                cVar.skipValue();
            } else {
                cVar.c();
                while (cVar.hasNext()) {
                    if (cVar.o(b) != 0) {
                        cVar.v();
                        cVar.skipValue();
                    } else {
                        cVar.a();
                        while (cVar.hasNext()) {
                            arrayList.add((qhr0) fhe.a(cVar, nszVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new byr(arrayList, c, d, str, str2);
    }
}
