package com.yandex.passport.internal.network.client;

import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.internal.core.announcing.f;
import defpackage.kvj0;
import defpackage.sbx;
import defpackage.tje;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BackendClient$getUserInfo$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$getUserInfo$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseUserInfoResponse", "parseUserInfoResponse(Lokhttp3/Response;)Lcom/yandex/passport/common/core/UserInfo;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        UserInfoData m294copywiADLzA;
        kvj0 kvj0Var = (kvj0) obj;
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        if (kvj0Var.w == 304) {
            return null;
        }
        String c = com.yandex.passport.internal.network.a.c(kvj0Var);
        com.yandex.passport.internal.network.a.h(new JSONObject(c));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String a = kvj0Var.y.a("ETag");
        m294copywiADLzA = r4.m294copywiADLzA((r63 & 1) != 0 ? r4.body : c, (r63 & 2) != 0 ? r4.eTag : a == null ? null : a, (r63 & 4) != 0 ? r4.retrievalTime : com.yandex.passport.common.time.a.c(0, currentTimeMillis, 0, 11), (r63 & 8) != 0 ? r4.uidValue : 0L, (r63 & 16) != 0 ? r4.displayName : null, (r63 & 32) != 0 ? r4.publicName : null, (r63 & 64) != 0 ? r4.securePhoneNumber : null, (r63 & 128) != 0 ? r4.normalizedDisplayLogin : null, (r63 & 256) != 0 ? r4.primaryAliasType : 0, (r63 & 512) != 0 ? r4.nativeDefaultEmail : null, (r63 & 1024) != 0 ? r4.avatarUrl : null, (r63 & 2048) != 0 ? r4.isAvatarEmpty : false, (r63 & 4096) != 0 ? r4.socialProviderCode : null, (r63 & 8192) != 0 ? r4.hasPassword : false, (r63 & 16384) != 0 ? r4.yandexoidLogin : null, (r63 & 32768) != 0 ? r4.isBetaTester : false, (r63 & 65536) != 0 ? r4.hasPlus : false, (r63 & 131072) != 0 ? r4.hasMusicSubscription : false, (r63 & 262144) != 0 ? r4.firstName : null, (r63 & 524288) != 0 ? r4.lastName : null, (r63 & 1048576) != 0 ? r4.birthday : null, (r63 & 2097152) != 0 ? r4.xTokenIssuedAt : 0, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? r4.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? r4.publicId : null, (r63 & 16777216) != 0 ? r4.isChild : false, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? r4.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? r4.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? r4.isSms2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? r4.isRfc2faEnabled : false, (r63 & 536870912) != 0 ? r4.partitions : null, (r63 & 1073741824) != 0 ? r4.isPictureLoginForbidden : false, (r63 & Integer.MIN_VALUE) != 0 ? r4.isXtokenTrusted : false, (r64 & 1) != 0 ? r4.hasPlusCard : false, (r64 & 2) != 0 ? r4.hasProCard : false, (r64 & 4) != 0 ? r4.hasFamily : false, (r64 & 8) != 0 ? r4.isDriveUser : false, (r64 & 16) != 0 ? r4.isTaxiCompanyBound : false, (r64 & 32) != 0 ? r4.locationId : null, (r64 & 64) != 0 ? r4.filterParameters : null, (r64 & 128) != 0 ? r4.muidValue : null, (r64 & 256) != 0 ? r4.hasMasterToken : false, (r64 & 512) != 0 ? r4.isBrowserAccount : false, (r64 & 1024) != 0 ? ((UserInfoData) tje.a(sbx.d, new f(22)).b(UserInfoData.Companion.serializer(), c)).hasWebAuthNCredential : false);
        return com.yandex.passport.data.mapper.a.a(m294copywiADLzA);
    }
}
