package com.yandex.go.scooters.passes.active.v3.freeze;

import defpackage.ny61;
import defpackage.trm0;
import defpackage.wum0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;

    public d(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, wum0 wum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1 scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        CharSequence charSequence3;
        dVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1) {
            scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1 = (ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1) continuationImpl;
            int i2 = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1 scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12 = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1;
                Object obj = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = dVar.a;
                    FormattedText formattedText2 = wum0Var.a;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$0 = wum0Var;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText2, null, false, scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$2;
                        wum0Var = (wum0) scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        if (charSequence3 == null) {
                            charSequence = charSequence2;
                            CharSequence charSequence4 = charSequence;
                            charSequence3 = "";
                            charSequence2 = charSequence4;
                        }
                        return new trm0(charSequence2, charSequence3, wum0Var.c);
                    }
                    wum0Var = (wum0) scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = wum0Var.b;
                if (formattedText != null) {
                    ru.yandex.taxi.widget.c cVar2 = dVar.a;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$0 = wum0Var;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$1 = null;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.L$2 = charSequence;
                    scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12.label = 2;
                    Object e = ru.yandex.taxi.widget.c.e(cVar2, formattedText, null, false, scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$12, 30);
                    if (e != coroutineSingletons) {
                        obj = e;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        if (charSequence3 == null) {
                        }
                        return new trm0(charSequence2, charSequence3, wum0Var.c);
                    }
                    return coroutineSingletons;
                }
                CharSequence charSequence42 = charSequence;
                charSequence3 = "";
                charSequence2 = charSequence42;
                return new trm0(charSequence2, charSequence3, wum0Var.c);
            }
        }
        scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1 = new ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1(dVar, continuationImpl);
        ScootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1 scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$122 = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$1;
        Object obj2 = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3FreezeUiStateMapper$mapToDetailsItem$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = wum0Var.b;
        if (formattedText != null) {
        }
        CharSequence charSequence422 = charSequence;
        charSequence3 = "";
        charSequence2 = charSequence422;
        return new trm0(charSequence2, charSequence3, wum0Var.c);
    }
}
