package com.yandex.go.scooters.misc.attention.domain;

import android.graphics.drawable.BitmapDrawable;
import defpackage.kzm0;
import defpackage.ny61;
import defpackage.vym0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class c {
    public final e a;
    public final com.yandex.go.scooters.misc.attention.data.e b;

    public c(e eVar, com.yandex.go.scooters.misc.attention.data.e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, vym0 vym0Var, ContinuationImpl continuationImpl) {
        ScootersAttentionUiActionsInteractor$toUiState$1 scootersAttentionUiActionsInteractor$toUiState$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof ScootersAttentionUiActionsInteractor$toUiState$1) {
            scootersAttentionUiActionsInteractor$toUiState$1 = (ScootersAttentionUiActionsInteractor$toUiState$1) continuationImpl;
            int i2 = scootersAttentionUiActionsInteractor$toUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAttentionUiActionsInteractor$toUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersAttentionUiActionsInteractor$toUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAttentionUiActionsInteractor$toUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = cVar.a;
                    String str = vym0Var.d;
                    scootersAttentionUiActionsInteractor$toUiState$1.L$0 = null;
                    scootersAttentionUiActionsInteractor$toUiState$1.L$1 = vym0Var;
                    scootersAttentionUiActionsInteractor$toUiState$1.label = 1;
                    obj = e.f(eVar, str, null, scootersAttentionUiActionsInteractor$toUiState$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vym0Var = (vym0) scootersAttentionUiActionsInteractor$toUiState$1.L$1;
                    kotlin.b.b(obj);
                }
                return new kzm0(vym0Var, (BitmapDrawable) obj);
            }
        }
        scootersAttentionUiActionsInteractor$toUiState$1 = new ScootersAttentionUiActionsInteractor$toUiState$1(cVar, continuationImpl);
        Object obj2 = scootersAttentionUiActionsInteractor$toUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAttentionUiActionsInteractor$toUiState$1.label;
        if (i != 0) {
        }
        return new kzm0(vym0Var, (BitmapDrawable) obj2);
    }
}
