package com.yandex.go.safety.center.lost_item.lcp;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.lz60;
import defpackage.n3h;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class a implements lz60 {
    public final Lifecycle a;
    public final n3h b;
    public final tse c;
    public final h3y d;
    public final com.yandex.go.safety.center.lost_item.data.a e;

    public a(Lifecycle lifecycle, n3h n3hVar, tse tseVar, h3y h3yVar, com.yandex.go.safety.center.lost_item.data.a aVar) {
        this.a = lifecycle;
        this.b = n3hVar;
        this.c = tseVar;
        this.d = h3yVar;
        this.e = aVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.c, null, null, new LostItemsLcpListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LostItemsLcpListener";
    }
}
