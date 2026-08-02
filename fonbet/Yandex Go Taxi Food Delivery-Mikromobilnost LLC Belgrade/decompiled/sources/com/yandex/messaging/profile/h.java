package com.yandex.messaging.profile;

import android.content.Context;
import defpackage.eja1;
import defpackage.l220;
import defpackage.qa2;
import defpackage.rz10;
import defpackage.ydz;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class h {
    public final Context a;
    public final l220 b;

    public h(Context context, rz10 rz10Var) {
        this.a = context;
        this.b = rz10Var.h;
    }

    public static final void a(h hVar, SdkComponentManager$Component sdkComponentManager$Component, boolean z, Continuation continuation) {
        Context context = hVar.a;
        qa2 qa2Var = ydz.a;
        if (qa2Var.a()) {
            sdkComponentManager$Component.getClass();
            ydz.a();
        }
        kotlinx.coroutines.a.k(continuation.get_context());
        if (eja1.D(sdkComponentManager$Component.a(context), context, z) || !qa2Var.a()) {
            return;
        }
        ydz.b("SdkComponentManager", sdkComponentManager$Component.getAliasName() + " is not available");
    }
}
