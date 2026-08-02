package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.money.MoneyTransfersFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.superapp.browser.internal.ui.shortcats.a;
import xsna.b9a0;
import xsna.lu1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((a.c) obj2).invoke(obj);
                break;
            case 1:
                ((tb) obj2).invoke(obj);
                break;
            case 2:
                ((lu1.a.C3299a) obj2).invoke(obj);
                break;
            case 3:
                ((tb) obj2).invoke(obj);
                break;
            case 4:
                ((tb) obj2).invoke(obj);
                break;
            case 5:
                ((tb) obj2).invoke(obj);
                break;
            case 6:
                ((tb) obj2).invoke(obj);
                break;
            case 7:
                ((tb) obj2).invoke(obj);
                break;
            case 8:
                ((qu) obj2).invoke(obj);
                break;
            case 9:
                ((tb) obj2).invoke(obj);
                break;
            case 10:
                ((q60) obj2).invoke(obj);
                break;
            case 11:
                ((wqb) obj2).invoke(obj);
                break;
            case 12:
                ((kdg) obj2).invoke(obj);
                break;
            case 13:
                ((kqb) obj2).invoke(obj);
                break;
            case 14:
                ((xcd) obj2).invoke(obj);
                break;
            case 15:
                int i2 = GalleryFragmentImpl.R0;
                ((xcd) obj2).invoke(obj);
                break;
            case 16:
                ((GlobalSearchAllCatalogRootVh.b) obj2).invoke(obj);
                break;
            case 17:
                ((xcd) obj2).invoke(obj);
                break;
            case 18:
                ((wqb) obj2).invoke(obj);
                break;
            case 19:
                ((cww) obj2).invoke(obj);
                break;
            case 20:
                ((p520) obj2).invoke(obj);
                break;
            case 21:
                ((cww) obj2).invoke(obj);
                break;
            case 22:
                ((cww) obj2).invoke(obj);
                break;
            case 23:
                fgz fgzVar = (fgz) obj2;
                Throwable th = (Throwable) obj;
                int i3 = MoneyTransfersFragment.b1;
                if (!(th instanceof VKApiExecutionException)) {
                    fgzVar.e(new VKApiExecutionException(1, "", false, ""));
                    break;
                } else {
                    fgzVar.e((VKApiExecutionException) th);
                    break;
                }
            case 24:
                ((kdg) obj2).invoke(obj);
                break;
            case 25:
                ((cww) obj2).invoke(obj);
                break;
            case 26:
                ((cww) obj2).invoke(obj);
                break;
            case 27:
                ((lfa) obj2).invoke(obj);
                break;
            case 28:
                ((cww) obj2).invoke(obj);
                break;
            default:
                com.vk.photos.root.photoflow.presentation.b bVar = (com.vk.photos.root.photoflow.presentation.b) obj2;
                bVar.h.b(b9a0.h.a);
                if ((obj instanceof ok1) || (obj instanceof cl1)) {
                    bVar.U();
                    break;
                }
                break;
        }
    }
}
