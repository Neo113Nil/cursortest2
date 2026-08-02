package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.style.PodcastSliderViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersPacksChunk;
import com.vk.dto.user.UserProfile;
import com.vk.followersmode.api.domain.FollowersModeState;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.sharing.core.view.l;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.atq0;
import xsna.b9q0;
import xsna.oil0;
import xsna.tlo0;
import xsna.xn50;
import xsna.yns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h440 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h440(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        String str;
        Price price;
        Price.PriceInfo Eb;
        Price price2;
        Price.PriceInfo Eb2;
        FollowersModeState a;
        int i2 = this.b;
        int i3 = 13;
        boolean z = false;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((u440) obj2).a((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 1:
                ((MusicFollowOwnerButtonVh) obj2).f = null;
                return s3q0.a;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "FilterButton");
                qgi0.o(tgi0Var, ((CatalogFilterData) obj2).e);
                return s3q0.a;
            case 3:
                Boolean bool = (Boolean) obj;
                cjx cjxVar = ((pr50) obj2).E;
                (cjxVar != null ? cjxVar : null).o(!bool.booleanValue());
                return s3q0.a;
            case 4:
                bi20 bi20Var = (bi20) obj2;
                String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
                PodcastSliderViewStyle.Style.Companion.getClass();
                return w060.h0(bi20Var, (Podcast) obj, new PodcastSliderViewStyle(PodcastSliderViewStyle.Style.a.a(string)));
            case 5:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 6:
                ((q990) obj2).l.a(yns.d.a);
                return s3q0.a;
            case 7:
                ux90 ux90Var = (ux90) obj2;
                w73 w73Var = (w73) obj;
                ux90Var.d = w73Var;
                HashSet<String> hashSet = ux90Var.c;
                hashSet.clear();
                hashSet.addAll(w73Var.b);
                return s3q0.a;
            case 8:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) obj2;
                int i5 = PhotosRootFragment.X;
                photosRootFragment.getClass();
                xn50.a.c(photosRootFragment, (com.vk.photos.root.presentation.a) obj);
                return s3q0.a;
            case 9:
                Throwable th2 = (Throwable) obj;
                ((hib0) obj2).i.setEnabled(true);
                Context context = e43.a;
                cvk.w(j03.g(context != null ? context : null, th2, R.string.default_network_error), false);
                return s3q0.a;
            case 10:
                scc0 scc0Var = (scc0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    scc0Var.e();
                }
                return s3q0.a;
            case 11:
                z9d0 z9d0Var = (z9d0) obj2;
                return new sad0(z9d0Var.j, z9d0Var.k, z9d0Var.l, (ViewGroup) obj);
            case 12:
                nnd0 nnd0Var = (nnd0) obj2;
                int intValue = ((Integer) obj).intValue();
                if (nnd0Var.R6().getItemCount() == 1) {
                    nbf0 nbf0Var = nnd0Var.H;
                    if (nbf0Var != null) {
                        nbf0Var.c = new hj60(nnd0Var, 16);
                    }
                    nnd0Var.R6().notifyItemRemoved(intValue);
                } else if (nnd0Var.R6().getItemCount() == 1) {
                    nnd0Var.R6().submitList(null, new pu5(nnd0Var, i3));
                } else {
                    nnd0Var.R6().submitList(rdi.A(intValue, new ArrayList(nnd0Var.R6().getCurrentList())));
                }
                return s3q0.a;
            case 13:
                return new iuj((io.reactivex.rxjava3.disposables.b) obj2, i4);
            case 14:
                Throwable th3 = ((thg0) obj).d;
                ((shg0) obj2).getClass();
                if (th3 == null || !h03.a(th3)) {
                    aVar = tlo0.Companion;
                    i = R.string.community_review_initial_state_loading_error_description;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.community_review_initial_state_loading_internet_error_description;
                }
                return tq.h(aVar, i);
            case 15:
                ((zak0) ((sjg0) obj2).w).setValue((String) obj);
                return s3q0.a;
            case 16:
                SearchOwnerVideosCatalogRootVh searchOwnerVideosCatalogRootVh = (SearchOwnerVideosCatalogRootVh) obj2;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    searchOwnerVideosCatalogRootVh.u.e(new SearchQuery(((SearchSpellcheckVh.a.b) l3aVar).a, SearchInputMethod.Keyboard, null, null, 12, null), new b9q0.b(true));
                }
                return s3q0.a;
            case 17:
                ((zak0) ((u4i0) obj2).c).setValue((String) obj);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((Class) obj2).isInstance(obj));
            case 19:
                l.a aVar2 = ((com.vk.sharing.core.view.f) obj2).D;
                if (aVar2 != null) {
                    aVar2.E2(true);
                }
                return s3q0.a;
            case 20:
                k0l0 k0l0Var = (k0l0) obj2;
                k0l0Var.l.invoke(Integer.valueOf(k0l0Var.getBindingAdapterPosition()), Boolean.TRUE);
                return s3q0.a;
            case 21:
                l7l0 l7l0Var = (l7l0) obj2;
                l7l0Var.b.b();
                l7l0Var.Z();
                return s3q0.a;
            case 22:
                rcl0 rcl0Var = (rcl0) obj2;
                oil0.a aVar3 = (oil0.a) obj;
                StickersRouletteFragment stickersRouletteFragment = rcl0Var.b;
                Boolean bool2 = aVar3.g;
                Integer num = aVar3.h;
                boolean z2 = aVar3.a;
                StickersPacksChunk stickersPacksChunk = aVar3.d;
                rcl0Var.g = bool2.booleanValue();
                rcl0Var.e = aVar3.e;
                rcl0Var.f = aVar3.f;
                rcl0Var.d = stickersPacksChunk;
                if (z2) {
                    stickersRouletteFragment.po(true);
                    List<StickerStockItem> list = stickersPacksChunk.b;
                    RouletteView rouletteView = stickersRouletteFragment.W;
                    if (rouletteView != null) {
                        rouletteView.setData(list);
                    }
                } else {
                    stickersRouletteFragment.po(false);
                    String str2 = aVar3.b;
                    TextView textView = stickersRouletteFragment.Y;
                    if (textView != null) {
                        bwt0.p0(textView, true);
                    }
                    TextView textView2 = stickersRouletteFragment.Y;
                    if (textView2 != null) {
                        if (str2 == null || str2.length() == 0) {
                            str2 = stickersRouletteFragment.getResources().getString(R.string.random_stickers_not_allowed);
                        }
                        textView2.setText(str2);
                    }
                }
                int i6 = aVar3.c;
                StickerStockItem stickerStockItem = rcl0Var.e;
                int zb = (stickerStockItem == null || (price2 = stickerStockItem.n) == null || (Eb2 = price2.Eb()) == null) ? 0 : Eb2.zb();
                int intValue2 = num.intValue();
                if (intValue2 > 0) {
                    stickersRouletteFragment.qo(intValue2, true, false);
                } else if (i6 >= zb) {
                    stickersRouletteFragment.qo(i6, true, true);
                } else {
                    stickersRouletteFragment.qo(0, false, true);
                }
                boolean z3 = rcl0Var.g;
                int intValue3 = num.intValue();
                Integer num2 = aVar3.i;
                StickerStockItem stickerStockItem2 = rcl0Var.e;
                if (stickerStockItem2 == null || (price = stickerStockItem2.n) == null || (Eb = price.Eb()) == null || (str = Eb.Ab()) == null) {
                    str = "";
                }
                stickersRouletteFragment.mo(true);
                if (z2 && z3) {
                    z = true;
                }
                VkButton vkButton = stickersRouletteFragment.c0;
                if (vkButton != null) {
                    bwt0.p0(vkButton, z);
                }
                if (!z2) {
                    if (z3) {
                        stickersRouletteFragment.R8((r12 & 1) == 0, (r12 & 2) == 0, (r12 & 4) == 0, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? null : num2);
                    } else {
                        stickersRouletteFragment.R8((r12 & 1) == 0, (r12 & 2) == 0, (r12 & 4) == 0, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? null : null);
                    }
                    stickersRouletteFragment.lo(null);
                } else if (intValue3 > 0) {
                    stickersRouletteFragment.R8((r12 & 1) == 0, (r12 & 2) == 0, (r12 & 4) == 0, (r12 & 8) != 0 ? null : null, (r12 & 16) != 0 ? null : null);
                    stickersRouletteFragment.lo("");
                } else {
                    stickersRouletteFragment.R8((r12 & 1) == 0, (r12 & 2) == 0, (r12 & 4) == 0, (r12 & 8) != 0 ? null : str, (r12 & 16) != 0 ? null : null);
                    stickersRouletteFragment.lo(str);
                }
                return s3q0.a;
            case 23:
                ffo0 ffo0Var = (ffo0) obj2;
                y8g y8gVar = ((jzp0) obj).a;
                RecyclerView recyclerView = ffo0Var.n;
                RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
                Iterator<jzp0> it = ffo0Var.z.getCurrentList().iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                    } else if (!epx.f(y8gVar, it.next().a)) {
                        i7++;
                    }
                }
                lkf0.d(recyclerView2, i7 + 1);
                ffo0Var.b.invoke(new feo0(y8gVar, false));
                return s3q0.a;
            case 24:
                g7q0 g7q0Var = (g7q0) obj2;
                boolean z4 = !g7q0Var.o;
                g7q0Var.o = z4;
                g7q0Var.f.k3(z4);
                int i8 = g7q0Var.o ? R.string.video_owner_subscribed : R.string.video_owner_unsubscribed;
                a7q0 a7q0Var = g7q0Var.b;
                String P = g7q0Var.f.P();
                a7q0Var.i1(i8, P != null ? P : "");
                return s3q0.a;
            case 25:
                onq0 onq0Var = (onq0) obj2;
                h7o0 h7o0Var = (h7o0) obj;
                if (h7o0Var instanceof paq0) {
                    Parcelable parcelable = ((paq0) h7o0Var).b;
                    PhotoUploadInteractor.UploadTaskExtraParams uploadTaskExtraParams = parcelable instanceof PhotoUploadInteractor.UploadTaskExtraParams ? (PhotoUploadInteractor.UploadTaskExtraParams) parcelable : null;
                    if (uploadTaskExtraParams != null) {
                        List<String> list2 = uploadTaskExtraParams.b;
                        int i9 = list2.size() == 1 ? R.string.photo_flow_one_photo_uploaded_2 : R.string.photo_flow_few_photos_uploaded_2;
                        atq0.a aVar4 = new atq0.a(tq.h(tlo0.Companion, i9), new tlo0.f(R.string.photo_flow_post_to_story), new UserProfileAction.f.c.a(list2));
                        fpq0 fpq0Var = onq0Var.g;
                        (fpq0Var != null ? fpq0Var : null).B(new f.h(new atq0.d(null, null, new tlo0.f(i9), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), R.attr.vk_ui_icon_positive, null, aVar4, 99)));
                    }
                } else if (h7o0Var instanceof abq0) {
                    onq0Var.C();
                }
                return s3q0.a;
            case 26:
                fpq0 fpq0Var2 = (fpq0) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                b4s b4sVar = fpq0Var2.C.b;
                if (bwd0.d(extendedUserProfile)) {
                    UserProfile userProfile = extendedUserProfile.a;
                    if (userProfile.b0) {
                        FollowersModeState.a aVar5 = FollowersModeState.Companion;
                        Boolean valueOf = Boolean.valueOf(userProfile.a0);
                        aVar5.getClass();
                        a = FollowersModeState.a.a(valueOf);
                    } else {
                        a = FollowersModeState.UNAVAILABLE;
                    }
                    b4sVar.b(a);
                } else {
                    b4sVar.a();
                }
                if (!extendedUserProfile.K1) {
                    fpq0Var2.C(new UserProfileAction.i(extendedUserProfile));
                    fpq0Var2.C(new UserProfileAction.w.b(extendedUserProfile));
                }
                q7v0 q7v0Var = fpq0Var2.r;
                if (((Boolean) fpq0Var2.T.getValue()).booleanValue() && fpq0Var2.f.k && extendedUserProfile.a.a0) {
                    if (!q7v0Var.isReady()) {
                        q7v0Var.init();
                    }
                    q7v0Var.c(new dbj0(fpq0Var2, 9));
                }
                return s3q0.a;
            case 27:
                ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj2).e.invoke((c.s0.h) obj);
                return s3q0.a;
            case 28:
                return VideoEditTimelineView.P4((VideoEditTimelineView) obj2, (las) obj);
            default:
                UserId userId = (UserId) obj2;
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if (!(uIBlock instanceof UIBlockSearchAuthor)) {
                            if (uIBlock instanceof UIBlockButtons) {
                                UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
                                if (uIBlockButtons.Pb().isEmpty()) {
                                    continue;
                                } else {
                                    UIBlock uIBlock2 = (UIBlock) j5g.Y(uIBlockButtons.Pb());
                                    if ((uIBlock2 instanceof UIBlockActionFollow) && epx.f(uIBlock2.q(), userId)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ h440(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
