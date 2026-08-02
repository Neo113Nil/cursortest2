package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.ny61;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class r extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.z b;
    public final com.yandex.passport.internal.analytics.c0 c;
    public final DatabaseHelper d;

    public r(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.z zVar, com.yandex.passport.internal.analytics.c0 c0Var, DatabaseHelper databaseHelper) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = zVar;
        this.c = c0Var;
        this.d = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ModernAccount modernAccount, ContinuationImpl continuationImpl) {
        DeleteAccountUseCase$run$1 deleteAccountUseCase$run$1;
        int i;
        if (continuationImpl instanceof DeleteAccountUseCase$run$1) {
            deleteAccountUseCase$run$1 = (DeleteAccountUseCase$run$1) continuationImpl;
            int i2 = deleteAccountUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteAccountUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteAccountUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteAccountUseCase$run$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.analytics.c0 c0Var = this.c;
                    c0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", String.valueOf(modernAccount.getUid().getValue()));
                    c0Var.a.b("carousel.delete_account", hashMap);
                    if (!modernAccount.isChild()) {
                        this.d.deleteAllChildren(modernAccount.getAccountName());
                    }
                    com.yandex.passport.internal.core.accounts.y yVar = new com.yandex.passport.internal.core.accounts.y(new com.yandex.passport.internal.core.accounts.w(modernAccount), true, true, RevokePlace.DELETE_ACCOUNT_USE_CASE, false);
                    deleteAccountUseCase$run$1.label = 1;
                    this.b.a(yVar);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11Var;
            }
        }
        deleteAccountUseCase$run$1 = new DeleteAccountUseCase$run$1(this, continuationImpl);
        Object obj2 = deleteAccountUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteAccountUseCase$run$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        return zy11Var2;
    }
}
