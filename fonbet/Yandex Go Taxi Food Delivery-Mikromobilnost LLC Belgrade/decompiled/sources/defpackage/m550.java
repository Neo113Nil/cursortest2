package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class m550 extends t550 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m550(boolean z, int i) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.t550
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                return (boolean[]) bundle.get(str);
            case 1:
                boolean[] zArr = (boolean[]) bundle.get(str);
                if (zArr != null) {
                    return j73.e0(zArr);
                }
                return null;
            case 2:
                return (float[]) bundle.get(str);
            case 3:
                float[] fArr = (float[]) bundle.get(str);
                if (fArr != null) {
                    return j73.a0(fArr);
                }
                return null;
            case 4:
                return (int[]) bundle.get(str);
            case 5:
                int[] iArr = (int[]) bundle.get(str);
                if (iArr != null) {
                    return j73.b0(iArr);
                }
                return null;
            case 6:
                return (long[]) bundle.get(str);
            case 7:
                long[] jArr = (long[]) bundle.get(str);
                if (jArr != null) {
                    return j73.c0(jArr);
                }
                return null;
            case 8:
                return (String[]) bundle.get(str);
            default:
                String[] strArr = (String[]) bundle.get(str);
                if (strArr != null) {
                    return j73.d0(strArr);
                }
                return null;
        }
    }

    @Override // defpackage.t550
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.t550
    public final Object c(Object obj, String str) {
        int i = this.r;
        n550 n550Var = t550.l;
        n550 n550Var2 = t550.i;
        n550 n550Var3 = t550.b;
        n550 n550Var4 = t550.f;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return new boolean[]{((Boolean) n550Var.d(str)).booleanValue()};
                }
                boolean[] zArr2 = {((Boolean) n550Var.d(str)).booleanValue()};
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArr2, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                return list != null ? a.m0(Collections.singletonList(n550Var.d(str)), list) : Collections.singletonList(n550Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{((Number) n550Var2.d(str)).floatValue()};
                }
                float[] fArr2 = {((Number) n550Var2.d(str)).floatValue()};
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? a.m0(Collections.singletonList(n550Var2.d(str)), list2) : Collections.singletonList(n550Var2.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return new int[]{((Number) n550Var3.d(str)).intValue()};
                }
                int[] iArr2 = {((Number) n550Var3.d(str)).intValue()};
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArr2, 0, copyOf3, length3, 1);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                return list3 != null ? a.m0(Collections.singletonList(n550Var3.d(str)), list3) : Collections.singletonList(n550Var3.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return new long[]{((Number) n550Var4.d(str)).longValue()};
                }
                long[] jArr2 = {((Number) n550Var4.d(str)).longValue()};
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArr2, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                return list4 != null ? a.m0(Collections.singletonList(n550Var4.d(str)), list4) : Collections.singletonList(n550Var4.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) f73.t(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                return list5 != null ? a.m0(Collections.singletonList(str), list5) : Collections.singletonList(str);
        }
    }

    @Override // defpackage.t550
    public final Object d(String str) {
        int i = this.r;
        n550 n550Var = t550.l;
        n550 n550Var2 = t550.i;
        n550 n550Var3 = t550.b;
        n550 n550Var4 = t550.f;
        switch (i) {
            case 0:
                return new boolean[]{((Boolean) n550Var.d(str)).booleanValue()};
            case 1:
                return Collections.singletonList(n550Var.d(str));
            case 2:
                return new float[]{((Number) n550Var2.d(str)).floatValue()};
            case 3:
                return Collections.singletonList(n550Var2.d(str));
            case 4:
                return new int[]{((Number) n550Var3.d(str)).intValue()};
            case 5:
                return Collections.singletonList(n550Var3.d(str));
            case 6:
                return new long[]{((Number) n550Var4.d(str)).longValue()};
            case 7:
                return Collections.singletonList(n550Var4.d(str));
            case 8:
                return new String[]{str};
            default:
                return Collections.singletonList(str);
        }
    }

    @Override // defpackage.t550
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                bundle.putBooleanArray(str, list != null ? a.C0(list) : null);
                break;
            case 2:
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                bundle.putFloatArray(str, list2 != null ? a.G0(list2) : null);
                break;
            case 4:
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                bundle.putIntArray(str, list3 != null ? a.I0(list3) : null);
                break;
            case 6:
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                bundle.putLongArray(str, list4 != null ? a.K0(list4) : null);
                break;
            case 8:
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }

    @Override // defpackage.t550
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        int i = 0;
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    r1 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        r1[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return d73.b(boolArr, r1);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return d73.b(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    r1 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        r1[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return d73.b(fArr, r1);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return d73.b(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        numArr[i4] = Integer.valueOf(iArr[i4]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    r1 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    while (i < length6) {
                        r1[i] = Integer.valueOf(iArr2[i]);
                        i++;
                    }
                }
                return d73.b(numArr, r1);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return d73.b(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i5 = 0; i5 < length7; i5++) {
                        lArr[i5] = Long.valueOf(jArr[i5]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    r1 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    while (i < length8) {
                        r1[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return d73.b(lArr, r1);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return d73.b(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return d73.b((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return d73.b(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }
}
