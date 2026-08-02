package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class dnb1 extends s591 {
    public final boolean c;
    public final boolean w;
    public final /* synthetic */ hma1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnb1(hma1 hma1Var, boolean z, boolean z2) {
        super("log");
        this.x = hma1Var;
        this.c = z;
        this.w = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // defpackage.s591
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r691 c(cr71 cr71Var, List list) {
        int i;
        int i2;
        cwa1.f(1, "log", list);
        int size = list.size();
        g791 g791Var = r691.z5;
        hma1 hma1Var = this.x;
        if (size == 1) {
            ((va90) hma1Var.w).m(3, ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.w);
            return g791Var;
        }
        r691 r691Var = (r691) list.get(0);
        p791 p791Var = (p791) cr71Var.c;
        p791 p791Var2 = (p791) cr71Var.c;
        int k = cwa1.k(p791Var.b(cr71Var, r691Var).zzd().doubleValue());
        if (k != 2) {
            i = 3;
            if (k == 3) {
                i2 = 1;
            } else if (k == 5) {
                i2 = 5;
            } else if (k == 6) {
                i2 = 2;
            }
            String zzc = p791Var2.b(cr71Var, (r691) list.get(1)).zzc();
            if (list.size() != 2) {
                ((va90) hma1Var.w).m(i2, zzc, Collections.EMPTY_LIST, this.c, this.w);
                return g791Var;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(p791Var2.b(cr71Var, (r691) list.get(i3)).zzc());
            }
            ((va90) hma1Var.w).m(i2, zzc, arrayList, this.c, this.w);
            return g791Var;
        }
        i = 4;
        i2 = i;
        String zzc2 = p791Var2.b(cr71Var, (r691) list.get(1)).zzc();
        if (list.size() != 2) {
        }
    }
}
