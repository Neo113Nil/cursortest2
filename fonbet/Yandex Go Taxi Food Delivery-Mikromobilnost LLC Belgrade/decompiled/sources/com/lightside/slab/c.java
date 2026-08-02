package com.lightside.slab;

import android.view.View;
import com.lightside.slab.SlabViewLifecycle;
import defpackage.dqs0;
import defpackage.ins0;
import defpackage.scs0;

/* loaded from: classes11.dex */
public final class c {
    public View a;
    public dqs0 b;
    public ins0 c;
    public d d;

    public c(SlotView slotView) {
        this.a = slotView;
        this.b = slotView;
        a(slotView);
    }

    public final void a(dqs0 dqs0Var) {
        dqs0Var.getIsUsed();
        dqs0Var.onInsertListener(new SlabSlot$attachToWrapper$2(3, this, c.class, "onInsert", "onInsert(Lcom/lightside/slab/Slab;Landroid/view/View;Lcom/lightside/slab/Slot;)V", 0));
    }

    public final void b(ins0 ins0Var) {
        if (ins0Var == this.c) {
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            SlabViewLifecycle.ViewHelper viewHelper = dVar.a;
            if (viewHelper != null) {
                viewHelper.detachFromView();
            }
            dVar.a = null;
        }
        this.d = null;
        dqs0 dqs0Var = this.b;
        if ((dqs0Var instanceof SlotView) && ((SlotView) dqs0Var).getParent() == null) {
            this.d = new d((SlotView) this.b, new scs0(2, this, ins0Var));
        } else {
            a(this.b.insert(ins0Var));
        }
    }
}
