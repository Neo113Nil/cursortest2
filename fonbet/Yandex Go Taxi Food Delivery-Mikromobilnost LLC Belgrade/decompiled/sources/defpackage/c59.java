package defpackage;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class c59 implements rid0 {
    public final /* synthetic */ int a;
    public final String b;
    public final k9y0 c;

    public /* synthetic */ c59(String str, k9y0 k9y0Var, int i) {
        this.a = i;
        this.b = str;
        this.c = k9y0Var;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // defpackage.rid0
    public final void h() {
        int i = this.a;
    }

    @Override // defpackage.rid0
    public final void m() {
        int i = this.a;
    }

    @Override // defpackage.rid0
    public final void n() {
        int i = this.a;
        String str = this.b;
        k9y0 k9y0Var = this.c;
        switch (i) {
            case 0:
                if (k9y0Var != null) {
                    jc4 jc4Var = k9y0Var.b;
                    jc4Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("open_reason", str);
                    jc4Var.a.a("CatchUpCashback.Tapped", hashMap, 1, new HashMap());
                    break;
                }
                break;
            default:
                if (k9y0Var != null) {
                    jc4 jc4Var2 = k9y0Var.c;
                    jc4Var2.getClass();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("open_reason", str);
                    jc4Var2.a.a("PlusBurns.Tapped", hashMap2, 1, new HashMap());
                    break;
                }
                break;
        }
    }
}
