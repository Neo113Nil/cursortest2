package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.station.data.model.ChargersStationShortInfoDto;
import defpackage.fqa;
import defpackage.gqa;
import defpackage.k7x0;
import defpackage.kqa;
import defpackage.m7x0;
import defpackage.mqa;
import defpackage.nqa;
import defpackage.ny61;
import defpackage.nya;
import defpackage.pqa;
import defpackage.qqa;
import defpackage.rxa;
import defpackage.tn9;
import defpackage.w511;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b {
    public final k7x0 a;
    public final c b;
    public final com.yandex.go.chargers.domain.mapper.a c;

    public b(k7x0 k7x0Var, c cVar, com.yandex.go.chargers.domain.mapper.a aVar) {
        this.a = k7x0Var;
        this.b = cVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersStationShortInfoDto chargersStationShortInfoDto, rxa rxaVar, ContinuationImpl continuationImpl) {
        ChargersStationShortInfoMapper$map$1 chargersStationShortInfoMapper$map$1;
        int i;
        kqa kqaVar;
        ChargersStationShortInfoDto chargersStationShortInfoDto2;
        String str;
        CharSequence charSequence;
        List list;
        CharSequence charSequence2;
        tn9 tn9Var;
        ChargersAttributeDto chargersAttributeDto;
        ChargersStationShortInfoDto chargersStationShortInfoDto3;
        qqa qqaVar;
        if (continuationImpl instanceof ChargersStationShortInfoMapper$map$1) {
            chargersStationShortInfoMapper$map$1 = (ChargersStationShortInfoMapper$map$1) continuationImpl;
            int i2 = chargersStationShortInfoMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationShortInfoMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationShortInfoMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationShortInfoMapper$map$1.label;
                kqaVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chargersStationShortInfoDto != null) {
                        FormattedText formattedText = chargersStationShortInfoDto.a;
                        if (!formattedText.a.isEmpty()) {
                            String str2 = chargersStationShortInfoDto.b;
                            String a = str2 != null ? ((m7x0) this.a).a(str2) : null;
                            chargersStationShortInfoMapper$map$1.L$0 = chargersStationShortInfoDto;
                            chargersStationShortInfoMapper$map$1.L$1 = rxaVar;
                            chargersStationShortInfoMapper$map$1.L$2 = a;
                            chargersStationShortInfoMapper$map$1.label = 1;
                            obj = c.i(this.b, formattedText, null, chargersStationShortInfoMapper$map$1, 30);
                            if (obj != coroutineSingletons) {
                                String str3 = a;
                                chargersStationShortInfoDto2 = chargersStationShortInfoDto;
                                str = str3;
                            }
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) chargersStationShortInfoMapper$map$1.L$4;
                    str = (String) chargersStationShortInfoMapper$map$1.L$3;
                    rxaVar = (rxa) chargersStationShortInfoMapper$map$1.L$1;
                    chargersStationShortInfoDto3 = (ChargersStationShortInfoDto) chargersStationShortInfoMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    tn9Var = (tn9) obj;
                    chargersStationShortInfoDto2 = chargersStationShortInfoDto3;
                    qqaVar = chargersStationShortInfoDto2.d;
                    if (qqaVar != null) {
                        if (qqaVar.equals(mqa.INSTANCE)) {
                            if (rxaVar != null) {
                                kqaVar = new gqa(rxaVar);
                            }
                        } else if (qqaVar.equals(nqa.INSTANCE)) {
                            kqaVar = fqa.a;
                        } else if (!qqaVar.equals(pqa.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                    }
                    return new nya(str, charSequence2, tn9Var, kqaVar);
                }
                str = (String) chargersStationShortInfoMapper$map$1.L$2;
                rxaVar = (rxa) chargersStationShortInfoMapper$map$1.L$1;
                chargersStationShortInfoDto2 = (ChargersStationShortInfoDto) chargersStationShortInfoMapper$map$1.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                list = chargersStationShortInfoDto2.c;
                if (list != null || (chargersAttributeDto = (ChargersAttributeDto) kotlin.collections.a.R(list)) == null) {
                    charSequence2 = charSequence;
                    tn9Var = null;
                    qqaVar = chargersStationShortInfoDto2.d;
                    if (qqaVar != null) {
                    }
                    return new nya(str, charSequence2, tn9Var, kqaVar);
                }
                chargersStationShortInfoMapper$map$1.L$0 = chargersStationShortInfoDto2;
                chargersStationShortInfoMapper$map$1.L$1 = rxaVar;
                chargersStationShortInfoMapper$map$1.L$2 = null;
                chargersStationShortInfoMapper$map$1.L$3 = str;
                chargersStationShortInfoMapper$map$1.L$4 = charSequence;
                chargersStationShortInfoMapper$map$1.label = 2;
                Object a2 = this.c.a(chargersAttributeDto, chargersStationShortInfoMapper$map$1);
                if (a2 != coroutineSingletons) {
                    obj = a2;
                    charSequence2 = charSequence;
                    chargersStationShortInfoDto3 = chargersStationShortInfoDto2;
                    tn9Var = (tn9) obj;
                    chargersStationShortInfoDto2 = chargersStationShortInfoDto3;
                    qqaVar = chargersStationShortInfoDto2.d;
                    if (qqaVar != null) {
                    }
                    return new nya(str, charSequence2, tn9Var, kqaVar);
                }
                return coroutineSingletons;
            }
        }
        chargersStationShortInfoMapper$map$1 = new ChargersStationShortInfoMapper$map$1(this, continuationImpl);
        Object obj2 = chargersStationShortInfoMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationShortInfoMapper$map$1.label;
        kqaVar = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        list = chargersStationShortInfoDto2.c;
        if (list != null) {
        }
        charSequence2 = charSequence;
        tn9Var = null;
        qqaVar = chargersStationShortInfoDto2.d;
        if (qqaVar != null) {
        }
        return new nya(str, charSequence2, tn9Var, kqaVar);
    }
}
