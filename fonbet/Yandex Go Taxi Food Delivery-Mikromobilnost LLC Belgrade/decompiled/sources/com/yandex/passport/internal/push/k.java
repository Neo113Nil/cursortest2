package com.yandex.passport.internal.push;

import android.widget.CheckBox;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.xbi0;

/* loaded from: classes15.dex */
public final class k implements xbi0 {
    public final int a;
    public final i3y b;

    public k(NotificationsBuilderActivity notificationsBuilderActivity, int i) {
        this.a = i;
        this.b = kotlin.a.a(new com.yandex.passport.internal.flags.presentation.l(5, notificationsBuilderActivity, this));
    }

    public final Boolean a() {
        return Boolean.valueOf(((CheckBox) this.b.getValue()).isChecked());
    }

    public final void b(boolean z) {
        ((CheckBox) this.b.getValue()).setChecked(z);
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a();
    }

    @Override // defpackage.xbi0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        b(((Boolean) obj2).booleanValue());
    }
}
