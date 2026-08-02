package xsna;

import com.vk.photogallery.LocalGalleryProvider;
import xsna.i6w;
import xsna.pqb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rz implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.vk.superapp.browser.internal.ui.shortcats.a) this.c).g = null;
                break;
            case 1:
                ((xmm) this.c).a.invoke(i6w.k.b);
                break;
            case 2:
                ((LocalGalleryProvider) this.c).isLoading = false;
                break;
            case 3:
                com.vk.lists.c cVar = ((com.vk.lists.e) this.c).d;
                cVar.r = null;
                cVar.s = false;
                break;
            case 4:
                bqb0 bqb0Var = (bqb0) this.c;
                wj50<pqb0> wj50Var = bqb0Var.g;
                wj50Var.b(new pqb0.b(bqb0Var.f.e));
                bqb0Var.i.d();
                wj50Var.b(pqb0.a.a);
                break;
            case 5:
                ((a2e0) this.c).a();
                break;
            default:
                ((xq1) this.c).invoke();
                break;
        }
    }
}
