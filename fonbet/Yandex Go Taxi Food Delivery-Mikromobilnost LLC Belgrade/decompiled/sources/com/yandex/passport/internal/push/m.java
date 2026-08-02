package com.yandex.passport.internal.push;

import android.widget.EditText;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.tls;
import defpackage.xbi0;

/* loaded from: classes15.dex */
public final class m implements xbi0 {
    public final int a;
    public final tls b;
    public final tls c;
    public final i3y w;

    public m(NotificationsBuilderActivity notificationsBuilderActivity, int i, tls tlsVar, tls tlsVar2) {
        this.a = i;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.w = kotlin.a.a(new com.yandex.passport.internal.flags.presentation.l(6, notificationsBuilderActivity, this));
    }

    public final Object a() {
        return this.b.invoke(((EditText) this.w.getValue()).getText().toString());
    }

    public final void b(Object obj) {
        ((EditText) this.w.getValue()).setText((String) this.c.invoke(obj));
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a();
    }

    @Override // defpackage.xbi0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        b(obj2);
    }
}
