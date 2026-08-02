package com.ybsdk.core.design.spoiler;

import defpackage.kah0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c implements vpr {
    public final /* synthetic */ SpoilerFrameLayout a;

    public c(SpoilerFrameLayout spoilerFrameLayout) {
        this.a = spoilerFrameLayout;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Spoiler spoiler;
        tls tlsVar;
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        SpoilerFrameLayout spoilerFrameLayout = this.a;
        spoiler = spoilerFrameLayout.spoiler;
        spoilerFrameLayout.setSpoiler(Spoiler.a(spoiler, booleanValue, null, null, null, 14));
        spoilerFrameLayout.setTag(kah0.ybsdk_spoiler_visibility, bool);
        tlsVar = spoilerFrameLayout.changeVisibilityCallback;
        if (tlsVar != null) {
            tlsVar.invoke(bool);
        }
        return zy11.a;
    }
}
