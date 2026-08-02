package defpackage;

import android.content.Intent;

/* loaded from: classes15.dex */
public final class ak3 implements cl3 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ak3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override // defpackage.cl3
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                if (!this.b) {
                    ck3Var.e();
                    break;
                } else {
                    Intent b = ck3Var.d.b(ck3Var.d());
                    if (b != null) {
                        pk3 pk3Var = ck3Var.b;
                        int intValue = ((Number) ck3Var.f.getValue()).intValue();
                        if (!pk3Var.isAttached()) {
                            pk3Var.c = new p61(pk3Var, b, intValue, 2);
                            break;
                        } else {
                            pk3Var.startActivityForResult(b, intValue);
                            break;
                        }
                    }
                }
                break;
            default:
                ((ao3) obj).f();
                break;
        }
    }

    @Override // defpackage.cl3
    public final void d() {
        int i = this.a;
    }

    @Override // defpackage.cl3
    public final void e() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                if (ck3Var.j) {
                    ck3Var.e();
                    ck3Var.c();
                    ck3Var.b();
                }
                ck3Var.j = false;
                break;
            default:
                ((ao3) obj).a();
                break;
        }
    }

    @Override // defpackage.cl3
    public final void g() {
        int i = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                if (!ck3Var.a.a) {
                    if (!z) {
                        ck3Var.e();
                        break;
                    } else {
                        Intent a = ck3Var.d.a(null);
                        if (a != null) {
                            pk3 pk3Var = ck3Var.b;
                            int intValue = ((Number) ck3Var.g.getValue()).intValue();
                            if (!pk3Var.isAttached()) {
                                pk3Var.c = new p61(pk3Var, a, intValue, 2);
                                break;
                            } else {
                                pk3Var.startActivityForResult(a, intValue);
                                break;
                            }
                        }
                    }
                } else {
                    if (ck3Var.j) {
                        ck3Var.e();
                        ck3Var.c();
                        ck3Var.b();
                    }
                    ck3Var.j = false;
                    break;
                }
                break;
            default:
                ao3 ao3Var = (ao3) obj;
                if (!z) {
                    ao3Var.f();
                    break;
                } else {
                    ao3Var.a();
                    break;
                }
        }
    }

    @Override // defpackage.cl3
    public final void h() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ao3) this.c).f();
                break;
        }
    }
}
