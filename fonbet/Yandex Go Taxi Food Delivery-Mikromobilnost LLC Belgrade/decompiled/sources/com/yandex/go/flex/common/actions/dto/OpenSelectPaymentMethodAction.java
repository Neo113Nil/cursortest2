package com.yandex.go.flex.common.actions.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/OpenSelectPaymentMethodAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/common/actions/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenSelectPaymentMethodAction extends kr {
    public static final d Companion = new d();
    public static final i3y[] d;
    public final JasonStateNodeDto a;
    public final kr b;
    public final kr c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y570(12)), kotlin.a.b(lazyThreadSafetyMode, new y570(13))};
    }

    public /* synthetic */ OpenSelectPaymentMethodAction(int i, JasonStateNodeDto jasonStateNodeDto, kr krVar, kr krVar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = jasonStateNodeDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = krVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = krVar2;
        }
    }

    public OpenSelectPaymentMethodAction() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
