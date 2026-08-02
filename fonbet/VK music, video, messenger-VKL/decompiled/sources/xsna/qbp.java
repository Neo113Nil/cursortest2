package xsna;

import com.vk.core.view.components.button.VkButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qbp implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qbp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                VkButton vkButton = ((ubp) this.c).i;
                if (vkButton != null) {
                    vkButton.setLoading(false);
                    break;
                }
                break;
            case 1:
                io.reactivex.rxjava3.disposables.c cVar = ((o5e0) this.c).c;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
            case 2:
                c7r0.f.remove((String) this.c);
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
