package com.yandex.passport.data.models;

import defpackage.sbx;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class t {
    public static UserInfoData a(long j, String str, String str2) {
        sbx sbxVar;
        UserInfoData m294copywiADLzA;
        sbxVar = UserInfoData.f100json;
        sbxVar.getClass();
        m294copywiADLzA = r2.m294copywiADLzA((r63 & 1) != 0 ? r2.body : str, (r63 & 2) != 0 ? r2.eTag : str2, (r63 & 4) != 0 ? r2.retrievalTime : j, (r63 & 8) != 0 ? r2.uidValue : 0L, (r63 & 16) != 0 ? r2.displayName : null, (r63 & 32) != 0 ? r2.publicName : null, (r63 & 64) != 0 ? r2.securePhoneNumber : null, (r63 & 128) != 0 ? r2.normalizedDisplayLogin : null, (r63 & 256) != 0 ? r2.primaryAliasType : 0, (r63 & 512) != 0 ? r2.nativeDefaultEmail : null, (r63 & 1024) != 0 ? r2.avatarUrl : null, (r63 & 2048) != 0 ? r2.isAvatarEmpty : false, (r63 & 4096) != 0 ? r2.socialProviderCode : null, (r63 & 8192) != 0 ? r2.hasPassword : false, (r63 & 16384) != 0 ? r2.yandexoidLogin : null, (r63 & 32768) != 0 ? r2.isBetaTester : false, (r63 & 65536) != 0 ? r2.hasPlus : false, (r63 & 131072) != 0 ? r2.hasMusicSubscription : false, (r63 & 262144) != 0 ? r2.firstName : null, (r63 & 524288) != 0 ? r2.lastName : null, (r63 & 1048576) != 0 ? r2.birthday : null, (r63 & 2097152) != 0 ? r2.xTokenIssuedAt : 0, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r2.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r2.publicId : null, (r63 & 16777216) != 0 ? r2.isChild : false, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? r2.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? r2.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? r2.isSms2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? r2.isRfc2faEnabled : false, (r63 & 536870912) != 0 ? r2.partitions : null, (r63 & 1073741824) != 0 ? r2.isPictureLoginForbidden : false, (r63 & Integer.MIN_VALUE) != 0 ? r2.isXtokenTrusted : false, (r64 & 1) != 0 ? r2.hasPlusCard : false, (r64 & 2) != 0 ? r2.hasProCard : false, (r64 & 4) != 0 ? r2.hasFamily : false, (r64 & 8) != 0 ? r2.isDriveUser : false, (r64 & 16) != 0 ? r2.isTaxiCompanyBound : false, (r64 & 32) != 0 ? r2.locationId : null, (r64 & 64) != 0 ? r2.filterParameters : null, (r64 & 128) != 0 ? r2.muidValue : null, (r64 & 256) != 0 ? r2.hasMasterToken : false, (r64 & 512) != 0 ? r2.isBrowserAccount : false, (r64 & 1024) != 0 ? ((UserInfoData) sbxVar.b(UserInfoData.Companion.serializer(), str)).hasWebAuthNCredential : false);
        return m294copywiADLzA;
    }

    public final KSerializer serializer() {
        return s.a;
    }
}
