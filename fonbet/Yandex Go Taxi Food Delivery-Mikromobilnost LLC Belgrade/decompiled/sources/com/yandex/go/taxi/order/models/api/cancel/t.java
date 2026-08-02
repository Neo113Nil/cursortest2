package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import defpackage.bj1;
import defpackage.cj1;
import defpackage.gsq0;

@gsq0(with = cj1.class)
/* loaded from: classes14.dex */
public abstract class t {
    public static final bj1 Companion = new bj1();

    public abstract AfterCancelPopupButton.ActionType a();

    public boolean b() {
        return a() != AfterCancelPopupButton.ActionType.UNKNOWN;
    }
}
