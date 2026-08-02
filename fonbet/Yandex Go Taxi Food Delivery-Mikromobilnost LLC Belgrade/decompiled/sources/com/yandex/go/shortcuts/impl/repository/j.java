package com.yandex.go.shortcuts.impl.repository;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.op70;
import defpackage.sb2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class j {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Rect b = new Rect();
    public final r0 c;
    public final kotlinx.coroutines.channels.a d;
    public final gci0 e;

    public j(tt2 tt2Var) {
        r0 c = bvf0.c(Boolean.TRUE);
        this.c = c;
        this.d = sb2.a(Integer.MAX_VALUE, null, null, 6);
        this.e = kotlinx.coroutines.flow.e.d(c);
        ((Boolean) c.getValue()).getClass();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        tje.N(bvf0.a(mdh.b), null, null, new OrderVisibilityTracker$1(this, null), 3);
    }

    public final void a(RecyclerView recyclerView) {
        Rect rect = this.b;
        if (rect.bottom == 0) {
            recyclerView.getWindowVisibleDisplayFrame(rect);
        }
        Object d = this.d.d(new op70(9, this));
        if (d instanceof ni9) {
            jst.e.h(null, "Failed to update displayed orders", oi9.a(d));
        }
    }
}
