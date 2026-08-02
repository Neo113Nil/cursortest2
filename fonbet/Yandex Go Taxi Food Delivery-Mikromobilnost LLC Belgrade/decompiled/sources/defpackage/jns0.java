package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public final class jns0 implements dqs0 {
    public final ins0 a;
    public final View b;
    public boolean c;
    public zls w;

    public jns0(ins0 ins0Var, View view) {
        this.a = ins0Var;
        this.b = view;
    }

    @Override // defpackage.dqs0
    public final dqs0 insert(ins0 ins0Var) {
        ins0 ins0Var2 = this.a;
        if (ins0Var == ins0Var2) {
            return this;
        }
        if (ins0Var2.e().getParent() == null) {
            ny61.r("Required value was null.");
            return null;
        }
        ins0Var.k(ins0Var2.e());
        jns0 jns0Var = new jns0(ins0Var, ins0Var2.e());
        zls zlsVar = this.w;
        if (zlsVar != null) {
            zlsVar.invoke(ins0Var, ins0Var.e(), jns0Var);
        }
        this.w = null;
        this.c = true;
        return jns0Var;
    }

    @Override // defpackage.dqs0
    /* renamed from: isUsed */
    public final boolean getIsUsed() {
        return this.c;
    }

    @Override // defpackage.dqs0
    public final void onInsertListener(zls zlsVar) {
        this.w = zlsVar;
    }
}
