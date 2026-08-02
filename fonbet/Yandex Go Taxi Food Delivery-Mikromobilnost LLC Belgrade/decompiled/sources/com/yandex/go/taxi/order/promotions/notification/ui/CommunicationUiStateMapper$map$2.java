package com.yandex.go.taxi.order.promotions.notification.ui;

import android.graphics.drawable.Drawable;
import defpackage.ksc;
import defpackage.lsc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llsc;", "<anonymous>", "(Ltse;)Llsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.notification.ui.CommunicationUiStateMapper$map$2", f = "CommunicationUiStateMapper.kt", l = {42, 46, 47, 48, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CommunicationUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ CommunicationItem $item;
    int I$0;
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
    public CommunicationUiStateMapper$map$2(a aVar, CommunicationItem communicationItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = communicationItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommunicationUiStateMapper$map$2 communicationUiStateMapper$map$2 = new CommunicationUiStateMapper$map$2(this.this$0, this.$item, continuation);
        communicationUiStateMapper$map$2.L$0 = obj;
        return communicationUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommunicationUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /* JADX WARN: Type inference failed for: r0v12, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        qoh qohVar;
        noh nohVar4;
        sls slsVar;
        String str;
        Object k;
        Drawable drawable;
        sls slsVar2;
        Object k2;
        CharSequence charSequence;
        String str2;
        Drawable drawable2;
        Object k3;
        CharSequence charSequence2;
        String str3;
        sls slsVar3;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new CommunicationUiStateMapper$map$2$title$1(this.this$0, this.$item, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new CommunicationUiStateMapper$map$2$subtitle$1(this.this$0, this.$item, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new CommunicationUiStateMapper$map$2$leadIcon$1(this.this$0, this.$item, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new CommunicationUiStateMapper$map$2$trailDeferred$1(this.this$0, this.$item, null), 3);
            a aVar = this.this$0;
            String str4 = this.$item.a;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = h2;
            this.L$3 = h3;
            this.L$4 = h4;
            this.label = 1;
            Object a = a.a(aVar, h4, str4, this);
            if (a != coroutineSingletons) {
                nohVar = h;
                obj = a;
                nohVar2 = h2;
                nohVar3 = h3;
                qohVar = h4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                String str5 = (String) this.L$6;
                sls slsVar4 = (sls) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar2 = (noh) this.L$2;
                nohVar = (noh) this.L$1;
                kotlin.b.b(obj);
                str = str5;
                slsVar = slsVar4;
                Drawable drawable3 = (Drawable) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = nohVar2;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = slsVar;
                this.L$6 = str;
                this.L$7 = drawable3;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    sls slsVar5 = slsVar;
                    drawable = drawable3;
                    obj = k;
                    slsVar2 = slsVar5;
                    CharSequence charSequence4 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = nohVar4;
                    this.L$5 = slsVar2;
                    this.L$6 = str;
                    this.L$7 = drawable;
                    this.L$8 = charSequence4;
                    this.label = 4;
                    k2 = nohVar2.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                drawable = (Drawable) this.L$7;
                str = (String) this.L$6;
                slsVar2 = (sls) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar2 = (noh) this.L$2;
                kotlin.b.b(obj);
                CharSequence charSequence42 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = slsVar2;
                this.L$6 = str;
                this.L$7 = drawable;
                this.L$8 = charSequence42;
                this.label = 4;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                    Drawable drawable4 = drawable;
                    charSequence = charSequence42;
                    obj = k2;
                    str2 = str;
                    drawable2 = drawable4;
                    CharSequence charSequence5 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = slsVar2;
                    this.L$6 = str2;
                    this.L$7 = drawable2;
                    this.L$8 = charSequence;
                    this.L$9 = charSequence5;
                    this.I$0 = 0;
                    this.label = 5;
                    k3 = nohVar4.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence6 = (CharSequence) this.L$9;
                CharSequence charSequence7 = (CharSequence) this.L$8;
                drawable2 = (Drawable) this.L$7;
                String str6 = (String) this.L$6;
                sls slsVar6 = (sls) this.L$5;
                kotlin.b.b(obj);
                charSequence2 = charSequence7;
                str3 = str6;
                slsVar3 = slsVar6;
                charSequence3 = charSequence6;
                return new lsc(str3, drawable2, charSequence2, charSequence3, (ksc) obj, slsVar3);
            }
            charSequence = (CharSequence) this.L$8;
            drawable2 = (Drawable) this.L$7;
            str2 = (String) this.L$6;
            slsVar2 = (sls) this.L$5;
            nohVar4 = (noh) this.L$4;
            kotlin.b.b(obj);
            CharSequence charSequence52 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = slsVar2;
            this.L$6 = str2;
            this.L$7 = drawable2;
            this.L$8 = charSequence;
            this.L$9 = charSequence52;
            this.I$0 = 0;
            this.label = 5;
            k3 = nohVar4.k(this);
            if (k3 != coroutineSingletons) {
                charSequence2 = charSequence;
                str3 = str2;
                slsVar3 = slsVar2;
                charSequence3 = charSequence52;
                obj = k3;
                return new lsc(str3, drawable2, charSequence2, charSequence3, (ksc) obj, slsVar3);
            }
            return coroutineSingletons;
        }
        ?? r0 = (noh) this.L$4;
        nohVar3 = (noh) this.L$3;
        nohVar2 = (noh) this.L$2;
        nohVar = (noh) this.L$1;
        kotlin.b.b(obj);
        qohVar = r0;
        sls slsVar7 = (sls) obj;
        String str7 = this.$item.a;
        this.L$0 = null;
        this.L$1 = nohVar;
        this.L$2 = nohVar2;
        this.L$3 = null;
        this.L$4 = qohVar;
        this.L$5 = slsVar7;
        this.L$6 = str7;
        this.label = 2;
        Object k4 = nohVar3.k(this);
        if (k4 != coroutineSingletons) {
            nohVar4 = qohVar;
            slsVar = slsVar7;
            obj = k4;
            str = str7;
            Drawable drawable32 = (Drawable) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = nohVar2;
            this.L$3 = null;
            this.L$4 = nohVar4;
            this.L$5 = slsVar;
            this.L$6 = str;
            this.L$7 = drawable32;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
