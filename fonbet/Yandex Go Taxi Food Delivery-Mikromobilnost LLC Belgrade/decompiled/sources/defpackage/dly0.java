package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.b;

/* loaded from: classes10.dex */
public final class dly0 implements aly0 {
    public final long a;
    public final /* synthetic */ ely0 b;

    public dly0(ely0 ely0Var, long j) {
        this.b = ely0Var;
        this.a = j;
    }

    @Override // defpackage.aly0
    public final zky0 data() {
        return b.a(this.b);
    }

    @Override // defpackage.aly0
    public final zii0 k0(rzx rzxVar) {
        return wwg.b(x(rzxVar), 0L);
    }

    @Override // defpackage.aly0
    public final long x(rzx rzxVar) {
        rzx rzxVar2 = (rzx) this.b.w.getValue();
        if (rzxVar2 != null) {
            return rzxVar.T(rzxVar2, this.a);
        }
        lxv.d("Tried to open context menu before the anchor was placed.");
        ny61.A();
        return 0L;
    }
}
