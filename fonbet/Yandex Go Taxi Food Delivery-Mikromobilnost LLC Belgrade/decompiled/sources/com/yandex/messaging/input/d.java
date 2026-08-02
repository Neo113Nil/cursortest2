package com.yandex.messaging.input;

import android.app.Activity;
import com.yandex.bricks.BrickSlotView;
import defpackage.fk6;
import defpackage.h3y;
import defpackage.ms11;
import defpackage.nyv;
import defpackage.ss11;
import defpackage.tje;

/* loaded from: classes15.dex */
public final class d extends ss11 {
    public final h3y A;
    public final h3y B;
    public final h3y C;
    public final nyv D;
    public fk6 E;
    public final Activity a;
    public final c b;
    public final h3y c;
    public final h3y w;
    public final h3y x;
    public final h3y y;
    public final h3y z;

    public d(Activity activity, c cVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8) {
        this.a = activity;
        this.b = cVar;
        this.c = h3yVar;
        this.w = h3yVar2;
        this.x = h3yVar3;
        this.y = h3yVar4;
        this.z = h3yVar5;
        this.A = h3yVar6;
        this.B = h3yVar7;
        this.C = h3yVar8;
        nyv nyvVar = new nyv(activity, 0);
        this.D = nyvVar;
        this.E = (BrickSlotView) nyvVar.w;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        tje.N(getBrickScope(), null, null, new InputDispatcherBrick$onBrickAttach$1(this, null), 3);
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.D;
    }
}
