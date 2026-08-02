package com.yandex.go.safety.center.lost_item.modal.mapper;

import defpackage.frz;
import defpackage.grz;
import defpackage.hrz;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.orz;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhrz;", "<anonymous>", "(Ltse;)Lhrz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapContentToUi$2", f = "LostItemsUiMapper.kt", l = {41, 42, 43, 44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapContentToUi$2 extends SuspendLambda implements wls {
    final /* synthetic */ orz $content;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
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
    public LostItemsUiMapper$mapContentToUi$2(orz orzVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$content = orzVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LostItemsUiMapper$mapContentToUi$2 lostItemsUiMapper$mapContentToUi$2 = new LostItemsUiMapper$mapContentToUi$2(this.$content, this.this$0, continuation);
        lostItemsUiMapper$mapContentToUi$2.L$0 = obj;
        return lostItemsUiMapper$mapContentToUi$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapContentToUi$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Type inference failed for: r3v14, types: [noh] */
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
        grz grzVar;
        Object k;
        noh nohVar2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object k2;
        noh nohVar3;
        CharSequence charSequence3;
        Object k3;
        noh nohVar4;
        CharSequence charSequence4;
        grz grzVar2;
        CharSequence charSequence5;
        CharSequence charSequence6;
        List list;
        Object k4;
        CharSequence charSequence7;
        List list2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        frz frzVar = null;
        if (i == 0) {
            b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapContentToUi$2$imageDeferred$1(this.$content, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new LostItemsUiMapper$mapContentToUi$2$titleDeferred$1(this.$content, this.this$0, null), 3);
            orz orzVar = this.$content;
            qoh h5 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapContentToUi$2$subtitleDeferred$1$1(this.this$0, orzVar.c, orzVar, null), 3);
            h2 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1(this.$content, this.this$0, null), 3);
            orz orzVar2 = this.$content;
            h3 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapContentToUi$2$actionButtonDeferred$1$1(this.this$0, orzVar2.e, orzVar2, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h5;
            this.L$4 = h2;
            this.L$5 = h3;
            this.label = 1;
            s = h4.s(this);
            if (s != coroutineSingletons) {
                nohVar = h5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                grz grzVar3 = (grz) this.L$6;
                noh nohVar5 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                grzVar = grzVar3;
                h3 = nohVar5;
                k = obj;
                charSequence = (CharSequence) k;
                if (nohVar != null) {
                    charSequence2 = null;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = h3;
                    this.L$6 = grzVar;
                    this.L$7 = charSequence;
                    this.L$8 = charSequence2;
                    this.label = 4;
                    k3 = nohVar2.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = h3;
                this.L$6 = grzVar;
                this.L$7 = charSequence;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    nohVar3 = h3;
                    charSequence3 = charSequence;
                    charSequence2 = (CharSequence) k2;
                    noh nohVar6 = nohVar3;
                    charSequence = charSequence3;
                    h3 = nohVar6;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = h3;
                    this.L$6 = grzVar;
                    this.L$7 = charSequence;
                    this.L$8 = charSequence2;
                    this.label = 4;
                    k3 = nohVar2.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                charSequence3 = (CharSequence) this.L$7;
                grzVar = (grz) this.L$6;
                noh nohVar7 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                b.b(obj);
                nohVar3 = nohVar7;
                k2 = obj;
                charSequence2 = (CharSequence) k2;
                noh nohVar62 = nohVar3;
                charSequence = charSequence3;
                h3 = nohVar62;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h3;
                this.L$6 = grzVar;
                this.L$7 = charSequence;
                this.L$8 = charSequence2;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    CharSequence charSequence8 = charSequence2;
                    nohVar4 = h3;
                    charSequence4 = charSequence8;
                    CharSequence charSequence9 = charSequence;
                    grzVar2 = grzVar;
                    charSequence5 = charSequence9;
                    List list3 = (List) k3;
                    if (nohVar4 != null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) this.L$9;
                charSequence7 = (CharSequence) this.L$8;
                charSequence5 = (CharSequence) this.L$7;
                grzVar2 = (grz) this.L$6;
                b.b(obj);
                k4 = obj;
                frzVar = (frz) k4;
                list = list2;
                charSequence6 = charSequence7;
                return new hrz(grzVar2, charSequence5, charSequence6, list, frzVar);
            }
            charSequence4 = (CharSequence) this.L$8;
            charSequence5 = (CharSequence) this.L$7;
            grz grzVar4 = (grz) this.L$6;
            nohVar4 = (noh) this.L$5;
            b.b(obj);
            grzVar2 = grzVar4;
            k3 = obj;
            List list32 = (List) k3;
            if (nohVar4 != null) {
                charSequence6 = charSequence4;
                list = list32;
                return new hrz(grzVar2, charSequence5, charSequence6, list, frzVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = grzVar2;
            this.L$7 = charSequence5;
            this.L$8 = charSequence4;
            this.L$9 = list32;
            this.label = 5;
            k4 = nohVar4.k(this);
            if (k4 != coroutineSingletons) {
                charSequence7 = charSequence4;
                list2 = list32;
                frzVar = (frz) k4;
                list = list2;
                charSequence6 = charSequence7;
                return new hrz(grzVar2, charSequence5, charSequence6, list, frzVar);
            }
            return coroutineSingletons;
        }
        h3 = (noh) this.L$5;
        ?? r3 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        b.b(obj);
        h2 = r3;
        s = obj;
        grzVar = (grz) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = h2;
        this.L$5 = h3;
        this.L$6 = grzVar;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = h2;
            charSequence = (CharSequence) k;
            if (nohVar != null) {
            }
        }
        return coroutineSingletons;
    }
}
