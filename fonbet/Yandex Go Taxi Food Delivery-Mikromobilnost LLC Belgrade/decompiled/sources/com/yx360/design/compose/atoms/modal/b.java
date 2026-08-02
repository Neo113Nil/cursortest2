package com.yx360.design.compose.atoms.modal;

import androidx.compose.foundation.gestures.e;
import defpackage.gn50;
import defpackage.k631;
import defpackage.m810;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes4.dex */
public final class b implements gn50 {
    public final e a;

    public b(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ModalNestedScrollConnection$onPostFling$1 modalNestedScrollConnection$onPostFling$1;
        int i;
        if (continuation instanceof ModalNestedScrollConnection$onPostFling$1) {
            modalNestedScrollConnection$onPostFling$1 = (ModalNestedScrollConnection$onPostFling$1) continuation;
            int i2 = modalNestedScrollConnection$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modalNestedScrollConnection$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = modalNestedScrollConnection$onPostFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalNestedScrollConnection$onPostFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    float d = k631.d(j2);
                    modalNestedScrollConnection$onPostFling$1.J$0 = j2;
                    modalNestedScrollConnection$onPostFling$1.label = 1;
                    if (this.a.i(d, modalNestedScrollConnection$onPostFling$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = modalNestedScrollConnection$onPostFling$1.J$0;
                    kotlin.b.b(obj);
                }
                return new k631(j2);
            }
        }
        modalNestedScrollConnection$onPostFling$1 = new ModalNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalNestedScrollConnection$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalNestedScrollConnection$onPostFling$1.label;
        if (i != 0) {
        }
        return new k631(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33onPreFlingQWom1Mo(long j, Continuation continuation) {
        ModalNestedScrollConnection$onPreFling$1 modalNestedScrollConnection$onPreFling$1;
        int i;
        if (continuation instanceof ModalNestedScrollConnection$onPreFling$1) {
            modalNestedScrollConnection$onPreFling$1 = (ModalNestedScrollConnection$onPreFling$1) continuation;
            int i2 = modalNestedScrollConnection$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modalNestedScrollConnection$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = modalNestedScrollConnection$onPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalNestedScrollConnection$onPreFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    float d = k631.d(j);
                    e eVar = this.a;
                    float g = eVar.g();
                    float e = eVar.d().e();
                    if (d >= 0.0f || g <= e) {
                        j = 0;
                    } else {
                        modalNestedScrollConnection$onPreFling$1.J$0 = j;
                        modalNestedScrollConnection$onPreFling$1.label = 1;
                        if (eVar.i(d, modalNestedScrollConnection$onPreFling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = modalNestedScrollConnection$onPreFling$1.J$0;
                    kotlin.b.b(obj);
                }
                return new k631(j);
            }
        }
        modalNestedScrollConnection$onPreFling$1 = new ModalNestedScrollConnection$onPreFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalNestedScrollConnection$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalNestedScrollConnection$onPreFling$1.label;
        if (i != 0) {
        }
        return new k631(j);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j));
        if (intBitsToFloat >= 0.0f) {
            return 0L;
        }
        e eVar = this.a;
        if (m810.b(eVar.j.getFloatValue()) <= 0) {
            return 0L;
        }
        eVar.c(intBitsToFloat);
        return j;
    }
}
