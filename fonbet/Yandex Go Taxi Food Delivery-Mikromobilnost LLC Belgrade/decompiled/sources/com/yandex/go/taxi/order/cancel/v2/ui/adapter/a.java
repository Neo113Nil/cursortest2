package com.yandex.go.taxi.order.cancel.v2.ui.adapter;

import android.content.Context;
import defpackage.bys;
import defpackage.g0c;
import defpackage.he7;
import defpackage.jl40;
import defpackage.lj1;
import defpackage.ol70;
import defpackage.qoi0;
import defpackage.r3a;
import defpackage.rj70;
import defpackage.sj70;
import defpackage.tls;
import defpackage.uj70;
import defpackage.zxs;
import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a extends bys {
    public final sj70 A;
    public final tls z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, tls tlsVar) {
        super(r0, Collections.singletonList(new zxs(r2.a(), 0, r6, EmptyList.a, new he7(1, r11), null)));
        r3a r3aVar = new r3a(1, tlsVar);
        int i = uj70.V;
        g0c a = qoi0.a(ol70.class);
        lj1 lj1Var = new lj1(context, 25);
        OrderCancelActionViewHolder$Companion$itemType$2 orderCancelActionViewHolder$Companion$itemType$2 = OrderCancelActionViewHolder$Companion$itemType$2.b;
        this.z = tlsVar;
        this.A = new sj70();
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        this.A.getClass();
        return jl40.l((ol70) obj, (ol70) obj2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        this.A.getClass();
        return jl40.l(((ol70) obj).c, ((ol70) obj2).c);
    }

    @Override // defpackage.bys
    public final Object l(Object obj, Object obj2) {
        ol70 ol70Var = (ol70) obj;
        ol70 ol70Var2 = (ol70) obj2;
        this.A.getClass();
        if (ol70Var == ol70Var2) {
            return null;
        }
        UiStateDrawableWrapper uiStateDrawableWrapper = ol70Var2.a;
        return new rj70(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null, ol70Var2.b, ol70Var2.d);
    }
}
