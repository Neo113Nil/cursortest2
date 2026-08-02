package xsna;

import com.ironsource.X3;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: _Arrays.kt */
/* loaded from: classes11.dex */
public class rl3 extends jw5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, gcy {
        public final /* synthetic */ Object[] b;

        public a(Object[] objArr) {
            this.b = objArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return new wk3(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes8.dex */
    public static final class b<T> implements uki0<T> {
        public final /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        @Override // xsna.uki0
        public final Iterator<T> iterator() {
            return new wk3(this.a);
        }
    }

    public static <T> Iterable<T> C(T[] tArr) {
        return tArr.length == 0 ? EmptyList.b : new a(tArr);
    }

    public static <T> uki0<T> D(T[] tArr) {
        return tArr.length == 0 ? ghp.a : new b(tArr);
    }

    public static boolean E(int i, int[] iArr) {
        return T(i, iArr) >= 0;
    }

    public static boolean F(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static <T> boolean G(T[] tArr, T t) {
        return U(t, tArr) >= 0;
    }

    public static List H(int i, Object[] objArr) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        return o0(length, objArr);
    }

    public static <T> List<T> I(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static float J(float[] fArr) {
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int K(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T L(T[] tArr) {
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Float M(float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static Integer N(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static <T> T O(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static k9x P(int[] iArr) {
        return new k9x(0, iArr.length - 1, 1);
    }

    public static Float Q(int i, float[] fArr) {
        if (i < 0 || i >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    public static Integer R(int i, int[] iArr) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object S(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int T(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int U(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String V(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, izs izsVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            bay.b(sb, obj, izsVar);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static String W(String str, char[] cArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : cArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String X(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (int i2 : iArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append((CharSequence) String.valueOf(i2));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String Y(byte[] bArr, String str, izs izsVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : X3.j.d;
        String str3 = (i & 4) == 0 ? X3.j.e : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            izsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b2 : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (izsVar != null) {
                sb.append((CharSequence) izsVar.invoke(Byte.valueOf(b2)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b2));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static /* synthetic */ String Z(Object[] objArr, String str, String str2, String str3, izs izsVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            izsVar = null;
        }
        return V(objArr, str, str2, str3, izsVar);
    }

    public static int a0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T b0(T[] tArr) {
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int c0(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> T d0(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int i = 1;
        int length = tArr.length - 1;
        if (1 <= length) {
            while (true) {
                T t2 = tArr[i];
                if (t.compareTo(t2) < 0) {
                    t = t2;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static Float e0(Float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                floatValue = Math.max(floatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static float f0(float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public static int g0(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static Float h0(Float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                floatValue = Math.min(floatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static Integer i0(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static float j0(float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.min(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public static <T> void k0(T[] tArr) {
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = tArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            T t = tArr[i];
            tArr[i] = tArr[length2];
            tArr[length2] = t;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static byte[] l0(byte[] bArr, k9x k9xVar) {
        return k9xVar.isEmpty() ? new byte[0] : jw5.l(k9xVar.b, k9xVar.c + 1, bArr);
    }

    public static <T> List<T> m0(T[] tArr, Comparator<? super T> comparator) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            jw5.A(tArr, comparator);
        }
        return Arrays.asList(tArr);
    }

    public static List n0(int i, Object[] objArr) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.b;
        }
        if (i >= objArr.length) {
            return u0(objArr);
        }
        if (i == 1) {
            return Collections.singletonList(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static List o0(int i, Object[] objArr) {
        if (i < 0) {
            throw new IllegalArgumentException(tgw.b(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.b;
        }
        int length = objArr.length;
        if (i >= length) {
            return u0(objArr);
        }
        if (i == 1) {
            return Collections.singletonList(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static void p0(Object[] objArr, AbstractCollection abstractCollection) {
        for (Object obj : objArr) {
            abstractCollection.add(obj);
        }
    }

    public static int[] q0(Integer[] numArr) {
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static final List<Byte> r0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return EmptyList.b;
        }
        if (length == 1) {
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static List<Integer> s0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.b;
        }
        int i = 0;
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        while (i < length2) {
            i = tv4.a(arrayList, iArr[i], i, 1);
        }
        return arrayList;
    }

    public static List<Long> t0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.b;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static <T> List<T> u0(T[] tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? w0(tArr) : Collections.singletonList(tArr[0]) : EmptyList.b;
    }

    public static List<Boolean> v0(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.b;
        }
        if (length == 1) {
            return Collections.singletonList(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList w0(Object[] objArr) {
        return new ArrayList(new gk3(objArr, false));
    }

    public static Set<Long> x0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return EmptySet.b;
        }
        if (length == 1) {
            return Collections.singleton(Long.valueOf(jArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(jArr.length));
        for (long j : jArr) {
            linkedHashSet.add(Long.valueOf(j));
        }
        return linkedHashSet;
    }

    public static <T> Set<T> y0(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.b;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(tArr.length));
        p0(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
