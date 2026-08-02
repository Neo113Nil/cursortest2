package com.yandex.passport.internal.network.mappers;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Partition;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.LegacyExtraData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.stash.Stash;
import com.yandex.passport.internal.stash.StashCell;
import com.yandex.passport.internal.util.p;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public final class h {
    public final com.yandex.passport.data.mapper.a a;

    public h(com.yandex.passport.data.mapper.a aVar) {
        this.a = aVar;
    }

    public final AccountRow a(ModernAccount modernAccount) {
        List list;
        String name = modernAccount.getName();
        String rawValue = modernAccount.getMasterToken().getRawValue();
        Uid uid = modernAccount.getUid();
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        String sb2 = sb.toString();
        UserInfo userInfo = modernAccount.getUserInfo();
        com.yandex.passport.data.mapper.a aVar = this.a;
        aVar.getClass();
        List<Partition> partitions = userInfo.getPartitions();
        Partition.Companion.getClass();
        if (jl40.l(partitions, com.yandex.passport.common.core.b.a())) {
            list = EmptyList.a;
        } else {
            List<Partition> partitions2 = userInfo.getPartitions();
            ArrayList arrayList = new ArrayList(tcc.n(partitions2, 10));
            Iterator<T> it = partitions2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Partition) it.next()).m257unboximpl());
            }
            list = arrayList;
        }
        UserInfoData userInfoData = new UserInfoData(userInfo.getBody(), userInfo.getETag(), userInfo.m263getRetrievalTimeR7zlAxo(), userInfo.getUidValue(), userInfo.getDisplayName(), userInfo.getPublicName(), userInfo.getPhoneNumber(), userInfo.getNormalizedDisplayLogin(), userInfo.getPrimaryAliasType(), userInfo.getNativeDefaultEmail(), userInfo.getAvatarUrl(), userInfo.isAvatarEmpty(), userInfo.getSocialProviderCode(), userInfo.getHasPassword(), userInfo.getYandexoidLogin(), userInfo.isBetaTester(), userInfo.getHasPlus(), userInfo.getHasMusicSubscription(), userInfo.getFirstName(), userInfo.getLastName(), userInfo.getBirthday(), userInfo.getXTokenIssuedAt(), userInfo.getDisplayLogin(), userInfo.getPublicId(), userInfo.isChild(), userInfo.getMachineReadableLogin(), userInfo.is2faEnabled(), userInfo.isSms2faEnabled(), userInfo.isRfc2faEnabled(), list, userInfo.isPictureLoginForbidden(), userInfo.isXtokenTrusted(), userInfo.getHasPlusCard(), userInfo.getHasProCard(), userInfo.getHasFamily(), userInfo.isDriveUser(), userInfo.isTaxiCompanyBound(), userInfo.getLocationId(), userInfo.getFilterParameters(), userInfo.getMuidValue(), userInfo.getHasMasterToken(), false, false, 0, HProv.ALG_TYPE_BLOCK, null);
        String body = userInfoData.getBody();
        if (body == null) {
            try {
                body = aVar.a.c(userInfoData, UserInfoData.Companion.serializer());
            } catch (Exception e) {
                ny61.n("Json serialization has failed", e);
                return null;
            }
        }
        return new AccountRow(name, rawValue, sb2, body, com.yandex.passport.data.mapper.a.c(modernAccount.getUserInfo().m263getRetrievalTimeR7zlAxo(), modernAccount.getUserInfo().getETag()), modernAccount.getStash().toJson(), modernAccount.getLegacyAccountType(), p.y(modernAccount.getUid().getEnvironment()).toLegacyAffinity(), modernAccount.assembleLegacyExtraData().serialize());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ModernAccount b(AccountRow accountRow) {
        Uid uid;
        UserInfoData m294copywiADLzA;
        Uid uid2;
        Stash a;
        long parseLong;
        Environment environment;
        com.yandex.passport.data.mapper.a aVar = this.a;
        String str = accountRow.uidString;
        LegacyExtraData legacyExtraData = null;
        if (str == null || accountRow.userInfoBody == null) {
            LogLevel logLevel = LogLevel.DEBUG;
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(logLevel, null, "from: uidString or userInfoBody is null", 10);
            }
        } else {
            int D = evu0.D(str, ':', 0, false);
            if (D >= 1 && D != str.length() - 1) {
                String substring = str.substring(0, D);
                try {
                    parseLong = Long.parseLong(str.substring(D + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar2 = Environment.Companion;
                        int parseInt = Integer.parseInt(substring);
                        aVar2.getClass();
                        environment = com.yandex.passport.common.core.a.a(parseInt);
                    } catch (Exception unused2) {
                        environment = Environment.PRODUCTION;
                    }
                    uid = a0.b(environment, parseLong);
                    if (uid != null) {
                        LogLevel logLevel2 = LogLevel.DEBUG;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(logLevel2, null, "from: unknown uid", 10);
                            return null;
                        }
                    } else {
                        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
                        String str2 = accountRow.masterTokenValue;
                        bVar.getClass();
                        MasterToken a2 = com.yandex.passport.common.account.b.a(str2);
                        try {
                            String str3 = accountRow.userInfoMeta;
                            aVar.getClass();
                            Pair b = com.yandex.passport.data.mapper.a.b(str3);
                            String str4 = (String) b.getFirst();
                            long j = ((com.yandex.passport.common.time.a) b.getSecond()).a;
                            String str5 = accountRow.userInfoBody;
                            m294copywiADLzA = r12.m294copywiADLzA((r63 & 1) != 0 ? r12.body : str5, (r63 & 2) != 0 ? r12.eTag : str4, (r63 & 4) != 0 ? r12.retrievalTime : j, (r63 & 8) != 0 ? r12.uidValue : 0L, (r63 & 16) != 0 ? r12.displayName : null, (r63 & 32) != 0 ? r12.publicName : null, (r63 & 64) != 0 ? r12.securePhoneNumber : null, (r63 & 128) != 0 ? r12.normalizedDisplayLogin : null, (r63 & 256) != 0 ? r12.primaryAliasType : 0, (r63 & 512) != 0 ? r12.nativeDefaultEmail : null, (r63 & 1024) != 0 ? r12.avatarUrl : null, (r63 & 2048) != 0 ? r12.isAvatarEmpty : false, (r63 & 4096) != 0 ? r12.socialProviderCode : null, (r63 & 8192) != 0 ? r12.hasPassword : false, (r63 & 16384) != 0 ? r12.yandexoidLogin : null, (r63 & 32768) != 0 ? r12.isBetaTester : false, (r63 & 65536) != 0 ? r12.hasPlus : false, (r63 & 131072) != 0 ? r12.hasMusicSubscription : false, (r63 & 262144) != 0 ? r12.firstName : null, (r63 & 524288) != 0 ? r12.lastName : null, (r63 & 1048576) != 0 ? r12.birthday : null, (r63 & 2097152) != 0 ? r12.xTokenIssuedAt : 0, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r12.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r12.publicId : null, (r63 & 16777216) != 0 ? r12.isChild : false, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? r12.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? r12.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? r12.isSms2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? r12.isRfc2faEnabled : false, (r63 & 536870912) != 0 ? r12.partitions : null, (r63 & 1073741824) != 0 ? r12.isPictureLoginForbidden : false, (r63 & Integer.MIN_VALUE) != 0 ? r12.isXtokenTrusted : false, (r64 & 1) != 0 ? r12.hasPlusCard : false, (r64 & 2) != 0 ? r12.hasProCard : false, (r64 & 4) != 0 ? r12.hasFamily : false, (r64 & 8) != 0 ? r12.isDriveUser : false, (r64 & 16) != 0 ? r12.isTaxiCompanyBound : false, (r64 & 32) != 0 ? r12.locationId : null, (r64 & 64) != 0 ? r12.filterParameters : null, (r64 & 128) != 0 ? r12.muidValue : null, (r64 & 256) != 0 ? r12.hasMasterToken : false, (r64 & 512) != 0 ? r12.isBrowserAccount : false, (r64 & 1024) != 0 ? ((UserInfoData) aVar.a.b(UserInfoData.Companion.serializer(), str5)).hasWebAuthNCredential : false);
                            UserInfo a3 = com.yandex.passport.data.mapper.a.a(m294copywiADLzA);
                            Long muidValue = a3.getMuidValue();
                            if (muidValue != null) {
                                uid2 = a0.b(uid.getEnvironment(), muidValue.longValue());
                            } else {
                                uid2 = null;
                            }
                            String str6 = accountRow.stashBody;
                            if (str6 != null) {
                                if (str6.length() == 0) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    try {
                                        Stash.Companion.getClass();
                                        a = com.yandex.passport.internal.stash.a.b(str6);
                                    } catch (JSONException unused3) {
                                        a = null;
                                    }
                                }
                            }
                            Stash.Companion.getClass();
                            a = com.yandex.passport.internal.stash.a.a();
                            String str7 = accountRow.legacyExtraDataBody;
                            if (str7 != null) {
                                try {
                                    LegacyExtraData.Companion.getClass();
                                    legacyExtraData = com.yandex.passport.internal.f.e(str7);
                                } catch (JSONException unused4) {
                                }
                                if (legacyExtraData != null) {
                                    String str8 = legacyExtraData.diskPinCode;
                                    if (str8 != null) {
                                        a = a.with(StashCell.DISK_PIN_CODE, str8, false);
                                    }
                                    String str9 = legacyExtraData.mailPinCode;
                                    if (str9 != null) {
                                        a = a.with(StashCell.MAIL_PIN_CODE, str9, false);
                                    }
                                }
                            }
                            return new ModernAccount(accountRow.name, uid, uid2, a2, a3, a);
                        } catch (SerializationException e) {
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "from: invalid json", e);
                            }
                        }
                    }
                }
            }
            uid = null;
            if (uid != null) {
            }
        }
        return null;
    }
}
