package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class iyk0 {
    public static final hzk a = hzk.n("nm", "r", "hd");

    public static eyk0 a(c cVar, nsz nszVar) {
        boolean z = false;
        String str = null;
        be2 be2Var = null;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                be2Var = bb1.C(cVar, nszVar, true);
            } else if (o != 2) {
                cVar.skipValue();
            } else {
                z = cVar.nextBoolean();
            }
        }
        if (z) {
            return null;
        }
        return new eyk0(str, be2Var);
    }
}
