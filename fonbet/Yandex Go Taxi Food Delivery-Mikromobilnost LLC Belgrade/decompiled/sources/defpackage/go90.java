package defpackage;

import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.Partitions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class go90 {
    public final u02 a;
    public final to90 b;

    public go90(u02 u02Var, to90 to90Var) {
        this.a = u02Var;
        this.b = to90Var;
    }

    public final Filter a(tls tlsVar) {
        Filter.a aVar = new Filter.a();
        this.a.getClass();
        aVar.a = KPassportEnvironment.PRODUCTION;
        to90 to90Var = this.b;
        List list = (List) to90Var.e.get();
        if (list == null) {
            list = to90Var.a();
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            String[] strArr = (String[]) list.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                arrayList.add(PassportPartition.m231boximpl(PassportPartition.m232constructorimpl(str)));
            }
            aVar.c = new Partitions(arrayList);
        }
        tlsVar.invoke(aVar);
        return aVar.a();
    }
}
