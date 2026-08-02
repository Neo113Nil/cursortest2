package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.network.y4;
import com.yandex.passport.data.network.z4;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.reporters.DropPlace;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class a0 implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.core.accounts.g b;
    public final z4 c;
    public final com.yandex.passport.internal.properties.p w;
    public final com.yandex.passport.internal.network.mappers.b x;
    public final com.yandex.passport.internal.methods.performer.error.a y;

    public a0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.g gVar, z4 z4Var, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.methods.performer.error.a aVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = z4Var;
        this.w = pVar;
        this.x = bVar;
        this.y = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        com.yandex.passport.internal.methods.c1 c1Var = (com.yandex.passport.internal.methods.c1) x2Var;
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) c1Var.b.c);
        Environment environment = B.getEnvironment();
        CredentialProvider credentialProvider = (CredentialProvider) c1Var.c.c;
        ModernAccount e = this.a.a().e(B);
        if (e == null) {
            return new Result.Failure(new PassportAccountNotFoundException(B));
        }
        Object h = com.yandex.passport.common.util.a.h(new GetCodeByUidPerformer$performMethod$1(credentialProvider, this, environment, e, null));
        DropPlace dropPlace = DropPlace.GET_CODE_BY_UID_PERFORMER;
        com.yandex.passport.internal.core.accounts.g gVar = this.b;
        gVar.getClass();
        Throwable a = Result.a(h);
        if (a != null && (a instanceof InvalidTokenException)) {
            gVar.d(e, dropPlace);
        }
        if (!(h instanceof Result.Failure)) {
            y4 y4Var = (y4) h;
            h = new Code(com.yandex.passport.internal.util.p.y(environment), y4Var.b, y4Var.c);
        }
        Throwable a2 = Result.a(h);
        if (a2 == null) {
            return h;
        }
        try {
            throw com.yandex.passport.internal.methods.performer.error.a.a(this.y, a2, null, null, null, null, null, 62);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
