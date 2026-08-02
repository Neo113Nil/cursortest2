package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class bjf extends tu6 {
    public final ei11 b;

    public bjf(Context context, ei11 ei11Var) {
        super(context);
        this.b = ei11Var;
    }

    @Override // defpackage.tu6, defpackage.cjf
    public final byte[][] provide() {
        List<String> list = (List) this.b.a().b;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(evu0.y(str, "-----BEGIN CERTIFICATE-----", false) ? str.getBytes(uza.a) : oyr.p("-----BEGIN CERTIFICATE-----\n", evu0.k0(str).toString(), "\n-----END CERTIFICATE-----").getBytes(uza.a));
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }
}
