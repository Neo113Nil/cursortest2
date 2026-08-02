package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository;

import com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.model.MosmetroOtpError;
import defpackage.bvf0;
import defpackage.g930;
import defpackage.h930;
import defpackage.j930;
import defpackage.k930;
import defpackage.l930;
import defpackage.m930;
import defpackage.mdh;
import defpackage.n930;
import defpackage.ny61;
import defpackage.p930;
import defpackage.q930;
import defpackage.r930;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a {
    public final k930 a;
    public final r0 b = bvf0.c(new h930(0));

    public a(k930 k930Var) {
        this.a = k930Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[LOOP:0: B:12:0x0086->B:17:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, ContinuationImpl continuationImpl) {
        MosmetroOtpStateRepository$exchangeOtp$1 mosmetroOtpStateRepository$exchangeOtp$1;
        int i;
        String str2;
        String str3;
        MosmetroOtpError mosmetroOtpError;
        Object value;
        Object value2;
        h930 h930Var;
        Integer num;
        Object value3;
        if (continuationImpl instanceof MosmetroOtpStateRepository$exchangeOtp$1) {
            mosmetroOtpStateRepository$exchangeOtp$1 = (MosmetroOtpStateRepository$exchangeOtp$1) continuationImpl;
            int i2 = mosmetroOtpStateRepository$exchangeOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOtpStateRepository$exchangeOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mosmetroOtpStateRepository$exchangeOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOtpStateRepository$exchangeOtp$1.label;
                r0 r0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    while (true) {
                        Object value4 = r0Var.getValue();
                        h930 h930Var2 = (h930) value4;
                        r930 r930Var = h930Var2.a;
                        q930 q930Var = r930Var instanceof q930 ? (q930) r930Var : null;
                        g930 g930Var = q930Var != null ? q930Var.a : h930Var2.b;
                        if (g930Var != null) {
                            r930Var = new q930(g930Var);
                        }
                        str2 = str;
                        if (r0Var.k(value4, h930.a(h930Var2, r930Var, str2, true, null, false, 18))) {
                            break;
                        }
                        str = str2;
                    }
                    mosmetroOtpStateRepository$exchangeOtp$1.L$0 = str2;
                    mosmetroOtpStateRepository$exchangeOtp$1.label = 1;
                    k930 k930Var = this.a;
                    tt2 tt2Var = k930Var.b;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new MosmetroOtpRepositoryImpl$exchangeOtp$2(k930Var, str2, null), mosmetroOtpStateRepository$exchangeOtp$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) mosmetroOtpStateRepository$exchangeOtp$1.L$0;
                    b.b(obj);
                }
                mosmetroOtpError = (MosmetroOtpError) obj;
                if (mosmetroOtpError != null) {
                    do {
                        value3 = r0Var.getValue();
                    } while (!r0Var.k(value3, h930.a((h930) value3, null, null, false, null, false, 23)));
                    return null;
                }
                if (mosmetroOtpError instanceof MosmetroOtpError.InvalidOtpProvided) {
                    do {
                        value2 = r0Var.getValue();
                        h930Var = (h930) value2;
                        Integer num2 = h930Var.e;
                        if (num2 != null) {
                            int intValue = num2.intValue() - 1;
                            if (intValue < 0) {
                                intValue = 0;
                            }
                            num = new Integer(intValue);
                        } else {
                            num = null;
                        }
                    } while (!r0Var.k(value2, h930.a(h930Var, null, null, false, num, true, 7)));
                } else {
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, h930.a((h930) value, new l930(new m930(str3)), null, false, null, false, 54)));
                }
                return mosmetroOtpError;
            }
        }
        mosmetroOtpStateRepository$exchangeOtp$1 = new MosmetroOtpStateRepository$exchangeOtp$1(this, continuationImpl);
        Object obj2 = mosmetroOtpStateRepository$exchangeOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOtpStateRepository$exchangeOtp$1.label;
        r0 r0Var2 = this.b;
        if (i != 0) {
        }
        mosmetroOtpError = (MosmetroOtpError) obj2;
        if (mosmetroOtpError != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[LOOP:0: B:12:0x0067->B:21:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[LOOP:1: B:23:0x008f->B:26:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MosmetroOtpStateRepository$loadInit$1 mosmetroOtpStateRepository$loadInit$1;
        int i;
        Object value;
        g930 g930Var;
        Object value2;
        Object value3;
        q930 q930Var;
        Integer num;
        if (continuationImpl instanceof MosmetroOtpStateRepository$loadInit$1) {
            mosmetroOtpStateRepository$loadInit$1 = (MosmetroOtpStateRepository$loadInit$1) continuationImpl;
            int i2 = mosmetroOtpStateRepository$loadInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOtpStateRepository$loadInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mosmetroOtpStateRepository$loadInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOtpStateRepository$loadInit$1.label;
                r0 r0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, h930.a((h930) value, p930.a, null, false, null, false, 62)));
                    mosmetroOtpStateRepository$loadInit$1.label = 1;
                    k930 k930Var = this.a;
                    tt2 tt2Var = k930Var.b;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new MosmetroOtpRepositoryImpl$initOtp$2(k930Var, null), mosmetroOtpStateRepository$loadInit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                g930Var = (g930) obj;
                if (g930Var == null) {
                    do {
                        value3 = r0Var.getValue();
                        h930 h930Var = (h930) value3;
                        q930Var = new q930(g930Var);
                        j930 j930Var = g930Var.b;
                        num = j930Var != null ? j930Var.a : null;
                        h930Var.getClass();
                    } while (!r0Var.k(value3, new h930(q930Var, g930Var, "", false, num, false)));
                } else {
                    do {
                        value2 = r0Var.getValue();
                    } while (!r0Var.k(value2, h930.a((h930) value2, new l930(n930.a), null, false, null, false, 54)));
                }
                return zy11.a;
            }
        }
        mosmetroOtpStateRepository$loadInit$1 = new MosmetroOtpStateRepository$loadInit$1(this, continuationImpl);
        Object obj2 = mosmetroOtpStateRepository$loadInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOtpStateRepository$loadInit$1.label;
        r0 r0Var2 = this.b;
        if (i != 0) {
        }
        g930Var = (g930) obj2;
        if (g930Var == null) {
        }
        return zy11.a;
    }
}
