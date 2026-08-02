package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.internal.report.reporters.WebCardReporter$Source2Fa;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.sloth.data.PushType;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.ds31;
import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1", f = "WebCardSlothViewModel.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebCardSlothViewModel$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d1 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$1", f = "WebCardSlothViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ d1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d1 d1Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d1 d1Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d1 d1Var2 = this.this$0;
                this.L$0 = d1Var2;
                this.label = 1;
                Object W = d1.W(d1Var2, this);
                if (W == coroutineSingletons) {
                    return coroutineSingletons;
                }
                d1Var = d1Var2;
                obj = W;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d1Var = (d1) this.L$0;
                kotlin.b.b(obj);
            }
            d1Var.C = (SlothParams) obj;
            d1 d1Var3 = this.this$0;
            k1 k1Var = d1Var3.y;
            SlothParams slothParams = d1Var3.C;
            if (slothParams == null) {
                slothParams = null;
            }
            com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
            com.yandex.passport.sloth.data.b0 b0Var = variant instanceof com.yandex.passport.sloth.data.b0 ? (com.yandex.passport.sloth.data.b0) variant : null;
            PushType pushType = b0Var != null ? b0Var.w : null;
            int i2 = pushType == null ? -1 : b1.a[pushType.ordinal()];
            if (i2 == 1) {
                k1Var.j(WebCardReporter$Source2Fa.NotificationPush);
            } else if (i2 == 2) {
                k1Var.j(WebCardReporter$Source2Fa.DataPush);
            }
            d1 d1Var4 = this.this$0;
            a aVar = d1Var4.c;
            SlothParams slothParams2 = d1Var4.C;
            SlothParams slothParams3 = slothParams2 != null ? slothParams2 : null;
            com.yandex.passport.internal.core.accounts.p pVar = (com.yandex.passport.internal.core.accounts.p) aVar;
            pVar.getClass();
            com.yandex.passport.internal.ui.challenge.vpn.o oVar = new com.yandex.passport.internal.ui.challenge.vpn.o();
            oVar.a = slothParams3;
            oVar.b = new com.yandex.passport.sloth.dependencies.f(Collections.singletonList(((b) pVar.a).a));
            oVar.c = ((com.yandex.passport.internal.sloth.h) pVar.b).a();
            d1Var4.B = oVar.a().a();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$2", f = "WebCardSlothViewModel.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d1 d1Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.passport.sloth.c1 c1Var = this.this$0.B;
                com.yandex.passport.sloth.c1 c1Var2 = c1Var != null ? c1Var : null;
                fse fseVar = get_context();
                this.label = 1;
                if (c1Var2.c(fseVar, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$3", f = "WebCardSlothViewModel.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothViewModel$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d1 d1Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d1 d1Var = this.this$0;
                kotlinx.coroutines.flow.n0 n0Var = d1Var.J;
                com.yandex.passport.sloth.c1 c1Var = d1Var.B;
                com.yandex.passport.sloth.ui.u0 u0Var = new com.yandex.passport.sloth.ui.u0((c1Var != null ? c1Var : null).C);
                this.label = 1;
                if (n0Var.emit(u0Var, this) == coroutineSingletons) {
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
    public WebCardSlothViewModel$1(d1 d1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebCardSlothViewModel$1 webCardSlothViewModel$1 = new WebCardSlothViewModel$1(this.this$0, continuation);
        webCardSlothViewModel$1.L$0 = obj;
        return webCardSlothViewModel$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebCardSlothViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            pzt0 N = tje.N(tseVar2, null, null, new AnonymousClass1(this.this$0, null), 3);
            this.L$0 = tseVar2;
            this.label = 1;
            if (N.u0(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar = tseVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        d1 d1Var = this.this$0;
        d1Var.getClass();
        tje.N(ds31.a(d1Var), null, null, new WebCardSlothViewModel$collectEvents$1(d1Var, null), 3);
        tje.N(ds31.a(d1Var), null, null, new WebCardSlothViewModel$collectEvents$2(d1Var, null), 3);
        tje.N(ds31.a(d1Var), null, null, new WebCardSlothViewModel$collectEvents$3(d1Var, null), 3);
        tje.N(ds31.a(d1Var), null, null, new WebCardSlothViewModel$collectEvents$4(d1Var, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        return zy11.a;
    }
}
