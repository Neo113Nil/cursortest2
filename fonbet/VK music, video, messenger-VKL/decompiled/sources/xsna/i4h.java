package xsna;

import android.widget.FrameLayout;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.file_picker.external.c;
import com.vk.file_picker.external.g;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.music.playlist.display.domain.h;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vk.profile.community.suggestions.impl.ui.suggestions.g;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.voip.dto.call_member.CallMember;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.acx;
import xsna.cwb0;
import xsna.gtb0;
import xsna.k840;
import xsna.nv90;
import xsna.rtb0;
import xsna.v1j;
import xsna.wk50;
import xsna.xaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i4h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        OrdAdInfo ordAdInfo;
        int i = this.b;
        int i2 = -1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((flu) obj2).invoke();
                return s3q0.a;
            case 1:
                dgh dghVar = (dgh) obj2;
                for (Pair pair : (List) obj) {
                    eed eedVar = (eed) pair.j();
                    if (eedVar instanceof ced) {
                        if (((ClipVideoFile) pair.i()).r == 0) {
                            dghVar.K(xaf.f.a);
                        }
                    } else if (eedVar instanceof ted) {
                        if (((ClipVideoFile) pair.i()).r == 0) {
                            dghVar.K(xaf.f.a);
                        } else {
                            dghVar.K(xaf.e.a);
                        }
                    }
                }
                return s3q0.a;
            case 2:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj2;
                com.vk.profile.community.impl.ui.profile.actions.d dVar = (com.vk.profile.community.impl.ui.profile.actions.d) obj;
                int i3 = CommunityProfileFragment.k0;
                if (communityProfileFragment.getActivity() == null) {
                    return s3q0.a;
                }
                com.vk.profile.community.impl.ui.profile.actions.e eVar = communityProfileFragment.T;
                if (eVar != null) {
                    eVar.d(dVar);
                }
                return s3q0.a;
            case 3:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj2;
                return ((kk6) obj).g(bwd0.i(extendedCommunityProfile), extendedCommunityProfile);
            case 4:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj2;
                ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) obj;
                String str = clipEditSdkItem.h;
                List<ClipCoauthorSdkItem> list = clipEditSdkItem.m;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (ClipCoauthorSdkItem clipCoauthorSdkItem : list) {
                    UserId userId = clipCoauthorSdkItem.b;
                    String str2 = clipCoauthorSdkItem.d;
                    CoOwnerItem.StatusDto statusDto = clipCoauthorSdkItem.f ? CoOwnerItem.StatusDto.APPROVED : CoOwnerItem.StatusDto.PENDING;
                    Serializer.c<Image> cVar = Image.CREATOR;
                    arrayList.add(new CoOwnerItem(userId, statusDto, new Owner(userId, clipCoauthorSdkItem.c, str2, null, null, Image.b.c(str2, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194264, null), clipCoauthorSdkItem.g, null));
                }
                ClipVideoFile Kb = ClipVideoFile.Kb(clipVideoFile, false, str, null, arrayList, null, null, null, 8353791);
                List<ImageUrl> list2 = clipEditSdkItem.i.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (ImageUrl imageUrl : list2) {
                    arrayList2.add(new ImageSize(imageUrl.b, imageUrl.f, (char) 0, false, 12, (zcl) null));
                }
                Kb.I0 = new Image(arrayList2);
                Kb.m = clipEditSdkItem.h;
                SdkClipOrdData sdkClipOrdData = clipEditSdkItem.k;
                if (sdkClipOrdData != null) {
                    String str3 = sdkClipOrdData.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = sdkClipOrdData.d;
                    ordAdInfo = new OrdAdInfo(str3, e43.m(str4 != null ? new OrdAdvertiser("", str4) : null));
                } else {
                    ordAdInfo = null;
                }
                Kb.d0 = ordAdInfo;
                ActionLink actionLink = clipVideoFile.Y;
                boolean f = epx.f(actionLink != null ? actionLink.c : null, "video");
                ClipEditAttachedVideo clipEditAttachedVideo = clipEditSdkItem.l;
                boolean z = clipEditAttachedVideo instanceof ClipEditAttachedVideo.Full;
                if (f || z) {
                    SdkActionLink sdkActionLink = z ? ((ClipEditAttachedVideo.Full) clipEditAttachedVideo).b : null;
                    Kb.Y = sdkActionLink != null ? x10.a(sdkActionLink) : null;
                }
                wjs0.a(new fyr0(Kb));
                return s3q0.a;
            case 5:
                com.vk.profile.community.suggestions.impl.ui.suggestions.g gVar = (com.vk.profile.community.suggestions.impl.ui.suggestions.g) obj2;
                CommunitySuggestionsViewState.LoadingState loadingState = (CommunitySuggestionsViewState.LoadingState) obj;
                int i4 = loadingState == null ? -1 : g.a.$EnumSwitchMapping$0[loadingState.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        gVar.h.e0();
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar.h.lb();
                    }
                }
                return s3q0.a;
            case 6:
                int i5 = CommunityWidgetPreviewFragment.U;
                ((CommunityWidgetPreviewFragment) obj2).io(3);
                return s3q0.a;
            case 7:
                ((u1j) obj2).v.invoke(v1j.p.b);
                return s3q0.a;
            case 8:
                d3j d3jVar = (d3j) obj2;
                ((p870) d3jVar.F.getValue()).e(128, d3jVar.q6());
                return s3q0.a;
            case 9:
                ((bzb0) ((y6k) obj2).Y0().e.getValue()).c(cwb0.t.e, new com.vk.movika.sdk.base.logic.processor.h((io.reactivex.rxjava3.disposables.c) obj, 27));
                return s3q0.a;
            case 10:
                ocl oclVar = (ocl) obj2;
                vqt vqtVar = (vqt) obj;
                oclVar.n = vqtVar.e;
                oclVar.o = vqtVar.d;
                oclVar.u(vqtVar);
                return s3q0.a;
            case 11:
                rtb0.a aVar = (rtb0.a) obj;
                asb0 asb0Var = ((gtb0.a) obj2).f;
                if (asb0Var != null) {
                    asb0Var.b0(aVar.a);
                }
                return s3q0.a;
            case 12:
                elm0 elm0Var = (elm0) obj2;
                if (elm0Var != null) {
                    elm0Var.finish();
                }
                return s3q0.a;
            case 13:
                yfn yfnVar = (yfn) obj2;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(h.a.C1349a.b.a, yfnVar.c));
                return s3q0.a;
            case 14:
                l1o l1oVar = (l1o) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                l1oVar.k.invoke(num);
                l1oVar.a(intValue);
                return s3q0.a;
            case 15:
                ((kzo) obj2).b.invoke(a.h.b);
                return s3q0.a;
            case 16:
                VideoFile videoFile = ((ftp) obj2).a;
                int b = an10.b(((Long) obj).longValue() / 1000.0f);
                if (b >= 0 && b <= videoFile.getDuration()) {
                    List<VideoEpisode> Y3 = videoFile.Y3();
                    Integer valueOf = Integer.valueOf(b);
                    int size = Y3.size();
                    e43.q(Y3.size(), size);
                    int i6 = size - 1;
                    while (true) {
                        if (r5 <= i6) {
                            int i7 = (r5 + i6) >>> 1;
                            int b2 = jw5.b(Integer.valueOf(Y3.get(i7).b), valueOf);
                            if (b2 < 0) {
                                r5 = i7 + 1;
                            } else if (b2 > 0) {
                                i6 = i7 - 1;
                            } else {
                                i2 = i7;
                            }
                        } else {
                            i2 = -(r5 + 1);
                        }
                    }
                    if (i2 < 0) {
                        i2 = (-i2) - 2;
                    }
                }
                return Integer.valueOf(i2);
            case 17:
                zbq zbqVar = (zbq) obj2;
                CharSequence charSequence = (CharSequence) obj;
                boolean z2 = zbqVar.e;
                nv90.a aVar2 = zbqVar.a;
                if (z2) {
                    return s3q0.a;
                }
                String obj3 = charSequence != null ? charSequence.toString() : null;
                String obj4 = drm0.p0(obj3 != null ? obj3 : "").toString();
                String str5 = myc0.f(obj4) ? obj4 : null;
                int i8 = str5 == null ? 1 : 0;
                VkPeopleSearchParams a = aVar2.a();
                r5 = a.h == null ? 1 : 0;
                a.h = str5;
                if (i8 != r5) {
                    aVar2.b(a);
                }
                return s3q0.a;
            case 18:
                com.vk.file_picker.external.b bVar = (com.vk.file_picker.external.b) obj2;
                com.vk.file_picker.external.g gVar2 = (com.vk.file_picker.external.g) obj;
                if (gVar2 instanceof g.a) {
                    bVar.T(new c.a(((g.a) gVar2).a));
                } else {
                    if (!(gVar2 instanceof g.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.T(new c.b(((g.b) gVar2).a));
                }
                return s3q0.a;
            case 19:
                h7d h7dVar = (h7d) obj2;
                return new qih0((List) obj, h7dVar.b, h7dVar.c, null, null);
            case 20:
                sxr sxrVar = (sxr) obj2;
                List list3 = (List) ((xpp) obj).a();
                return (list3 == null || !list3.isEmpty()) ? io.reactivex.rxjava3.internal.operators.completable.i.b : new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.r(sxrVar.a.C(sxrVar, new kqm(Collections.singletonList(FoldersSupportedType.CHANNELS))), new p7(new k0j(sxrVar, 13), 28)), new tt0(new jt(24), 19));
            case 21:
                ((i2s) obj2).h.a();
                return i2s.u(t2s.a((t2s) obj, EmptyList.b, false, jgp.b, null, false, null, null, true, 0, 362));
            case 22:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((fxt0) obj2).c).setValue(bool);
                return s3q0.a;
            case 23:
                qvs qvsVar = (qvs) obj2;
                uvs uvsVar = (uvs) obj;
                if (uvsVar instanceof nvf) {
                    qvsVar.s = ((nvf) uvsVar).a;
                    CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = qvsVar.k;
                    if (customisableBottomSheetBehavior != null) {
                        customisableBottomSheetBehavior.J(5);
                    }
                }
                return s3q0.a;
            case 24:
                ((wk50.a) obj2).b(new ClipItemPatch.d.a(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 25:
                PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) obj2;
                photoSmallAdapter.notifyItemChanged(photoSmallAdapter.K0() + ((Integer) obj).intValue(), Boolean.TRUE);
                return s3q0.a;
            case 26:
                jqt jqtVar = (jqt) obj2;
                List<CallMember> list4 = jqtVar.c;
                if (list4 != null) {
                    jqtVar.b.invoke(list4);
                    jqtVar.c = null;
                }
                return s3q0.a;
            case 27:
                io.reactivex.rxjava3.subjects.d<i8w> dVar2 = ((k8w) obj2).h;
                dVar2.onNext(i8w.a(dVar2.P0(), (Map) obj, null, null, 6));
                return s3q0.a;
            case 28:
                int i9 = ImSelectDonutContactsFragment.k0;
                ((ImSelectDonutContactsFragment) obj2).eo();
                return s3q0.a;
            default:
                ((whz) obj2).a(new acx.g(true, true, true));
                return s3q0.a;
        }
    }

    public /* synthetic */ i4h(dgh dghVar, Clips clips) {
        this.b = 1;
        this.c = dghVar;
    }
}
