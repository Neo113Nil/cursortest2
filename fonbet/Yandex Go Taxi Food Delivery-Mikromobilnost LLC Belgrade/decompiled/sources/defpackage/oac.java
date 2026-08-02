package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final /* synthetic */ class oac implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ oac(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.d.add(new uev());
                aVar.c.add(new a9v());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aVar.a((p8w) it.next());
                }
                return new OkHttpClient(aVar);
            case 1:
                return list;
            default:
                HashSet hashSet = new HashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((ol20) it2.next()).a);
                }
                return hashSet;
        }
    }
}
