package xsna;

import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o1w0 implements izs {
    public final /* synthetic */ VkWebFileChooserImpl b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ VkWebFileChooserImpl.a d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ o1w0(VkWebFileChooserImpl vkWebFileChooserImpl, boolean z, VkWebFileChooserImpl.a aVar, boolean z2) {
        this.b = vkWebFileChooserImpl;
        this.c = z;
        this.d = aVar;
        this.e = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.e;
        this.b.f(this.c, this.d, (VkWebFileChooserImpl.PickAction) obj, z);
        return s3q0.a;
    }
}
