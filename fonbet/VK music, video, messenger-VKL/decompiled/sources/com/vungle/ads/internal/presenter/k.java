package com.vungle.ads.internal.presenter;

import com.vungle.ads.MraidTemplateError;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class k extends Lambda implements gzs {
    public final /* synthetic */ r a;
    public final /* synthetic */ MraidTemplateError b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, MraidTemplateError mraidTemplateError, boolean z, String str) {
        super(0);
        this.a = rVar;
        this.b = mraidTemplateError;
        this.c = z;
        this.d = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.a.a(this.b, this.c, this.d);
        return s3q0.a;
    }
}
