package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.Set;

/* loaded from: classes15.dex */
public final /* synthetic */ class awr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gwr b;
    public final /* synthetic */ Set c;

    public /* synthetic */ awr(gwr gwrVar, Set set, int i) {
        this.a = i;
        this.b = gwrVar;
        this.c = set;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Set<vwr> set = this.c;
        gwr gwrVar = this.b;
        switch (i) {
            case 0:
                gwrVar.b.c((oll0) obj, set);
                break;
            default:
                RoomDatabase roomDatabase = gwrVar.a;
                if (!set.isEmpty()) {
                    for (vwr vwrVar : set) {
                        String str = vwrVar.a;
                        long j = vwrVar.b;
                        a.b(roomDatabase, false, true, new qo6(str, j, 2));
                        a.b(roomDatabase, false, true, new qo6(vwrVar.a, j, 3));
                    }
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
