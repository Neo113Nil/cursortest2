package xsna;

import android.view.View;
import com.vk.api.generated.places.dto.PlacesCategoryDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.geo.GeoLocation;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.media.MediaUtils;
import com.vk.money.createtransfer.chat.CreateChatTransferPresenter;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.loh0;
import xsna.pox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zg7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zg7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.vk.dto.geo.GeoLocation] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        PlacesPlaceDto placesPlaceDto;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((bh7) this.c).b(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                qtd0 qtd0Var = (qtd0) this.c;
                UserId userId = (UserId) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Contact contact = (Contact) qtd0Var;
                String str = contact.p;
                ImageList imageList = contact.h;
                if (str == null) {
                    return null;
                }
                if (userId == null) {
                    String str2 = contact.c;
                    String Db = imageList.Db();
                    return new zqk0(null, 0L, str2, str2, Db == null ? "" : Db, false, false, EmptySet.b, false, null, null, null, new xmw0(str, 0), 0, false, null, null, null, booleanValue, false, false, 3661313);
                }
                String str3 = contact.c;
                String Db2 = imageList.Db();
                return new zqk0(null, 0L, str3, str3, Db2 == null ? "" : Db2, false, false, EmptySet.b, false, userId, null, null, new xmw0(str, 0), 0, false, null, null, null, booleanValue, false, false, 3660289);
            case 2:
                ((Integer) obj2).getClass();
                r1h.f((loh0.d.C3281d) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((f1i) this.c).ho(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                CreateChatTransferPresenter createChatTransferPresenter = (CreateChatTransferPresenter) this.c;
                return Integer.valueOf(epx.g(createChatTransferPresenter.u.indexOf(((hfz) obj).getClass()), createChatTransferPresenter.u.indexOf(((hfz) obj2).getClass())));
            case 5:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                View view = discoverSimilarFeedFragment.d0;
                if (view != null) {
                    view.setVisibility(booleanValue2 ? 0 : 8);
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((v0r) this.c).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1192950673, intValue, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
                    }
                    jaiVar.invoke(hur.a, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 8:
                srt srtVar = (srt) this.c;
                bv6 bv6Var = (bv6) obj2;
                List list = (List) ((bv6) obj).a;
                if (list != null && (placesPlaceDto = (PlacesPlaceDto) j5g.a0(list)) != null) {
                    srtVar.getClass();
                    int id = placesPlaceDto.getId();
                    int l = placesPlaceDto.l();
                    Integer e = placesPlaceDto.e();
                    int intValue2 = e != null ? e.intValue() : 0;
                    UserId q = placesPlaceDto.q();
                    int i = (int) (q != null ? q.b : UserId.d.b);
                    double j = placesPlaceDto.j();
                    double k = placesPlaceDto.k();
                    String title = placesPlaceDto.getTitle();
                    String d = placesPlaceDto.d();
                    String valueOf = String.valueOf(placesPlaceDto.g());
                    String valueOf2 = String.valueOf(placesPlaceDto.i());
                    PlacesCategoryDto f = placesPlaceDto.f();
                    r4 = new GeoLocation(id, l, intValue2, i, 0, j, k, title, null, d, valueOf, valueOf2, f != null ? f.getTitle() : null, 272, null);
                }
                return new Pair(r4, bv6Var.a);
            case 9:
                ((Integer) obj2).getClass();
                z8u.a((izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 10:
                o4g0 o4g0Var = (o4g0) obj2;
                e2g0 e2g0Var = ((MarketItemReviewRepliesFragment) this.c).Y;
                if (e2g0Var != null) {
                    e2g0Var.p(o4g0Var.a, o4g0Var.d, o4g0Var.b, o4g0Var.c);
                }
                return s3q0.a;
            case 11:
                MediaUtils.d dVar = (MediaUtils.d) this.c;
                ((Float) obj).floatValue();
                ((Boolean) obj2).booleanValue();
                return dVar;
            case 12:
                VideoFile videoFile = (VideoFile) this.c;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                ArrayList arrayList = new ArrayList();
                for (UIBlock uIBlock : Sb) {
                    if ((uIBlock instanceof UIBlockVideo) && epx.f(((UIBlockVideo) uIBlock).A().r1(), videoFile.r1())) {
                        uIBlock = null;
                    }
                    if (uIBlock != null) {
                        arrayList.add(uIBlock);
                    }
                }
                return new UIBlockList(uIBlockList, arrayList);
            default:
                ((Integer) obj2).getClass();
                uox0.b((pox0.f.a) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
        }
    }

    public /* synthetic */ zg7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
