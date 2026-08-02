package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes5.dex */
public final class itq {
    public final l7x0 a;

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kjg0 a(String str, pqi pqiVar) {
        oqi oqiVar;
        String str2;
        if (str == null || (oqiVar = (oqi) pqiVar.b.get(str)) == null) {
            return null;
        }
        Set set = (Set) pqiVar.d.get(oqiVar.a);
        if (set == null) {
            set = EmptySet.a;
        }
        ArrayList<mqi> arrayList = oqiVar.d;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((mqi) obj).a)) {
                arrayList2.add(obj);
            }
        }
        boolean z = arrayList2.size() != arrayList.size();
        boolean z2 = !z;
        if (z) {
            jgz jgzVar = jgz.a;
            jgz.c(new IllegalStateException("Poll answers don't have unique ids"));
        }
        String str3 = oqiVar.a;
        String str4 = oqiVar.b;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        for (mqi mqiVar : arrayList) {
            Integer num = mqiVar.c;
            if (num != null) {
                int intValue = num.intValue();
                if (Character.isValidCodePoint(intValue)) {
                    str2 = new String(Character.toChars(intValue));
                    String str5 = mqiVar.b;
                    if (str2 == null) {
                        str5 = g8e.p(str2, " ", str5);
                    }
                    String str6 = mqiVar.a;
                    arrayList3.add(new dl2(str6, str5, set.contains(str6)));
                }
            }
            str2 = null;
            String str52 = mqiVar.b;
            if (str2 == null) {
            }
            String str62 = mqiVar.a;
            arrayList3.add(new dl2(str62, str52, set.contains(str62)));
        }
        return new kjg0(str3, str4, arrayList3, oqiVar.f, z2);
    }
}
