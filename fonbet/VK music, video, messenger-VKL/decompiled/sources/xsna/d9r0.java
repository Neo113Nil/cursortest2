package xsna;

import android.content.Context;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VKAppsCatalogSectionDetailsPresenter.kt */
/* loaded from: classes6.dex */
public final class d9r0 implements c23 {
    public final b9r0 a;
    public final String b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 d = new bpn0(new dgc0(13));
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new stg0(this, 18));
    public com.vk.lists.c f;

    public d9r0(b9r0 b9r0Var, String str) {
        this.a = b9r0Var;
        this.b = str;
    }

    public static final io.reactivex.rxjava3.core.q a(d9r0 d9r0Var, Integer num, Integer num2) {
        Context context;
        try {
            context = d9r0Var.a.a.requireContext();
        } catch (IllegalStateException unused) {
            context = null;
        }
        return m3r0.c(context).L(new a0m0(new yl3(num2, d9r0Var, num, 6), 8), false);
    }

    @Override // xsna.c23
    public final void c(SectionAppItem sectionAppItem, String str, Integer num) {
        WebApiApplication webApiApplication = sectionAppItem.b;
        String str2 = sectionAppItem.c;
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        SuperappUiRouterBridge.b.b(superappUiRouterBridge, this.a.a.requireContext(), webApiApplication, new nex0(str2, str2), null, null, null, null, 248);
    }

    public final io.reactivex.rxjava3.disposables.b g() {
        return this.c;
    }
}
