package com.yandex.messaging.ui.profile.config;

import android.content.Context;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.auth.CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1;
import com.yandex.messaging.domain.user.UserNameType;
import com.yandex.messaging.profile.d;
import com.yx360.profile.api.model.PassportEnv;
import defpackage.def0;
import defpackage.h791;
import defpackage.hff;
import defpackage.i3y;
import defpackage.im;
import defpackage.in21;
import defpackage.ny61;
import defpackage.pm;
import defpackage.ql;
import defpackage.qp21;
import defpackage.r0d0;
import defpackage.rp21;
import defpackage.tje;
import defpackage.vse;
import defpackage.w2b1;
import defpackage.w511;
import defpackage.wl3;
import defpackage.wsr0;
import defpackage.x4b0;
import defpackage.xsr0;
import defpackage.zt11;
import java.util.Collections;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a {
    public static final im c;
    public static final pm d;
    public final Context a;
    public final i3y b = kotlin.a.a(new r0d0(23, this));

    static {
        im imVar = new im(0L, PassportEnv.PRODUCTION);
        c = imVar;
        d = new pm(imVar, EmptyList.a);
    }

    public a(vse vseVar, d dVar, Context context) {
        this.a = context;
        int i = zt11.a;
        e.R(e.X(dVar.b(), new ProfileDelegateImpl$special$$inlined$flatMapLatest$1(null, this)), vseVar.c(true), wsr0.a(xsr0.a, 3), d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, hff hffVar, x4b0 x4b0Var, rp21 rp21Var, ContinuationImpl continuationImpl) {
        ProfileDelegateImpl$createAccountsModel$1 profileDelegateImpl$createAccountsModel$1;
        int i;
        im imVar;
        aVar.getClass();
        if (continuationImpl instanceof ProfileDelegateImpl$createAccountsModel$1) {
            profileDelegateImpl$createAccountsModel$1 = (ProfileDelegateImpl$createAccountsModel$1) continuationImpl;
            int i2 = profileDelegateImpl$createAccountsModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileDelegateImpl$createAccountsModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileDelegateImpl$createAccountsModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileDelegateImpl$createAccountsModel$1.label;
                if (i != 0) {
                    b.b(obj);
                    profileDelegateImpl$createAccountsModel$1.L$0 = aVar;
                    profileDelegateImpl$createAccountsModel$1.L$1 = x4b0Var;
                    profileDelegateImpl$createAccountsModel$1.L$2 = rp21Var;
                    profileDelegateImpl$createAccountsModel$1.label = 1;
                    obj = aVar.b(hffVar, profileDelegateImpl$createAccountsModel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rp21Var = (rp21) profileDelegateImpl$createAccountsModel$1.L$2;
                    x4b0Var = (x4b0) profileDelegateImpl$createAccountsModel$1.L$1;
                    aVar = (a) profileDelegateImpl$createAccountsModel$1.L$0;
                    b.b(obj);
                }
                imVar = (im) obj;
                if (imVar != null) {
                    return (pm) aVar.b.getValue();
                }
                aVar.getClass();
                String str = x4b0Var.a;
                String str2 = x4b0Var.d;
                long c2 = rp21Var.b.c();
                in21 a = rp21Var.a.a().a(str);
                return new pm(imVar, Collections.singletonList(new ql(imVar, h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c2), aVar.a.getResources(), str2), x4b0Var.e, x4b0Var.c, w2b1.a(str2), 640)));
            }
        }
        profileDelegateImpl$createAccountsModel$1 = new ProfileDelegateImpl$createAccountsModel$1(aVar, continuationImpl);
        Object obj2 = profileDelegateImpl$createAccountsModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileDelegateImpl$createAccountsModel$1.label;
        if (i != 0) {
        }
        imVar = (im) obj2;
        if (imVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hff hffVar, ContinuationImpl continuationImpl) {
        ProfileDelegateImpl$getAccountUid$1 profileDelegateImpl$getAccountUid$1;
        int i;
        wl3 wl3Var;
        PassportEnv passportEnv;
        if (continuationImpl instanceof ProfileDelegateImpl$getAccountUid$1) {
            profileDelegateImpl$getAccountUid$1 = (ProfileDelegateImpl$getAccountUid$1) continuationImpl;
            int i2 = profileDelegateImpl$getAccountUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileDelegateImpl$getAccountUid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileDelegateImpl$getAccountUid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileDelegateImpl$getAccountUid$1.label;
                if (i != 0) {
                    b.b(obj);
                    profileDelegateImpl$getAccountUid$1.L$0 = this;
                    profileDelegateImpl$getAccountUid$1.label = 1;
                    hffVar.getClass();
                    obj = tje.k0(profileDelegateImpl$getAccountUid$1.get_context(), new CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1(null, hffVar), profileDelegateImpl$getAccountUid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) profileDelegateImpl$getAccountUid$1.L$0;
                    b.b(obj);
                }
                wl3Var = (wl3) obj;
                if (wl3Var != null) {
                    return null;
                }
                long j = wl3Var.b;
                AuthEnvironment authEnvironment = wl3Var.a;
                this.getClass();
                int i3 = def0.a[authEnvironment.ordinal()];
                if (i3 == 1) {
                    passportEnv = PassportEnv.PRODUCTION;
                } else if (i3 == 2) {
                    passportEnv = PassportEnv.TEAM_PRODUCTION;
                } else if (i3 == 3) {
                    passportEnv = PassportEnv.TESTING;
                } else if (i3 == 4) {
                    passportEnv = PassportEnv.TEAM_TESTING;
                } else {
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    passportEnv = PassportEnv.RC;
                }
                return new im(j, passportEnv);
            }
        }
        profileDelegateImpl$getAccountUid$1 = new ProfileDelegateImpl$getAccountUid$1(this, continuationImpl);
        Object obj2 = profileDelegateImpl$getAccountUid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileDelegateImpl$getAccountUid$1.label;
        if (i != 0) {
        }
        wl3Var = (wl3) obj2;
        if (wl3Var != null) {
        }
    }
}
