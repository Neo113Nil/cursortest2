package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.camera.editor.common.text.views.SnapScrollRecyclerView;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoOwner;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vk.superapp.api.dto.restore.VkRestoreInstantAuth;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.s;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a3v0;
import xsna.a7f0;
import xsna.gm50;
import xsna.zlw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xvl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xvl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        if (xsna.drm0.N(r4) == false) goto L47;
     */
    /* JADX WARN: Type inference failed for: r1v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        Owner a;
        List<CatalogSection> list;
        t2v0 t2v0Var;
        int i = 29;
        int i2 = 18;
        int i3 = 15;
        int i4 = 2;
        boolean z = true;
        r7 = null;
        t2v0 t2v0Var2 = null;
        int i5 = 0;
        switch (this.b) {
            case 0:
                yvl0 yvl0Var = (yvl0) this.c;
                ArrayList<StoriesContainer> arrayList = ((GetStoriesResponse) obj).c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    StoriesContainer storiesContainer = (StoriesContainer) obj3;
                    if ((storiesContainer instanceof DiscoverStoriesContainer) || (storiesContainer instanceof DiscoverStubStoriesContainer)) {
                        arrayList2.add(obj3);
                    }
                }
                lrl0 lrl0Var = yvl0Var.c;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    lrl0Var.c((StoriesContainer) it.next());
                }
                return s3q0.a;
            case 1:
                String b = go9.b("#", (String) obj);
                o0m0 o0m0Var = o0m0.b;
                return o0m0.c(b, true).l(new pi40(new d220(i2), 12));
            case 2:
                ((com.vk.stories.design.view.stats.tabs.stickers.mvi.b) this.c).T(new f.a.C1815a((Throwable) obj));
                return s3q0.a;
            case 3:
                uhm0 uhm0Var = ((com.vk.stories.design.view.stats.tabs.viewers.mvi.d) this.c).g;
                uhm0Var.k = (List) obj;
                uhm0Var.notifyItemRangeChanged(0, uhm0Var.j.size(), "payload_reactions_changed");
                return s3q0.a;
            case 4:
                gq2 gq2Var = (gq2) obj;
                ((wzs) this.c).invoke(((zak0) gq2Var.e).getValue(), rte0.e.b.invoke(gq2Var.f));
                return s3q0.a;
            case 5:
                return new TagsListState((List) this.c, null, TagsListState.State.LOADED, 2, null);
            case 6:
                TextStyleFontPicker textStyleFontPicker = (TextStyleFontPicker) this.c;
                int intValue = ((Integer) obj).intValue();
                SnapScrollRecyclerView snapScrollRecyclerView = textStyleFontPicker.c;
                snapScrollRecyclerView.e = true;
                RecyclerView.o layoutManager = snapScrollRecyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.smoothScrollToPosition(snapScrollRecyclerView, null, intValue);
                }
                textStyleFontPicker.f = intValue;
                return s3q0.a;
            case 7:
                lbq0 lbq0Var = (lbq0) this.c;
                Triple triple = (Triple) obj;
                UserId userId = (UserId) triple.d();
                Long l = (Long) triple.g();
                com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = (com.vk.ecomm.cart.impl.checkout.feature.state.f) triple.h();
                if (!lbq0Var.d) {
                    a7f0.a.f(lbq0Var.a, lbq0Var.b.a(userId, fVar, l, true), new kbq0(i5), new zsw(i), 1);
                }
                return s3q0.a;
            case 8:
                ((niq0) this.c).B.b(new ExternalEvent.a());
                return s3q0.a;
            case 9:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.profile.user.impl.ui.i iVar = userProfileFragment.Q;
                bwt0.p0((iVar != null ? iVar : null).l.b, booleanValue);
                return s3q0.a;
            case 10:
                isq0 isq0Var = (isq0) this.c;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.k(wallWithCounters), new ie40(new gsq0(isq0Var, i5), i2)).l(new je40(new hsq0(isq0Var, z), i3)), new rt10(new bl30(isq0Var, i), 20)).l(new qca0(new xd40(wallWithCounters, 28), 11));
            case 11:
                ((nrr0) this.c).l.k();
                return s3q0.a;
            case 12:
                VideoAlbumEditorFragment videoAlbumEditorFragment = (VideoAlbumEditorFragment) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                int i6 = VideoAlbumEditorFragment.l0;
                qgi0.h(tgi0Var, videoAlbumEditorFragment.getString(R.string.accessibility_done));
                qgi0.r(tgi0Var, "edit_done_button");
                qgi0.e(tgi0Var, null, new dgc0(i3));
                return s3q0.a;
            case 13:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                s.a aVar = (s.a) obj;
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.b, new m360(videoMinimizableDiscoveryFragment, 27));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.c, new cvs0(videoMinimizableDiscoveryFragment, i5));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.d, new dvs0(videoMinimizableDiscoveryFragment, i5));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.e, new evs0(videoMinimizableDiscoveryFragment, i5));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.a, new gqe0(videoMinimizableDiscoveryFragment, 21));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.f, new qjl0(videoMinimizableDiscoveryFragment, i3));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.g, new ece0(videoMinimizableDiscoveryFragment, 25));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.h, new dso0(videoMinimizableDiscoveryFragment, 16));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.i, new n7b0(videoMinimizableDiscoveryFragment, 24));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.j, new cdr0(i4, videoMinimizableDiscoveryFragment, aVar));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.k, new hsc0(videoMinimizableDiscoveryFragment, 26));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.l, new puo0(i4, videoMinimizableDiscoveryFragment, aVar));
                int i8 = 0;
                int i9 = 1;
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.m, new qp3(i9, (h31) videoMinimizableDiscoveryFragment.d1.getValue(), h31.class, "updateState", "updateState(Lcom/vk/video/ui/discovery/minimizable/ad/AdvertBannerFullscreenState;)V", i8, 6));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.n, new ic1(i9, (k31) videoMinimizableDiscoveryFragment.e1.getValue(), k31.class, "render", "render(Lcom/vk/libvideo/api/ad/AdvertBannerState;)V", i8, 11));
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    gm50.a.a(videoMinimizableDiscoveryFragment, aVar.o, new o1g(1, (ffs0) videoMinimizableDiscoveryFragment.V0.getValue(), ffs0.class, "handle", "handle(Lcom/vk/video/ui/discovery/minimizable/cast/VideoDiscoverySnackbarState;)V", 0, 8));
                }
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.p, new bvs0(videoMinimizableDiscoveryFragment, i5));
                gm50.a.a(videoMinimizableDiscoveryFragment, aVar.q, new vze(1, (e290) videoMinimizableDiscoveryFragment.h1.getValue(), e290.class, "updateState", "updateState(Lcom/vk/video/ui/discovery/minimizable/ad/OverlayBannerFullscreenState;)V", 0, 4));
                return s3q0.a;
            case 14:
                n4t0 n4t0Var = (n4t0) this.c;
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) pair.d();
                Optional optional = (Optional) pair.g();
                hda hdaVar = (hda) pair2.d();
                VideoOwner videoOwner = (VideoOwner) pair2.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj4 = hdaVar.a;
                CatalogExtendedData catalogExtendedData = hdaVar.b;
                CatalogCatalog catalogCatalog = obj4 instanceof CatalogCatalog ? (CatalogCatalog) obj4 : null;
                if (catalogCatalog != null && (list = catalogCatalog.b) != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        List<CatalogBlock> list2 = ((CatalogSection) it2.next()).i;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list2) {
                            if (((CatalogBlock) obj5).c == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS) {
                                arrayList3.add(obj5);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            CatalogBlock catalogBlock = (CatalogBlock) it3.next();
                            if (catalogBlock.i.b != CatalogViewType.INVISIBLE) {
                                linkedHashMap.putAll(n4t0.z0(catalogBlock, catalogExtendedData));
                            }
                        }
                    }
                }
                n4t0Var.I = j5g.O0(linkedHashMap.values());
                catalogExtendedData.zb(new CatalogExtendedData(null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 7, null));
                VideoFile videoFile = videoOwner.f;
                n4t0Var.J = videoFile;
                if (videoFile != null) {
                    UserProfile userProfile = videoOwner.g;
                    if (userProfile != null) {
                        a = userProfile.l0();
                    } else {
                        Group group = videoOwner.h;
                        a = group != null ? tsj.a(group) : null;
                    }
                    videoFile.f1(a);
                }
                Object obj6 = hdaVar.a;
                CatalogCatalog catalogCatalog2 = obj6 instanceof CatalogCatalog ? (CatalogCatalog) obj6 : null;
                if (catalogCatalog2 != null) {
                    Iterator<T> it4 = catalogCatalog2.b.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (epx.f(((CatalogSection) obj2).b, catalogCatalog2.c)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    CatalogSection catalogSection = (CatalogSection) obj2;
                    if (catalogSection != null) {
                        str = catalogSection.d;
                        n4t0Var.L = str;
                        n4t0Var.K = (VideoAlbum) optional.orElse(null);
                        return hdaVar;
                    }
                }
                str = null;
                n4t0Var.L = str;
                n4t0Var.K = (VideoAlbum) optional.orElse(null);
                return hdaVar;
            case 15:
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.c;
                videoSeekPreviewImage.A = false;
                videoSeekPreviewImage.setImageBitmap((Bitmap) obj);
                return s3q0.a;
            case 16:
                reu0 reu0Var = (reu0) this.c;
                if (reu0Var.g && !hg1.d(reu0Var.c)) {
                    reu0Var.d(true, true);
                }
                return s3q0.a;
            case 17:
                Intent intent = (Intent) obj;
                FragmentActivity activity = ((a0v0) this.c).getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                    activity.finish();
                }
                return s3q0.a;
            case 18:
                a3v0 a3v0Var = (a3v0) this.c;
                VkRestoreInstantAuth vkRestoreInstantAuth = (VkRestoreInstantAuth) obj;
                int i10 = a3v0.a.$EnumSwitchMapping$1[vkRestoreInstantAuth.d.ordinal()];
                if (i10 == 1) {
                    v2v0 v2v0Var = (v2v0) a3v0Var.a;
                    if (v2v0Var != null) {
                        v2v0Var.oa(VkLoginConfirmationStatusType.ALREADY_ALLOWED);
                    }
                } else if (i10 == 2) {
                    v2v0 v2v0Var2 = (v2v0) a3v0Var.a;
                    if (v2v0Var2 != null) {
                        v2v0Var2.oa(VkLoginConfirmationStatusType.ALREADY_DENIED);
                    }
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = a3v0Var.x;
                    String str2 = vkRestoreInstantAuth.a;
                    if (str2 != null) {
                        t2v0Var = new t2v0(context.getString(R.string.vk_login_confirmation_device), str2);
                        break;
                    }
                    t2v0Var = null;
                    String str3 = vkRestoreInstantAuth.c;
                    if (str3 != null) {
                        t2v0 t2v0Var3 = new t2v0(context.getString(R.string.vk_login_confirmation_place), str3);
                        if (!drm0.N(str3)) {
                            t2v0Var2 = t2v0Var3;
                        }
                    }
                    long longValue = vkRestoreInstantAuth.b.longValue();
                    String string = context.getString(R.string.vk_login_confirmation_time);
                    qvo0 qvo0Var = qvo0.a;
                    Resources resources = context.getResources();
                    qvo0Var.getClass();
                    List<t2v0> I = rl3.I(new t2v0[]{t2v0Var, t2v0Var2, new t2v0(string, cqm0.b(qvo0.h((int) longValue, resources, false)))});
                    v2v0 v2v0Var3 = (v2v0) a3v0Var.a;
                    if (v2v0Var3 != null) {
                        String str4 = vkRestoreInstantAuth.g;
                        String str5 = vkRestoreInstantAuth.f;
                        String str6 = vkRestoreInstantAuth.e;
                        if (str6 != null && !drm0.N(str6) && str5 != null && !drm0.N(str5)) {
                            str5 = v1v.a(' ', str6, str5);
                        } else if (str6 != null && !drm0.N(str6)) {
                            str5 = str6;
                        } else if (str5 == null) {
                            str5 = "";
                        }
                        v2v0Var3.Ee(str4, str5, vkRestoreInstantAuth.h);
                    }
                    v2v0 v2v0Var4 = (v2v0) a3v0Var.a;
                    if (v2v0Var4 != null) {
                        v2v0Var4.rf(I);
                    }
                }
                return s3q0.a;
            case 19:
                i0q0.f(new pvh0((Ref$ObjectRef) this.c, 22));
                return s3q0.a;
            case 20:
                ((lcw0) this.c).c.invoke();
                return s3q0.a;
            case 21:
                ylw0 ylw0Var = (ylw0) this.c;
                int i11 = ylw0.x1;
                if (!(((zlw0) obj) instanceof zlw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Dialog dialog = ylw0Var.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    nw20Var.cancel();
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 22:
                l5x0.this.c((Mask) obj);
                return s3q0.a;
            case 23:
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                iid iidVar = ((nvw0) this.c).c;
                List<VideoVideoFullDto> e = videoGetResponseDto.e();
                List<UsersUserFullDto> g = videoGetResponseDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                List<GroupsGroupFullDto> d = videoGetResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                return new u6x0(null, iidVar.f(e, g, d), videoGetResponseDto.getCount());
            case 24:
                v040 v040Var = (v040) this.c;
                NestedMsg nestedMsg = (NestedMsg) obj;
                if (nestedMsg.b == NestedMsg.Type.REPLY) {
                    v040Var.invoke(nestedMsg);
                }
                return s3q0.a;
            default:
                com.vk.channels.impl.comments.h hVar = (com.vk.channels.impl.comments.h) this.c;
                hVar.b.invoke((TextView) hVar.e.getValue());
                return s3q0.a;
        }
    }
}
