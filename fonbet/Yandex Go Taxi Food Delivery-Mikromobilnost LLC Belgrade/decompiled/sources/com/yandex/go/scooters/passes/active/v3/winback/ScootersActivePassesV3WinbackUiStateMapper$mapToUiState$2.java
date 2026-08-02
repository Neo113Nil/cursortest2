package com.yandex.go.scooters.passes.active.v3.winback;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pum0;
import defpackage.qoh;
import defpackage.rum0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zum0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpum0;", "<anonymous>", "(Ltse;)Lpum0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.winback.ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2", f = "ScootersActivePassesV3WinbackUiStateMapper.kt", l = {28, 29, 30, 31, 33, 34, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $inProgress;
    final /* synthetic */ zum0 $winbackInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ rum0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2(zum0 zum0Var, boolean z, rum0 rum0Var, Continuation continuation) {
        super(2, continuation);
        this.$winbackInfo = zum0Var;
        this.$inProgress = z;
        this.this$0 = rum0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2 scootersActivePassesV3WinbackUiStateMapper$mapToUiState$2 = new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2(this.$winbackInfo, this.$inProgress, this.this$0, continuation);
        scootersActivePassesV3WinbackUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersActivePassesV3WinbackUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0240  */
    /* JADX WARN: Type inference failed for: r5v11, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v7, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        noh nohVar;
        boolean z;
        noh nohVar2;
        qoh qohVar;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object k;
        CharSequence charSequence3;
        CharSequence charSequence4;
        noh nohVar6;
        noh nohVar7;
        noh nohVar8;
        noh nohVar9;
        noh nohVar10;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        noh nohVar11;
        String str;
        CharSequence charSequence10;
        Object k2;
        CharSequence charSequence11;
        noh nohVar12;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        String str2;
        Object k3;
        CharSequence charSequence16;
        String str3;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        CharSequence charSequence20;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$winbackInfo, null), 3);
                FormattedText formattedText = this.$winbackInfo.b;
                h = formattedText != null ? tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$subtitleAsync$1$1(this.this$0, formattedText, null), 3) : null;
                h2 = tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$priceTitle$1(this.this$0, this.$winbackInfo, null), 3);
                FormattedText formattedText2 = this.$winbackInfo.d;
                qoh h5 = formattedText2 != null ? tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$priceSubtitle$1$1(this.this$0, formattedText2, null), 3) : null;
                FormattedText formattedText3 = this.$winbackInfo.f;
                h3 = formattedText3 != null ? tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$description$1$1(this.this$0, formattedText3, null), 3) : null;
                qoh h6 = tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$rejectButtonTextAsync$1(this.this$0, this.$winbackInfo, null), 3);
                qoh h7 = tje.h(tseVar, null, null, new ScootersActivePassesV3WinbackUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.this$0, this.$winbackInfo, null), 3);
                boolean z2 = this.$inProgress;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h2;
                this.L$4 = h5;
                this.L$5 = h3;
                this.L$6 = h6;
                this.L$7 = h7;
                this.Z$0 = z2;
                this.label = 1;
                obj = h4.s(this);
                if (obj != coroutineSingletons) {
                    qoh qohVar2 = h5;
                    nohVar = h7;
                    z = z2;
                    nohVar2 = qohVar2;
                    qohVar = h6;
                    nohVar3 = h3;
                    nohVar4 = qohVar;
                    CharSequence charSequence21 = (CharSequence) obj;
                    if (h == null) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = h2;
                        this.L$4 = nohVar2;
                        this.L$5 = nohVar3;
                        this.L$6 = nohVar4;
                        this.L$7 = nohVar;
                        this.L$8 = charSequence21;
                        this.Z$0 = z;
                        this.label = 2;
                        Object k4 = h.k(this);
                        if (k4 != coroutineSingletons) {
                            qoh qohVar3 = h2;
                            charSequence = charSequence21;
                            obj = k4;
                            nohVar5 = qohVar3;
                            charSequence2 = (CharSequence) obj;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar2;
                            this.L$5 = nohVar3;
                            this.L$6 = nohVar4;
                            this.L$7 = nohVar;
                            this.L$8 = charSequence;
                            this.L$9 = charSequence2;
                            this.Z$0 = z;
                            this.label = 3;
                            k = nohVar5.k(this);
                            if (k != coroutineSingletons) {
                                charSequence3 = charSequence2;
                                obj = k;
                                noh nohVar13 = nohVar;
                                charSequence4 = charSequence;
                                nohVar6 = nohVar3;
                                nohVar7 = nohVar4;
                                nohVar8 = nohVar13;
                                CharSequence charSequence22 = (CharSequence) obj;
                                if (nohVar2 == null) {
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = nohVar6;
                                    this.L$6 = nohVar7;
                                    this.L$7 = nohVar8;
                                    this.L$8 = charSequence4;
                                    this.L$9 = charSequence3;
                                    this.L$10 = charSequence22;
                                    this.Z$0 = z;
                                    this.label = 4;
                                    Object k5 = nohVar2.k(this);
                                    if (k5 != coroutineSingletons) {
                                        noh nohVar14 = nohVar6;
                                        charSequence9 = charSequence22;
                                        obj = k5;
                                        nohVar11 = nohVar14;
                                        nohVar10 = nohVar7;
                                        charSequence7 = charSequence4;
                                        charSequence8 = charSequence9;
                                        nohVar6 = nohVar11;
                                        nohVar9 = nohVar8;
                                        charSequence5 = charSequence3;
                                        charSequence6 = (CharSequence) obj;
                                        String str4 = this.$winbackInfo.e;
                                        if (nohVar6 != null) {
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = nohVar10;
                                            this.L$7 = nohVar9;
                                            this.L$8 = charSequence7;
                                            this.L$9 = charSequence5;
                                            this.L$10 = charSequence8;
                                            this.L$11 = charSequence6;
                                            this.L$12 = str4;
                                            this.Z$0 = z;
                                            this.label = 5;
                                            Object k6 = nohVar6.k(this);
                                            if (k6 != coroutineSingletons) {
                                                str = str4;
                                                obj = k6;
                                                charSequence10 = (CharSequence) obj;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.L$7 = nohVar9;
                                                this.L$8 = charSequence7;
                                                this.L$9 = charSequence5;
                                                this.L$10 = charSequence8;
                                                this.L$11 = charSequence6;
                                                this.L$12 = str;
                                                this.L$13 = charSequence10;
                                                this.Z$0 = z;
                                                this.label = 6;
                                                k2 = nohVar10.k(this);
                                                if (k2 != coroutineSingletons) {
                                                    String str5 = str;
                                                    charSequence11 = charSequence10;
                                                    obj = k2;
                                                    nohVar12 = nohVar9;
                                                    charSequence12 = charSequence7;
                                                    charSequence13 = charSequence5;
                                                    charSequence14 = charSequence8;
                                                    charSequence15 = charSequence6;
                                                    str2 = str5;
                                                    CharSequence charSequence23 = (CharSequence) obj;
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.L$7 = null;
                                                    this.L$8 = charSequence12;
                                                    this.L$9 = charSequence13;
                                                    this.L$10 = charSequence14;
                                                    this.L$11 = charSequence15;
                                                    this.L$12 = str2;
                                                    this.L$13 = charSequence11;
                                                    this.L$14 = charSequence23;
                                                    this.Z$0 = z;
                                                    this.label = 7;
                                                    k3 = nohVar12.k(this);
                                                    if (k3 != coroutineSingletons) {
                                                        charSequence16 = charSequence14;
                                                        str3 = str2;
                                                        charSequence17 = charSequence13;
                                                        charSequence18 = charSequence11;
                                                        charSequence19 = charSequence12;
                                                        charSequence20 = charSequence23;
                                                        obj = k3;
                                                        return new pum0(z, charSequence19, charSequence17, charSequence16, charSequence15, str3, charSequence18, charSequence20, (CharSequence) obj);
                                                    }
                                                }
                                            }
                                        } else {
                                            str = str4;
                                            charSequence10 = null;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = nohVar9;
                                            this.L$8 = charSequence7;
                                            this.L$9 = charSequence5;
                                            this.L$10 = charSequence8;
                                            this.L$11 = charSequence6;
                                            this.L$12 = str;
                                            this.L$13 = charSequence10;
                                            this.Z$0 = z;
                                            this.label = 6;
                                            k2 = nohVar10.k(this);
                                            if (k2 != coroutineSingletons) {
                                            }
                                        }
                                    }
                                } else {
                                    nohVar9 = nohVar8;
                                    nohVar10 = nohVar7;
                                    charSequence5 = charSequence3;
                                    charSequence6 = null;
                                    charSequence7 = charSequence4;
                                    charSequence8 = charSequence22;
                                    String str42 = this.$winbackInfo.e;
                                    if (nohVar6 != null) {
                                    }
                                }
                            }
                        }
                    } else {
                        nohVar5 = h2;
                        charSequence = charSequence21;
                        charSequence2 = null;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = nohVar2;
                        this.L$5 = nohVar3;
                        this.L$6 = nohVar4;
                        this.L$7 = nohVar;
                        this.L$8 = charSequence;
                        this.L$9 = charSequence2;
                        this.Z$0 = z;
                        this.label = 3;
                        k = nohVar5.k(this);
                        if (k != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                z = this.Z$0;
                noh nohVar15 = (noh) this.L$7;
                ?? r5 = (noh) this.L$6;
                h3 = (noh) this.L$5;
                noh nohVar16 = (noh) this.L$4;
                ?? r8 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                qohVar = r5;
                nohVar = nohVar15;
                h2 = r8;
                nohVar2 = nohVar16;
                nohVar3 = h3;
                nohVar4 = qohVar;
                CharSequence charSequence212 = (CharSequence) obj;
                if (h == null) {
                }
                break;
            case 2:
                z = this.Z$0;
                charSequence = (CharSequence) this.L$8;
                nohVar = (noh) this.L$7;
                nohVar4 = (noh) this.L$6;
                nohVar3 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                kotlin.b.b(obj);
                charSequence2 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = nohVar3;
                this.L$6 = nohVar4;
                this.L$7 = nohVar;
                this.L$8 = charSequence;
                this.L$9 = charSequence2;
                this.Z$0 = z;
                this.label = 3;
                k = nohVar5.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                z = this.Z$0;
                CharSequence charSequence24 = (CharSequence) this.L$9;
                CharSequence charSequence25 = (CharSequence) this.L$8;
                noh nohVar17 = (noh) this.L$7;
                noh nohVar18 = (noh) this.L$6;
                noh nohVar19 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                kotlin.b.b(obj);
                charSequence3 = charSequence24;
                nohVar6 = nohVar19;
                nohVar7 = nohVar18;
                nohVar8 = nohVar17;
                charSequence4 = charSequence25;
                CharSequence charSequence222 = (CharSequence) obj;
                if (nohVar2 == null) {
                }
                break;
            case 4:
                z = this.Z$0;
                charSequence9 = (CharSequence) this.L$10;
                charSequence3 = (CharSequence) this.L$9;
                charSequence4 = (CharSequence) this.L$8;
                nohVar8 = (noh) this.L$7;
                nohVar7 = (noh) this.L$6;
                nohVar11 = (noh) this.L$5;
                kotlin.b.b(obj);
                nohVar10 = nohVar7;
                charSequence7 = charSequence4;
                charSequence8 = charSequence9;
                nohVar6 = nohVar11;
                nohVar9 = nohVar8;
                charSequence5 = charSequence3;
                charSequence6 = (CharSequence) obj;
                String str422 = this.$winbackInfo.e;
                if (nohVar6 != null) {
                }
                break;
            case 5:
                z = this.Z$0;
                str = (String) this.L$12;
                charSequence6 = (CharSequence) this.L$11;
                charSequence8 = (CharSequence) this.L$10;
                charSequence5 = (CharSequence) this.L$9;
                charSequence7 = (CharSequence) this.L$8;
                nohVar9 = (noh) this.L$7;
                nohVar10 = (noh) this.L$6;
                kotlin.b.b(obj);
                charSequence10 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar9;
                this.L$8 = charSequence7;
                this.L$9 = charSequence5;
                this.L$10 = charSequence8;
                this.L$11 = charSequence6;
                this.L$12 = str;
                this.L$13 = charSequence10;
                this.Z$0 = z;
                this.label = 6;
                k2 = nohVar10.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                z = this.Z$0;
                charSequence11 = (CharSequence) this.L$13;
                str2 = (String) this.L$12;
                charSequence15 = (CharSequence) this.L$11;
                charSequence14 = (CharSequence) this.L$10;
                charSequence13 = (CharSequence) this.L$9;
                charSequence12 = (CharSequence) this.L$8;
                nohVar12 = (noh) this.L$7;
                kotlin.b.b(obj);
                CharSequence charSequence232 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = charSequence12;
                this.L$9 = charSequence13;
                this.L$10 = charSequence14;
                this.L$11 = charSequence15;
                this.L$12 = str2;
                this.L$13 = charSequence11;
                this.L$14 = charSequence232;
                this.Z$0 = z;
                this.label = 7;
                k3 = nohVar12.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                z = this.Z$0;
                CharSequence charSequence26 = (CharSequence) this.L$14;
                CharSequence charSequence27 = (CharSequence) this.L$13;
                String str6 = (String) this.L$12;
                CharSequence charSequence28 = (CharSequence) this.L$11;
                CharSequence charSequence29 = (CharSequence) this.L$10;
                CharSequence charSequence30 = (CharSequence) this.L$9;
                CharSequence charSequence31 = (CharSequence) this.L$8;
                kotlin.b.b(obj);
                charSequence18 = charSequence27;
                charSequence19 = charSequence31;
                str3 = str6;
                charSequence17 = charSequence30;
                charSequence15 = charSequence28;
                charSequence16 = charSequence29;
                charSequence20 = charSequence26;
                return new pum0(z, charSequence19, charSequence17, charSequence16, charSequence15, str3, charSequence18, charSequence20, (CharSequence) obj);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
