package defpackage;

import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g8e {
    public static void A(hst hstVar, String str) {
        hstVar.k(new IllegalStateException(), str);
    }

    public static void B(hst hstVar, String str, String str2, String str3, int i) {
        xby.l(hstVar, str, str2, new IllegalStateException(), str3, i);
    }

    public static void C(String str, hst hstVar) {
        hstVar.j(new IllegalStateException(str));
    }

    public static void D(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static char a(int i, String str) {
        return str.charAt(str.length() - i);
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static int e(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static ike f(g6u g6uVar) {
        return bvf0.a(g6uVar.plus(jl40.a()));
    }

    public static y2r0 g(ArrayList arrayList, xvf0 xvf0Var, ArrayList arrayList2, List list) {
        arrayList.add(xvf0Var);
        return new y2r0(arrayList2, list);
    }

    public static a h(FragmentManager fragmentManager, FragmentManager fragmentManager2) {
        fragmentManager.getClass();
        return new a(fragmentManager2);
    }

    public static Text.Constant i(b bVar, String str) {
        bVar.getClass();
        return new Text.Constant(str);
    }

    public static ClassCastException j(Map.Entry entry) {
        entry.getKey().getClass();
        return new ClassCastException();
    }

    public static Object k(int i, bts btsVar, boolean z) {
        btsVar.t(z);
        btsVar.e0(i);
        return btsVar.Q();
    }

    public static String l(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(Uri uri, String str, String str2) {
        return str + uri + str2;
    }

    public static String n(File file, String str) {
        return str + file;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String s(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static ArrayList t(Object obj) {
        kotlin.b.b(obj);
        return new ArrayList();
    }

    public static HashMap u(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    public static HashMap v(HashMap hashMap, String str, Boolean bool) {
        hashMap.put(str, bool);
        return new HashMap();
    }

    public static LinkedHashMap w(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    public static LinkedHashMap x(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    public static LinkedHashMap y(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, str4);
        return linkedHashMap;
    }

    public static Map z(String str, String str2) {
        return gw00.e(new Pair(str, str2));
    }
}
