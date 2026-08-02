package defpackage;

import android.graphics.Color;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class j3k0 {
    public static int a(String str) {
        Object failure;
        List W;
        try {
            W = evu0.W(evu0.S(Extension.C_BRAKE, evu0.Q("rgba(", new Regex("\\s").j(str, ""))), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (W.size() != 4) {
            throw new IllegalArgumentException("Invalid RGBA format: ".concat(str).toString());
        }
        failure = Integer.valueOf(Color.argb(y6i0.d(Integer.parseInt((String) W.get(3)), 0, 255), y6i0.d(Integer.parseInt((String) W.get(0)), 0, 255), y6i0.d(Integer.parseInt((String) W.get(1)), 0, 255), y6i0.d(Integer.parseInt((String) W.get(2)), 0, 255)));
        Throwable a = Result.a(failure);
        if (a == null) {
            return ((Number) failure).intValue();
        }
        throw new GraphQLParseException("Couldn't parse RGBA color: ".concat(str), a);
    }

    public static PlusColor b(jec jecVar) {
        PlusColor.Gradient gradient;
        PlusColor.Gradient gradient2;
        gec gecVar = jecVar.b;
        if (gecVar != null) {
            return new PlusColor.Color(a(gecVar.a));
        }
        dec decVar = jecVar.c;
        if (decVar != null) {
            return new PlusColor.Color(a(decVar.b.a));
        }
        eec eecVar = jecVar.d;
        if (eecVar != null) {
            List M = a.M(eecVar.b);
            if (((ArrayList) M).isEmpty()) {
                throw new GraphQLParseException("Linear gradient colors are empty", null);
            }
            ArrayList arrayList = new ArrayList(tcc.n(M, 10));
            Iterator it = M.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(a(((bec) it.next()).a.a)));
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(M, 10));
            Iterator it2 = M.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((bec) it2.next()).b));
            }
            gradient = new PlusColor.Gradient(Collections.singletonList(new PlusGradient.Linear(arrayList, arrayList2, eecVar.a)));
        } else {
            gradient = null;
        }
        if (gradient != null) {
            return gradient;
        }
        fec fecVar = jecVar.e;
        if (fecVar != null) {
            ArrayList arrayList3 = fecVar.d;
            hec hecVar = fecVar.b;
            iec iecVar = fecVar.c;
            List M2 = a.M(arrayList3);
            if (((ArrayList) M2).isEmpty()) {
                throw new GraphQLParseException("Radial gradient colors are empty", null);
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(M2, 10));
            Iterator it3 = M2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(a(((zdc) it3.next()).a.a)));
            }
            ArrayList arrayList5 = new ArrayList(tcc.n(M2, 10));
            Iterator it4 = M2.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Double.valueOf(((zdc) it4.next()).b));
            }
            gradient2 = new PlusColor.Gradient(Collections.singletonList(new PlusGradient.Radial(arrayList4, arrayList5, new Pair(Double.valueOf(iecVar.a), Double.valueOf(iecVar.b)), new Pair(Double.valueOf(hecVar.a), Double.valueOf(hecVar.b)))));
        } else {
            gradient2 = null;
        }
        if (gradient2 != null) {
            return gradient2;
        }
        throw new GraphQLParseException("Unexpected type of color", null);
    }
}
