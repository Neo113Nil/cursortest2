package com.google.common.collect;

import defpackage.ffx;
import defpackage.oqb1;
import defpackage.zsy;
import java.util.Map;

/* loaded from: classes11.dex */
public final class y {
    public final /* synthetic */ oqb1 a;

    public y(oqb1 oqb1Var) {
        this.a = oqb1Var;
    }

    public final zsy a() {
        Map b = this.a.b();
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        ffx.m(b.isEmpty());
        multimaps$CustomListMultimap.w = b;
        multimaps$CustomListMultimap.y = multimapBuilder$ArrayListSupplier;
        return multimaps$CustomListMultimap;
    }
}
