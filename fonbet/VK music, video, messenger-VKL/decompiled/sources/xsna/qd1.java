package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.StickersPacksChunk;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.folders.impl.configure.d;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.masks.MasksController;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.VideoAlbumData;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.afo;
import xsna.bmt;
import xsna.ctb0;
import xsna.efc0;
import xsna.fmc0;
import xsna.gm50;
import xsna.h2g0;
import xsna.kyh;
import xsna.px9;
import xsna.r1r0;
import xsna.tba0;
import xsna.td30;
import xsna.wbu0;
import xsna.weo;
import xsna.wiw;
import xsna.wk50;
import xsna.xg10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qd1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qd1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29, types: [android.view.ViewGroup, xsna.ype0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterable iterable;
        int i = this.b;
        int i2 = 0;
        r3 = null;
        String str = null;
        int i3 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                VideoAlbumData videoAlbumData = (VideoAlbumData) obj2;
                AlbumChooseState albumChooseState = (AlbumChooseState) obj;
                List<VideoAlbumData> list = albumChooseState.b;
                List<VideoAlbumData> list2 = list;
                Integer j = p4g.j((VideoAlbumData) obj3, list2);
                List<VideoAlbumData> list3 = list;
                if (j != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.set(j.intValue(), videoAlbumData);
                    list3 = arrayList;
                }
                return AlbumChooseState.a(albumChooseState, list3, null, 0, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            case 1:
                nu1 nu1Var = (nu1) obj3;
                int i4 = nu1.n1;
                gm50.a.a(nu1Var, ((ctb0.a) obj).a, new mu1(i2, nu1Var, (ArrayList) obj2));
                return s3q0.a;
            case 2:
                GetGeodata$Parameters getGeodata$Parameters = (GetGeodata$Parameters) obj2;
                ((mg6) obj3).j(getGeodata$Parameters != null ? getGeodata$Parameters.c() : null);
                return s3q0.a;
            case 3:
                ((ds8) obj3).T6((ButtonsFeedback) obj2);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 4:
                b.d dVar = (b.d) obj;
                dVar.b((String) obj3, "camera_position");
                Integer num = ((am9) obj2).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 5:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj2;
                s1r0 s1r0Var = ((yp9) obj3).f;
                List singletonList = Collections.singletonList(requestUserProfile.c);
                String str2 = requestUserProfile.t0;
                return rsg0.T(yfb.x(r1r0.a.b(s1r0Var, singletonList, e43.l(UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.IS_FRIEND, UsersFieldsDto.FRIEND_STATUS), null, str2 != null ? Collections.singletonList(str2) : null, 42)));
            case 6:
                return new sfd((com.vk.movika.sdk.base.observable.q) obj3, (tb) obj2, (ViewGroup) obj);
            case 7:
                ((ClipsGridDraftsListFragment) obj3).k0.B0((tce) obj2);
                return s3q0.a;
            case 8:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) obj2, false);
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) obj3).c.b(kyh.a.d.a);
                return s3q0.a;
            case 9:
                jwh jwhVar = (jwh) obj3;
                jwhVar.Z(false, (vwh) obj2);
                jwhVar.k.b(new h2g0.f(zwp.a((Throwable) obj)));
                return s3q0.a;
            case 10:
                final wck wckVar = (wck) obj3;
                final tck tckVar = (tck) obj2;
                io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k(s3q0.a);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return ((awg0) obj).g(k.g(300L), new rv(i3, wckVar, tckVar), new io.reactivex.rxjava3.functions.f() { // from class: xsna.vck
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj4) {
                        wck.this.c(tckVar);
                    }
                });
            case 11:
                k9m k9mVar = (k9m) obj3;
                DialogMember dialogMember = (DialogMember) obj2;
                hpm e = ((xgl0) obj).b().e();
                w2w w2wVar = k9mVar.c;
                long j2 = k9mVar.d;
                if (epx.f(w2wVar.H0(), dialogMember.b)) {
                    e.e0(j2);
                    e.g0(j2);
                } else {
                    e.k(j2, dialogMember);
                    e.W(1, j2);
                }
                e.v(0, j2);
                return s3q0.a;
            case 12:
                PostingAction.Init.LoadLocalDraft loadLocalDraft = (PostingAction.Init.LoadLocalDraft) obj2;
                PostEditableData postEditableData = (PostEditableData) obj;
                efc0.a aVar = ((hdo) obj3).a;
                AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData.q;
                FileDto fileDto = postEditableData.m;
                pjc0 pjc0Var = new pjc0(PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AdditionalSettingsConfiguration.a(additionalSettingsConfiguration == null ? new AdditionalSettingsConfiguration(false, false, false, null, false, 31, null) : additionalSettingsConfiguration, false, false, false, null, loadLocalDraft.d, 15), null, null, null, null, null, null, false, null, 268402687));
                aVar.getClass();
                aVar.a(pjc0Var);
                aVar.e(new fmc0.b(new ezw(null, postEditableData.c, PostingMediaEntryPoint.Default)));
                aVar.d(PostingAction.Fetch.LoadPermissions.b);
                if (fileDto != null && fileDto.I4().e()) {
                    aVar.d(new PostingAction.Upload.UploadStart(fileDto));
                }
                for (PostingAttachment postingAttachment : postEditableData.p) {
                    if (postingAttachment instanceof UploadDto) {
                        UploadDto uploadDto = (UploadDto) postingAttachment;
                        if (uploadDto.I4().e()) {
                            aVar.d(new PostingAction.Upload.UploadStart(uploadDto));
                        }
                    }
                }
                return s3q0.a;
            case 13:
                afo.a aVar2 = (afo.a) obj3;
                izs izsVar = (izs) obj2;
                nvy nvyVar = (nvy) obj;
                ArrayList arrayList2 = aVar2.b;
                nvyVar.e(arrayList2.size(), new weo.d(new hkb(3), arrayList2), new weo.e(arrayList2), new jai(2039820996, new weo.f(arrayList2, izsVar), true));
                if (aVar2.d) {
                    nvy.g(nvyVar, null, null, hfi.a, 3);
                }
                if (aVar2.e) {
                    nvy.g(nvyVar, null, null, new jai(1448575844, new hrg(izsVar, i3), true), 3);
                }
                return s3q0.a;
            case 14:
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) obj3;
                List list4 = (List) obj2;
                ayr ayrVar = (ayr) obj;
                return ayr.a(ayrVar, d.a.a(ayrVar.e, ayrVar.f, ayrVar.i, ayrVar.h, ayrVar.a, null, null, ayrVar.d, com.vk.folders.impl.configure.b.a(dVar2.h), list4, dVar2.m, dVar2.p), false, false, null, null, null, list4, null, null, null, false, 16318);
            case 15:
                return new bmt.a((blt) obj3, ((Boolean) obj2).booleanValue(), (klk) obj);
            case 16:
                ((Integer) obj).getClass();
                ((izs) obj3).invoke(new wiw.c(((ImageGalleryItem.ImageGalleryImageItem) ((ImageGalleryItem) obj2)).b));
                return s3q0.a;
            case 17:
                hry hryVar = (hry) obj3;
                gry gryVar = (gry) obj2;
                int intValue = ((Integer) obj).intValue();
                int e2 = hryVar.f.e(intValue);
                return gryVar.w0(intValue, 0, e2, gryVar.f, hryVar.a(0, e2));
            case 18:
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) obj3;
                nw20 nw20Var = (nw20) obj2;
                Collection<UserId> collection = legoStickersBottomSheetDialog.U.b;
                if (collection == null || (iterable = j5g.O0(collection)) == null) {
                    iterable = EmptyList.b;
                }
                String str3 = legoStickersBottomSheetDialog.X;
                if (str3 == null) {
                    str3 = "pack_details";
                }
                String str4 = str3;
                zal0 a = g2v.d().a();
                Context context = nw20Var.getContext();
                Iterable iterable2 = iterable;
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((UserId) it.next()).b));
                }
                a.u(context, true, arrayList3, legoStickersBottomSheetDialog.V, str4);
                return s3q0.a;
            case 19:
                yh10 yh10Var = (yh10) obj3;
                xg10.a aVar3 = (xg10.a) obj2;
                Mask mask = yh10Var.z;
                if (mask == null) {
                    mask = null;
                }
                if (MasksController.f().g >= mask.Cb()) {
                    Mask mask2 = yh10Var.z;
                    aVar3.c((mask2 == null ? null : mask2).h, mask2 != null ? mask2 : null);
                }
                return s3q0.a;
            case 20:
                yv20 yv20Var = (yv20) obj2;
                StickersPacksChunk stickersPacksChunk = (StickersPacksChunk) obj;
                ((com.vk.lists.c) obj3).s(stickersPacksChunk.c);
                yv20Var.c.n0(stickersPacksChunk.b);
                yv20Var.d = null;
                return s3q0.a;
            case 21:
                int i5 = ModalPostRepostsTabFragment.Y;
                ((ModalPostRepostsTabFragment) obj3).fo((List) obj, epx.f(((b.d) obj2).e.a(), Boolean.TRUE));
                return s3q0.a;
            case 22:
                return new td30.a((izs) obj3, (yd30) obj2);
            case 23:
                Playlist playlist = (Playlist) obj3;
                vh40 vh40Var = (vh40) obj2;
                Playlist zb = Playlist.zb(playlist, null, null, (List) obj, null, -8388609, 255);
                sg40 sg40Var = vh40Var.c;
                sg40Var.f.c(o25.a().c(), sg40Var.m.b(playlist));
                sg40Var.a.N(playlist);
                return vh40Var.d.V(o25.a().c(), zb);
            case 24:
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("SELECT manifest_url FROM audio_track WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str5);
                    V0.D3(2, str6);
                    if (V0.step() && !V0.isNull(0)) {
                        str = V0.l2(0);
                    }
                    return str;
                } finally {
                    V0.close();
                }
            case 25:
                xd80 xd80Var = (xd80) obj3;
                xd80Var.l.d(((OnboardingStep) obj2).g, xd80.w, xd80Var);
                return s3q0.a;
            case 26:
                int i6 = ri80.n1;
                gm50.a.a((ri80) obj3, ((ctb0.a) obj).a, new bgy((ViewGroup) obj2));
                return s3q0.a;
            case 27:
                c4a0 c4a0Var = (c4a0) obj3;
                PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = (PhoneValidationContract$ValidationDialogMetaInfo) obj2;
                c4a0Var.c.invoke(VkPhoneValidationErrorReason.API);
                c4a0Var.e.a(new q090(com.vk.registration.funnels.b.a, 1));
                wbu0.a a2 = wbu0.a(c4a0Var.f, (Throwable) obj, true);
                k4a0 k4a0Var = c4a0Var.d;
                k4a0 k4a0Var2 = k4a0Var != null ? k4a0Var : null;
                String str7 = a2.a;
                k4a0Var2.getClass();
                k4a0Var2.a(str7, new n9(22, k4a0Var2, phoneValidationContract$ValidationDialogMetaInfo));
                return s3q0.a;
            case 28:
                ((izs) obj3).invoke(((tba0.b) ((bca0) obj2).m).a);
                return s3q0.a;
            default:
                ((wk50.a) obj3).b(new px9.i.c((a.C0919a) obj2, (adp0) obj));
                return s3q0.a;
        }
    }

    public /* synthetic */ qd1(td1 td1Var, VideoAlbumData videoAlbumData, VideoAlbumData videoAlbumData2) {
        this.b = 0;
        this.c = videoAlbumData;
        this.d = videoAlbumData2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qd1(ri80 ri80Var, ype0 ype0Var) {
        this.b = 26;
        this.c = ri80Var;
        this.d = (ViewGroup) ype0Var;
    }
}
