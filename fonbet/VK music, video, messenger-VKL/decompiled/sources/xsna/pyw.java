package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.device.store.AppStore;
import com.vkontakte.android.VKApplication;

/* compiled from: InitInAppReviewTaskLogic.kt */
/* loaded from: classes7.dex */
public final class pyw {
    public final /* synthetic */ boolean a;

    public pyw(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        boolean j;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            j = BuildInfo.j();
        } else {
            VKApplication vKApplication2 = com.vk.core.apps.a.a;
            j = BuildInfo.l(context, "com.android.vending");
        }
        if (!j) {
            return false;
        }
        boolean z = pmr0.a;
        Context context2 = e43.a;
        return pmr0.a(context2 != null ? context2 : null);
    }

    public final boolean b() {
        if (!this.a) {
            return false;
        }
        boolean z = pmr0.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return pmr0.b(context);
    }

    public final boolean c() {
        return BuildInfo.b() && dy2.i(AppStore.RUSTORE.j());
    }
}
