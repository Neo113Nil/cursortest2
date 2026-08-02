package xsna;

import com.vk.auth.ui.consent.VkConsentView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ctb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ctb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ftb ftbVar = (ftb) this.c;
                ftbVar.m = null;
                ftbVar.e.j();
                break;
            case 1:
                n5u0 n5u0Var = (n5u0) this.c;
                n5u0Var.d = null;
                n5u0Var.c.onNext(Boolean.TRUE);
                break;
            default:
                VkConsentView vkConsentView = ((com.vk.auth.ui.consent.i) this.c).a;
                vkConsentView.d.setVisibility(0);
                vkConsentView.b.setVisibility(8);
                vkConsentView.k.setVisibility(8);
                break;
        }
    }
}
