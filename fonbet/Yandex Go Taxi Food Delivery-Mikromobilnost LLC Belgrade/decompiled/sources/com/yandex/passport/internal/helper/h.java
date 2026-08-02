package com.yandex.passport.internal.helper;

import android.net.Uri;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.common.j;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.storage.i;
import com.yandex.passport.internal.usecase.y;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class h {
    public static final long i = com.yandex.passport.common.time.a.c(24, 0, 0, 14);
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.network.client.c b;
    public final com.yandex.passport.internal.core.accounts.a c;
    public final i d;
    public final com.yandex.passport.common.a e;
    public final com.yandex.passport.internal.e f;
    public final f1 g;
    public final y h;

    public h(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.client.c cVar, com.yandex.passport.internal.core.accounts.a aVar, i iVar, com.yandex.passport.common.a aVar2, com.yandex.passport.internal.e eVar, f1 f1Var, y yVar) {
        this.a = dVar;
        this.b = cVar;
        this.c = aVar;
        this.d = iVar;
        this.e = aVar2;
        this.f = eVar;
        this.g = f1Var;
        this.h = yVar;
    }

    public final Uri a(Uid uid) {
        com.yandex.passport.internal.network.client.e b = this.b.b(uid.getEnvironment());
        com.yandex.passport.internal.e eVar = this.f;
        eVar.getClass();
        Object j = com.yandex.passport.common.util.a.j(new PersonProfileHelper$getAccountManagementUrl$1(this, b, uid, j.a(new Locale(eVar.a())), null));
        if (!(j instanceof Result.Failure)) {
            j = Uri.parse(((com.yandex.passport.common.url.b) j).a);
        }
        kotlin.b.b(j);
        return (Uri) j;
    }

    public final void b(Uid uid, PersonProfile personProfile) {
        ModernAccount e = this.a.a().e(uid);
        if (e == null) {
            throw new PassportAccountNotFoundException(uid);
        }
        com.yandex.passport.internal.network.client.a a = this.b.a(e.getUid().getEnvironment());
        a.p(a.c(e.getMasterToken()), e.getMasterToken(), personProfile);
        this.c.a(e.getAccount(), true);
    }
}
