package com.ybsdk.screens.initial;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.a3z;
import defpackage.ds31;
import defpackage.tje;
import defpackage.v0h;
import defpackage.x0h;
import defpackage.y0h;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class c implements a3z {
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType a;
    public final /* synthetic */ d b;

    public c(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, d dVar) {
        this.a = deeplinkHandleResult$DeeplinkType;
        this.b = dVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        if (!(deeplink.getAction() instanceof DeeplinkAction.DeeplinkError)) {
            return x0h.a;
        }
        DeeplinkAction.DeeplinkError deeplinkError = (DeeplinkAction.DeeplinkError) deeplink.getAction();
        d dVar = this.b;
        tje.N(ds31.a(dVar), null, null, new InitialViewModel$3$1(dVar, deeplinkError, null), 3);
        return new v0h(EmptyList.a, this.a, 2);
    }
}
