package com.yandex.go.scooters.data.mapper;

import com.yandex.go.scooters.passes.model.PassType;
import defpackage.avu0;
import defpackage.ck90;
import defpackage.fef;
import defpackage.gk90;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nco0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.z490;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.PassItemType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lvj90;", "<anonymous>", "(Ltse;)Lvj90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$toPass$2", f = "ScootersPassMapper.kt", l = {313, 314, 315, 316, 317, 318, 319, 323}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$toPass$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ boolean $depositExperimentEnabled;
    final /* synthetic */ String $passId;
    final /* synthetic */ PassItemType $passItemType;
    final /* synthetic */ ck90 $this_toPass;
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
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$toPass$2(ck90 ck90Var, String str, d dVar, PassItemType passItemType, fef fefVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$this_toPass = ck90Var;
        this.$passId = str;
        this.this$0 = dVar;
        this.$passItemType = passItemType;
        this.$currencyRules = fefVar;
        this.$depositExperimentEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassMapper$toPass$2 scootersPassMapper$toPass$2 = new ScootersPassMapper$toPass$2(this.$this_toPass, this.$passId, this.this$0, this.$passItemType, this.$currencyRules, this.$depositExperimentEnabled, continuation);
        scootersPassMapper$toPass$2.L$0 = obj;
        return scootersPassMapper$toPass$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$toPass$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0480, code lost:
    
        if (r13 == r2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0435, code lost:
    
        if (r1 == r2) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0356  */
    /* JADX WARN: Type inference failed for: r11v17, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        PassType passType;
        Object s;
        noh nohVar;
        qoh qohVar;
        noh nohVar2;
        String str;
        String str2;
        noh nohVar3;
        CharSequence charSequence;
        Double i;
        Object k;
        noh nohVar4;
        CharSequence charSequence2;
        PassType passType2;
        noh nohVar5;
        Object k2;
        CharSequence charSequence3;
        noh nohVar6;
        noh nohVar7;
        String str3;
        PassType passType3;
        String str4;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object k3;
        noh nohVar8;
        CharSequence charSequence6;
        Object k4;
        CharSequence charSequence7;
        noh nohVar9;
        String str5;
        PassType passType4;
        String str6;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        String str7;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        String str8;
        PassType passType5;
        String str9;
        CharSequence charSequence15;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        Object k5;
        CharSequence charSequence20;
        CharSequence charSequence21;
        String str10;
        PassType passType6;
        String str11;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence charSequence24;
        CharSequence charSequence25;
        CharSequence charSequence26;
        gk90 gk90Var;
        Object k6;
        Object b;
        gk90 gk90Var2;
        String str12;
        boolean z;
        CharSequence charSequence27;
        CharSequence charSequence28;
        CharSequence charSequence29;
        CharSequence charSequence30;
        String str13;
        CharSequence charSequence31;
        PassType passType7;
        boolean z2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str14 = "";
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                z490 z490Var = this.$this_toPass.i;
                qoh h3 = z490Var != null ? tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$purchaseButtonTextsAsync$1$1(z490Var, null), 3) : null;
                qoh h4 = tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$titleAsync$1(this.$currencyRules, this.$this_toPass, this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$subtitleAsync$1(this.$currencyRules, this.$this_toPass, this.this$0, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$subtitleWithSurgeAsync$1(this.$currencyRules, this.$this_toPass, this.this$0, null), 3);
                String str15 = this.$this_toPass.f;
                h2 = (str15 == null || (i = avu0.i(str15)) == null) ? null : tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$priceAsync$1$1(this.this$0, this.$currencyRules, i.doubleValue(), null), 3);
                qoh h6 = tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$alternativeSubtitleAsync$1(this.$currencyRules, this.$this_toPass, this.this$0, null), 3);
                FormattedText formattedText = this.$this_toPass.h;
                qoh h7 = formattedText != null ? tje.h(tseVar, null, null, new ScootersPassMapper$toPass$2$purchaseButtonTextAsync$1$1(this.this$0, formattedText, this.$currencyRules, null), 3) : null;
                String str16 = this.$passId;
                d dVar = this.this$0;
                PassItemType passItemType = this.$passItemType;
                dVar.getClass();
                int i2 = nco0.a[passItemType.ordinal()];
                if (i2 == 1) {
                    passType = PassType.TARIFF;
                } else if (i2 == 2) {
                    passType = PassType.PACKAGE;
                } else if (i2 != 3) {
                    w511.b();
                    break;
                } else {
                    passType = PassType.SUPER_PASS;
                }
                String str17 = this.$this_toPass.c;
                this.L$0 = null;
                this.L$1 = h3;
                this.L$2 = null;
                this.L$3 = h;
                this.L$4 = h5;
                this.L$5 = h2;
                this.L$6 = h6;
                this.L$7 = h7;
                this.L$8 = str16;
                this.L$9 = passType;
                this.L$10 = str17;
                this.L$11 = "";
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    nohVar = h7;
                    qohVar = h6;
                    nohVar2 = h5;
                    str = str16;
                    str2 = str17;
                    nohVar3 = h3;
                    charSequence = "";
                    CharSequence charSequence32 = (CharSequence) s;
                    this.L$0 = null;
                    this.L$1 = nohVar3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = nohVar2;
                    this.L$5 = h2;
                    this.L$6 = qohVar;
                    this.L$7 = nohVar;
                    this.L$8 = str;
                    this.L$9 = passType;
                    this.L$10 = str2;
                    this.L$11 = charSequence;
                    this.L$12 = charSequence32;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        PassType passType8 = passType;
                        nohVar4 = qohVar;
                        charSequence2 = charSequence32;
                        passType2 = passType8;
                        nohVar5 = nohVar3;
                        CharSequence charSequence33 = (CharSequence) k;
                        this.L$0 = null;
                        this.L$1 = nohVar5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = h2;
                        this.L$6 = nohVar4;
                        this.L$7 = nohVar;
                        this.L$8 = str;
                        this.L$9 = passType2;
                        this.L$10 = str2;
                        this.L$11 = charSequence;
                        this.L$12 = charSequence2;
                        this.L$13 = charSequence33;
                        this.label = 3;
                        k2 = nohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                            charSequence3 = charSequence2;
                            nohVar6 = nohVar4;
                            nohVar7 = nohVar;
                            str3 = str;
                            passType3 = passType2;
                            str4 = str2;
                            charSequence4 = charSequence;
                            charSequence5 = charSequence33;
                            CharSequence charSequence34 = (CharSequence) k2;
                            if (h2 != null) {
                                this.L$0 = null;
                                this.L$1 = nohVar5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = nohVar6;
                                this.L$7 = nohVar7;
                                this.L$8 = str3;
                                this.L$9 = passType3;
                                this.L$10 = str4;
                                this.L$11 = charSequence4;
                                this.L$12 = charSequence3;
                                this.L$13 = charSequence5;
                                this.L$14 = charSequence34;
                                this.label = 4;
                                k3 = h2.k(this);
                                if (k3 != coroutineSingletons) {
                                    nohVar8 = nohVar6;
                                    charSequence6 = charSequence34;
                                    str7 = (String) k3;
                                    if (str7 == null) {
                                        str14 = str7;
                                        this.L$0 = null;
                                        this.L$1 = nohVar5;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = nohVar7;
                                        this.L$8 = str3;
                                        this.L$9 = passType3;
                                        this.L$10 = str4;
                                        this.L$11 = charSequence4;
                                        this.L$12 = charSequence3;
                                        this.L$13 = charSequence5;
                                        this.L$14 = charSequence6;
                                        this.L$15 = str14;
                                        this.label = 5;
                                        k4 = nohVar8.k(this);
                                        if (k4 != coroutineSingletons) {
                                            String str18 = str14;
                                            charSequence7 = charSequence6;
                                            nohVar9 = nohVar7;
                                            str5 = str3;
                                            passType4 = passType3;
                                            str6 = str4;
                                            charSequence8 = charSequence4;
                                            charSequence9 = charSequence3;
                                            charSequence10 = charSequence5;
                                            charSequence11 = str18;
                                            charSequence12 = (CharSequence) k4;
                                            if (nohVar9 != null) {
                                                CharSequence charSequence35 = charSequence7;
                                                charSequence13 = charSequence11;
                                                charSequence14 = charSequence12;
                                                str8 = str5;
                                                passType5 = passType4;
                                                str9 = str6;
                                                charSequence15 = charSequence8;
                                                charSequence16 = charSequence9;
                                                charSequence17 = charSequence10;
                                                charSequence18 = charSequence35;
                                                charSequence19 = null;
                                                if (nohVar5 != null) {
                                                    CharSequence charSequence36 = charSequence13;
                                                    charSequence20 = charSequence19;
                                                    charSequence21 = charSequence36;
                                                    str10 = str8;
                                                    passType6 = passType5;
                                                    str11 = str9;
                                                    charSequence22 = charSequence15;
                                                    charSequence23 = charSequence16;
                                                    charSequence24 = charSequence17;
                                                    charSequence25 = charSequence18;
                                                    charSequence26 = charSequence14;
                                                    gk90Var = null;
                                                    ck90 ck90Var = this.$this_toPass;
                                                    boolean z3 = ck90Var.k;
                                                    boolean l = jl40.l(ck90Var.l, Boolean.TRUE);
                                                    ck90 ck90Var2 = this.$this_toPass;
                                                    boolean z4 = ck90Var2.o;
                                                    c cVar = this.this$0.f;
                                                    List list = ck90Var2.m;
                                                    fef fefVar = this.$currencyRules;
                                                    boolean z5 = this.$depositExperimentEnabled;
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.L$7 = null;
                                                    this.L$8 = str10;
                                                    this.L$9 = passType6;
                                                    this.L$10 = str11;
                                                    this.L$11 = charSequence22;
                                                    this.L$12 = charSequence23;
                                                    this.L$13 = charSequence24;
                                                    this.L$14 = charSequence25;
                                                    this.L$15 = charSequence21;
                                                    this.L$16 = charSequence26;
                                                    this.L$17 = charSequence20;
                                                    this.L$18 = gk90Var;
                                                    this.Z$0 = z3;
                                                    this.Z$1 = l;
                                                    this.Z$2 = z4;
                                                    this.label = 8;
                                                    b = cVar.b(list, fefVar, z5, this);
                                                    coroutineSingletons = coroutineSingletons;
                                                    if (b != coroutineSingletons) {
                                                        PassType passType9 = passType6;
                                                        gk90Var2 = gk90Var;
                                                        str12 = str10;
                                                        z = l;
                                                        charSequence27 = charSequence23;
                                                        charSequence28 = charSequence25;
                                                        charSequence29 = charSequence22;
                                                        charSequence30 = charSequence26;
                                                        str13 = str11;
                                                        charSequence31 = charSequence20;
                                                        passType7 = passType9;
                                                        z2 = z4;
                                                        break;
                                                    }
                                                } else {
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.L$7 = null;
                                                    this.L$8 = str8;
                                                    this.L$9 = passType5;
                                                    this.L$10 = str9;
                                                    this.L$11 = charSequence15;
                                                    this.L$12 = charSequence16;
                                                    this.L$13 = charSequence17;
                                                    this.L$14 = charSequence18;
                                                    this.L$15 = charSequence13;
                                                    this.L$16 = charSequence14;
                                                    this.L$17 = charSequence19;
                                                    this.label = 7;
                                                    k6 = nohVar5.k(this);
                                                    break;
                                                }
                                            } else {
                                                this.L$0 = null;
                                                this.L$1 = nohVar5;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = null;
                                                this.L$8 = str5;
                                                this.L$9 = passType4;
                                                this.L$10 = str6;
                                                this.L$11 = charSequence8;
                                                this.L$12 = charSequence9;
                                                this.L$13 = charSequence10;
                                                this.L$14 = charSequence7;
                                                this.L$15 = charSequence11;
                                                this.L$16 = charSequence12;
                                                this.label = 6;
                                                k5 = nohVar9.k(this);
                                                break;
                                            }
                                        }
                                    } else {
                                        noh nohVar10 = nohVar8;
                                        charSequence34 = charSequence6;
                                        nohVar6 = nohVar10;
                                    }
                                }
                            }
                            CharSequence charSequence37 = charSequence34;
                            nohVar8 = nohVar6;
                            charSequence6 = charSequence37;
                            this.L$0 = null;
                            this.L$1 = nohVar5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = nohVar7;
                            this.L$8 = str3;
                            this.L$9 = passType3;
                            this.L$10 = str4;
                            this.L$11 = charSequence4;
                            this.L$12 = charSequence3;
                            this.L$13 = charSequence5;
                            this.L$14 = charSequence6;
                            this.L$15 = str14;
                            this.label = 5;
                            k4 = nohVar8.k(this);
                            if (k4 != coroutineSingletons) {
                            }
                        }
                    }
                }
                break;
            case 1:
                CharSequence charSequence38 = (CharSequence) this.L$11;
                String str19 = (String) this.L$10;
                PassType passType10 = (PassType) this.L$9;
                str = (String) this.L$8;
                nohVar = (noh) this.L$7;
                ?? r11 = (noh) this.L$6;
                h2 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                h = (noh) this.L$3;
                nohVar3 = (noh) this.L$1;
                kotlin.b.b(obj);
                str2 = str19;
                charSequence = charSequence38;
                qohVar = r11;
                passType = passType10;
                s = obj;
                CharSequence charSequence322 = (CharSequence) s;
                this.L$0 = null;
                this.L$1 = nohVar3;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = h2;
                this.L$6 = qohVar;
                this.L$7 = nohVar;
                this.L$8 = str;
                this.L$9 = passType;
                this.L$10 = str2;
                this.L$11 = charSequence;
                this.L$12 = charSequence322;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                break;
            case 2:
                charSequence2 = (CharSequence) this.L$12;
                charSequence = (CharSequence) this.L$11;
                str2 = (String) this.L$10;
                passType2 = (PassType) this.L$9;
                str = (String) this.L$8;
                nohVar = (noh) this.L$7;
                nohVar4 = (noh) this.L$6;
                h2 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar5 = (noh) this.L$1;
                kotlin.b.b(obj);
                k = obj;
                CharSequence charSequence332 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = nohVar5;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = nohVar4;
                this.L$7 = nohVar;
                this.L$8 = str;
                this.L$9 = passType2;
                this.L$10 = str2;
                this.L$11 = charSequence;
                this.L$12 = charSequence2;
                this.L$13 = charSequence332;
                this.label = 3;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                }
                break;
            case 3:
                CharSequence charSequence39 = (CharSequence) this.L$13;
                CharSequence charSequence40 = (CharSequence) this.L$12;
                CharSequence charSequence41 = (CharSequence) this.L$11;
                String str20 = (String) this.L$10;
                PassType passType11 = (PassType) this.L$9;
                String str21 = (String) this.L$8;
                noh nohVar11 = (noh) this.L$7;
                noh nohVar12 = (noh) this.L$6;
                h2 = (noh) this.L$5;
                noh nohVar13 = (noh) this.L$1;
                kotlin.b.b(obj);
                charSequence5 = charSequence39;
                nohVar6 = nohVar12;
                nohVar7 = nohVar11;
                str3 = str21;
                passType3 = passType11;
                str4 = str20;
                charSequence4 = charSequence41;
                charSequence3 = charSequence40;
                nohVar5 = nohVar13;
                k2 = obj;
                CharSequence charSequence342 = (CharSequence) k2;
                if (h2 != null) {
                }
                CharSequence charSequence372 = charSequence342;
                nohVar8 = nohVar6;
                charSequence6 = charSequence372;
                this.L$0 = null;
                this.L$1 = nohVar5;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar7;
                this.L$8 = str3;
                this.L$9 = passType3;
                this.L$10 = str4;
                this.L$11 = charSequence4;
                this.L$12 = charSequence3;
                this.L$13 = charSequence5;
                this.L$14 = charSequence6;
                this.L$15 = str14;
                this.label = 5;
                k4 = nohVar8.k(this);
                if (k4 != coroutineSingletons) {
                }
                break;
            case 4:
                charSequence6 = (CharSequence) this.L$14;
                charSequence5 = (CharSequence) this.L$13;
                charSequence3 = (CharSequence) this.L$12;
                charSequence4 = (CharSequence) this.L$11;
                str4 = (String) this.L$10;
                passType3 = (PassType) this.L$9;
                str3 = (String) this.L$8;
                nohVar7 = (noh) this.L$7;
                noh nohVar14 = (noh) this.L$6;
                noh nohVar15 = (noh) this.L$1;
                kotlin.b.b(obj);
                nohVar5 = nohVar15;
                nohVar8 = nohVar14;
                k3 = obj;
                str7 = (String) k3;
                if (str7 == null) {
                }
                break;
            case 5:
                CharSequence charSequence42 = (CharSequence) this.L$15;
                CharSequence charSequence43 = (CharSequence) this.L$14;
                CharSequence charSequence44 = (CharSequence) this.L$13;
                CharSequence charSequence45 = (CharSequence) this.L$12;
                CharSequence charSequence46 = (CharSequence) this.L$11;
                String str22 = (String) this.L$10;
                PassType passType12 = (PassType) this.L$9;
                String str23 = (String) this.L$8;
                noh nohVar16 = (noh) this.L$7;
                noh nohVar17 = (noh) this.L$1;
                kotlin.b.b(obj);
                charSequence11 = charSequence42;
                nohVar9 = nohVar16;
                str5 = str23;
                passType4 = passType12;
                str6 = str22;
                charSequence8 = charSequence46;
                charSequence9 = charSequence45;
                charSequence10 = charSequence44;
                charSequence7 = charSequence43;
                nohVar5 = nohVar17;
                k4 = obj;
                charSequence12 = (CharSequence) k4;
                if (nohVar9 != null) {
                }
                break;
            case 6:
                CharSequence charSequence47 = (CharSequence) this.L$16;
                charSequence11 = (CharSequence) this.L$15;
                charSequence7 = (CharSequence) this.L$14;
                charSequence10 = (CharSequence) this.L$13;
                charSequence9 = (CharSequence) this.L$12;
                charSequence8 = (CharSequence) this.L$11;
                str6 = (String) this.L$10;
                passType4 = (PassType) this.L$9;
                str5 = (String) this.L$8;
                noh nohVar18 = (noh) this.L$1;
                kotlin.b.b(obj);
                nohVar5 = nohVar18;
                charSequence12 = charSequence47;
                k5 = obj;
                charSequence19 = (CharSequence) k5;
                CharSequence charSequence48 = charSequence7;
                charSequence13 = charSequence11;
                charSequence14 = charSequence12;
                str8 = str5;
                passType5 = passType4;
                str9 = str6;
                charSequence15 = charSequence8;
                charSequence16 = charSequence9;
                charSequence17 = charSequence10;
                charSequence18 = charSequence48;
                if (nohVar5 != null) {
                }
                break;
            case 7:
                charSequence19 = (CharSequence) this.L$17;
                charSequence14 = (CharSequence) this.L$16;
                charSequence13 = (CharSequence) this.L$15;
                charSequence18 = (CharSequence) this.L$14;
                charSequence17 = (CharSequence) this.L$13;
                charSequence16 = (CharSequence) this.L$12;
                charSequence15 = (CharSequence) this.L$11;
                str9 = (String) this.L$10;
                passType5 = (PassType) this.L$9;
                str8 = (String) this.L$8;
                kotlin.b.b(obj);
                k6 = obj;
                CharSequence charSequence49 = charSequence13;
                charSequence20 = charSequence19;
                charSequence21 = charSequence49;
                CharSequence charSequence50 = charSequence18;
                charSequence26 = charSequence14;
                gk90Var = (gk90) k6;
                str10 = str8;
                passType6 = passType5;
                str11 = str9;
                charSequence22 = charSequence15;
                charSequence23 = charSequence16;
                charSequence24 = charSequence17;
                charSequence25 = charSequence50;
                ck90 ck90Var3 = this.$this_toPass;
                boolean z32 = ck90Var3.k;
                boolean l2 = jl40.l(ck90Var3.l, Boolean.TRUE);
                ck90 ck90Var22 = this.$this_toPass;
                boolean z42 = ck90Var22.o;
                c cVar2 = this.this$0.f;
                List list2 = ck90Var22.m;
                fef fefVar2 = this.$currencyRules;
                boolean z52 = this.$depositExperimentEnabled;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = str10;
                this.L$9 = passType6;
                this.L$10 = str11;
                this.L$11 = charSequence22;
                this.L$12 = charSequence23;
                this.L$13 = charSequence24;
                this.L$14 = charSequence25;
                this.L$15 = charSequence21;
                this.L$16 = charSequence26;
                this.L$17 = charSequence20;
                this.L$18 = gk90Var;
                this.Z$0 = z32;
                this.Z$1 = l2;
                this.Z$2 = z42;
                this.label = 8;
                b = cVar2.b(list2, fefVar2, z52, this);
                coroutineSingletons = coroutineSingletons;
                if (b != coroutineSingletons) {
                }
                break;
            case 8:
                boolean z6 = this.Z$2;
                boolean z7 = this.Z$1;
                gk90 gk90Var3 = (gk90) this.L$18;
                CharSequence charSequence51 = (CharSequence) this.L$17;
                CharSequence charSequence52 = (CharSequence) this.L$16;
                CharSequence charSequence53 = (CharSequence) this.L$14;
                CharSequence charSequence54 = (CharSequence) this.L$13;
                CharSequence charSequence55 = (CharSequence) this.L$12;
                CharSequence charSequence56 = (CharSequence) this.L$11;
                String str24 = (String) this.L$10;
                PassType passType13 = (PassType) this.L$9;
                String str25 = (String) this.L$8;
                kotlin.b.b(obj);
                gk90Var2 = gk90Var3;
                str12 = str25;
                charSequence31 = charSequence51;
                passType7 = passType13;
                charSequence30 = charSequence52;
                str13 = str24;
                charSequence28 = charSequence53;
                charSequence29 = charSequence56;
                charSequence24 = charSequence54;
                charSequence27 = charSequence55;
                z2 = z6;
                z = z7;
                b = obj;
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                break;
        }
        return null;
    }
}
