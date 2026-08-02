package com.yandex.dsl.views;

import android.content.Context;
import android.view.View;
import defpackage.i3y;
import defpackage.jp31;
import defpackage.ms11;
import defpackage.sls;

/* loaded from: classes11.dex */
public abstract class a implements ms11, jp31 {
    public final Context a;
    public final i3y b = kotlin.a.a(new sls() { // from class: com.yandex.dsl.views.LayoutUi$root$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            a aVar = a.this;
            return aVar.a(aVar);
        }
    });

    public a(Context context) {
        this.a = context;
    }

    public abstract View a(jp31 jp31Var);

    @Override // defpackage.jp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.ms11
    public final View getRoot() {
        return (View) this.b.getValue();
    }
}
