package com.yandex.go.profile.domain.flex;

import com.yandex.go.profile.domain.flex.ProfileRepository$ProfileQueryBody;
import defpackage.ajr;
import defpackage.kr;
import defpackage.mgf0;
import defpackage.ny61;
import defpackage.pwy;
import defpackage.rgf0;
import defpackage.tpr;
import defpackage.u1m;
import defpackage.wgr;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xv11;
import defpackage.ywl;
import defpackage.zir;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f implements wgr {
    public final String a;
    public final String b;
    public final mgf0 c;
    public final ajr d;
    public final rgf0 e;
    public final xv11 f;
    public final com.yandex.go.account.user_verification.domain.i g;
    public final wnt h;

    public f(String str, String str2, mgf0 mgf0Var, ajr ajrVar, rgf0 rgf0Var, xv11 xv11Var, com.yandex.go.account.user_verification.domain.i iVar, wnt wntVar) {
        this.a = str;
        this.b = str2;
        this.c = mgf0Var;
        this.d = ajrVar;
        this.e = rgf0Var;
        this.f = xv11Var;
        this.g = iVar;
        this.h = wntVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, boolean z, ContinuationImpl continuationImpl) {
        ProfileRepository$createLoadAction$1 profileRepository$createLoadAction$1;
        int i;
        String str;
        fVar.getClass();
        if (continuationImpl instanceof ProfileRepository$createLoadAction$1) {
            profileRepository$createLoadAction$1 = (ProfileRepository$createLoadAction$1) continuationImpl;
            int i2 = profileRepository$createLoadAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileRepository$createLoadAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileRepository$createLoadAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileRepository$createLoadAction$1.label;
                ywl ywlVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    profileRepository$createLoadAction$1.Z$0 = z;
                    profileRepository$createLoadAction$1.label = 1;
                    obj = fVar.d(profileRepository$createLoadAction$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = profileRepository$createLoadAction$1.Z$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                str = fVar.b;
                if (str != null) {
                    linkedHashMap.put("extra_layout", Collections.singletonList(str));
                }
                return new pwy(new u1m(linkedHashMap, "bdui/v1/profile", map), ywlVar, z, 2);
            }
        }
        profileRepository$createLoadAction$1 = new ProfileRepository$createLoadAction$1(fVar, continuationImpl);
        Object obj3 = profileRepository$createLoadAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileRepository$createLoadAction$1.label;
        ywl ywlVar2 = null;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        str = fVar.b;
        if (str != null) {
        }
        return new pwy(new u1m(linkedHashMap2, "bdui/v1/profile", map2), ywlVar2, z, 2);
    }

    @Override // defpackage.wgr
    public final Object a(kr krVar, Continuation continuation) {
        return zy11.a;
    }

    @Override // defpackage.wgr
    public final tpr b() {
        return new e(com.yandex.go.coroutines.b.d(this.c.c, new ProfileRepository$getActionsFlow$1(this, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ProfileRepository$createQueryBody$1 profileRepository$createQueryBody$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Set set;
        String str;
        zzs zzsVar;
        String str2;
        Object b;
        String str3;
        Set set2;
        String str4;
        String str5;
        zzs zzsVar2;
        if (continuationImpl instanceof ProfileRepository$createQueryBody$1) {
            profileRepository$createQueryBody$1 = (ProfileRepository$createQueryBody$1) continuationImpl;
            int i2 = profileRepository$createQueryBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileRepository$createQueryBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileRepository$createQueryBody$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileRepository$createQueryBody$1.label;
                xv11 xv11Var = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zir b2 = com.yandex.go.flex.common.api.c.b(this.d);
                    zzs a = b2 != null ? b2.a() : null;
                    Set set3 = (Set) this.e.a.a.getValue();
                    profileRepository$createQueryBody$1.L$0 = a;
                    String str6 = this.a;
                    profileRepository$createQueryBody$1.L$1 = str6;
                    String str7 = this.b;
                    profileRepository$createQueryBody$1.L$2 = str7;
                    profileRepository$createQueryBody$1.L$3 = set3;
                    profileRepository$createQueryBody$1.label = 1;
                    Object a2 = ((com.yandex.go.ultima_mode.domain.c) xv11Var).a(profileRepository$createQueryBody$1);
                    if (a2 != coroutineSingletons) {
                        set = set3;
                        obj = a2;
                        str = str6;
                        zzsVar = a;
                        str2 = str7;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set4 = (Set) profileRepository$createQueryBody$1.L$4;
                    String str8 = (String) profileRepository$createQueryBody$1.L$3;
                    str5 = (String) profileRepository$createQueryBody$1.L$2;
                    zzs zzsVar3 = (zzs) profileRepository$createQueryBody$1.L$1;
                    str3 = (String) profileRepository$createQueryBody$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str8;
                    zzsVar2 = zzsVar3;
                    set2 = set4;
                    return ((xnt) this.h).f(new ProfileRepository$ProfileQueryBody(zzsVar2, str5, str4, set2, new ProfileRepository$ProfileQueryBody.State((String) obj, str3)), ProfileRepository$ProfileQueryBody.Companion.serializer());
                }
                set = (Set) profileRepository$createQueryBody$1.L$3;
                str2 = (String) profileRepository$createQueryBody$1.L$2;
                str = (String) profileRepository$createQueryBody$1.L$1;
                zzsVar = (zzs) profileRepository$createQueryBody$1.L$0;
                kotlin.b.b(obj);
                String str9 = (String) obj;
                profileRepository$createQueryBody$1.L$0 = str9;
                profileRepository$createQueryBody$1.L$1 = zzsVar;
                profileRepository$createQueryBody$1.L$2 = str;
                profileRepository$createQueryBody$1.L$3 = str2;
                profileRepository$createQueryBody$1.L$4 = set;
                profileRepository$createQueryBody$1.label = 2;
                b = ((com.yandex.go.ultima_mode.domain.c) xv11Var).b(profileRepository$createQueryBody$1);
                if (b != coroutineSingletons) {
                    str3 = str9;
                    obj = b;
                    set2 = set;
                    str4 = str2;
                    str5 = str;
                    zzsVar2 = zzsVar;
                    return ((xnt) this.h).f(new ProfileRepository$ProfileQueryBody(zzsVar2, str5, str4, set2, new ProfileRepository$ProfileQueryBody.State((String) obj, str3)), ProfileRepository$ProfileQueryBody.Companion.serializer());
                }
                return coroutineSingletons;
            }
        }
        profileRepository$createQueryBody$1 = new ProfileRepository$createQueryBody$1(this, continuationImpl);
        Object obj2 = profileRepository$createQueryBody$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileRepository$createQueryBody$1.label;
        xv11 xv11Var2 = this.f;
        if (i != 0) {
        }
        String str92 = (String) obj2;
        profileRepository$createQueryBody$1.L$0 = str92;
        profileRepository$createQueryBody$1.L$1 = zzsVar;
        profileRepository$createQueryBody$1.L$2 = str;
        profileRepository$createQueryBody$1.L$3 = str2;
        profileRepository$createQueryBody$1.L$4 = set;
        profileRepository$createQueryBody$1.label = 2;
        b = ((com.yandex.go.ultima_mode.domain.c) xv11Var2).b(profileRepository$createQueryBody$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
