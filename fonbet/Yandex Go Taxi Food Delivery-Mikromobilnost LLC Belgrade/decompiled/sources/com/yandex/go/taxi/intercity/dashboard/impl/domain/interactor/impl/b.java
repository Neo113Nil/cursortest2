package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityTariffSelectorItemPriceInfo$PriceOrigin;
import defpackage.b8r;
import defpackage.fef;
import defpackage.fpw;
import defpackage.jhw;
import defpackage.jpw;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qze0;
import defpackage.xdf;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class b implements jhw {
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a a;
    public final ru.yandex.taxi.widget.c b;
    public final b8r c;
    public final xdf d;

    public b(com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, ru.yandex.taxi.widget.c cVar, b8r b8rVar, xdf xdfVar) {
        this.a = aVar;
        this.b = cVar;
        this.c = b8rVar;
        this.d = xdfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1 intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1;
        int i;
        Object obj;
        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
        FormattedText formattedText;
        qze0 qze0Var;
        pex0 pex0Var;
        fpw fpwVar;
        fpw fpwVar2;
        Object e;
        CharSequence charSequence;
        fpw fpwVar3;
        String str2;
        if (continuationImpl instanceof IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1) {
            intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1 = (IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1) continuationImpl;
            int i2 = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1.label = i2 - Integer.MIN_VALUE;
                IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1 intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12 = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1;
                Object obj2 = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mi31 d = b8r.d(this.c, str, null, 6);
                    qze0 qze0Var2 = (d == null || (pex0Var = d.a) == null) ? null : pex0Var.m;
                    fef fefVar = qze0Var2 != null ? qze0Var2.c : null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$0 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$1 = qze0Var2;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.label = 1;
                    IntercityDashboardResponseDto intercityDashboardResponseDto = this.a.a().c;
                    if (intercityDashboardResponseDto == null) {
                        intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = null;
                    } else {
                        Iterator it = intercityDashboardResponseDto.d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((i0) obj) instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) {
                                break;
                            }
                        }
                        if (!(obj instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity)) {
                            obj = null;
                        }
                        intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) obj;
                    }
                    IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.FallbackSelectorItem fallbackSelectorItem = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity != null ? intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.c : null;
                    if (fefVar == null) {
                        fefVar = fef.e;
                    }
                    MapBuilder f = this.d.f(fefVar);
                    if (fallbackSelectorItem == null || (formattedText = fallbackSelectorItem.a) == null) {
                        formattedText = FormattedText.c;
                    }
                    Object e2 = ru.yandex.taxi.widget.c.e(this.b, formattedText, f, false, intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12, 28);
                    if (e2 != coroutineSingletons) {
                        qze0Var = qze0Var2;
                        obj2 = e2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str3 = (String) intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$5;
                        CharSequence charSequence2 = (CharSequence) intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$4;
                        fpwVar3 = (fpw) intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$3;
                        kotlin.b.b(obj2);
                        str2 = str3;
                        charSequence = charSequence2;
                        return new jpw(charSequence, str2, (CharSequence) obj2, fpwVar3.b.b, IntercityTariffSelectorItemPriceInfo$PriceOrigin.ROUTE_STATS);
                    }
                    fpw fpwVar4 = (fpw) intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$3;
                    kotlin.b.b(obj2);
                    fpwVar2 = fpwVar4;
                    CharSequence charSequence3 = (CharSequence) obj2;
                    String str4 = fpwVar2.a.b;
                    FormattedText formattedText2 = fpwVar2.b.a;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$0 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$1 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$2 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$3 = fpwVar2;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$4 = charSequence3;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$5 = str4;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.label = 3;
                    e = ru.yandex.taxi.widget.c.e(this.b, formattedText2, null, false, intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12, 30);
                    if (e != coroutineSingletons) {
                        charSequence = charSequence3;
                        fpwVar3 = fpwVar2;
                        str2 = str4;
                        obj2 = e;
                        return new jpw(charSequence, str2, (CharSequence) obj2, fpwVar3.b.b, IntercityTariffSelectorItemPriceInfo$PriceOrigin.ROUTE_STATS);
                    }
                    return coroutineSingletons;
                }
                qze0Var = (qze0) intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$1;
                kotlin.b.b(obj2);
                CharSequence charSequence4 = (CharSequence) obj2;
                fpwVar = qze0Var == null ? qze0Var.o : null;
                if (fpwVar != null) {
                    return new jpw(charSequence4, null, charSequence4, null, IntercityTariffSelectorItemPriceInfo$PriceOrigin.FALLBACK);
                }
                FormattedText formattedText3 = fpwVar.a.a;
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$0 = null;
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$1 = null;
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$2 = null;
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$3 = fpwVar;
                intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.label = 2;
                Object e3 = ru.yandex.taxi.widget.c.e(this.b, formattedText3, null, false, intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12, 30);
                if (e3 != coroutineSingletons) {
                    fpwVar2 = fpwVar;
                    obj2 = e3;
                    CharSequence charSequence32 = (CharSequence) obj2;
                    String str42 = fpwVar2.a.b;
                    FormattedText formattedText22 = fpwVar2.b.a;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$0 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$1 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$2 = null;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$3 = fpwVar2;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$4 = charSequence32;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.L$5 = str42;
                    intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12.label = 3;
                    e = ru.yandex.taxi.widget.c.e(this.b, formattedText22, null, false, intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$12, 30);
                    if (e != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1 = new IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1(this, continuationImpl);
        IntercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1 intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$122 = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$1;
        Object obj22 = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardPriceInteractorImpl$getPriceInfoByTariffClass$122.label;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj22;
        if (qze0Var == null) {
        }
        if (fpwVar != null) {
        }
    }
}
