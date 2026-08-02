package com.yandex.go.flex.common;

import defpackage.bvf0;
import defpackage.cyg;
import defpackage.d8;
import defpackage.dyg;
import defpackage.fse;
import defpackage.ij3;
import defpackage.ike;
import defpackage.jp50;
import defpackage.jse;
import defpackage.kc7;
import defpackage.n8j0;
import defpackage.p7j0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.zse;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a implements jp50 {
    public final flex.network.cache.a a;
    public final ike b;

    public a(flex.network.cache.a aVar, tse tseVar) {
        this.a = aVar;
        ij3 ij3Var = new ij3(this);
        fse coroutineContext = tseVar.getCoroutineContext();
        sjh sjhVar = uyj.a;
        this.b = bvf0.a(coroutineContext.plus((jse) zse.a.c).plus(ij3Var));
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        tje.N(this.b, null, null, new GoAsyncCachingDecorator$delete$1(this, p7j0Var, null), 3);
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        this.a.invalidate();
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        return this.a.a.load(p7j0Var, tlsVar);
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(Integer.MAX_VALUE);
        dyg dygVar = (dyg) tlsVar.invoke(bufferedInputStream);
        if (!(dygVar instanceof cyg)) {
            bufferedInputStream.close();
            return dygVar;
        }
        tje.N(this.b, null, null, new GoAsyncCachingDecorator$save$1(bufferedInputStream, this, n8j0Var, z, new d8(27, (cyg) dygVar), null), 3);
        return dygVar;
    }
}
