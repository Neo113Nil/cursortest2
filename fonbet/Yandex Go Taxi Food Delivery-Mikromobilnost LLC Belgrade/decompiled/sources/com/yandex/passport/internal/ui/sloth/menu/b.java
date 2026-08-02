package com.yandex.passport.internal.ui.sloth.menu;

import android.webkit.WebView;
import com.yandex.passport.api.f3;
import com.yandex.passport.api.i3;
import com.yandex.passport.data.network.k3;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d0;
import com.yandex.passport.sloth.x0;
import defpackage.jl40;
import defpackage.tls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                UserMenuActivity userMenuActivity = (UserMenuActivity) obj3;
                a1 a1Var = (a1) obj;
                if (jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    com.yandex.passport.internal.ui.c.k(userMenuActivity, com.yandex.passport.internal.ui.c.D(f3.a));
                } else if (a1Var instanceof x0) {
                    x0 x0Var = (x0) a1Var;
                    com.yandex.passport.internal.ui.c.k(userMenuActivity, com.yandex.passport.internal.ui.c.D(new i3(x0Var.a, x0Var.b)));
                } else if (jl40.l(a1Var, com.yandex.passport.sloth.b.a)) {
                    e eVar = userMenuActivity.component;
                    (eVar != null ? eVar : null).getUiController().a(false, new d(0, userMenuActivity));
                } else if (a1Var instanceof com.yandex.passport.sloth.m) {
                    com.yandex.passport.sloth.k kVar = (com.yandex.passport.sloth.k) kotlin.collections.a.R(((com.yandex.passport.sloth.m) a1Var).a);
                    if (kVar != null && jl40.l(kVar.a, "lost_connection")) {
                        z = true;
                    }
                    e eVar2 = userMenuActivity.component;
                    (eVar2 != null ? eVar2 : null).getUiController().a(z, new k3(4, userMenuActivity, a1Var));
                } else {
                    ((i1) obj2).j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.USER_MENU);
                }
                return zy11Var;
            case 1:
                int intValue = ((Number) obj).intValue();
                ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity = (ManagingPlusDevicesHelperActivity) obj3;
                if (intValue == -1) {
                    managingPlusDevicesHelperActivity.getViewModel().X(new com.yandex.passport.internal.ui.sloth.plusdevices.k(false, (ManagingPlusDevicesPropertiesImpl) obj2));
                } else {
                    managingPlusDevicesHelperActivity.setResult(intValue);
                    managingPlusDevicesHelperActivity.finish();
                }
                return zy11Var;
            case 2:
                Object n = d0.n((d0) obj3, (b1) obj2, (com.yandex.passport.sloth.u) obj, continuation);
                return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11Var;
            default:
                com.yandex.passport.user_id.models.d dVar = (com.yandex.passport.user_id.models.d) obj;
                WebView webView = (WebView) obj3;
                if (dVar instanceof com.yandex.passport.user_id.models.c) {
                    webView.loadUrl(((com.yandex.passport.user_id.models.c) dVar).a);
                } else if (dVar instanceof com.yandex.passport.user_id.models.b) {
                    webView.evaluateJavascript(((com.yandex.passport.user_id.models.b) dVar).a, null);
                } else {
                    if (!(dVar instanceof com.yandex.passport.user_id.models.a)) {
                        w511.b();
                        return null;
                    }
                    ((tls) obj2).invoke(((com.yandex.passport.user_id.models.a) dVar).a);
                }
                return zy11Var;
        }
    }
}
