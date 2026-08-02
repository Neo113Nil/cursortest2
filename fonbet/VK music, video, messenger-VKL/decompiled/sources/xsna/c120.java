package xsna;

import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import java.util.List;
import xsna.j140;
import xsna.mqa0;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c120 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c120(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wpg) obj2).invoke(obj);
                break;
            case 1:
                ((kdn) obj2).invoke(obj);
                break;
            case 2:
                ((xsq) obj2).invoke(obj);
                break;
            case 3:
                MenuListView menuListView = (MenuListView) obj2;
                ArrayList arrayList = menuListView.s;
                arrayList.clear();
                arrayList.addAll((List) obj);
                menuListView.d.post(new g0(menuListView, 14));
                break;
            case 4:
                ((kdn) obj2).invoke(obj);
                break;
            case 5:
                ((j140.c) obj2).invoke(obj);
                break;
            case 6:
                ((cq3) obj2).invoke(obj);
                break;
            case 7:
                ((MusicSearchCatalogRootVh.b) obj2).invoke(obj);
                break;
            case 8:
                ((zb60) obj2).invoke(obj);
                break;
            case 9:
                ((zu60) obj2).invoke(obj);
                break;
            case 10:
                ((zb60) obj2).invoke(obj);
                break;
            case 11:
                ((py60) obj2).e((vx60) obj);
                break;
            case 12:
                ((zb60) obj2).invoke(obj);
                break;
            case 13:
                ((oe70) obj2).invoke(obj);
                break;
            case 14:
                ((n37) obj2).invoke(obj);
                break;
            case 15:
                int i2 = u1a0.A1;
                ((wq20) obj2).invoke(obj);
                break;
            case 16:
                ((mqa0.b) obj2).invoke(obj);
                break;
            case 17:
                tzp0.c.a aVar = PollEditorModalBottomSheet.o1;
                ((r8) obj2).invoke(obj);
                break;
            case 18:
                ((xsq) obj2).invoke(obj);
                break;
            case 19:
                ((zb60) obj2).invoke(obj);
                break;
            case 20:
                ((pvc0) obj2).e((rvc0) obj);
                break;
            case 21:
                ((zb60) obj2).invoke(obj);
                break;
            case 22:
                ((cq3) obj2).invoke(obj);
                break;
            case 23:
                ((zb60) obj2).invoke(obj);
                break;
            case 24:
                ((n37) obj2).invoke(obj);
                break;
            case 25:
                ((xsq) obj2).invoke(obj);
                break;
            case 26:
                ((zb60) obj2).invoke(obj);
                break;
            case 27:
                ((cq3) obj2).invoke(obj);
                break;
            case 28:
                ((zb60) obj2).invoke(obj);
                break;
            default:
                ((n9m0) obj2).invoke(obj);
                break;
        }
    }
}
