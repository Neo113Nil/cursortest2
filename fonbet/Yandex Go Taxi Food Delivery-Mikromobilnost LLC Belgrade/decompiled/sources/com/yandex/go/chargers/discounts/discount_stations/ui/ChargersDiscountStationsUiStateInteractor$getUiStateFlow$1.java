package com.yandex.go.chargers.discounts.discount_stations.ui;

import defpackage.em9;
import defpackage.et9;
import defpackage.ft9;
import defpackage.gt9;
import defpackage.ir9;
import defpackage.ms9;
import defpackage.mvg;
import defpackage.ns9;
import defpackage.ny61;
import defpackage.os9;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lit9;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.discount_stations.ui.ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1", f = "ChargersDiscountStationsUiStateInteractor.kt", l = {32, 34, 38, 36, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ir9 $discount;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1(d dVar, ir9 ir9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$discount = ir9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1 chargersDiscountStationsUiStateInteractor$getUiStateFlow$1 = new ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1(this.this$0, this.$discount, continuation);
        chargersDiscountStationsUiStateInteractor$getUiStateFlow$1.L$0 = obj;
        return chargersDiscountStationsUiStateInteractor$getUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDiscountStationsUiStateInteractor$getUiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dd, code lost:
    
        if (r1.emit(r12, r18) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r3 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r18.this$0.e.a((defpackage.ns9) r3, r18) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        if (r1.emit(r4, r18) == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r3 == r2) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        os9 os9Var;
        et9 et9Var;
        Object i;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            com.yandex.go.chargers.discounts.discount_stations.data.b bVar = this.this$0.d;
            ir9 ir9Var = this.$discount;
            this.L$0 = vprVar;
            this.label = 1;
            a = bVar.a(ir9Var, this);
        } else if (i2 == 1) {
            kotlin.b.b(obj);
            a = obj;
        } else if (i2 == 2) {
            os9Var = (os9) this.L$1;
            kotlin.b.b(obj);
            em9 em9Var = this.this$0.b;
            ns9 ns9Var = (ns9) os9Var;
            String str = ns9Var.b;
            em9Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("trace_id", str);
            em9Var.a.a("Chargers.DiscountLocationsApplicability.Shown", hashMap, 1, new HashMap());
            ru.yandex.taxi.widget.c cVar = this.this$0.c;
            FormattedText formattedText = ns9Var.a.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            et9Var = et9.a;
            this.L$3 = et9Var;
            this.label = 3;
            i = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
        } else {
            if (i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            et9 et9Var2 = (et9) this.L$3;
            vpr vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            et9Var = et9Var2;
            vprVar = vprVar2;
            i = obj;
            et9Var.getClass();
            ft9 ft9Var = new ft9((CharSequence) i, EmptyList.a, false, false, false);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
        }
        os9Var = (os9) a;
        if (os9Var instanceof ns9) {
            this.L$0 = vprVar;
            this.L$1 = os9Var;
            this.label = 2;
        } else {
            if (!(os9Var instanceof ms9)) {
                w511.b();
                return null;
            }
            em9 em9Var2 = this.this$0.b;
            ms9 ms9Var = (ms9) os9Var;
            String str2 = ms9Var.b;
            em9Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("trace_id", str2);
            em9Var2.a.a("Chargers.DiscountLocationsApplicability.Shown", hashMap2, 1, new HashMap());
            gt9 gt9Var = new gt9(ms9Var.a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
        }
        return coroutineSingletons;
    }
}
