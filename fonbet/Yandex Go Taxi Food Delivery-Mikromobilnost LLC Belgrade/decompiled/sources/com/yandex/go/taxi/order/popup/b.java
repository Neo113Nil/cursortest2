package com.yandex.go.taxi.order.popup;

import android.content.Context;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.PopupModalImage$Default;
import com.yandex.go.taxi.order.models.api.response.PopupModalImage$DriverAvatar;
import com.yandex.go.taxi.order.models.api.response.q3;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.bvk0;
import defpackage.c4v;
import defpackage.cvk0;
import defpackage.dvk0;
import defpackage.evk0;
import defpackage.f480;
import defpackage.fvk0;
import defpackage.g480;
import defpackage.g8e0;
import defpackage.hst;
import defpackage.ip11;
import defpackage.j8e0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.k8e0;
import defpackage.l8e0;
import defpackage.m8e0;
import defpackage.n8e0;
import defpackage.o8s0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.d;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.l0;
import ru.yandex.taxi.communications.model.widgets.m0;
import ru.yandex.taxi.communications.model.widgets.n0;
import ru.yandex.taxi.communications.model.widgets.q;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class b {
    public final Context a;
    public final c b;
    public final e c;
    public final tt2 d;
    public final k7x0 e;
    public final ip11 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderPopupMapper");

    public b(Context context, c cVar, e eVar, tt2 tt2Var, k7x0 k7x0Var, ip11 ip11Var) {
        this.a = context;
        this.b = cVar;
        this.c = eVar;
        this.d = tt2Var;
        this.e = k7x0Var;
        this.f = ip11Var;
    }

    public static boolean a(n8e0 n8e0Var) {
        String str;
        String str2 = n8e0Var.b;
        return (str2 == null || str2.length() == 0 || n8e0Var.i.isEmpty() || (str = n8e0Var.a) == null || str.length() == 0 || n8e0Var.g <= 0) ? false : true;
    }

    public static m8e0 c(q3 q3Var, c4v c4vVar) {
        Pair pair;
        if (q3Var.a()) {
            String b = q3Var.getB();
            if (b == null) {
                b = "";
            }
            String a = q3Var.getA();
            if (a == null) {
                a = "";
            }
            pair = new Pair(b, a);
        } else {
            String str = c4vVar.b;
            if (str == null) {
                str = "";
            }
            String str2 = c4vVar.a;
            if (str2 == null) {
                str2 = "";
            }
            pair = new Pair(str, str2);
        }
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        if (q3Var instanceof PopupModalImage$Default) {
            return new k8e0(str3, str4, q3Var.a());
        }
        if (q3Var instanceof PopupModalImage$DriverAvatar) {
            String str5 = ((PopupModalImage$DriverAvatar) q3Var).c;
            return new l8e0(str3, str4, str5 != null ? str5 : "");
        }
        w511.b();
        return null;
    }

    public static fvk0 f(ru.yandex.taxi.communications.model.widgets.b bVar) {
        ActionButton.ButtonActionType b;
        String analyticsName = (bVar == null || (b = bVar.b()) == null) ? null : b.getAnalyticsName();
        if (analyticsName == null) {
            analyticsName = "";
        }
        if (bVar instanceof ActionButton.c) {
            ActionButton.c.a aVar = ((ActionButton.c) bVar).a;
            String str = aVar != null ? aVar.a : null;
            if (str == null) {
                str = "";
            }
            String str2 = aVar != null ? aVar.b : null;
            return new bvk0(str, str2 != null ? str2 : "", analyticsName);
        }
        if (jl40.l(bVar, q.INSTANCE)) {
            return new cvk0(analyticsName);
        }
        if (bVar instanceof ActionButton.d) {
            return new dvk0(((ActionButton.d) bVar).a, analyticsName);
        }
        if (jl40.l(bVar, x.INSTANCE) || jl40.l(bVar, e0.INSTANCE) || jl40.l(bVar, m0.INSTANCE) || jl40.l(bVar, n0.INSTANCE) || jl40.l(bVar, l0.INSTANCE) || (bVar instanceof ActionButton.g) || jl40.l(bVar, d.INSTANCE) || (bVar instanceof ActionButton.k) || (bVar instanceof ActionButton.f) || (bVar instanceof ActionButton.h) || (bVar instanceof ActionButton.i) || (bVar instanceof ActionButton.b) || (bVar instanceof ActionButton.j) || (bVar instanceof ActionButton.a) || (bVar instanceof ActionButton.l) || bVar == null) {
            return evk0.a;
        }
        w511.b();
        return null;
    }

    public final List b(List list) {
        a3 a3Var;
        ActionButton.ButtonActionType b;
        if (list == null) {
            return EmptyList.a;
        }
        List<ActionButton> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ActionButton actionButton : list2) {
            String str = actionButton.b;
            ru.yandex.taxi.communications.model.widgets.b bVar = actionButton.e;
            String analyticsName = (bVar == null || (b = bVar.b()) == null) ? null : b.getAnalyticsName();
            if (analyticsName == null) {
                analyticsName = "";
            }
            if (bVar instanceof ActionButton.d) {
                a3Var = new PopupUiControl.Deeplink(((ActionButton.d) bVar).a);
            } else if (bVar instanceof ActionButton.b) {
                ActionButton.b bVar2 = (ActionButton.b) bVar;
                List list3 = bVar2.a;
                ActionButton.b.a aVar = bVar2.b;
                a3Var = new PopupUiControl.CancelOrders(list3, aVar != null ? new PopupUiControl.CancelOrders.DoneNotification(aVar.a, aVar.b) : null);
            } else if (jl40.l(bVar, x.INSTANCE)) {
                a3Var = e3.INSTANCE;
            } else if (bVar == null) {
                a3Var = e3.INSTANCE;
            } else {
                if (!bVar.equals(e0.INSTANCE) && !bVar.equals(m0.INSTANCE) && !bVar.equals(n0.INSTANCE) && !bVar.equals(l0.INSTANCE) && !(bVar instanceof ActionButton.g) && !bVar.equals(d.INSTANCE) && !(bVar instanceof ActionButton.k) && !(bVar instanceof ActionButton.f) && !(bVar instanceof ActionButton.i) && !bVar.equals(q.INSTANCE) && !(bVar instanceof ActionButton.c) && !(bVar instanceof ActionButton.h) && !(bVar instanceof ActionButton.j) && !(bVar instanceof ActionButton.a) && !(bVar instanceof ActionButton.l)) {
                    w511.b();
                    return null;
                }
                this.g.getClass();
                a3y0.h(new String[]{"mapAction"});
                hst hstVar = jst.e;
                a3Var = e3.INSTANCE;
            }
            arrayList.add(new g8e0(str, "", analyticsName, a3Var));
        }
        return arrayList;
    }

    public final Object d(f480 f480Var, Continuation continuation) {
        return bvf0.n(new OrderPopupMapper$mapOrderShare$2(f480Var, this, null), continuation);
    }

    public final Object e(g480 g480Var, Continuation continuation) {
        this.d.getClass();
        return tje.k0(uyj.a, new OrderPopupMapper$mapRobotaxi$2(g480Var, this, null), continuation);
    }

    public final Object g(ModalItemDto$StepsInstructionsItem modalItemDto$StepsInstructionsItem, Continuation continuation) {
        this.d.getClass();
        return tje.k0(uyj.a, new OrderPopupMapper$mapStepsInstructions$2(this, modalItemDto$StepsInstructionsItem, null), continuation);
    }

    public final String h(FormattedText formattedText) {
        return c.f(this.b, formattedText, false, null, 14).toString();
    }

    public final n8e0 i(ModalItemDto$DefaultItem modalItemDto$DefaultItem, o8s0 o8s0Var) {
        n8e0 n8e0Var = new n8e0(modalItemDto$DefaultItem.a, h(modalItemDto$DefaultItem.b), this.f.b(this.a), h(modalItemDto$DefaultItem.f), c(modalItemDto$DefaultItem.h, modalItemDto$DefaultItem.g), EmptyList.a, o8s0Var.a, 0, b(modalItemDto$DefaultItem.e.a), new j8e0(null, 3));
        if (a(n8e0Var)) {
            return n8e0Var;
        }
        return null;
    }
}
