package com.yandex.go.special_needs_menu.ui;

import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pot0;
import defpackage.qoh;
import defpackage.qot0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpot0;", "<anonymous>", "(Ltse;)Lpot0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.special_needs_menu.ui.SpecialNeedsMenuItemUiStateFactory$createUiState$2", f = "SpecialNeedsMenuItemUiStateFactory.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SpecialNeedsMenuItemUiStateFactory$createUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ SpecialNeedsMenuItemExperiment $exp;
    int label;
    final /* synthetic */ qot0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpot0;", "<anonymous>", "(Ltse;)Lpot0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.special_needs_menu.ui.SpecialNeedsMenuItemUiStateFactory$createUiState$2$1", f = "SpecialNeedsMenuItemUiStateFactory.kt", l = {26, 27, 28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.special_needs_menu.ui.SpecialNeedsMenuItemUiStateFactory$createUiState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ SpecialNeedsMenuItemExperiment $exp;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ qot0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qot0 qot0Var, SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment, Continuation continuation) {
            super(2, continuation);
            this.$exp = specialNeedsMenuItemExperiment;
            this.this$0 = qot0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$exp, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            if (r12 == r1) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
        /* JADX WARN: Type inference failed for: r2v12, types: [noh] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            noh h;
            qoh qohVar;
            int i;
            qoh qohVar2;
            Object k;
            int i2;
            noh nohVar;
            qoh qohVar3;
            Object k2;
            CharSequence charSequence;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 == 0) {
                b.b(obj);
                qoh h2 = tje.h(tseVar, null, null, new SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$title$1(this.this$0, this.$exp, null), 3);
                h = tje.h(tseVar, null, null, new SpecialNeedsMenuItemUiStateFactory$createUiState$2$1$description$1(this.this$0, this.$exp, null), 3);
                qohVar = h2;
                if (this.$exp.b) {
                    this.L$0 = null;
                    this.L$1 = h2;
                    this.L$2 = h;
                    this.label = 1;
                    obj = h2.s(this);
                    qohVar3 = h2;
                }
                i = 0;
                qohVar2 = qohVar;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.I$0 = i;
                this.label = 2;
                k = qohVar2.k(this);
                if (k != coroutineSingletons) {
                    noh nohVar2 = h;
                    i2 = i;
                    obj = k;
                    nohVar = nohVar2;
                    CharSequence charSequence2 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = charSequence2;
                    this.I$0 = i2;
                    this.label = 3;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.I$0;
                    charSequence = (CharSequence) this.L$3;
                    b.b(obj);
                    return new pot0(charSequence, (CharSequence) obj, this.$exp.e, i2 != 0);
                }
                i2 = this.I$0;
                nohVar = (noh) this.L$2;
                b.b(obj);
                CharSequence charSequence22 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = charSequence22;
                this.I$0 = i2;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    charSequence = charSequence22;
                    obj = k2;
                    return new pot0(charSequence, (CharSequence) obj, this.$exp.e, i2 != 0);
                }
                return coroutineSingletons;
            }
            h = (noh) this.L$2;
            ?? r2 = (noh) this.L$1;
            b.b(obj);
            qohVar3 = r2;
            qohVar = qohVar3;
            if (!evu0.J((CharSequence) obj)) {
                i = 1;
                qohVar2 = qohVar3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.I$0 = i;
                this.label = 2;
                k = qohVar2.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            i = 0;
            qohVar2 = qohVar;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.I$0 = i;
            this.label = 2;
            k = qohVar2.k(this);
            if (k != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsMenuItemUiStateFactory$createUiState$2(qot0 qot0Var, SpecialNeedsMenuItemExperiment specialNeedsMenuItemExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qot0Var;
        this.$exp = specialNeedsMenuItemExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsMenuItemUiStateFactory$createUiState$2(this.this$0, this.$exp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsMenuItemUiStateFactory$createUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$exp, null);
        this.label = 1;
        Object k0 = tje.k0(sjhVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
