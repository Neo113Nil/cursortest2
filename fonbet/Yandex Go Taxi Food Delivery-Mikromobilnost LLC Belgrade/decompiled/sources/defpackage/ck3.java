package defpackage;

import kotlin.a;

/* loaded from: classes15.dex */
public abstract class ck3 {
    public final zj3 a;
    public final pk3 b;
    public final jn3 c;
    public final oo90 d;
    public final zm90 e;
    public final i3y f;
    public final i3y g;
    public boolean i;
    public e1k h = e1k.M1;
    public boolean j = true;

    public ck3(zj3 zj3Var, pk3 pk3Var, jn3 jn3Var, oo90 oo90Var, zm90 zm90Var) {
        this.a = zj3Var;
        this.b = pk3Var;
        this.c = jn3Var;
        this.d = oo90Var;
        this.e = zm90Var;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: xj3
            public final /* synthetic */ ck3 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int hashCode;
                int i2 = i;
                ck3 ck3Var = this.b;
                switch (i2) {
                    case 0:
                        hashCode = ck3Var.hashCode();
                        break;
                    default:
                        hashCode = ((Number) ck3Var.f.getValue()).intValue() + 1;
                        break;
                }
                return Integer.valueOf(hashCode);
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: xj3
            public final /* synthetic */ ck3 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int hashCode;
                int i22 = i2;
                ck3 ck3Var = this.b;
                switch (i22) {
                    case 0:
                        hashCode = ck3Var.hashCode();
                        break;
                    default:
                        hashCode = ((Number) ck3Var.f.getValue()).intValue() + 1;
                        break;
                }
                return Integer.valueOf(hashCode);
            }
        });
    }

    public void a() {
    }

    public void b() {
    }

    public final void c() {
        this.h.close();
        this.h = e1k.M1;
        this.i = true;
    }

    public abstract String d();

    public final void e() {
        int intValue = ((Number) this.f.getValue()).intValue();
        pk3 pk3Var = this.b;
        pk3Var.b.remove(intValue);
        pk3Var.b.remove(((Number) this.g.getValue()).intValue());
    }

    public final wj3 f(boolean z) {
        this.j = true;
        int intValue = ((Number) this.f.getValue()).intValue();
        yj3 yj3Var = new yj3(this, 1);
        pk3 pk3Var = this.b;
        pk3Var.b.put(intValue, yj3Var);
        int i = 0;
        pk3Var.b.put(((Number) this.g.getValue()).intValue(), new yj3(this, 0));
        c();
        this.i = false;
        this.h = this.c.d(new ak3(this, z, i));
        if (this.i) {
            c();
        }
        return new wj3(i, this);
    }
}
