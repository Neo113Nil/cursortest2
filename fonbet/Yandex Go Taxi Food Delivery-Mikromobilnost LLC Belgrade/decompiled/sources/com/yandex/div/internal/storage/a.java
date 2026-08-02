package com.yandex.div.internal.storage;

import defpackage.ny61;
import defpackage.opg;
import defpackage.ppg;
import defpackage.qpg;
import defpackage.rpg;
import defpackage.spg;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes11.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DataStorage$special$$inlined$map$1$2$1 dataStorage$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DataStorage$special$$inlined$map$1$2$1) {
            dataStorage$special$$inlined$map$1$2$1 = (DataStorage$special$$inlined$map$1$2$1) continuation;
            int i2 = dataStorage$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStorage$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dataStorage$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStorage$special$$inlined$map$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    spg spgVar = (spg) obj;
                    if (!(spgVar instanceof ppg)) {
                        if (spgVar instanceof qpg) {
                            obj3 = ((qpg) spgVar).a;
                        } else if (!(spgVar instanceof rpg)) {
                            if (spgVar instanceof opg) {
                                ny61.r("Cannot read from closed storage");
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                    }
                    dataStorage$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, dataStorage$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        dataStorage$special$$inlined$map$1$2$1 = new DataStorage$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = dataStorage$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStorage$special$$inlined$map$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
