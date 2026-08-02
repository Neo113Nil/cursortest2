package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Size;
import android.view.View;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.vk.articles.ArticleFragment;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.avatars.a;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bp80;
import xsna.bph0;
import xsna.bzd;
import xsna.c5g;
import xsna.cmd;
import xsna.ctu;
import xsna.dzh;
import xsna.e3m;
import xsna.ew8;
import xsna.f1i;
import xsna.fpf0;
import xsna.gwd;
import xsna.gzs;
import xsna.hny;
import xsna.i5s;
import xsna.iah0;
import xsna.inf;
import xsna.jr0;
import xsna.l7m;
import xsna.m7m;
import xsna.njh0;
import xsna.o1d;
import xsna.onk;
import xsna.oob;
import xsna.ph;
import xsna.qcy;
import xsna.r5;
import xsna.rd0;
import xsna.ryh;
import xsna.s0e;
import xsna.s3q0;
import xsna.tsh;
import xsna.u8d;
import xsna.w8;
import xsna.wgb;
import xsna.wsh;
import xsna.xn50;
import xsna.xoh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AdObject adObject_delegate$lambda$1;
        List<VideoEditForbiddenReason> list;
        Object bVar;
        int i = this.b;
        r2 = null;
        ArrayList arrayList = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj;
                return new onk(l0Var.g, new m0(l0Var), l0Var.L0(), l0Var.w0());
            case 1:
                a aVar = (a) obj;
                return new a.C1177a(e3m.f(R.attr.im_unknown_avatar_start_color, aVar.a), e3m.f(R.attr.im_unknown_avatar_end_color, aVar.a));
            case 2:
                int i2 = r5.k1;
                return (InfoBridgeComponent) m7m.d((r5) obj).a(fpf0.a(InfoBridgeComponent.class));
            case 3:
                qcy<Object>[] qcyVarArr = ph.n1;
                ((ph) obj).getFeature().C(bph0.e.b);
                return s3q0.a;
            case 4:
                ((rd0) obj).c.invoke();
                return s3q0.a;
            case 5:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 6:
                return new ctu(new w8((jr0) obj, 3));
            case 7:
                adObject_delegate$lambda$1 = AndroidFullscreenWebViewAdPlayer.adObject_delegate$lambda$1((AndroidFullscreenWebViewAdPlayer) obj);
                return adObject_delegate$lambda$1;
            case 8:
                int i3 = AnimationDialog.g0;
                return Boolean.valueOf(((AnimationDialog) obj).requireArguments().getBoolean("over_dlg", false));
            case 9:
                int i4 = ArticleFragment.E0;
                return Boolean.valueOf(((ArticleFragment) obj).Ac());
            case 10:
                BookingRecordsScreenFragment bookingRecordsScreenFragment = (BookingRecordsScreenFragment) obj;
                qcy<Object>[] qcyVarArr2 = BookingRecordsScreenFragment.V;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingRecordsScreenFragment.S.getValue());
                l7m d = m7m.d(bookingRecordsScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 11:
                return Integer.valueOf(((List) obj).size());
            case 12:
                ew8.F((y) obj);
                return s3q0.a;
            case 13:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": executeLoadNext: skip network load, already loading network. wrong worker state");
            case 14:
                oob oobVar = (oob) obj;
                View view = oobVar.r;
                if (view == null) {
                    view = null;
                }
                hny hnyVar = new hny(view.getContext());
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                float f = 10;
                shapeDrawable.setIntrinsicWidth(iah0.a(f));
                shapeDrawable.setIntrinsicHeight(iah0.a(f));
                ImAvatarView imAvatarView = oobVar.x;
                if (imAvatarView == null) {
                    imAvatarView = null;
                }
                shapeDrawable.setTint(e3m.f(R.attr.vk_ui_background, imAvatarView.getContext()));
                hnyVar.b(shapeDrawable);
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                float f2 = 6;
                shapeDrawable2.setIntrinsicWidth(iah0.a(f2));
                shapeDrawable2.setIntrinsicHeight(iah0.a(f2));
                ImAvatarView imAvatarView2 = oobVar.x;
                shapeDrawable2.setTint(e3m.f(R.attr.vk_ui_background_accent_themed, (imAvatarView2 != null ? imAvatarView2 : null).getContext()));
                hnyVar.b(shapeDrawable2);
                return hnyVar;
            case 15:
                return o1d.v((o1d) obj);
            case 16:
                u8d u8dVar = (u8d) obj;
                Size size = u8dVar.i;
                if (size == null) {
                    size = u8dVar.j;
                }
                return Long.valueOf((((size.getWidth() * size.getHeight()) * 4) / 1000) * 2);
            case 17:
                VideoAccessInfo videoAccessInfo = ((ClipVideoFileAdapter) obj).m.A;
                if (videoAccessInfo != null && (list = videoAccessInfo.b) != null) {
                    List<VideoEditForbiddenReason> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    for (VideoEditForbiddenReason videoEditForbiddenReason : list2) {
                        if (videoEditForbiddenReason instanceof VideoEditForbiddenReason.Ad) {
                            bVar = new njh0.a(((VideoEditForbiddenReason.Ad) videoEditForbiddenReason).b);
                        } else {
                            if (!(videoEditForbiddenReason instanceof VideoEditForbiddenReason.Test)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new njh0.b(((VideoEditForbiddenReason.Test) videoEditForbiddenReason).b);
                        }
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            case 18:
                return (VkButton) ((cmd) obj).findViewById(R.id.cancel);
            case 19:
                bzd bzdVar = (bzd) obj;
                return new gwd(bzdVar.p, bzdVar.n, bzdVar.e);
            case 20:
                return (VkToolButton) ((s0e) obj).i().findViewById(R.id.go_back_btn);
            case 21:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj;
                ClipsFavoritesFoldersPickerFragment.a aVar2 = ClipsFavoritesFoldersPickerFragment.V;
                clipsFavoritesFoldersPickerFragment.getClass();
                xn50.a.c(clipsFavoritesFoldersPickerFragment, a.g.b);
                return s3q0.a;
            case 22:
                int i5 = ClipsLinksControllerRootFragment.Q;
                ((ClipsLinksControllerRootFragment) obj).dismiss();
                return s3q0.a;
            case 23:
                return ((inf) obj).o;
            case 24:
                int i6 = ClipsWrapperFragment.Q0;
                return ((ClipsWrapperFragment) obj).io().i6();
            case 25:
                ((xoh) obj).n.invoke();
                return s3q0.a;
            case 26:
                return new wsh(new tsh.b(2, (tsh) obj, tsh.class, "updateStateWithPriorityBlock", "updateStateWithPriorityBlock(Lcom/vk/profile/community/impl/ui/profile/state/CommunityProfileState;Lcom/vk/profile/community/impl/data/model/primaryblock/CommunityPriorityBlockDataModel;)Lcom/vk/profile/community/impl/ui/profile/state/CommunityProfileState;", 0));
            case 27:
                ((ryh) obj).b.c(dzh.n.k.a);
                return s3q0.a;
            case 28:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                int i7 = CommunityReviewsFragment.o0;
                c.r.j jVar = c.r.j.b;
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, jVar);
                return s3q0.a;
            default:
                ((f1i) obj).j1.setValue(new VkGroupsSearchParams());
                return s3q0.a;
        }
    }

    public /* synthetic */ j(ew8 ew8Var, y yVar) {
        this.b = 12;
        this.c = yVar;
    }
}
