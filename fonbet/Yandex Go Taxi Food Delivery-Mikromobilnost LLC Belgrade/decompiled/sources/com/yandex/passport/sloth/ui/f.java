package com.yandex.passport.sloth.ui;

import android.view.View;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.bx60;
import defpackage.n751;
import defpackage.t070;
import defpackage.u1w;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements t070, bx60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        FrameLayoutBuilder frameLayoutBuilder = (FrameLayoutBuilder) this.b;
        u1w g = n751Var.a.g(655);
        frameLayoutBuilder.setPadding(g.a, g.b, g.c, g.d);
        return n751.b;
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        int i = this.a;
        e eVar = (e) this.b;
        switch (i) {
            case 0:
                eVar.invoke(obj);
                break;
            default:
                eVar.invoke(obj);
                break;
        }
    }
}
