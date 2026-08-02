package com.yandex.go.image.internal.coil.intercept;

import coil3.intercept.c;
import defpackage.i3y;
import defpackage.iev;
import defpackage.o8w;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a implements o8w {
    public final i3y a;

    public a(i3y i3yVar) {
        this.a = i3yVar;
    }

    @Override // defpackage.o8w
    public final Object a(c cVar, Continuation continuation) {
        iev ievVar = new iev();
        return tje.k0(ievVar, new ImageMetaInterceptor$intercept$2(cVar, ievVar, this, null), continuation);
    }
}
