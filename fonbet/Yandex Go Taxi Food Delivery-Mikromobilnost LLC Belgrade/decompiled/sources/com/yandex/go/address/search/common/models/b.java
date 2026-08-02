package com.yandex.go.address.search.common.models;

import defpackage.mrj;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ mrj x;

    public b(tpr tprVar, pv0 pv0Var, String str, boolean z, mrj mrjVar) {
        this.a = tprVar;
        this.b = pv0Var;
        this.c = str;
        this.w = z;
        this.x = mrjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1 addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1) {
            addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1 = (AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1) continuation;
            int i2 = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w, this.x);
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.L$0 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.L$1 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.L$2 = null;
                    addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1 = new AddressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressTextsSource$titleAndHintSourceFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
