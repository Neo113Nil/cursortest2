package yads;

import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.emb;
import xsna.epx;
import xsna.j5g;
import xsna.n6j;

/* loaded from: classes10.dex */
public abstract class u01 {
    public static final Charset a = emb.d;

    public static final boolean a(Map map, w11 w11Var) {
        String c = c(map, w11Var);
        if (c == null) {
            return true;
        }
        return Boolean.parseBoolean(c);
    }

    public static boolean b(Map map, w11 w11Var) {
        String c = c(map, w11Var);
        if (c == null) {
            return false;
        }
        return Boolean.parseBoolean(c);
    }

    public static final String c(Map map, w11 w11Var) {
        if (map != null) {
            return (String) map.get(w11Var.b);
        }
        return null;
    }

    public static int d(Map map, w11 w11Var) {
        String c = c(map, w11Var);
        int i = tb.b;
        if (c == null) {
            return 0;
        }
        try {
            return Integer.parseInt(c);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static final ArrayList e(Map map, w11 w11Var) {
        Collection collection;
        ArrayList arrayList = new ArrayList();
        String c = c(map, w11Var);
        if (c != null && c.length() != 0) {
            List a2 = n6j.a(0, StringUtils.COMMA, c);
            if (!a2.isEmpty()) {
                ListIterator listIterator = a2.listIterator(a2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            for (String str : (String[]) collection.toArray(new String[0])) {
                try {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = epx.g(str.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String decode = URLDecoder.decode(str.subSequence(i, length + 1).toString(), C.UTF8_NAME);
                    if (decode != null) {
                        arrayList.add(decode);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public static final Charset a(Map map) {
        Collection collection;
        Collection collection2;
        if (map == null) {
            return a;
        }
        String str = (String) map.get("Content-Type");
        if (str != null) {
            List a2 = n6j.a(0, ";", str);
            if (!a2.isEmpty()) {
                ListIterator listIterator = a2.listIterator(a2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                String str2 = strArr[i];
                int length2 = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = epx.g(str2.charAt(!z ? i2 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                List a3 = n6j.a(0, "=", str2.subSequence(i2, length2 + 1).toString());
                if (!a3.isEmpty()) {
                    ListIterator listIterator2 = a3.listIterator(a3.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            collection2 = j5g.H0(a3, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection2 = EmptyList.b;
                String[] strArr2 = (String[]) collection2.toArray(new String[0]);
                if (strArr2.length == 2 && epx.f(strArr2[0], B5.N)) {
                    return Charset.forName(strArr2[1]);
                }
            }
        }
        return a;
    }
}
