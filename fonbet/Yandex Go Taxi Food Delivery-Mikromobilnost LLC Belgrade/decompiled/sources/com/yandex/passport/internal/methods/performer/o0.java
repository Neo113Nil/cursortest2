package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportTooManyTracksException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.data.exceptions.InvalidTrackException;
import com.yandex.passport.data.network.m9;
import com.yandex.passport.data.network.o9;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.TrackPayload;
import com.yandex.passport.internal.methods.r1;
import com.yandex.passport.internal.methods.x2;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class o0 implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final o9 b;
    public final com.yandex.passport.internal.methods.performer.error.a c;
    public final com.yandex.passport.internal.network.mappers.b w;

    public o0(com.yandex.passport.internal.core.accounts.d dVar, o9 o9Var, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = dVar;
        this.b = o9Var;
        this.c = aVar;
        this.w = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        Object failure;
        Uid B;
        Environment environment;
        String str;
        ModernAccount e;
        MasterToken masterToken;
        r1 r1Var = (r1) x2Var;
        try {
            B = com.yandex.passport.internal.util.p.B((PassportUidImpl) r1Var.b.c);
            environment = B.getEnvironment();
            str = (String) r1Var.c.c;
            e = this.a.a().e(B);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (e == null || (masterToken = e.getMasterToken()) == null) {
            throw new PassportAccountNotFoundException(B);
        }
        Object h = com.yandex.passport.common.util.a.h(new GetTrackPayloadPerformer$performMethod$1$response$1(this, environment, e.getLocationId(), str, masterToken, null));
        if (!(h instanceof Result.Failure)) {
            h = new TrackPayload(((m9) h).a());
        }
        Throwable a = Result.a(h);
        if (a != null) {
            try {
                if (!(a instanceof InvalidTrackException)) {
                    boolean z = a instanceof BackendErrorException;
                    com.yandex.passport.internal.methods.performer.error.a aVar = this.c;
                    if (!z) {
                        throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, null, null, null, null, 62);
                    }
                    int i = n0.a[((BackendErrorException) a).getBackendError().ordinal()];
                    if (i == 1) {
                        throw new PassportTooManyTracksException(com.yandex.passport.internal.util.p.A(B));
                    }
                    if (i != 2) {
                        throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, null, null, null, null, 62);
                    }
                }
                h = null;
            } catch (Throwable th2) {
                h = new Result.Failure(th2);
            }
        }
        failure = new Result(h);
        Throwable a2 = Result.a(failure);
        return a2 == null ? ((Result) failure).getValue() : new Result.Failure(a2);
    }
}
