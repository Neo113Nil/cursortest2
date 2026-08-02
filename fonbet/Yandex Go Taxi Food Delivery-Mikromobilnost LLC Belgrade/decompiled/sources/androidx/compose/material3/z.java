package androidx.compose.material3;

import defpackage.aa10;
import defpackage.b92;
import defpackage.e530;
import defpackage.h8w;
import defpackage.jl40;
import defpackage.jzw0;
import defpackage.kxv;
import defpackage.n8e;
import defpackage.p8e;
import defpackage.tje;
import defpackage.twt0;
import defpackage.uzw0;
import defpackage.v0y;
import defpackage.x910;

/* loaded from: classes10.dex */
public final class z extends e530 implements v0y {
    public float A;
    public h8w a;
    public boolean b;
    public twt0 c;
    public boolean w;
    public androidx.compose.animation.core.a x;
    public androidx.compose.animation.core.a y;
    public float z;

    @Override // defpackage.v0y
    public final aa10 e(androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        float w0 = kVar.w0(this.w ? uzw0.b : ((x910Var.y(n8e.i(j)) != 0 && x910Var.k0(n8e.h(j)) != 0) || this.b) ? jzw0.a : jzw0.b);
        androidx.compose.animation.core.a aVar = this.y;
        int floatValue = (int) (aVar != null ? ((Number) aVar.e()).floatValue() : w0);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            kxv.a("width and height must be >= 0");
        }
        androidx.compose.ui.layout.o l0 = x910Var.l0(p8e.h(floatValue, floatValue, floatValue, floatValue));
        float w02 = kVar.w0((jzw0.d - kVar.I(w0)) / 2.0f);
        float w03 = kVar.w0((jzw0.c - jzw0.a) - jzw0.e);
        boolean z = this.w;
        if (z && this.b) {
            w02 = w03 - kVar.w0(uzw0.f);
        } else if (z && !this.b) {
            w02 = kVar.w0(uzw0.f);
        } else if (this.b) {
            w02 = w03;
        }
        androidx.compose.animation.core.a aVar2 = this.y;
        if (!jl40.j(aVar2 != null ? (Float) aVar2.f.getValue() : null, w0)) {
            tje.N(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, w0, null), 3);
        }
        androidx.compose.animation.core.a aVar3 = this.x;
        if (!jl40.j(aVar3 != null ? (Float) aVar3.f.getValue() : null, w02)) {
            tje.N(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, w02, null), 3);
        }
        if (Float.isNaN(this.A) && Float.isNaN(this.z)) {
            this.A = w0;
            this.z = w02;
        }
        return kVar.w(floatValue, floatValue, kotlin.collections.b.f(), new b92(l0, this, w02, 4));
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        tje.N(getCoroutineScope(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        this.x = null;
        this.y = null;
        this.A = Float.NaN;
        this.z = Float.NaN;
    }
}
