package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import com.ybsdk.core.utils.d;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultScreenParams;
import com.ybsdk.utils.poller.b;
import defpackage.ag1;
import defpackage.d6v;
import defpackage.fi9;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes3.dex */
public final class a implements d6v {
    public final /* synthetic */ com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a a;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a b;
    public final Me2MeDebitResultScreenParams c;
    public final ag1 w;
    public final b x;

    public a(com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a aVar, com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.a aVar2, Me2MeDebitResultScreenParams me2MeDebitResultScreenParams, ag1 ag1Var, b bVar) {
        this.a = aVar2;
        this.b = aVar;
        this.c = me2MeDebitResultScreenParams;
        this.w = ag1Var;
        this.x = bVar;
    }

    @Override // defpackage.d6v
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        Object B = this.a.B(obj, slsVar, tlsVar, wlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return B;
    }

    @Override // defpackage.d6v
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        Object O = this.a.O(wlsVar, obj, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return O;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Me2MeDebitResultInteractor$autoPullConfirm$1 me2MeDebitResultInteractor$autoPullConfirm$1;
        int i;
        if (continuationImpl instanceof Me2MeDebitResultInteractor$autoPullConfirm$1) {
            me2MeDebitResultInteractor$autoPullConfirm$1 = (Me2MeDebitResultInteractor$autoPullConfirm$1) continuationImpl;
            int i2 = me2MeDebitResultInteractor$autoPullConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2MeDebitResultInteractor$autoPullConfirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2MeDebitResultInteractor$autoPullConfirm$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2MeDebitResultInteractor$autoPullConfirm$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wls me2MeDebitResultInteractor$autoPullConfirm$2 = new Me2MeDebitResultInteractor$autoPullConfirm$2(this, str, str2, str3, null);
                me2MeDebitResultInteractor$autoPullConfirm$1.label = 1;
                Object O = O(me2MeDebitResultInteractor$autoPullConfirm$2, "confirm", me2MeDebitResultInteractor$autoPullConfirm$1);
                return O == obj2 ? obj2 : O;
            }
        }
        me2MeDebitResultInteractor$autoPullConfirm$1 = new Me2MeDebitResultInteractor$autoPullConfirm$1(this, continuationImpl);
        Object obj3 = me2MeDebitResultInteractor$autoPullConfirm$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2MeDebitResultInteractor$autoPullConfirm$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Me2MeDebitResultInteractor$autoPullDelete$1 me2MeDebitResultInteractor$autoPullDelete$1;
        int i;
        if (continuationImpl instanceof Me2MeDebitResultInteractor$autoPullDelete$1) {
            me2MeDebitResultInteractor$autoPullDelete$1 = (Me2MeDebitResultInteractor$autoPullDelete$1) continuationImpl;
            int i2 = me2MeDebitResultInteractor$autoPullDelete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2MeDebitResultInteractor$autoPullDelete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2MeDebitResultInteractor$autoPullDelete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2MeDebitResultInteractor$autoPullDelete$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    me2MeDebitResultInteractor$autoPullDelete$1.label = 1;
                    Object b = this.b.b(str, me2MeDebitResultInteractor$autoPullDelete$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        me2MeDebitResultInteractor$autoPullDelete$1 = new Me2MeDebitResultInteractor$autoPullDelete$1(this, continuationImpl);
        Object obj2 = me2MeDebitResultInteractor$autoPullDelete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2MeDebitResultInteractor$autoPullDelete$1.label;
        if (i != 0) {
        }
    }

    public final fi9 c(String str) {
        return e.i(new Me2MeDebitResultInteractor$getMe2MeDebitResults$1(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        Me2MeDebitResultInteractor$getMe2MeTransferId$1 me2MeDebitResultInteractor$getMe2MeTransferId$1;
        int i;
        if (continuationImpl instanceof Me2MeDebitResultInteractor$getMe2MeTransferId$1) {
            me2MeDebitResultInteractor$getMe2MeTransferId$1 = (Me2MeDebitResultInteractor$getMe2MeTransferId$1) continuationImpl;
            int i2 = me2MeDebitResultInteractor$getMe2MeTransferId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2MeDebitResultInteractor$getMe2MeTransferId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2MeDebitResultInteractor$getMe2MeTransferId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2MeDebitResultInteractor$getMe2MeTransferId$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Me2MeDebitResultInteractor$getMe2MeTransferId$2 me2MeDebitResultInteractor$getMe2MeTransferId$2 = new Me2MeDebitResultInteractor$getMe2MeTransferId$2(this, str, str2, null);
                me2MeDebitResultInteractor$getMe2MeTransferId$1.label = 1;
                Object a = d.a(this, me2MeDebitResultInteractor$getMe2MeTransferId$2, me2MeDebitResultInteractor$getMe2MeTransferId$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        me2MeDebitResultInteractor$getMe2MeTransferId$1 = new Me2MeDebitResultInteractor$getMe2MeTransferId$1(this, continuationImpl);
        Object obj2 = me2MeDebitResultInteractor$getMe2MeTransferId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2MeDebitResultInteractor$getMe2MeTransferId$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.a.b.i(str);
    }
}
