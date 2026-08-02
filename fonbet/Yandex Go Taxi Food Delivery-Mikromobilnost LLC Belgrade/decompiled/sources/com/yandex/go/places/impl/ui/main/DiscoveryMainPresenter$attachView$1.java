package com.yandex.go.places.impl.ui.main;

import defpackage.btj;
import defpackage.ctj;
import defpackage.dtj;
import defpackage.etj;
import defpackage.ftj;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwj;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tsj;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x43;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.DiscoveryMainPresenter$attachView$1", f = "DiscoveryMainPresenter.kt", l = {MSException.ERROR_MORE_DATA, 247}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryMainPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ tsj $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryMainPresenter$attachView$1(d dVar, tsj tsjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = tsjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryMainPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryMainPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(r1, defpackage.o400.a), new com.yandex.go.places.impl.domain.interactors.DiscoveryRouteBridgeInteractor$start$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new defpackage.uui(4, r11), r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        if (r11 == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        btj btjVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.label = 1;
            obj = d.Mg(dVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        etj etjVar = (etj) obj;
        if (etjVar instanceof ctj) {
            d dVar2 = this.this$0;
            tje.N(dVar2.Jg(), null, null, new DiscoveryMainPresenter$openFlexMain$1(dVar2, null), 3);
        }
        this.$mvpView.Kb(etjVar);
        if (etjVar instanceof dtj) {
            d dVar3 = this.this$0;
            List list = ((dtj) etjVar).a;
            ftj ftjVar = dVar3.J.a;
            x43 x43Var = new x43(list);
            r0 r0Var = ftjVar.c;
            r0Var.getClass();
            r0Var.m(null, x43Var);
            String str = ftjVar.e;
            if (str != null) {
                Iterator it = x43Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((btj) obj2).a, str)) {
                        break;
                    }
                }
                btjVar = (btj) obj2;
            } else {
                btjVar = null;
            }
            ftjVar.e = null;
            if (btjVar != null || (btjVar = (btj) x43Var.f()) != null) {
                ftjVar.a(btjVar);
            }
            d dVar4 = this.this$0;
            tje.N(dVar4.Jg(), null, null, new DiscoveryMainPresenter$attachView$1$invokeSuspend$$inlined$safeCollectIn$1(dVar4.J.c, null, this.$mvpView, this.this$0), 3);
        }
        qwj qwjVar = this.this$0.g0;
        this.L$0 = null;
        this.label = 2;
        tpr j = qwjVar.b.j(RoutePointType.POINT_A, true);
        qwjVar.a.getClass();
        sjh sjhVar = uyj.a;
    }
}
