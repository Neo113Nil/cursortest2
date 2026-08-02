package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.h8w;
import defpackage.id00;
import defpackage.tls;
import defpackage.wls;
import defpackage.x1c;
import defpackage.zls;
import defpackage.zpn;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements zls {
    public final /* synthetic */ h8w a;

    public /* synthetic */ a(h8w h8wVar) {
        this.a = h8wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f530 f530Var = (f530) obj;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(1509694630);
        Object Q = btsVar.Q();
        Object obj4 = did.a;
        if (Q == obj4) {
            Q = id00.a(1.0f);
            btsVar.o0(Q);
        }
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
        h8w h8wVar = this.a;
        boolean k = btsVar.k(h8wVar) | btsVar.e(aVar) | btsVar.b(0.5f) | btsVar.b(1.0f);
        Object Q2 = btsVar.Q();
        if (k || Q2 == obj4) {
            Object clickableKt$pressInteractionContentAlpha$1$1$1 = new ClickableKt$pressInteractionContentAlpha$1$1$1(h8wVar, aVar, 0.5f, 1.0f, null);
            btsVar.o0(clickableKt$pressInteractionContentAlpha$1$1$1);
            Q2 = clickableKt$pressInteractionContentAlpha$1$1$1;
        }
        zpn.e(btsVar, (wls) Q2, h8wVar);
        boolean e = btsVar.e(aVar);
        Object Q3 = btsVar.Q();
        if (e || Q3 == obj4) {
            Q3 = new x1c(aVar, 0);
            btsVar.o0(Q3);
        }
        f530 a = androidx.compose.ui.graphics.d.a(f530Var, (tls) Q3);
        btsVar.t(false);
        return a;
    }
}
