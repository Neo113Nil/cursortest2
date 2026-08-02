package com.yandex.go.scooters.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import defpackage.a3o;
import defpackage.b4o;
import defpackage.c3o;
import defpackage.d3o;
import defpackage.fef;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oco0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.domain.model.SuperPassesDisplayVersion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld3o;", "<anonymous>", "(Ltse;)Ld3o;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$toEntrance$2", f = "ScootersPassMapper.kt", l = {338, 339, 340, 341, 342, 343}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$toEntrance$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ b4o $this_toEntrance;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
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
    public ScootersPassMapper$toEntrance$2(fef fefVar, b4o b4oVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$this_toEntrance = b4oVar;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassMapper$toEntrance$2 scootersPassMapper$toEntrance$2 = new ScootersPassMapper$toEntrance$2(this.$currencyRules, this.$this_toEntrance, this.this$0, continuation);
        scootersPassMapper$toEntrance$2.L$0 = obj;
        return scootersPassMapper$toEntrance$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$toEntrance$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0218, code lost:
    
        if (r9 == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Type inference failed for: r3v7, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        noh nohVar;
        noh nohVar2;
        CharSequence charSequence;
        Object k;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        CharSequence charSequence2;
        CharSequence charSequence3;
        noh nohVar6;
        noh nohVar7;
        BitmapDrawable bitmapDrawable;
        Object k2;
        CharSequence charSequence4;
        noh nohVar8;
        noh nohVar9;
        CharSequence charSequence5;
        Object k3;
        Object k4;
        BitmapDrawable bitmapDrawable2;
        CharSequence charSequence6;
        noh nohVar10;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object k5;
        CharSequence charSequence9;
        c3o c3oVar;
        int i;
        SuperPassesDisplayVersion superPassesDisplayVersion;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$titleRes$1(this.$currencyRules, this.$this_toEntrance, this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$subtitleRes$1(this.$currencyRules, this.$this_toEntrance, this.this$0, null), 3);
                String str = this.$this_toEntrance.c;
                qoh h5 = str != null ? tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$leadIcon$1$1(this.this$0, str, null), 3) : null;
                FormattedText formattedText = this.$this_toEntrance.d;
                qoh h6 = formattedText != null ? tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$pricePerMinute$1$1(this.this$0, formattedText, this.$currencyRules, null), 3) : null;
                h2 = tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$detailsAsync$1(this.$currencyRules, this.$this_toEntrance, this.this$0, null), 3);
                h3 = tje.h(tseVar, null, null, new ScootersPassMapper$toEntrance$2$badgeAsync$1(this.$currencyRules, this.$this_toEntrance, this.this$0, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = h6;
                this.L$5 = h2;
                this.L$6 = h3;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    qoh qohVar = h6;
                    nohVar = h5;
                    nohVar2 = qohVar;
                    charSequence = (CharSequence) s;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar;
                    this.L$4 = nohVar2;
                    this.L$5 = h2;
                    this.L$6 = h3;
                    this.L$7 = charSequence;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        noh nohVar11 = nohVar;
                        nohVar3 = nohVar2;
                        nohVar4 = h2;
                        nohVar5 = nohVar11;
                        CharSequence charSequence10 = (CharSequence) k;
                        if (nohVar5 == null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = nohVar3;
                            this.L$5 = nohVar4;
                            this.L$6 = h3;
                            this.L$7 = charSequence;
                            this.L$8 = charSequence10;
                            this.label = 3;
                            k2 = nohVar5.k(this);
                            if (k2 != coroutineSingletons) {
                                noh nohVar12 = nohVar4;
                                nohVar7 = h3;
                                charSequence4 = charSequence10;
                                nohVar8 = nohVar3;
                                nohVar9 = nohVar12;
                                CharSequence charSequence11 = charSequence;
                                charSequence3 = charSequence4;
                                bitmapDrawable = (BitmapDrawable) k2;
                                charSequence2 = charSequence11;
                                noh nohVar13 = nohVar8;
                                nohVar6 = nohVar9;
                                nohVar3 = nohVar13;
                                if (nohVar3 != null) {
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = nohVar6;
                                    this.L$6 = nohVar7;
                                    this.L$7 = charSequence2;
                                    this.L$8 = charSequence3;
                                    this.L$9 = bitmapDrawable;
                                    this.label = 4;
                                    k3 = nohVar3.k(this);
                                    break;
                                } else {
                                    charSequence5 = null;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = nohVar7;
                                    this.L$7 = charSequence2;
                                    this.L$8 = charSequence3;
                                    this.L$9 = bitmapDrawable;
                                    this.L$10 = charSequence5;
                                    this.label = 5;
                                    k4 = nohVar6.k(this);
                                    if (k4 != coroutineSingletons) {
                                        CharSequence charSequence12 = charSequence3;
                                        bitmapDrawable2 = bitmapDrawable;
                                        charSequence6 = charSequence5;
                                        nohVar10 = nohVar7;
                                        charSequence7 = charSequence2;
                                        charSequence8 = charSequence12;
                                        c3o c3oVar2 = (c3o) k4;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = charSequence7;
                                        this.L$8 = charSequence8;
                                        this.L$9 = bitmapDrawable2;
                                        this.L$10 = charSequence6;
                                        this.L$11 = c3oVar2;
                                        this.label = 6;
                                        k5 = nohVar10.k(this);
                                        if (k5 != coroutineSingletons) {
                                            charSequence9 = charSequence6;
                                            c3oVar = c3oVar2;
                                            BitmapDrawable bitmapDrawable3 = bitmapDrawable2;
                                            CharSequence charSequence13 = charSequence8;
                                            CharSequence charSequence14 = charSequence7;
                                            a3o a3oVar = (a3o) k5;
                                            i = oco0.a[this.$this_toEntrance.g.ordinal()];
                                            if (i != 1) {
                                                superPassesDisplayVersion = SuperPassesDisplayVersion.V1;
                                            } else {
                                                if (i != 2) {
                                                    w511.b();
                                                    return null;
                                                }
                                                superPassesDisplayVersion = SuperPassesDisplayVersion.V2;
                                            }
                                            return new d3o(charSequence14, charSequence13, bitmapDrawable3, charSequence9, c3oVar, a3oVar, superPassesDisplayVersion);
                                        }
                                    }
                                }
                            }
                        } else {
                            charSequence2 = charSequence;
                            charSequence3 = charSequence10;
                            nohVar6 = nohVar4;
                            nohVar7 = h3;
                            bitmapDrawable = null;
                            if (nohVar3 != null) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                h3 = (noh) this.L$6;
                ?? r3 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                h2 = r3;
                s = obj;
                charSequence = (CharSequence) s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = nohVar2;
                this.L$5 = h2;
                this.L$6 = h3;
                this.L$7 = charSequence;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                CharSequence charSequence15 = (CharSequence) this.L$7;
                noh nohVar14 = (noh) this.L$6;
                nohVar4 = (noh) this.L$5;
                nohVar3 = (noh) this.L$4;
                noh nohVar15 = (noh) this.L$3;
                kotlin.b.b(obj);
                charSequence = charSequence15;
                h3 = nohVar14;
                nohVar5 = nohVar15;
                k = obj;
                CharSequence charSequence102 = (CharSequence) k;
                if (nohVar5 == null) {
                }
                break;
            case 3:
                charSequence4 = (CharSequence) this.L$8;
                charSequence = (CharSequence) this.L$7;
                noh nohVar16 = (noh) this.L$6;
                noh nohVar17 = (noh) this.L$5;
                noh nohVar18 = (noh) this.L$4;
                kotlin.b.b(obj);
                nohVar8 = nohVar18;
                nohVar9 = nohVar17;
                nohVar7 = nohVar16;
                k2 = obj;
                CharSequence charSequence112 = charSequence;
                charSequence3 = charSequence4;
                bitmapDrawable = (BitmapDrawable) k2;
                charSequence2 = charSequence112;
                noh nohVar132 = nohVar8;
                nohVar6 = nohVar9;
                nohVar3 = nohVar132;
                if (nohVar3 != null) {
                }
                break;
            case 4:
                bitmapDrawable = (BitmapDrawable) this.L$9;
                charSequence3 = (CharSequence) this.L$8;
                charSequence2 = (CharSequence) this.L$7;
                nohVar7 = (noh) this.L$6;
                noh nohVar19 = (noh) this.L$5;
                kotlin.b.b(obj);
                nohVar6 = nohVar19;
                k3 = obj;
                charSequence5 = (CharSequence) k3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar7;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = bitmapDrawable;
                this.L$10 = charSequence5;
                this.label = 5;
                k4 = nohVar6.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                charSequence6 = (CharSequence) this.L$10;
                bitmapDrawable2 = (BitmapDrawable) this.L$9;
                charSequence8 = (CharSequence) this.L$8;
                charSequence7 = (CharSequence) this.L$7;
                nohVar10 = (noh) this.L$6;
                kotlin.b.b(obj);
                k4 = obj;
                c3o c3oVar22 = (c3o) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = charSequence7;
                this.L$8 = charSequence8;
                this.L$9 = bitmapDrawable2;
                this.L$10 = charSequence6;
                this.L$11 = c3oVar22;
                this.label = 6;
                k5 = nohVar10.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                c3o c3oVar3 = (c3o) this.L$11;
                CharSequence charSequence16 = (CharSequence) this.L$10;
                bitmapDrawable2 = (BitmapDrawable) this.L$9;
                charSequence8 = (CharSequence) this.L$8;
                charSequence7 = (CharSequence) this.L$7;
                kotlin.b.b(obj);
                k5 = obj;
                c3oVar = c3oVar3;
                charSequence9 = charSequence16;
                BitmapDrawable bitmapDrawable32 = bitmapDrawable2;
                CharSequence charSequence132 = charSequence8;
                CharSequence charSequence142 = charSequence7;
                a3o a3oVar2 = (a3o) k5;
                i = oco0.a[this.$this_toEntrance.g.ordinal()];
                if (i != 1) {
                }
                return new d3o(charSequence142, charSequence132, bitmapDrawable32, charSequence9, c3oVar, a3oVar2, superPassesDisplayVersion);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
