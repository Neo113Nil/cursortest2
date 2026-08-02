package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.e0;
import com.yandex.passport.internal.util.p;
import defpackage.cvu0;
import defpackage.ny61;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class g extends com.yandex.passport.internal.ui.base.h {
    public final com.yandex.passport.internal.account.a A;
    public final com.yandex.passport.internal.core.accounts.d B;
    public final e0 C;
    public final Uri D;
    public final com.yandex.passport.internal.autologin.g E;
    public final com.yandex.passport.internal.storage.i F;
    public final com.yandex.passport.internal.flags.j G;
    public final com.yandex.passport.internal.report.g H;
    public final com.yandex.passport.internal.filter.i I;
    public final com.yandex.passport.internal.ui.util.l J = new com.yandex.passport.internal.ui.util.l();

    public g(com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.core.accounts.d dVar, e0 e0Var, Uri uri, com.yandex.passport.internal.autologin.g gVar, com.yandex.passport.internal.storage.i iVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.g gVar2, com.yandex.passport.internal.filter.i iVar2) {
        this.A = aVar;
        this.B = dVar;
        this.C = e0Var;
        this.D = uri;
        this.E = gVar;
        this.F = iVar;
        this.G = jVar;
        this.H = gVar2;
        this.I = iVar2;
    }

    public static final void a0(g gVar, Uri uri) {
        gVar.getClass();
        if (cvu0.s(String.valueOf(uri.getHost()), "pay.yandex.ru", false)) {
            return;
        }
        throw new UnknownHostException("Unknown host " + uri.getHost() + " in " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(g gVar, ModernAccount modernAccount, LoginProperties loginProperties, ContinuationImpl continuationImpl) {
        LinkHandlingViewModel$getAccountOrNull$1 linkHandlingViewModel$getAccountOrNull$1;
        int i;
        LoginProperties loginProperties2;
        ModernAccount modernAccount2;
        g gVar2 = gVar;
        gVar2.getClass();
        if (continuationImpl instanceof LinkHandlingViewModel$getAccountOrNull$1) {
            linkHandlingViewModel$getAccountOrNull$1 = (LinkHandlingViewModel$getAccountOrNull$1) continuationImpl;
            int i2 = linkHandlingViewModel$getAccountOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkHandlingViewModel$getAccountOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkHandlingViewModel$getAccountOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkHandlingViewModel$getAccountOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.filter.i iVar = gVar2.I;
                    ArrayList f = gVar2.B.a().f();
                    Filter filter = loginProperties.getFilter();
                    linkHandlingViewModel$getAccountOrNull$1.L$0 = gVar2;
                    linkHandlingViewModel$getAccountOrNull$1.L$1 = modernAccount;
                    loginProperties2 = loginProperties;
                    linkHandlingViewModel$getAccountOrNull$1.L$2 = loginProperties2;
                    linkHandlingViewModel$getAccountOrNull$1.label = 1;
                    obj = iVar.c(f, filter, linkHandlingViewModel$getAccountOrNull$1);
                    if (obj != coroutineSingletons) {
                        modernAccount2 = modernAccount;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    Object value = ((Result) obj).getValue();
                    return (ModernAccount) (value instanceof Result.Failure ? null : value);
                }
                LoginProperties loginProperties3 = (LoginProperties) linkHandlingViewModel$getAccountOrNull$1.L$2;
                modernAccount2 = (ModernAccount) linkHandlingViewModel$getAccountOrNull$1.L$1;
                g gVar3 = (g) linkHandlingViewModel$getAccountOrNull$1.L$0;
                kotlin.b.b(obj);
                loginProperties2 = loginProperties3;
                gVar2 = gVar3;
                List<ModernAccount> list = (List) obj;
                if (modernAccount2 == null) {
                    return modernAccount2;
                }
                for (ModernAccount modernAccount3 : list) {
                    com.yandex.passport.internal.storage.i iVar2 = gVar2.F;
                    Uid uid = modernAccount3.getUid();
                    iVar2.getClass();
                    new com.yandex.passport.internal.storage.b(iVar2, uid).c(false);
                }
                com.yandex.passport.internal.autologin.g gVar4 = gVar2.E;
                com.yandex.passport.internal.autologin.e eVar = new com.yandex.passport.internal.autologin.e(PassportAutoLoginMode.ONE_OR_MORE_ACCOUNT, list, p.u(loginProperties2.getFilter().getPrimaryEnvironment()), null, null, 52);
                linkHandlingViewModel$getAccountOrNull$1.L$0 = null;
                linkHandlingViewModel$getAccountOrNull$1.L$1 = null;
                linkHandlingViewModel$getAccountOrNull$1.L$2 = null;
                linkHandlingViewModel$getAccountOrNull$1.label = 2;
                obj = gVar4.a(eVar, linkHandlingViewModel$getAccountOrNull$1);
            }
        }
        linkHandlingViewModel$getAccountOrNull$1 = new LinkHandlingViewModel$getAccountOrNull$1(gVar2, continuationImpl);
        Object obj2 = linkHandlingViewModel$getAccountOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkHandlingViewModel$getAccountOrNull$1.label;
        if (i != 0) {
        }
        List<ModernAccount> list2 = (List) obj2;
        if (modernAccount2 == null) {
        }
    }

    @Override // com.yandex.passport.internal.ui.base.h, defpackage.yr31
    public final void V() {
        com.yandex.passport.internal.report.g gVar = this.H;
        gVar.d = null;
        gVar.e = null;
        super.V();
    }
}
