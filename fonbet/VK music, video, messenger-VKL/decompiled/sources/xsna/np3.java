package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import xsna.esh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class np3 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((sa) obj2).invoke(obj);
                break;
            case 1:
                ((am0) obj2).invoke(obj);
                break;
            case 2:
                ((wh6) obj2).invoke(obj);
                break;
            case 3:
                int i2 = BonusCatalogFragment.f0;
                ((wh6) obj2).invoke(obj);
                break;
            case 4:
                ((sa) obj2).invoke(obj);
                break;
            case 5:
                ((dib) obj2).invoke(obj);
                break;
            case 6:
                ChatFragment.d dVar = ChatFragment.w1;
                ((wh6) obj2).invoke(obj);
                break;
            case 7:
                ((sa) obj2).invoke(obj);
                break;
            case 8:
                ((sa) obj2).invoke(obj);
                break;
            case 9:
                ((sa) obj2).invoke(obj);
                break;
            case 10:
                ((n6f) obj2).invoke(obj);
                break;
            case 11:
                ((np5) obj2).invoke(obj);
                break;
            case 12:
                ((n6f) obj2).invoke(obj);
                break;
            case 13:
                esh.a aVar = (esh.a) obj2;
                VKList vKList = (VKList) obj;
                aVar.a = vKList.size() + aVar.a;
                aVar.b = vKList.i();
                ImageViewer.c<Photo> cVar = aVar.d;
                if (cVar != null) {
                    cVar.c(vKList);
                    break;
                }
                break;
            case 14:
                ((n6f) obj2).invoke(obj);
                break;
            case 15:
                ((n6f) obj2).invoke(obj);
                break;
            case 16:
                ((np5) obj2).invoke(obj);
                break;
            case 17:
                ((n6f) obj2).invoke(obj);
                break;
            case 18:
                ((vze) obj2).invoke(obj);
                break;
            case 19:
                ((e4n) obj2).e((h4n) obj);
                break;
            case 20:
                ((n6f) obj2).invoke(obj);
                break;
            case 21:
                ((n6f) obj2).invoke(obj);
                break;
            case 22:
                ((np5) obj2).invoke(obj);
                break;
            case 23:
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                ((ud8) obj2).invoke(obj);
                break;
            case 24:
                ((y4v) obj2).invoke(obj);
                break;
            case 25:
                ((w7u) obj2).invoke(obj);
                break;
            case 26:
                ((np5) obj2).invoke(obj);
                break;
            case 27:
                ((ysd) obj2).invoke(obj);
                break;
            case 28:
                float f = ListGroupCallView.o0;
                ((w7u) obj2).invoke(obj);
                break;
            default:
                ((ud8) obj2).invoke(obj);
                break;
        }
    }
}
