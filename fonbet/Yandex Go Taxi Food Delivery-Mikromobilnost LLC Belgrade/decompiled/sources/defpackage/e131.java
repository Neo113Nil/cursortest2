package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class e131 extends i35 {
    public final Object i;

    public e131(puz puzVar, Object obj) {
        super(Collections.EMPTY_LIST);
        k(puzVar);
        this.i = obj;
    }

    @Override // defpackage.i35
    public final float c() {
        return 1.0f;
    }

    @Override // defpackage.i35
    public final Object f() {
        puz puzVar = this.e;
        Object obj = this.i;
        float f = this.d;
        return puzVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        return f();
    }

    @Override // defpackage.i35
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // defpackage.i35
    public final void j(float f) {
        this.d = f;
    }
}
