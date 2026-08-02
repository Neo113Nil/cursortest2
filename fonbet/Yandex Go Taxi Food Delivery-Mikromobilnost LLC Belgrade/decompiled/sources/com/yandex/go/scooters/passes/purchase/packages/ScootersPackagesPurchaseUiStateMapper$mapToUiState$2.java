package com.yandex.go.scooters.passes.purchase.packages;

import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a9o0;
import defpackage.afo0;
import defpackage.b9o0;
import defpackage.bfo0;
import defpackage.d8o0;
import defpackage.e8o0;
import defpackage.g8o0;
import defpackage.h8o0;
import defpackage.hfa0;
import defpackage.m8o0;
import defpackage.mvg;
import defpackage.n8o0;
import defpackage.noh;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.o8o0;
import defpackage.p8o0;
import defpackage.qoh;
import defpackage.r8o0;
import defpackage.s8o0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8o0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lp8o0;", "<anonymous>", "(Ltse;)Lp8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$mapToUiState$2", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {66, 67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69, 70, 71, 72, HProv.ALG_SID_GR3410_12_256, 74, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPackagesLegalTermsExperiment $legalTermsExperiment;
    final /* synthetic */ b9o0 $packagesPurchaseWindow;
    final /* synthetic */ hfa0 $paymentOptions;
    final /* synthetic */ boolean $purchaseInProgress;
    final /* synthetic */ bfo0 $purchaseStatus;
    final /* synthetic */ String $selectedPackageId;
    int I$0;
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
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$mapToUiState$2(boolean z, bfo0 bfo0Var, b9o0 b9o0Var, i iVar, String str, hfa0 hfa0Var, ScootersPackagesLegalTermsExperiment scootersPackagesLegalTermsExperiment, Continuation continuation) {
        super(2, continuation);
        this.$purchaseInProgress = z;
        this.$purchaseStatus = bfo0Var;
        this.$packagesPurchaseWindow = b9o0Var;
        this.this$0 = iVar;
        this.$selectedPackageId = str;
        this.$paymentOptions = hfa0Var;
        this.$legalTermsExperiment = scootersPackagesLegalTermsExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPackagesPurchaseUiStateMapper$mapToUiState$2 scootersPackagesPurchaseUiStateMapper$mapToUiState$2 = new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2(this.$purchaseInProgress, this.$purchaseStatus, this.$packagesPurchaseWindow, this.this$0, this.$selectedPackageId, this.$paymentOptions, this.$legalTermsExperiment, continuation);
        scootersPackagesPurchaseUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersPackagesPurchaseUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0591, code lost:
    
        if (r2 == r13) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04d9, code lost:
    
        if (r5 == r13) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x061c  */
    /* JADX WARN: Type inference failed for: r10v11, types: [noh] */
    /* JADX WARN: Type inference failed for: r11v12, types: [noh] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v12, types: [noh] */
    /* JADX WARN: Type inference failed for: r13v17, types: [noh] */
    /* JADX WARN: Type inference failed for: r14v18, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r12;
        noh h;
        String str;
        qoh qohVar;
        qoh qohVar2;
        qoh qohVar3;
        noh h2;
        Object s;
        CoroutineSingletons coroutineSingletons;
        noh nohVar;
        int i;
        noh nohVar2;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        Object k;
        noh nohVar6;
        noh nohVar7;
        noh nohVar8;
        noh nohVar9;
        CharSequence charSequence;
        noh nohVar10;
        noh nohVar11;
        noh nohVar12;
        noh nohVar13;
        noh nohVar14;
        CharSequence charSequence2;
        noh nohVar15;
        noh nohVar16;
        CharSequence charSequence3;
        d8o0 d8o0Var;
        Object k2;
        noh nohVar17;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object k3;
        qoh qohVar4;
        noh nohVar18;
        noh nohVar19;
        noh nohVar20;
        noh nohVar21;
        noh nohVar22;
        CharSequence charSequence6;
        CharSequence charSequence7;
        d8o0 d8o0Var2;
        nvi0 nvi0Var;
        e8o0 e8o0Var;
        Object k4;
        n8o0 n8o0Var;
        Object k5;
        nvi0 nvi0Var2;
        noh nohVar23;
        noh nohVar24;
        CharSequence charSequence8;
        noh nohVar25;
        noh nohVar26;
        CharSequence charSequence9;
        d8o0 d8o0Var3;
        e8o0 e8o0Var2;
        e8o0 e8o0Var3;
        List list;
        noh nohVar27;
        CharSequence charSequence10;
        CharSequence charSequence11;
        d8o0 d8o0Var4;
        nvi0 nvi0Var3;
        noh nohVar28;
        g8o0 g8o0Var;
        Object k6;
        List list2;
        Object k7;
        Object k8;
        m8o0 m8o0Var;
        CharSequence charSequence12;
        CharSequence charSequence13;
        d8o0 d8o0Var5;
        nvi0 nvi0Var4;
        e8o0 e8o0Var4;
        List list3;
        g8o0 g8o0Var2;
        noh nohVar29;
        Object k9;
        o8o0 o8o0Var;
        d8o0 d8o0Var6;
        e8o0 e8o0Var5;
        nvi0 nvi0Var5;
        m8o0 m8o0Var2;
        g8o0 g8o0Var3;
        CharSequence charSequence14;
        CharSequence charSequence15;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                if (!this.$purchaseInProgress) {
                    bfo0 bfo0Var = this.$purchaseStatus;
                    if (!(bfo0Var instanceof afo0) || ((afo0) bfo0Var).b != ScootersPassesPendingPurchaseStatus$PackageType.MINUTES_PACKAGE) {
                        r12 = 0;
                        qoh h3 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$packagesPurchaseWindow, null), 3);
                        h = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$packagesPurchaseWindow, null), 3);
                        r8o0 r8o0Var = this.$packagesPurchaseWindow.c;
                        qoh h4 = r8o0Var == null ? tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$badgeAsync$1$1(this.this$0, r8o0Var, null), 3) : null;
                        str = this.$packagesPurchaseWindow.d;
                        if (str != null) {
                            a9o0 a9o0Var = new a9o0(str);
                            if (str.length() <= 0) {
                                a9o0Var = null;
                            }
                            String str2 = a9o0Var != null ? a9o0Var.a : null;
                            if (str2 != null) {
                                qohVar = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$promoAsync$2$1(this.this$0, str2, null), 3);
                                s8o0 s8o0Var = this.$packagesPurchaseWindow.e;
                                qoh h5 = s8o0Var != null ? tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$contextAsync$1$1(this.this$0, s8o0Var, null), 3) : null;
                                qoh h6 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$packagesAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, null), 3);
                                u8o0 u8o0Var = this.$packagesPurchaseWindow.g;
                                qoh h7 = u8o0Var != null ? tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$detailsAsync$1$1(u8o0Var, this.this$0, null), 3) : null;
                                qohVar2 = h6;
                                qohVar3 = h5;
                                h2 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, r12, null), 3);
                                qoh h8 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$paymentMethodButtonAsync$1(this.$paymentOptions, this.this$0, null), 3);
                                qoh h9 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$legalTermsAsync$1(this.this$0, this.$legalTermsExperiment, null), 3);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = h;
                                this.L$3 = h4;
                                this.L$4 = qohVar;
                                this.L$5 = qohVar3;
                                this.L$6 = qohVar2;
                                this.L$7 = h7;
                                this.L$8 = h2;
                                this.L$9 = h8;
                                this.L$10 = h9;
                                this.I$0 = r12;
                                this.label = 1;
                                s = h3.s(this);
                                coroutineSingletons = coroutineSingletons2;
                                if (s != coroutineSingletons) {
                                    nohVar = h9;
                                    i = r12;
                                    nohVar2 = qohVar;
                                    nohVar3 = h4;
                                    nohVar4 = h8;
                                    nohVar5 = h7;
                                    CharSequence charSequence16 = (CharSequence) s;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = nohVar3;
                                    this.L$4 = nohVar2;
                                    this.L$5 = qohVar3;
                                    this.L$6 = qohVar2;
                                    this.L$7 = nohVar5;
                                    this.L$8 = h2;
                                    this.L$9 = nohVar4;
                                    this.L$10 = nohVar;
                                    this.L$11 = charSequence16;
                                    this.I$0 = i;
                                    this.label = 2;
                                    k = h.k(this);
                                    if (k != coroutineSingletons) {
                                        nohVar6 = nohVar2;
                                        nohVar7 = qohVar2;
                                        nohVar8 = h2;
                                        nohVar9 = nohVar;
                                        charSequence = charSequence16;
                                        nohVar10 = nohVar5;
                                        nohVar11 = nohVar4;
                                        CharSequence charSequence17 = (CharSequence) k;
                                        if (nohVar3 == null) {
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = nohVar6;
                                            this.L$5 = qohVar3;
                                            this.L$6 = nohVar7;
                                            this.L$7 = nohVar10;
                                            this.L$8 = nohVar8;
                                            this.L$9 = nohVar11;
                                            this.L$10 = nohVar9;
                                            this.L$11 = charSequence;
                                            this.L$12 = charSequence17;
                                            this.I$0 = i;
                                            this.label = 3;
                                            k2 = nohVar3.k(this);
                                            if (k2 != coroutineSingletons) {
                                                nohVar17 = nohVar8;
                                                charSequence4 = charSequence;
                                                charSequence5 = charSequence17;
                                                d8o0 d8o0Var7 = (d8o0) k2;
                                                noh nohVar30 = nohVar9;
                                                charSequence3 = charSequence4;
                                                nohVar13 = nohVar7;
                                                nohVar14 = nohVar10;
                                                nohVar12 = nohVar17;
                                                nohVar15 = nohVar11;
                                                nohVar16 = nohVar30;
                                                charSequence2 = charSequence5;
                                                d8o0Var = d8o0Var7;
                                                if (nohVar6 != null) {
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = qohVar3;
                                                    this.L$6 = nohVar13;
                                                    this.L$7 = nohVar14;
                                                    this.L$8 = nohVar12;
                                                    this.L$9 = nohVar15;
                                                    this.L$10 = nohVar16;
                                                    this.L$11 = charSequence3;
                                                    this.L$12 = charSequence2;
                                                    this.L$13 = d8o0Var;
                                                    this.I$0 = i;
                                                    this.label = 4;
                                                    k3 = nohVar6.k(this);
                                                    if (k3 != coroutineSingletons) {
                                                        qohVar4 = qohVar3;
                                                        n8o0Var = (n8o0) k3;
                                                        if (n8o0Var == null) {
                                                            qohVar3 = qohVar4;
                                                            nohVar18 = nohVar13;
                                                            nohVar19 = nohVar14;
                                                            nohVar20 = nohVar12;
                                                            nohVar21 = nohVar15;
                                                            nohVar22 = nohVar16;
                                                            charSequence6 = charSequence3;
                                                            charSequence7 = charSequence2;
                                                            d8o0Var2 = d8o0Var;
                                                            nvi0Var = n8o0Var.a;
                                                            if (qohVar3 == null) {
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.L$2 = null;
                                                                this.L$3 = null;
                                                                this.L$4 = null;
                                                                this.L$5 = null;
                                                                this.L$6 = nohVar18;
                                                                this.L$7 = nohVar19;
                                                                this.L$8 = nohVar20;
                                                                this.L$9 = nohVar21;
                                                                this.L$10 = nohVar22;
                                                                this.L$11 = charSequence6;
                                                                this.L$12 = charSequence7;
                                                                this.L$13 = d8o0Var2;
                                                                this.L$14 = nvi0Var;
                                                                this.I$0 = i;
                                                                this.label = 5;
                                                                k4 = qohVar3.k(this);
                                                                break;
                                                            } else {
                                                                e8o0Var = null;
                                                                this.L$0 = null;
                                                                this.L$1 = null;
                                                                this.L$2 = null;
                                                                this.L$3 = null;
                                                                this.L$4 = null;
                                                                this.L$5 = null;
                                                                this.L$6 = null;
                                                                this.L$7 = nohVar19;
                                                                this.L$8 = nohVar20;
                                                                this.L$9 = nohVar21;
                                                                this.L$10 = nohVar22;
                                                                this.L$11 = charSequence6;
                                                                this.L$12 = charSequence7;
                                                                this.L$13 = d8o0Var2;
                                                                this.L$14 = nvi0Var;
                                                                this.L$15 = e8o0Var;
                                                                this.I$0 = i;
                                                                this.label = 6;
                                                                k5 = nohVar18.k(this);
                                                                if (k5 != coroutineSingletons) {
                                                                    CharSequence charSequence18 = charSequence7;
                                                                    nvi0Var2 = nvi0Var;
                                                                    nohVar23 = nohVar20;
                                                                    nohVar24 = nohVar22;
                                                                    charSequence8 = charSequence18;
                                                                    nohVar25 = nohVar19;
                                                                    nohVar26 = nohVar21;
                                                                    charSequence9 = charSequence6;
                                                                    d8o0Var3 = d8o0Var2;
                                                                    e8o0Var2 = e8o0Var;
                                                                    List list4 = (List) k5;
                                                                    if (nohVar25 == null) {
                                                                        this.L$0 = null;
                                                                        this.L$1 = null;
                                                                        this.L$2 = null;
                                                                        this.L$3 = null;
                                                                        this.L$4 = null;
                                                                        this.L$5 = null;
                                                                        this.L$6 = null;
                                                                        this.L$7 = null;
                                                                        this.L$8 = nohVar23;
                                                                        this.L$9 = nohVar26;
                                                                        this.L$10 = nohVar24;
                                                                        this.L$11 = charSequence9;
                                                                        this.L$12 = charSequence8;
                                                                        this.L$13 = d8o0Var3;
                                                                        this.L$14 = nvi0Var2;
                                                                        this.L$15 = e8o0Var2;
                                                                        this.L$16 = list4;
                                                                        this.I$0 = i;
                                                                        this.label = 7;
                                                                        k6 = nohVar25.k(this);
                                                                        if (k6 != coroutineSingletons) {
                                                                            nohVar28 = nohVar23;
                                                                            list2 = list4;
                                                                            nohVar27 = nohVar24;
                                                                            charSequence10 = charSequence9;
                                                                            charSequence11 = charSequence8;
                                                                            d8o0Var4 = d8o0Var3;
                                                                            nvi0Var3 = nvi0Var2;
                                                                            e8o0Var3 = e8o0Var2;
                                                                            list = list2;
                                                                            g8o0Var = (g8o0) k6;
                                                                            this.L$0 = null;
                                                                            this.L$1 = null;
                                                                            this.L$2 = null;
                                                                            this.L$3 = null;
                                                                            this.L$4 = null;
                                                                            this.L$5 = null;
                                                                            this.L$6 = null;
                                                                            this.L$7 = null;
                                                                            this.L$8 = nohVar28;
                                                                            this.L$9 = null;
                                                                            this.L$10 = nohVar27;
                                                                            this.L$11 = charSequence10;
                                                                            this.L$12 = charSequence11;
                                                                            this.L$13 = d8o0Var4;
                                                                            this.L$14 = nvi0Var3;
                                                                            this.L$15 = e8o0Var3;
                                                                            this.L$16 = list;
                                                                            this.L$17 = g8o0Var;
                                                                            this.I$0 = i;
                                                                            this.label = 8;
                                                                            k7 = nohVar26.k(this);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        nvi0 nvi0Var6 = nvi0Var2;
                                                                        e8o0Var3 = e8o0Var2;
                                                                        list = list4;
                                                                        nohVar27 = nohVar24;
                                                                        charSequence10 = charSequence9;
                                                                        charSequence11 = charSequence8;
                                                                        d8o0Var4 = d8o0Var3;
                                                                        nvi0Var3 = nvi0Var6;
                                                                        nohVar28 = nohVar23;
                                                                        g8o0Var = null;
                                                                        this.L$0 = null;
                                                                        this.L$1 = null;
                                                                        this.L$2 = null;
                                                                        this.L$3 = null;
                                                                        this.L$4 = null;
                                                                        this.L$5 = null;
                                                                        this.L$6 = null;
                                                                        this.L$7 = null;
                                                                        this.L$8 = nohVar28;
                                                                        this.L$9 = null;
                                                                        this.L$10 = nohVar27;
                                                                        this.L$11 = charSequence10;
                                                                        this.L$12 = charSequence11;
                                                                        this.L$13 = d8o0Var4;
                                                                        this.L$14 = nvi0Var3;
                                                                        this.L$15 = e8o0Var3;
                                                                        this.L$16 = list;
                                                                        this.L$17 = g8o0Var;
                                                                        this.I$0 = i;
                                                                        this.label = 8;
                                                                        k7 = nohVar26.k(this);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            qohVar3 = qohVar4;
                                                        }
                                                    }
                                                }
                                                nohVar18 = nohVar13;
                                                nohVar19 = nohVar14;
                                                nohVar20 = nohVar12;
                                                nohVar21 = nohVar15;
                                                nohVar22 = nohVar16;
                                                charSequence6 = charSequence3;
                                                charSequence7 = charSequence2;
                                                d8o0Var2 = d8o0Var;
                                                nvi0Var = null;
                                                if (qohVar3 == null) {
                                                }
                                            }
                                        } else {
                                            noh nohVar31 = nohVar10;
                                            nohVar12 = nohVar8;
                                            nohVar13 = nohVar7;
                                            nohVar14 = nohVar31;
                                            charSequence2 = charSequence17;
                                            nohVar15 = nohVar11;
                                            nohVar16 = nohVar9;
                                            charSequence3 = charSequence;
                                            d8o0Var = null;
                                            if (nohVar6 != null) {
                                            }
                                            nohVar18 = nohVar13;
                                            nohVar19 = nohVar14;
                                            nohVar20 = nohVar12;
                                            nohVar21 = nohVar15;
                                            nohVar22 = nohVar16;
                                            charSequence6 = charSequence3;
                                            charSequence7 = charSequence2;
                                            d8o0Var2 = d8o0Var;
                                            nvi0Var = null;
                                            if (qohVar3 == null) {
                                            }
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        qohVar = null;
                        s8o0 s8o0Var2 = this.$packagesPurchaseWindow.e;
                        if (s8o0Var2 != null) {
                        }
                        qoh h62 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$packagesAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, null), 3);
                        u8o0 u8o0Var2 = this.$packagesPurchaseWindow.g;
                        qoh h72 = u8o0Var2 != null ? tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$detailsAsync$1$1(u8o0Var2, this.this$0, null), 3) : null;
                        qohVar2 = h62;
                        qohVar3 = h5;
                        h2 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, r12, null), 3);
                        qoh h82 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$paymentMethodButtonAsync$1(this.$paymentOptions, this.this$0, null), 3);
                        qoh h92 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$legalTermsAsync$1(this.this$0, this.$legalTermsExperiment, null), 3);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = h;
                        this.L$3 = h4;
                        this.L$4 = qohVar;
                        this.L$5 = qohVar3;
                        this.L$6 = qohVar2;
                        this.L$7 = h72;
                        this.L$8 = h2;
                        this.L$9 = h82;
                        this.L$10 = h92;
                        this.I$0 = r12;
                        this.label = 1;
                        s = h3.s(this);
                        coroutineSingletons = coroutineSingletons2;
                        if (s != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                }
                r12 = 1;
                qoh h32 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$packagesPurchaseWindow, null), 3);
                h = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$packagesPurchaseWindow, null), 3);
                r8o0 r8o0Var2 = this.$packagesPurchaseWindow.c;
                if (r8o0Var2 == null) {
                }
                str = this.$packagesPurchaseWindow.d;
                if (str != null) {
                }
                qohVar = null;
                s8o0 s8o0Var22 = this.$packagesPurchaseWindow.e;
                if (s8o0Var22 != null) {
                }
                qoh h622 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$packagesAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, null), 3);
                u8o0 u8o0Var22 = this.$packagesPurchaseWindow.g;
                qoh h722 = u8o0Var22 != null ? tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$detailsAsync$1$1(u8o0Var22, this.this$0, null), 3) : null;
                qohVar2 = h622;
                qohVar3 = h5;
                h2 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$purchaseButtonAsync$1(this.this$0, this.$packagesPurchaseWindow, this.$selectedPackageId, r12, null), 3);
                qoh h822 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$paymentMethodButtonAsync$1(this.$paymentOptions, this.this$0, null), 3);
                qoh h922 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$mapToUiState$2$legalTermsAsync$1(this.this$0, this.$legalTermsExperiment, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h4;
                this.L$4 = qohVar;
                this.L$5 = qohVar3;
                this.L$6 = qohVar2;
                this.L$7 = h722;
                this.L$8 = h2;
                this.L$9 = h822;
                this.L$10 = h922;
                this.I$0 = r12;
                this.label = 1;
                s = h32.s(this);
                coroutineSingletons = coroutineSingletons2;
                if (s != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 1:
                i = this.I$0;
                nohVar = (noh) this.L$10;
                nohVar4 = (noh) this.L$9;
                h2 = (noh) this.L$8;
                nohVar5 = (noh) this.L$7;
                ?? r10 = (noh) this.L$6;
                ?? r11 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                noh nohVar32 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                qohVar3 = r11;
                nohVar3 = nohVar32;
                s = obj;
                coroutineSingletons = coroutineSingletons2;
                qohVar2 = r10;
                CharSequence charSequence162 = (CharSequence) s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar3;
                this.L$4 = nohVar2;
                this.L$5 = qohVar3;
                this.L$6 = qohVar2;
                this.L$7 = nohVar5;
                this.L$8 = h2;
                this.L$9 = nohVar4;
                this.L$10 = nohVar;
                this.L$11 = charSequence162;
                this.I$0 = i;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                i = this.I$0;
                charSequence = (CharSequence) this.L$11;
                nohVar9 = (noh) this.L$10;
                nohVar11 = (noh) this.L$9;
                noh nohVar33 = (noh) this.L$8;
                nohVar10 = (noh) this.L$7;
                nohVar7 = (noh) this.L$6;
                ?? r13 = (noh) this.L$5;
                nohVar6 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                kotlin.b.b(obj);
                qohVar3 = r13;
                coroutineSingletons = coroutineSingletons2;
                nohVar8 = nohVar33;
                k = obj;
                CharSequence charSequence172 = (CharSequence) k;
                if (nohVar3 == null) {
                }
                break;
            case 3:
                i = this.I$0;
                charSequence5 = (CharSequence) this.L$12;
                CharSequence charSequence19 = (CharSequence) this.L$11;
                nohVar9 = (noh) this.L$10;
                nohVar11 = (noh) this.L$9;
                nohVar17 = (noh) this.L$8;
                nohVar10 = (noh) this.L$7;
                nohVar7 = (noh) this.L$6;
                ?? r132 = (noh) this.L$5;
                nohVar6 = (noh) this.L$4;
                kotlin.b.b(obj);
                qohVar3 = r132;
                coroutineSingletons = coroutineSingletons2;
                charSequence4 = charSequence19;
                k2 = obj;
                d8o0 d8o0Var72 = (d8o0) k2;
                noh nohVar302 = nohVar9;
                charSequence3 = charSequence4;
                nohVar13 = nohVar7;
                nohVar14 = nohVar10;
                nohVar12 = nohVar17;
                nohVar15 = nohVar11;
                nohVar16 = nohVar302;
                charSequence2 = charSequence5;
                d8o0Var = d8o0Var72;
                if (nohVar6 != null) {
                }
                nohVar18 = nohVar13;
                nohVar19 = nohVar14;
                nohVar20 = nohVar12;
                nohVar21 = nohVar15;
                nohVar22 = nohVar16;
                charSequence6 = charSequence3;
                charSequence7 = charSequence2;
                d8o0Var2 = d8o0Var;
                nvi0Var = null;
                if (qohVar3 == null) {
                }
                break;
            case 4:
                i = this.I$0;
                d8o0Var = (d8o0) this.L$13;
                charSequence2 = (CharSequence) this.L$12;
                charSequence3 = (CharSequence) this.L$11;
                nohVar16 = (noh) this.L$10;
                nohVar15 = (noh) this.L$9;
                nohVar12 = (noh) this.L$8;
                nohVar14 = (noh) this.L$7;
                noh nohVar34 = (noh) this.L$6;
                ?? r14 = (noh) this.L$5;
                kotlin.b.b(obj);
                coroutineSingletons = coroutineSingletons2;
                nohVar13 = nohVar34;
                k3 = obj;
                qohVar4 = r14;
                n8o0Var = (n8o0) k3;
                if (n8o0Var == null) {
                }
                break;
            case 5:
                i = this.I$0;
                nvi0Var = (nvi0) this.L$14;
                d8o0Var2 = (d8o0) this.L$13;
                charSequence7 = (CharSequence) this.L$12;
                charSequence6 = (CharSequence) this.L$11;
                nohVar22 = (noh) this.L$10;
                nohVar21 = (noh) this.L$9;
                nohVar20 = (noh) this.L$8;
                noh nohVar35 = (noh) this.L$7;
                nohVar18 = (noh) this.L$6;
                kotlin.b.b(obj);
                coroutineSingletons = coroutineSingletons2;
                nohVar19 = nohVar35;
                k4 = obj;
                e8o0Var = (e8o0) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar19;
                this.L$8 = nohVar20;
                this.L$9 = nohVar21;
                this.L$10 = nohVar22;
                this.L$11 = charSequence6;
                this.L$12 = charSequence7;
                this.L$13 = d8o0Var2;
                this.L$14 = nvi0Var;
                this.L$15 = e8o0Var;
                this.I$0 = i;
                this.label = 6;
                k5 = nohVar18.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i = this.I$0;
                e8o0 e8o0Var6 = (e8o0) this.L$15;
                nvi0 nvi0Var7 = (nvi0) this.L$14;
                d8o0 d8o0Var8 = (d8o0) this.L$13;
                CharSequence charSequence20 = (CharSequence) this.L$12;
                CharSequence charSequence21 = (CharSequence) this.L$11;
                noh nohVar36 = (noh) this.L$10;
                noh nohVar37 = (noh) this.L$9;
                noh nohVar38 = (noh) this.L$8;
                nohVar25 = (noh) this.L$7;
                kotlin.b.b(obj);
                coroutineSingletons = coroutineSingletons2;
                nohVar26 = nohVar37;
                nohVar24 = nohVar36;
                charSequence9 = charSequence21;
                charSequence8 = charSequence20;
                d8o0Var3 = d8o0Var8;
                nvi0Var2 = nvi0Var7;
                e8o0Var2 = e8o0Var6;
                nohVar23 = nohVar38;
                k5 = obj;
                List list42 = (List) k5;
                if (nohVar25 == null) {
                }
                break;
            case 7:
                i = this.I$0;
                list2 = (List) this.L$16;
                e8o0Var2 = (e8o0) this.L$15;
                nvi0Var2 = (nvi0) this.L$14;
                d8o0Var3 = (d8o0) this.L$13;
                charSequence8 = (CharSequence) this.L$12;
                charSequence9 = (CharSequence) this.L$11;
                nohVar24 = (noh) this.L$10;
                noh nohVar39 = (noh) this.L$9;
                nohVar28 = (noh) this.L$8;
                kotlin.b.b(obj);
                coroutineSingletons = coroutineSingletons2;
                nohVar26 = nohVar39;
                k6 = obj;
                nohVar27 = nohVar24;
                charSequence10 = charSequence9;
                charSequence11 = charSequence8;
                d8o0Var4 = d8o0Var3;
                nvi0Var3 = nvi0Var2;
                e8o0Var3 = e8o0Var2;
                list = list2;
                g8o0Var = (g8o0) k6;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = nohVar28;
                this.L$9 = null;
                this.L$10 = nohVar27;
                this.L$11 = charSequence10;
                this.L$12 = charSequence11;
                this.L$13 = d8o0Var4;
                this.L$14 = nvi0Var3;
                this.L$15 = e8o0Var3;
                this.L$16 = list;
                this.L$17 = g8o0Var;
                this.I$0 = i;
                this.label = 8;
                k7 = nohVar26.k(this);
                break;
            case 8:
                i = this.I$0;
                g8o0Var = (g8o0) this.L$17;
                list = (List) this.L$16;
                e8o0Var3 = (e8o0) this.L$15;
                nvi0Var3 = (nvi0) this.L$14;
                d8o0Var4 = (d8o0) this.L$13;
                charSequence11 = (CharSequence) this.L$12;
                charSequence10 = (CharSequence) this.L$11;
                noh nohVar40 = (noh) this.L$10;
                nohVar28 = (noh) this.L$8;
                kotlin.b.b(obj);
                nohVar27 = nohVar40;
                coroutineSingletons = coroutineSingletons2;
                k7 = obj;
                m8o0 m8o0Var3 = (m8o0) k7;
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
                this.L$10 = nohVar27;
                this.L$11 = charSequence10;
                this.L$12 = charSequence11;
                this.L$13 = d8o0Var4;
                this.L$14 = nvi0Var3;
                this.L$15 = e8o0Var3;
                this.L$16 = list;
                this.L$17 = g8o0Var;
                this.L$18 = m8o0Var3;
                this.I$0 = i;
                this.label = 9;
                k8 = nohVar28.k(this);
                if (k8 != coroutineSingletons) {
                    g8o0 g8o0Var4 = g8o0Var;
                    m8o0Var = m8o0Var3;
                    charSequence12 = charSequence10;
                    charSequence13 = charSequence11;
                    d8o0Var5 = d8o0Var4;
                    nvi0Var4 = nvi0Var3;
                    e8o0Var4 = e8o0Var3;
                    list3 = list;
                    g8o0Var2 = g8o0Var4;
                    nohVar29 = nohVar27;
                    o8o0 o8o0Var2 = (o8o0) k8;
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
                    this.L$11 = charSequence12;
                    this.L$12 = charSequence13;
                    this.L$13 = d8o0Var5;
                    this.L$14 = nvi0Var4;
                    this.L$15 = e8o0Var4;
                    this.L$16 = list3;
                    this.L$17 = g8o0Var2;
                    this.L$18 = m8o0Var;
                    this.L$19 = o8o0Var2;
                    this.I$0 = i;
                    this.label = 10;
                    k9 = nohVar29.k(this);
                    if (k9 != coroutineSingletons) {
                        d8o0 d8o0Var9 = d8o0Var5;
                        o8o0Var = o8o0Var2;
                        d8o0Var6 = d8o0Var9;
                        e8o0Var5 = e8o0Var4;
                        nvi0Var5 = nvi0Var4;
                        m8o0Var2 = m8o0Var;
                        g8o0Var3 = g8o0Var2;
                        charSequence14 = charSequence13;
                        charSequence15 = charSequence12;
                        return new p8o0(charSequence15, charSequence14, d8o0Var6, nvi0Var5, e8o0Var5, list3, g8o0Var3, m8o0Var2, o8o0Var, (h8o0) k9, i == 0);
                    }
                }
                return coroutineSingletons;
            case 9:
                i = this.I$0;
                m8o0Var = (m8o0) this.L$18;
                g8o0Var2 = (g8o0) this.L$17;
                list3 = (List) this.L$16;
                e8o0Var4 = (e8o0) this.L$15;
                nvi0Var4 = (nvi0) this.L$14;
                d8o0Var5 = (d8o0) this.L$13;
                charSequence13 = (CharSequence) this.L$12;
                CharSequence charSequence22 = (CharSequence) this.L$11;
                nohVar29 = (noh) this.L$10;
                kotlin.b.b(obj);
                coroutineSingletons = coroutineSingletons2;
                charSequence12 = charSequence22;
                k8 = obj;
                o8o0 o8o0Var22 = (o8o0) k8;
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
                this.L$11 = charSequence12;
                this.L$12 = charSequence13;
                this.L$13 = d8o0Var5;
                this.L$14 = nvi0Var4;
                this.L$15 = e8o0Var4;
                this.L$16 = list3;
                this.L$17 = g8o0Var2;
                this.L$18 = m8o0Var;
                this.L$19 = o8o0Var22;
                this.I$0 = i;
                this.label = 10;
                k9 = nohVar29.k(this);
                if (k9 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 10:
                i = this.I$0;
                o8o0 o8o0Var3 = (o8o0) this.L$19;
                m8o0 m8o0Var4 = (m8o0) this.L$18;
                g8o0 g8o0Var5 = (g8o0) this.L$17;
                List list5 = (List) this.L$16;
                e8o0 e8o0Var7 = (e8o0) this.L$15;
                nvi0 nvi0Var8 = (nvi0) this.L$14;
                d8o0 d8o0Var10 = (d8o0) this.L$13;
                CharSequence charSequence23 = (CharSequence) this.L$12;
                CharSequence charSequence24 = (CharSequence) this.L$11;
                kotlin.b.b(obj);
                list3 = list5;
                e8o0Var5 = e8o0Var7;
                k9 = obj;
                nvi0Var5 = nvi0Var8;
                d8o0Var6 = d8o0Var10;
                m8o0Var2 = m8o0Var4;
                g8o0Var3 = g8o0Var5;
                charSequence14 = charSequence23;
                charSequence15 = charSequence24;
                o8o0Var = o8o0Var3;
                return new p8o0(charSequence15, charSequence14, d8o0Var6, nvi0Var5, e8o0Var5, list3, g8o0Var3, m8o0Var2, o8o0Var, (h8o0) k9, i == 0);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
