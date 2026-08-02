package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.NotModifiedException;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.stash.Stash;
import com.yandex.passport.internal.stash.StashCell;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/ModernAccount;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.core.accounts.ModernAccountRefresher$refreshModernAccount$3", f = "ModernAccountRefresher.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ModernAccountRefresher$refreshModernAccount$3 extends SuspendLambda implements wls {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ com.yandex.passport.internal.analytics.m $event;
    final /* synthetic */ String $language;
    final /* synthetic */ ModernAccount $modernAccount;
    final /* synthetic */ String $userInfoETag;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModernAccountRefresher$refreshModernAccount$3(u uVar, ModernAccount modernAccount, String str, com.yandex.passport.internal.analytics.m mVar, long j, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uVar;
        this.$modernAccount = modernAccount;
        this.$language = str;
        this.$event = mVar;
        this.$currentTime = j;
        this.$userInfoETag = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModernAccountRefresher$refreshModernAccount$3(this.this$0, this.$modernAccount, this.$language, this.$event, this.$currentTime, this.$userInfoETag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ModernAccountRefresher$refreshModernAccount$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        UserInfo m262copywiADLzA;
        ModernAccount modernAccount;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            ModernAccount modernAccount2 = this.$modernAccount;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "refreshModernAccount : refreshing " + modernAccount2, 8);
            }
            com.yandex.passport.internal.usecase.t tVar = this.this$0.c;
            com.yandex.passport.internal.usecase.s sVar = new com.yandex.passport.internal.usecase.s(this.$modernAccount.getMasterToken(), this.$modernAccount.getUid().getEnvironment(), this.$modernAccount.getLocationId(), this.$language, this.$modernAccount.getUserInfo().getETag());
            this.label = 1;
            a = tVar.a(sVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        Object value = ((Result) a).getValue();
        ModernAccount modernAccount3 = this.$modernAccount;
        u uVar = this.this$0;
        com.yandex.passport.internal.analytics.m mVar = this.$event;
        long j = this.$currentTime;
        String str = this.$userInfoETag;
        Throwable a2 = Result.a(value);
        if (a2 == null) {
            com.yandex.passport.internal.usecase.r rVar = (com.yandex.passport.internal.usecase.r) value;
            UserInfo userInfo = rVar.a;
            PassportAccountUpgradeStatus passportAccountUpgradeStatus = rVar.b;
            MasterToken masterToken = rVar.e;
            ModernAccount copy$default = ModernAccount.copy$default(modernAccount3, null, null, null, null, userInfo, null, 47, null);
            uVar.getClass();
            g gVar = uVar.b;
            Stash stash = copy$default.getStash();
            StashCell stashCell = StashCell.UPGRADE_STATUS;
            ModernAccount copy$default2 = ModernAccount.copy$default(copy$default, null, null, null, null, null, Stash.with$default(stash, stashCell, String.valueOf(passportAccountUpgradeStatus != null ? Integer.valueOf(passportAccountUpgradeStatus.ordinal()) : null), false, 4, null), 31, null);
            if (masterToken == null || (modernAccount = ModernAccount.copy$default(copy$default2, null, null, null, masterToken, null, null, 55, null)) == null) {
                modernAccount = copy$default2;
            }
            if (masterToken != null) {
                gVar.g(modernAccount, mVar, true);
            } else {
                gVar.k(modernAccount, mVar);
            }
            if (passportAccountUpgradeStatus != null) {
                g.i(gVar, modernAccount, new Pair[]{new Pair(stashCell, String.valueOf(passportAccountUpgradeStatus.ordinal()))});
            }
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "refreshModernAccountIfNecessary: refreshed " + modernAccount, 8);
            }
            uVar.d.updateChildren(modernAccount.getAccountName(), rVar.c);
            return modernAccount;
        }
        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getAllUserInfo onFailure:" + a2, 8);
        }
        if (!(a2 instanceof NotModifiedException)) {
            return modernAccount3;
        }
        com.yandex.passport.data.mapper.a aVar = uVar.f;
        String c = com.yandex.passport.data.mapper.a.c(j, str);
        g gVar2 = uVar.b;
        gVar2.e(AccountRow.copy$default(gVar2.l.a(modernAccount3), null, null, null, null, c, null, null, null, null, 495, null));
        j jVar = gVar2.a;
        Account account = modernAccount3.getAccount();
        jVar.e();
        jVar.a.setUserData(account, "user_info_meta", c);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateUserInfoMeta: account=" + account + " userInfoMeta=" + c, 8);
        }
        gVar2.b.a(true);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "refreshModernAccountIfNecessary: touched " + modernAccount3, 8);
        }
        m262copywiADLzA = r16.m262copywiADLzA((r63 & 1) != 0 ? r16.body : null, (r63 & 2) != 0 ? r16.eTag : str, (r63 & 4) != 0 ? r16.retrievalTime : j, (r63 & 8) != 0 ? r16.uidValue : 0L, (r63 & 16) != 0 ? r16.displayName : null, (r63 & 32) != 0 ? r16.publicName : null, (r63 & 64) != 0 ? r16.normalizedDisplayLogin : null, (r63 & 128) != 0 ? r16.primaryAliasType : 0, (r63 & 256) != 0 ? r16.nativeDefaultEmail : null, (r63 & 512) != 0 ? r16.avatarUrl : null, (r63 & 1024) != 0 ? r16.isAvatarEmpty : false, (r63 & 2048) != 0 ? r16.socialProviderCode : null, (r63 & 4096) != 0 ? r16.hasPassword : false, (r63 & 8192) != 0 ? r16.yandexoidLogin : null, (r63 & 16384) != 0 ? r16.isBetaTester : false, (r63 & 32768) != 0 ? r16.hasPlus : false, (r63 & 65536) != 0 ? r16.hasMusicSubscription : false, (r63 & 131072) != 0 ? r16.firstName : null, (r63 & 262144) != 0 ? r16.lastName : null, (r63 & 524288) != 0 ? r16.birthday : null, (r63 & 1048576) != 0 ? r16.xTokenIssuedAt : 0, (r63 & 2097152) != 0 ? r16.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r16.publicId : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r16.isChild : false, (r63 & 16777216) != 0 ? r16.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? r16.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? r16.isSms2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? r16.isRfc2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? r16.partitions : null, (r63 & 536870912) != 0 ? r16.isPictureLoginForbidden : false, (r63 & 1073741824) != 0 ? r16.isXtokenTrusted : false, (r63 & Integer.MIN_VALUE) != 0 ? r16.hasPlusCard : false, (r64 & 1) != 0 ? r16.hasProCard : false, (r64 & 2) != 0 ? r16.hasFamily : false, (r64 & 4) != 0 ? r16.isDriveUser : false, (r64 & 8) != 0 ? r16.isTaxiCompanyBound : false, (r64 & 16) != 0 ? r16.locationId : null, (r64 & 32) != 0 ? r16.phoneNumber : null, (r64 & 64) != 0 ? r16.filterParameters : null, (r64 & 128) != 0 ? r16.muidValue : null, (r64 & 256) != 0 ? r16.hasMasterToken : false, (r64 & 512) != 0 ? r16.isBrowserAccount : false, (r64 & 1024) != 0 ? modernAccount3.getUserInfo().hasWebAuthNCredential : false);
        return ModernAccount.copy$default(modernAccount3, null, null, null, null, m262copywiADLzA, null, 47, null);
    }
}
