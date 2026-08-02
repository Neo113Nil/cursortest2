package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.webview.api.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;

/* loaded from: classes3.dex */
public final class gdm0 implements fdm0 {
    public final tfl0 a;
    public final np41 b;
    public final j3h c;

    public gdm0(j3h j3hVar, tfl0 tfl0Var, np41 np41Var) {
        this.a = tfl0Var;
        this.b = np41Var;
        this.c = j3hVar;
    }

    public final void a(String str) {
        if (str != null) {
            this.a.h(a.b(this.b, str, null, null, 6));
        } else {
            ((l3h) this.c).d(new Deeplink(new DeeplinkAction.Support(null, null, 3, null), null, null, null, null, null, false, false, 254, null));
        }
    }

    public final void b() {
        ((l3h) this.c).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.SavingsDashboard(null), DeeplinkNavigation.PopBackTo.INSTANCE));
    }
}
