package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class eax implements fax, aax {
    public final String a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final String d;

    public eax(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.d = str2 != null ? g8e.p(str2, Extension.DOT_CHAR, str) : str;
    }

    @Override // defpackage.lbx
    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        String str2 = this.b;
        if (str2 == null || str2.length() == 0) {
            sb.append("window." + str + "={\n");
        } else {
            sb.append(str + ": {\n");
        }
        a.W(this.c.values(), sb, ",\n", new mtw(6), 60);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // defpackage.aax
    public final hyw b(List list) {
        if (!list.isEmpty()) {
            aax aaxVar = (aax) this.c.get(list.get(0));
            if (aaxVar != null) {
                return aaxVar.b(list.subList(1, list.size()));
            }
        }
        return ij91.a;
    }

    @Override // defpackage.fax
    public final String d() {
        return this.d;
    }

    @Override // defpackage.fax
    public final LinkedHashMap getChildren() {
        return this.c;
    }
}
