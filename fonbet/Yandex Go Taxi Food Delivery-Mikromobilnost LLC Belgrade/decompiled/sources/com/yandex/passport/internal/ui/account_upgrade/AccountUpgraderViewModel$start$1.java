package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderViewModel$start$1", f = "AccountUpgraderViewModel.kt", l = {28, 31, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AccountUpgraderViewModel$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ UpgraderExtras $upgraderExtras;
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpgraderViewModel$start$1(g gVar, UpgraderExtras upgraderExtras, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$upgraderExtras = upgraderExtras;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountUpgraderViewModel$start$1(this.this$0, this.$upgraderExtras, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountUpgraderViewModel$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        if (r3.emit(r5, r20) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r6.emit(r9, r20) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003e, code lost:
    
        if (r2 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object value;
        Uid uid;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.upgrader.c cVar = this.this$0.b;
            com.yandex.passport.internal.upgrader.b bVar = new com.yandex.passport.internal.upgrader.b(this.$upgraderExtras);
            this.label = 1;
            a = cVar.a(bVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                value = this.L$0;
                kotlin.b.b(obj);
                g gVar = this.this$0;
                a2 = Result.a(value);
                if (a2 != null) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to create webcard intent", a2);
                    }
                    n0 n0Var = gVar.c;
                    d dVar = new d(a2);
                    this.L$0 = value;
                    this.label = 3;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        value = ((Result) a).getValue();
        g gVar2 = this.this$0;
        UpgraderExtras upgraderExtras = this.$upgraderExtras;
        if (!(value instanceof Result.Failure)) {
            com.yandex.passport.internal.upgrader.a aVar = (com.yandex.passport.internal.upgrader.a) value;
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "result url " + new URL(aVar.a), 8);
            }
            n0 n0Var2 = gVar2.c;
            String str = aVar.a;
            ModernAccount modernAccount = aVar.b;
            if (modernAccount == null || (uid = modernAccount.getUid()) == null) {
                ny61.r("no uid in the result");
                return null;
            }
            e eVar = new e(new SlothParams(new com.yandex.passport.sloth.data.j(str, uid, u.W(upgraderExtras.getTheme()), false), modernAccount.getUid().getEnvironment(), null, new CommonWebProperties(true, null, false, false, 14, null), 4, null));
            this.L$0 = value;
            this.label = 2;
        }
        g gVar3 = this.this$0;
        a2 = Result.a(value);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
