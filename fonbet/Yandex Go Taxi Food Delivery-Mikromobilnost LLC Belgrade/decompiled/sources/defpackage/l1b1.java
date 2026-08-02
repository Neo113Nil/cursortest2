package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class l1b1 {
    public static int a(float[] fArr, int[] iArr, byte[] bArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static final xs7 b(i5f0 i5f0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Float R;
        ArrayList a = i5f0Var.a.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ar7) next).d() == 1) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return ((ar7) a.P(arrayList)).x();
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            try {
                pm7 a2 = pm7.a((ar7) obj);
                float[] fArr = (float[]) a2.b(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                Float f = (Float) a2.b(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
                if (fArr != null && (R = j73.R(fArr)) != null) {
                    float floatValue = R.floatValue();
                    if (floatValue >= 1.0f && floatValue < 4.0f) {
                        boolean z = false;
                        boolean z2 = f != null && f.floatValue() > 10.0f;
                        int[] iArr = (int[]) a2.b(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z3 = iArr != null && j73.w(8, iArr);
                        Integer num = (Integer) a2.b(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
                        if (num != null && num.intValue() == 5) {
                            z = true;
                        }
                        if (!z2 && !z3 && !z) {
                            break;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        ar7 ar7Var = (ar7) obj;
        if (ar7Var != null) {
            return ar7Var.x();
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            kf61 kf61Var = (kf61) ((ar7) obj2).k().d();
            if (kf61Var != null && kf61Var.c() <= 0.6f) {
                break;
            }
        }
        ar7 ar7Var2 = (ar7) obj2;
        if (ar7Var2 != null) {
            return ar7Var2.x();
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it4.next();
            kf61 kf61Var2 = (kf61) ((ar7) obj3).k().d();
            if (kf61Var2 != null && kf61Var2.c() <= 0.95f) {
                break;
            }
        }
        ar7 ar7Var3 = (ar7) obj3;
        if (ar7Var3 != null) {
            return ar7Var3.x();
        }
        return null;
    }

    public static void c(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    public static boolean d(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean e(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean f(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean g(char c) {
        return c >= ' ' && c <= '^';
    }

    public static boolean h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean i(char c) {
        if (c == '\r' || c == '*' || c == '>' || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x008e, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025e, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i, int i2, CharSequence charSequence) {
        int i3;
        float[] fArr;
        int i4;
        int i5;
        int i6;
        int min;
        int i7 = i;
        int i8 = 0;
        i8 = 0;
        if (i7 < charSequence.length()) {
            int i9 = 6;
            float f = 1.0f;
            i3 = 5;
            int i10 = 2;
            if (i2 == 0) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
            } else {
                fArr = new float[6];
                fArr[0] = 1.0f;
                fArr[1] = 2.0f;
                fArr[2] = 2.0f;
                fArr[3] = 2.0f;
                fArr[4] = 2.0f;
                fArr[5] = 2.25f;
                fArr[i2] = 0.0f;
            }
            byte[] bArr = new byte[6];
            int[] iArr = new int[6];
            int i11 = 0;
            while (true) {
                int i12 = i7 + i11;
                float f2 = f;
                if (i12 == charSequence.length()) {
                    Arrays.fill(bArr, i8 == true ? (byte) 1 : (byte) 0);
                    Arrays.fill(iArr, i8 == true ? 1 : 0);
                    int a = a(fArr, iArr, bArr);
                    int i13 = i8 == true ? 1 : 0;
                    int i14 = i13;
                    while (i13 < i9) {
                        i14 += bArr[i13];
                        i13++;
                    }
                    if (iArr[i8 == true ? 1 : 0] == a) {
                        i3 = i8 == true ? 1 : 0;
                        i4 = i3;
                    } else {
                        if (i14 == 1) {
                            if (bArr[i3] <= 0) {
                                if (bArr[4] > 0) {
                                    i3 = 4;
                                } else if (bArr[i10] > 0) {
                                    i4 = i8 == true ? 1 : 0;
                                    i3 = i10;
                                } else if (bArr[3] > 0) {
                                    i3 = 3;
                                }
                            }
                        }
                        i4 = i8 == true ? 1 : 0;
                    }
                } else {
                    char charAt = charSequence.charAt(i12);
                    i11++;
                    if (d(charAt)) {
                        fArr[i8 == true ? 1 : 0] = fArr[i8 == true ? 1 : 0] + 0.5f;
                    } else if (e(charAt)) {
                        float ceil = (float) Math.ceil(fArr[i8 == true ? 1 : 0]);
                        fArr[i8 == true ? 1 : 0] = ceil;
                        fArr[i8 == true ? 1 : 0] = ceil + 2.0f;
                    } else {
                        float ceil2 = (float) Math.ceil(fArr[i8 == true ? 1 : 0]);
                        fArr[i8 == true ? 1 : 0] = ceil2;
                        fArr[i8 == true ? 1 : 0] = ceil2 + f2;
                    }
                    if (f(charAt)) {
                        fArr[1] = fArr[1] + 0.6666667f;
                    } else if (e(charAt)) {
                        fArr[1] = fArr[1] + 2.6666667f;
                    } else {
                        fArr[1] = fArr[1] + 1.3333334f;
                    }
                    if (h(charAt)) {
                        fArr[i10] = fArr[i10] + 0.6666667f;
                    } else if (e(charAt)) {
                        fArr[i10] = fArr[i10] + 2.6666667f;
                    } else {
                        fArr[i10] = fArr[i10] + 1.3333334f;
                    }
                    if (i(charAt)) {
                        fArr[3] = fArr[3] + 0.6666667f;
                    } else if (e(charAt)) {
                        fArr[3] = fArr[3] + 4.3333335f;
                    } else {
                        fArr[3] = fArr[3] + 3.3333333f;
                    }
                    if (g(charAt)) {
                        fArr[4] = fArr[4] + 0.75f;
                    } else if (e(charAt)) {
                        fArr[4] = fArr[4] + 4.25f;
                    } else {
                        fArr[4] = fArr[4] + 3.25f;
                    }
                    fArr[i3] = fArr[i3] + f2;
                    if (i11 >= 4) {
                        Arrays.fill(bArr, i8 == true ? (byte) 1 : (byte) 0);
                        Arrays.fill(iArr, i8 == true ? 1 : 0);
                        a(fArr, iArr, bArr);
                        int i15 = iArr[i8 == true ? 1 : 0];
                        int i16 = iArr[i3];
                        int i17 = iArr[1];
                        i4 = i8 == true ? 1 : 0;
                        i5 = i3;
                        i6 = i10;
                        if (i15 < Math.min(Math.min(i16, Math.min(i17, Math.min(iArr[i10], iArr[3]))), iArr[4])) {
                            i3 = i4;
                            break;
                        }
                        int i18 = iArr[i5];
                        if (i18 < iArr[i4] || i18 + 1 < Math.min(iArr[1], Math.min(iArr[i6], Math.min(iArr[3], iArr[4])))) {
                            break;
                        }
                        if (iArr[4] + 1 < Math.min(Math.min(iArr[i5], Math.min(iArr[1], Math.min(iArr[i6], iArr[3]))), iArr[i4])) {
                            i3 = 4;
                            break;
                        }
                        if (iArr[i6] + 1 < Math.min(Math.min(iArr[i5], Math.min(iArr[1], Math.min(iArr[4], iArr[3]))), iArr[i4])) {
                            i3 = i6;
                            break;
                        }
                        if (iArr[3] + 1 < Math.min(Math.min(iArr[i5], Math.min(iArr[1], Math.min(iArr[4], iArr[i6]))), iArr[i4])) {
                            break;
                        }
                        if (iArr[1] + 1 < Math.min(iArr[i4], Math.min(iArr[i5], Math.min(iArr[4], iArr[i6])))) {
                            int i19 = iArr[1];
                            int i20 = iArr[3];
                            if (i19 < i20) {
                                break;
                            }
                            if (i19 == i20) {
                                for (int i21 = i7 + i11 + 1; i21 < charSequence.length(); i21++) {
                                    char charAt2 = charSequence.charAt(i21);
                                    if (charAt2 != '\r' && charAt2 != '*' && charAt2 != '>') {
                                        if (!i(charAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i4 = i8 == true ? 1 : 0;
                        i5 = i3;
                        i6 = i10;
                    }
                    f = f2;
                    i8 = i4;
                    i3 = i5;
                    i10 = i6;
                    i9 = 6;
                }
            }
            if (i2 != 3 && i3 == 3) {
                int min2 = Math.min(i7 + 3, charSequence.length());
                while (i7 < min2) {
                    if (!i(charSequence.charAt(i7))) {
                        return i4;
                    }
                    i7++;
                }
                return i3;
            }
            if (i2 == 4 && i3 == 4) {
                min = Math.min(i7 + 4, charSequence.length());
                while (i7 < min) {
                    if (!g(charSequence.charAt(i7))) {
                        return i4;
                    }
                    i7++;
                }
            }
            return i3;
        }
        i3 = i2;
        i4 = i8;
        if (i2 != 3) {
        }
        if (i2 == 4) {
            min = Math.min(i7 + 4, charSequence.length());
            while (i7 < min) {
            }
        }
        return i3;
    }

    public abstract void j(sh3 sh3Var);
}
