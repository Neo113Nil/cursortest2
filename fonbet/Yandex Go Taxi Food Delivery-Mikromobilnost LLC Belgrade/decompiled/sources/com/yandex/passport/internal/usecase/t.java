package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.data.network.ba;
import com.yandex.passport.data.network.da;
import com.yandex.passport.data.network.v9;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class t extends com.yandex.passport.common.domain.a {
    public final da b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.flags.j d;
    public final com.yandex.passport.internal.rotation.c e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.data.mapper.a g;

    public t(com.yandex.passport.common.coroutine.a aVar, da daVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.rotation.c cVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.mapper.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = daVar;
        this.c = dVar;
        this.d = jVar;
        this.e = cVar;
        this.f = bVar;
        this.g = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x008e, code lost:
    
        if (r1 == r3) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, com.yandex.passport.internal.rotation.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(t tVar, s sVar, ContinuationImpl continuationImpl) {
        GetAllUserInfoUseCase$run$1 getAllUserInfoUseCase$run$1;
        int i;
        s sVar2;
        Object value;
        ba baVar;
        Uid uid;
        UserInfo userInfo;
        Ref$ObjectRef ref$ObjectRef;
        String d;
        ba baVar2;
        UserInfo userInfo2;
        t tVar2;
        Ref$ObjectRef ref$ObjectRef2;
        com.yandex.passport.internal.j a;
        com.yandex.passport.data.network.x0 a2;
        PassportAccountUpgradeStatus passportAccountUpgradeStatus;
        Object value2;
        t tVar3 = tVar;
        if (continuationImpl instanceof GetAllUserInfoUseCase$run$1) {
            getAllUserInfoUseCase$run$1 = (GetAllUserInfoUseCase$run$1) continuationImpl;
            int i2 = getAllUserInfoUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getAllUserInfoUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getAllUserInfoUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAllUserInfoUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    da daVar = tVar3.b;
                    MasterToken e = sVar.e();
                    com.yandex.passport.internal.network.mappers.b bVar = tVar3.f;
                    Environment b = sVar.b();
                    bVar.getClass();
                    v9 v9Var = new v9(sVar.d(), e, com.yandex.passport.internal.network.mappers.b.a(b), sVar.c(), sVar.a());
                    getAllUserInfoUseCase$run$1.L$0 = tVar3;
                    sVar2 = sVar;
                    getAllUserInfoUseCase$run$1.L$1 = sVar2;
                    getAllUserInfoUseCase$run$1.label = 1;
                    obj = daVar.a(v9Var, getAllUserInfoUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef2 = (Ref$ObjectRef) getAllUserInfoUseCase$run$1.L$4;
                        uid = (Uid) getAllUserInfoUseCase$run$1.L$3;
                        userInfo2 = (UserInfo) getAllUserInfoUseCase$run$1.L$2;
                        baVar2 = (ba) getAllUserInfoUseCase$run$1.L$1;
                        tVar2 = (t) getAllUserInfoUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        value2 = ((Result) obj).getValue();
                        if (!(value2 instanceof Result.Failure)) {
                            ref$ObjectRef2.element = (com.yandex.passport.internal.rotation.b) value2;
                        }
                        t tVar4 = tVar2;
                        ref$ObjectRef = ref$ObjectRef2;
                        tVar3 = tVar4;
                        userInfo = userInfo2;
                        baVar = baVar2;
                        com.yandex.passport.internal.rotation.b bVar2 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                        a = bVar2 != null ? bVar2.a() : null;
                        tVar3.getClass();
                        if (a != null) {
                            try {
                                userInfo = userInfo.m262copywiADLzA((r63 & 1) != 0 ? userInfo.body : new JSONObject(userInfo.getBody()).put("x_token_client_id", a.getDecryptedId()).toString(), (r63 & 2) != 0 ? userInfo.eTag : null, (r63 & 4) != 0 ? userInfo.retrievalTime : 0L, (r63 & 8) != 0 ? userInfo.uidValue : 0L, (r63 & 16) != 0 ? userInfo.displayName : null, (r63 & 32) != 0 ? userInfo.publicName : null, (r63 & 64) != 0 ? userInfo.normalizedDisplayLogin : null, (r63 & 128) != 0 ? userInfo.primaryAliasType : 0, (r63 & 256) != 0 ? userInfo.nativeDefaultEmail : null, (r63 & 512) != 0 ? userInfo.avatarUrl : null, (r63 & 1024) != 0 ? userInfo.isAvatarEmpty : false, (r63 & 2048) != 0 ? userInfo.socialProviderCode : null, (r63 & 4096) != 0 ? userInfo.hasPassword : false, (r63 & 8192) != 0 ? userInfo.yandexoidLogin : null, (r63 & 16384) != 0 ? userInfo.isBetaTester : false, (r63 & 32768) != 0 ? userInfo.hasPlus : false, (r63 & 65536) != 0 ? userInfo.hasMusicSubscription : false, (r63 & 131072) != 0 ? userInfo.firstName : null, (r63 & 262144) != 0 ? userInfo.lastName : null, (r63 & 524288) != 0 ? userInfo.birthday : null, (r63 & 1048576) != 0 ? userInfo.xTokenIssuedAt : 0, (r63 & 2097152) != 0 ? userInfo.displayLogin : null, (r63 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? userInfo.publicId : null, (r63 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? userInfo.isChild : false, (r63 & 16777216) != 0 ? userInfo.machineReadableLogin : null, (r63 & SelfTester_JCP.DECRYPT_CFB) != 0 ? userInfo.is2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CBC) != 0 ? userInfo.isSms2faEnabled : false, (r63 & SelfTester_JCP.DECRYPT_CNT) != 0 ? userInfo.isRfc2faEnabled : false, (r63 & SelfTester_JCP.IMITA) != 0 ? userInfo.partitions : null, (r63 & 536870912) != 0 ? userInfo.isPictureLoginForbidden : false, (r63 & 1073741824) != 0 ? userInfo.isXtokenTrusted : false, (r63 & Integer.MIN_VALUE) != 0 ? userInfo.hasPlusCard : false, (r64 & 1) != 0 ? userInfo.hasProCard : false, (r64 & 2) != 0 ? userInfo.hasFamily : false, (r64 & 4) != 0 ? userInfo.isDriveUser : false, (r64 & 8) != 0 ? userInfo.isTaxiCompanyBound : false, (r64 & 16) != 0 ? userInfo.locationId : null, (r64 & 32) != 0 ? userInfo.phoneNumber : null, (r64 & 64) != 0 ? userInfo.filterParameters : null, (r64 & 128) != 0 ? userInfo.muidValue : null, (r64 & 256) != 0 ? userInfo.hasMasterToken : false, (r64 & 512) != 0 ? userInfo.isBrowserAccount : false, (r64 & 1024) != 0 ? userInfo.hasWebAuthNCredential : false);
                            } catch (Exception unused) {
                            }
                        }
                        a2 = baVar.a();
                        if (a2 != null) {
                            ModernAccount e2 = tVar3.c.a().e(uid);
                            com.yandex.passport.common.time.a aVar = e2 != null ? new com.yandex.passport.common.time.a(e2.m298getUpgradePostponedAtR7zlAxo()) : null;
                            if (a2.e) {
                                passportAccountUpgradeStatus = PassportAccountUpgradeStatus.REQUIRED;
                            } else if (a2.d) {
                                passportAccountUpgradeStatus = PassportAccountUpgradeStatus.NEEDED;
                            } else if (a2.b) {
                                passportAccountUpgradeStatus = PassportAccountUpgradeStatus.NOT_NEEDED;
                            } else if (a2.c) {
                                passportAccountUpgradeStatus = !(aVar == null ? false : com.yandex.passport.common.time.a.e(aVar.a, 0L)) ? PassportAccountUpgradeStatus.SKIPPED : PassportAccountUpgradeStatus.NOT_NEEDED;
                            } else {
                                passportAccountUpgradeStatus = PassportAccountUpgradeStatus.NOT_NEEDED;
                            }
                        } else {
                            passportAccountUpgradeStatus = null;
                        }
                        List b2 = baVar.b();
                        com.yandex.passport.internal.rotation.b bVar3 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                        value = new r(userInfo, passportAccountUpgradeStatus, b2, bVar3 != null ? bVar3.b() : null);
                        return new Result(value);
                    }
                    s sVar3 = (s) getAllUserInfoUseCase$run$1.L$1;
                    t tVar5 = (t) getAllUserInfoUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    sVar2 = sVar3;
                    tVar3 = tVar5;
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    baVar = (ba) value;
                    com.yandex.passport.data.mapper.a aVar2 = tVar3.g;
                    UserInfoData c = baVar.c();
                    aVar2.getClass();
                    UserInfo a3 = com.yandex.passport.data.mapper.a.a(c);
                    Uid b3 = com.yandex.passport.internal.a0.b(sVar2.b(), a3.getUidValue());
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    boolean e3 = baVar.e();
                    Environment b4 = sVar2.b();
                    if (((Boolean) tVar3.d.b(com.yandex.passport.internal.flags.q.I)).booleanValue() && e3 && !com.yandex.passport.internal.ui.c.t(b4) && (d = baVar.d()) != null) {
                        com.yandex.passport.internal.rotation.c cVar = tVar3.e;
                        com.yandex.passport.internal.rotation.a aVar3 = new com.yandex.passport.internal.rotation.a(tVar3.c.a().e(b3), sVar2.e(), sVar2.b(), sVar2.d(), d, b3);
                        getAllUserInfoUseCase$run$1.L$0 = tVar3;
                        getAllUserInfoUseCase$run$1.L$1 = baVar;
                        getAllUserInfoUseCase$run$1.L$2 = a3;
                        getAllUserInfoUseCase$run$1.L$3 = b3;
                        getAllUserInfoUseCase$run$1.L$4 = ref$ObjectRef3;
                        getAllUserInfoUseCase$run$1.label = 2;
                        Object a4 = cVar.a(aVar3, getAllUserInfoUseCase$run$1);
                        if (a4 != coroutineSingletons) {
                            baVar2 = baVar;
                            obj = a4;
                            uid = b3;
                            userInfo2 = a3;
                            tVar2 = tVar3;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            value2 = ((Result) obj).getValue();
                            if (!(value2 instanceof Result.Failure)) {
                            }
                            t tVar42 = tVar2;
                            ref$ObjectRef = ref$ObjectRef2;
                            tVar3 = tVar42;
                            userInfo = userInfo2;
                            baVar = baVar2;
                            com.yandex.passport.internal.rotation.b bVar22 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                            if (bVar22 != null) {
                            }
                            tVar3.getClass();
                            if (a != null) {
                            }
                            a2 = baVar.a();
                            if (a2 != null) {
                            }
                            List b22 = baVar.b();
                            com.yandex.passport.internal.rotation.b bVar32 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                            value = new r(userInfo, passportAccountUpgradeStatus, b22, bVar32 != null ? bVar32.b() : null);
                        }
                        return coroutineSingletons;
                    }
                    uid = b3;
                    userInfo = a3;
                    ref$ObjectRef = ref$ObjectRef3;
                    com.yandex.passport.internal.rotation.b bVar222 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                    if (bVar222 != null) {
                    }
                    tVar3.getClass();
                    if (a != null) {
                    }
                    a2 = baVar.a();
                    if (a2 != null) {
                    }
                    List b222 = baVar.b();
                    com.yandex.passport.internal.rotation.b bVar322 = (com.yandex.passport.internal.rotation.b) ref$ObjectRef.element;
                    value = new r(userInfo, passportAccountUpgradeStatus, b222, bVar322 != null ? bVar322.b() : null);
                }
                return new Result(value);
            }
        }
        getAllUserInfoUseCase$run$1 = new GetAllUserInfoUseCase$run$1(tVar3, continuationImpl);
        Object obj2 = getAllUserInfoUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAllUserInfoUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (s) obj, (ContinuationImpl) continuation);
    }
}
