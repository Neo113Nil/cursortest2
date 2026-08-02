package defpackage;

import androidx.compose.foundation.text.selection.i;
import androidx.compose.ui.semantics.g;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class fkq0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ fkq0(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    @Override // defpackage.sls
    public final Object invoke() {
        rzx rzxVar;
        zii0 zii0Var;
        int i;
        rzx c;
        int[] iArr;
        int i2;
        int[] iArr2;
        ?? r1;
        zii0 b;
        ckq0 ckq0Var;
        ArrayList arrayList;
        zy11 zy11Var;
        int i3;
        int i4 = this.a;
        zy11 zy11Var2 = zy11.a;
        int i5 = 0;
        int i6 = 1;
        i iVar = this.b;
        switch (i4) {
            case 0:
                wu60 wu60Var = (wu60) iVar.p.getValue();
                return new wu60(wu60Var != null ? wu60Var.a : 9205357640488583168L);
            case 1:
                wu60 wu60Var2 = (wu60) iVar.q.getValue();
                return new wu60(wu60Var2 != null ? wu60Var2.a : 9205357640488583168L);
            case 2:
                iVar.j();
                return zy11Var2;
            case 3:
                zkq0 zkq0Var = iVar.a;
                iVar.m.getValue();
                if (iVar.g() != null && (rzxVar = iVar.l) != null && rzxVar.d()) {
                    ArrayList c2 = zkq0Var.c(iVar.k());
                    ArrayList arrayList2 = new ArrayList(c2.size());
                    int size = c2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ho40 ho40Var = (ho40) c2.get(i7);
                        ckq0 ckq0Var2 = (ckq0) zkq0Var.a().e(ho40Var.a);
                        Pair pair = ckq0Var2 != null ? new Pair(ho40Var, ckq0Var2) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    int size2 = arrayList2.size();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3 = arrayList2;
                    if (size2 != 0 && size2 != 1) {
                        arrayList3 = scc.g(a.P(arrayList2), a.Z(arrayList2));
                    }
                    if (!arrayList3.isEmpty()) {
                        boolean isEmpty = arrayList3.isEmpty();
                        zii0 zii0Var2 = rx91.a;
                        if (isEmpty) {
                            zii0Var = zii0Var2;
                        } else {
                            int size3 = arrayList3.size();
                            int i8 = 0;
                            float f = Float.POSITIVE_INFINITY;
                            float f2 = Float.POSITIVE_INFINITY;
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.NEGATIVE_INFINITY;
                            while (i8 < size3) {
                                Pair pair2 = (Pair) arrayList3.get(i8);
                                ho40 ho40Var2 = (ho40) pair2.getFirst();
                                ckq0 ckq0Var3 = (ckq0) pair2.getSecond();
                                int i9 = ckq0Var3.a.b;
                                int i10 = ckq0Var3.b.b;
                                if (i9 == i10 || (c = ho40Var2.c()) == null) {
                                    i = size3;
                                } else {
                                    int min = Math.min(i9, i10);
                                    int max = Math.max(i9, i10) - i6;
                                    if (min == max) {
                                        iArr = new int[i6];
                                        iArr[i5] = min;
                                    } else {
                                        int[] iArr3 = new int[2];
                                        iArr3[i5] = min;
                                        iArr3[i6] = max;
                                        iArr = iArr3;
                                    }
                                    int length = iArr.length;
                                    int i11 = i5;
                                    float f5 = Float.POSITIVE_INFINITY;
                                    float f6 = Float.POSITIVE_INFINITY;
                                    float f7 = Float.NEGATIVE_INFINITY;
                                    float f8 = Float.NEGATIVE_INFINITY;
                                    while (i11 < length) {
                                        int i12 = iArr[i11];
                                        dry0 dry0Var = (dry0) ho40Var2.c.invoke();
                                        zii0 zii0Var3 = zii0.e;
                                        if (dry0Var == null) {
                                            i2 = size3;
                                            iArr2 = iArr;
                                        } else {
                                            i2 = size3;
                                            int length2 = dry0Var.a.a.b.length();
                                            iArr2 = iArr;
                                            if (length2 >= 1) {
                                                r1 = false;
                                                b = dry0Var.b(y6i0.d(i12, 0, length2 - 1));
                                                f5 = Math.min(f5, b.a);
                                                f6 = Math.min(f6, b.b);
                                                f7 = Math.max(f7, b.c);
                                                f8 = Math.max(f8, b.d);
                                                i11++;
                                                i5 = r1;
                                                size3 = i2;
                                                iArr = iArr2;
                                            }
                                        }
                                        b = zii0Var3;
                                        r1 = false;
                                        f5 = Math.min(f5, b.a);
                                        f6 = Math.min(f6, b.b);
                                        f7 = Math.max(f7, b.c);
                                        f8 = Math.max(f8, b.d);
                                        i11++;
                                        i5 = r1;
                                        size3 = i2;
                                        iArr = iArr2;
                                    }
                                    i = size3;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                    long floatToRawIntBits2 = Float.floatToRawIntBits(f7);
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(f8) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                                    long T = rzxVar.T(c, floatToRawIntBits);
                                    long T2 = rzxVar.T(c, floatToRawIntBits3 | (floatToRawIntBits2 << 32));
                                    f = Math.min(f, Float.intBitsToFloat((int) (T >> 32)));
                                    f2 = Math.min(f2, Float.intBitsToFloat((int) (T & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                    f3 = Math.max(f3, Float.intBitsToFloat((int) (T2 >> 32)));
                                    f4 = Math.max(f4, Float.intBitsToFloat((int) (T2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                }
                                i8++;
                                size3 = i;
                                i5 = 0;
                                i6 = 1;
                            }
                            zii0Var = new zii0(f, f2, f3, f4);
                        }
                        if (!zii0Var.equals(zii0Var2)) {
                            zii0 f9 = rx91.g(rzxVar).f(zii0Var);
                            if (f9.c - f9.a >= 0.0f && f9.d - f9.b >= 0.0f) {
                                zii0 j = f9.j(rzxVar.v(0L));
                                float f10 = j.d;
                                g gVar = qkq0.a;
                                return zii0.b(j, 0.0f, 0.0f, f10 + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                iVar.b();
                if (iVar.h()) {
                    iVar.j();
                }
                return zy11Var2;
            case 5:
                return Boolean.valueOf((iVar.x && iVar.h()) ? false : true);
            default:
                zkq0 zkq0Var2 = iVar.a;
                ArrayList c3 = zkq0Var2.c(iVar.k());
                if (c3.isEmpty()) {
                    return zy11Var2;
                }
                gy40 a = zlz.a();
                int size4 = c3.size();
                int i13 = 0;
                ckq0 ckq0Var4 = null;
                ckq0 ckq0Var5 = null;
                while (i13 < size4) {
                    ho40 ho40Var3 = (ho40) c3.get(i13);
                    long j2 = ho40Var3.a;
                    dry0 dry0Var2 = (dry0) ho40Var3.c.invoke();
                    if (dry0Var2 == null) {
                        arrayList = c3;
                        zy11Var = zy11Var2;
                        i3 = size4;
                        ckq0Var = null;
                    } else {
                        int length3 = dry0Var2.a.a.b.length();
                        arrayList = c3;
                        zy11Var = zy11Var2;
                        i3 = size4;
                        ckq0Var = new ckq0(new bkq0(dry0Var2.a(0), 0, j2), new bkq0(dry0Var2.a(Math.max(length3 - 1, 0)), length3, j2), false);
                    }
                    if (ckq0Var != null) {
                        if (ckq0Var4 == null) {
                            ckq0Var4 = ckq0Var;
                        }
                        long j3 = ho40Var3.a;
                        int c4 = a.c(j3);
                        Object[] objArr = a.c;
                        Object obj = objArr[c4];
                        a.b[c4] = j3;
                        objArr[c4] = ckq0Var;
                        ckq0Var5 = ckq0Var;
                    }
                    i13++;
                    c3 = arrayList;
                    zy11Var2 = zy11Var;
                    size4 = i3;
                }
                zy11 zy11Var3 = zy11Var2;
                if (a.e == 0) {
                    return zy11Var3;
                }
                if (ckq0Var4 != ckq0Var5) {
                    ckq0Var4 = new ckq0(ckq0Var4.a, ckq0Var5.b, false);
                }
                zkq0Var2.k.setValue(a);
                iVar.d.invoke(ckq0Var4);
                iVar.t = null;
                return zy11Var3;
        }
    }
}
