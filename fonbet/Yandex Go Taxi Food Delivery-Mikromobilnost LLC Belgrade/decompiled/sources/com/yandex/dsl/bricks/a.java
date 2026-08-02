package com.yandex.dsl.bricks;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.yandex.bricks.Brick;
import defpackage.i3y;
import defpackage.jp31;
import defpackage.sls;

/* loaded from: classes11.dex */
public abstract class a extends Brick implements jp31 {
    public final Context a;
    public final i3y b = kotlin.a.a(new sls() { // from class: com.yandex.dsl.bricks.BrickBuilder$rootView$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            a aVar = a.this;
            return aVar.q(aVar);
        }
    });

    public a(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.jp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return (View) this.b.getValue();
    }

    public abstract View q(jp31 jp31Var);
}
