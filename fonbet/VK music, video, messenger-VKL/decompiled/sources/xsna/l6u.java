package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.catalog2.feature.music.holders.MusicRecommendedPlaylistVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.e;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.log.L;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.cf70;
import xsna.e4u0;
import xsna.hd20;
import xsna.j070;
import xsna.l310;
import xsna.m6u;
import xsna.oa70;
import xsna.xn50;
import xsna.z430;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l6u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        View view;
        Context context;
        zf40 zf40Var;
        UserProfile userProfile;
        int i = this.b;
        r2 = null;
        UserId userId = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m6u m6uVar = (m6u) obj;
                fy00 fy00Var = ((n6u) ((GoodPreviewFragment) obj2).U.getValue()).a;
                if (m6uVar instanceof m6u.a) {
                    m6u.a aVar = (m6u.a) m6uVar;
                    fy00Var.b(new gu00(aVar.b, aVar.a, 1));
                } else {
                    if (!(m6uVar instanceof m6u.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m6u.b bVar = (m6u.b) m6uVar;
                    fy00Var.b(new hy00(bVar.a, bVar.b, bVar.c));
                }
                return s3q0.a;
            case 1:
                jcu jcuVar = (jcu) obj2;
                lkf0.d(jcuVar.r, 0);
                oak0.d(jcuVar.i, null, new frg(jcuVar, 20));
                return s3q0.a;
            case 2:
                tgu tguVar = (tgu) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                View view2 = tguVar.itemView;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (!booleanValue || ((zzz) tguVar.l.a).isHorizontal()) ? cn70.b(0) : tgu.z;
                view2.setLayoutParams(marginLayoutParams);
                return s3q0.a;
            case 3:
                ((GroupFilterTileVh) obj2).onClick((View) obj);
                return s3q0.a;
            case 4:
                GroupInviteVh groupInviteVh = (GroupInviteVh) obj2;
                awd0 awd0Var = (awd0) obj;
                if (awd0Var.a == 4) {
                    h8q0 h8q0Var = (h8q0) awd0Var;
                    UserId a = fkq0.a(h8q0Var.b);
                    Group group = groupInviteVh.j;
                    if (a.equals(group != null ? group.c : null)) {
                        if (h8q0Var.c) {
                            groupInviteVh.d();
                        } else {
                            groupInviteVh.c();
                        }
                    }
                }
                return s3q0.a;
            case 5:
                return new tiu(((ImStartGroupCallFragment) obj2).Z, ((x8j) obj).a, EmptySet.b);
            case 6:
                return new com.vk.stickers.keyboard.navigation.c((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) obj2).k);
            case 7:
                if2 if2Var = (if2) obj2;
                tdu tduVar = (tdu) obj;
                tduVar.A(((Number) if2Var.d()).floatValue());
                tduVar.B(((Number) if2Var.d()).floatValue());
                return s3q0.a;
            case 8:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj2;
                id00 id00Var = (id00) obj;
                CheckBox checkBox = marketEditAlbumCoverFragment.S;
                if (checkBox == null) {
                    checkBox = null;
                }
                checkBox.setChecked(id00Var.c);
                checkBox.setEnabled(id00Var.d);
                CheckBox checkBox2 = marketEditAlbumCoverFragment.T;
                CheckBox checkBox3 = checkBox2 != null ? checkBox2 : null;
                checkBox3.setChecked(id00Var.a);
                checkBox3.setEnabled(id00Var.b);
                return s3q0.a;
            case 9:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj2;
                int i2 = MarketEditAlbumGoodsFragment.c1;
                marketEditAlbumGoodsFragment.Lo((GoodAlbumEditFlowEntity) obj);
                marketEditAlbumGoodsFragment.qo();
                return s3q0.a;
            case 10:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj2;
                int i3 = MarketItemReviewsFragment.w0;
                l310.g.a aVar2 = l310.g.a.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, aVar2);
                return s3q0.a;
            case 11:
                e4u0.b bVar2 = (e4u0.b) obj2;
                hd20 hd20Var = (hd20) obj;
                if (!(hd20Var instanceof hd20.c)) {
                    return new hd20.c(bVar2.b, bVar2.c);
                }
                hd20.c cVar = (hd20.c) hd20Var;
                return new hd20.c(cVar.a, j5g.u0(bVar2.c, cVar.b));
            case 12:
                ((eg20) obj2).p.onNext((oj0) obj);
                return s3q0.a;
            case 13:
                ((zak0) ((dr20) obj2).m).setValue((String) obj);
                return s3q0.a;
            case 14:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj2;
                Throwable th = (Throwable) obj;
                if (!rVar.h()) {
                    rVar.onError(th);
                } else if (th != null) {
                    L.i(th);
                }
                return s3q0.a;
            case 15:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.d dVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.d) obj2;
                dVar.j.b(e.a.a);
                dVar.h.b(new z430.b(dVar.f.d));
                return s3q0.a;
            case 16:
                Integer num = (Integer) obj2;
                return Boolean.valueOf(num != null && ((NestedMsg) obj).c == num.intValue());
            case 17:
                rx30 rx30Var = (rx30) obj2;
                int i4 = tur0.q;
                return new tur0(rx30Var.i.inflate(R.layout.vkim_peer_list_item, (ViewGroup) obj, false), rx30Var.h);
            case 18:
                return Boolean.valueOf(((qd40) obj2).W.get());
            case 19:
                Throwable th2 = (Throwable) obj;
                ((mp40) obj2).f.accept(new Pair(th2, Boolean.FALSE));
                bn40.c(th2, new Object[0]);
                return s3q0.a;
            case 20:
                MusicRecommendedPlaylistVh musicRecommendedPlaylistVh = (MusicRecommendedPlaylistVh) obj2;
                if (musicRecommendedPlaylistVh.g != null && (view = musicRecommendedPlaylistVh.k) != null && (context = view.getContext()) != null && e3m.h(context) != null) {
                    Rect rect = new Rect();
                    View view3 = musicRecommendedPlaylistVh.k;
                    if ((view3 != null ? view3.getGlobalVisibleRect(rect) : false) && (zf40Var = musicRecommendedPlaylistVh.t) != null) {
                        zf40Var.a(rect, null);
                    }
                }
                musicRecommendedPlaylistVh.w.b(null);
                return s3q0.a;
            case 21:
                ((j070.a) obj2).c.a();
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(new oa70.o(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 23:
                ((qe70) obj2).T(cf70.j.b);
                return s3q0.a;
            case 24:
                de80 de80Var = (de80) obj2;
                de80Var.h1++;
                de80Var.Yn();
                return s3q0.a;
            case 25:
                UserId userId2 = (UserId) obj2;
                nqs nqsVar = (nqs) obj;
                pqs pqsVar = nqsVar instanceof pqs ? (pqs) nqsVar : null;
                if (pqsVar != null && (userProfile = pqsVar.a) != null) {
                    userId = userProfile.c;
                }
                return Boolean.valueOf(epx.f(userId, userId2));
            case 26:
                return Boolean.valueOf(((List) obj2).contains(((Map.Entry) obj).getValue()));
            case 27:
                AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse = (AuthValidatePhoneCheckResponse) obj;
                par0.a.getClass();
                par0.a("Phone validation check " + authValidatePhoneCheckResponse);
                ((c4a0) obj2).b(VkValidatePhoneInfo.a.b(authValidatePhoneCheckResponse));
                return s3q0.a;
            case 28:
                com.vk.photogallery.c cVar2 = (com.vk.photogallery.c) obj2;
                bwt0.p0(cVar2.t, !((gy90) obj).a.contains("android.permission.READ_MEDIA_IMAGES"));
                List<f5t> list = cVar2.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof LocalGalleryProvider) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((LocalGalleryProvider) it.next()).prefetch(cVar2.a);
                }
                return s3q0.a;
            default:
                ((xia0) obj2).b.q0();
                return s3q0.a;
        }
    }
}
