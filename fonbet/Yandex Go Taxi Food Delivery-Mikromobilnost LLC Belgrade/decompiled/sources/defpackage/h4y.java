package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class h4y implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ h4y(oz40 oz40Var, ArrayList arrayList, List list, boolean z, int i) {
        this.a = i;
        this.b = oz40Var;
        this.c = arrayList;
        this.w = list;
        this.x = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.x;
        List list = this.w;
        ArrayList arrayList = this.c;
        oz40 oz40Var = this.b;
        zy11 zy11Var = zy11.a;
        o.a aVar = (o.a) obj;
        switch (i) {
            case 0:
                aVar.a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((j4y) arrayList.get(i2)).a(aVar, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((j4y) list.get(i3)).a(aVar, z);
                }
                aVar.a = false;
                oz40Var.getValue();
                break;
            default:
                aVar.a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((t6y) arrayList.get(i4)).b(aVar, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((t6y) list.get(i5)).b(aVar, z);
                }
                aVar.a = false;
                oz40Var.getValue();
                break;
        }
        return zy11Var;
    }
}
