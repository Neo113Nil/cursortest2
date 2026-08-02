package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class v2 extends Lambda implements gzs {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onSuccess();
        }
        this.a.c.clear();
        return s3q0.a;
    }
}
