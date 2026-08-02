package com.yandex.passport.common.network;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.methods.performer.w0;
import com.yandex.passport.internal.methods.x2;
import defpackage.a28;
import defpackage.al7;
import defpackage.d5j0;
import defpackage.j18;
import defpackage.kvj0;
import defpackage.sbx;
import defpackage.tje;
import defpackage.tls;
import defpackage.wls;
import defpackage.yf7;
import java.io.IOException;
import kotlin.Result;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class u implements al7, com.yandex.passport.data.network.core.d, w0 {
    public final Object a;
    public final Object b;

    public u(String str) {
        this.a = str;
        this.b = tje.a(sbx.d, new t(0));
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public Object a(x2 x2Var) {
        try {
            return ((wls) this.b).invoke((com.yandex.passport.internal.provider.b) this.a, x2Var);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public d5j0 b(tls tlsVar) {
        r rVar = new r((String) c().a);
        tlsVar.invoke(rVar);
        return rVar.a();
    }

    public u c() {
        return new u(((com.yandex.passport.internal.network.l) ((com.yandex.passport.internal.network.e) this.b)).c((Environment) this.a, 0L));
    }

    @Override // com.yandex.passport.data.network.core.d
    public j e(kvj0 kvj0Var) {
        return (j) com.yandex.passport.data.network.core.m.a.b(new l((KSerializer) this.a, (KSerializer) this.b), com.yandex.passport.internal.util.p.b(kvj0Var));
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        IOException iOException2 = (IOException) this.b;
        j18 j18Var = (j18) this.a;
        if (j18Var.t() instanceof a28) {
            return;
        }
        if (iOException2 != null) {
            iOException2.initCause(iOException);
        }
        if (iOException2 != null) {
            iOException = iOException2;
        }
        j18Var.resumeWith(new Result.Failure(iOException));
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        ((j18) this.a).resumeWith(kvj0Var);
    }

    public /* synthetic */ u(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
