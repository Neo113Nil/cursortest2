package com.yandex.go.explorer.impl.geofencing;

import android.os.WorkSource;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.zzw;
import defpackage.dtx0;
import defpackage.dvw;
import defpackage.eqs;
import defpackage.j18;
import defpackage.k991;
import defpackage.kde;
import defpackage.mu5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.si3;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysx0;
import defpackage.zoa1;
import defpackage.zsx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/location/Location;", "<anonymous>", "(Ltse;)Landroid/location/Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.geofencing.ExplorerLocationFetcher$fetchFreshLocation$2", f = "ExplorerLocationFetcher.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerLocationFetcher$fetchFreshLocation$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerLocationFetcher$fetchFreshLocation$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerLocationFetcher$fetchFreshLocation$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerLocationFetcher$fetchFreshLocation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        b bVar = this.this$0;
        this.label = 1;
        bVar.getClass();
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        CurrentLocationRequest.a aVar = new CurrentLocationRequest.a();
        zoa1.e(100);
        aVar.b = 100;
        aVar.a = 0L;
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(aVar.a, 0, aVar.b, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, false, 0, new WorkSource(null), null);
        k991 k991Var = (k991) ((eqs) bVar.b.getValue());
        k991Var.getClass();
        ysx0 a = zsx0.a();
        a.a = new com.google.android.gms.internal.identity.a(0, currentLocationRequest);
        a.d = 2415;
        zzw d = k991Var.d(0, a.a());
        mu5 mu5Var = new mu5(new si3(j18Var, 5));
        d.getClass();
        d.g(dtx0.a, mu5Var);
        d.d(new kde(j18Var, 2));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
