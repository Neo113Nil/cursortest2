package com.ybsdk.common;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.StartSessionOnInitConfig;
import defpackage.aab1;
import defpackage.b64;
import defpackage.di51;
import defpackage.em3;
import defpackage.fcy0;
import defpackage.fk3;
import defpackage.fp90;
import defpackage.g050;
import defpackage.gff;
import defpackage.gtq0;
import defpackage.hzq0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.tje;
import defpackage.tse;
import defpackage.urp0;
import defpackage.vrp0;
import defpackage.w511;
import defpackage.wlp;
import defpackage.x1u0;
import defpackage.x4e;
import defpackage.yo40;
import defpackage.zy11;
import io.appmetrica.analytics.UserInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final di51 a;
    public final fk3 b;
    public final com.ybsdk.common.repositiories.auth.b c;
    public final AppAnalyticsReporter d;
    public final ppp0 e;
    public final gff f;
    public final com.ybsdk.di.modules.e g;
    public final tse h;
    public final yo40 i;
    public final kotlinx.coroutines.sync.a j = gtq0.a();

    public e(di51 di51Var, fk3 fk3Var, com.ybsdk.common.repositiories.auth.b bVar, AppAnalyticsReporter appAnalyticsReporter, ppp0 ppp0Var, gff gffVar, com.ybsdk.di.modules.e eVar, tse tseVar, yo40 yo40Var) {
        this.a = di51Var;
        this.b = fk3Var;
        this.c = bVar;
        this.d = appAnalyticsReporter;
        this.e = ppp0Var;
        this.f = gffVar;
        this.g = eVar;
        this.h = tseVar;
        this.i = yo40Var;
        if (((StartSessionOnInitConfig) ((com.ybsdk.rconfig.b) yo40Var.a).d(x1u0.a).getData()).isEnabled()) {
            kotlinx.coroutines.flow.e.H(tseVar, b(null, StartSessionCallSource.Default.INSTANCE, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, SdkUserAuthRequirement sdkUserAuthRequirement, ContinuationImpl continuationImpl) {
        SdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1 sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1;
        int i;
        boolean z;
        int i2;
        if (continuationImpl instanceof SdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1) {
            sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1 = (SdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1) continuationImpl;
            int i3 = sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    StartSessionCallSource publicApi = new StartSessionCallSource.PublicApi(str);
                    sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.L$0 = str;
                    sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.L$1 = sdkUserAuthRequirement;
                    sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.label = 1;
                    obj = c(publicApi, sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sdkUserAuthRequirement = (SdkUserAuthRequirement) sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.L$1;
                    str = (String) sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                InternalSdkState internalSdkState = (InternalSdkState) obj;
                i2 = urp0.b[sdkUserAuthRequirement.ordinal()];
                if (i2 != 1) {
                    z = c.d(internalSdkState);
                } else if (i2 == 2) {
                    z = c.a(internalSdkState);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    if (!(internalSdkState instanceof InternalSdkState.Ok) && !(internalSdkState instanceof InternalSdkState.PinInput)) {
                        if (!(internalSdkState instanceof InternalSdkState.YbRegistration) && !(internalSdkState instanceof InternalSdkState.OpenProduct) && !(internalSdkState instanceof InternalSdkState.SmsAuthorization) && !(internalSdkState instanceof InternalSdkState.StartSessionDeeplink) && !(internalSdkState instanceof InternalSdkState.AccountUpgrade) && !(internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) && !(internalSdkState instanceof InternalSdkState.Error) && !(internalSdkState instanceof InternalSdkState.RequestNewAmToken) && !(internalSdkState instanceof InternalSdkState.Unauthenticated) && !(internalSdkState instanceof InternalSdkState.UpdateRequired) && !(internalSdkState instanceof InternalSdkState.Support)) {
                            w511.b();
                            return null;
                        }
                        z = false;
                    }
                }
                if (!z) {
                    return zy11.a;
                }
                fcy0 fcy0Var = this.d.m0;
                fcy0Var.a.a("tech.wrong_api_call", x4e.t(2, "sdk_state", c.b(internalSdkState), "method", str));
                return new Result.Failure(new Exception(b64.l("SDK state is ", c.b(internalSdkState), " when calling ", str)));
            }
        }
        sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1 = new SdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1(this, continuationImpl);
        Object obj3 = sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateDispatcher$authorizeAndCheckAuthorizationStatus$1.label;
        z = true;
        if (i != 0) {
        }
        InternalSdkState internalSdkState2 = (InternalSdkState) obj3;
        i2 = urp0.b[sdkUserAuthRequirement.ordinal()];
        if (i2 != 1) {
        }
        if (!z) {
        }
    }

    public final vrp0 b(String str, StartSessionCallSource startSessionCallSource, String str2) {
        int i = 3;
        return new vrp0(new jqr(new jqr(this.a.m(), new SdkStateDispatcher$authorizeAndSendState$1(2, null), i), new SdkStateDispatcher$authorizeAndSendState$2(this, null), i), this, str, startSessionCallSource, str2);
    }

    public final Object c(StartSessionCallSource startSessionCallSource, ContinuationImpl continuationImpl) {
        return d((Long) this.a.m().getValue(), null, null, true, startSessionCallSource, null, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x02ee, code lost:
    
        if (r8.a(r0, r3) == r4) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a9 A[Catch: all -> 0x02ac, TryCatch #7 {all -> 0x02ac, blocks: (B:25:0x0293, B:28:0x02a1, B:30:0x02a9, B:32:0x02b3, B:34:0x02b9, B:35:0x02bf, B:125:0x018a), top: B:124:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247 A[Catch: all -> 0x0258, TryCatch #4 {all -> 0x0258, blocks: (B:57:0x0243, B:59:0x0247, B:61:0x0253, B:62:0x0260), top: B:56:0x0243 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0253 A[Catch: all -> 0x0258, TryCatch #4 {all -> 0x0258, blocks: (B:57:0x0243, B:59:0x0247, B:61:0x0253, B:62:0x0260), top: B:56:0x0243 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da A[Catch: all -> 0x01de, TryCatch #8 {all -> 0x01de, blocks: (B:82:0x01c7, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ea, B:93:0x01f3, B:95:0x01f7, B:97:0x01fe, B:99:0x0204, B:101:0x0218, B:104:0x0225), top: B:81:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7 A[Catch: all -> 0x01de, TryCatch #8 {all -> 0x01de, blocks: (B:82:0x01c7, B:85:0x01d2, B:87:0x01da, B:89:0x01e4, B:91:0x01ea, B:93:0x01f3, B:95:0x01f7, B:97:0x01fe, B:99:0x0204, B:101:0x0218, B:104:0x0225), top: B:81:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Long l, String str, String str2, boolean z, StartSessionCallSource startSessionCallSource, String str3, ContinuationImpl continuationImpl) {
        SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$1;
        ?? r5;
        g050 g050Var;
        Object obj;
        StartSessionCallSource startSessionCallSource2;
        String str4;
        String str5;
        boolean z2;
        String str6;
        g050 g050Var2;
        Long l2;
        Object a;
        Object obj2;
        g050 g050Var3;
        String str7;
        String str8;
        String str9;
        Long l3;
        String str10;
        String str11;
        StartSessionCallSource startSessionCallSource3;
        g050 g050Var4;
        Long l4;
        String str12;
        String str13;
        InternalSdkState internalSdkState;
        InternalSdkState internalSdkState2;
        g050 g050Var5;
        Object obj3;
        String str14;
        Throwable t;
        SessionEntity$ActionReason actionReason;
        String str15;
        InternalSdkState internalSdkState3;
        String str16;
        StartSessionCallSource startSessionCallSource4;
        Long l5;
        fp90 fp90Var;
        InternalSdkState internalSdkState4;
        Object obj4;
        SessionEntity$ActionReason actionReason2;
        em3 em3Var = this.d.d;
        try {
            if (continuationImpl instanceof SdkStateDispatcher$authorizeWithResult$1) {
                sdkStateDispatcher$authorizeWithResult$1 = (SdkStateDispatcher$authorizeWithResult$1) continuationImpl;
                int i = sdkStateDispatcher$authorizeWithResult$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    sdkStateDispatcher$authorizeWithResult$1.label = i - Integer.MIN_VALUE;
                    Object obj5 = sdkStateDispatcher$authorizeWithResult$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = sdkStateDispatcher$authorizeWithResult$1.label;
                    com.ybsdk.common.repositiories.auth.b bVar = this.c;
                    gff gffVar = this.f;
                    switch (r5) {
                        case 0:
                            kotlin.b.b(obj5);
                            sdkStateDispatcher$authorizeWithResult$1.L$0 = l;
                            sdkStateDispatcher$authorizeWithResult$1.L$1 = str;
                            sdkStateDispatcher$authorizeWithResult$1.L$2 = str2;
                            startSessionCallSource2 = startSessionCallSource;
                            sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource2;
                            str4 = str3;
                            sdkStateDispatcher$authorizeWithResult$1.L$4 = str4;
                            kotlinx.coroutines.sync.a aVar = this.j;
                            sdkStateDispatcher$authorizeWithResult$1.L$5 = aVar;
                            sdkStateDispatcher$authorizeWithResult$1.Z$0 = z;
                            sdkStateDispatcher$authorizeWithResult$1.label = 1;
                            if (aVar.a(sdkStateDispatcher$authorizeWithResult$1) != coroutineSingletons) {
                                str5 = str;
                                z2 = z;
                                str6 = str2;
                                g050Var2 = aVar;
                                l2 = l;
                                if (z2) {
                                    try {
                                        InternalSdkState b = gffVar.b();
                                        if (b != null && !jl40.l(b.getSource(), StartSessionCallSource.PinTokenCacheManager.INSTANCE) && !(b instanceof InternalSdkState.Error)) {
                                            String b2 = c.b(b);
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                                            linkedHashMap.put("value", b2);
                                            em3Var.a.a("start_session.cached_state", linkedHashMap);
                                            g050Var2.d(null);
                                            return b;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        g050Var = g050Var2;
                                        obj = null;
                                        g050Var.d(obj);
                                        throw th;
                                    }
                                }
                                sdkStateDispatcher$authorizeWithResult$1.L$0 = l2;
                                sdkStateDispatcher$authorizeWithResult$1.L$1 = str5;
                                sdkStateDispatcher$authorizeWithResult$1.L$2 = str6;
                                sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource2;
                                sdkStateDispatcher$authorizeWithResult$1.L$4 = str4;
                                sdkStateDispatcher$authorizeWithResult$1.L$5 = g050Var2;
                                sdkStateDispatcher$authorizeWithResult$1.label = 2;
                                a = bVar.a(l2, null, sdkStateDispatcher$authorizeWithResult$1);
                                if (a != coroutineSingletons) {
                                    obj2 = a;
                                    g050Var3 = g050Var2;
                                    str7 = str4;
                                    str8 = str6;
                                    str9 = str5;
                                    l3 = l2;
                                    try {
                                        String str17 = (String) obj2;
                                        sdkStateDispatcher$authorizeWithResult$1.L$0 = l3;
                                        sdkStateDispatcher$authorizeWithResult$1.L$1 = str9;
                                        sdkStateDispatcher$authorizeWithResult$1.L$2 = str8;
                                        sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource2;
                                        sdkStateDispatcher$authorizeWithResult$1.L$4 = str7;
                                        sdkStateDispatcher$authorizeWithResult$1.L$5 = g050Var3;
                                        sdkStateDispatcher$authorizeWithResult$1.L$6 = str17;
                                        sdkStateDispatcher$authorizeWithResult$1.label = 3;
                                        SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$12 = sdkStateDispatcher$authorizeWithResult$1;
                                        String str18 = str7;
                                        StartSessionCallSource startSessionCallSource5 = startSessionCallSource2;
                                        String str19 = str8;
                                        String str20 = str9;
                                        obj5 = e(str17, str20, str19, startSessionCallSource5, str18, sdkStateDispatcher$authorizeWithResult$12);
                                        sdkStateDispatcher$authorizeWithResult$1 = sdkStateDispatcher$authorizeWithResult$12;
                                        if (obj5 != coroutineSingletons) {
                                            g050 g050Var6 = g050Var3;
                                            str10 = str17;
                                            str11 = str18;
                                            startSessionCallSource3 = startSessionCallSource5;
                                            g050Var4 = g050Var6;
                                            l4 = l3;
                                            str12 = str20;
                                            str13 = str19;
                                            try {
                                                internalSdkState = (InternalSdkState) obj5;
                                                String b3 = c.b(internalSdkState);
                                                boolean z3 = l4 != null;
                                                String name = startSessionCallSource3.getName();
                                                InternalSdkState.PinInput.PinTokenReissue pinTokenReissue = !(internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) ? (InternalSdkState.PinInput.PinTokenReissue) internalSdkState : null;
                                                String d = (pinTokenReissue != null || (actionReason = pinTokenReissue.getActionReason()) == null) ? null : aab1.d(actionReason);
                                                String str21 = str11;
                                                InternalSdkState.Error error = !(internalSdkState instanceof InternalSdkState.Error) ? (InternalSdkState.Error) internalSdkState : null;
                                                em3Var.t(b3, name, d, str21, (error != null || (t = error.getT()) == null) ? null : t.getMessage(), z3);
                                                em3Var = em3Var;
                                                String str22 = str21;
                                                if (internalSdkState instanceof InternalSdkState.RequestNewAmToken) {
                                                    g050Var = g050Var4;
                                                    internalSdkState4 = internalSdkState;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$0 = g050Var;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$1 = internalSdkState4;
                                                    obj4 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$2 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$3 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$4 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.label = 6;
                                                } else if (l4 != null) {
                                                    sdkStateDispatcher$authorizeWithResult$1.L$0 = l4;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$1 = str12;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$2 = str13;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource3;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$4 = str22;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$5 = g050Var4;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$6 = internalSdkState;
                                                    sdkStateDispatcher$authorizeWithResult$1.label = 4;
                                                    Object a2 = bVar.a(l4, str10, sdkStateDispatcher$authorizeWithResult$1);
                                                    if (a2 != coroutineSingletons) {
                                                        internalSdkState2 = internalSdkState;
                                                        obj3 = a2;
                                                        g050Var5 = g050Var4;
                                                        str14 = str22;
                                                        try {
                                                            String str23 = (String) obj3;
                                                            fp90Var = str23 == null ? new fp90(str23) : null;
                                                            if (fp90Var == null) {
                                                                str15 = fp90Var.a;
                                                                str22 = str14;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$0 = l4;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$1 = startSessionCallSource3;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$2 = str22;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$3 = g050Var5;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$4 = internalSdkState2;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                                                                sdkStateDispatcher$authorizeWithResult$1.label = 5;
                                                                String str24 = str22;
                                                                SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$13 = sdkStateDispatcher$authorizeWithResult$1;
                                                                StartSessionCallSource startSessionCallSource6 = startSessionCallSource3;
                                                                obj5 = e(str15, str12, str13, startSessionCallSource6, str24, sdkStateDispatcher$authorizeWithResult$13);
                                                                sdkStateDispatcher$authorizeWithResult$1 = sdkStateDispatcher$authorizeWithResult$13;
                                                                if (obj5 != coroutineSingletons) {
                                                                    internalSdkState3 = internalSdkState2;
                                                                    g050Var3 = g050Var5;
                                                                    str16 = str24;
                                                                    startSessionCallSource4 = startSessionCallSource6;
                                                                    l5 = l4;
                                                                    String b4 = c.b((InternalSdkState) obj5);
                                                                    boolean z4 = l5 != null;
                                                                    String name2 = startSessionCallSource4.getName();
                                                                    InternalSdkState.PinInput.PinTokenReissue pinTokenReissue2 = !(internalSdkState3 instanceof InternalSdkState.PinInput.PinTokenReissue) ? (InternalSdkState.PinInput.PinTokenReissue) internalSdkState3 : null;
                                                                    em3Var.t(b4, name2, (pinTokenReissue2 != null || (actionReason2 = pinTokenReissue2.getActionReason()) == null) ? null : aab1.d(actionReason2), str16, null, z4);
                                                                    internalSdkState = (InternalSdkState) obj5;
                                                                    g050Var = g050Var3;
                                                                    internalSdkState4 = internalSdkState;
                                                                    try {
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$0 = g050Var;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$1 = internalSdkState4;
                                                                        obj4 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$2 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$3 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$4 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                                                                        sdkStateDispatcher$authorizeWithResult$1.label = 6;
                                                                        break;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        obj = null;
                                                                        g050Var.d(obj);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                str22 = str14;
                                                                str15 = null;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$0 = l4;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$1 = startSessionCallSource3;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$2 = str22;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$3 = g050Var5;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$4 = internalSdkState2;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                                                                sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                                                                sdkStateDispatcher$authorizeWithResult$1.label = 5;
                                                                String str242 = str22;
                                                                SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$132 = sdkStateDispatcher$authorizeWithResult$1;
                                                                StartSessionCallSource startSessionCallSource62 = startSessionCallSource3;
                                                                obj5 = e(str15, str12, str13, startSessionCallSource62, str242, sdkStateDispatcher$authorizeWithResult$132);
                                                                sdkStateDispatcher$authorizeWithResult$1 = sdkStateDispatcher$authorizeWithResult$132;
                                                                if (obj5 != coroutineSingletons) {
                                                                }
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            g050Var = g050Var5;
                                                            obj = null;
                                                            g050Var.d(obj);
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    internalSdkState2 = internalSdkState;
                                                    g050Var5 = g050Var4;
                                                    str15 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$0 = l4;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$1 = startSessionCallSource3;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$2 = str22;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$3 = g050Var5;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$4 = internalSdkState2;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                                                    sdkStateDispatcher$authorizeWithResult$1.label = 5;
                                                    String str2422 = str22;
                                                    SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$1322 = sdkStateDispatcher$authorizeWithResult$1;
                                                    StartSessionCallSource startSessionCallSource622 = startSessionCallSource3;
                                                    obj5 = e(str15, str12, str13, startSessionCallSource622, str2422, sdkStateDispatcher$authorizeWithResult$1322);
                                                    sdkStateDispatcher$authorizeWithResult$1 = sdkStateDispatcher$authorizeWithResult$1322;
                                                    if (obj5 != coroutineSingletons) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                g050Var = g050Var4;
                                                obj = null;
                                                g050Var.d(obj);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        g050Var = g050Var3;
                                        obj = null;
                                        g050Var.d(obj);
                                        throw th;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            z2 = sdkStateDispatcher$authorizeWithResult$1.Z$0;
                            g050Var2 = (g050) sdkStateDispatcher$authorizeWithResult$1.L$5;
                            String str25 = (String) sdkStateDispatcher$authorizeWithResult$1.L$4;
                            StartSessionCallSource startSessionCallSource7 = (StartSessionCallSource) sdkStateDispatcher$authorizeWithResult$1.L$3;
                            str6 = (String) sdkStateDispatcher$authorizeWithResult$1.L$2;
                            str5 = (String) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            l2 = (Long) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            kotlin.b.b(obj5);
                            str4 = str25;
                            startSessionCallSource2 = startSessionCallSource7;
                            if (z2) {
                            }
                            sdkStateDispatcher$authorizeWithResult$1.L$0 = l2;
                            sdkStateDispatcher$authorizeWithResult$1.L$1 = str5;
                            sdkStateDispatcher$authorizeWithResult$1.L$2 = str6;
                            sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource2;
                            sdkStateDispatcher$authorizeWithResult$1.L$4 = str4;
                            sdkStateDispatcher$authorizeWithResult$1.L$5 = g050Var2;
                            sdkStateDispatcher$authorizeWithResult$1.label = 2;
                            a = bVar.a(l2, null, sdkStateDispatcher$authorizeWithResult$1);
                            if (a != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 2:
                            g050Var3 = (g050) sdkStateDispatcher$authorizeWithResult$1.L$5;
                            str7 = (String) sdkStateDispatcher$authorizeWithResult$1.L$4;
                            startSessionCallSource2 = (StartSessionCallSource) sdkStateDispatcher$authorizeWithResult$1.L$3;
                            str8 = (String) sdkStateDispatcher$authorizeWithResult$1.L$2;
                            str9 = (String) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            l3 = (Long) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            kotlin.b.b(obj5);
                            fp90 fp90Var2 = (fp90) obj5;
                            obj2 = fp90Var2 != null ? fp90Var2.a : null;
                            String str172 = (String) obj2;
                            sdkStateDispatcher$authorizeWithResult$1.L$0 = l3;
                            sdkStateDispatcher$authorizeWithResult$1.L$1 = str9;
                            sdkStateDispatcher$authorizeWithResult$1.L$2 = str8;
                            sdkStateDispatcher$authorizeWithResult$1.L$3 = startSessionCallSource2;
                            sdkStateDispatcher$authorizeWithResult$1.L$4 = str7;
                            sdkStateDispatcher$authorizeWithResult$1.L$5 = g050Var3;
                            sdkStateDispatcher$authorizeWithResult$1.L$6 = str172;
                            sdkStateDispatcher$authorizeWithResult$1.label = 3;
                            SdkStateDispatcher$authorizeWithResult$1 sdkStateDispatcher$authorizeWithResult$122 = sdkStateDispatcher$authorizeWithResult$1;
                            String str182 = str7;
                            StartSessionCallSource startSessionCallSource52 = startSessionCallSource2;
                            String str192 = str8;
                            String str202 = str9;
                            obj5 = e(str172, str202, str192, startSessionCallSource52, str182, sdkStateDispatcher$authorizeWithResult$122);
                            sdkStateDispatcher$authorizeWithResult$1 = sdkStateDispatcher$authorizeWithResult$122;
                            if (obj5 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 3:
                            str10 = (String) sdkStateDispatcher$authorizeWithResult$1.L$6;
                            g050Var4 = (g050) sdkStateDispatcher$authorizeWithResult$1.L$5;
                            String str26 = (String) sdkStateDispatcher$authorizeWithResult$1.L$4;
                            StartSessionCallSource startSessionCallSource8 = (StartSessionCallSource) sdkStateDispatcher$authorizeWithResult$1.L$3;
                            String str27 = (String) sdkStateDispatcher$authorizeWithResult$1.L$2;
                            String str28 = (String) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            Long l6 = (Long) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            try {
                                kotlin.b.b(obj5);
                                str11 = str26;
                                startSessionCallSource3 = startSessionCallSource8;
                                str13 = str27;
                                str12 = str28;
                                l4 = l6;
                                internalSdkState = (InternalSdkState) obj5;
                                String b32 = c.b(internalSdkState);
                                if (l4 != null) {
                                }
                                String name3 = startSessionCallSource3.getName();
                                if (!(internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue)) {
                                }
                                if (pinTokenReissue != null) {
                                    break;
                                }
                                String str212 = str11;
                                if (!(internalSdkState instanceof InternalSdkState.Error)) {
                                }
                                if (error != null) {
                                    break;
                                }
                                em3Var.t(b32, name3, d, str212, (error != null || (t = error.getT()) == null) ? null : t.getMessage(), z3);
                                em3Var = em3Var;
                                String str222 = str212;
                                if (internalSdkState instanceof InternalSdkState.RequestNewAmToken) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj = null;
                                g050Var = g050Var4;
                                g050Var.d(obj);
                                throw th;
                            }
                            break;
                        case 4:
                            internalSdkState2 = (InternalSdkState) sdkStateDispatcher$authorizeWithResult$1.L$6;
                            g050Var5 = (g050) sdkStateDispatcher$authorizeWithResult$1.L$5;
                            str14 = (String) sdkStateDispatcher$authorizeWithResult$1.L$4;
                            startSessionCallSource3 = (StartSessionCallSource) sdkStateDispatcher$authorizeWithResult$1.L$3;
                            str13 = (String) sdkStateDispatcher$authorizeWithResult$1.L$2;
                            str12 = (String) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            l4 = (Long) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            try {
                                kotlin.b.b(obj5);
                                fp90 fp90Var3 = (fp90) obj5;
                                obj3 = fp90Var3 != null ? fp90Var3.a : null;
                                String str232 = (String) obj3;
                                if (str232 == null) {
                                }
                                if (fp90Var == null) {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                g050Var = g050Var5;
                                obj = null;
                                g050Var.d(obj);
                                throw th;
                            }
                            break;
                        case 5:
                            internalSdkState3 = (InternalSdkState) sdkStateDispatcher$authorizeWithResult$1.L$4;
                            g050Var3 = (g050) sdkStateDispatcher$authorizeWithResult$1.L$3;
                            str16 = (String) sdkStateDispatcher$authorizeWithResult$1.L$2;
                            startSessionCallSource4 = (StartSessionCallSource) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            l5 = (Long) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            kotlin.b.b(obj5);
                            String b42 = c.b((InternalSdkState) obj5);
                            if (l5 != null) {
                            }
                            String name22 = startSessionCallSource4.getName();
                            if (!(internalSdkState3 instanceof InternalSdkState.PinInput.PinTokenReissue)) {
                            }
                            if (pinTokenReissue2 != null) {
                                break;
                            }
                            em3Var.t(b42, name22, (pinTokenReissue2 != null || (actionReason2 = pinTokenReissue2.getActionReason()) == null) ? null : aab1.d(actionReason2), str16, null, z4);
                            internalSdkState = (InternalSdkState) obj5;
                            g050Var = g050Var3;
                            internalSdkState4 = internalSdkState;
                            sdkStateDispatcher$authorizeWithResult$1.L$0 = g050Var;
                            sdkStateDispatcher$authorizeWithResult$1.L$1 = internalSdkState4;
                            obj4 = null;
                            sdkStateDispatcher$authorizeWithResult$1.L$2 = null;
                            sdkStateDispatcher$authorizeWithResult$1.L$3 = null;
                            sdkStateDispatcher$authorizeWithResult$1.L$4 = null;
                            sdkStateDispatcher$authorizeWithResult$1.L$5 = null;
                            sdkStateDispatcher$authorizeWithResult$1.L$6 = null;
                            sdkStateDispatcher$authorizeWithResult$1.label = 6;
                            break;
                        case 6:
                            internalSdkState4 = (InternalSdkState) sdkStateDispatcher$authorizeWithResult$1.L$1;
                            g050Var = (g050) sdkStateDispatcher$authorizeWithResult$1.L$0;
                            try {
                                kotlin.b.b(obj5);
                                obj4 = null;
                                g050Var.d(obj4);
                                return internalSdkState4;
                            } catch (Throwable th8) {
                                th = th8;
                                obj = null;
                                g050Var.d(obj);
                                throw th;
                            }
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (r5) {
            }
        } catch (Throwable th9) {
            th = th9;
            g050Var = r5;
        }
        sdkStateDispatcher$authorizeWithResult$1 = new SdkStateDispatcher$authorizeWithResult$1(this, continuationImpl);
        Object obj52 = sdkStateDispatcher$authorizeWithResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = sdkStateDispatcher$authorizeWithResult$1.label;
        com.ybsdk.common.repositiories.auth.b bVar2 = this.c;
        gff gffVar2 = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, StartSessionCallSource startSessionCallSource, String str4, ContinuationImpl continuationImpl) {
        SdkStateDispatcher$callStartSession$1 sdkStateDispatcher$callStartSession$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SdkStateDispatcher$callStartSession$1) {
            sdkStateDispatcher$callStartSession$1 = (SdkStateDispatcher$callStartSession$1) continuationImpl;
            int i2 = sdkStateDispatcher$callStartSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkStateDispatcher$callStartSession$1.label = i2 - Integer.MIN_VALUE;
                SdkStateDispatcher$callStartSession$1 sdkStateDispatcher$callStartSession$12 = sdkStateDispatcher$callStartSession$1;
                Object obj = sdkStateDispatcher$callStartSession$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkStateDispatcher$callStartSession$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        this.d.a.setUserInfo(new UserInfo(null));
                        return new InternalSdkState.Unauthenticated(startSessionCallSource);
                    }
                    sdkStateDispatcher$callStartSession$12.L$0 = startSessionCallSource;
                    sdkStateDispatcher$callStartSession$12.label = 1;
                    c = ((com.ybsdk.common.repositiories.auth.a) this.b).c(str, str2, str3, str4, sdkStateDispatcher$callStartSession$12);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startSessionCallSource = (StartSessionCallSource) sdkStateDispatcher$callStartSession$12.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new InternalSdkState.Error(a, startSessionCallSource);
                }
                hzq0 hzq0Var = (hzq0) c;
                switch (urp0.a[hzq0Var.a().ordinal()]) {
                    case 1:
                        return new InternalSdkState.Ok(hzq0Var.c(), hzq0Var.i(), startSessionCallSource, hzq0Var.a());
                    case 2:
                        String d = hzq0Var.d();
                        return d != null ? new InternalSdkState.SmsAuthorization(d, startSessionCallSource, hzq0Var.a()) : new InternalSdkState.Error(new Exception("State AUTHORIZATION but authorizationTrackId null"), startSessionCallSource);
                    case 3:
                        return new InternalSdkState.AccountUpgrade(startSessionCallSource, hzq0Var.a());
                    case 4:
                        YBProduct g = hzq0Var.g();
                        if (g == null) {
                            return new InternalSdkState.Error(new Exception("State OPEN_PRODUCT but product_to_open is null"), startSessionCallSource);
                        }
                        String i3 = hzq0Var.i();
                        return new InternalSdkState.OpenProduct(g, i3 != null ? i3 : "", startSessionCallSource, hzq0Var.a());
                    case 5:
                        YBProduct g2 = hzq0Var.g();
                        if (g2 == null) {
                            return new InternalSdkState.Error(new Exception("State BANK_REGISTRATION but product_to_open is null"), startSessionCallSource);
                        }
                        String i4 = hzq0Var.i();
                        return new InternalSdkState.YbRegistration(g2, i4 != null ? i4 : "", startSessionCallSource, hzq0Var.a());
                    case 6:
                        return new InternalSdkState.ApplicationStatusCheck(hzq0Var.c(), startSessionCallSource, hzq0Var.a());
                    case 7:
                        return new InternalSdkState.Support(hzq0Var.j(), startSessionCallSource, hzq0Var.a());
                    case 8:
                        return new InternalSdkState.RequestNewAmToken(startSessionCallSource, hzq0Var.a());
                    case 9:
                        return new InternalSdkState.UpdateRequired(startSessionCallSource, hzq0Var.a());
                    case 10:
                        return new InternalSdkState.PinTokenClear(startSessionCallSource, hzq0Var.a());
                    case 11:
                        return new InternalSdkState.PinInput.PinTokenReissue(hzq0Var.b(), startSessionCallSource, hzq0Var.a());
                    case 12:
                        Integer f = hzq0Var.f();
                        return new InternalSdkState.PinInput.PinTokenRetry(f != null ? f.intValue() : 0, startSessionCallSource, hzq0Var.a());
                    case 13:
                        return new InternalSdkState.StartSessionDeeplink(hzq0Var.e(), hzq0Var.j(), startSessionCallSource, hzq0Var.a());
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        sdkStateDispatcher$callStartSession$1 = new SdkStateDispatcher$callStartSession$1(this, continuationImpl);
        SdkStateDispatcher$callStartSession$1 sdkStateDispatcher$callStartSession$122 = sdkStateDispatcher$callStartSession$1;
        Object obj2 = sdkStateDispatcher$callStartSession$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateDispatcher$callStartSession$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0068, code lost:
    
        if (r0.a(r2) == r3) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:25:0x006c, B:29:0x0076, B:31:0x0080, B:36:0x008f, B:37:0x0093, B:39:0x0099, B:42:0x00a9, B:44:0x00ad, B:45:0x00c1, B:47:0x00c7, B:50:0x00d8, B:55:0x00dc, B:56:0x0160, B:60:0x00e9, B:62:0x00ed, B:63:0x0101, B:65:0x0107, B:68:0x0118, B:73:0x011c, B:74:0x0125, B:76:0x0129, B:78:0x012d, B:80:0x0131, B:82:0x0135, B:84:0x0139, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x014d, B:96:0x0151, B:98:0x0155, B:101:0x015a, B:102:0x015f), top: B:24:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        SdkStateDispatcher$removeHandledApplication$1 sdkStateDispatcher$removeHandledApplication$1;
        int i;
        String str2;
        g050 g050Var;
        g050 g050Var2;
        g050 g050Var3;
        InternalSdkState b;
        try {
            if (continuationImpl instanceof SdkStateDispatcher$removeHandledApplication$1) {
                sdkStateDispatcher$removeHandledApplication$1 = (SdkStateDispatcher$removeHandledApplication$1) continuationImpl;
                int i2 = sdkStateDispatcher$removeHandledApplication$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sdkStateDispatcher$removeHandledApplication$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sdkStateDispatcher$removeHandledApplication$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sdkStateDispatcher$removeHandledApplication$1.label;
                    gff gffVar = this.f;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (gffVar.b() == null) {
                            return zy11Var;
                        }
                        str2 = str;
                        sdkStateDispatcher$removeHandledApplication$1.L$0 = str2;
                        g050Var = this.j;
                        sdkStateDispatcher$removeHandledApplication$1.L$1 = g050Var;
                        sdkStateDispatcher$removeHandledApplication$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var3 = (g050) sdkStateDispatcher$removeHandledApplication$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var3.d(null);
                                return zy11Var;
                            } catch (Throwable th) {
                                th = th;
                                g050Var3.d(null);
                                throw th;
                            }
                        }
                        g050Var = (g050) sdkStateDispatcher$removeHandledApplication$1.L$1;
                        String str3 = (String) sdkStateDispatcher$removeHandledApplication$1.L$0;
                        kotlin.b.b(obj);
                        str2 = str3;
                    }
                    g050Var2 = g050Var;
                    b = gffVar.b();
                    if (b != null) {
                        g050Var2.d(null);
                        return zy11Var;
                    }
                    List<SessionApplicationEntity> applications = b.getApplications();
                    if (!(applications instanceof Collection) || !applications.isEmpty()) {
                        Iterator<T> it = applications.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((SessionApplicationEntity) it.next()).getApplicationId(), str2)) {
                                if (b instanceof InternalSdkState.Ok) {
                                    InternalSdkState.Ok ok = (InternalSdkState.Ok) b;
                                    List<SessionApplicationEntity> applications2 = ((InternalSdkState.Ok) b).getApplications();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : applications2) {
                                        if (!jl40.l(((SessionApplicationEntity) obj2).getApplicationId(), str2)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    b = InternalSdkState.Ok.copy$default(ok, arrayList, null, null, null, 14, null);
                                } else if (b instanceof InternalSdkState.ApplicationStatusCheck) {
                                    InternalSdkState.ApplicationStatusCheck applicationStatusCheck = (InternalSdkState.ApplicationStatusCheck) b;
                                    List<SessionApplicationEntity> applications3 = ((InternalSdkState.ApplicationStatusCheck) b).getApplications();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : applications3) {
                                        if (!jl40.l(((SessionApplicationEntity) obj3).getApplicationId(), str2)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    b = InternalSdkState.ApplicationStatusCheck.copy$default(applicationStatusCheck, arrayList2, null, null, 6, null);
                                } else if (!(b instanceof InternalSdkState.AccountUpgrade) && !(b instanceof InternalSdkState.YbRegistration) && !(b instanceof InternalSdkState.Error) && !(b instanceof InternalSdkState.OpenProduct) && !(b instanceof InternalSdkState.PinTokenClear) && !(b instanceof InternalSdkState.PinInput.PinTokenReissue) && !(b instanceof InternalSdkState.PinInput.PinTokenRetry) && !(b instanceof InternalSdkState.RequestNewAmToken) && !(b instanceof InternalSdkState.SmsAuthorization) && !(b instanceof InternalSdkState.Support) && !(b instanceof InternalSdkState.Unauthenticated) && !(b instanceof InternalSdkState.StartSessionDeeplink) && !(b instanceof InternalSdkState.UpdateRequired)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                sdkStateDispatcher$removeHandledApplication$1.L$0 = g050Var2;
                                sdkStateDispatcher$removeHandledApplication$1.L$1 = null;
                                sdkStateDispatcher$removeHandledApplication$1.label = 2;
                                if (gffVar.a(b, sdkStateDispatcher$removeHandledApplication$1) != coroutineSingletons) {
                                    g050Var3 = g050Var2;
                                    g050Var3.d(null);
                                    return zy11Var;
                                }
                                return coroutineSingletons;
                            }
                        }
                    }
                    g050Var2.d(null);
                    return zy11Var;
                }
            }
            b = gffVar.b();
            if (b != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var3 = g050Var2;
            g050Var3.d(null);
            throw th;
        }
        sdkStateDispatcher$removeHandledApplication$1 = new SdkStateDispatcher$removeHandledApplication$1(this, continuationImpl);
        Object obj4 = sdkStateDispatcher$removeHandledApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateDispatcher$removeHandledApplication$1.label;
        gff gffVar2 = this.f;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        g050Var2 = g050Var;
    }

    public final void g(boolean z) {
        if (((CommonFeatureFlag) ((com.ybsdk.rconfig.b) this.i.a).d(wlp.z0).getData()).isEnabled()) {
            tje.N(this.h, null, null, new SdkStateDispatcher$requestDeviceCheckOnPinEntered$1(this, z, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r0.a(r9, r1) == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r8.a(r1) == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:20:0x0051, B:22:0x0059), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ybsdk.common.e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, zy11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        SdkStateDispatcher$requirePin$1 sdkStateDispatcher$requirePin$1;
        int i;
        g050 g050Var;
        gff gffVar = this.f;
        try {
            if (continuationImpl instanceof SdkStateDispatcher$requirePin$1) {
                sdkStateDispatcher$requirePin$1 = (SdkStateDispatcher$requirePin$1) continuationImpl;
                int i2 = sdkStateDispatcher$requirePin$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sdkStateDispatcher$requirePin$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sdkStateDispatcher$requirePin$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sdkStateDispatcher$requirePin$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g050Var = this.j;
                        sdkStateDispatcher$requirePin$1.L$0 = g050Var;
                        sdkStateDispatcher$requirePin$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) sdkStateDispatcher$requirePin$1.L$0;
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            this = zy11.a;
                            return this;
                        }
                        g050Var = (g050) sdkStateDispatcher$requirePin$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (!(gffVar.b() instanceof InternalSdkState.PinInput.PinTokenRetry)) {
                        InternalSdkState.PinInput.PinTokenRetry pinTokenRetry = new InternalSdkState.PinInput.PinTokenRetry(10, StartSessionCallSource.PinTokenCacheManager.INSTANCE, SessionEntity$Action.PIN_TOKEN_RETRY);
                        sdkStateDispatcher$requirePin$1.L$0 = g050Var;
                        sdkStateDispatcher$requirePin$1.label = 2;
                    }
                    g050Var.d(null);
                    this = zy11.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            if (!(gffVar.b() instanceof InternalSdkState.PinInput.PinTokenRetry)) {
            }
            g050Var.d(null);
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.d(null);
            throw th;
        }
        sdkStateDispatcher$requirePin$1 = new SdkStateDispatcher$requirePin$1(this, continuationImpl);
        Object obj2 = sdkStateDispatcher$requirePin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkStateDispatcher$requirePin$1.label;
    }
}
