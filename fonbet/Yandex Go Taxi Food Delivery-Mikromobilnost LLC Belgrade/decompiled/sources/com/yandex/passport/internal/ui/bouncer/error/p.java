package com.yandex.passport.internal.ui.bouncer.error;

import android.widget.Button;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.li91;
import defpackage.rs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p extends com.lightside.slab.a {
    public final h E;
    public final t F;

    public p(h hVar, t tVar) {
        this.E = hVar;
        this.F = tVar;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        h hVar = this.E;
        hVar.x.x.setText(R.string.passport_error_login_not_available);
        Button button = hVar.x.y;
        button.setText(R.string.passport_am_choose_another_account);
        li91.e(new WrongAccountSlab$performBind$2$1(this, null), button);
        return zy11.a;
    }
}
