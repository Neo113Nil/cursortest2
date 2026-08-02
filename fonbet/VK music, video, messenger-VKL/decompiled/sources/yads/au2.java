package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class au2 implements y9 {
    public final v9 a;

    public au2(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // yads.y9
    public final gp2 a() {
        gp2 gp2Var = new gp2((Map) null, 3);
        gp2Var.b(this.a.l, "ad_source");
        gp2Var.b(this.a.b, "ad_type_format");
        gp2Var.b(this.a.e, "ad_unit_id");
        gp2Var.b(this.a.d, "product_type");
        gp2Var.a(this.a.o, "server_log_id");
        gp2Var.b(this.a.c().a.b, "size_type");
        gp2Var.b(Integer.valueOf(this.a.c().c), "width");
        gp2Var.b(Integer.valueOf(this.a.c().d), "height");
        gp2Var.b = this.a.i;
        return gp2Var;
    }
}
