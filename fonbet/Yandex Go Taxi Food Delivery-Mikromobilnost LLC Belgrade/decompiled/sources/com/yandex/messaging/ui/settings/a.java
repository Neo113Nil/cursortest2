package com.yandex.messaging.ui.settings;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.bricks.Brick;
import com.yandex.messaging.internal.v;
import defpackage.ab4;
import defpackage.jqr;
import defpackage.mrb;
import defpackage.n1f;
import defpackage.zrm;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public final Activity a;
    public final zrm b;
    public final c c;
    public final ab4 w;
    public final mrb x;

    public a(Activity activity, zrm zrmVar, c cVar, ab4 ab4Var) {
        this.a = activity;
        this.b = zrmVar;
        this.c = cVar;
        this.w = ab4Var;
        this.x = new mrb(activity, cVar);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        FrameLayout frameLayout = new FrameLayout(this.a);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        zrm zrmVar = this.b;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(new n1f(21, ((v) zrmVar.b).a(zy11.a), zrmVar), new ChooseOrganizationBrick$onBrickAttach$1(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.x.a.dismiss();
    }
}
