package defpackage;

import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class b76 {
    public static final hzk a = hzk.n("ef");
    public static final hzk b = hzk.n("ty", "v");

    public static cot a(c cVar, nsz nszVar) {
        cot cotVar = null;
        while (cVar.hasNext()) {
            if (cVar.o(a) != 0) {
                cVar.v();
                cVar.skipValue();
            } else {
                cVar.a();
                while (cVar.hasNext()) {
                    cVar.c();
                    cot cotVar2 = null;
                    while (true) {
                        boolean z = false;
                        while (cVar.hasNext()) {
                            int o = cVar.o(b);
                            if (o != 0) {
                                if (o != 1) {
                                    cVar.v();
                                    cVar.skipValue();
                                } else if (z) {
                                    cotVar2 = new cot(9, bb1.C(cVar, nszVar, true));
                                } else {
                                    cVar.skipValue();
                                }
                            } else if (cVar.nextInt() == 0) {
                                z = true;
                            }
                        }
                    }
                    cVar.e();
                    if (cotVar2 != null) {
                        cotVar = cotVar2;
                    }
                }
                cVar.d();
            }
        }
        return cotVar;
    }
}
