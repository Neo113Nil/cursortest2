package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.domain;

import com.ybsdk.di.modules.features.t;
import defpackage.d6v;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a implements d6v {
    public final /* synthetic */ com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.a a;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a b;
    public final com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a c;
    public final t w;

    public a(com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a aVar, com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a aVar2, com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.a aVar3, t tVar) {
        this.a = aVar3;
        this.b = aVar;
        this.c = aVar2;
        this.w = tVar;
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
        Me2mConfirmPullInteractor$autoPullConfirm$1 me2mConfirmPullInteractor$autoPullConfirm$1;
        int i;
        if (continuationImpl instanceof Me2mConfirmPullInteractor$autoPullConfirm$1) {
            me2mConfirmPullInteractor$autoPullConfirm$1 = (Me2mConfirmPullInteractor$autoPullConfirm$1) continuationImpl;
            int i2 = me2mConfirmPullInteractor$autoPullConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2mConfirmPullInteractor$autoPullConfirm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = me2mConfirmPullInteractor$autoPullConfirm$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2mConfirmPullInteractor$autoPullConfirm$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                wls me2mConfirmPullInteractor$autoPullConfirm$2 = new Me2mConfirmPullInteractor$autoPullConfirm$2(this, str, str2, str3, null);
                me2mConfirmPullInteractor$autoPullConfirm$1.label = 1;
                Object O = O(me2mConfirmPullInteractor$autoPullConfirm$2, str, me2mConfirmPullInteractor$autoPullConfirm$1);
                return O == obj2 ? obj2 : O;
            }
        }
        me2mConfirmPullInteractor$autoPullConfirm$1 = new Me2mConfirmPullInteractor$autoPullConfirm$1(this, continuationImpl);
        Object obj3 = me2mConfirmPullInteractor$autoPullConfirm$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2mConfirmPullInteractor$autoPullConfirm$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1 me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1;
        int i;
        Object obj;
        com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a aVar;
        if (continuationImpl instanceof Me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1) {
            me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1 = (Me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1) continuationImpl;
            int i2 = me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label;
                if (i != 0) {
                    b.b(obj2);
                    com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a aVar2 = this.b;
                    me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$0 = aVar2;
                    me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$1 = str;
                    me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label = 1;
                    Object a = this.w.a(me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        aVar = aVar2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$1;
                aVar = (com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a) me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$0;
                b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$0 = null;
                me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$1 = null;
                me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label = 2;
                Object a2 = aVar.a(str, (String) obj, me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1 = new Me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1(this, continuationImpl);
        Object obj22 = me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$0 = null;
        me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.L$1 = null;
        me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1.label = 2;
        Object a22 = aVar.a(str, (String) obj, me2mConfirmPullInteractor$getMe2MeDebitConfirmPull$1);
        if (a22 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.a.b.i(str);
    }
}
