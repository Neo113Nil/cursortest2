package com.lightside.slab;

import com.lightside.slab.SlabViewLifecycle;
import defpackage.scs0;

/* loaded from: classes11.dex */
public final class d extends SlabViewLifecycle {
    public final SlotView b;
    public final scs0 c;

    public d(SlotView slotView, scs0 scs0Var) {
        this.b = slotView;
        this.c = scs0Var;
        SlabViewLifecycle.ViewHelper viewHelper = this.a;
        if (viewHelper != null) {
            viewHelper.detachFromView();
        }
        this.a = null;
        SlabViewLifecycle.ViewHelper viewHelper2 = new SlabViewLifecycle.ViewHelper(slotView);
        viewHelper2.attachToView();
        this.a = viewHelper2;
    }

    @Override // com.lightside.slab.SlabViewLifecycle, defpackage.lns0
    public final void a() {
        this.c.invoke(this.b);
        SlabViewLifecycle.ViewHelper viewHelper = this.a;
        if (viewHelper != null) {
            viewHelper.detachFromView();
        }
        this.a = null;
    }
}
