package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes12.dex */
public final class dff implements qz0 {
    public final /* synthetic */ y4c0 a;
    public final /* synthetic */ boolean b;

    public dff(y4c0 y4c0Var, boolean z) {
        this.a = y4c0Var;
        this.b = z;
    }

    @Override // defpackage.qz0
    public final void P(Address address) {
        this.a.r(new qu(9));
    }

    @Override // defpackage.sy60
    public final void a() {
        boolean z = this.b;
        y4c0 y4c0Var = this.a;
        if (z) {
            y4c0Var.R();
        } else {
            y4c0Var.r(new qu(9));
        }
    }
}
