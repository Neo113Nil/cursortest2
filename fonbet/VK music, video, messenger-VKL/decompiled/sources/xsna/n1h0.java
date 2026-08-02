package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.m1h0;

/* compiled from: SaveableStateRegistry.kt */
/* loaded from: classes11.dex */
public final class n1h0 implements m1h0 {
    public final izs<Object, Boolean> b;
    public final ph50<String, List<Object>> c;
    public ph50<String, List<gzs<Object>>> d;

    /* compiled from: SaveableStateRegistry.kt */
    public static final class a implements m1h0.a {
        public final /* synthetic */ ph50<String, List<gzs<Object>>> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ gzs<Object> c;

        public a(ph50<String, List<gzs<Object>>> ph50Var, String str, gzs<? extends Object> gzsVar) {
            this.a = ph50Var;
            this.b = str;
            this.c = gzsVar;
        }

        @Override // xsna.m1h0.a
        public final void a() {
            ph50<String, List<gzs<Object>>> ph50Var = this.a;
            String str = this.b;
            List<gzs<Object>> n = ph50Var.n(str);
            if (n != null) {
                n.remove(this.c);
            }
            List<gzs<Object>> list = n;
            if (list == null || list.isEmpty()) {
                return;
            }
            ph50Var.p(str, n);
        }
    }

    public n1h0(Map<String, ? extends List<? extends Object>> map, izs<Object, Boolean> izsVar) {
        ph50<String, List<Object>> ph50Var;
        this.b = izsVar;
        if (map == null || map.isEmpty()) {
            ph50Var = null;
        } else {
            ph50Var = new ph50<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                ph50Var.p(entry.getKey(), entry.getValue());
            }
        }
        this.c = ph50Var;
    }

    @Override // xsna.m1h0
    public final boolean a(Object obj) {
        return this.b.invoke(obj).booleanValue();
    }

    @Override // xsna.m1h0
    public final m1h0.a b(String str, gzs<? extends Object> gzsVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ro.j(str.charAt(i))) {
                ph50<String, List<gzs<Object>>> ph50Var = this.d;
                if (ph50Var == null) {
                    ph50Var = h5h0.b();
                    this.d = ph50Var;
                }
                List<gzs<Object>> d = ph50Var.d(str);
                if (d == null) {
                    d = new ArrayList<>();
                    ph50Var.p(str, d);
                }
                d.add(gzsVar);
                return new a(ph50Var, str, gzsVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // xsna.m1h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, List<Object>> d() {
        char c;
        long j;
        long j2;
        long j3;
        ph50<String, List<gzs<Object>>> ph50Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        ph50<String, List<Object>> ph50Var2 = this.c;
        if (ph50Var2 == null && this.d == null) {
            return jgp.b;
        }
        int i3 = 0;
        int i4 = ph50Var2 != null ? ph50Var2.e : 0;
        ph50<String, List<gzs<Object>>> ph50Var3 = this.d;
        HashMap hashMap = new HashMap(i4 + (ph50Var3 != null ? ph50Var3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (ph50Var2 != null) {
            Object[] objArr = ph50Var2.b;
            Object[] objArr2 = ph50Var2.c;
            long[] jArr3 = ph50Var2.a;
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
                ph50Var = this.d;
                if (ph50Var != null) {
                    Object[] objArr3 = ph50Var.b;
                    Object[] objArr4 = ph50Var.c;
                    long[] jArr4 = ph50Var.a;
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
                                            Object invoke = ((gzs) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!a(invoke)) {
                                                    throw new IllegalStateException(crx0.j(invoke).toString());
                                                }
                                                hashMap.put(str, e43.a(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((gzs) list.get(i3)).invoke();
                                                if (invoke2 != null && !a(invoke2)) {
                                                    throw new IllegalStateException(crx0.j(invoke2).toString());
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
        ph50Var = this.d;
        if (ph50Var != null) {
        }
        return hashMap;
    }

    @Override // xsna.m1h0
    public final Object e(String str) {
        ph50<String, List<Object>> ph50Var = this.c;
        List<Object> n = ph50Var != null ? ph50Var.n(str) : null;
        List<Object> list = n;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (n.size() > 1 && ph50Var != null) {
            ph50Var.l(str, n.subList(1, n.size()));
        }
        return n.get(0);
    }
}
