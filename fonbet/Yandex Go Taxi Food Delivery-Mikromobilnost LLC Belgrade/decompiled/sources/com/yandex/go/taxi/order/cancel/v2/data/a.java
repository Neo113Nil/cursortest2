package com.yandex.go.taxi.order.cancel.v2.data;

import defpackage.ol70;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ tse a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ol70 c;
    public final /* synthetic */ ThemeType w;

    public /* synthetic */ a(tse tseVar, b bVar, ol70 ol70Var, ThemeType themeType) {
        this.a = tseVar;
        this.b = bVar;
        this.c = ol70Var;
        this.w = themeType;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return tje.h(this.a, null, null, new OrderCancelActionItemsRepository$listItemsFlow$3$1$2$1$1(this.b, (String) obj, this.c, this.w, null), 3);
    }
}
