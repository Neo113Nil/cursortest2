package defpackage;

/* loaded from: classes15.dex */
public final class fv21 extends y2o {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv21 b;

    public /* synthetic */ fv21(gv21 gv21Var, int i) {
        this.a = i;
        this.b = gv21Var;
    }

    @Override // defpackage.y2o
    public final void a(ull0 ull0Var, Object obj) {
        int i = this.a;
        gv21 gv21Var = this.b;
        switch (i) {
            case 0:
                hv21 hv21Var = (hv21) obj;
                ull0Var.g1(1, hv21Var.a);
                ull0Var.b(2, hv21Var.b ? 1L : 0L);
                String d = ((w5z) gv21Var.c.getValue()).d(hv21Var.c);
                if (d == null) {
                    ull0Var.p(3);
                } else {
                    ull0Var.g1(3, d);
                }
                String d2 = ((x5z) gv21Var.d.getValue()).d(hv21Var.d);
                if (d2 != null) {
                    ull0Var.g1(4, d2);
                    break;
                } else {
                    ull0Var.p(4);
                    break;
                }
            default:
                hv21 hv21Var2 = (hv21) obj;
                ull0Var.g1(1, hv21Var2.a);
                ull0Var.b(2, hv21Var2.b ? 1L : 0L);
                String d3 = ((w5z) gv21Var.c.getValue()).d(hv21Var2.c);
                if (d3 == null) {
                    ull0Var.p(3);
                } else {
                    ull0Var.g1(3, d3);
                }
                String d4 = ((x5z) gv21Var.d.getValue()).d(hv21Var2.d);
                if (d4 != null) {
                    ull0Var.g1(4, d4);
                    break;
                } else {
                    ull0Var.p(4);
                    break;
                }
        }
    }

    @Override // defpackage.y2o
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `localized_data` (`user_id`,`loaded`,`descriptor`,`localization_map`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `localized_data` (`user_id`,`loaded`,`descriptor`,`localization_map`) VALUES (?,?,?,?)";
        }
    }
}
