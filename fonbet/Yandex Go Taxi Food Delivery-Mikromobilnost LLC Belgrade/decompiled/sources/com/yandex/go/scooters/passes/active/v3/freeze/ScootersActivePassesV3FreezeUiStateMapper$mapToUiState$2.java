package com.yandex.go.scooters.passes.active.v3.freeze;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.urm0;
import defpackage.wls;
import defpackage.wum0;
import defpackage.xum0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lurm0;", "<anonymous>", "(Ltse;)Lurm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.freeze.ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2", f = "ScootersActivePassesV3FreezeUiStateMapper.kt", l = {24, 29, 30, 32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $autorenewInProgress;
    final /* synthetic */ boolean $freezeInProgress;
    final /* synthetic */ xum0 $freezeInfo;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
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
    public ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2(xum0 xum0Var, boolean z, boolean z2, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$freezeInfo = xum0Var;
        this.$autorenewInProgress = z;
        this.$freezeInProgress = z2;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2 scootersActivePassesV3FreezeUiStateMapper$mapToUiState$2 = new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2(this.$freezeInfo, this.$autorenewInProgress, this.$freezeInProgress, this.this$0, continuation);
        scootersActivePassesV3FreezeUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersActivePassesV3FreezeUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Type inference failed for: r1v13, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        Object b;
        noh nohVar;
        noh nohVar2;
        Object k;
        noh nohVar3;
        noh nohVar4;
        List list;
        noh nohVar5;
        int i;
        String str;
        CharSequence charSequence;
        Object k2;
        String str2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object k3;
        CharSequence charSequence4;
        List list2;
        Object k4;
        CharSequence charSequence5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$freezeInfo, null), 3);
            FormattedText formattedText = this.$freezeInfo.b;
            qoh h3 = formattedText != null ? tje.h(tseVar, null, null, new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$subtitleAsync$1$1(this.this$0, formattedText, null), 3) : null;
            qoh h4 = tje.h(tseVar, null, null, new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$rejectButtonTextAsync$1(this.this$0, this.$freezeInfo, null), 3);
            h2 = tje.h(tseVar, null, null, new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.this$0, this.$freezeInfo, null), 3);
            ArrayList arrayList = this.$freezeInfo.d;
            d dVar = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(tje.h(tseVar, null, null, new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$details$1$1(dVar, (wum0) it.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = h3;
            this.L$3 = h4;
            this.L$4 = h2;
            this.label = 1;
            b = kotlinx.coroutines.a.b(arrayList2, this);
            if (b != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.I$0;
                str = (String) this.L$6;
                list = (List) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                nohVar3 = (noh) this.L$2;
                kotlin.b.b(obj);
                k = obj;
                charSequence = (CharSequence) k;
                if (nohVar3 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar5;
                    this.L$4 = nohVar4;
                    this.L$5 = list;
                    this.L$6 = str;
                    this.L$7 = charSequence;
                    this.I$0 = i;
                    this.label = 3;
                    k2 = nohVar3.k(this);
                    if (k2 != coroutineSingletons) {
                        str2 = str;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) k2;
                        if (charSequence3 == null) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = nohVar4;
                        this.L$5 = null;
                        this.L$6 = str2;
                        this.L$7 = charSequence2;
                        this.L$8 = charSequence3;
                        this.L$9 = list;
                        this.I$0 = i;
                        this.label = 4;
                        k3 = nohVar5.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                charSequence3 = "";
                str2 = str;
                charSequence2 = charSequence;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = null;
                this.L$6 = str2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = list;
                this.I$0 = i;
                this.label = 4;
                k3 = nohVar5.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                i = this.I$0;
                charSequence2 = (CharSequence) this.L$7;
                str2 = (String) this.L$6;
                list = (List) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                kotlin.b.b(obj);
                k2 = obj;
                charSequence3 = (CharSequence) k2;
                if (charSequence3 == null) {
                    charSequence = charSequence2;
                    str = str2;
                    charSequence3 = "";
                    str2 = str;
                    charSequence2 = charSequence;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = null;
                this.L$6 = str2;
                this.L$7 = charSequence2;
                this.L$8 = charSequence3;
                this.L$9 = list;
                this.I$0 = i;
                this.label = 4;
                k3 = nohVar5.k(this);
                if (k3 != coroutineSingletons) {
                    charSequence4 = charSequence2;
                    list2 = list;
                    CharSequence charSequence6 = (CharSequence) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = str2;
                    this.L$7 = charSequence4;
                    this.L$8 = charSequence3;
                    this.L$9 = list2;
                    this.L$10 = charSequence6;
                    this.I$0 = i;
                    this.label = 5;
                    k4 = nohVar4.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                CharSequence charSequence7 = (CharSequence) this.L$10;
                list2 = (List) this.L$9;
                charSequence3 = (CharSequence) this.L$8;
                charSequence4 = (CharSequence) this.L$7;
                str2 = (String) this.L$6;
                kotlin.b.b(obj);
                k4 = obj;
                charSequence5 = charSequence7;
                return new urm0(i == 0, str2, charSequence4, charSequence3, list2, charSequence5, (CharSequence) k4);
            }
            i = this.I$0;
            list2 = (List) this.L$9;
            CharSequence charSequence8 = (CharSequence) this.L$8;
            CharSequence charSequence9 = (CharSequence) this.L$7;
            String str3 = (String) this.L$6;
            nohVar4 = (noh) this.L$4;
            kotlin.b.b(obj);
            k3 = obj;
            charSequence3 = charSequence8;
            charSequence4 = charSequence9;
            str2 = str3;
            CharSequence charSequence62 = (CharSequence) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = str2;
            this.L$7 = charSequence4;
            this.L$8 = charSequence3;
            this.L$9 = list2;
            this.L$10 = charSequence62;
            this.I$0 = i;
            this.label = 5;
            k4 = nohVar4.k(this);
            if (k4 != coroutineSingletons) {
                charSequence5 = charSequence62;
                return new urm0(i == 0, str2, charSequence4, charSequence3, list2, charSequence5, (CharSequence) k4);
            }
            return coroutineSingletons;
        }
        ?? r1 = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        h = (noh) this.L$1;
        kotlin.b.b(obj);
        h2 = r1;
        b = obj;
        List list3 = (List) b;
        int i3 = (this.$autorenewInProgress || this.$freezeInProgress) ? 1 : 0;
        String str4 = this.$freezeInfo.c;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = nohVar;
        this.L$3 = nohVar2;
        this.L$4 = h2;
        this.L$5 = list3;
        this.L$6 = str4;
        this.I$0 = i3;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            qoh qohVar = h2;
            nohVar3 = nohVar;
            nohVar4 = qohVar;
            list = list3;
            nohVar5 = nohVar2;
            i = i3;
            str = str4;
            charSequence = (CharSequence) k;
            if (nohVar3 != null) {
            }
            charSequence3 = "";
            str2 = str;
            charSequence2 = charSequence;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar4;
            this.L$5 = null;
            this.L$6 = str2;
            this.L$7 = charSequence2;
            this.L$8 = charSequence3;
            this.L$9 = list;
            this.I$0 = i;
            this.label = 4;
            k3 = nohVar5.k(this);
            if (k3 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
