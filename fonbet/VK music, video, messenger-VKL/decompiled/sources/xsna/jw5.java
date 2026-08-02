package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BackgroundExecutor.java */
/* loaded from: classes.dex */
public class jw5 {

    @Nullable
    public static ExecutorService a;
    public static final lza0 b = new lza0("CLEAR_CACHE", null);
    public static final lza0 c = new lza0("LOGOUT", null);
    public static final lza0 d = new lza0("MSG_LIST_ATTACH", "msg_list_attach");
    public static final lza0 e = new lza0("MSG_LIST_PLAYER", "msg_list_player");
    public static final lza0 f = new lza0("DIALOGS_LIST_PLAYER", "dialogs_list_player");
    public static final lza0 g = new lza0("NOTIFICATION", "notification");
    public static final lza0 h = new lza0("AUDIO_RECORDER", "audio_recorder");

    public static void A(Object[] objArr, Comparator comparator) {
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static Integer[] B(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static e7i a(izs... izsVarArr) {
        if (izsVarArr.length > 0) {
            return new e7i(izsVarArr, 0);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!c((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof vvp0) && (obj2 instanceof vvp0)) {
                            if (!tvp0.c(((vvp0) obj).c(), ((vvp0) obj2).c())) {
                            }
                        } else if ((obj instanceof wxp0) && (obj2 instanceof wxp0)) {
                            if (!tvp0.a(((wxp0) obj).c(), ((wxp0) obj2).c())) {
                            }
                        } else if ((obj instanceof kxp0) && (obj2 instanceof kxp0)) {
                            if (!tvp0.b(((kxp0) obj).c(), ((kxp0) obj2).c())) {
                            }
                        } else if ((obj instanceof pxp0) && (obj2 instanceof pxp0)) {
                            if (!tvp0.d(((pxp0) obj).c(), ((pxp0) obj2).c())) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void d(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                d((Object[]) obj, sb, arrayList);
                s3q0 s3q0Var = s3q0.a;
            } else if (obj instanceof byte[]) {
                sb.append(Arrays.toString((byte[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof int[]) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof char[]) {
                sb.append(Arrays.toString((char[]) obj));
            } else if (obj instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof vvp0) {
                sb.append(tvp0.e(((vvp0) obj).c()));
            } else if (obj instanceof wxp0) {
                sb.append(tvp0.g(((wxp0) obj).c()));
            } else if (obj instanceof kxp0) {
                sb.append(tvp0.f(((kxp0) obj).c()));
            } else if (obj instanceof pxp0) {
                sb.append(tvp0.h(((pxp0) obj).c()));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(e43.h(arrayList));
    }

    public static void e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void f(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void g(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void h(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static void j(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static void k(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static byte[] l(int i, int i2, byte[] bArr) {
        n(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static Object[] m(int i, int i2, Object[] objArr) {
        n(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    public static final void n(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(sl9.c(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void o(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void p(Object obj, Object[] objArr) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static void q(float[] fArr, float f2) {
        Arrays.fill(fArr, 0, fArr.length, f2);
    }

    public static void r(long[] jArr, long j) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    public static void s(boolean[] zArr) {
        Arrays.fill(zArr, 0, zArr.length, false);
    }

    public static synchronized Executor t() {
        ExecutorService executorService;
        synchronized (jw5.class) {
            try {
                if (a == null) {
                    String str = y2r0.a;
                    a = Executors.newSingleThreadExecutor(new p2r0("ExoPlayer:BackgroundExecutor"));
                }
                executorService = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static int u(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static Comparable v(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable w(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] y(Object obj, Object[] objArr) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static Object[] z(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
