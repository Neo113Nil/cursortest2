package com.lightside.slab;

import defpackage.nt11;
import defpackage.tje;
import defpackage.yv5;
import kotlin.coroutines.Continuation;

/* loaded from: classes11.dex */
public abstract class a extends nt11 implements yv5 {
    public Object D;

    @Override // defpackage.ins0, defpackage.lns0
    public void a() {
        super.a();
        if (this.D != null) {
            tje.N(this, null, null, new BindableSlab$launchAndBind$1(this, null), 3);
        }
    }

    @Override // defpackage.yv5
    public final void c(Object obj) {
        this.D = obj;
        if (this.c.getIsAttached()) {
            tje.N(this, null, null, new BindableSlab$launchAndBind$1(this, null), 3);
        }
    }

    public abstract Object m(Object obj, Continuation continuation);

    @Override // defpackage.ins0, defpackage.lns0
    public void onDetach() {
        super.onDetach();
        this.D = null;
    }
}
