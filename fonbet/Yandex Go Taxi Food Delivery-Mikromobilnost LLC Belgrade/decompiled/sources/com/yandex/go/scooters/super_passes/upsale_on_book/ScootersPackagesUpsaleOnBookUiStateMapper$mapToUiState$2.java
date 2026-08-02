package com.yandex.go.scooters.super_passes.upsale_on_book;

import com.yandex.go.scooters.passes.data.model.ScootersSuperPassLegalTermsExperiment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.abo0;
import defpackage.d6z;
import defpackage.eq2;
import defpackage.l2p0;
import defpackage.ly3;
import defpackage.mvg;
import defpackage.n2p0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2p0;
import defpackage.p2p0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.up2;
import defpackage.wls;
import defpackage.wp2;
import defpackage.zp2;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll2p0;", "<anonymous>", "(Ltse;)Ll2p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.super_passes.upsale_on_book.ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2", f = "ScootersSuperPassesUpsaleOnBookUiStateMapper.kt", l = {62, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64, 66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isComeFromQr;
    final /* synthetic */ ScootersSuperPassLegalTermsExperiment $legalTermsExperiment;
    final /* synthetic */ p2p0 $upsaleWindow;
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
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ abo0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.super_passes.upsale_on_book.ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$1", f = "ScootersSuperPassesUpsaleOnBookUiStateMapper.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.super_passes.upsale_on_book.ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ o2p0 $trialPeriod;
        int label;
        final /* synthetic */ abo0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(abo0 abo0Var, o2p0 o2p0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = abo0Var;
            this.$trialPeriod = o2p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$trialPeriod, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.b;
            FormattedText formattedText = this.$trialPeriod.a;
            this.label = 1;
            Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
            return e == coroutineSingletons ? coroutineSingletons : e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2(p2p0 p2p0Var, abo0 abo0Var, ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$upsaleWindow = p2p0Var;
        this.this$0 = abo0Var;
        this.$legalTermsExperiment = scootersSuperPassLegalTermsExperiment;
        this.$isComeFromQr = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2 scootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2 = new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2(this.$upsaleWindow, this.this$0, this.$legalTermsExperiment, this.$isComeFromQr, continuation);
        scootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0270  */
    /* JADX WARN: Type inference failed for: r11v14, types: [noh] */
    /* JADX WARN: Type inference failed for: r12v11, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [wp2] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.CharSequence] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        wp2 up2Var;
        qoh qohVar;
        String str;
        String str2;
        Object s;
        noh nohVar;
        String str3;
        qoh qohVar2;
        String str4;
        noh nohVar2;
        noh nohVar3;
        Object k;
        String str5;
        CharSequence charSequence;
        noh nohVar4;
        Object obj2;
        noh nohVar5;
        Object k2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        noh nohVar6;
        noh nohVar7;
        Object obj3;
        String str6;
        String str7;
        Object k3;
        CharSequence charSequence4;
        String str8;
        noh nohVar8;
        noh nohVar9;
        Object obj4;
        String str9;
        CharSequence charSequence5;
        Object obj5;
        Object k4;
        String str10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object obj6;
        String str11;
        ?? r9;
        Object k5;
        CharSequence charSequence9;
        String str12;
        ?? r6;
        CharSequence charSequence10;
        String str13;
        CharSequence charSequence11;
        String str14;
        CharSequence charSequence12;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str15 = "";
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h2 = tje.h(tseVar, null, null, new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$upsaleWindow, null), 3);
                h = tje.h(tseVar, null, null, new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$upsaleWindow, null), 3);
                qoh h3 = tje.h(tseVar, null, null, new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$priceAsync$1(this.this$0, this.$upsaleWindow, null), 3);
                n2p0 n2p0Var = this.$upsaleWindow.g;
                qoh h4 = tje.h(tseVar, null, null, new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$rejectButtonTextAsync$1(this.$isComeFromQr, n2p0Var, this.this$0, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.$isComeFromQr, n2p0Var, this.this$0, null), 3);
                o2p0 o2p0Var = this.$upsaleWindow.f;
                if (o2p0Var != null) {
                    qohVar = tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, o2p0Var, null), 3);
                    up2Var = ly3.g(eq2.a, this.this$0.a, o2p0Var.b);
                } else {
                    up2Var = new up2(zp2.d);
                    qohVar = null;
                }
                ScootersSuperPassLegalTermsExperiment scootersSuperPassLegalTermsExperiment = this.$legalTermsExperiment;
                if (scootersSuperPassLegalTermsExperiment.b) {
                    str = d6z.Y(scootersSuperPassLegalTermsExperiment, scootersSuperPassLegalTermsExperiment.d);
                    str2 = this.$legalTermsExperiment.e;
                } else {
                    str = "";
                    str2 = str;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h3;
                this.L$4 = null;
                this.L$5 = h4;
                this.L$6 = h5;
                this.L$7 = qohVar;
                this.L$8 = up2Var;
                this.L$9 = null;
                this.L$10 = str;
                this.L$11 = str2;
                this.label = 1;
                s = h2.s(this);
                if (s != coroutineSingletons) {
                    nohVar = qohVar;
                    str3 = str2;
                    qohVar2 = h3;
                    str4 = str;
                    nohVar2 = h4;
                    nohVar3 = h5;
                    CharSequence charSequence13 = (CharSequence) s;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = qohVar2;
                    this.L$4 = null;
                    this.L$5 = nohVar2;
                    this.L$6 = nohVar3;
                    this.L$7 = nohVar;
                    this.L$8 = up2Var;
                    this.L$9 = null;
                    this.L$10 = str4;
                    this.L$11 = str3;
                    this.L$12 = charSequence13;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        str5 = str3;
                        charSequence = charSequence13;
                        noh nohVar10 = nohVar3;
                        nohVar4 = nohVar;
                        obj2 = up2Var;
                        nohVar5 = nohVar10;
                        CharSequence charSequence14 = (CharSequence) k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = nohVar2;
                        this.L$6 = nohVar5;
                        this.L$7 = nohVar4;
                        this.L$8 = obj2;
                        this.L$9 = null;
                        this.L$10 = str4;
                        this.L$11 = str5;
                        this.L$12 = charSequence;
                        this.L$13 = charSequence14;
                        this.label = 3;
                        k2 = qohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                            String str16 = str4;
                            charSequence2 = charSequence;
                            charSequence3 = charSequence14;
                            nohVar6 = nohVar2;
                            nohVar7 = nohVar5;
                            obj3 = obj2;
                            str6 = str5;
                            str7 = str16;
                            CharSequence charSequence15 = (CharSequence) k2;
                            String str17 = this.$upsaleWindow.e;
                            if (nohVar4 != null) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = nohVar6;
                                this.L$6 = nohVar7;
                                this.L$7 = null;
                                this.L$8 = obj3;
                                this.L$9 = null;
                                this.L$10 = str7;
                                this.L$11 = str6;
                                this.L$12 = charSequence2;
                                this.L$13 = charSequence3;
                                this.L$14 = charSequence15;
                                this.L$15 = str17;
                                this.label = 4;
                                k3 = nohVar4.k(this);
                                if (k3 != coroutineSingletons) {
                                    charSequence4 = charSequence3;
                                    str8 = str17;
                                    nohVar8 = nohVar6;
                                    nohVar9 = nohVar7;
                                    obj4 = obj3;
                                    str9 = str7;
                                    charSequence5 = charSequence15;
                                    r9 = (CharSequence) k3;
                                    if (r9 != 0) {
                                        noh nohVar11 = nohVar8;
                                        str17 = str8;
                                        charSequence3 = charSequence4;
                                        charSequence15 = charSequence5;
                                        str7 = str9;
                                        obj3 = obj4;
                                        nohVar7 = nohVar9;
                                        nohVar6 = nohVar11;
                                    } else {
                                        str15 = r9;
                                        obj5 = obj4;
                                        nohVar7 = nohVar9;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = nohVar7;
                                        this.L$7 = null;
                                        this.L$8 = obj5;
                                        this.L$9 = null;
                                        this.L$10 = str9;
                                        this.L$11 = str6;
                                        this.L$12 = charSequence2;
                                        this.L$13 = charSequence4;
                                        this.L$14 = charSequence5;
                                        this.L$15 = str8;
                                        this.L$16 = str15;
                                        this.label = 5;
                                        k4 = nohVar8.k(this);
                                        if (k4 != coroutineSingletons) {
                                            CharSequence charSequence16 = charSequence5;
                                            str10 = str8;
                                            charSequence6 = str15;
                                            charSequence7 = charSequence4;
                                            charSequence8 = charSequence16;
                                            String str18 = str9;
                                            obj6 = obj5;
                                            str11 = str18;
                                            CharSequence charSequence17 = (CharSequence) k4;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = obj6;
                                            this.L$9 = null;
                                            this.L$10 = str11;
                                            this.L$11 = str6;
                                            this.L$12 = charSequence2;
                                            this.L$13 = charSequence7;
                                            this.L$14 = charSequence8;
                                            this.L$15 = str10;
                                            this.L$16 = charSequence6;
                                            this.L$17 = charSequence17;
                                            this.label = 6;
                                            k5 = nohVar7.k(this);
                                            if (k5 != coroutineSingletons) {
                                                charSequence9 = charSequence2;
                                                str12 = str6;
                                                r6 = obj6;
                                                charSequence10 = charSequence17;
                                                str13 = str10;
                                                charSequence11 = charSequence7;
                                                str14 = str11;
                                                charSequence12 = charSequence6;
                                                return new l2p0(charSequence9, charSequence11, charSequence8, charSequence12, r6, str13, charSequence10, (CharSequence) k5, str14, str12);
                                            }
                                        }
                                    }
                                }
                            }
                            obj5 = obj3;
                            str9 = str7;
                            charSequence5 = charSequence15;
                            charSequence4 = charSequence3;
                            str8 = str17;
                            nohVar8 = nohVar6;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = nohVar7;
                            this.L$7 = null;
                            this.L$8 = obj5;
                            this.L$9 = null;
                            this.L$10 = str9;
                            this.L$11 = str6;
                            this.L$12 = charSequence2;
                            this.L$13 = charSequence4;
                            this.L$14 = charSequence5;
                            this.L$15 = str8;
                            this.L$16 = str15;
                            this.label = 5;
                            k4 = nohVar8.k(this);
                            if (k4 != coroutineSingletons) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str3 = (String) this.L$11;
                String str19 = (String) this.L$10;
                ?? r7 = this.L$8;
                nohVar = (noh) this.L$7;
                nohVar3 = (noh) this.L$6;
                noh nohVar12 = (noh) this.L$5;
                ?? r11 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                qohVar2 = r11;
                nohVar2 = nohVar12;
                up2Var = r7;
                str4 = str19;
                s = obj;
                CharSequence charSequence132 = (CharSequence) s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = qohVar2;
                this.L$4 = null;
                this.L$5 = nohVar2;
                this.L$6 = nohVar3;
                this.L$7 = nohVar;
                this.L$8 = up2Var;
                this.L$9 = null;
                this.L$10 = str4;
                this.L$11 = str3;
                this.L$12 = charSequence132;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                charSequence = (CharSequence) this.L$12;
                str5 = (String) this.L$11;
                str4 = (String) this.L$10;
                obj2 = this.L$8;
                nohVar4 = (noh) this.L$7;
                nohVar5 = (noh) this.L$6;
                nohVar2 = (noh) this.L$5;
                ?? r12 = (noh) this.L$3;
                kotlin.b.b(obj);
                qohVar2 = r12;
                k = obj;
                CharSequence charSequence142 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar2;
                this.L$6 = nohVar5;
                this.L$7 = nohVar4;
                this.L$8 = obj2;
                this.L$9 = null;
                this.L$10 = str4;
                this.L$11 = str5;
                this.L$12 = charSequence;
                this.L$13 = charSequence142;
                this.label = 3;
                k2 = qohVar2.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                charSequence3 = (CharSequence) this.L$13;
                CharSequence charSequence18 = (CharSequence) this.L$12;
                String str20 = (String) this.L$11;
                String str21 = (String) this.L$10;
                Object obj7 = this.L$8;
                nohVar4 = (noh) this.L$7;
                noh nohVar13 = (noh) this.L$6;
                noh nohVar14 = (noh) this.L$5;
                kotlin.b.b(obj);
                charSequence2 = charSequence18;
                str7 = str21;
                nohVar6 = nohVar14;
                nohVar7 = nohVar13;
                obj3 = obj7;
                str6 = str20;
                k2 = obj;
                CharSequence charSequence152 = (CharSequence) k2;
                String str172 = this.$upsaleWindow.e;
                if (nohVar4 != null) {
                }
                obj5 = obj3;
                str9 = str7;
                charSequence5 = charSequence152;
                charSequence4 = charSequence3;
                str8 = str172;
                nohVar8 = nohVar6;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar7;
                this.L$7 = null;
                this.L$8 = obj5;
                this.L$9 = null;
                this.L$10 = str9;
                this.L$11 = str6;
                this.L$12 = charSequence2;
                this.L$13 = charSequence4;
                this.L$14 = charSequence5;
                this.L$15 = str8;
                this.L$16 = str15;
                this.label = 5;
                k4 = nohVar8.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                str8 = (String) this.L$15;
                charSequence5 = (CharSequence) this.L$14;
                charSequence4 = (CharSequence) this.L$13;
                charSequence2 = (CharSequence) this.L$12;
                str6 = (String) this.L$11;
                String str22 = (String) this.L$10;
                Object obj8 = this.L$8;
                noh nohVar15 = (noh) this.L$6;
                noh nohVar16 = (noh) this.L$5;
                kotlin.b.b(obj);
                nohVar8 = nohVar16;
                nohVar9 = nohVar15;
                obj4 = obj8;
                str9 = str22;
                k3 = obj;
                r9 = (CharSequence) k3;
                if (r9 != 0) {
                }
                break;
            case 5:
                charSequence6 = (CharSequence) this.L$16;
                str10 = (String) this.L$15;
                charSequence8 = (CharSequence) this.L$14;
                charSequence7 = (CharSequence) this.L$13;
                charSequence2 = (CharSequence) this.L$12;
                str6 = (String) this.L$11;
                str11 = (String) this.L$10;
                obj6 = this.L$8;
                nohVar7 = (noh) this.L$6;
                kotlin.b.b(obj);
                k4 = obj;
                CharSequence charSequence172 = (CharSequence) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = obj6;
                this.L$9 = null;
                this.L$10 = str11;
                this.L$11 = str6;
                this.L$12 = charSequence2;
                this.L$13 = charSequence7;
                this.L$14 = charSequence8;
                this.L$15 = str10;
                this.L$16 = charSequence6;
                this.L$17 = charSequence172;
                this.label = 6;
                k5 = nohVar7.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                CharSequence charSequence19 = (CharSequence) this.L$17;
                CharSequence charSequence20 = (CharSequence) this.L$16;
                String str23 = (String) this.L$15;
                charSequence8 = (CharSequence) this.L$14;
                CharSequence charSequence21 = (CharSequence) this.L$13;
                CharSequence charSequence22 = (CharSequence) this.L$12;
                String str24 = (String) this.L$11;
                String str25 = (String) this.L$10;
                Object obj9 = this.L$8;
                kotlin.b.b(obj);
                k5 = obj;
                str12 = str24;
                str14 = str25;
                charSequence10 = charSequence19;
                str13 = str23;
                charSequence11 = charSequence21;
                charSequence12 = charSequence20;
                charSequence9 = charSequence22;
                r6 = obj9;
                return new l2p0(charSequence9, charSequence11, charSequence8, charSequence12, r6, str13, charSequence10, (CharSequence) k5, str14, str12);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
