package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class d extends Lambda implements gzs {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.k kVar;
        h0 h0Var;
        kVar = this.a.a;
        Context context = kVar.getContext();
        h0Var = this.a.b;
        return new p0(context, h0Var);
    }
}
