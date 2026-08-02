package yads;

import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public abstract class s92 {
    public static g92 a(qp2 qp2Var, long j, List list) {
        lr lrVar = qp2Var.p;
        if (lrVar == null) {
            return new g92(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, null, g92.a(list), list, true);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((r01) it.next()).a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = lrVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (r01 r01Var : lrVar.h) {
                    if (!treeSet.contains(r01Var.a)) {
                        arrayList.add(r01Var);
                    }
                }
            }
        } else if (!lrVar.g.isEmpty()) {
            for (Map.Entry entry : lrVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new g92(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, lrVar.a, g92.a(arrayList), arrayList, true);
    }

    public static byte[] a(InputStream inputStream, int i, gr grVar) {
        byte[] bArr;
        dh2 dh2Var = new dh2(grVar, i);
        try {
            bArr = grVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    dh2Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z = pn3.a;
                    }
                    grVar.a(bArr);
                    dh2Var.close();
                    throw th;
                }
            }
            byte[] byteArray = dh2Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z2 = pn3.a;
            }
            grVar.a(bArr);
            dh2Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
