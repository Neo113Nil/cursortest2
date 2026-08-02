package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b64 {
    public static void A(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void B(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void C(nfh nfhVar, long j) {
        nfhVar.q().n();
        nfhVar.E(j);
    }

    public static /* synthetic */ void D(Object obj) {
        if (obj == null) {
            return;
        }
        ny61.u();
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static Object c(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String d(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String e(int i, String str) {
        return i + str;
    }

    public static String f(h55 h55Var) {
        return qoi0.a(h55Var.getClass()).d();
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String h(CharSequence charSequence, String str, String str2) {
        return str + ((Object) charSequence) + str2;
    }

    public static String i(String str, Object obj) {
        return (str + obj).toString();
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return new Regex(str).j(str2, str3);
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, String str2, Throwable th) {
        return str + th + str2;
    }

    public static String n(String str, StringBuilder sb, ArrayList arrayList) {
        sb.append(arrayList);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap w(em9 em9Var) {
        em9Var.getClass();
        return new HashMap();
    }

    public static PropertyReference1Impl x(uoi0 uoi0Var, Class cls, String str, String str2, int i) {
        uoi0Var.getClass();
        return new PropertyReference1Impl(str, i, str2, cls);
    }

    public static Ref$ObjectRef y(j18 j18Var) {
        j18Var.u();
        return new Ref$ObjectRef();
    }

    public static void z(int i, bts btsVar, int i2, wls wlsVar) {
        btsVar.o0(Integer.valueOf(i));
        btsVar.i(Integer.valueOf(i2), wlsVar);
    }
}
