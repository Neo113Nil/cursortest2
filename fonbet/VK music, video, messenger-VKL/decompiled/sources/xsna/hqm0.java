package xsna;

import io.jsonwebtoken.JwtParser;

/* compiled from: StringMaker.java */
/* loaded from: classes8.dex */
public final class hqm0 {
    public static final hqm0 e;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        hqm0 hqm0Var = new hqm0();
        hqm0Var.a = true;
        hqm0Var.b = true;
        hqm0Var.c = false;
        hqm0Var.d = false;
        e = hqm0Var;
        hqm0Var.a = true;
        hqm0Var.b = true;
        hqm0Var.c = false;
        hqm0Var.d = false;
    }

    public static String a(String str, Class cls, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z) {
            return str.replace('$', JwtParser.SEPARATOR_CHAR);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.replace('$', JwtParser.SEPARATOR_CHAR);
    }
}
