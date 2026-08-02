package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public class d73 extends c73 {
    public static boolean b(Object[] objArr, Object[] objArr2) {
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
                            if (!b((Object[]) obj, (Object[]) obj2)) {
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
                        } else if ((obj instanceof nq11) && (obj2 instanceof nq11)) {
                            if (!kq11.c(((nq11) obj).a, ((nq11) obj2).a)) {
                            }
                        } else if ((obj instanceof qr11) && (obj2 instanceof qr11)) {
                            if (!kq11.a(((qr11) obj).a, ((qr11) obj2).a)) {
                            }
                        } else if ((obj instanceof uq11) && (obj2 instanceof uq11)) {
                            if (!kq11.b(((uq11) obj).a, ((uq11) obj2).a)) {
                            }
                        } else if ((obj instanceof zq11) && (obj2 instanceof zq11)) {
                            if (!kq11.d(((zq11) obj).a, ((zq11) obj2).a)) {
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

    public static final void c(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Extension.FIX_SPACE);
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                c((Object[]) obj, sb, arrayList);
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
            } else if (obj instanceof nq11) {
                sb.append(kq11.e(((nq11) obj).a));
            } else if (obj instanceof qr11) {
                sb.append(kq11.g(((qr11) obj).a));
            } else if (obj instanceof uq11) {
                sb.append(kq11.f(((uq11) obj).a));
            } else if (obj instanceof zq11) {
                sb.append(kq11.h(((zq11) obj).a));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(scc.f(arrayList));
    }
}
