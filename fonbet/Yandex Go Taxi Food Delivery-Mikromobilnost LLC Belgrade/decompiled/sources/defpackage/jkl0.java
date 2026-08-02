package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes12.dex */
public final class jkl0 {
    public static String a(String str, String str2, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append("/table=".concat(str2));
        sb.append("/path=690.32");
        StringBuilder sb2 = new StringBuilder("rum_id=ru.pay,-version=1.16.9,-env=production,-project=pay,-page=payment,-service=android");
        sb2.append(",-ts=" + System.currentTimeMillis());
        sb2.append(",-name=".concat(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        auu0 auu0Var = auu0.a;
        String c = rbxVar.c(linkedHashMap, new k8u(auu0Var, auu0Var, 1));
        ArrayList arrayList = ug21.a;
        StringBuilder sb3 = new StringBuilder();
        for (byte b : c.getBytes(uza.a)) {
            if (ug21.b.contains(Byte.valueOf(b)) || ug21.a.contains(Byte.valueOf(b))) {
                sb3.append((char) b);
            } else {
                int i = (b & 255) >> 4;
                char c2 = (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48);
                int i2 = b & PKIBody._CCP;
                sb3.append(new String(new char[]{'%', c2, (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)}));
            }
        }
        sb2.append(",-additional=".concat(sb3.toString()));
        sb.append("/vars=".concat(sb2.toString()));
        sb.append("/*");
        return sb.toString();
    }
}
