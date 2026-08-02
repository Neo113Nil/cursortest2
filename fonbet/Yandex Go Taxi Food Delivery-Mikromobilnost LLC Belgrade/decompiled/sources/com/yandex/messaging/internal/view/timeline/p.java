package com.yandex.messaging.internal.view.timeline;

import defpackage.ase;
import defpackage.olh0;
import defpackage.tbz0;
import defpackage.vb5;
import defpackage.yab;

/* loaded from: classes15.dex */
public final class p extends b {
    public static final int T3 = olh0.msg_base_other_gallery;

    @Override // com.yandex.messaging.internal.view.timeline.b
    public final ase K0(boolean z, boolean z2) {
        boolean z3 = this.v3;
        int i = this.v1;
        int i2 = this.p1;
        if (!z2) {
            int i3 = z3 ? i2 : i;
            if (this.X2) {
                i = i2;
            }
            return new ase(i2, i3, i, i2);
        }
        int i4 = z3 ? i2 : i;
        boolean z4 = this.X2;
        int i5 = z4 ? i2 : i;
        if (z4) {
            i = i2;
        }
        return new ase(i2, i4, i5, i);
    }

    @Override // com.yandex.messaging.internal.view.timeline.b, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new tbz0(yabVar.Z(), yabVar.a());
    }
}
