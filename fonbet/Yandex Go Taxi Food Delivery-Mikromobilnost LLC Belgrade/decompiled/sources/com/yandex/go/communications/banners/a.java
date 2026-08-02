package com.yandex.go.communications.banners;

import defpackage.jy60;
import defpackage.tse;
import ru.yandex.taxi.banners.c;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final tse a;
    public final c b;

    public a(tse tseVar, c cVar) {
        this.a = tseVar;
        this.b = cVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "BannersControllerComponentProcessingListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        com.yandex.go.coroutines.b.g(this.a, null, null, new BannersControllerComponentProcessingListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
