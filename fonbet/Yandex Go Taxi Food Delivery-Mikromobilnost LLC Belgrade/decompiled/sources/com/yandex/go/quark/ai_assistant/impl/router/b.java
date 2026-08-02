package com.yandex.go.quark.ai_assistant.impl.router;

import android.content.Context;
import defpackage.fhg0;
import defpackage.h55;
import defpackage.npe0;
import defpackage.tje;
import defpackage.vgg0;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class b extends h55 {
    public final Context D;
    public final vgg0 E;
    public final npe0 F;

    public b(Context context, vgg0 vgg0Var, npe0 npe0Var) {
        super(null);
        this.D = context;
        this.E = vgg0Var;
        this.F = npe0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new AiAssistantDynamicFeatureRouter$onLaunch$1(this, (fhg0) obj, null), 1);
    }
}
