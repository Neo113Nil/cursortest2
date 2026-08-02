package xsna;

import android.content.Intent;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.ui.menu.VkBrowserMenuFactory;
import java.util.Map;

/* compiled from: OnWebCallback.kt */
/* loaded from: classes6.dex */
public interface xc80 extends yc80 {
    boolean A();

    void B(Throwable th);

    VkBrowserMenuFactory a();

    void b(boolean z);

    boolean i();

    boolean j(String str);

    void k();

    void l(int i, String str);

    void m(boolean z);

    void n();

    void o(WebIdentityContext webIdentityContext);

    void p(Intent intent);

    void q();

    void r();

    void s();

    void t(boolean z);

    void u(Intent intent);

    void v(int i, Intent intent);

    void w();

    void x();

    void y(upn0 upn0Var);

    Map<VkUiCommand, dvv0> z(long j);
}
