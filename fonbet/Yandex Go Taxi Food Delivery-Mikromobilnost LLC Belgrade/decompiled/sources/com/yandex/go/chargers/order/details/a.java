package com.yandex.go.chargers.order.details;

import defpackage.bca;
import defpackage.cca;
import defpackage.ny61;
import defpackage.qba;
import defpackage.rba;
import defpackage.sba;
import defpackage.tba;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class a {
    public final ru.yandex.taxi.widget.c a;

    public a(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r12 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r12 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tba tbaVar, ContinuationImpl continuationImpl) {
        ChargersOrderDetailsMapper$mapToUiStateModel$1 chargersOrderDetailsMapper$mapToUiStateModel$1;
        int i;
        CharSequence charSequence;
        aVar.getClass();
        if (continuationImpl instanceof ChargersOrderDetailsMapper$mapToUiStateModel$1) {
            chargersOrderDetailsMapper$mapToUiStateModel$1 = (ChargersOrderDetailsMapper$mapToUiStateModel$1) continuationImpl;
            int i2 = chargersOrderDetailsMapper$mapToUiStateModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderDetailsMapper$mapToUiStateModel$1.label = i2 - Integer.MIN_VALUE;
                ChargersOrderDetailsMapper$mapToUiStateModel$1 chargersOrderDetailsMapper$mapToUiStateModel$12 = chargersOrderDetailsMapper$mapToUiStateModel$1;
                Object obj = chargersOrderDetailsMapper$mapToUiStateModel$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderDetailsMapper$mapToUiStateModel$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (tbaVar instanceof sba) {
                        return null;
                    }
                    if (tbaVar instanceof qba) {
                        ru.yandex.taxi.widget.c cVar = aVar.a;
                        FormattedText formattedText = ((qba) tbaVar).a;
                        chargersOrderDetailsMapper$mapToUiStateModel$12.L$0 = null;
                        chargersOrderDetailsMapper$mapToUiStateModel$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, chargersOrderDetailsMapper$mapToUiStateModel$12, 30);
                    } else {
                        if (!(tbaVar instanceof rba)) {
                            w511.b();
                            return null;
                        }
                        ru.yandex.taxi.widget.c cVar2 = aVar.a;
                        FormattedText formattedText2 = ((rba) tbaVar).a;
                        chargersOrderDetailsMapper$mapToUiStateModel$12.L$0 = tbaVar;
                        chargersOrderDetailsMapper$mapToUiStateModel$12.label = 2;
                        obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, chargersOrderDetailsMapper$mapToUiStateModel$12, 30);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return new bca((CharSequence) obj);
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) chargersOrderDetailsMapper$mapToUiStateModel$12.L$1;
                    kotlin.b.b(obj);
                    return new cca(charSequence, (CharSequence) obj);
                }
                tbaVar = (tba) chargersOrderDetailsMapper$mapToUiStateModel$12.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar3 = aVar.a;
                FormattedText formattedText3 = ((rba) tbaVar).b;
                chargersOrderDetailsMapper$mapToUiStateModel$12.L$0 = null;
                chargersOrderDetailsMapper$mapToUiStateModel$12.L$1 = charSequence2;
                chargersOrderDetailsMapper$mapToUiStateModel$12.label = 3;
                Object e = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, chargersOrderDetailsMapper$mapToUiStateModel$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new cca(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        chargersOrderDetailsMapper$mapToUiStateModel$1 = new ChargersOrderDetailsMapper$mapToUiStateModel$1(aVar, continuationImpl);
        ChargersOrderDetailsMapper$mapToUiStateModel$1 chargersOrderDetailsMapper$mapToUiStateModel$122 = chargersOrderDetailsMapper$mapToUiStateModel$1;
        Object obj2 = chargersOrderDetailsMapper$mapToUiStateModel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderDetailsMapper$mapToUiStateModel$122.label;
        if (i != 0) {
        }
    }
}
