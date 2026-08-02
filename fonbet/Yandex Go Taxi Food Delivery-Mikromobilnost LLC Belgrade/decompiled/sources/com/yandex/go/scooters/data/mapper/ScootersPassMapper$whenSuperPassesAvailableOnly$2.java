package com.yandex.go.scooters.data.mapper;

import defpackage.d3o;
import defpackage.fef;
import defpackage.i8w0;
import defpackage.kvm0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p0p0;
import defpackage.p2p0;
import defpackage.qoh;
import defpackage.rco0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w20;
import defpackage.wls;
import defpackage.x1p0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrco0;", "<anonymous>", "(Ltse;)Lrco0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$whenSuperPassesAvailableOnly$2", f = "ScootersPassMapper.kt", l = {246, 248, 249, 250, 251, 252, 253, 254}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$whenSuperPassesAvailableOnly$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ String $pendingOperationId;
    final /* synthetic */ i8w0 $superPasses;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$whenSuperPassesAvailableOnly$2(fef fefVar, i8w0 i8w0Var, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$superPasses = i8w0Var;
        this.$pendingOperationId = str;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i8w0 i8w0Var = this.$superPasses;
        String str = this.$pendingOperationId;
        ScootersPassMapper$whenSuperPassesAvailableOnly$2 scootersPassMapper$whenSuperPassesAvailableOnly$2 = new ScootersPassMapper$whenSuperPassesAvailableOnly$2(this.$currencyRules, i8w0Var, this.this$0, str, continuation);
        scootersPassMapper$whenSuperPassesAvailableOnly$2.L$0 = obj;
        return scootersPassMapper$whenSuperPassesAvailableOnly$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$whenSuperPassesAvailableOnly$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a6  */
    /* JADX WARN: Type inference failed for: r10v9, types: [noh] */
    /* JADX WARN: Type inference failed for: r3v7, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v9, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        qoh qohVar;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        d3o d3oVar;
        Object k;
        noh nohVar4;
        noh nohVar5;
        qoh qohVar2;
        noh nohVar6;
        Object k2;
        noh nohVar7;
        CharSequence charSequence;
        noh nohVar8;
        noh nohVar9;
        noh nohVar10;
        Object k3;
        CharSequence charSequence2;
        noh nohVar11;
        d3o d3oVar2;
        CharSequence charSequence3;
        noh nohVar12;
        noh nohVar13;
        Object k4;
        noh nohVar14;
        List list;
        Object k5;
        List list2;
        noh nohVar15;
        CharSequence charSequence4;
        CharSequence charSequence5;
        w20 w20Var;
        noh nohVar16;
        d3o d3oVar3;
        d3o d3oVar4;
        CharSequence charSequence6;
        CharSequence charSequence7;
        List list3;
        w20 w20Var2;
        x1p0 x1p0Var;
        noh nohVar17;
        p2p0 p2p0Var;
        Object k6;
        x1p0 x1p0Var2;
        Object k7;
        List list4;
        CharSequence charSequence8;
        x1p0 x1p0Var3;
        w20 w20Var3;
        CharSequence charSequence9;
        d3o d3oVar5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$entranceAsync$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$titleAsync$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$subtitleAsync$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                qoh h6 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesInfo$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                qoh h7 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$purchaseWindow$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                qoh h8 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$bonusPasses$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                p0p0 p0p0Var = this.$superPasses.g;
                h2 = p0p0Var != null ? tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$upsaleWindow$1$1(this.this$0, p0p0Var, this.$currencyRules, null), 3) : null;
                h3 = tje.h(tseVar, null, null, new ScootersPassMapper$whenSuperPassesAvailableOnly$2$activePassesWindow$1(this.$currencyRules, this.$superPasses, this.this$0, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = h6;
                this.L$5 = h7;
                this.L$6 = h8;
                this.L$7 = h2;
                this.L$8 = h3;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h5;
                    nohVar = h8;
                    nohVar2 = h6;
                    nohVar3 = h7;
                    d3oVar = (d3o) s;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = qohVar;
                    this.L$4 = nohVar2;
                    this.L$5 = nohVar3;
                    this.L$6 = nohVar;
                    this.L$7 = h2;
                    this.L$8 = h3;
                    this.L$9 = d3oVar;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar18 = nohVar3;
                        nohVar4 = nohVar;
                        nohVar5 = h2;
                        qohVar2 = qohVar;
                        nohVar6 = nohVar18;
                        CharSequence charSequence10 = (CharSequence) k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = nohVar2;
                        this.L$5 = nohVar6;
                        this.L$6 = nohVar4;
                        this.L$7 = nohVar5;
                        this.L$8 = h3;
                        this.L$9 = d3oVar;
                        this.L$10 = charSequence10;
                        this.label = 3;
                        k2 = qohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                            noh nohVar19 = nohVar5;
                            nohVar7 = h3;
                            charSequence = charSequence10;
                            nohVar8 = nohVar2;
                            nohVar9 = nohVar6;
                            nohVar10 = nohVar19;
                            CharSequence charSequence11 = (CharSequence) k2;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar8;
                            this.L$5 = nohVar9;
                            this.L$6 = null;
                            this.L$7 = nohVar10;
                            this.L$8 = nohVar7;
                            this.L$9 = d3oVar;
                            this.L$10 = charSequence;
                            this.L$11 = charSequence11;
                            this.label = 4;
                            k3 = nohVar4.k(this);
                            if (k3 != coroutineSingletons) {
                                charSequence2 = charSequence;
                                nohVar11 = nohVar7;
                                d3oVar2 = d3oVar;
                                charSequence3 = charSequence11;
                                noh nohVar20 = nohVar8;
                                nohVar12 = nohVar9;
                                nohVar13 = nohVar20;
                                List list5 = (List) k3;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = nohVar12;
                                this.L$6 = null;
                                this.L$7 = nohVar10;
                                this.L$8 = nohVar11;
                                this.L$9 = d3oVar2;
                                this.L$10 = charSequence2;
                                this.L$11 = charSequence3;
                                this.L$12 = list5;
                                this.label = 5;
                                k4 = nohVar13.k(this);
                                if (k4 != coroutineSingletons) {
                                    nohVar14 = nohVar11;
                                    list = list5;
                                    w20 w20Var4 = (w20) k4;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = nohVar10;
                                    this.L$8 = nohVar14;
                                    this.L$9 = d3oVar2;
                                    this.L$10 = charSequence2;
                                    this.L$11 = charSequence3;
                                    this.L$12 = list;
                                    this.L$13 = w20Var4;
                                    this.label = 6;
                                    k5 = nohVar12.k(this);
                                    if (k5 != coroutineSingletons) {
                                        CharSequence charSequence12 = charSequence2;
                                        list2 = list;
                                        nohVar15 = nohVar14;
                                        charSequence4 = charSequence12;
                                        d3o d3oVar6 = d3oVar2;
                                        charSequence5 = charSequence3;
                                        w20Var = w20Var4;
                                        nohVar16 = nohVar10;
                                        d3oVar3 = d3oVar6;
                                        x1p0 x1p0Var4 = (x1p0) k5;
                                        if (nohVar16 == null) {
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = nohVar15;
                                            this.L$9 = d3oVar3;
                                            this.L$10 = charSequence4;
                                            this.L$11 = charSequence5;
                                            this.L$12 = list2;
                                            this.L$13 = w20Var;
                                            this.L$14 = x1p0Var4;
                                            this.label = 7;
                                            k6 = nohVar16.k(this);
                                            if (k6 != coroutineSingletons) {
                                                nohVar17 = nohVar15;
                                                x1p0Var2 = x1p0Var4;
                                                w20 w20Var5 = w20Var;
                                                x1p0Var = x1p0Var2;
                                                p2p0Var = (p2p0) k6;
                                                d3oVar4 = d3oVar3;
                                                charSequence6 = charSequence4;
                                                charSequence7 = charSequence5;
                                                list3 = list2;
                                                w20Var2 = w20Var5;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = null;
                                                this.L$8 = null;
                                                this.L$9 = d3oVar4;
                                                this.L$10 = charSequence6;
                                                this.L$11 = charSequence7;
                                                this.L$12 = list3;
                                                this.L$13 = w20Var2;
                                                this.L$14 = x1p0Var;
                                                this.L$15 = p2p0Var;
                                                this.label = 8;
                                                k7 = nohVar17.k(this);
                                                if (k7 != coroutineSingletons) {
                                                    list4 = list3;
                                                    charSequence8 = charSequence7;
                                                    x1p0Var3 = x1p0Var;
                                                    w20Var3 = w20Var2;
                                                    charSequence9 = charSequence6;
                                                    d3oVar5 = d3oVar4;
                                                    return new rco0(list4, d3oVar5, charSequence9, charSequence8, w20Var3, x1p0Var3, (kvm0) k7, p2p0Var);
                                                }
                                            }
                                        } else {
                                            d3oVar4 = d3oVar3;
                                            charSequence6 = charSequence4;
                                            charSequence7 = charSequence5;
                                            list3 = list2;
                                            w20Var2 = w20Var;
                                            x1p0Var = x1p0Var4;
                                            nohVar17 = nohVar15;
                                            p2p0Var = null;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = null;
                                            this.L$9 = d3oVar4;
                                            this.L$10 = charSequence6;
                                            this.L$11 = charSequence7;
                                            this.L$12 = list3;
                                            this.L$13 = w20Var2;
                                            this.L$14 = x1p0Var;
                                            this.L$15 = p2p0Var;
                                            this.label = 8;
                                            k7 = nohVar17.k(this);
                                            if (k7 != coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                h3 = (noh) this.L$8;
                ?? r3 = (noh) this.L$7;
                nohVar = (noh) this.L$6;
                nohVar3 = (noh) this.L$5;
                noh nohVar21 = (noh) this.L$4;
                ?? r9 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                nohVar2 = nohVar21;
                qohVar = r9;
                h2 = r3;
                s = obj;
                d3oVar = (d3o) s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = qohVar;
                this.L$4 = nohVar2;
                this.L$5 = nohVar3;
                this.L$6 = nohVar;
                this.L$7 = h2;
                this.L$8 = h3;
                this.L$9 = d3oVar;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                d3o d3oVar7 = (d3o) this.L$9;
                noh nohVar22 = (noh) this.L$8;
                nohVar5 = (noh) this.L$7;
                nohVar4 = (noh) this.L$6;
                nohVar6 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                ?? r10 = (noh) this.L$3;
                kotlin.b.b(obj);
                d3oVar = d3oVar7;
                h3 = nohVar22;
                qohVar2 = r10;
                k = obj;
                CharSequence charSequence102 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = nohVar6;
                this.L$6 = nohVar4;
                this.L$7 = nohVar5;
                this.L$8 = h3;
                this.L$9 = d3oVar;
                this.L$10 = charSequence102;
                this.label = 3;
                k2 = qohVar2.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                charSequence = (CharSequence) this.L$10;
                d3oVar = (d3o) this.L$9;
                noh nohVar23 = (noh) this.L$8;
                noh nohVar24 = (noh) this.L$7;
                nohVar4 = (noh) this.L$6;
                noh nohVar25 = (noh) this.L$5;
                noh nohVar26 = (noh) this.L$4;
                kotlin.b.b(obj);
                nohVar8 = nohVar26;
                nohVar9 = nohVar25;
                nohVar10 = nohVar24;
                nohVar7 = nohVar23;
                k2 = obj;
                CharSequence charSequence112 = (CharSequence) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar8;
                this.L$5 = nohVar9;
                this.L$6 = null;
                this.L$7 = nohVar10;
                this.L$8 = nohVar7;
                this.L$9 = d3oVar;
                this.L$10 = charSequence;
                this.L$11 = charSequence112;
                this.label = 4;
                k3 = nohVar4.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                CharSequence charSequence13 = (CharSequence) this.L$11;
                CharSequence charSequence14 = (CharSequence) this.L$10;
                d3o d3oVar8 = (d3o) this.L$9;
                noh nohVar27 = (noh) this.L$8;
                noh nohVar28 = (noh) this.L$7;
                noh nohVar29 = (noh) this.L$5;
                nohVar13 = (noh) this.L$4;
                kotlin.b.b(obj);
                charSequence3 = charSequence13;
                nohVar11 = nohVar27;
                d3oVar2 = d3oVar8;
                charSequence2 = charSequence14;
                nohVar12 = nohVar29;
                nohVar10 = nohVar28;
                k3 = obj;
                List list52 = (List) k3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar12;
                this.L$6 = null;
                this.L$7 = nohVar10;
                this.L$8 = nohVar11;
                this.L$9 = d3oVar2;
                this.L$10 = charSequence2;
                this.L$11 = charSequence3;
                this.L$12 = list52;
                this.label = 5;
                k4 = nohVar13.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                list = (List) this.L$12;
                charSequence3 = (CharSequence) this.L$11;
                charSequence2 = (CharSequence) this.L$10;
                d3oVar2 = (d3o) this.L$9;
                nohVar14 = (noh) this.L$8;
                nohVar10 = (noh) this.L$7;
                noh nohVar30 = (noh) this.L$5;
                kotlin.b.b(obj);
                nohVar12 = nohVar30;
                k4 = obj;
                w20 w20Var42 = (w20) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar10;
                this.L$8 = nohVar14;
                this.L$9 = d3oVar2;
                this.L$10 = charSequence2;
                this.L$11 = charSequence3;
                this.L$12 = list;
                this.L$13 = w20Var42;
                this.label = 6;
                k5 = nohVar12.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                w20 w20Var6 = (w20) this.L$13;
                List list6 = (List) this.L$12;
                CharSequence charSequence15 = (CharSequence) this.L$11;
                CharSequence charSequence16 = (CharSequence) this.L$10;
                d3o d3oVar9 = (d3o) this.L$9;
                noh nohVar31 = (noh) this.L$8;
                nohVar16 = (noh) this.L$7;
                kotlin.b.b(obj);
                w20Var = w20Var6;
                nohVar15 = nohVar31;
                d3oVar3 = d3oVar9;
                charSequence4 = charSequence16;
                charSequence5 = charSequence15;
                list2 = list6;
                k5 = obj;
                x1p0 x1p0Var42 = (x1p0) k5;
                if (nohVar16 == null) {
                }
                break;
            case 7:
                x1p0Var2 = (x1p0) this.L$14;
                w20Var = (w20) this.L$13;
                list2 = (List) this.L$12;
                charSequence5 = (CharSequence) this.L$11;
                charSequence4 = (CharSequence) this.L$10;
                d3oVar3 = (d3o) this.L$9;
                noh nohVar32 = (noh) this.L$8;
                kotlin.b.b(obj);
                nohVar17 = nohVar32;
                k6 = obj;
                w20 w20Var52 = w20Var;
                x1p0Var = x1p0Var2;
                p2p0Var = (p2p0) k6;
                d3oVar4 = d3oVar3;
                charSequence6 = charSequence4;
                charSequence7 = charSequence5;
                list3 = list2;
                w20Var2 = w20Var52;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = d3oVar4;
                this.L$10 = charSequence6;
                this.L$11 = charSequence7;
                this.L$12 = list3;
                this.L$13 = w20Var2;
                this.L$14 = x1p0Var;
                this.L$15 = p2p0Var;
                this.label = 8;
                k7 = nohVar17.k(this);
                if (k7 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                p2p0Var = (p2p0) this.L$15;
                x1p0 x1p0Var5 = (x1p0) this.L$14;
                w20 w20Var7 = (w20) this.L$13;
                List list7 = (List) this.L$12;
                charSequence8 = (CharSequence) this.L$11;
                CharSequence charSequence17 = (CharSequence) this.L$10;
                d3o d3oVar10 = (d3o) this.L$9;
                kotlin.b.b(obj);
                x1p0Var3 = x1p0Var5;
                list4 = list7;
                charSequence9 = charSequence17;
                w20Var3 = w20Var7;
                d3oVar5 = d3oVar10;
                k7 = obj;
                return new rco0(list4, d3oVar5, charSequence9, charSequence8, w20Var3, x1p0Var3, (kvm0) k7, p2p0Var);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
