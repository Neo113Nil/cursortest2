package com.vungle.ads.internal.presenter;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class e extends Lambda implements gzs {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.f fVar = this.a.a.e;
        if (fVar != null) {
            fVar.close();
        }
        return s3q0.a;
    }
}
