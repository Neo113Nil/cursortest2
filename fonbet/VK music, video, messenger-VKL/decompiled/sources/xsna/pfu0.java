package xsna;

import android.content.Context;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.HashSet;

/* compiled from: VkBrowserActionMenu.kt */
/* loaded from: classes6.dex */
public final class pfu0 extends com.vk.core.ui.bottomsheet.internal.b {
    public final int a = iah0.a(254);
    public final /* synthetic */ com.vk.superapp.browser.internal.ui.menu.action.n b;

    public pfu0(com.vk.superapp.browser.internal.ui.menu.action.n nVar) {
        this.b = nVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        int i5 = this.a;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = i2 - i4;
        com.vk.superapp.browser.internal.ui.menu.action.n nVar = this.b;
        Context context = nVar.e;
        if (context != null) {
            WebApiApplication v = nVar.b.v();
            if (v != null && v.f()) {
                return i6;
            }
            HashSet hashSet = iah0.a;
            int a = fnj.a(context);
            if (i6 < a) {
                return a;
            }
        }
        return i6;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return iah0.a(16) + ((int) (i2 * 0.5f));
    }
}
