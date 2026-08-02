package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class gxs extends o2 {
    public final fxs[] a;

    public gxs(i3 i3Var) {
        this.a = new fxs[i3Var.size()];
        for (int i = 0; i != i3Var.size(); i++) {
            this.a[i] = fxs.m(i3Var.A(i));
        }
    }

    public static gxs m(Object obj) {
        if (obj instanceof gxs) {
            return (gxs) obj;
        }
        if (obj != null) {
            return new gxs(i3.z(obj));
        }
        return null;
    }

    public final fxs[] n() {
        fxs[] fxsVarArr = this.a;
        fxs[] fxsVarArr2 = new fxs[fxsVarArr.length];
        System.arraycopy(fxsVarArr, 0, fxsVarArr2, 0, fxsVarArr.length);
        return fxsVarArr2;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new jqf(this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String str = quu0.a;
        stringBuffer.append(str);
        int i = 0;
        while (true) {
            fxs[] fxsVarArr = this.a;
            if (i == fxsVarArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append(Extension.TAB_CHAR);
            stringBuffer.append(fxsVarArr[i]);
            stringBuffer.append(str);
            i++;
        }
    }

    public gxs(fxs fxsVar) {
        this.a = new fxs[]{fxsVar};
    }
}
