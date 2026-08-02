package defpackage;

import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import yads.bl2;

/* loaded from: classes7.dex */
public final class b981 {
    public static final b981 c = new b981(8, new int[]{2});
    public static final b981 d = new b981(8, new int[]{2, 5, 6});
    public static final bl2 e;
    public final int[] a;
    public final int b;

    static {
        we6 we6Var = new we6();
        we6Var.c(5, 6);
        we6Var.c(17, 6);
        we6Var.c(7, 6);
        we6Var.c(18, 6);
        we6Var.c(6, 8);
        we6Var.c(8, 8);
        we6Var.c(14, 8);
        e = bl2.f(we6Var.b, (Object[]) we6Var.c);
    }

    public b981(int i, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if (r3 != 5) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(qd81 qd81Var) {
        boolean z;
        int i;
        i6z0 c2;
        int i2;
        int a;
        String str = qd81Var.E;
        str.getClass();
        String str2 = qd81Var.B;
        ArrayList arrayList = g681.a;
        int i3 = 6;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    z = 8;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                i = 18;
                break;
            case true:
                i = 7;
                break;
            case true:
                if (str2 != null && (c2 = g681.c(str2)) != null) {
                    int i4 = c2.c;
                    if (i4 == 2) {
                        i = 10;
                        break;
                    } else if (i4 == 5) {
                        i = 11;
                        break;
                    } else if (i4 == 29) {
                        i = 12;
                        break;
                    } else if (i4 == 42) {
                        i = 16;
                        break;
                    } else if (i4 == 22) {
                        i = 1073741824;
                        break;
                    } else if (i4 == 23) {
                        i = 15;
                        break;
                    }
                }
                i = 0;
                break;
            case true:
                i = 5;
                break;
            case true:
                i = 17;
                break;
            case true:
                i = 6;
                break;
            case true:
                i = 9;
                break;
            case true:
                i = 8;
                break;
            case true:
                i = 14;
                break;
            default:
                i = 0;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        bl2 bl2Var = e;
        if (!bl2Var.containsKey(valueOf)) {
            return null;
        }
        int[] iArr = this.a;
        if (i == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            i = 6;
        } else if (i == 8 && Arrays.binarySearch(iArr, 8) < 0) {
            i = 7;
        }
        if (Arrays.binarySearch(iArr, i) < 0) {
            return null;
        }
        int i5 = qd81Var.R;
        if (i5 == -1 || i == 18) {
            int i6 = qd81Var.S;
            if (i6 == -1) {
                i6 = 48000;
            }
            if (rf71.a >= 29) {
                i5 = p581.a(i, i6);
            } else {
                Object obj = bl2Var.get(Integer.valueOf(i));
                i5 = ((Integer) (obj != null ? obj : 0)).intValue();
            }
        } else if (i5 > this.b) {
            return null;
        }
        int i7 = rf71.a;
        if (i7 <= 28) {
            if (i5 == 7) {
                i3 = 8;
            } else if (i5 != 3) {
                if (i5 != 4) {
                }
            }
            if (i7 <= 26) {
                mf81.d.getClass();
                if (new String(Base64.decode("ZnVndQ==", 0), uza.a).equals(rf71.b) && i3 == 1) {
                    i2 = 2;
                    a = rf71.a(i2);
                    if (a == 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(i), Integer.valueOf(a));
                }
            }
            i2 = i3;
            a = rf71.a(i2);
            if (a == 0) {
            }
        }
        i3 = i5;
        if (i7 <= 26) {
        }
        i2 = i3;
        a = rf71.a(i2);
        if (a == 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b981)) {
            return false;
        }
        b981 b981Var = (b981) obj;
        return Arrays.equals(this.a, b981Var.a) && this.b == b981Var.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
