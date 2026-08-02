package com.yandex.go.taxi.order.bubble;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.txu0;
import defpackage.uxu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2", f = "StyledOrderBubbleViewHolder.kt", l = {144, 145}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ uxu0 $icon;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$1", f = "StyledOrderBubbleViewHolder.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ txu0 $collapsedIcon;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, txu0 txu0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$collapsedIcon = txu0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$collapsedIcon, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = this.this$0;
                txu0 txu0Var = this.$collapsedIcon;
                this.label = 1;
                if (g.b(gVar, txu0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2(uxu0 uxu0Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$icon = uxu0Var;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2 styledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2 = new StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2(this.$icon, this.this$0, continuation);
        styledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2.L$0 = obj;
        return styledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (r0.k(r9) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10.s(r9) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh qohVar;
        noh h;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            txu0 txu0Var = this.$icon.c;
            g gVar = this.this$0;
            if (txu0Var != null) {
                qohVar = tje.h(tseVar, null, null, new AnonymousClass1(gVar, txu0Var, null), 3);
            } else {
                StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State = gVar.E;
                StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State2 = StyledOrderBubbleViewHolder$State.EXPANDED;
                if (styledOrderBubbleViewHolder$State != styledOrderBubbleViewHolder$State2 && gVar.f().o) {
                    gVar.E = styledOrderBubbleViewHolder$State2;
                    gVar.g();
                }
                qohVar = null;
            }
            h = tje.h(tseVar, null, null, new StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1(this.$icon, this.this$0, null), 3);
            if (qohVar != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = h;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            h = (noh) this.L$3;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
