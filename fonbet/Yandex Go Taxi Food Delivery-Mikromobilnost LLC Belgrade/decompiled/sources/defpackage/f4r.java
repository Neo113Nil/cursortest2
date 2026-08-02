package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class f4r implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4r b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ f4r(g4r g4rVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = g4rVar;
        this.c = arrayList;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = this.c;
        g4r g4rVar = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                RoomDatabase roomDatabase = g4rVar.a;
                a.b(roomDatabase, false, true, new xvq(2));
                a.b(roomDatabase, false, true, new f4r(g4rVar, arrayList, 2));
                break;
            case 1:
                g4rVar.d.c(oll0Var, arrayList);
                break;
            default:
                g4rVar.b.c(oll0Var, arrayList);
                break;
        }
        return zy11Var;
    }
}
