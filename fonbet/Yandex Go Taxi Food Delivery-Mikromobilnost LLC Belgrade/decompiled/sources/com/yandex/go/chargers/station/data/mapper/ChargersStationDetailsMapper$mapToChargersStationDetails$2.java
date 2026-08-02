package com.yandex.go.chargers.station.data.mapper;

import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import com.yandex.go.chargers.station.data.model.ChargersStationShortInfoDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersStationButtonDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ara;
import defpackage.bra;
import defpackage.bvf0;
import defpackage.cra;
import defpackage.dra;
import defpackage.fra;
import defpackage.gra;
import defpackage.hwa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nya;
import defpackage.oma;
import defpackage.rxa;
import defpackage.swa;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vva;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgra;", "<anonymous>", "(Ltse;)Lgra;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$mapToChargersStationDetails$2", f = "ChargersStationDetailsMapper.kt", l = {45, 46, 48, 49, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 52, 53, 54, 61, 62, 58, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsMapper$mapToChargersStationDetails$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersStationDetailsResponse $response;
    final /* synthetic */ String $traceId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$21;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsMapper$mapToChargersStationDetails$2(a aVar, ChargersStationDetailsResponse chargersStationDetailsResponse, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = chargersStationDetailsResponse;
        this.$traceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersStationDetailsMapper$mapToChargersStationDetails$2 chargersStationDetailsMapper$mapToChargersStationDetails$2 = new ChargersStationDetailsMapper$mapToChargersStationDetails$2(this.this$0, this.$response, this.$traceId, continuation);
        chargersStationDetailsMapper$mapToChargersStationDetails$2.L$0 = obj;
        return chargersStationDetailsMapper$mapToChargersStationDetails$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsMapper$mapToChargersStationDetails$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0248, code lost:
    
        if (r4 == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022f, code lost:
    
        if (r1 == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x034d, code lost:
    
        if (r0 != r6) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x05be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0308  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0465 -> B:48:0x0473). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        rxa rxaVar;
        Object a;
        Object i;
        rxa rxaVar2;
        vva vvaVar;
        Object i2;
        vva vvaVar2;
        CharSequence charSequence;
        rxa rxaVar3;
        CharSequence charSequence2;
        Object n;
        CharSequence charSequence3;
        rxa rxaVar4;
        vva vvaVar3;
        Object a2;
        rxa rxaVar5;
        List list;
        ChargersTariffDto chargersTariffDto;
        Object obj2;
        Object b2;
        List list2;
        ara araVar;
        rxa rxaVar6;
        vva vvaVar4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        swa swaVar;
        Object c;
        fra fraVar;
        Object a3;
        CharSequence charSequence6;
        vva vvaVar5;
        rxa rxaVar7;
        swa swaVar2;
        ara araVar2;
        List list3;
        fra fraVar2;
        nya nyaVar;
        com.yandex.go.chargers.domain.mapper.b bVar;
        List list4;
        EmptyList emptyList;
        hwa hwaVar;
        ChargersStationDetailsResponse.Popup popup;
        oma omaVar;
        Object n2;
        List list5;
        CharSequence charSequence7;
        nya nyaVar2;
        List list6;
        nya nyaVar3;
        com.yandex.go.chargers.domain.mapper.b bVar2;
        List list7;
        hwa hwaVar2;
        oma omaVar2;
        CharSequence charSequence8;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList2;
        Iterator it;
        ara araVar3;
        fra fraVar3;
        List list8;
        a aVar;
        swa swaVar3;
        com.yandex.go.chargers.domain.mapper.b bVar3;
        oma omaVar3;
        Object a4;
        fra fraVar4;
        swa swaVar4;
        ara araVar4;
        nya nyaVar4;
        CharSequence charSequence9;
        rxa rxaVar8;
        CharSequence charSequence10;
        ArrayList arrayList3;
        Object f;
        vva vvaVar6;
        swa swaVar5;
        oma omaVar4;
        rxa rxaVar9;
        ArrayList arrayList4;
        ara araVar5;
        List list9;
        bra braVar;
        Object n3;
        List list10;
        vva vvaVar7;
        ArrayList arrayList5;
        ChargersStationDetailsResponse.Popup popup2;
        List<ChargersStationDetailsResponse.PopupV2> list11;
        ?? r7;
        ChargersStationDetailsResponse.ChargersStationOrderDetails chargersStationOrderDetails;
        bra braVar2;
        Iterator it2;
        int i3;
        ChargersStationDetailsResponse.Popup.ShowPolicy showPolicy;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        EmptyList emptyList2 = EmptyList.a;
        switch (i4) {
            case 0:
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                ChargersStationDetailsResponse chargersStationDetailsResponse = this.$response;
                String str = this.$traceId;
                this.L$0 = tseVar;
                this.label = 1;
                b = a.b(aVar2, chargersStationDetailsResponse, str, this);
                break;
            case 1:
                kotlin.b.b(obj);
                b = obj;
                rxaVar = (rxa) b;
                com.yandex.go.chargers.surge.domain.a aVar3 = this.this$0.e;
                ChargersSurgeDto chargersSurgeDto = this.$response.m;
                this.L$0 = tseVar;
                this.L$1 = rxaVar;
                this.label = 2;
                a = aVar3.a(chargersSurgeDto, this);
                break;
            case 2:
                rxaVar = (rxa) this.L$1;
                kotlin.b.b(obj);
                a = obj;
                vva vvaVar8 = (vva) a;
                c cVar = this.this$0.f;
                FormattedText formattedText = this.$response.a;
                this.L$0 = tseVar;
                this.L$1 = rxaVar;
                this.L$2 = vvaVar8;
                this.label = 3;
                i = c.i(cVar, formattedText, null, this, 30);
                if (i != coroutineSingletons2) {
                    rxaVar2 = rxaVar;
                    vvaVar = vvaVar8;
                    CharSequence charSequence11 = (CharSequence) i;
                    c cVar2 = this.this$0.f;
                    FormattedText formattedText2 = this.$response.b;
                    this.L$0 = tseVar;
                    this.L$1 = rxaVar2;
                    this.L$2 = vvaVar;
                    this.L$3 = charSequence11;
                    this.label = 4;
                    i2 = c.i(cVar2, formattedText2, null, this, 30);
                    if (i2 != coroutineSingletons2) {
                        rxa rxaVar10 = rxaVar2;
                        vvaVar2 = vvaVar;
                        charSequence = charSequence11;
                        rxaVar3 = rxaVar10;
                        charSequence2 = (CharSequence) i2;
                        a aVar4 = this.this$0;
                        List list12 = this.$response.e;
                        this.L$0 = tseVar;
                        this.L$1 = rxaVar3;
                        this.L$2 = vvaVar2;
                        this.L$3 = charSequence;
                        this.L$4 = charSequence2;
                        this.label = 5;
                        aVar4.getClass();
                        n = !list12.isEmpty() ? emptyList2 : bvf0.n(new ChargersStationDetailsMapper$prepareStationButtons$2(list12, aVar4, null), this);
                        if (n != coroutineSingletons2) {
                            vva vvaVar9 = vvaVar2;
                            charSequence3 = charSequence;
                            rxaVar4 = rxaVar3;
                            vvaVar3 = vvaVar9;
                            List list13 = (List) n;
                            a aVar5 = this.this$0;
                            ChargersStationDetailsResponse chargersStationDetailsResponse2 = this.$response;
                            this.L$0 = tseVar;
                            this.L$1 = rxaVar4;
                            this.L$2 = vvaVar3;
                            this.L$3 = charSequence3;
                            this.L$4 = charSequence2;
                            this.L$5 = list13;
                            this.label = 6;
                            a2 = a.a(aVar5, tseVar, chargersStationDetailsResponse2, this);
                            if (a2 != coroutineSingletons2) {
                                rxaVar5 = rxaVar4;
                                list = list13;
                                ara araVar6 = (ara) a2;
                                a aVar6 = this.this$0;
                                ChargersStationDetailsResponse chargersStationDetailsResponse3 = this.$response;
                                this.L$0 = tseVar;
                                this.L$1 = rxaVar5;
                                this.L$2 = vvaVar3;
                                this.L$3 = charSequence3;
                                this.L$4 = charSequence2;
                                this.L$5 = list;
                                this.L$6 = araVar6;
                                this.label = 7;
                                aVar6.getClass();
                                chargersTariffDto = chargersStationDetailsResponse3.f;
                                if (chargersTariffDto != null) {
                                    b2 = null;
                                    obj2 = null;
                                } else {
                                    com.yandex.go.chargers.surge.domain.a aVar7 = aVar6.e;
                                    ChargersSurgeDto chargersSurgeDto2 = chargersStationDetailsResponse3.m;
                                    ChargersSurgeModalDto chargersSurgeModalDto = chargersSurgeDto2 != null ? chargersSurgeDto2.d : null;
                                    aVar7.getClass();
                                    obj2 = null;
                                    b2 = ((com.yandex.go.chargers.tariff_item_info.b) aVar6.b).b(chargersTariffDto, com.yandex.go.chargers.surge.domain.a.b(chargersSurgeModalDto), null, this);
                                }
                                if (b2 != coroutineSingletons2) {
                                    CharSequence charSequence12 = charSequence2;
                                    list2 = list;
                                    araVar = araVar6;
                                    rxaVar6 = rxaVar5;
                                    vvaVar4 = vvaVar3;
                                    charSequence4 = charSequence3;
                                    charSequence5 = charSequence12;
                                    swaVar = (swa) b2;
                                    a aVar8 = this.this$0;
                                    ChargersStationDetailsResponse chargersStationDetailsResponse4 = this.$response;
                                    this.L$0 = obj2;
                                    this.L$1 = rxaVar6;
                                    this.L$2 = vvaVar4;
                                    this.L$3 = charSequence4;
                                    this.L$4 = charSequence5;
                                    this.L$5 = list2;
                                    this.L$6 = araVar;
                                    this.L$7 = swaVar;
                                    this.label = 8;
                                    c = a.c(aVar8, tseVar, chargersStationDetailsResponse4, this);
                                    break;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 3:
                vvaVar = (vva) this.L$2;
                rxaVar2 = (rxa) this.L$1;
                kotlin.b.b(obj);
                i = obj;
                CharSequence charSequence112 = (CharSequence) i;
                c cVar22 = this.this$0.f;
                FormattedText formattedText22 = this.$response.b;
                this.L$0 = tseVar;
                this.L$1 = rxaVar2;
                this.L$2 = vvaVar;
                this.L$3 = charSequence112;
                this.label = 4;
                i2 = c.i(cVar22, formattedText22, null, this, 30);
                if (i2 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 4:
                charSequence = (CharSequence) this.L$3;
                vva vvaVar10 = (vva) this.L$2;
                rxa rxaVar11 = (rxa) this.L$1;
                kotlin.b.b(obj);
                rxaVar3 = rxaVar11;
                vvaVar2 = vvaVar10;
                i2 = obj;
                charSequence2 = (CharSequence) i2;
                a aVar42 = this.this$0;
                List list122 = this.$response.e;
                this.L$0 = tseVar;
                this.L$1 = rxaVar3;
                this.L$2 = vvaVar2;
                this.L$3 = charSequence;
                this.L$4 = charSequence2;
                this.label = 5;
                aVar42.getClass();
                if (!list122.isEmpty()) {
                }
                if (n != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 5:
                CharSequence charSequence13 = (CharSequence) this.L$4;
                CharSequence charSequence14 = (CharSequence) this.L$3;
                vva vvaVar11 = (vva) this.L$2;
                rxa rxaVar12 = (rxa) this.L$1;
                kotlin.b.b(obj);
                charSequence2 = charSequence13;
                rxaVar4 = rxaVar12;
                vvaVar3 = vvaVar11;
                charSequence3 = charSequence14;
                n = obj;
                List list132 = (List) n;
                a aVar52 = this.this$0;
                ChargersStationDetailsResponse chargersStationDetailsResponse22 = this.$response;
                this.L$0 = tseVar;
                this.L$1 = rxaVar4;
                this.L$2 = vvaVar3;
                this.L$3 = charSequence3;
                this.L$4 = charSequence2;
                this.L$5 = list132;
                this.label = 6;
                a2 = a.a(aVar52, tseVar, chargersStationDetailsResponse22, this);
                if (a2 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 6:
                list = (List) this.L$5;
                charSequence2 = (CharSequence) this.L$4;
                charSequence3 = (CharSequence) this.L$3;
                vvaVar3 = (vva) this.L$2;
                rxaVar5 = (rxa) this.L$1;
                kotlin.b.b(obj);
                a2 = obj;
                ara araVar62 = (ara) a2;
                a aVar62 = this.this$0;
                ChargersStationDetailsResponse chargersStationDetailsResponse32 = this.$response;
                this.L$0 = tseVar;
                this.L$1 = rxaVar5;
                this.L$2 = vvaVar3;
                this.L$3 = charSequence3;
                this.L$4 = charSequence2;
                this.L$5 = list;
                this.L$6 = araVar62;
                this.label = 7;
                aVar62.getClass();
                chargersTariffDto = chargersStationDetailsResponse32.f;
                if (chargersTariffDto != null) {
                }
                if (b2 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 7:
                araVar = (ara) this.L$6;
                list2 = (List) this.L$5;
                charSequence5 = (CharSequence) this.L$4;
                charSequence4 = (CharSequence) this.L$3;
                vvaVar4 = (vva) this.L$2;
                rxaVar6 = (rxa) this.L$1;
                kotlin.b.b(obj);
                b2 = obj;
                obj2 = null;
                swaVar = (swa) b2;
                a aVar82 = this.this$0;
                ChargersStationDetailsResponse chargersStationDetailsResponse42 = this.$response;
                this.L$0 = obj2;
                this.L$1 = rxaVar6;
                this.L$2 = vvaVar4;
                this.L$3 = charSequence4;
                this.L$4 = charSequence5;
                this.L$5 = list2;
                this.L$6 = araVar;
                this.L$7 = swaVar;
                this.label = 8;
                c = a.c(aVar82, tseVar, chargersStationDetailsResponse42, this);
                break;
            case 8:
                swa swaVar6 = (swa) this.L$7;
                araVar = (ara) this.L$6;
                list2 = (List) this.L$5;
                charSequence5 = (CharSequence) this.L$4;
                charSequence4 = (CharSequence) this.L$3;
                vvaVar4 = (vva) this.L$2;
                rxaVar6 = (rxa) this.L$1;
                kotlin.b.b(obj);
                swaVar = swaVar6;
                c = obj;
                fraVar = (fra) c;
                b bVar4 = this.this$0.g;
                ChargersStationShortInfoDto chargersStationShortInfoDto = this.$response.g;
                this.L$0 = null;
                this.L$1 = rxaVar6;
                this.L$2 = vvaVar4;
                this.L$3 = charSequence4;
                this.L$4 = charSequence5;
                this.L$5 = list2;
                this.L$6 = araVar;
                this.L$7 = swaVar;
                this.L$8 = fraVar;
                this.label = 9;
                a3 = bVar4.a(chargersStationShortInfoDto, rxaVar6, this);
                if (a3 != coroutineSingletons2) {
                    charSequence6 = charSequence4;
                    vvaVar5 = vvaVar4;
                    rxaVar7 = rxaVar6;
                    swaVar2 = swaVar;
                    araVar2 = araVar;
                    list3 = list2;
                    fraVar2 = fraVar;
                    nyaVar = (nya) a3;
                    a aVar9 = this.this$0;
                    bVar = aVar9.d;
                    ChargersStationDetailsResponse chargersStationDetailsResponse5 = this.$response;
                    list4 = chargersStationDetailsResponse5.k;
                    emptyList = emptyList2;
                    hwaVar = vvaVar5 == null ? vvaVar5.d : null;
                    popup = chargersStationDetailsResponse5.i;
                    if (popup == null) {
                        this.L$0 = null;
                        this.L$1 = rxaVar7;
                        this.L$2 = vvaVar5;
                        this.L$3 = charSequence6;
                        this.L$4 = charSequence5;
                        this.L$5 = list3;
                        this.L$6 = araVar2;
                        this.L$7 = swaVar2;
                        this.L$8 = fraVar2;
                        this.L$9 = nyaVar;
                        this.L$10 = null;
                        this.L$11 = bVar;
                        this.L$12 = list4;
                        this.L$13 = hwaVar;
                        this.label = 10;
                        n2 = bvf0.n(new ChargersStationDetailsMapper$preparePopup$2(aVar9, popup, null), this);
                        coroutineSingletons2 = coroutineSingletons2;
                        if (n2 != coroutineSingletons2) {
                            list5 = list4;
                            charSequence7 = charSequence5;
                            nyaVar2 = nyaVar;
                            list4 = list5;
                            omaVar = (oma) n2;
                            nyaVar = nyaVar2;
                            charSequence5 = charSequence7;
                            list6 = this.$response.j;
                            if (list6 != null) {
                                List list14 = list6;
                                nya nyaVar5 = nyaVar;
                                a aVar10 = this.this$0;
                                oma omaVar5 = omaVar;
                                arrayList2 = new ArrayList(tcc.n(list14, 10));
                                Iterator it3 = list14.iterator();
                                swa swaVar7 = swaVar2;
                                it = it3;
                                araVar3 = araVar2;
                                fraVar3 = fraVar2;
                                list8 = list3;
                                aVar = aVar10;
                                coroutineSingletons = coroutineSingletons2;
                                swaVar3 = swaVar7;
                                hwa hwaVar3 = hwaVar;
                                bVar3 = bVar;
                                hwaVar2 = hwaVar3;
                                nyaVar3 = nyaVar5;
                                omaVar3 = omaVar5;
                                if (it.hasNext()) {
                                    hwa hwaVar4 = hwaVar2;
                                    ChargersStationDetailsResponse.PopupV2 popupV2 = (ChargersStationDetailsResponse.PopupV2) it.next();
                                    this.L$0 = null;
                                    this.L$1 = rxaVar7;
                                    this.L$2 = vvaVar5;
                                    this.L$3 = charSequence6;
                                    this.L$4 = charSequence5;
                                    this.L$5 = list8;
                                    this.L$6 = araVar3;
                                    this.L$7 = swaVar3;
                                    this.L$8 = fraVar3;
                                    this.L$9 = nyaVar3;
                                    this.L$10 = null;
                                    this.L$11 = aVar;
                                    this.L$12 = null;
                                    this.L$13 = arrayList2;
                                    this.L$14 = it;
                                    this.L$15 = null;
                                    this.L$16 = null;
                                    this.L$17 = bVar3;
                                    this.L$18 = list4;
                                    hwaVar2 = hwaVar4;
                                    this.L$19 = hwaVar2;
                                    ara araVar7 = araVar3;
                                    oma omaVar6 = omaVar3;
                                    this.L$20 = omaVar6;
                                    this.L$21 = arrayList2;
                                    arrayList3 = arrayList2;
                                    this.label = 11;
                                    f = aVar.f(popupV2, this);
                                    swa swaVar8 = swaVar3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (f != coroutineSingletons2) {
                                        vvaVar6 = vvaVar5;
                                        swaVar5 = swaVar8;
                                        omaVar4 = omaVar6;
                                        rxaVar9 = rxaVar7;
                                        arrayList4 = arrayList3;
                                        araVar5 = araVar7;
                                        arrayList4.add((oma) f);
                                        araVar3 = araVar5;
                                        arrayList2 = arrayList3;
                                        rxaVar7 = rxaVar9;
                                        omaVar3 = omaVar4;
                                        coroutineSingletons = coroutineSingletons2;
                                        swaVar3 = swaVar5;
                                        vvaVar5 = vvaVar6;
                                        if (it.hasNext()) {
                                            ara araVar8 = araVar3;
                                            CharSequence charSequence15 = charSequence5;
                                            arrayList = arrayList2;
                                            bVar2 = bVar3;
                                            charSequence8 = charSequence15;
                                            List list15 = list4;
                                            omaVar2 = omaVar3;
                                            list7 = list15;
                                            list3 = list8;
                                            fraVar2 = fraVar3;
                                            swaVar2 = swaVar3;
                                            araVar2 = araVar8;
                                            this.L$0 = null;
                                            this.L$1 = rxaVar7;
                                            this.L$2 = vvaVar5;
                                            this.L$3 = charSequence6;
                                            this.L$4 = charSequence8;
                                            this.L$5 = list3;
                                            this.L$6 = araVar2;
                                            this.L$7 = swaVar2;
                                            this.L$8 = fraVar2;
                                            this.L$9 = nyaVar3;
                                            this.L$10 = null;
                                            this.L$11 = null;
                                            this.L$12 = null;
                                            this.L$13 = null;
                                            this.L$14 = null;
                                            this.L$15 = null;
                                            this.L$16 = null;
                                            this.L$17 = null;
                                            this.L$18 = null;
                                            this.L$19 = null;
                                            this.L$20 = null;
                                            this.L$21 = null;
                                            this.label = 12;
                                            a4 = bVar2.a(list7, hwaVar2, omaVar2, arrayList, this);
                                            coroutineSingletons2 = coroutineSingletons;
                                            if (a4 != coroutineSingletons2) {
                                                fraVar4 = fraVar2;
                                                swaVar4 = swaVar2;
                                                araVar4 = araVar2;
                                                nyaVar4 = nyaVar3;
                                                charSequence9 = charSequence6;
                                                rxaVar8 = rxaVar7;
                                                charSequence10 = charSequence8;
                                                list9 = (List) a4;
                                                a aVar11 = this.this$0;
                                                ChargersStationDetailsResponse.PartnerInformationDto partnerInformationDto = this.$response.l;
                                                this.L$0 = null;
                                                this.L$1 = rxaVar8;
                                                this.L$2 = vvaVar5;
                                                this.L$3 = charSequence9;
                                                this.L$4 = charSequence10;
                                                this.L$5 = list3;
                                                this.L$6 = araVar4;
                                                this.L$7 = swaVar4;
                                                this.L$8 = fraVar4;
                                                this.L$9 = nyaVar4;
                                                this.L$10 = list9;
                                                this.label = 13;
                                                aVar11.getClass();
                                                braVar = null;
                                                n3 = bvf0.n(new ChargersStationDetailsMapper$preparePartnerInformation$2(aVar11, partnerInformationDto, null), this);
                                                if (n3 != coroutineSingletons2) {
                                                    list10 = list3;
                                                    vvaVar7 = vvaVar5;
                                                    List list16 = list9;
                                                    nya nyaVar6 = nyaVar4;
                                                    fra fraVar5 = fraVar4;
                                                    swa swaVar9 = swaVar4;
                                                    ara araVar9 = araVar4;
                                                    CharSequence charSequence16 = charSequence10;
                                                    CharSequence charSequence17 = charSequence9;
                                                    rxa rxaVar13 = rxaVar8;
                                                    cra craVar = (cra) n3;
                                                    arrayList5 = new ArrayList();
                                                    ChargersStationDetailsResponse chargersStationDetailsResponse6 = this.$response;
                                                    popup2 = chargersStationDetailsResponse6.i;
                                                    if (popup2 != null && (showPolicy = popup2.d) != null) {
                                                        arrayList5.add(new dra(showPolicy.a, showPolicy.b));
                                                    }
                                                    list11 = chargersStationDetailsResponse6.j;
                                                    if (list11 == null) {
                                                        r7 = new ArrayList();
                                                        for (ChargersStationDetailsResponse.PopupV2 popupV22 : list11) {
                                                            String str2 = popupV22.a;
                                                            ChargersStationDetailsResponse.PopupV2.ShowPolicy showPolicy2 = popupV22.e;
                                                            Object draVar = showPolicy2 != null ? new dra(str2, showPolicy2.a) : braVar;
                                                            if (draVar != null) {
                                                                r7.add(draVar);
                                                            }
                                                        }
                                                    } else {
                                                        r7 = emptyList;
                                                    }
                                                    arrayList5.addAll(r7);
                                                    List J0 = kotlin.collections.a.J0(arrayList5);
                                                    ChargersStationDetailsResponse chargersStationDetailsResponse7 = this.$response;
                                                    chargersStationOrderDetails = chargersStationDetailsResponse7.n;
                                                    if (chargersStationOrderDetails == null) {
                                                        Integer num = chargersStationOrderDetails.a;
                                                        braVar2 = num != null ? new bra(num.intValue(), chargersStationDetailsResponse7.n.b) : braVar;
                                                    } else {
                                                        braVar2 = braVar;
                                                    }
                                                    it2 = this.$response.e.iterator();
                                                    i3 = 0;
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            i3 = -1;
                                                        } else if (!((ChargersStationButtonDto) it2.next()).e) {
                                                            i3++;
                                                        }
                                                    }
                                                    return new gra(charSequence17, list10, charSequence16, araVar9, swaVar9, nyaVar6, fraVar5, list16, this.$traceId, craVar, rxaVar13, vvaVar7, J0, braVar2, new Integer(i3));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                oma omaVar7 = omaVar;
                                nyaVar3 = nyaVar;
                                bVar2 = bVar;
                                list7 = list4;
                                hwaVar2 = hwaVar;
                                omaVar2 = omaVar7;
                                charSequence8 = charSequence5;
                                arrayList = null;
                                coroutineSingletons = coroutineSingletons2;
                                this.L$0 = null;
                                this.L$1 = rxaVar7;
                                this.L$2 = vvaVar5;
                                this.L$3 = charSequence6;
                                this.L$4 = charSequence8;
                                this.L$5 = list3;
                                this.L$6 = araVar2;
                                this.L$7 = swaVar2;
                                this.L$8 = fraVar2;
                                this.L$9 = nyaVar3;
                                this.L$10 = null;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.L$13 = null;
                                this.L$14 = null;
                                this.L$15 = null;
                                this.L$16 = null;
                                this.L$17 = null;
                                this.L$18 = null;
                                this.L$19 = null;
                                this.L$20 = null;
                                this.L$21 = null;
                                this.label = 12;
                                a4 = bVar2.a(list7, hwaVar2, omaVar2, arrayList, this);
                                coroutineSingletons2 = coroutineSingletons;
                                if (a4 != coroutineSingletons2) {
                                }
                            }
                        }
                    } else {
                        omaVar = null;
                        list6 = this.$response.j;
                        if (list6 != null) {
                        }
                    }
                }
                return coroutineSingletons2;
            case 9:
                fraVar = (fra) this.L$8;
                swa swaVar10 = (swa) this.L$7;
                ara araVar10 = (ara) this.L$6;
                List list17 = (List) this.L$5;
                CharSequence charSequence18 = (CharSequence) this.L$4;
                CharSequence charSequence19 = (CharSequence) this.L$3;
                vva vvaVar12 = (vva) this.L$2;
                rxa rxaVar14 = (rxa) this.L$1;
                kotlin.b.b(obj);
                a3 = obj;
                charSequence6 = charSequence19;
                vvaVar5 = vvaVar12;
                rxaVar7 = rxaVar14;
                swaVar2 = swaVar10;
                araVar2 = araVar10;
                list3 = list17;
                charSequence5 = charSequence18;
                fraVar2 = fraVar;
                nyaVar = (nya) a3;
                a aVar92 = this.this$0;
                bVar = aVar92.d;
                ChargersStationDetailsResponse chargersStationDetailsResponse52 = this.$response;
                list4 = chargersStationDetailsResponse52.k;
                emptyList = emptyList2;
                if (vvaVar5 == null) {
                }
                popup = chargersStationDetailsResponse52.i;
                if (popup == null) {
                }
                break;
            case 10:
                hwa hwaVar5 = (hwa) this.L$13;
                list5 = (List) this.L$12;
                bVar = (com.yandex.go.chargers.domain.mapper.b) this.L$11;
                nyaVar2 = (nya) this.L$9;
                fraVar2 = (fra) this.L$8;
                swaVar2 = (swa) this.L$7;
                araVar2 = (ara) this.L$6;
                list3 = (List) this.L$5;
                charSequence7 = (CharSequence) this.L$4;
                charSequence6 = (CharSequence) this.L$3;
                vvaVar5 = (vva) this.L$2;
                rxaVar7 = (rxa) this.L$1;
                kotlin.b.b(obj);
                emptyList = emptyList2;
                hwaVar = hwaVar5;
                n2 = obj;
                list4 = list5;
                omaVar = (oma) n2;
                nyaVar = nyaVar2;
                charSequence5 = charSequence7;
                list6 = this.$response.j;
                if (list6 != null) {
                }
                break;
            case 11:
                ?? r0 = (Collection) this.L$21;
                oma omaVar8 = (oma) this.L$20;
                hwaVar2 = (hwa) this.L$19;
                list4 = (List) this.L$18;
                com.yandex.go.chargers.domain.mapper.b bVar5 = (com.yandex.go.chargers.domain.mapper.b) this.L$17;
                it = (Iterator) this.L$14;
                ?? r10 = (Collection) this.L$13;
                aVar = (a) this.L$11;
                nyaVar3 = (nya) this.L$9;
                fra fraVar6 = (fra) this.L$8;
                swaVar5 = (swa) this.L$7;
                araVar5 = (ara) this.L$6;
                list8 = (List) this.L$5;
                CharSequence charSequence20 = (CharSequence) this.L$4;
                CharSequence charSequence21 = (CharSequence) this.L$3;
                vvaVar6 = (vva) this.L$2;
                rxa rxaVar15 = (rxa) this.L$1;
                kotlin.b.b(obj);
                bVar3 = bVar5;
                charSequence5 = charSequence20;
                emptyList = emptyList2;
                omaVar4 = omaVar8;
                arrayList4 = r0;
                arrayList3 = r10;
                fraVar3 = fraVar6;
                charSequence6 = charSequence21;
                rxaVar9 = rxaVar15;
                f = obj;
                arrayList4.add((oma) f);
                araVar3 = araVar5;
                arrayList2 = arrayList3;
                rxaVar7 = rxaVar9;
                omaVar3 = omaVar4;
                coroutineSingletons = coroutineSingletons2;
                swaVar3 = swaVar5;
                vvaVar5 = vvaVar6;
                if (it.hasNext()) {
                }
                break;
            case 12:
                nya nyaVar7 = (nya) this.L$9;
                fra fraVar7 = (fra) this.L$8;
                swa swaVar11 = (swa) this.L$7;
                ara araVar11 = (ara) this.L$6;
                List list18 = (List) this.L$5;
                charSequence10 = (CharSequence) this.L$4;
                charSequence9 = (CharSequence) this.L$3;
                vva vvaVar13 = (vva) this.L$2;
                rxaVar8 = (rxa) this.L$1;
                kotlin.b.b(obj);
                emptyList = emptyList2;
                vvaVar5 = vvaVar13;
                list3 = list18;
                araVar4 = araVar11;
                swaVar4 = swaVar11;
                fraVar4 = fraVar7;
                nyaVar4 = nyaVar7;
                a4 = obj;
                list9 = (List) a4;
                a aVar112 = this.this$0;
                ChargersStationDetailsResponse.PartnerInformationDto partnerInformationDto2 = this.$response.l;
                this.L$0 = null;
                this.L$1 = rxaVar8;
                this.L$2 = vvaVar5;
                this.L$3 = charSequence9;
                this.L$4 = charSequence10;
                this.L$5 = list3;
                this.L$6 = araVar4;
                this.L$7 = swaVar4;
                this.L$8 = fraVar4;
                this.L$9 = nyaVar4;
                this.L$10 = list9;
                this.label = 13;
                aVar112.getClass();
                braVar = null;
                n3 = bvf0.n(new ChargersStationDetailsMapper$preparePartnerInformation$2(aVar112, partnerInformationDto2, null), this);
                if (n3 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 13:
                list9 = (List) this.L$10;
                nyaVar4 = (nya) this.L$9;
                fraVar4 = (fra) this.L$8;
                swaVar4 = (swa) this.L$7;
                araVar4 = (ara) this.L$6;
                List list19 = (List) this.L$5;
                charSequence10 = (CharSequence) this.L$4;
                charSequence9 = (CharSequence) this.L$3;
                vva vvaVar14 = (vva) this.L$2;
                rxaVar8 = (rxa) this.L$1;
                kotlin.b.b(obj);
                list10 = list19;
                emptyList = emptyList2;
                braVar = null;
                vvaVar7 = vvaVar14;
                n3 = obj;
                List list162 = list9;
                nya nyaVar62 = nyaVar4;
                fra fraVar52 = fraVar4;
                swa swaVar92 = swaVar4;
                ara araVar92 = araVar4;
                CharSequence charSequence162 = charSequence10;
                CharSequence charSequence172 = charSequence9;
                rxa rxaVar132 = rxaVar8;
                cra craVar2 = (cra) n3;
                arrayList5 = new ArrayList();
                ChargersStationDetailsResponse chargersStationDetailsResponse62 = this.$response;
                popup2 = chargersStationDetailsResponse62.i;
                if (popup2 != null) {
                    arrayList5.add(new dra(showPolicy.a, showPolicy.b));
                    break;
                }
                list11 = chargersStationDetailsResponse62.j;
                if (list11 == null) {
                }
                arrayList5.addAll(r7);
                List J02 = kotlin.collections.a.J0(arrayList5);
                ChargersStationDetailsResponse chargersStationDetailsResponse72 = this.$response;
                chargersStationOrderDetails = chargersStationDetailsResponse72.n;
                if (chargersStationOrderDetails == null) {
                }
                it2 = this.$response.e.iterator();
                i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                    }
                    i3++;
                }
                return new gra(charSequence172, list10, charSequence162, araVar92, swaVar92, nyaVar62, fraVar52, list162, this.$traceId, craVar2, rxaVar132, vvaVar7, J02, braVar2, new Integer(i3));
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
