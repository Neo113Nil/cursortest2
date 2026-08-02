package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class n extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.network.client.c c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final com.yandex.passport.internal.common.j e;
    public final com.yandex.passport.internal.usecase.y f;

    public n(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.client.c cVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.common.j jVar, com.yandex.passport.internal.usecase.y yVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = cVar;
        this.d = bVar;
        this.e = jVar;
        this.f = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(m mVar, ContinuationImpl continuationImpl) {
        ChangePasswordUseCase$run$1 changePasswordUseCase$run$1;
        int i;
        Environment environment;
        com.yandex.passport.internal.network.client.e eVar;
        Object failure;
        Object value;
        Object failure2;
        if (continuationImpl instanceof ChangePasswordUseCase$run$1) {
            changePasswordUseCase$run$1 = (ChangePasswordUseCase$run$1) continuationImpl;
            int i2 = changePasswordUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePasswordUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePasswordUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePasswordUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ModernAccount e = this.b.a().e(mVar.a);
                    if (e == null) {
                        failure = new Result.Failure(new Exception("Account with uid " + mVar.a + " not found"));
                        return new Result(failure);
                    }
                    environment = e.getUid().getEnvironment();
                    com.yandex.passport.internal.network.client.e b = this.c.b(environment);
                    Locale b2 = ((com.yandex.passport.internal.ui.lang.a) this.d).b();
                    Uid uid = e.getUid();
                    String builder = Uri.parse(b.a()).buildUpon().appendEncodedPath("profile/password").appendQueryParameter("retpath", b.d().toString()).toString();
                    this.e.getClass();
                    com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(uid, b2, builder, com.yandex.passport.internal.common.j.a(b2), (Map) null, (FrontendUrlType) null, 112);
                    changePasswordUseCase$run$1.L$0 = environment;
                    changePasswordUseCase$run$1.L$1 = b;
                    changePasswordUseCase$run$1.label = 1;
                    obj = this.f.a(wVar, changePasswordUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eVar = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (com.yandex.passport.internal.network.client.e) changePasswordUseCase$run$1.L$1;
                    environment = (Environment) changePasswordUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (value instanceof Result.Failure) {
                    try {
                        failure2 = new com.yandex.passport.internal.ui.f(((com.yandex.passport.common.url.b) value).a, eVar.d(), environment);
                    } catch (Throwable th) {
                        failure2 = new Result.Failure(th);
                    }
                    failure = failure2;
                } else {
                    failure = value;
                }
                return new Result(failure);
            }
        }
        changePasswordUseCase$run$1 = new ChangePasswordUseCase$run$1(this, continuationImpl);
        Object obj2 = changePasswordUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePasswordUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (value instanceof Result.Failure) {
        }
        return new Result(failure);
    }
}
