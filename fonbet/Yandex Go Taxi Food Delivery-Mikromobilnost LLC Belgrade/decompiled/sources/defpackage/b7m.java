package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.io.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class b7m {
    public final x22 a;
    public final doc b;
    public final HashMap c = new HashMap();

    public b7m(x22 x22Var, doc docVar) {
        this.a = x22Var;
        this.b = docVar;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String m = b.m(new File(str));
        if (m.length() > 0) {
            return m;
        }
        return null;
    }

    public final void b(String str, String str2, String str3) {
        String f0 = evu0.f0('/', str, str);
        if (evu0.J(f0)) {
            f0 = null;
        }
        String a = a(str2);
        doc docVar = this.b;
        docVar.getClass();
        Pair[] pairArr = {new Pair("fileId", str), new Pair("source", f0), new Pair("file_ext", a), new Pair(CRLReasonCodeExtension.REASON, str3)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) it.next());
        }
        docVar.a.a("file_download_error", kotlin.collections.b.s(arrayList2));
    }
}
