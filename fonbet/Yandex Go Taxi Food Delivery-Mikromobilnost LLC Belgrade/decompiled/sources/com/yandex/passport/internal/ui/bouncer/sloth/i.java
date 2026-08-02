package com.yandex.passport.internal.ui.bouncer.sloth;

import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.t;
import com.yandex.passport.sloth.ui.SlothUiWish;
import com.yandex.passport.sloth.ui.dependencies.q;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class i implements q {
    public final t a;

    public i(t tVar) {
        this.a = tVar;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(SlothUiWish slothUiWish) {
        int i = h.a[slothUiWish.ordinal()];
        t tVar = this.a;
        if (i == 1) {
            tVar.a(f2.a);
        } else if (i == 2) {
            tVar.a(f2.b);
        } else {
            if (i == 3) {
                return;
            }
            w511.b();
        }
    }
}
