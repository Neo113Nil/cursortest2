package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear;
import com.yandex.go.chargers.station.data.model.f;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffModalDto;
import defpackage.ara;
import defpackage.bvf0;
import defpackage.fra;
import defpackage.hqa;
import defpackage.hwa;
import defpackage.iqa;
import defpackage.iya;
import defpackage.jl40;
import defpackage.jqa;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.oma;
import defpackage.rqa;
import defpackage.rxa;
import defpackage.sqa;
import defpackage.swa;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uj9;
import defpackage.uo9;
import defpackage.uqa;
import defpackage.w511;
import defpackage.wqa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final k7x0 a;
    public final iya b;
    public final e c;
    public final com.yandex.go.chargers.domain.mapper.b d;
    public final com.yandex.go.chargers.surge.domain.a e;
    public final c f;
    public final b g;

    public a(k7x0 k7x0Var, iya iyaVar, e eVar, com.yandex.go.chargers.domain.mapper.b bVar, com.yandex.go.chargers.surge.domain.a aVar, c cVar, b bVar2) {
        this.a = k7x0Var;
        this.b = iyaVar;
        this.c = eVar;
        this.d = bVar;
        this.e = aVar;
        this.f = cVar;
        this.g = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r15 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, ChargersStationDetailsResponse chargersStationDetailsResponse, ContinuationImpl continuationImpl) {
        ChargersStationDetailsMapper$prepareAboutLocation$1 chargersStationDetailsMapper$prepareAboutLocation$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list;
        f fVar;
        Object b;
        List list2;
        f fVar2;
        aVar.getClass();
        if (continuationImpl instanceof ChargersStationDetailsMapper$prepareAboutLocation$1) {
            chargersStationDetailsMapper$prepareAboutLocation$1 = (ChargersStationDetailsMapper$prepareAboutLocation$1) continuationImpl;
            int i2 = chargersStationDetailsMapper$prepareAboutLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsMapper$prepareAboutLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsMapper$prepareAboutLocation$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsMapper$prepareAboutLocation$1.label;
                EmptyList emptyList = EmptyList.a;
                List list3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChargersStationDetailsResponse.AboutLocation aboutLocation = chargersStationDetailsResponse.c;
                    List list4 = aboutLocation != null ? aboutLocation.a : null;
                    list = aboutLocation != null ? aboutLocation.b : null;
                    fVar = aboutLocation != null ? aboutLocation.c : null;
                    if (list4 == null && list == null && fVar == null) {
                        return null;
                    }
                    chargersStationDetailsMapper$prepareAboutLocation$1.L$0 = tseVar;
                    chargersStationDetailsMapper$prepareAboutLocation$1.L$1 = null;
                    chargersStationDetailsMapper$prepareAboutLocation$1.L$2 = null;
                    chargersStationDetailsMapper$prepareAboutLocation$1.L$3 = list;
                    chargersStationDetailsMapper$prepareAboutLocation$1.L$4 = fVar;
                    chargersStationDetailsMapper$prepareAboutLocation$1.label = 1;
                    if (list4 == null) {
                        obj = emptyList;
                    } else {
                        List list5 = list4;
                        ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(tje.h(tseVar, null, null, new ChargersStationDetailsMapper$prepareDescriptions$2$1(aVar, (FormattedText) it.next(), null), 3));
                        }
                        obj = kotlinx.coroutines.a.b(arrayList, chargersStationDetailsMapper$prepareAboutLocation$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = (List) chargersStationDetailsMapper$prepareAboutLocation$1.L$5;
                        fVar2 = (f) chargersStationDetailsMapper$prepareAboutLocation$1.L$4;
                        kotlin.b.b(obj);
                        List list6 = (List) obj;
                        if (!(fVar2 instanceof ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear)) {
                            list3 = ((ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear) fVar2).a;
                        } else if (fVar2 != null) {
                            w511.b();
                            return null;
                        }
                        return new ara(list2, list6, list3);
                    }
                    f fVar3 = (f) chargersStationDetailsMapper$prepareAboutLocation$1.L$4;
                    List list7 = (List) chargersStationDetailsMapper$prepareAboutLocation$1.L$3;
                    tse tseVar2 = (tse) chargersStationDetailsMapper$prepareAboutLocation$1.L$0;
                    kotlin.b.b(obj);
                    fVar = fVar3;
                    tseVar = tseVar2;
                    list = list7;
                }
                List list8 = (List) obj;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$0 = null;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$1 = null;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$2 = null;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$3 = null;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$4 = fVar;
                chargersStationDetailsMapper$prepareAboutLocation$1.L$5 = list8;
                chargersStationDetailsMapper$prepareAboutLocation$1.label = 2;
                if (list != null) {
                    b = emptyList;
                } else {
                    List list9 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list9, 10));
                    Iterator it2 = list9.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(tje.h(tseVar, null, null, new ChargersStationDetailsMapper$prepareBricks$2$1(aVar, (ChargersStationDetailsResponse.AboutLocation.DetailsBrick) it2.next(), null), 3));
                    }
                    b = kotlinx.coroutines.a.b(arrayList2, chargersStationDetailsMapper$prepareAboutLocation$1);
                }
                if (b != coroutineSingletons) {
                    obj = b;
                    list2 = list8;
                    fVar2 = fVar;
                    List list62 = (List) obj;
                    if (!(fVar2 instanceof ChargersStationDetailsResponse$AboutLocation$PhotoGallery$Linear)) {
                    }
                    return new ara(list2, list62, list3);
                }
                return coroutineSingletons;
            }
        }
        chargersStationDetailsMapper$prepareAboutLocation$1 = new ChargersStationDetailsMapper$prepareAboutLocation$1(aVar, continuationImpl);
        Object obj2 = chargersStationDetailsMapper$prepareAboutLocation$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsMapper$prepareAboutLocation$1.label;
        EmptyList emptyList2 = EmptyList.a;
        List list32 = null;
        if (i != 0) {
        }
        List list82 = (List) obj2;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$0 = null;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$1 = null;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$2 = null;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$3 = null;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$4 = fVar;
        chargersStationDetailsMapper$prepareAboutLocation$1.L$5 = list82;
        chargersStationDetailsMapper$prepareAboutLocation$1.label = 2;
        if (list != null) {
        }
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ChargersStationDetailsResponse chargersStationDetailsResponse, String str, ContinuationImpl continuationImpl) {
        ChargersStationDetailsMapper$prepareModalTariff$1 chargersStationDetailsMapper$prepareModalTariff$1;
        int i;
        ChargersTariffDto chargersTariffDto;
        ChargersTariffModalDto chargersTariffModalDto;
        swa swaVar;
        ChargersStationButtonDto chargersStationButtonDto;
        swa swaVar2;
        String str2;
        aVar.getClass();
        if (continuationImpl instanceof ChargersStationDetailsMapper$prepareModalTariff$1) {
            chargersStationDetailsMapper$prepareModalTariff$1 = (ChargersStationDetailsMapper$prepareModalTariff$1) continuationImpl;
            int i2 = chargersStationDetailsMapper$prepareModalTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsMapper$prepareModalTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsMapper$prepareModalTariff$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsMapper$prepareModalTariff$1.label;
                uo9 uo9Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.chargers.surge.domain.a aVar2 = aVar.e;
                    ChargersSurgeDto chargersSurgeDto = chargersStationDetailsResponse.m;
                    ChargersSurgeModalDto chargersSurgeModalDto = chargersSurgeDto != null ? chargersSurgeDto.d : null;
                    aVar2.getClass();
                    hwa b = com.yandex.go.chargers.surge.domain.a.b(chargersSurgeModalDto);
                    ChargersTariffModalDto chargersTariffModalDto2 = chargersStationDetailsResponse.h;
                    if (chargersTariffModalDto2 == null || (chargersTariffDto = chargersStationDetailsResponse.f) == null) {
                        return null;
                    }
                    ChargersTariffDto chargersTariffDto2 = chargersTariffModalDto2.a;
                    iya iyaVar = aVar.b;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$0 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$1 = str;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$2 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$3 = chargersTariffModalDto2;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$4 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$5 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.label = 1;
                    obj = ((com.yandex.go.chargers.tariff_item_info.b) iyaVar).b(chargersTariffDto, b, chargersTariffDto2, chargersStationDetailsMapper$prepareModalTariff$1);
                    if (obj != obj2) {
                        chargersTariffModalDto = chargersTariffModalDto2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    swaVar2 = (swa) chargersStationDetailsMapper$prepareModalTariff$1.L$8;
                    str2 = (String) chargersStationDetailsMapper$prepareModalTariff$1.L$1;
                    kotlin.b.b(obj);
                    uo9Var = (uo9) obj;
                    swaVar = swaVar2;
                    str = str2;
                    return new rxa(swaVar, uo9Var, str);
                }
                chargersTariffModalDto = (ChargersTariffModalDto) chargersStationDetailsMapper$prepareModalTariff$1.L$3;
                str = (String) chargersStationDetailsMapper$prepareModalTariff$1.L$1;
                kotlin.b.b(obj);
                swaVar = (swa) obj;
                chargersStationButtonDto = chargersTariffModalDto.b;
                if (chargersStationButtonDto != null) {
                    chargersStationDetailsMapper$prepareModalTariff$1.L$0 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$1 = str;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$2 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$3 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$4 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$5 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$6 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$7 = null;
                    chargersStationDetailsMapper$prepareModalTariff$1.L$8 = swaVar;
                    chargersStationDetailsMapper$prepareModalTariff$1.label = 2;
                    Object e = aVar.e(chargersStationButtonDto, chargersStationDetailsMapper$prepareModalTariff$1);
                    if (e != obj2) {
                        obj = e;
                        swaVar2 = swaVar;
                        str2 = str;
                        uo9Var = (uo9) obj;
                        swaVar = swaVar2;
                        str = str2;
                    }
                    return obj2;
                }
                return new rxa(swaVar, uo9Var, str);
            }
        }
        chargersStationDetailsMapper$prepareModalTariff$1 = new ChargersStationDetailsMapper$prepareModalTariff$1(aVar, continuationImpl);
        Object obj3 = chargersStationDetailsMapper$prepareModalTariff$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsMapper$prepareModalTariff$1.label;
        uo9 uo9Var2 = null;
        if (i != 0) {
        }
        swaVar = (swa) obj3;
        chargersStationButtonDto = chargersTariffModalDto.b;
        if (chargersStationButtonDto != null) {
        }
        return new rxa(swaVar, uo9Var2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, tse tseVar, ChargersStationDetailsResponse chargersStationDetailsResponse, ContinuationImpl continuationImpl) {
        ChargersStationDetailsMapper$prepareUsageInstruction$1 chargersStationDetailsMapper$prepareUsageInstruction$1;
        int i;
        List list;
        CharSequence charSequence;
        CharSequence charSequence2;
        aVar.getClass();
        if (continuationImpl instanceof ChargersStationDetailsMapper$prepareUsageInstruction$1) {
            chargersStationDetailsMapper$prepareUsageInstruction$1 = (ChargersStationDetailsMapper$prepareUsageInstruction$1) continuationImpl;
            int i2 = chargersStationDetailsMapper$prepareUsageInstruction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsMapper$prepareUsageInstruction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsMapper$prepareUsageInstruction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsMapper$prepareUsageInstruction$1.label;
                List list2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChargersStationDetailsResponse.UsageInstruction usageInstruction = chargersStationDetailsResponse.d;
                    FormattedText formattedText = usageInstruction != null ? usageInstruction.a : null;
                    list = usageInstruction != null ? usageInstruction.b : null;
                    if (formattedText == null && list == null) {
                        return null;
                    }
                    if (formattedText == null) {
                        charSequence = null;
                        if (list != null) {
                            List list3 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(tje.h(tseVar, null, null, new ChargersStationDetailsMapper$prepareUsageInstruction$3$1(aVar, (ChargersStationDetailsResponse.UsageInstruction.InstructionItem) it.next(), null), 3));
                            }
                            chargersStationDetailsMapper$prepareUsageInstruction$1.L$0 = null;
                            chargersStationDetailsMapper$prepareUsageInstruction$1.L$1 = null;
                            chargersStationDetailsMapper$prepareUsageInstruction$1.L$2 = null;
                            chargersStationDetailsMapper$prepareUsageInstruction$1.L$3 = null;
                            chargersStationDetailsMapper$prepareUsageInstruction$1.L$4 = charSequence;
                            chargersStationDetailsMapper$prepareUsageInstruction$1.label = 2;
                            Object b = kotlinx.coroutines.a.b(arrayList, chargersStationDetailsMapper$prepareUsageInstruction$1);
                            if (b != coroutineSingletons) {
                                CharSequence charSequence3 = charSequence;
                                obj = b;
                                charSequence2 = charSequence3;
                                list2 = (List) obj;
                                charSequence = charSequence2;
                            }
                            return coroutineSingletons;
                        }
                        return new fra(charSequence, list2);
                    }
                    c cVar = aVar.f;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.L$0 = tseVar;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.L$1 = null;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.L$2 = null;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.L$3 = list;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.L$4 = null;
                    chargersStationDetailsMapper$prepareUsageInstruction$1.label = 1;
                    obj = c.i(cVar, formattedText, null, chargersStationDetailsMapper$prepareUsageInstruction$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) chargersStationDetailsMapper$prepareUsageInstruction$1.L$4;
                        kotlin.b.b(obj);
                        list2 = (List) obj;
                        charSequence = charSequence2;
                        return new fra(charSequence, list2);
                    }
                    List list4 = (List) chargersStationDetailsMapper$prepareUsageInstruction$1.L$3;
                    tse tseVar2 = (tse) chargersStationDetailsMapper$prepareUsageInstruction$1.L$0;
                    kotlin.b.b(obj);
                    list = list4;
                    tseVar = tseVar2;
                }
                charSequence = (CharSequence) obj;
                if (list != null) {
                }
                return new fra(charSequence, list2);
            }
        }
        chargersStationDetailsMapper$prepareUsageInstruction$1 = new ChargersStationDetailsMapper$prepareUsageInstruction$1(aVar, continuationImpl);
        Object obj2 = chargersStationDetailsMapper$prepareUsageInstruction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsMapper$prepareUsageInstruction$1.label;
        List list22 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (list != null) {
        }
        return new fra(charSequence, list22);
    }

    public final Object d(ChargersStationDetailsResponse chargersStationDetailsResponse, String str, Continuation continuation) {
        return bvf0.n(new ChargersStationDetailsMapper$mapToChargersStationDetails$2(this, chargersStationDetailsResponse, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ChargersStationButtonDto chargersStationButtonDto, ContinuationImpl continuationImpl) {
        ChargersStationDetailsMapper$prepareButton$1 chargersStationDetailsMapper$prepareButton$1;
        int i;
        String str;
        kdc kdcVar;
        uqa uqaVar;
        ChargersStationButtonDto chargersStationButtonDto2 = chargersStationButtonDto;
        if (continuationImpl instanceof ChargersStationDetailsMapper$prepareButton$1) {
            chargersStationDetailsMapper$prepareButton$1 = (ChargersStationDetailsMapper$prepareButton$1) continuationImpl;
            int i2 = chargersStationDetailsMapper$prepareButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsMapper$prepareButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsMapper$prepareButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsMapper$prepareButton$1.label;
                uj9 uj9Var = null;
                e eVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = chargersStationButtonDto2.a;
                    int i3 = kyh0.common_continue;
                    chargersStationDetailsMapper$prepareButton$1.L$0 = chargersStationButtonDto2;
                    chargersStationDetailsMapper$prepareButton$1.label = 1;
                    obj = eVar.w(formattedText, i3, chargersStationDetailsMapper$prepareButton$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chargersStationButtonDto2 = (ChargersStationButtonDto) chargersStationDetailsMapper$prepareButton$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                str = chargersStationButtonDto2.b;
                if (str == null) {
                    kdc d = eVar.d(str);
                    if (d == null && (d = eVar.a(str)) == null) {
                        d = eVar.v(str);
                    }
                    kdcVar = d;
                } else {
                    kdcVar = null;
                }
                boolean z = chargersStationButtonDto2.d;
                boolean z2 = chargersStationButtonDto2.c;
                boolean z3 = chargersStationButtonDto2.f;
                uqaVar = chargersStationButtonDto2.h;
                if (!jl40.l(uqaVar, wqa.INSTANCE)) {
                    uj9Var = jqa.a;
                } else if (jl40.l(uqaVar, rqa.INSTANCE)) {
                    uj9Var = new hqa(chargersStationButtonDto2.g);
                } else if (jl40.l(uqaVar, sqa.INSTANCE)) {
                    uj9Var = iqa.a;
                }
                return new uo9(charSequence, null, z, uj9Var, z2, kdcVar, z3, false, 128);
            }
        }
        chargersStationDetailsMapper$prepareButton$1 = new ChargersStationDetailsMapper$prepareButton$1(this, continuationImpl);
        Object obj2 = chargersStationDetailsMapper$prepareButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsMapper$prepareButton$1.label;
        uj9 uj9Var2 = null;
        e eVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        str = chargersStationButtonDto2.b;
        if (str == null) {
        }
        boolean z4 = chargersStationButtonDto2.d;
        boolean z22 = chargersStationButtonDto2.c;
        boolean z32 = chargersStationButtonDto2.f;
        uqaVar = chargersStationButtonDto2.h;
        if (!jl40.l(uqaVar, wqa.INSTANCE)) {
        }
        return new uo9(charSequence2, null, z4, uj9Var2, z22, kdcVar, z32, false, 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ChargersStationDetailsResponse.PopupV2 popupV2, ContinuationImpl continuationImpl) {
        ChargersStationDetailsMapper$preparePopup$3 chargersStationDetailsMapper$preparePopup$3;
        int i;
        ChargersStationDetailsResponse.PopupV2 popupV22;
        String str;
        String str2;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        String str3;
        if (continuationImpl instanceof ChargersStationDetailsMapper$preparePopup$3) {
            chargersStationDetailsMapper$preparePopup$3 = (ChargersStationDetailsMapper$preparePopup$3) continuationImpl;
            int i2 = chargersStationDetailsMapper$preparePopup$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsMapper$preparePopup$3.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsMapper$preparePopup$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsMapper$preparePopup$3.label;
                c cVar = this.f;
                CharSequence charSequence3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str4 = popupV2.a;
                    String str5 = popupV2.b;
                    FormattedText formattedText2 = popupV2.c;
                    chargersStationDetailsMapper$preparePopup$3.L$0 = popupV2;
                    chargersStationDetailsMapper$preparePopup$3.L$1 = str4;
                    chargersStationDetailsMapper$preparePopup$3.L$2 = str5;
                    chargersStationDetailsMapper$preparePopup$3.label = 1;
                    Object i3 = c.i(cVar, formattedText2, null, chargersStationDetailsMapper$preparePopup$3, 30);
                    if (i3 != coroutineSingletons) {
                        popupV22 = popupV2;
                        str = str5;
                        str2 = str4;
                        obj = i3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) chargersStationDetailsMapper$preparePopup$3.L$4;
                    str = (String) chargersStationDetailsMapper$preparePopup$3.L$3;
                    str3 = (String) chargersStationDetailsMapper$preparePopup$3.L$2;
                    kotlin.b.b(obj);
                    charSequence3 = (CharSequence) obj;
                    charSequence = charSequence2;
                    str2 = str3;
                    return new oma(charSequence, charSequence3, str2, str);
                }
                str = (String) chargersStationDetailsMapper$preparePopup$3.L$2;
                str2 = (String) chargersStationDetailsMapper$preparePopup$3.L$1;
                popupV22 = (ChargersStationDetailsResponse.PopupV2) chargersStationDetailsMapper$preparePopup$3.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                formattedText = popupV22.d;
                if (formattedText != null) {
                    chargersStationDetailsMapper$preparePopup$3.L$0 = null;
                    chargersStationDetailsMapper$preparePopup$3.L$1 = null;
                    chargersStationDetailsMapper$preparePopup$3.L$2 = str2;
                    chargersStationDetailsMapper$preparePopup$3.L$3 = str;
                    chargersStationDetailsMapper$preparePopup$3.L$4 = charSequence;
                    chargersStationDetailsMapper$preparePopup$3.label = 2;
                    Object i4 = c.i(cVar, formattedText, null, chargersStationDetailsMapper$preparePopup$3, 30);
                    if (i4 != coroutineSingletons) {
                        obj = i4;
                        charSequence2 = charSequence;
                        str3 = str2;
                        charSequence3 = (CharSequence) obj;
                        charSequence = charSequence2;
                        str2 = str3;
                    }
                    return coroutineSingletons;
                }
                return new oma(charSequence, charSequence3, str2, str);
            }
        }
        chargersStationDetailsMapper$preparePopup$3 = new ChargersStationDetailsMapper$preparePopup$3(this, continuationImpl);
        Object obj2 = chargersStationDetailsMapper$preparePopup$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsMapper$preparePopup$3.label;
        c cVar2 = this.f;
        CharSequence charSequence32 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = popupV22.d;
        if (formattedText != null) {
        }
        return new oma(charSequence, charSequence32, str2, str);
    }
}
