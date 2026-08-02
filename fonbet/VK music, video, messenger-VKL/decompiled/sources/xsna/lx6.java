package xsna;

import com.vk.core.view.components.button.VkButton;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lx6 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lx6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((mx6) this.c).c.h();
                break;
            case 1:
                ((FunctionReferenceImpl) this.c).invoke();
                break;
            case 2:
                xyb xybVar = (xyb) this.c;
                xybVar.v = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 3:
                ((asm) this.c).c();
                break;
            case 4:
                ((io.reactivex.rxjava3.disposables.b) this.c).dispose();
                break;
            case 5:
                ((VkButton) this.c).setLoading(false);
                break;
            case 6:
                VkButton vkButton = ((h2a0) this.c).f1;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setLoading(false);
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lx6(gzs gzsVar) {
        this.b = 1;
        this.c = (FunctionReferenceImpl) gzsVar;
    }
}
