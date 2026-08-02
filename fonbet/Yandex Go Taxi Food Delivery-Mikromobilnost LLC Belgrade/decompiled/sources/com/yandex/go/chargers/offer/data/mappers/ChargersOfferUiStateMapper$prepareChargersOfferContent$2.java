package com.yandex.go.chargers.offer.data.mappers;

import com.yandex.go.chargers.data.model.ChargersAttentionDto;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.a8a;
import defpackage.b8a;
import defpackage.c8a;
import defpackage.evu0;
import defpackage.hfa0;
import defpackage.hl3;
import defpackage.lvj0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.n9a;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.swa;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tsa;
import defpackage.tse;
import defpackage.v7a;
import defpackage.vr60;
import defpackage.vva;
import defpackage.w7a;
import defpackage.wls;
import defpackage.x7a;
import defpackage.y7a;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lc8a;", "<anonymous>", "(Ltse;)Lc8a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.offer.data.mappers.ChargersOfferUiStateMapper$prepareChargersOfferContent$2", f = "ChargersOfferUiStateMapper.kt", l = {300, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 302, 303, lvj0.NOT_MODIFIED, 305, 306, 307, 308, 309, 310, 311, 312}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOfferUiStateMapper$prepareChargersOfferContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ hl3 $authStatus;
    final /* synthetic */ n9a $chargersOfferToggle;
    final /* synthetic */ boolean $isMainButtonLoading;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ ChargersOfferResponseDto $response;
    final /* synthetic */ tsa $stationNumber;
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
    Object L$22;
    Object L$23;
    Object L$24;
    Object L$25;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOfferUiStateMapper$prepareChargersOfferContent$2(ChargersOfferResponseDto chargersOfferResponseDto, b bVar, tsa tsaVar, hl3 hl3Var, hfa0 hfa0Var, boolean z, n9a n9aVar, Continuation continuation) {
        super(2, continuation);
        this.$response = chargersOfferResponseDto;
        this.this$0 = bVar;
        this.$stationNumber = tsaVar;
        this.$authStatus = hl3Var;
        this.$paymentOptions = hfa0Var;
        this.$isMainButtonLoading = z;
        this.$chargersOfferToggle = n9aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersOfferUiStateMapper$prepareChargersOfferContent$2 chargersOfferUiStateMapper$prepareChargersOfferContent$2 = new ChargersOfferUiStateMapper$prepareChargersOfferContent$2(this.$response, this.this$0, this.$stationNumber, this.$authStatus, this.$paymentOptions, this.$isMainButtonLoading, this.$chargersOfferToggle, continuation);
        chargersOfferUiStateMapper$prepareChargersOfferContent$2.L$0 = obj;
        return chargersOfferUiStateMapper$prepareChargersOfferContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOfferUiStateMapper$prepareChargersOfferContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x08a9, code lost:
    
        if (r1 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x077d, code lost:
    
        if (r14 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x072b, code lost:
    
        if (r6 == r8) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x06db, code lost:
    
        if (r14 == r8) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0652  */
    /* JADX WARN: Type inference failed for: r5v28, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v19, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v23, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v28, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        qoh qohVar;
        noh h;
        noh h2;
        int i2;
        noh nohVar;
        noh h3;
        noh h4;
        qoh h5;
        noh h6;
        CoroutineSingletons coroutineSingletons;
        qoh qohVar2;
        qoh qohVar3;
        qoh qohVar4;
        qoh qohVar5;
        noh nohVar2;
        CoroutineSingletons coroutineSingletons2;
        noh nohVar3;
        noh nohVar4;
        CharSequence charSequence;
        Object s;
        qoh qohVar6;
        qoh qohVar7;
        noh nohVar5;
        Collection collection;
        noh nohVar6;
        Object k;
        noh nohVar7;
        noh nohVar8;
        Collection collection2;
        noh nohVar9;
        noh nohVar10;
        noh nohVar11;
        noh nohVar12;
        noh nohVar13;
        CharSequence charSequence2;
        Collection collection3;
        noh nohVar14;
        Collection collection4;
        noh nohVar15;
        noh nohVar16;
        noh nohVar17;
        noh nohVar18;
        noh nohVar19;
        noh nohVar20;
        CharSequence charSequence3;
        b8a b8aVar;
        noh nohVar21;
        v7a v7aVar;
        Object k2;
        b8a b8aVar2;
        noh nohVar22;
        Collection collection5;
        noh nohVar23;
        noh nohVar24;
        noh nohVar25;
        noh nohVar26;
        noh nohVar27;
        noh nohVar28;
        CharSequence charSequence4;
        b8a b8aVar3;
        v7a v7aVar2;
        w7a w7aVar;
        Object k3;
        Collection collection6;
        noh nohVar29;
        noh nohVar30;
        noh nohVar31;
        noh nohVar32;
        noh nohVar33;
        noh nohVar34;
        CharSequence charSequence5;
        b8a b8aVar4;
        v7a v7aVar3;
        w7a w7aVar2;
        y7a y7aVar;
        Object k4;
        noh nohVar35;
        noh nohVar36;
        noh nohVar37;
        noh nohVar38;
        noh nohVar39;
        CharSequence charSequence6;
        b8a b8aVar5;
        v7a v7aVar4;
        w7a w7aVar3;
        y7a y7aVar2;
        vr60 vr60Var;
        Object k5;
        Object b;
        noh nohVar40;
        noh nohVar41;
        Object k6;
        CharSequence charSequence7;
        noh nohVar42;
        noh nohVar43;
        noh nohVar44;
        noh nohVar45;
        v7a v7aVar5;
        w7a w7aVar4;
        vr60 vr60Var2;
        noh nohVar46;
        b8a b8aVar6;
        y7a y7aVar3;
        List list;
        noh nohVar47;
        w7a w7aVar5;
        swa swaVar;
        vr60 vr60Var3;
        List list2;
        List list3;
        Object k7;
        noh nohVar48;
        List list4;
        List list5;
        Object k8;
        Object k9;
        List list6;
        vr60 vr60Var4;
        List list7;
        w7a w7aVar6;
        noh nohVar49;
        b8a b8aVar7;
        List list8;
        swa swaVar2;
        CharSequence charSequence8;
        v7a v7aVar6;
        y7a y7aVar4;
        noh nohVar50;
        a8a a8aVar;
        CharSequence charSequence9;
        b8a b8aVar8;
        v7a v7aVar7;
        w7a w7aVar7;
        y7a y7aVar5;
        vr60 vr60Var5;
        vva vvaVar;
        Object k10;
        vr60 vr60Var6;
        a8a a8aVar2;
        noh nohVar51;
        a8a a8aVar3;
        List list9;
        vr60 vr60Var7;
        y7a y7aVar6;
        w7a w7aVar8;
        v7a v7aVar8;
        x7a x7aVar;
        b8a b8aVar9;
        Object k11;
        a8a a8aVar4;
        List list10;
        vr60 vr60Var8;
        y7a y7aVar7;
        w7a w7aVar9;
        v7a v7aVar9;
        b8a b8aVar10;
        CharSequence charSequence10;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                FormattedText formattedText = this.$response.b;
                if (formattedText != null) {
                    ChargersOfferUiStateMapper$prepareChargersOfferContent$2$title$1$1 chargersOfferUiStateMapper$prepareChargersOfferContent$2$title$1$1 = new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$title$1$1(this.this$0, formattedText, null);
                    i = 3;
                    qohVar = tje.h(tseVar, null, null, chargersOfferUiStateMapper$prepareChargersOfferContent$2$title$1$1, 3);
                } else {
                    i = 3;
                    qohVar = null;
                }
                h = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$station$1(this.this$0, this.$response, this.$stationNumber, null), i);
                ChargersOfferResponseDto.Address address = this.$response.d;
                h2 = address != null ? tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$address$1$1(this.this$0, address, null), i) : null;
                ChargersOfferResponseDto chargersOfferResponseDto = this.$response;
                ChargersOfferResponseDto.Banner banner = chargersOfferResponseDto.e;
                if (banner != null) {
                    String str = banner.e;
                    b bVar = this.this$0;
                    String a = (str == null || evu0.J(str)) ? null : ((m7x0) bVar.d).a(str);
                    i2 = 3;
                    nohVar = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$banner$1$1(bVar, banner, a, chargersOfferResponseDto, null), 3);
                } else {
                    i2 = 3;
                    nohVar = null;
                }
                ChargersOfferResponseDto.Header header = this.$response.f;
                h3 = header != null ? tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$header$1$1(this.this$0, header, null), i2) : null;
                ChargersAttentionDto chargersAttentionDto = this.$response.g;
                h4 = chargersAttentionDto != null ? tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$attentionHeader$1$1(chargersAttentionDto, this.this$0, null), i2) : null;
                ChargersOfferResponseDto chargersOfferResponseDto2 = this.$response;
                List list11 = chargersOfferResponseDto2.i.a;
                b bVar2 = this.this$0;
                ArrayList arrayList = new ArrayList(tcc.n(list11, 10));
                Iterator it = list11.iterator();
                while (it.hasNext()) {
                    arrayList.add(tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$pricing$1$1((ChargersOfferResponseDto.Pricing.PlanItem) it.next(), bVar2, chargersOfferResponseDto2, null), 3));
                }
                h5 = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$button$1(this.this$0, this.$authStatus, this.$paymentOptions, this.$response, this.$isMainButtonLoading, null), 3);
                ChargersSurgeDto chargersSurgeDto = this.$response.o;
                h6 = chargersSurgeDto != null ? tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$surge$1$1(this.this$0, chargersSurgeDto, null), 3) : null;
                ChargersTariffDto chargersTariffDto = this.$response.j;
                if (chargersTariffDto != null) {
                    coroutineSingletons = coroutineSingletons3;
                    qohVar2 = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$tariff$1$1(this.this$0, chargersTariffDto, h6, null), 3);
                } else {
                    coroutineSingletons = coroutineSingletons3;
                    qohVar2 = null;
                }
                qoh qohVar8 = qohVar;
                qoh h7 = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$promoPlate$1(this.this$0, this.$response, this.$chargersOfferToggle, null), 3);
                ChargersOfferResponseDto chargersOfferResponseDto3 = this.$response;
                if (chargersOfferResponseDto3.k != null) {
                    qohVar3 = h7;
                    qohVar4 = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$badges$1$1(this.this$0, chargersOfferResponseDto3, h6, null), 3);
                } else {
                    qohVar3 = h7;
                    qohVar4 = null;
                }
                ChargersOfferResponseDto.DiscountsEntryPoint discountsEntryPoint = this.$response.r;
                if (discountsEntryPoint != null) {
                    qohVar5 = qohVar4;
                    nohVar2 = tje.h(tseVar, null, null, new ChargersOfferUiStateMapper$prepareChargersOfferContent$2$discountsEntryPoint$1$1(discountsEntryPoint, this.this$0, null), 3);
                } else {
                    qohVar5 = qohVar4;
                    nohVar2 = null;
                }
                if (qohVar8 == null) {
                    coroutineSingletons2 = coroutineSingletons;
                    nohVar3 = qohVar3;
                    nohVar4 = qohVar5;
                    charSequence = null;
                    collection = arrayList;
                    nohVar6 = h2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar6;
                    this.L$4 = nohVar;
                    this.L$5 = h3;
                    this.L$6 = h4;
                    this.L$7 = collection;
                    this.L$8 = h5;
                    this.L$9 = h6;
                    this.L$10 = qohVar2;
                    this.L$11 = nohVar3;
                    this.L$12 = nohVar4;
                    this.L$13 = nohVar2;
                    this.L$14 = charSequence;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h2;
                this.L$4 = nohVar;
                this.L$5 = h3;
                this.L$6 = h4;
                this.L$7 = arrayList;
                this.L$8 = h5;
                this.L$9 = h6;
                this.L$10 = qohVar2;
                nohVar3 = qohVar3;
                this.L$11 = nohVar3;
                qoh qohVar9 = qohVar5;
                this.L$12 = qohVar9;
                this.L$13 = nohVar2;
                this.label = 1;
                s = qohVar8.s(this);
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                coroutineSingletons2 = coroutineSingletons;
                if (s != coroutineSingletons2) {
                    qohVar6 = qohVar2;
                    qohVar7 = h5;
                    nohVar5 = qohVar9;
                    collection3 = arrayList;
                    charSequence = (CharSequence) s;
                    noh nohVar52 = nohVar5;
                    h5 = qohVar7;
                    qohVar2 = qohVar6;
                    nohVar4 = nohVar52;
                    collection = collection3;
                    nohVar6 = h2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar6;
                    this.L$4 = nohVar;
                    this.L$5 = h3;
                    this.L$6 = h4;
                    this.L$7 = collection;
                    this.L$8 = h5;
                    this.L$9 = h6;
                    this.L$10 = qohVar2;
                    this.L$11 = nohVar3;
                    this.L$12 = nohVar4;
                    this.L$13 = nohVar2;
                    this.L$14 = charSequence;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons2) {
                        noh nohVar53 = nohVar3;
                        nohVar7 = nohVar2;
                        nohVar8 = h3;
                        collection2 = collection;
                        nohVar9 = h6;
                        nohVar10 = nohVar53;
                        nohVar11 = nohVar;
                        nohVar12 = h4;
                        nohVar13 = h5;
                        charSequence2 = charSequence;
                        b8a b8aVar11 = (b8a) k;
                        if (nohVar6 == null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar11;
                            this.L$5 = nohVar8;
                            this.L$6 = nohVar12;
                            this.L$7 = collection2;
                            this.L$8 = nohVar13;
                            this.L$9 = nohVar9;
                            this.L$10 = qohVar2;
                            this.L$11 = nohVar10;
                            this.L$12 = nohVar4;
                            this.L$13 = nohVar7;
                            this.L$14 = charSequence2;
                            this.L$15 = b8aVar11;
                            this.label = 3;
                            k2 = nohVar6.k(this);
                            if (k2 != coroutineSingletons2) {
                                nohVar21 = nohVar8;
                                b8aVar2 = b8aVar11;
                                CharSequence charSequence11 = charSequence2;
                                b8aVar = b8aVar2;
                                v7aVar = (v7a) k2;
                                nohVar14 = nohVar12;
                                collection4 = collection2;
                                nohVar15 = nohVar13;
                                nohVar16 = nohVar9;
                                nohVar17 = qohVar2;
                                nohVar18 = nohVar10;
                                nohVar19 = nohVar4;
                                nohVar20 = nohVar7;
                                charSequence3 = charSequence11;
                                if (nohVar11 != null) {
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = nohVar21;
                                    this.L$6 = nohVar14;
                                    this.L$7 = collection4;
                                    this.L$8 = nohVar15;
                                    this.L$9 = nohVar16;
                                    this.L$10 = nohVar17;
                                    this.L$11 = nohVar18;
                                    this.L$12 = nohVar19;
                                    this.L$13 = nohVar20;
                                    this.L$14 = charSequence3;
                                    this.L$15 = b8aVar;
                                    this.L$16 = v7aVar;
                                    this.label = 4;
                                    k3 = nohVar11.k(this);
                                    break;
                                } else {
                                    nohVar22 = nohVar14;
                                    collection5 = collection4;
                                    nohVar23 = nohVar15;
                                    nohVar24 = nohVar16;
                                    nohVar25 = nohVar17;
                                    nohVar26 = nohVar18;
                                    nohVar27 = nohVar19;
                                    nohVar28 = nohVar20;
                                    charSequence4 = charSequence3;
                                    b8aVar3 = b8aVar;
                                    v7aVar2 = v7aVar;
                                    w7aVar = null;
                                    if (nohVar21 == null) {
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = nohVar22;
                                        this.L$7 = collection5;
                                        this.L$8 = nohVar23;
                                        this.L$9 = nohVar24;
                                        this.L$10 = nohVar25;
                                        this.L$11 = nohVar26;
                                        this.L$12 = nohVar27;
                                        this.L$13 = nohVar28;
                                        this.L$14 = charSequence4;
                                        this.L$15 = b8aVar3;
                                        this.L$16 = v7aVar2;
                                        this.L$17 = w7aVar;
                                        this.label = 5;
                                        k4 = nohVar21.k(this);
                                        break;
                                    } else {
                                        collection6 = collection5;
                                        nohVar29 = nohVar23;
                                        nohVar30 = nohVar24;
                                        nohVar31 = nohVar25;
                                        nohVar32 = nohVar26;
                                        nohVar33 = nohVar27;
                                        nohVar34 = nohVar28;
                                        charSequence5 = charSequence4;
                                        b8aVar4 = b8aVar3;
                                        v7aVar3 = v7aVar2;
                                        w7aVar2 = w7aVar;
                                        y7aVar = null;
                                        if (nohVar22 == null) {
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = collection6;
                                            this.L$8 = nohVar29;
                                            this.L$9 = nohVar30;
                                            this.L$10 = nohVar31;
                                            this.L$11 = nohVar32;
                                            this.L$12 = nohVar33;
                                            this.L$13 = nohVar34;
                                            this.L$14 = charSequence5;
                                            this.L$15 = b8aVar4;
                                            this.L$16 = v7aVar3;
                                            this.L$17 = w7aVar2;
                                            this.L$18 = y7aVar;
                                            this.label = 6;
                                            k5 = nohVar22.k(this);
                                            break;
                                        } else {
                                            nohVar35 = nohVar29;
                                            nohVar36 = nohVar30;
                                            nohVar37 = nohVar32;
                                            nohVar38 = nohVar33;
                                            nohVar39 = nohVar34;
                                            charSequence6 = charSequence5;
                                            b8aVar5 = b8aVar4;
                                            v7aVar4 = v7aVar3;
                                            w7aVar3 = w7aVar2;
                                            y7aVar2 = y7aVar;
                                            vr60Var = null;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = nohVar35;
                                            this.L$9 = nohVar36;
                                            this.L$10 = nohVar31;
                                            this.L$11 = nohVar37;
                                            this.L$12 = nohVar38;
                                            this.L$13 = nohVar39;
                                            this.L$14 = charSequence6;
                                            this.L$15 = b8aVar5;
                                            this.L$16 = v7aVar4;
                                            this.L$17 = w7aVar3;
                                            this.L$18 = y7aVar2;
                                            this.L$19 = vr60Var;
                                            this.label = 7;
                                            b = kotlinx.coroutines.a.b(collection6, this);
                                            if (b != coroutineSingletons2) {
                                                noh nohVar54 = nohVar37;
                                                nohVar40 = nohVar31;
                                                nohVar41 = nohVar54;
                                                List list12 = (List) b;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = null;
                                                this.L$8 = null;
                                                this.L$9 = nohVar36;
                                                this.L$10 = nohVar40;
                                                this.L$11 = nohVar41;
                                                this.L$12 = nohVar38;
                                                this.L$13 = nohVar39;
                                                this.L$14 = charSequence6;
                                                this.L$15 = b8aVar5;
                                                this.L$16 = v7aVar4;
                                                this.L$17 = w7aVar3;
                                                this.L$18 = y7aVar2;
                                                this.L$19 = vr60Var;
                                                this.L$20 = list12;
                                                this.label = 8;
                                                k6 = nohVar35.k(this);
                                                if (k6 != coroutineSingletons2) {
                                                    noh nohVar55 = nohVar41;
                                                    charSequence7 = charSequence6;
                                                    nohVar42 = nohVar55;
                                                    nohVar43 = nohVar36;
                                                    nohVar44 = nohVar40;
                                                    nohVar45 = nohVar39;
                                                    v7aVar5 = v7aVar4;
                                                    w7aVar4 = w7aVar3;
                                                    vr60Var2 = vr60Var;
                                                    nohVar46 = nohVar38;
                                                    b8aVar6 = b8aVar5;
                                                    y7aVar3 = y7aVar2;
                                                    list = list12;
                                                    List list13 = (List) k6;
                                                    if (nohVar44 == null) {
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.L$4 = null;
                                                        this.L$5 = null;
                                                        this.L$6 = null;
                                                        this.L$7 = null;
                                                        this.L$8 = null;
                                                        this.L$9 = nohVar43;
                                                        this.L$10 = null;
                                                        this.L$11 = nohVar42;
                                                        this.L$12 = nohVar46;
                                                        this.L$13 = nohVar45;
                                                        this.L$14 = charSequence7;
                                                        this.L$15 = b8aVar6;
                                                        this.L$16 = v7aVar5;
                                                        this.L$17 = w7aVar4;
                                                        this.L$18 = y7aVar3;
                                                        this.L$19 = vr60Var2;
                                                        this.L$20 = list;
                                                        this.L$21 = list13;
                                                        this.label = 9;
                                                        k7 = nohVar44.k(this);
                                                        if (k7 != coroutineSingletons2) {
                                                            nohVar47 = nohVar42;
                                                            nohVar48 = nohVar46;
                                                            list4 = list13;
                                                            swaVar = (swa) k7;
                                                            List list14 = list;
                                                            list3 = list4;
                                                            nohVar46 = nohVar48;
                                                            w7aVar5 = w7aVar4;
                                                            vr60Var3 = vr60Var2;
                                                            list2 = list14;
                                                            if (nohVar46 != null) {
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.L$2 = null;
                                                                this.L$3 = null;
                                                                this.L$4 = null;
                                                                this.L$5 = null;
                                                                this.L$6 = null;
                                                                this.L$7 = null;
                                                                this.L$8 = null;
                                                                this.L$9 = nohVar43;
                                                                this.L$10 = null;
                                                                this.L$11 = nohVar47;
                                                                this.L$12 = null;
                                                                this.L$13 = nohVar45;
                                                                this.L$14 = charSequence7;
                                                                this.L$15 = b8aVar6;
                                                                this.L$16 = v7aVar5;
                                                                this.L$17 = w7aVar5;
                                                                this.L$18 = y7aVar3;
                                                                this.L$19 = vr60Var3;
                                                                this.L$20 = list2;
                                                                this.L$21 = list3;
                                                                this.L$22 = swaVar;
                                                                this.label = 10;
                                                                k8 = nohVar46.k(this);
                                                                break;
                                                            } else {
                                                                list5 = null;
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.L$2 = null;
                                                                this.L$3 = null;
                                                                this.L$4 = null;
                                                                this.L$5 = null;
                                                                this.L$6 = null;
                                                                this.L$7 = null;
                                                                this.L$8 = null;
                                                                this.L$9 = nohVar43;
                                                                this.L$10 = null;
                                                                this.L$11 = null;
                                                                this.L$12 = null;
                                                                this.L$13 = nohVar45;
                                                                this.L$14 = charSequence7;
                                                                this.L$15 = b8aVar6;
                                                                this.L$16 = v7aVar5;
                                                                this.L$17 = w7aVar5;
                                                                this.L$18 = y7aVar3;
                                                                this.L$19 = vr60Var3;
                                                                this.L$20 = list2;
                                                                this.L$21 = list3;
                                                                this.L$22 = swaVar;
                                                                this.L$23 = list5;
                                                                this.label = 11;
                                                                k9 = nohVar47.k(this);
                                                                if (k9 != coroutineSingletons2) {
                                                                    List list15 = list3;
                                                                    list6 = list5;
                                                                    vr60Var4 = vr60Var3;
                                                                    list7 = list15;
                                                                    b8a b8aVar12 = b8aVar6;
                                                                    w7aVar6 = w7aVar5;
                                                                    nohVar49 = nohVar45;
                                                                    b8aVar7 = b8aVar12;
                                                                    y7a y7aVar8 = y7aVar3;
                                                                    list8 = list2;
                                                                    swaVar2 = swaVar;
                                                                    charSequence8 = charSequence7;
                                                                    v7aVar6 = v7aVar5;
                                                                    y7aVar4 = y7aVar8;
                                                                    nohVar50 = nohVar43;
                                                                    a8aVar = (a8a) k9;
                                                                    if (nohVar50 == null) {
                                                                        this.L$0 = null;
                                                                        this.L$1 = null;
                                                                        this.L$2 = null;
                                                                        this.L$3 = null;
                                                                        this.L$4 = null;
                                                                        this.L$5 = null;
                                                                        this.L$6 = null;
                                                                        this.L$7 = null;
                                                                        this.L$8 = null;
                                                                        this.L$9 = null;
                                                                        this.L$10 = null;
                                                                        this.L$11 = null;
                                                                        this.L$12 = null;
                                                                        this.L$13 = nohVar49;
                                                                        this.L$14 = charSequence8;
                                                                        this.L$15 = b8aVar7;
                                                                        this.L$16 = v7aVar6;
                                                                        this.L$17 = w7aVar6;
                                                                        this.L$18 = y7aVar4;
                                                                        this.L$19 = vr60Var4;
                                                                        this.L$20 = list8;
                                                                        this.L$21 = list7;
                                                                        this.L$22 = swaVar2;
                                                                        this.L$23 = list6;
                                                                        this.L$24 = a8aVar;
                                                                        this.label = 12;
                                                                        k10 = nohVar50.k(this);
                                                                        if (k10 != coroutineSingletons2) {
                                                                            noh nohVar56 = nohVar49;
                                                                            vr60Var6 = vr60Var4;
                                                                            a8aVar2 = a8aVar;
                                                                            nohVar51 = nohVar56;
                                                                            noh nohVar57 = nohVar51;
                                                                            a8aVar = a8aVar2;
                                                                            vvaVar = (vva) k10;
                                                                            charSequence9 = charSequence8;
                                                                            b8aVar8 = b8aVar7;
                                                                            v7aVar7 = v7aVar6;
                                                                            w7aVar7 = w7aVar6;
                                                                            y7aVar5 = y7aVar4;
                                                                            vr60Var5 = vr60Var6;
                                                                            nohVar49 = nohVar57;
                                                                            if (nohVar49 == null) {
                                                                                a8aVar3 = a8aVar;
                                                                                list9 = list8;
                                                                                vr60Var7 = vr60Var5;
                                                                                y7aVar6 = y7aVar5;
                                                                                w7aVar8 = w7aVar7;
                                                                                v7aVar8 = v7aVar7;
                                                                                x7aVar = null;
                                                                                b8aVar9 = b8aVar8;
                                                                                return new c8a(charSequence9, b8aVar9, v7aVar8, w7aVar8, y7aVar6, vr60Var7, list9, list7, swaVar2, list6, a8aVar3, vvaVar, x7aVar);
                                                                            }
                                                                            this.L$0 = null;
                                                                            this.L$1 = null;
                                                                            this.L$2 = null;
                                                                            this.L$3 = null;
                                                                            this.L$4 = null;
                                                                            this.L$5 = null;
                                                                            this.L$6 = null;
                                                                            this.L$7 = null;
                                                                            this.L$8 = null;
                                                                            this.L$9 = null;
                                                                            this.L$10 = null;
                                                                            this.L$11 = null;
                                                                            this.L$12 = null;
                                                                            this.L$13 = null;
                                                                            this.L$14 = charSequence9;
                                                                            this.L$15 = b8aVar8;
                                                                            this.L$16 = v7aVar7;
                                                                            this.L$17 = w7aVar7;
                                                                            this.L$18 = y7aVar5;
                                                                            this.L$19 = vr60Var5;
                                                                            this.L$20 = list8;
                                                                            this.L$21 = list7;
                                                                            this.L$22 = swaVar2;
                                                                            this.L$23 = list6;
                                                                            this.L$24 = a8aVar;
                                                                            this.L$25 = vvaVar;
                                                                            this.label = 13;
                                                                            k11 = nohVar49.k(this);
                                                                            if (k11 != coroutineSingletons2) {
                                                                                a8aVar4 = a8aVar;
                                                                                list10 = list8;
                                                                                vr60Var8 = vr60Var5;
                                                                                y7aVar7 = y7aVar5;
                                                                                w7aVar9 = w7aVar7;
                                                                                v7aVar9 = v7aVar7;
                                                                                b8aVar10 = b8aVar8;
                                                                                charSequence10 = charSequence9;
                                                                                x7aVar = (x7a) k11;
                                                                                a8aVar3 = a8aVar4;
                                                                                list9 = list10;
                                                                                vr60Var7 = vr60Var8;
                                                                                y7aVar6 = y7aVar7;
                                                                                w7aVar8 = w7aVar9;
                                                                                v7aVar8 = v7aVar9;
                                                                                b8aVar9 = b8aVar10;
                                                                                charSequence9 = charSequence10;
                                                                                return new c8a(charSequence9, b8aVar9, v7aVar8, w7aVar8, y7aVar6, vr60Var7, list9, list7, swaVar2, list6, a8aVar3, vvaVar, x7aVar);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        charSequence9 = charSequence8;
                                                                        b8aVar8 = b8aVar7;
                                                                        v7aVar7 = v7aVar6;
                                                                        w7aVar7 = w7aVar6;
                                                                        y7aVar5 = y7aVar4;
                                                                        vr60Var5 = vr60Var4;
                                                                        vvaVar = null;
                                                                        if (nohVar49 == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        nohVar47 = nohVar42;
                                                        w7aVar5 = w7aVar4;
                                                        swaVar = null;
                                                        vr60Var3 = vr60Var2;
                                                        list2 = list;
                                                        list3 = list13;
                                                        if (nohVar46 != null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            nohVar14 = nohVar12;
                            collection4 = collection2;
                            nohVar15 = nohVar13;
                            nohVar16 = nohVar9;
                            nohVar17 = qohVar2;
                            nohVar18 = nohVar10;
                            nohVar19 = nohVar4;
                            nohVar20 = nohVar7;
                            charSequence3 = charSequence2;
                            b8aVar = b8aVar11;
                            nohVar21 = nohVar8;
                            v7aVar = null;
                            if (nohVar11 != null) {
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                nohVar2 = (noh) this.L$13;
                nohVar5 = (noh) this.L$12;
                nohVar3 = (noh) this.L$11;
                ?? r5 = (noh) this.L$10;
                h6 = (noh) this.L$9;
                ?? r8 = (noh) this.L$8;
                Collection collection7 = (List) this.L$7;
                h4 = (noh) this.L$6;
                h3 = (noh) this.L$5;
                nohVar = (noh) this.L$4;
                h2 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                qohVar7 = r8;
                s = obj;
                qohVar6 = r5;
                collection3 = collection7;
                charSequence = (CharSequence) s;
                noh nohVar522 = nohVar5;
                h5 = qohVar7;
                qohVar2 = qohVar6;
                nohVar4 = nohVar522;
                collection = collection3;
                nohVar6 = h2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar6;
                this.L$4 = nohVar;
                this.L$5 = h3;
                this.L$6 = h4;
                this.L$7 = collection;
                this.L$8 = h5;
                this.L$9 = h6;
                this.L$10 = qohVar2;
                this.L$11 = nohVar3;
                this.L$12 = nohVar4;
                this.L$13 = nohVar2;
                this.L$14 = charSequence;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 2:
                CharSequence charSequence12 = (CharSequence) this.L$14;
                noh nohVar58 = (noh) this.L$13;
                nohVar4 = (noh) this.L$12;
                nohVar10 = (noh) this.L$11;
                ?? r82 = (noh) this.L$10;
                nohVar9 = (noh) this.L$9;
                nohVar13 = (noh) this.L$8;
                collection2 = (List) this.L$7;
                nohVar12 = (noh) this.L$6;
                noh nohVar59 = (noh) this.L$5;
                nohVar11 = (noh) this.L$4;
                nohVar6 = (noh) this.L$3;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                qohVar2 = r82;
                nohVar7 = nohVar58;
                charSequence2 = charSequence12;
                nohVar8 = nohVar59;
                k = obj;
                b8a b8aVar112 = (b8a) k;
                if (nohVar6 == null) {
                }
                break;
            case 3:
                b8aVar2 = (b8a) this.L$15;
                charSequence2 = (CharSequence) this.L$14;
                nohVar7 = (noh) this.L$13;
                nohVar4 = (noh) this.L$12;
                nohVar10 = (noh) this.L$11;
                ?? r83 = (noh) this.L$10;
                nohVar9 = (noh) this.L$9;
                nohVar13 = (noh) this.L$8;
                collection2 = (List) this.L$7;
                nohVar12 = (noh) this.L$6;
                noh nohVar60 = (noh) this.L$5;
                nohVar11 = (noh) this.L$4;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                qohVar2 = r83;
                nohVar21 = nohVar60;
                k2 = obj;
                CharSequence charSequence112 = charSequence2;
                b8aVar = b8aVar2;
                v7aVar = (v7a) k2;
                nohVar14 = nohVar12;
                collection4 = collection2;
                nohVar15 = nohVar13;
                nohVar16 = nohVar9;
                nohVar17 = qohVar2;
                nohVar18 = nohVar10;
                nohVar19 = nohVar4;
                nohVar20 = nohVar7;
                charSequence3 = charSequence112;
                if (nohVar11 != null) {
                }
                break;
            case 4:
                v7aVar = (v7a) this.L$16;
                b8aVar = (b8a) this.L$15;
                charSequence3 = (CharSequence) this.L$14;
                nohVar20 = (noh) this.L$13;
                nohVar19 = (noh) this.L$12;
                noh nohVar61 = (noh) this.L$11;
                nohVar17 = (noh) this.L$10;
                nohVar16 = (noh) this.L$9;
                nohVar15 = (noh) this.L$8;
                collection4 = (List) this.L$7;
                nohVar14 = (noh) this.L$6;
                noh nohVar62 = (noh) this.L$5;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                nohVar18 = nohVar61;
                nohVar21 = nohVar62;
                k3 = obj;
                b8a b8aVar13 = b8aVar;
                v7aVar2 = v7aVar;
                w7aVar = (w7a) k3;
                nohVar22 = nohVar14;
                collection5 = collection4;
                nohVar23 = nohVar15;
                nohVar24 = nohVar16;
                nohVar25 = nohVar17;
                nohVar26 = nohVar18;
                nohVar27 = nohVar19;
                nohVar28 = nohVar20;
                charSequence4 = charSequence3;
                b8aVar3 = b8aVar13;
                if (nohVar21 == null) {
                }
                break;
            case 5:
                w7aVar = (w7a) this.L$17;
                v7aVar2 = (v7a) this.L$16;
                b8aVar3 = (b8a) this.L$15;
                charSequence4 = (CharSequence) this.L$14;
                nohVar28 = (noh) this.L$13;
                noh nohVar63 = (noh) this.L$12;
                nohVar26 = (noh) this.L$11;
                nohVar25 = (noh) this.L$10;
                nohVar24 = (noh) this.L$9;
                nohVar23 = (noh) this.L$8;
                collection5 = (List) this.L$7;
                nohVar22 = (noh) this.L$6;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                nohVar27 = nohVar63;
                k4 = obj;
                v7a v7aVar10 = v7aVar2;
                w7aVar2 = w7aVar;
                y7aVar = (y7a) k4;
                collection6 = collection5;
                nohVar29 = nohVar23;
                nohVar30 = nohVar24;
                nohVar31 = nohVar25;
                nohVar32 = nohVar26;
                nohVar33 = nohVar27;
                nohVar34 = nohVar28;
                charSequence5 = charSequence4;
                b8aVar4 = b8aVar3;
                v7aVar3 = v7aVar10;
                if (nohVar22 == null) {
                }
                break;
            case 6:
                y7aVar = (y7a) this.L$18;
                w7aVar2 = (w7a) this.L$17;
                v7aVar3 = (v7a) this.L$16;
                b8aVar4 = (b8a) this.L$15;
                charSequence5 = (CharSequence) this.L$14;
                noh nohVar64 = (noh) this.L$13;
                nohVar33 = (noh) this.L$12;
                nohVar32 = (noh) this.L$11;
                nohVar31 = (noh) this.L$10;
                nohVar30 = (noh) this.L$9;
                nohVar29 = (noh) this.L$8;
                Collection collection8 = (List) this.L$7;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                nohVar34 = nohVar64;
                collection6 = collection8;
                k5 = obj;
                w7a w7aVar10 = w7aVar2;
                y7aVar2 = y7aVar;
                vr60Var = (vr60) k5;
                nohVar35 = nohVar29;
                nohVar36 = nohVar30;
                nohVar37 = nohVar32;
                nohVar38 = nohVar33;
                nohVar39 = nohVar34;
                charSequence6 = charSequence5;
                b8aVar5 = b8aVar4;
                v7aVar4 = v7aVar3;
                w7aVar3 = w7aVar10;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = nohVar35;
                this.L$9 = nohVar36;
                this.L$10 = nohVar31;
                this.L$11 = nohVar37;
                this.L$12 = nohVar38;
                this.L$13 = nohVar39;
                this.L$14 = charSequence6;
                this.L$15 = b8aVar5;
                this.L$16 = v7aVar4;
                this.L$17 = w7aVar3;
                this.L$18 = y7aVar2;
                this.L$19 = vr60Var;
                this.label = 7;
                b = kotlinx.coroutines.a.b(collection6, this);
                if (b != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 7:
                vr60Var = (vr60) this.L$19;
                y7aVar2 = (y7a) this.L$18;
                w7aVar3 = (w7a) this.L$17;
                v7aVar4 = (v7a) this.L$16;
                b8aVar5 = (b8a) this.L$15;
                CharSequence charSequence13 = (CharSequence) this.L$14;
                nohVar39 = (noh) this.L$13;
                nohVar38 = (noh) this.L$12;
                nohVar41 = (noh) this.L$11;
                nohVar40 = (noh) this.L$10;
                nohVar36 = (noh) this.L$9;
                nohVar35 = (noh) this.L$8;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                charSequence6 = charSequence13;
                b = obj;
                List list122 = (List) b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = nohVar36;
                this.L$10 = nohVar40;
                this.L$11 = nohVar41;
                this.L$12 = nohVar38;
                this.L$13 = nohVar39;
                this.L$14 = charSequence6;
                this.L$15 = b8aVar5;
                this.L$16 = v7aVar4;
                this.L$17 = w7aVar3;
                this.L$18 = y7aVar2;
                this.L$19 = vr60Var;
                this.L$20 = list122;
                this.label = 8;
                k6 = nohVar35.k(this);
                if (k6 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 8:
                List list16 = (List) this.L$20;
                vr60 vr60Var9 = (vr60) this.L$19;
                y7a y7aVar9 = (y7a) this.L$18;
                w7aVar4 = (w7a) this.L$17;
                v7a v7aVar11 = (v7a) this.L$16;
                b8a b8aVar14 = (b8a) this.L$15;
                CharSequence charSequence14 = (CharSequence) this.L$14;
                noh nohVar65 = (noh) this.L$13;
                noh nohVar66 = (noh) this.L$12;
                noh nohVar67 = (noh) this.L$11;
                nohVar44 = (noh) this.L$10;
                noh nohVar68 = (noh) this.L$9;
                kotlin.b.b(obj);
                list = list16;
                nohVar46 = nohVar66;
                charSequence7 = charSequence14;
                v7aVar5 = v7aVar11;
                y7aVar3 = y7aVar9;
                vr60Var2 = vr60Var9;
                coroutineSingletons2 = coroutineSingletons3;
                nohVar42 = nohVar67;
                nohVar45 = nohVar65;
                b8aVar6 = b8aVar14;
                nohVar43 = nohVar68;
                k6 = obj;
                List list132 = (List) k6;
                if (nohVar44 == null) {
                }
                break;
            case 9:
                list4 = (List) this.L$21;
                list = (List) this.L$20;
                vr60Var2 = (vr60) this.L$19;
                y7aVar3 = (y7a) this.L$18;
                w7a w7aVar11 = (w7a) this.L$17;
                v7aVar5 = (v7a) this.L$16;
                b8aVar6 = (b8a) this.L$15;
                charSequence7 = (CharSequence) this.L$14;
                nohVar45 = (noh) this.L$13;
                noh nohVar69 = (noh) this.L$12;
                nohVar47 = (noh) this.L$11;
                nohVar43 = (noh) this.L$9;
                kotlin.b.b(obj);
                w7aVar4 = w7aVar11;
                coroutineSingletons2 = coroutineSingletons3;
                nohVar48 = nohVar69;
                k7 = obj;
                swaVar = (swa) k7;
                List list142 = list;
                list3 = list4;
                nohVar46 = nohVar48;
                w7aVar5 = w7aVar4;
                vr60Var3 = vr60Var2;
                list2 = list142;
                if (nohVar46 != null) {
                }
                break;
            case 10:
                swa swaVar3 = (swa) this.L$22;
                list3 = (List) this.L$21;
                list2 = (List) this.L$20;
                vr60Var3 = (vr60) this.L$19;
                y7aVar3 = (y7a) this.L$18;
                w7a w7aVar12 = (w7a) this.L$17;
                v7aVar5 = (v7a) this.L$16;
                b8aVar6 = (b8a) this.L$15;
                charSequence7 = (CharSequence) this.L$14;
                nohVar45 = (noh) this.L$13;
                noh nohVar70 = (noh) this.L$11;
                noh nohVar71 = (noh) this.L$9;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                w7aVar5 = w7aVar12;
                nohVar43 = nohVar71;
                nohVar47 = nohVar70;
                swaVar = swaVar3;
                k8 = obj;
                list5 = (List) k8;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = nohVar43;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = nohVar45;
                this.L$14 = charSequence7;
                this.L$15 = b8aVar6;
                this.L$16 = v7aVar5;
                this.L$17 = w7aVar5;
                this.L$18 = y7aVar3;
                this.L$19 = vr60Var3;
                this.L$20 = list2;
                this.L$21 = list3;
                this.L$22 = swaVar;
                this.L$23 = list5;
                this.label = 11;
                k9 = nohVar47.k(this);
                if (k9 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 11:
                List list17 = (List) this.L$23;
                swa swaVar4 = (swa) this.L$22;
                List list18 = (List) this.L$21;
                List list19 = (List) this.L$20;
                vr60 vr60Var10 = (vr60) this.L$19;
                y7a y7aVar10 = (y7a) this.L$18;
                w7a w7aVar13 = (w7a) this.L$17;
                v7a v7aVar12 = (v7a) this.L$16;
                b8a b8aVar15 = (b8a) this.L$15;
                CharSequence charSequence15 = (CharSequence) this.L$14;
                noh nohVar72 = (noh) this.L$13;
                nohVar50 = (noh) this.L$9;
                kotlin.b.b(obj);
                list6 = list17;
                vr60Var4 = vr60Var10;
                list8 = list19;
                list7 = list18;
                swaVar2 = swaVar4;
                coroutineSingletons2 = coroutineSingletons3;
                nohVar49 = nohVar72;
                charSequence8 = charSequence15;
                b8aVar7 = b8aVar15;
                v7aVar6 = v7aVar12;
                w7aVar6 = w7aVar13;
                y7aVar4 = y7aVar10;
                k9 = obj;
                a8aVar = (a8a) k9;
                if (nohVar50 == null) {
                }
                break;
            case 12:
                a8aVar2 = (a8a) this.L$24;
                list6 = (List) this.L$23;
                swaVar2 = (swa) this.L$22;
                list7 = (List) this.L$21;
                list8 = (List) this.L$20;
                vr60 vr60Var11 = (vr60) this.L$19;
                y7aVar4 = (y7a) this.L$18;
                w7aVar6 = (w7a) this.L$17;
                v7aVar6 = (v7a) this.L$16;
                b8aVar7 = (b8a) this.L$15;
                charSequence8 = (CharSequence) this.L$14;
                noh nohVar73 = (noh) this.L$13;
                kotlin.b.b(obj);
                coroutineSingletons2 = coroutineSingletons3;
                vr60Var6 = vr60Var11;
                nohVar51 = nohVar73;
                k10 = obj;
                noh nohVar572 = nohVar51;
                a8aVar = a8aVar2;
                vvaVar = (vva) k10;
                charSequence9 = charSequence8;
                b8aVar8 = b8aVar7;
                v7aVar7 = v7aVar6;
                w7aVar7 = w7aVar6;
                y7aVar5 = y7aVar4;
                vr60Var5 = vr60Var6;
                nohVar49 = nohVar572;
                if (nohVar49 == null) {
                }
                break;
            case 13:
                vvaVar = (vva) this.L$25;
                a8aVar4 = (a8a) this.L$24;
                list6 = (List) this.L$23;
                swaVar2 = (swa) this.L$22;
                list7 = (List) this.L$21;
                list10 = (List) this.L$20;
                vr60Var8 = (vr60) this.L$19;
                y7aVar7 = (y7a) this.L$18;
                w7aVar9 = (w7a) this.L$17;
                v7aVar9 = (v7a) this.L$16;
                b8aVar10 = (b8a) this.L$15;
                charSequence10 = (CharSequence) this.L$14;
                kotlin.b.b(obj);
                k11 = obj;
                x7aVar = (x7a) k11;
                a8aVar3 = a8aVar4;
                list9 = list10;
                vr60Var7 = vr60Var8;
                y7aVar6 = y7aVar7;
                w7aVar8 = w7aVar9;
                v7aVar8 = v7aVar9;
                b8aVar9 = b8aVar10;
                charSequence9 = charSequence10;
                return new c8a(charSequence9, b8aVar9, v7aVar8, w7aVar8, y7aVar6, vr60Var7, list9, list7, swaVar2, list6, a8aVar3, vvaVar, x7aVar);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
