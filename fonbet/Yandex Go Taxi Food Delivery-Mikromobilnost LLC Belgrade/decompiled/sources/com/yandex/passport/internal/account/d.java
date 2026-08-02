package com.yandex.passport.internal.account;

import defpackage.xfx;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements Iterable, xfx {
    public final List a;

    public d(List list) {
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
