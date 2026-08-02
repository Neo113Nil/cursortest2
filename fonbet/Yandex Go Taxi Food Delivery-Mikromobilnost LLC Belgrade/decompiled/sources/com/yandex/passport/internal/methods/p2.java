package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class p2 extends x2 {
    public final n3 b;
    public final h3 c;
    public final h3 d;
    public final List e;
    public final d3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(Bundle bundle) {
        super(MethodRef.StashValueBatch);
        d dVar = d.w;
        List c = dVar.c(bundle);
        String string = bundle.getString("stash-cell");
        if (string == null) {
            xfo.g("can't get required string stash-cell");
            throw null;
        }
        String c2 = n.D.c(bundle);
        n3 n3Var = new n3(dVar, c);
        h3 h3Var = new h3(string, 2);
        h3 h3Var2 = new h3(c2, 3);
        this.b = n3Var;
        this.c = h3Var;
        this.d = h3Var2;
        this.e = scc.g(n3Var, h3Var, h3Var2);
        this.f = d3.w;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.f;
    }
}
