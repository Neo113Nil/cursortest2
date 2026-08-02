package xsna;

import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import xsna.e820;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d120 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d120(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((p010) obj2).invoke(obj);
                break;
            case 1:
                ((e820.b) obj2).invoke(obj);
                break;
            case 2:
                ((c630) obj2).invoke(obj);
                break;
            case 3:
                ((q520) obj2).invoke(obj);
                break;
            case 4:
                ((MusicSearchCatalogRootVh.a) obj2).invoke(obj);
                break;
            case 5:
                ((oh3) obj2).invoke(obj);
                break;
            case 6:
                dv60 dv60Var = (dv60) obj2;
                Throwable th = (Throwable) obj;
                dv60Var.f.h(th);
                dv60Var.e(new kv60(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 7:
                ((ty60) obj2).e(new ux60(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 8:
                ((d410) obj2).invoke(obj);
                break;
            case 9:
                ((d410) obj2).invoke(obj);
                break;
            case 10:
                ((kq80) obj2).invoke(obj);
                break;
            case 11:
                ((q520) obj2).invoke(obj);
                break;
            case 12:
                ((wug0) obj2).invoke(obj);
                break;
            case 13:
                ((dxh0) obj2).c.hide();
                break;
            case 14:
                ((wug0) obj2).invoke(obj);
                break;
            case 15:
                qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
                ((wug0) obj2).invoke(obj);
                break;
            case 16:
                int i2 = StickerDetailsFragment.h0;
                ((wug0) obj2).invoke(obj);
                break;
            case 17:
                int i3 = StickersRecyclerView.w;
                ((wug0) obj2).invoke(obj);
                break;
            case 18:
                ((f55) obj2).invoke(obj);
                break;
            case 19:
                ((wug0) obj2).invoke(obj);
                break;
            case 20:
                ((hsc0) obj2).invoke(obj);
                break;
            case 21:
                ((wug0) obj2).invoke(obj);
                break;
            case 22:
                ((uyn0) obj2).invoke(obj);
                break;
            case 23:
                ((c1o0) obj2).invoke(obj);
                break;
            case 24:
                ((wug0) obj2).invoke(obj);
                break;
            case 25:
                ((f55) obj2).invoke(obj);
                break;
            case 26:
                ((btl0) obj2).invoke(obj);
                break;
            case 27:
                ((uyn0) obj2).invoke(obj);
                break;
            case 28:
                ((n9t0) obj2).invoke(obj);
                break;
            default:
                ((n9t0) obj2).invoke(obj);
                break;
        }
    }
}
