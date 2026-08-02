package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public final class dax implements bax {
    public final String a;
    public final String b;
    public final iyw c;
    public final String[] d;

    public dax(String str, String str2, iyw iywVar, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = iywVar;
        this.d = strArr;
    }

    @Override // defpackage.mbx
    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        String str2 = this.b;
        if (str2 == null || str2.length() == 0) {
            sb.append("function " + str + '(');
            sb.append(") {");
        } else {
            sb.append(str + ": function(");
        }
        String[] strArr = this.d;
        j73.J(strArr, sb, null, HProv.PP_SAME_MEDIA);
        sb.append(") {");
        sb.append("\n");
        sb.append("return createPromise(\"" + str2 + '.' + str + OpenList.CHAR_QUOTE);
        for (String str3 : strArr) {
            sb.append(Extension.FIX_SPACE);
            sb.append(str3);
        }
        sb.append(")\n}");
        return sb.toString();
    }

    @Override // defpackage.bax
    public final iyw b(List list) {
        return this.c;
    }
}
