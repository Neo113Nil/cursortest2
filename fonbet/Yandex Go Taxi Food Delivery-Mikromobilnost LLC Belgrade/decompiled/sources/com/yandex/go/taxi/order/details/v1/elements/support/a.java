package com.yandex.go.taxi.order.details.v1.elements.support;

import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.vf41;
import defpackage.w030;
import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes14.dex */
public final class a {
    public final w030 a;
    public final vf41 b;
    public final ru.yandex.taxi.am.token.a c;
    public final tse d;
    public final tt2 e;

    public a(w030 w030Var, vf41 vf41Var, ru.yandex.taxi.am.token.a aVar, tse tseVar, tt2 tt2Var) {
        this.a = w030Var;
        this.b = vf41Var;
        this.c = aVar;
        this.d = tseVar;
        this.e = tt2Var;
    }

    public final void a(String str) {
        if (this.a.i(WebContainerModalView.class) != null) {
            return;
        }
        tje.N(this.d, null, null, new SupportChatRouter$openSupportChat$1(this, str, null), 3);
    }
}
