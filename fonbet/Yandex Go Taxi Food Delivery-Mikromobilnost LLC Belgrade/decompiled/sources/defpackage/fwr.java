package defpackage;

/* loaded from: classes15.dex */
public final class fwr extends y2o {
    public final /* synthetic */ int a;
    public final /* synthetic */ gwr b;

    public /* synthetic */ fwr(gwr gwrVar, int i) {
        this.a = i;
        this.b = gwrVar;
    }

    @Override // defpackage.y2o
    public final void a(ull0 ull0Var, Object obj) {
        int i = this.a;
        gwr gwrVar = this.b;
        switch (i) {
            case 0:
                hwr hwrVar = (hwr) obj;
                ull0Var.g1(1, hwrVar.a);
                ull0Var.g1(2, hwrVar.b);
                ull0Var.b(3, hwrVar.c);
                ull0Var.b(4, hwrVar.d);
                ull0Var.b(5, hwrVar.e);
                String d = gwrVar.a().d(hwrVar.f);
                if (d == null) {
                    ull0Var.p(6);
                } else {
                    ull0Var.g1(6, d);
                }
                String d2 = gwrVar.a().d(hwrVar.g);
                if (d2 != null) {
                    ull0Var.g1(7, d2);
                    break;
                } else {
                    ull0Var.p(7);
                    break;
                }
            default:
                x400 x400Var = (x400) obj;
                ull0Var.b(1, x400Var.a);
                String d3 = gwrVar.a().d(x400Var.b);
                if (d3 != null) {
                    ull0Var.g1(2, d3);
                    break;
                } else {
                    ull0Var.p(2);
                    break;
                }
        }
    }

    @Override // defpackage.y2o
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `folders` (`folder_id`,`name`,`organization_id`,`sort_order`,`folder_icon`,`included_chat_ids`,`excluded_chat_ids`) VALUES (?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `main_folders` (`organization_id`,`excluded_folder_ids`) VALUES (?,?)";
        }
    }
}
