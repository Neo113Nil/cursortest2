package com.yandex.go.scooters.newbie;

import defpackage.bms;
import defpackage.bvf0;
import defpackage.f2o0;
import defpackage.g2o0;
import defpackage.mvg;
import defpackage.n1o0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Ln1o0;", "experiment", "Ln1o0$b;", "initialModal", "Lf2o0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Ln1o0;Ln1o0$b;)Lf2o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieUiStateInteractor$uiStateFlow$3", f = "ScootersNewbieUiStateInteractor.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieUiStateInteractor$uiStateFlow$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g2o0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf2o0;", "<anonymous>", "(Ltse;)Lf2o0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.newbie.ScootersNewbieUiStateInteractor$uiStateFlow$3$1", f = "ScootersNewbieUiStateInteractor.kt", l = {47, 48, 49, 50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.newbie.ScootersNewbieUiStateInteractor$uiStateFlow$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ n1o0 $experiment;
        final /* synthetic */ n1o0.b $initialModal;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ g2o0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n1o0.b bVar, n1o0 n1o0Var, g2o0 g2o0Var, Continuation continuation) {
            super(2, continuation);
            this.$initialModal = bVar;
            this.this$0 = g2o0Var;
            this.$experiment = n1o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$initialModal, this.$experiment, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
        /* JADX WARN: Type inference failed for: r2v12, types: [noh] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            noh h;
            qoh h2;
            noh nohVar;
            String str;
            CharSequence charSequence;
            noh nohVar2;
            Object k;
            CharSequence charSequence2;
            String str2;
            CharSequence charSequence3;
            Object k2;
            CharSequence charSequence4;
            String str3;
            CharSequence charSequence5;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                qoh h3 = tje.h(tseVar, null, null, new ScootersNewbieUiStateInteractor$uiStateFlow$3$1$titleAsync$1(this.$initialModal, this.$experiment, this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new ScootersNewbieUiStateInteractor$uiStateFlow$3$1$subtitleAsync$1(this.$initialModal, this.$experiment, this.this$0, null), 3);
                qoh h4 = tje.h(tseVar, null, null, new ScootersNewbieUiStateInteractor$uiStateFlow$3$1$rejectButtonTextAsync$1(this.$initialModal, this.$experiment, this.this$0, null), 3);
                h2 = tje.h(tseVar, null, null, new ScootersNewbieUiStateInteractor$uiStateFlow$3$1$confirmButtonTextAsync$1(this.$initialModal, this.$experiment, this.this$0, null), 3);
                String str4 = this.$initialModal.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h4;
                this.L$4 = h2;
                this.L$5 = str4;
                this.label = 1;
                obj = h3.s(this);
                if (obj != coroutineSingletons) {
                    nohVar = h4;
                    str = str4;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    charSequence = (CharSequence) this.L$6;
                    str = (String) this.L$5;
                    nohVar2 = (noh) this.L$4;
                    nohVar = (noh) this.L$3;
                    kotlin.b.b(obj);
                    CharSequence charSequence6 = (CharSequence) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = nohVar2;
                    this.L$5 = str;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence6;
                    this.label = 3;
                    k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                        CharSequence charSequence7 = charSequence;
                        charSequence2 = charSequence6;
                        obj = k;
                        str2 = str;
                        charSequence3 = charSequence7;
                        CharSequence charSequence8 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = str2;
                        this.L$6 = charSequence3;
                        this.L$7 = charSequence2;
                        this.L$8 = charSequence8;
                        this.label = 4;
                        k2 = nohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence9 = (CharSequence) this.L$8;
                    CharSequence charSequence10 = (CharSequence) this.L$7;
                    charSequence3 = (CharSequence) this.L$6;
                    String str5 = (String) this.L$5;
                    kotlin.b.b(obj);
                    charSequence4 = charSequence10;
                    str3 = str5;
                    charSequence5 = charSequence9;
                    return new f2o0(str3, charSequence3, charSequence4, charSequence5, (CharSequence) obj);
                }
                charSequence2 = (CharSequence) this.L$7;
                charSequence3 = (CharSequence) this.L$6;
                str2 = (String) this.L$5;
                nohVar2 = (noh) this.L$4;
                kotlin.b.b(obj);
                CharSequence charSequence82 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = str2;
                this.L$6 = charSequence3;
                this.L$7 = charSequence2;
                this.L$8 = charSequence82;
                this.label = 4;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                    charSequence4 = charSequence2;
                    str3 = str2;
                    charSequence5 = charSequence82;
                    obj = k2;
                    return new f2o0(str3, charSequence3, charSequence4, charSequence5, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
            String str6 = (String) this.L$5;
            ?? r2 = (noh) this.L$4;
            nohVar = (noh) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
            str = str6;
            h2 = r2;
            CharSequence charSequence11 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar;
            this.L$4 = h2;
            this.L$5 = str;
            this.L$6 = charSequence11;
            this.label = 2;
            Object k3 = h.k(this);
            if (k3 != coroutineSingletons) {
                qoh qohVar = h2;
                charSequence = charSequence11;
                obj = k3;
                nohVar2 = qohVar;
                CharSequence charSequence62 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = str;
                this.L$6 = charSequence;
                this.L$7 = charSequence62;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieUiStateInteractor$uiStateFlow$3(g2o0 g2o0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = g2o0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ScootersNewbieUiStateInteractor$uiStateFlow$3 scootersNewbieUiStateInteractor$uiStateFlow$3 = new ScootersNewbieUiStateInteractor$uiStateFlow$3(this.this$0, (Continuation) obj4);
        scootersNewbieUiStateInteractor$uiStateFlow$3.L$0 = (n1o0) obj2;
        scootersNewbieUiStateInteractor$uiStateFlow$3.L$1 = (n1o0.b) obj3;
        return scootersNewbieUiStateInteractor$uiStateFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n1o0 n1o0Var = (n1o0) this.L$0;
        n1o0.b bVar = (n1o0.b) this.L$1;
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, n1o0Var, this.this$0, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object n = bvf0.n(anonymousClass1, this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
