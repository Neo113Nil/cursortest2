package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class m1m0 implements l1m0 {
    public final tls a;
    public final hz40 b;
    public hz40 c;

    public m1m0(Map map, tls tlsVar) {
        hz40 hz40Var;
        this.a = tlsVar;
        if (map == null || map.isEmpty()) {
            hz40Var = null;
        } else {
            hz40Var = new hz40(map.size());
            for (Map.Entry entry : map.entrySet()) {
                hz40Var.o(entry.getKey(), entry.getValue());
            }
        }
        this.b = hz40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    @Override // defpackage.l1m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        char c;
        long j;
        long j2;
        long j3;
        hz40 hz40Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        hz40 hz40Var2 = this.b;
        if (hz40Var2 == null && this.c == null) {
            return b.f();
        }
        int i3 = 0;
        int i4 = hz40Var2 != null ? hz40Var2.e : 0;
        hz40 hz40Var3 = this.c;
        HashMap hashMap = new HashMap(i4 + (hz40Var3 != null ? hz40Var3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (hz40Var2 != null) {
            Object[] objArr = hz40Var2.b;
            Object[] objArr2 = hz40Var2.c;
            long[] jArr3 = hz40Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                hz40Var = this.c;
                if (hz40Var != null) {
                    Object[] objArr3 = hz40Var.b;
                    Object[] objArr4 = hz40Var.c;
                    long[] jArr4 = hz40Var.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((sls) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!d(invoke)) {
                                                    xfo.g(cvw.w(invoke));
                                                    return null;
                                                }
                                                hashMap.put(str, scc.c(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((sls) list.get(i3)).invoke();
                                                if (invoke2 != null && !d(invoke2)) {
                                                    xfo.g(cvw.w(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        hz40Var = this.c;
        if (hz40Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.l1m0
    public final k1m0 c(sls slsVar, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!rza.b(str.charAt(i))) {
                hz40 hz40Var = this.c;
                if (hz40Var == null) {
                    hz40Var = cmm0.b();
                    this.c = hz40Var;
                }
                Object d = hz40Var.d(str);
                if (d == null) {
                    d = new ArrayList();
                    hz40Var.o(str, d);
                }
                ((List) d).add(slsVar);
                return new jb7(26, hz40Var, str, slsVar);
            }
        }
        ny61.g("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.l1m0
    public final boolean d(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.l1m0
    public final Object e(String str) {
        hz40 hz40Var = this.b;
        List list = hz40Var != null ? (List) hz40Var.m(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && hz40Var != null) {
        }
        return list.get(0);
    }
}
