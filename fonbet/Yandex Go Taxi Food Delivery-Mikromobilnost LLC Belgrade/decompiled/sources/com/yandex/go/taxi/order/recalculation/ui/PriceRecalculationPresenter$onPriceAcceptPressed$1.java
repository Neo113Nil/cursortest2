package com.yandex.go.taxi.order.recalculation.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;
import defpackage.a3y0;
import defpackage.c0f0;
import defpackage.f0f0;
import defpackage.h0f0;
import defpackage.kdd0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qf9;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8w;
import defpackage.uyj;
import defpackage.vye0;
import defpackage.w4y0;
import defpackage.wls;
import defpackage.x4e;
import defpackage.x770;
import defpackage.yze0;
import defpackage.zy11;
import defpackage.zze0;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationPresenter$onPriceAcceptPressed$1", f = "PriceRecalculationPresenter.kt", l = {HProv.ALG_SID_SHA3_384, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PriceRecalculationPresenter$onPriceAcceptPressed$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRecalculationPresenter$onPriceAcceptPressed$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceRecalculationPresenter$onPriceAcceptPressed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceRecalculationPresenter$onPriceAcceptPressed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        Object k0;
        b bVar3;
        b bVar4;
        yze0 yze0Var;
        Activity activity;
        kdd0 kdd0Var;
        Integer M;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    bVar = this.this$0;
                    try {
                        ((c0f0) bVar.Dg()).i1(h0f0.a);
                        bVar.D.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1 priceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1 = new PriceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1(bVar, null);
                        this.L$0 = bVar;
                        this.L$1 = bVar;
                        this.label = 1;
                        k0 = tje.k0(mdhVar, priceRecalculationPresenter$onPriceAcceptPressed$1$1$changeDto$1, this);
                        if (k0 != coroutineSingletons) {
                            bVar3 = bVar;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar;
                        a3y0 a3y0Var = bVar2.L;
                        yze0Var = bVar2.A;
                        activity = bVar2.F;
                        kdd0Var = bVar2.G;
                        a3y0Var.b("onPriceAcceptPressed", th, new vye0(8));
                        M = s8o.M(th);
                        if (M != null) {
                        }
                        ((x770) kdd0Var.c).a.a("PriceNotCalculatedPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                        AlertDialog alertDialog = new AlertDialog(activity);
                        Bitmap bitmap = bVar2.Q;
                        AlertDialog dialogDrawable = alertDialog.setDialogDrawable(bitmap != null ? new BitmapDrawable(bVar2.J.getResources(), bitmap) : null);
                        PriceRecalculationExperiment d = yze0Var.d();
                        AlertDialog title = dialogDrawable.setTitle((String) d.c.getOrDefault(d.e.a, ""));
                        PriceRecalculationExperiment d2 = yze0Var.d();
                        AlertDialog message = title.setMessage((String) d2.c.getOrDefault(d2.e.b, ""));
                        PriceRecalculationExperiment d3 = yze0Var.d();
                        message.setPositiveButton((String) d3.c.getOrDefault(d3.e.c, "")).setDismissListener(new zze0(bVar2, 3)).show();
                        b.Lg(bVar2);
                        return zy11Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = (b) this.L$1;
                    bVar4 = (b) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        bVar4.G.n(bVar4.P);
                        ((c0f0) bVar4.Dg()).dismissView();
                        return zy11Var;
                    } catch (Throwable th2) {
                        th = th2;
                        a3y0 a3y0Var2 = bVar2.L;
                        yze0Var = bVar2.A;
                        activity = bVar2.F;
                        kdd0Var = bVar2.G;
                        a3y0Var2.b("onPriceAcceptPressed", th, new vye0(8));
                        M = s8o.M(th);
                        if (M != null && M.intValue() == 406) {
                            ((u8w) kdd0Var.b).a.a("PriceExpiredPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                            AlertDialog alertDialog2 = new AlertDialog(activity);
                            PriceRecalculationExperiment d4 = yze0Var.d();
                            AlertDialog title2 = alertDialog2.setTitle((String) d4.c.getOrDefault(d4.d.a, ""));
                            PriceRecalculationExperiment d5 = yze0Var.d();
                            AlertDialog message2 = title2.setMessage((String) d5.c.getOrDefault(d5.d.b, ""));
                            PriceRecalculationExperiment d6 = yze0Var.d();
                            message2.setPositiveButton((String) d6.c.getOrDefault(d6.d.c, "")).setDismissListener(new zze0(bVar2, 2)).show();
                        } else {
                            ((x770) kdd0Var.c).a.a("PriceNotCalculatedPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                            AlertDialog alertDialog3 = new AlertDialog(activity);
                            Bitmap bitmap2 = bVar2.Q;
                            AlertDialog dialogDrawable2 = alertDialog3.setDialogDrawable(bitmap2 != null ? new BitmapDrawable(bVar2.J.getResources(), bitmap2) : null);
                            PriceRecalculationExperiment d7 = yze0Var.d();
                            AlertDialog title3 = dialogDrawable2.setTitle((String) d7.c.getOrDefault(d7.e.a, ""));
                            PriceRecalculationExperiment d22 = yze0Var.d();
                            AlertDialog message3 = title3.setMessage((String) d22.c.getOrDefault(d22.e.b, ""));
                            PriceRecalculationExperiment d32 = yze0Var.d();
                            message3.setPositiveButton((String) d32.c.getOrDefault(d32.e.c, "")).setDismissListener(new zze0(bVar2, 3)).show();
                            b.Lg(bVar2);
                        }
                        return zy11Var;
                    }
                }
                b bVar5 = (b) this.L$1;
                b bVar6 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                    k0 = obj;
                    bVar = bVar6;
                    bVar3 = bVar5;
                } catch (Throwable th3) {
                    th = th3;
                    bVar2 = bVar5;
                    a3y0 a3y0Var22 = bVar2.L;
                    yze0Var = bVar2.A;
                    activity = bVar2.F;
                    kdd0Var = bVar2.G;
                    a3y0Var22.b("onPriceAcceptPressed", th, new vye0(8));
                    M = s8o.M(th);
                    if (M != null) {
                    }
                    ((x770) kdd0Var.c).a.a("PriceNotCalculatedPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                    AlertDialog alertDialog32 = new AlertDialog(activity);
                    Bitmap bitmap22 = bVar2.Q;
                    AlertDialog dialogDrawable22 = alertDialog32.setDialogDrawable(bitmap22 != null ? new BitmapDrawable(bVar2.J.getResources(), bitmap22) : null);
                    PriceRecalculationExperiment d72 = yze0Var.d();
                    AlertDialog title32 = dialogDrawable22.setTitle((String) d72.c.getOrDefault(d72.e.a, ""));
                    PriceRecalculationExperiment d222 = yze0Var.d();
                    AlertDialog message32 = title32.setMessage((String) d222.c.getOrDefault(d222.e.b, ""));
                    PriceRecalculationExperiment d322 = yze0Var.d();
                    message32.setPositiveButton((String) d322.c.getOrDefault(d322.e.c, "")).setDismissListener(new zze0(bVar2, 3)).show();
                    b.Lg(bVar2);
                    return zy11Var;
                }
                RouteChangeType routeChangeType = ((f0f0) bVar.z.b).c;
                ((qf9) bVar.K).a(bVar.x, (OrderChangesDto.PendingChangeDto) k0, routeChangeType);
                ((f0f0) bVar.z.b).e.run();
                w4y0 w4y0Var = bVar.C;
                this.L$0 = bVar;
                this.L$1 = bVar3;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (w4y0Var.a.emit(zy11Var, this) != coroutineSingletons) {
                    bVar4 = bVar;
                    bVar2 = bVar3;
                    bVar4.G.n(bVar4.P);
                    ((c0f0) bVar4.Dg()).dismissView();
                    return zy11Var;
                }
                return coroutineSingletons;
            } catch (Throwable th4) {
                th = th4;
                bVar2 = bVar3;
                a3y0 a3y0Var222 = bVar2.L;
                yze0Var = bVar2.A;
                activity = bVar2.F;
                kdd0Var = bVar2.G;
                a3y0Var222.b("onPriceAcceptPressed", th, new vye0(8));
                M = s8o.M(th);
                if (M != null) {
                    ((u8w) kdd0Var.b).a.a("PriceExpiredPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                    AlertDialog alertDialog22 = new AlertDialog(activity);
                    PriceRecalculationExperiment d42 = yze0Var.d();
                    AlertDialog title22 = alertDialog22.setTitle((String) d42.c.getOrDefault(d42.d.a, ""));
                    PriceRecalculationExperiment d52 = yze0Var.d();
                    AlertDialog message22 = title22.setMessage((String) d52.c.getOrDefault(d52.d.b, ""));
                    PriceRecalculationExperiment d62 = yze0Var.d();
                    message22.setPositiveButton((String) d62.c.getOrDefault(d62.d.c, "")).setDismissListener(new zze0(bVar2, 2)).show();
                    return zy11Var;
                }
                ((x770) kdd0Var.c).a.a("PriceNotCalculatedPopup.Shown", x4e.p("order_id", ((o2y0) kdd0Var.d).b().a), 2, new HashMap());
                AlertDialog alertDialog322 = new AlertDialog(activity);
                Bitmap bitmap222 = bVar2.Q;
                AlertDialog dialogDrawable222 = alertDialog322.setDialogDrawable(bitmap222 != null ? new BitmapDrawable(bVar2.J.getResources(), bitmap222) : null);
                PriceRecalculationExperiment d722 = yze0Var.d();
                AlertDialog title322 = dialogDrawable222.setTitle((String) d722.c.getOrDefault(d722.e.a, ""));
                PriceRecalculationExperiment d2222 = yze0Var.d();
                AlertDialog message322 = title322.setMessage((String) d2222.c.getOrDefault(d2222.e.b, ""));
                PriceRecalculationExperiment d3222 = yze0Var.d();
                message322.setPositiveButton((String) d3222.c.getOrDefault(d3222.e.c, "")).setDismissListener(new zze0(bVar2, 3)).show();
                b.Lg(bVar2);
                return zy11Var;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
