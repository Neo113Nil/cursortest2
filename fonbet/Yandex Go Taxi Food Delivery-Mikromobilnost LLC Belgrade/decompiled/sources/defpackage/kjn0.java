package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class kjn0 implements tgn {
    public final kf00 a;

    public kjn0(kf00 kf00Var) {
        this.a = kf00Var;
    }

    @Override // defpackage.tgn
    public final void a(int i, dhn dhnVar) {
        kf00 kf00Var = this.a;
        kf00.d(kf00Var, null, null, null, null, 31);
        String str = dhnVar.a;
        String str2 = dhnVar.b;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("mode", str);
        }
        if (str2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, str2);
        }
        hashMap.put("collection_size", valueOf);
        hashMap.put("provider", "eboks");
        kf00Var.a.a("Map.ScootersCollection.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.tgn
    public final void b(String str, List list, dhn dhnVar) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof xxn0) {
                    break;
                }
            }
        }
        xxn0 xxn0Var = (xxn0) obj;
        kf00 kf00Var = this.a;
        if (xxn0Var != null) {
            kf00Var.e(dhnVar.a, dhnVar.b, str, xxn0Var.c.b.k(), "eboks");
        } else {
            kf00Var.c(dhnVar.a, dhnVar.b, str, "eboks");
        }
    }
}
