package defpackage;

import androidx.fragment.app.Fragment;
import jason.statham.interpreter.error.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class oyr {
    public static HashMap A(kf00 kf00Var) {
        kf00Var.getClass();
        return new HashMap();
    }

    public static MutablePropertyReference1Impl B(uoi0 uoi0Var, Class cls, String str, String str2, int i) {
        uoi0Var.getClass();
        return new MutablePropertyReference1Impl(str, i, str2, cls);
    }

    public static void C(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str.substring(i, i2));
        sb.append(str2);
    }

    public static void D(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static pp60 c(f4c0 f4c0Var) {
        pp60 pp60Var = new pp60();
        f4c0Var.h(pp60Var);
        return pp60Var;
    }

    public static ClassCastException d(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String e(char c, int i, String str) {
        return str + i + c;
    }

    public static String f(char c, String str, String str2) {
        return str + c + str2;
    }

    public static String g(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String h(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(int i, String str) {
        return str + i;
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String l(int i, String str, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String n(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String s(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder u(double d, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static Throwable x(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return a.a(sb.toString());
    }

    public static Throwable y(Object obj, String str) {
        return a.a(str + obj);
    }

    public static ArrayList z(xdx xdxVar) {
        xdxVar.l();
        return new ArrayList();
    }
}
