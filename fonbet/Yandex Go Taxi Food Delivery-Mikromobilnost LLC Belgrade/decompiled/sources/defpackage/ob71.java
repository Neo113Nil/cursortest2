package defpackage;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.text.Regex;
import yads.h01;

/* loaded from: classes7.dex */
public abstract class ob71 {
    public static final Charset a = uza.e;

    public static final Charset a(Map map) {
        List list;
        List list2;
        String str = (String) map.get("Content-Type");
        if (str != null) {
            List l = new Regex(";").l(0, str);
            boolean isEmpty = l.isEmpty();
            EmptyList emptyList = EmptyList.a;
            if (!isEmpty) {
                ListIterator listIterator = l.listIterator(l.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = a.A0(l, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = emptyList;
            String[] strArr = (String[]) list.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                String str2 = strArr[i];
                int length2 = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = jl40.q(str2.charAt(!z ? i2 : length2), 32) <= 0;
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
                List l2 = new Regex("=").l(0, str2.subSequence(i2, length2 + 1).toString());
                if (!l2.isEmpty()) {
                    ListIterator listIterator2 = l2.listIterator(l2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            list2 = a.A0(l2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list2 = emptyList;
                String[] strArr2 = (String[]) list2.toArray(new String[0]);
                if (strArr2.length == 2 && jl40.l(strArr2[0], "charset")) {
                    return Charset.forName(strArr2[1]);
                }
            }
        }
        return a;
    }

    public static final String b(Map map, h01 h01Var) {
        if (map != null) {
            return (String) map.get(h01Var.b);
        }
        return null;
    }

    public static int c(Map map, h01 h01Var) {
        String b = b(map, h01Var);
        int i = cs71.b;
        if (b != null) {
            try {
                return Integer.parseInt(b);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final ArrayList d(Map map, h01 h01Var) {
        Collection collection;
        ArrayList arrayList = new ArrayList();
        String b = b(map, h01Var);
        if (b != null && b.length() != 0) {
            List l = new Regex(",").l(0, b);
            if (!l.isEmpty()) {
                ListIterator listIterator = l.listIterator(l.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = a.A0(l, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.a;
            for (String str : (String[]) collection.toArray(new String[0])) {
                try {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = jl40.q(str.charAt(!z ? i : length), 32) <= 0;
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
                    String decode = URLDecoder.decode(str.subSequence(i, length + 1).toString(), "UTF-8");
                    if (decode != null) {
                        arrayList.add(decode);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }
}
