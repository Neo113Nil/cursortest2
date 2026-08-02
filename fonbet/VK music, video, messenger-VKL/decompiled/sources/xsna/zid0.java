package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;

/* compiled from: ProductButtonsBinderCallbackRefactoredImpl.kt */
/* loaded from: classes18.dex */
public final class zid0 {
    public final cxo a;

    public zid0(cxo cxoVar) {
        this.a = cxoVar;
    }

    public final void a(CallProducerButton callProducerButton, boolean z) {
        Context context;
        yid0 yid0Var;
        String str;
        yid0 yid0Var2;
        yid0 yid0Var3;
        yid0 yid0Var4;
        cxo cxoVar;
        View view;
        Context context2;
        Good good;
        int i = callProducerButton.b;
        cxo cxoVar2 = this.a;
        if (i == 0) {
            View view2 = cxoVar2.o;
            context = view2 != null ? view2.getContext() : null;
            if (context == null) {
                return;
            }
            UserId userId = callProducerButton.i;
            String str2 = callProducerButton.h;
            if (userId == null || str2 == null || (yid0Var = cxoVar2.O) == null) {
                return;
            }
            yid0Var.d(context, userId, z);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                View view3 = cxoVar2.o;
                Context context3 = view3 != null ? view3.getContext() : null;
                if (context3 == null) {
                    return;
                }
                UserId userId2 = callProducerButton.i;
                String str3 = callProducerButton.d;
                Boolean bool = callProducerButton.f;
                InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
                if (str3 == null || bool == null || (yid0Var3 = cxoVar2.O) == null) {
                    return;
                }
                yid0Var3.c(new r19(str3, bool.booleanValue(), inaccessibilityMessage, userId2, z, context3));
                return;
            }
            if (i != 6) {
                if (i != 7 || (yid0Var4 = cxoVar2.O) == null || (view = (cxoVar = yid0Var4.a).o) == null || (context2 = view.getContext()) == null || (good = cxoVar.r) == null) {
                    return;
                }
                j6 j6Var = new j6(14, yid0Var4, context2);
                ffp0.b(cxoVar.a.e(), MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.BUY_NOW, yid0Var4.a, yid0Var4.b);
                if (good.x != 0) {
                    j6Var.invoke();
                    return;
                }
                x110 x110Var = cxoVar.e;
                if (x110Var == null) {
                    return;
                }
                io.reactivex.rxjava3.disposables.c subscribe = hg1.n(x110Var.b.a(1).m(io.reactivex.rxjava3.android.schedulers.a.b()), context2, false, null, 62).subscribe(new bqs(new z5b(j6Var, yid0Var4, context2, 5), 20), new o7y(new d50(19, yid0Var4, context2), 12));
                yid0Var4.i = subscribe;
                if (subscribe != null) {
                    cxoVar.b.b(subscribe);
                    return;
                }
                return;
            }
        }
        View view4 = cxoVar2.o;
        context = view4 != null ? view4.getContext() : null;
        if (context == null || (str = callProducerButton.k) == null || (yid0Var2 = cxoVar2.O) == null) {
            return;
        }
        yid0Var2.h(context, str, callProducerButton.m, z);
    }
}
