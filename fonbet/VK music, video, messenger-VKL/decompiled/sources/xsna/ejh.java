package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.market.good.ui.ProductCardError;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.b9a0;
import xsna.pox0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejh implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ejh(int i, int i2, Object obj, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.c = obj;
        this.d = xzsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        tlo0.g c;
        tlo0.a aVar;
        int i;
        switch (this.b) {
            case 0:
                gjh gjhVar = (gjh) this.c;
                f5u f5uVar = (f5u) this.d;
                yoi0 yoi0Var = (yoi0) this.e;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gjhVar.c.invoke(new d.t.b.a(f5uVar, booleanValue));
                lt00 lt00Var = gjhVar.b;
                Good good = f5uVar.b;
                MarketFavable s = ao8.s(good);
                s.f = booleanValue;
                lt00Var.d(s, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_SERVICES, Integer.valueOf(yoi0Var.b), good.d0);
                break;
            case 1:
                DeliveryPoint.WeekDay weekDay = (DeliveryPoint.WeekDay) this.c;
                Map map = (Map) this.d;
                ((Integer) obj2).getClass();
                hwl.h(weekDay, map, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                a.f fVar = (a.f) this.c;
                PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum = (PhotoAlbumWrapper.CommonPhotoAlbum) this.d;
                com.vk.photos.root.photoflow.presentation.b bVar = (com.vk.photos.root.photoflow.presentation.b) this.e;
                f4z f4zVar = bVar.h;
                if (((Integer) obj2).intValue() == ((Integer) obj).intValue()) {
                    List<Photo> list = fVar.b;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Photo) it.next()).d == -6) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (fVar.b.size() == 1) {
                        tlo0.a aVar2 = tlo0.Companion;
                        Object[] objArr = {commonPhotoAlbum.d};
                        aVar2.getClass();
                        c = tlo0.a.c(R.string.photo_flow_photo_moved, objArr);
                    } else if (z) {
                        tlo0.a aVar3 = tlo0.Companion;
                        Object[] objArr2 = {commonPhotoAlbum.d};
                        aVar3.getClass();
                        c = tlo0.a.c(R.string.not_all_photos_moved_system, objArr2);
                    } else {
                        tlo0.a aVar4 = tlo0.Companion;
                        Object[] objArr3 = {commonPhotoAlbum.d};
                        aVar4.getClass();
                        c = tlo0.a.c(R.string.photo_flow_photos_moved, objArr3);
                    }
                    tlo0.g gVar = c;
                    if (z) {
                        aVar = tlo0.Companion;
                        i = R.string.album_details_move_success_go_to_album_action;
                    } else {
                        aVar = tlo0.Companion;
                        i = R.string.photo_flow_navigate_to_album_after_move;
                    }
                    f4zVar.b(new b9a0.k(new j7k0(gVar, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), tq.h(aVar, i), new wo1(14, bVar, commonPhotoAlbum), null, 32)));
                } else {
                    f4zVar.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.not_all_photos_moved), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.see_photo_move_result), new uh3(22, bVar, commonPhotoAlbum), null, 32)));
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                skd0.a((ProductCardError) this.c, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                uox0.f((pox0.f) this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ejh(DeliveryPoint.WeekDay weekDay, Map map, q630 q630Var, int i) {
        this.b = 1;
        this.c = weekDay;
        this.d = map;
        this.e = q630Var;
    }

    public /* synthetic */ ejh(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
