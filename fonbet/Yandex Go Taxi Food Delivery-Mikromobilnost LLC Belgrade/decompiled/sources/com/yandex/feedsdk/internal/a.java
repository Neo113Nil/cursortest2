package com.yandex.feedsdk.internal;

import defpackage.aqq;
import defpackage.bks0;
import defpackage.gfe;
import defpackage.l1o;
import defpackage.mfe;

/* loaded from: classes.dex */
public final class a implements mfe {
    public final aqq a;

    public a(aqq aqqVar) {
        this.a = aqqVar;
    }

    @Override // defpackage.mfe
    public final gfe a(l1o l1oVar) {
        return new bks0(l1oVar.e, new SkeletonContentControllerFactory$getContentController$1(1, this.a, aqq.class, "convert", "convert(Ljava/lang/String;)Ljava/lang/String;", 0));
    }
}
