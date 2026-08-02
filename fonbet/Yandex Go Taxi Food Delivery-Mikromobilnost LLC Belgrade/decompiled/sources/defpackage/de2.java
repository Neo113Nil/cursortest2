package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public abstract class de2 {
    public static final hzk a = hzk.n("k", RemoteBioParameters.X, RemoteBioParameters.Y);

    public static yvi0 a(c cVar, nsz nszVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.k() == JsonReader$Token.BEGIN_ARRAY) {
            cVar.a();
            while (cVar.hasNext()) {
                c cVar2 = cVar;
                nsz nszVar2 = nszVar;
                arrayList.add(new wq90(nszVar2, tkx.b(cVar2, nszVar2, zw21.c(), kl40.D, cVar.k() == JsonReader$Token.BEGIN_OBJECT, false)));
                cVar = cVar2;
                nszVar = nszVar2;
            }
            cVar.d();
            ukx.b(arrayList);
        } else {
            arrayList.add(new rkx(yex.b(cVar, zw21.c())));
        }
        return new yvi0(arrayList);
    }

    public static ie2 b(c cVar, nsz nszVar) {
        cVar.c();
        yvi0 yvi0Var = null;
        be2 be2Var = null;
        boolean z = false;
        be2 be2Var2 = null;
        while (cVar.k() != JsonReader$Token.END_OBJECT) {
            int o = cVar.o(a);
            if (o == 0) {
                yvi0Var = a(cVar, nszVar);
            } else if (o != 1) {
                if (o != 2) {
                    cVar.v();
                    cVar.skipValue();
                } else if (cVar.k() == JsonReader$Token.STRING) {
                    cVar.skipValue();
                    z = true;
                } else {
                    be2Var = bb1.C(cVar, nszVar, true);
                }
            } else if (cVar.k() == JsonReader$Token.STRING) {
                cVar.skipValue();
                z = true;
            } else {
                be2Var2 = bb1.C(cVar, nszVar, true);
            }
        }
        cVar.e();
        if (z) {
            nszVar.a("Lottie doesn't support expressions.");
        }
        return yvi0Var != null ? yvi0Var : new ee2(be2Var2, be2Var);
    }
}
