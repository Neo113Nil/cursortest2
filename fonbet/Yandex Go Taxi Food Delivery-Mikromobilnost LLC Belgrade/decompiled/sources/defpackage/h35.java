package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class h35 implements f35 {
    public final rkx a;
    public float b = -1.0f;

    public h35(List list) {
        this.a = (rkx) list.get(0);
    }

    @Override // defpackage.f35
    public final rkx e() {
        return this.a;
    }

    @Override // defpackage.f35
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.f35
    public final float l() {
        return this.a.b();
    }

    @Override // defpackage.f35
    public final boolean s(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.f35
    public final boolean t(float f) {
        return !this.a.c();
    }

    @Override // defpackage.f35
    public final float x() {
        return this.a.a();
    }
}
