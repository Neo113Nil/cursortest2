package com.yandex.go.mainscreen.superapp.impl.header.presentation.logo;

import com.yandex.go.mainscreen.superapp.impl.header.domain.c;
import defpackage.evu0;
import defpackage.kn2;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ou;
import defpackage.rau;
import defpackage.sau;
import defpackage.sjh;
import defpackage.tau;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.utils.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.header.presentation.logo.HeaderLogoPresenter$attachView$1", f = "HeaderLogoPresenter.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class HeaderLogoPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ rau $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ sau this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.header.presentation.logo.HeaderLogoPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            tau tauVar = (tau) obj;
            sau sauVar = (sau) this.receiver;
            sauVar.D.a(null);
            if (!evu0.J(tauVar.a)) {
                sauVar.D = a.c(sauVar.B.b().b(((m7x0) sauVar.C).a(tauVar.a)), new kn2(13, sauVar, tauVar), new ou(22, sauVar, tauVar), sauVar.Jg());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderLogoPresenter$attachView$1(rau rauVar, sau sauVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = rauVar;
        this.this$0 = sauVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeaderLogoPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderLogoPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r12, r4, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rau rauVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rauVar = this.$mvpView;
            c cVar = this.this$0.A;
            this.L$0 = rauVar;
            this.label = 1;
            obj = cVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rauVar = (rau) this.L$0;
            b.b(obj);
        }
        rauVar.setDefaultLogo(((Boolean) obj).booleanValue());
        tpr t = e.t(new com.yandex.go.mainscreen.superapp.impl.header.domain.b(d.b(this.this$0.A.a)));
        sjh sjhVar = uyj.a;
        tpr F = e.F(t, mdh.b);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0, sau.class, "updateLogo", "updateLogo(Lcom/yandex/go/mainscreen/superapp/impl/header/domain/HeaderLogoState;)V", 4);
        this.L$0 = null;
        this.label = 2;
    }
}
