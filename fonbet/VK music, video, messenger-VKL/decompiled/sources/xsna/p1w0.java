package xsna;

import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;

/* compiled from: VkWebFileChooserImpl.kt */
/* loaded from: classes6.dex */
public final class p1w0 implements SuperappUiRouterBridge.e {
    public final /* synthetic */ VkWebFileChooserImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public p1w0(VkWebFileChooserImpl vkWebFileChooserImpl, boolean z, boolean z2) {
        this.a = vkWebFileChooserImpl;
        this.b = z;
        this.c = z2;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
    public final void a() {
        this.a.l();
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.e
    public final void b() {
        this.a.h(this.b, this.c);
    }
}
