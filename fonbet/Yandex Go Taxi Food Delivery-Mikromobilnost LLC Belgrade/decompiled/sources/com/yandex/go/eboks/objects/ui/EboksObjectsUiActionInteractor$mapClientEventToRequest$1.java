package com.yandex.go.eboks.objects.ui;

import defpackage.jl40;
import defpackage.kin;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rhn;
import defpackage.rin;
import defpackage.vj00;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wgn;
import defpackage.wls;
import defpackage.xgn;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luin;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.ui.EboksObjectsUiActionInteractor$mapClientEventToRequest$1", f = "EboksObjectsUiActionInteractor.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsUiActionInteractor$mapClientEventToRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ kin $current;
    final /* synthetic */ xgn $eboksObjectsClientEvent;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsUiActionInteractor$mapClientEventToRequest$1(xgn xgnVar, kin kinVar, Continuation continuation) {
        super(2, continuation);
        this.$eboksObjectsClientEvent = xgnVar;
        this.$current = kinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsUiActionInteractor$mapClientEventToRequest$1 eboksObjectsUiActionInteractor$mapClientEventToRequest$1 = new EboksObjectsUiActionInteractor$mapClientEventToRequest$1(this.$eboksObjectsClientEvent, this.$current, continuation);
        eboksObjectsUiActionInteractor$mapClientEventToRequest$1.L$0 = obj;
        return eboksObjectsUiActionInteractor$mapClientEventToRequest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsUiActionInteractor$mapClientEventToRequest$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vj00 vj00Var;
        Object obj2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        xgn xgnVar = this.$eboksObjectsClientEvent;
        if (!(xgnVar instanceof wgn)) {
            w511.b();
            return null;
        }
        Iterator it = this.$current.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                vj00Var = null;
                break;
            }
            Iterator it2 = ((rhn) it.next()).b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((vj00) obj2).getId(), ((wgn) xgnVar).a)) {
                    break;
                }
            }
            vj00Var = (vj00) obj2;
            if (vj00Var != null) {
                break;
            }
        }
        if (vj00Var != null) {
            rin rinVar = new rin(vj00Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(rinVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
