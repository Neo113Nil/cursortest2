package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.api.generated.utils.dto.UtilsCheckScreenNameResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.ecomm.reviews.api.model.ReviewsModalBottomSheetArguments;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.czg;
import xsna.m6w;
import xsna.nxo;
import xsna.owg;
import xsna.r8k;
import xsna.t3d0;
import xsna.tlo0;
import xsna.ukl;
import xsna.v1j;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fre implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fre(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                nre nreVar = (nre) this.c;
                L.i((Throwable) obj);
                vve.e(nreVar.i, sve.a, false, false, 6);
                return s3q0.a;
            case 1:
                yse yseVar = (yse) this.c;
                L.i((Throwable) obj);
                yseVar.T(cte.b);
                return s3q0.a;
            case 2:
                l7s l7sVar = (l7s) this.c;
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (vKApiExecutionException != null) {
                    j03.i(l7sVar, vKApiExecutionException);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 3:
                ClipsPublishViewerOverlayFragment clipsPublishViewerOverlayFragment = (ClipsPublishViewerOverlayFragment) this.c;
                t3d0 t3d0Var = (t3d0) obj;
                qcy<Object>[] qcyVarArr = ClipsPublishViewerOverlayFragment.T;
                if (t3d0Var.equals(t3d0.a.a)) {
                    clipsPublishViewerOverlayFragment.finish();
                } else if (t3d0Var.equals(t3d0.b.a)) {
                    Intent intent = new Intent();
                    intent.putExtra("preview_result_key", 1);
                    s3q0 s3q0Var = s3q0.a;
                    clipsPublishViewerOverlayFragment.Mf(-1, intent);
                } else {
                    if (!t3d0Var.equals(t3d0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("preview_result_key", 2);
                    s3q0 s3q0Var2 = s3q0.a;
                    clipsPublishViewerOverlayFragment.Mf(-1, intent2);
                }
                return s3q0.a;
            case 4:
                r1f r1fVar = (r1f) this.c;
                List list = (List) obj;
                r1fVar.c.p();
                if (!list.isEmpty()) {
                    r1fVar.d.c(list);
                }
                r1fVar.c.j();
                return s3q0.a;
            case 5:
                s4f s4fVar = (s4f) this.c;
                vqt vqtVar = (vqt) obj;
                s4fVar.i.l(vqtVar.b);
                com.vk.lists.c cVar = s4fVar.i;
                String j = cVar.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 6:
                ((xhf) this.c).j((mbf) obj);
                return s3q0.a;
            case 7:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                Bitmap bitmap = (Bitmap) obj;
                communityAddressesFragment.j0 = bitmap;
                qrg qrgVar = communityAddressesFragment.t0;
                if (qrgVar != null) {
                    qrgVar.i(bitmap);
                }
                return s3q0.a;
            case 8:
                yvg yvgVar = (yvg) this.c;
                lvg lvgVar = (lvg) obj;
                mzp0 mzp0Var = yvgVar.j;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                yvgVar.T(new owg.a.c(lvgVar.a, lvgVar.b, lvgVar.c, yvgVar.h, lvgVar.d));
                return s3q0.a;
            case 9:
                ((yyg) this.c).T(new czg.b((n7k) obj));
                return s3q0.a;
            case 10:
                d2h d2hVar = (d2h) this.c;
                UtilsCheckScreenNameResponseDto utilsCheckScreenNameResponseDto = (UtilsCheckScreenNameResponseDto) obj;
                VkSimpleButton vkSimpleButton = d2hVar.o1;
                if (vkSimpleButton == null) {
                    vkSimpleButton = null;
                }
                vkSimpleButton.setEnabled(utilsCheckScreenNameResponseDto.e() == BaseBoolIntDto.YES);
                VkText vkText = d2hVar.l1;
                if (vkText == null) {
                    vkText = null;
                }
                BaseBoolIntDto e = utilsCheckScreenNameResponseDto.e();
                BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.NO;
                vkText.setVisibility(e == baseBoolIntDto ? 0 : 8);
                if (utilsCheckScreenNameResponseDto.e() == baseBoolIntDto) {
                    VkText vkText2 = d2hVar.l1;
                    VkText vkText3 = vkText2 != null ? vkText2 : null;
                    String d = utilsCheckScreenNameResponseDto.d();
                    if (d == null) {
                        d = d2hVar.requireContext().getString(R.string.error);
                    }
                    vkText3.setText(d);
                } else {
                    VkText vkText4 = d2hVar.l1;
                    (vkText4 != null ? vkText4 : null).setText("");
                }
                return s3q0.a;
            case 11:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = communityReviewsFragment.S;
                if (e2g0Var != null) {
                    e2g0Var.o(booleanValue);
                }
                return s3q0.a;
            case 12:
                g2i g2iVar = (g2i) this.c;
                GroupsGetSuggestionsResponseDto groupsGetSuggestionsResponseDto = (GroupsGetSuggestionsResponseDto) obj;
                List<GroupsSuggestionDto> d2 = groupsGetSuggestionsResponseDto.d();
                xe8 xe8Var = g2iVar.c;
                ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                for (GroupsSuggestionDto groupsSuggestionDto : d2) {
                    dqu dquVar = (dqu) xe8Var.b;
                    GroupsGroupFullDto d3 = groupsSuggestionDto.d();
                    dquVar.getClass();
                    arrayList.add(new i3i(dqu.a(d3), groupsSuggestionDto.r()));
                }
                return new f3i(groupsGetSuggestionsResponseDto.e(), arrayList);
            case 13:
                ((u1j) this.c).v.invoke(v1j.d.b);
                return s3q0.a;
            case 14:
                r8k r8kVar = (r8k) obj;
                z8k z8kVar = (z8k) ((CreateMarketItemReviewFragment) this.c).R.getValue();
                FragmentImpl fragmentImpl = z8kVar.a;
                if (r8kVar instanceof r8k.c) {
                    r8k.c cVar2 = (r8k.c) r8kVar;
                    tlo0.f fVar = cVar2.a;
                    Context requireContext = fragmentImpl.requireContext();
                    fVar.getClass();
                    CharSequence a = tlo0.b.a(fVar, requireContext);
                    String obj3 = a != null ? a.toString() : null;
                    CharSequence a2 = cVar2.b.a(fragmentImpl.requireContext());
                    new uig0(new ReviewsModalBottomSheetArguments(cVar2.c, obj3, a2 != null ? a2.toString() : null, null, cVar2.e, cVar2.f, cVar2.h, 8, null), new nm1(r3, z8kVar, cVar2)).a(fragmentImpl.requireContext());
                } else if (r8kVar instanceof r8k.b) {
                    int i = ((r8k.b) r8kVar).a;
                    Integer valueOf = Integer.valueOf(i);
                    Intent n = z8kVar.b.e().n(fragmentImpl.requireContext());
                    n.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                    n.putExtra("prevent_styling_photo", false);
                    n.putExtra("total_selection_limit", valueOf);
                    n.putExtra("attach_limit_hint", true);
                    n.putExtra("selection_limit", valueOf);
                    n.putExtra("single_mode", i == 1);
                    n.putExtra("image_format_restrictions", new ImageFormatRestrictions(null, Collections.singletonList(".gif"), 1, null));
                    fragmentImpl.startActivityForResult(n, 777);
                } else {
                    if (!(r8kVar instanceof r8k.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    maz.c(z8kVar.d, fragmentImpl.requireContext(), ((r8k.a) r8kVar).a, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 15:
                qgi0.h((tgi0) obj, (String) ((Pair) this.c).i());
                return s3q0.a;
            case 16:
                Throwable th = (Throwable) obj;
                ukl.a aVar = ((ukl) this.c).a;
                if (aVar != null) {
                    aVar.d(th, null);
                }
                return s3q0.a;
            case 17:
                ((b7) this.c).invoke(((qtd0) obj).B7());
                return s3q0.a;
            case 18:
                e4n.this.f.b.f(new vxf0());
                return s3q0.a;
            case 19:
                return Boolean.valueOf(epx.f(((VideoDiscoverGridItem) obj).j.k.r1(), ((dyr0) ((bwr0) this.c)).a.r1()));
            case 20:
                ((mxo) this.c).T(new nxo.b.C3423b());
                return s3q0.a;
            case 21:
                bcq bcqVar = (bcq) this.c;
                Pair pair = (Pair) obj;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) pair.d();
                OwnersGetContentTabsResponseDto ownersGetContentTabsResponseDto = (OwnersGetContentTabsResponseDto) pair.g();
                if (epx.f(o25.a().c(), extendedCommunityProfile.a.c)) {
                    bcqVar.b = extendedCommunityProfile;
                } else {
                    bcqVar.c.put(extendedCommunityProfile.a.c, extendedCommunityProfile);
                }
                if (ownersGetContentTabsResponseDto != null) {
                    bcqVar.e.put(extendedCommunityProfile.a.c, ownersGetContentTabsResponseDto);
                }
                return s3q0.a;
            case 22:
                SdkVideoFile sdkVideoFile = (SdkVideoFile) this.c;
                SdkVideoFile sdkVideoFile2 = (SdkVideoFile) obj;
                if ((sdkVideoFile2 instanceof SdkClipVideoFile) && (sdkVideoFile instanceof SdkClipVideoFile)) {
                    SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) sdkVideoFile2;
                    Integer n7 = sdkClipVideoFile.n7();
                    if (n7 == null) {
                        n7 = ((SdkClipVideoFile) sdkVideoFile).n7();
                    }
                    List<SdkCoOwnerItem> P1 = sdkClipVideoFile.P1();
                    int e2 = on00.e(c5g.u(P1, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                    for (SdkCoOwnerItem sdkCoOwnerItem : P1) {
                        Integer num = sdkCoOwnerItem.f;
                        UserId userId = sdkCoOwnerItem.b;
                        if (num == null) {
                            Iterator<T> it = ((SdkClipVideoFile) sdkVideoFile).P1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (userId.equals(((SdkCoOwnerItem) obj2).b)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            SdkCoOwnerItem sdkCoOwnerItem2 = (SdkCoOwnerItem) obj2;
                            num = sdkCoOwnerItem2 != null ? sdkCoOwnerItem2.f : null;
                        }
                        Pair pair2 = new Pair(userId, num);
                        linkedHashMap.put(pair2.i(), pair2.j());
                    }
                    SdkClipVideoFile sdkClipVideoFile2 = (SdkClipVideoFile) sdkVideoFile;
                    sdkVideoFile2 = sdkClipVideoFile.c2(n7, linkedHashMap, sdkClipVideoFile2.f6(), sdkClipVideoFile2.R0());
                }
                sdkVideoFile2.o7(sdkVideoFile);
                Boolean Q = sdkVideoFile.Q();
                if (Q != null) {
                    sdkVideoFile2.xa(Q.booleanValue());
                }
                return sdkVideoFile2;
            case 23:
                bsr bsrVar = (bsr) this.c;
                if (((Boolean) obj).booleanValue()) {
                    d3m.e(bsrVar.i, (r15 & 1) != 0 ? 300L : bsrVar.g, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                } else {
                    d3m.c(bsrVar.i, (r15 & 1) != 0 ? 300L : bsrVar.f, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 24:
                return new zxr((ViewGroup) obj, ((txr) this.c).j);
            case 25:
                v1z v1zVar = (v1z) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) v1zVar.c).setValue(bool);
                return s3q0.a;
            case 26:
                ((s3t) this.c).d.invoke((List) obj);
                return s3q0.a;
            case 27:
                ((uhu) this.c).X0((x89.a) obj);
                return s3q0.a;
            case 28:
                ((rzq0) obj).b(new wow((List) this.c), uzp.b);
                return s3q0.a;
            default:
                ((d7w) this.c).e(new m6w.e((p8w) obj));
                return s3q0.a;
        }
    }
}
