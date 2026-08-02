package com.yandex.go.morphlex.data.descriptors.actions.load_document;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.descriptors.action.d;
import defpackage.i830;
import defpackage.mu;
import defpackage.nu;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class a implements nu {
    public final Lifecycle a;
    public final d b;
    public final yvf0 c;
    public final i830 d;

    public a(Lifecycle lifecycle, d dVar, yvf0 yvf0Var, i830 i830Var) {
        this.a = lifecycle;
        this.b = dVar;
        this.c = yvf0Var;
        this.d = i830Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b.a(this.a, new MorphlexGoLoadDocumentActionDescriptorFactory$create$1(this, null));
    }
}
