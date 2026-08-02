package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.r3;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.de;
import xsna.fpf0;
import xsna.gzs;
import xsna.j8y;
import xsna.s1v;
import xsna.wcy;

/* loaded from: classes7.dex */
public final class d extends Lambda implements gzs {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        j8y j8yVar;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("unclosedad: ");
        j8yVar = this.a.b;
        List c = this.a.b().c();
        de deVar = j8yVar.b;
        int i = wcy.c;
        a.append(j8yVar.b(s1v.p(deVar, fpf0.f(wcy.a.a(fpf0.d(r3.class)))), c));
        return a.toString();
    }
}
