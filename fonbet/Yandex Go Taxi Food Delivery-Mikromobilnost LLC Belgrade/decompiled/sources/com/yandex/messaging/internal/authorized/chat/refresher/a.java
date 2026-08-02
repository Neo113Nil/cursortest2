package com.yandex.messaging.internal.authorized.chat.refresher;

import defpackage.rol0;
import defpackage.s9;
import defpackage.vqc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class a extends s9 {
    public static final long d = vqc.a(0, 0, 50, 7);
    public final c a;
    public final ArrayList b = new ArrayList();
    public final long c = d;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.s9
    public final long a() {
        return this.c;
    }

    @Override // defpackage.s9
    public final boolean b() {
        return !this.b.isEmpty();
    }

    @Override // defpackage.s9
    public final rol0 c() {
        ArrayList arrayList = this.b;
        List J0 = kotlin.collections.a.J0(arrayList);
        arrayList.clear();
        return new rol0(new ReducedForwardLoadScheduler$load$2(J0, this, null));
    }
}
