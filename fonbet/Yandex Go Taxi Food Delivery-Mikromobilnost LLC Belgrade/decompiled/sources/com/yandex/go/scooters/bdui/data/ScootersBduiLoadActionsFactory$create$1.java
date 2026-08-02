package com.yandex.go.scooters.bdui.data;

import com.yandex.go.scooters.bdui.section.ScootersBduiCustomSectionModel;
import defpackage.bzp0;
import defpackage.cnr0;
import defpackage.czp0;
import defpackage.d0n0;
import defpackage.dzp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0n0;
import defpackage.pwy;
import defpackage.tpr;
import defpackage.u1m;
import defpackage.uwl;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.bdui.data.ScootersBduiLoadActionsFactory$create$1", f = "ScootersBduiLoadActionsFactory.kt", l = {18, 27}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBduiLoadActionsFactory$create$1 extends SuspendLambda implements wls {
    final /* synthetic */ o0n0 $config;
    final /* synthetic */ tpr $reloadActions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBduiLoadActionsFactory$create$1(o0n0 o0n0Var, a aVar, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$config = o0n0Var;
        this.this$0 = aVar;
        this.$reloadActions = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersBduiLoadActionsFactory$create$1 scootersBduiLoadActionsFactory$create$1 = new ScootersBduiLoadActionsFactory$create$1(this.$config, this.this$0, this.$reloadActions, continuation);
        scootersBduiLoadActionsFactory$create$1.L$0 = obj;
        return scootersBduiLoadActionsFactory$create$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersBduiLoadActionsFactory$create$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r3, r1, r21) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d0n0 d0n0Var = this.$config.a;
            u1m u1mVar = new u1m(2, d0n0Var.a, d0n0Var.d);
            this.this$0.a.getClass();
            boolean z = false;
            pwy pwyVar = new pwy(u1mVar, new ywl(new dzp0(new czp0(z, new bzp0(null)), Collections.singletonList(new ScootersBduiCustomSectionModel()), null, null, null, null), null, cnr0.b, new uwl(null, null, null, null, null, null), null, null), z, 4);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        tpr tprVar = this.$reloadActions;
        this.L$0 = null;
        this.label = 2;
    }
}
