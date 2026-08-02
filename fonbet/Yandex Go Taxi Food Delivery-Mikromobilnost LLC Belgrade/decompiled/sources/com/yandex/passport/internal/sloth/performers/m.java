package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m implements s {
    public final com.yandex.passport.internal.core.accounts.p a;

    public m(com.yandex.passport.internal.core.accounts.p pVar) {
        this.a = pVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return new iqn(com.yandex.passport.internal.ui.sloth.e.a(new a0(5, this)));
    }
}
