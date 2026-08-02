package com.yandex.go.order.bundle.map.impl.ui;

import defpackage.am00;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.gc80;
import defpackage.h151;
import defpackage.hbp0;
import defpackage.j551;
import defpackage.jt00;
import defpackage.k601;
import defpackage.kv5;
import defpackage.tt2;
import defpackage.vez0;
import defpackage.wr00;
import defpackage.yaf0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class e {
    public final j551 a;
    public final h151 b;
    public final gc80 c;
    public final wr00 d;
    public final hbp0 e;
    public final r0 f;
    public final eci0 g;
    public volatile List h;
    public final am00 i;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, yaf0 yaf0Var, j551 j551Var, tt2 tt2Var, h151 h151Var, gc80 gc80Var, wr00 wr00Var, jt00 jt00Var) {
        this.a = j551Var;
        this.b = h151Var;
        this.c = gc80Var;
        this.d = wr00Var;
        this.e = new hbp0(new BundledOrderListViewModel$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        EmptyList emptyList = EmptyList.a;
        r0 c = bvf0.c(emptyList);
        this.f = c;
        this.g = kotlinx.coroutines.flow.e.c(c);
        this.h = emptyList;
        this.i = jt00Var.a(vez0.D(yaf0Var), new k601(str), new kv5(23, this));
    }
}
