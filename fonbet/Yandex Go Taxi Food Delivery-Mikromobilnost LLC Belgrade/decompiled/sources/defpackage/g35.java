package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class g35 implements f35 {
    public final List a;
    public rkx c = null;
    public float w = -1.0f;
    public rkx b = a(0.0f);

    public g35(List list) {
        this.a = list;
    }

    public final rkx a(float f) {
        List list = this.a;
        rkx rkxVar = (rkx) b64.c(1, list);
        if (f >= rkxVar.b()) {
            return rkxVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            rkx rkxVar2 = (rkx) list.get(size);
            if (this.b != rkxVar2 && f >= rkxVar2.b() && f < rkxVar2.a()) {
                return rkxVar2;
            }
        }
        return (rkx) list.get(0);
    }

    @Override // defpackage.f35
    public final rkx e() {
        return this.b;
    }

    @Override // defpackage.f35
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.f35
    public final float l() {
        return ((rkx) this.a.get(0)).b();
    }

    @Override // defpackage.f35
    public final boolean s(float f) {
        rkx rkxVar = this.c;
        rkx rkxVar2 = this.b;
        if (rkxVar == rkxVar2 && this.w == f) {
            return true;
        }
        this.c = rkxVar2;
        this.w = f;
        return false;
    }

    @Override // defpackage.f35
    public final boolean t(float f) {
        rkx rkxVar = this.b;
        if (f >= rkxVar.b() && f < rkxVar.a()) {
            return !this.b.c();
        }
        this.b = a(f);
        return true;
    }

    @Override // defpackage.f35
    public final float x() {
        return ((rkx) b64.c(1, this.a)).a();
    }
}
