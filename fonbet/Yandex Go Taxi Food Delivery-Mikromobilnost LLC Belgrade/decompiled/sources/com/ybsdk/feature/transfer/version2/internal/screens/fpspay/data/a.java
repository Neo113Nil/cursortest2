package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.di.modules.features.t;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import defpackage.d6v;
import defpackage.ny61;
import defpackage.x4c;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;
    public final t b;

    public a(Transfer2Api transfer2Api, t tVar) {
        this.a = transfer2Api;
        this.b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, d6v d6vVar, String str3, String str4, ContinuationImpl continuationImpl) {
        FpsPayRepository$confirmFpsPay$1 fpsPayRepository$confirmFpsPay$1;
        int i;
        String str5;
        d6v d6vVar2;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj;
        d6v d6vVar3;
        String str10;
        String str11;
        String str12;
        if (continuationImpl instanceof FpsPayRepository$confirmFpsPay$1) {
            fpsPayRepository$confirmFpsPay$1 = (FpsPayRepository$confirmFpsPay$1) continuationImpl;
            int i2 = fpsPayRepository$confirmFpsPay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fpsPayRepository$confirmFpsPay$1.label = i2 - Integer.MIN_VALUE;
                FpsPayRepository$confirmFpsPay$1 fpsPayRepository$confirmFpsPay$12 = fpsPayRepository$confirmFpsPay$1;
                Object obj2 = fpsPayRepository$confirmFpsPay$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fpsPayRepository$confirmFpsPay$12.label;
                if (i != 0) {
                    b.b(obj2);
                    if (str4 == null) {
                        fpsPayRepository$confirmFpsPay$12.L$0 = str;
                        fpsPayRepository$confirmFpsPay$12.L$1 = str2;
                        fpsPayRepository$confirmFpsPay$12.L$2 = d6vVar;
                        str9 = str3;
                        fpsPayRepository$confirmFpsPay$12.L$3 = str9;
                        fpsPayRepository$confirmFpsPay$12.label = 1;
                        Object a = this.b.a(fpsPayRepository$confirmFpsPay$12);
                        if (a != obj3) {
                            obj = a;
                            d6vVar3 = d6vVar;
                            str10 = str;
                            str11 = str2;
                        }
                    }
                    str5 = str;
                    d6vVar2 = d6vVar;
                    str6 = str3;
                    str7 = str2;
                    str8 = str4;
                    FpsPayRepository$confirmFpsPay$2 fpsPayRepository$confirmFpsPay$2 = new FpsPayRepository$confirmFpsPay$2(d6vVar2, this, str5, str7, str8, str6, null);
                    fpsPayRepository$confirmFpsPay$12.L$0 = null;
                    fpsPayRepository$confirmFpsPay$12.L$1 = null;
                    fpsPayRepository$confirmFpsPay$12.L$2 = null;
                    fpsPayRepository$confirmFpsPay$12.L$3 = null;
                    fpsPayRepository$confirmFpsPay$12.label = 2;
                    Object c = c.c(fpsPayRepository$confirmFpsPay$2, fpsPayRepository$confirmFpsPay$12);
                    return c != obj3 ? obj3 : c;
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str13 = (String) fpsPayRepository$confirmFpsPay$12.L$3;
                d6vVar3 = (d6v) fpsPayRepository$confirmFpsPay$12.L$2;
                String str14 = (String) fpsPayRepository$confirmFpsPay$12.L$1;
                String str15 = (String) fpsPayRepository$confirmFpsPay$12.L$0;
                b.b(obj2);
                obj = ((Result) obj2).getValue();
                str10 = str15;
                str9 = str13;
                str11 = str14;
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                str12 = (String) obj;
                if (str12 != null) {
                    x4c.g("[fps-pay] couldn't find agreement_id for enroll confirmation", null, null, null, 14);
                    return new Result.Failure(new IllegalStateException("No agreement id"));
                }
                str6 = str9;
                str8 = str12;
                str7 = str11;
                d6vVar2 = d6vVar3;
                str5 = str10;
                FpsPayRepository$confirmFpsPay$2 fpsPayRepository$confirmFpsPay$22 = new FpsPayRepository$confirmFpsPay$2(d6vVar2, this, str5, str7, str8, str6, null);
                fpsPayRepository$confirmFpsPay$12.L$0 = null;
                fpsPayRepository$confirmFpsPay$12.L$1 = null;
                fpsPayRepository$confirmFpsPay$12.L$2 = null;
                fpsPayRepository$confirmFpsPay$12.L$3 = null;
                fpsPayRepository$confirmFpsPay$12.label = 2;
                Object c2 = c.c(fpsPayRepository$confirmFpsPay$22, fpsPayRepository$confirmFpsPay$12);
                if (c2 != obj3) {
                }
            }
        }
        fpsPayRepository$confirmFpsPay$1 = new FpsPayRepository$confirmFpsPay$1(this, continuationImpl);
        FpsPayRepository$confirmFpsPay$1 fpsPayRepository$confirmFpsPay$122 = fpsPayRepository$confirmFpsPay$1;
        Object obj22 = fpsPayRepository$confirmFpsPay$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fpsPayRepository$confirmFpsPay$122.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        str12 = (String) obj;
        if (str12 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FpsPayRepository$getFpsPayEnrollData$1 fpsPayRepository$getFpsPayEnrollData$1;
        int i;
        if (continuationImpl instanceof FpsPayRepository$getFpsPayEnrollData$1) {
            fpsPayRepository$getFpsPayEnrollData$1 = (FpsPayRepository$getFpsPayEnrollData$1) continuationImpl;
            int i2 = fpsPayRepository$getFpsPayEnrollData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fpsPayRepository$getFpsPayEnrollData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fpsPayRepository$getFpsPayEnrollData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fpsPayRepository$getFpsPayEnrollData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                FpsPayRepository$getFpsPayEnrollData$2 fpsPayRepository$getFpsPayEnrollData$2 = new FpsPayRepository$getFpsPayEnrollData$2(this, null);
                fpsPayRepository$getFpsPayEnrollData$1.label = 1;
                Object c = c.c(fpsPayRepository$getFpsPayEnrollData$2, fpsPayRepository$getFpsPayEnrollData$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        fpsPayRepository$getFpsPayEnrollData$1 = new FpsPayRepository$getFpsPayEnrollData$1(this, continuationImpl);
        Object obj2 = fpsPayRepository$getFpsPayEnrollData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fpsPayRepository$getFpsPayEnrollData$1.label;
        if (i == 0) {
        }
    }
}
