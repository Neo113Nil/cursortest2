package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public class j73 extends f73 {
    public static List A(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int B(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        w511.i("Array is empty.");
        return 0;
    }

    public static Object C(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        w511.i("Array is empty.");
        return null;
    }

    public static Object D(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static d6w E(int[] iArr) {
        return new d6w(0, iArr.length - 1, 1);
    }

    public static d6w F(Object[] objArr) {
        return new d6w(0, objArr.length - 1, 1);
    }

    public static Object G(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int H(Object[] objArr, Object obj) {
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

    public static final void I(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, tls tlsVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            uuu0.a(sb, obj, tlsVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void J(Object[] objArr, StringBuilder sb, tls tlsVar, int i) {
        String str = (i & 4) != 0 ? "" : "<";
        String str2 = (i & 8) == 0 ? ">" : "";
        if ((i & 64) != 0) {
            tlsVar = null;
        }
        I(objArr, sb, Extension.FIX_SPACE, str, str2, tlsVar);
    }

    public static String K(byte[] bArr, String str, tls tlsVar, int i) {
        if ((i & 1) != 0) {
            str = Extension.FIX_SPACE;
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            tlsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (tlsVar != null) {
                sb.append((CharSequence) tlsVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String L(Object[] objArr, String str, String str2, tls tlsVar, int i) {
        if ((i & 1) != 0) {
            str = Extension.FIX_SPACE;
        }
        String str3 = str;
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) == 0 ? Extension.C_BRAKE : "";
        if ((i & 32) != 0) {
            tlsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        I(objArr, sb, str3, str4, str5, tlsVar);
        return sb.toString();
    }

    public static double M(double[] dArr) {
        if (dArr.length != 0) {
            return dArr[dArr.length - 1];
        }
        w511.i("Array is empty.");
        return 0.0d;
    }

    public static int N(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[iArr.length - 1];
        }
        w511.i("Array is empty.");
        return 0;
    }

    public static Object O(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        w511.i("Array is empty.");
        return null;
    }

    public static Float P(Float[] fArr) {
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

    public static int Q(int[] iArr) {
        if (iArr.length == 0) {
            ny61.p();
            return 0;
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

    public static Float R(float[] fArr) {
        if (fArr.length == 0) {
            return null;
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
        return Float.valueOf(f);
    }

    public static Float S(Float[] fArr) {
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

    public static int T(int[] iArr) {
        if (iArr.length == 0) {
            ny61.p();
            return 0;
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
        return i;
    }

    public static void U(Object[] objArr) {
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Object obj = objArr[i];
            objArr[i] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static int[] V(int[] iArr) {
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                iArr2[length - i] = iArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iArr2;
    }

    public static Object[] W(Object[] objArr) {
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length);
        int length = objArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                objArr2[length - i] = objArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return objArr2;
    }

    public static List X(byte[] bArr, d6w d6wVar) {
        if (d6wVar.isEmpty()) {
            return EmptyList.a;
        }
        return new e73(0, f73.m(d6wVar.a, d6wVar.b + 1, bArr));
    }

    public static byte[] Y(byte[] bArr, d6w d6wVar) {
        return d6wVar.isEmpty() ? new byte[0] : f73.m(d6wVar.a, d6wVar.b + 1, bArr);
    }

    public static void Z(Object[] objArr, AbstractCollection abstractCollection) {
        for (Object obj : objArr) {
            abstractCollection.add(obj);
        }
    }

    public static List a0(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List b0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List c0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.a;
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

    public static List d0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(Arrays.copyOf(objArr, objArr.length)) : Collections.singletonList(objArr[0]) : EmptyList.a;
    }

    public static List e0(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.a;
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

    public static Set f0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(objArr.length));
        Z(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Iterable u(Object[] objArr) {
        return objArr.length == 0 ? EmptyList.a : new g73(0, objArr);
    }

    public static qrq0 v(Object[] objArr) {
        return objArr.length == 0 ? ixn.a : new h73(0, objArr);
    }

    public static boolean w(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean x(char[] cArr, char c) {
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

    public static boolean y(Object[] objArr, Object obj) {
        return H(objArr, obj) >= 0;
    }

    public static List z(int i, Object[] objArr) {
        if (i < 0) {
            w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            w511.f(oyr.j(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return EmptyList.a;
        }
        int length2 = objArr.length;
        return length >= length2 ? d0(objArr) : length == 1 ? Collections.singletonList(objArr[length2 - 1]) : Arrays.asList(f73.n(length2 - length, length2, objArr));
    }
}
