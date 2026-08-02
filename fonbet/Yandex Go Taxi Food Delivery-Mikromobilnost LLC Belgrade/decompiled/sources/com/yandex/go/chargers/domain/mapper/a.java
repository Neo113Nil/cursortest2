package com.yandex.go.chargers.domain.mapper;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import defpackage.ny61;
import defpackage.tn9;
import defpackage.xng0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final e a;
    public final c b;

    public a(c cVar, e eVar) {
        this.a = eVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersAttributeDto chargersAttributeDto, ContinuationImpl continuationImpl) {
        ChargersAttributeMapper$map$1 chargersAttributeMapper$map$1;
        int i;
        if (continuationImpl instanceof ChargersAttributeMapper$map$1) {
            chargersAttributeMapper$map$1 = (ChargersAttributeMapper$map$1) continuationImpl;
            int i2 = chargersAttributeMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAttributeMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAttributeMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAttributeMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersAttributeDto.a;
                    chargersAttributeMapper$map$1.L$0 = chargersAttributeDto;
                    chargersAttributeMapper$map$1.label = 1;
                    obj = c.i(this.b, formattedText, null, chargersAttributeMapper$map$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chargersAttributeDto = (ChargersAttributeDto) chargersAttributeMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                String str = chargersAttributeDto.b;
                return new tn9(this.a.b(xng0.bgTransparent, str), (CharSequence) obj);
            }
        }
        chargersAttributeMapper$map$1 = new ChargersAttributeMapper$map$1(this, continuationImpl);
        Object obj2 = chargersAttributeMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAttributeMapper$map$1.label;
        if (i != 0) {
        }
        String str2 = chargersAttributeDto.b;
        return new tn9(this.a.b(xng0.bgTransparent, str2), (CharSequence) obj2);
    }
}
