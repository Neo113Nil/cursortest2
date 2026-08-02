package com.yandex.go.chargers.discounts.activate;

import com.yandex.go.chargers.discounts.activate.data.ChargersActivatePromocodeError;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.avj0;
import defpackage.cy9;
import defpackage.du9;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.lt9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ot9;
import defpackage.pt9;
import defpackage.q00;
import defpackage.st9;
import defpackage.yj9;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lq00;", TarifficatorScenarioActivity.RESULT_KEY, "Ldu9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lq00;)Ldu9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.activate.ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1", f = "ChargersDiscountsActivateUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1 chargersDiscountsActivateUiStateInteractor$uiStateFlow$1 = new ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        chargersDiscountsActivateUiStateInteractor$uiStateFlow$1.L$0 = (q00) obj2;
        return chargersDiscountsActivateUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        AppColor$Palette appColor$Palette;
        String h;
        q00 q00Var = (q00) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        dVar.getClass();
        st9 st9Var = q00Var.a;
        yj9 yj9Var = q00Var.b;
        if (!(st9Var instanceof ot9)) {
            lt9 lt9Var = dVar.b().a;
            return new du9(new lt9(lt9Var.a, lt9Var.b, lt9Var.c, yj9Var.a, lt9Var.e, lt9Var.f, lt9Var.g), null, st9Var instanceof pt9);
        }
        cy9 cy9Var = ((ot9) st9Var).a;
        String str = yj9Var.a;
        zuj0 zuj0Var = dVar.b;
        String a2 = cy9Var.b.a();
        boolean z = true;
        if (a2 != null && a2.length() != 0) {
            z = false;
        }
        if (z) {
            a = ((avj0) zuj0Var).h(kyh0.chargers_error_common_title);
        } else {
            a = cy9Var.b.a();
            if (a == null) {
                a = "";
            }
        }
        String str2 = a;
        k4o b = ChargersActivatePromocodeError.b();
        if (b == null || !b.isEmpty()) {
            Iterator<E> it = b.iterator();
            while (it.hasNext()) {
                if (jl40.l(((ChargersActivatePromocodeError) it.next()).getCode(), cy9Var.a)) {
                    appColor$Palette = AppColor$Palette.Error;
                    break;
                }
            }
        }
        appColor$Palette = AppColor$Palette.Text;
        AppColor$Palette appColor$Palette2 = appColor$Palette;
        if (z) {
            h = ((avj0) zuj0Var).h(kyh0.due_chart_error_button_text);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.chargers_discounts_activate_promocode_button_text);
        }
        return new du9(new lt9(str2, str, appColor$Palette2, h, 22), cy9Var, false);
    }
}
