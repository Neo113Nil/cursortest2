package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class bsa1 extends i691 {
    public final h491 b;

    public bsa1(h491 h491Var) {
        this.b = h491Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.i691, defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        int hashCode = str.hashCode();
        h491 h491Var = this.b;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    cwa1.e(0, "getEventName", arrayList);
                    return new a791(h491Var.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    cwa1.e(0, "getTimestamp", arrayList);
                    return new n591(Double.valueOf(h491Var.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    cwa1.e(1, "getParamValue", arrayList);
                    String zzc = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                    HashMap hashMap = h491Var.b.c;
                    return mwa1.e(hashMap.containsKey(zzc) ? hashMap.get(zzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    cwa1.e(0, "getParams", arrayList);
                    HashMap hashMap2 = h491Var.b.c;
                    i691 i691Var = new i691();
                    for (String str2 : hashMap2.keySet()) {
                        i691Var.f(str2, mwa1.e(hashMap2.get(str2)));
                    }
                    return i691Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    cwa1.e(2, "setParamValue", arrayList);
                    String zzc2 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                    r691 b = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                    y391 y391Var = h491Var.b;
                    Object m = cwa1.m(b);
                    HashMap hashMap3 = y391Var.c;
                    if (m == null) {
                        hashMap3.remove(zzc2);
                        return b;
                    }
                    hashMap3.put(zzc2, y391.e(zzc2, hashMap3.get(zzc2), m));
                    return b;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    cwa1.e(1, "setEventName", arrayList);
                    r691 b2 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
                    if (r691.z5.equals(b2) || r691.A5.equals(b2)) {
                        ny61.g("Illegal event name");
                        return null;
                    }
                    h491Var.b.a = b2.zzc();
                    return new a791(b2.zzc());
                }
                break;
        }
        return super.b(str, cr71Var, arrayList);
    }
}
