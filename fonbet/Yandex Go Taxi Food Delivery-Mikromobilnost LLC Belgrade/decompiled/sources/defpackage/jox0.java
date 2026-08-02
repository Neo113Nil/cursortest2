package defpackage;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final /* synthetic */ class jox0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ lox0 b;
    public final /* synthetic */ x880 c;

    public /* synthetic */ jox0(lox0 lox0Var, x880 x880Var, int i) {
        this.a = i;
        this.b = lox0Var;
        this.c = x880Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                lox0 lox0Var = this.b;
                x880 x880Var = this.c;
                o61 o61Var = lox0Var.h;
                String valueOf = String.valueOf(lox0Var.j);
                o61Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("value", valueOf);
                o61Var.a.a("surge_was_accepted", hashMap, 1, new HashMap());
                lox0Var.b.a.F = lox0Var.j;
                x880Var.n();
                break;
            default:
                lox0 lox0Var2 = this.b;
                x880 x880Var2 = this.c;
                o61 o61Var2 = lox0Var2.h;
                String valueOf2 = String.valueOf(lox0Var2.j);
                o61Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("value", valueOf2);
                o61Var2.a.a("surge_was_declined", hashMap2, 1, new HashMap());
                x880Var2.o();
                break;
        }
        return zy11.a;
    }
}
