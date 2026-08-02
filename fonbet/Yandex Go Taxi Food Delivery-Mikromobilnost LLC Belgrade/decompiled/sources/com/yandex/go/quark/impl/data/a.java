package com.yandex.go.quark.impl.data;

import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class a implements lz60 {
    public final b a;
    public final g b;
    public final tse c;

    public a(b bVar, g gVar, tse tseVar) {
        this.a = bVar;
        this.b = gVar;
        this.c = tseVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        if (this.b.f()) {
            return;
        }
        tje.N(this.c, null, null, new QuarkOAuthLCPListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "QuarkOAuthLCPListener";
    }
}
