package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class meu implements Iterable, xfx {
    public static final meu b = new meu(new String[0]);
    public final String[] a;

    public meu(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int v = jx81.v(length, 0, -2);
        if (v > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == v) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        String str = (String) j73.G(i * 2, this.a);
        if (str != null) {
            return str;
        }
        ny61.m(oyr.e(']', i, "name["));
        return null;
    }

    public final keu d() {
        keu keuVar = new keu();
        ycc.t(keuVar.a, this.a);
        return keuVar;
    }

    public final TreeMap e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = b(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof meu) {
            return Arrays.equals(this.a, ((meu) obj).a);
        }
        return false;
    }

    public final String f(int i) {
        String str = (String) j73.G((i * 2) + 1, this.a);
        if (str != null) {
            return str;
        }
        ny61.m(oyr.e(']', i, "value["));
        return null;
    }

    public final List g(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        List unmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        return unmodifiableList == null ? EmptyList.a : unmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(b(i), f(i));
        }
        return new h8(1, pairArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String f = f(i);
            sb.append(b2);
            sb.append(Extension.COLON_SPACE);
            if (yf61.l(b2)) {
                f = "██";
            }
            sb.append(f);
            sb.append("\n");
        }
        return sb.toString();
    }
}
