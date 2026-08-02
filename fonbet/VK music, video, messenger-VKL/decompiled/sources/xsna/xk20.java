package xsna;

import java.lang.reflect.Modifier;

/* compiled from: MethodSignatureImpl.java */
/* loaded from: classes8.dex */
public final class xk20 extends kmj0 {
    public Class[] g;
    public Class h;

    @Override // xsna.kmj0
    public final String a() {
        hqm0 hqm0Var = hqm0.e;
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.a;
        if (i == -1) {
            throw null;
        }
        String str = "";
        if (hqm0Var.c) {
            String modifier = Modifier.toString(i);
            if (modifier.length() != 0) {
                str = modifier.concat(" ");
            }
        }
        stringBuffer.append(str);
        if (hqm0Var.b) {
            this.h.getClass();
            Class cls = this.h;
            stringBuffer.append(hqm0.a(cls.getName(), cls, hqm0Var.a));
        }
        if (hqm0Var.b) {
            stringBuffer.append(" ");
        }
        this.d.getClass();
        Class cls2 = this.d;
        if (this.c == null) {
            cls2.getClass();
            this.c = this.d.getName();
        }
        stringBuffer.append(hqm0.a(this.c, cls2, hqm0Var.d));
        stringBuffer.append(".");
        this.b.getClass();
        stringBuffer.append(this.b);
        Class[] clsArr = this.g;
        if (hqm0Var.b) {
            stringBuffer.append("(");
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                if (i2 > 0) {
                    stringBuffer.append(", ");
                }
                Class cls3 = clsArr[i2];
                stringBuffer.append(hqm0.a(cls3.getName(), cls3, hqm0Var.a));
            }
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
        return stringBuffer.toString();
    }
}
