package xsna;

import android.view.View;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.storycamera.screen.StoryGalleryActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.exd0;
import xsna.mfg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nex implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nex(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((o3w) obj3).invoke(obj);
                break;
            case 1:
                ((a2a) obj3).invoke(obj);
                break;
            case 2:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                ((gb) obj3).invoke(obj);
                break;
            case 3:
                ((ugm) obj3).invoke(obj);
                break;
            case 4:
                ((xnr) obj3).invoke(obj);
                break;
            case 5:
                ((o3w) obj3).invoke(obj);
                break;
            case 6:
                ((ulz) obj3).invoke(obj);
                break;
            case 7:
                ((gb) obj3).invoke(obj);
                break;
            case 8:
                Post post = (Post) obj3;
                Flags flags = post.l;
                UserProfile userProfile = (UserProfile) j5g.a0((VKList) obj);
                flags.Ab(70368744177664L, epx.f(userProfile != null ? userProfile.c : null, post.o.b));
                post.l.Ab(549755813888L, true);
                ce60.b.getClass();
                p870.f().e(156, post);
                break;
            case 9:
                ((o3w) obj3).invoke(obj);
                break;
            case 10:
                ((fju) obj3).invoke(obj);
                break;
            case 11:
                ((ulz) obj3).invoke(obj);
                break;
            case 12:
                ((gb) obj3).invoke(obj);
                break;
            case 13:
                ((ulz) obj3).invoke(obj);
                break;
            case 14:
                ((r9c0) obj3).invoke(obj);
                break;
            case 15:
                ((ulz) obj3).invoke(obj);
                break;
            case 16:
                ((r9c0) obj3).invoke(obj);
                break;
            case 17:
                ((exd0.h) obj3).invoke(obj);
                break;
            case 18:
                int i3 = RestoreSearchFragment.h0;
                ((VkSearchView) obj3).d0();
                break;
            case 19:
                io.reactivex.rxjava3.functions.f fVar = (io.reactivex.rxjava3.functions.f) obj3;
                mfg0.a aVar = (mfg0.a) obj;
                if (aVar.b != -1) {
                    fVar.accept(aVar);
                    break;
                }
                break;
            case 20:
                ((r9c0) obj3).invoke(obj);
                break;
            case 21:
                ((h9i0) obj3).invoke(obj);
                break;
            case 22:
                ((dq1) obj3).invoke(obj);
                break;
            case 23:
                l7l0 l7l0Var = (l7l0) obj3;
                ArrayList arrayList = l7l0Var.f;
                if (obj instanceof c790) {
                    c790 c790Var = (c790) obj;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((qai0) obj2).a.b == c790Var.a.b) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    qai0 qai0Var = (qai0) obj2;
                    if (qai0Var != null) {
                        qai0Var.c = true;
                        int x = l7l0.x(arrayList);
                        o7l0 o7l0Var = l7l0Var.b;
                        StickerStockItem stickerStockItem = l7l0Var.d;
                        StickerStockItem stickerStockItem2 = stickerStockItem != null ? stickerStockItem : null;
                        StickerStockItem stickerStockItem3 = l7l0Var.e;
                        g7l0.Yg(o7l0Var, stickerStockItem2, stickerStockItem3 != null ? stickerStockItem3 : null, arrayList, PackStylesListHolder.State.DATA, x, 32);
                        break;
                    }
                }
                break;
            case 24:
                ((r9c0) obj3).invoke(obj);
                break;
            case 25:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                ((r9c0) obj3).invoke(obj);
                break;
            case 26:
                ((ulz) obj3).invoke(obj);
                break;
            case 27:
                ((r9c0) obj3).invoke(obj);
                break;
            case 28:
                ((r9c0) obj3).invoke(obj);
                break;
            default:
                ((wyg) obj3).invoke(obj);
                break;
        }
    }
}
