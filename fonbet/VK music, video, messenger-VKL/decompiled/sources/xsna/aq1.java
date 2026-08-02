package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.comments.core.BoardComment;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.user.ImageStatus;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.info.InfoBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import com.vk.profile.design.view.profileheader.a;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.stories.design.view.ReactionView;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.bjw0;
import xsna.f0r;
import xsna.gm50;
import xsna.gy50;
import xsna.kq1;
import xsna.l1o;
import xsna.n3o;
import xsna.oxc0;
import xsna.p9v0;
import xsna.plc0;
import xsna.q3o;
import xsna.sl60;
import xsna.t3o;
import xsna.tlo0;
import xsna.uav;
import xsna.wk50;
import xsna.ywi0;
import xsna.zew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class aq1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aq1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v64, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.tlo0] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v9, types: [xsna.l490] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Owner s;
        str = "";
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        r7 = null;
        UserProfileAction bVar = null;
        switch (this.b) {
            case 0:
                cq1 cq1Var = (cq1) this.c;
                PhotoAlbum photoAlbum = (PhotoAlbum) this.d;
                f4z<kq1> f4zVar = cq1Var.k;
                tlo0.a aVar = tlo0.Companion;
                Object[] objArr = {photoAlbum.g};
                aVar.getClass();
                f4zVar.b(new kq1.e(new j7k0(tlo0.a.c(R.string.delete_album_dialog_error, objArr), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new j3(i2, cq1Var, photoAlbum), null, 32)));
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 1:
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) this.c;
                m4 m4Var = (m4) this.d;
                BoardComment boardComment = (BoardComment) obj;
                yh7 yh7Var = boardTopicViewFragment.r0;
                if (yh7Var != null) {
                    yh7Var.d(boardComment);
                }
                boardTopicViewFragment.B0 = false;
                m4Var.invoke();
                return s3q0.a;
            case 2:
                f69 f69Var = (f69) this.c;
                gy50.d dVar = (gy50.d) this.d;
                zew0.a aVar2 = zew0.k1;
                Context context = f69Var.a;
                uav.a aVar3 = dVar.a;
                zew0.a.b(aVar2, context, R.drawable.vk_icon_videocam_outline_28, R.attr.vk_ui_icon_accent, aVar3.a, aVar3.b, null, zew0.b.C4176b.b, new zew0.c(R.string.voip_grant_admin_to_dialog_negative_button), false, 288).Td((FragmentManager) obj, "");
                return s3q0.a;
            case 3:
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) this.c;
                bi9 bi9Var = (bi9) this.d;
                ta40 ta40Var = (ta40) obj;
                int i4 = ta40Var.c;
                StoryMusicInfo zb = StoryMusicInfo.zb(storyMusicInfo, null, i4, i4 + ((int) TimeUnit.MINUTES.toMillis(1L)), null, ta40Var.c, 8035);
                bi9Var.a.x4(zb);
                bi9Var.a(zb, ta40Var);
                return s3q0.a;
            case 4:
                return laa.s((laa) this.c, (String) this.d, (List) obj, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
            case 5:
                atd atdVar = (atd) this.c;
                ((v8f) atdVar.h.getValue()).c(atdVar.b.getContext(), (Throwable) obj, ((jdo) this.d).a, new yx0(atdVar, 27));
                return s3q0.a;
            case 6:
                gsh gshVar = (gsh) this.c;
                return Boolean.valueOf(((o2i) gshVar.c.j.getValue()).b(gshVar.a, bwd0.i((ExtendedCommunityProfile) this.d), (ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType) obj));
            case 7:
                yo9 yo9Var = (yo9) this.c;
                Good good = (Good) this.d;
                fy00 fy00Var = (fy00) yo9Var.d;
                long j = good.b;
                fy00Var.b(new iy00(good.c));
                hd60.a().w().e(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, new MarketAttachment(good));
                return s3q0.a;
            case 8:
                VkImage vkImage = (VkImage) obj;
                ((l1o.b) this.d).m.o0((String) ((l1o.a) this.c).b.invoke(Integer.valueOf(vkImage.getWidth()), Integer.valueOf(vkImage.getHeight())), null);
                return s3q0.a;
            case 9:
                n3o n3oVar = (n3o) this.c;
                String str2 = (String) this.d;
                TextValidationState textValidationState = (TextValidationState) obj;
                int i5 = textValidationState == null ? -1 : n3o.a.$EnumSwitchMapping$0[textValidationState.ordinal()];
                if (i5 == 1) {
                    n3oVar.T(q3o.e.b);
                } else if (i5 != 2) {
                    n3oVar.T(new q3o.d(tq.h(tlo0.Companion, R.string.post_teaser_validation_error_text)));
                } else {
                    n3oVar.f.b(new t3o.b(str2));
                }
                return s3q0.a;
            case 10:
                f0r.t tVar = (f0r.t) this.c;
                wk50.a aVar4 = (wk50.a) this.d;
                qih0 qih0Var = (qih0) obj;
                gbq gbqVar = tVar.d;
                f0r.k(tVar, aVar4, qih0Var, gbqVar != null ? new h0r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null, null, 4);
                return s3q0.a;
            case 11:
                String str3 = (String) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                oxc0.a aVar5 = (oxc0.a) obj;
                aVar5.getClass();
                cew cewVar = cew.b;
                aVar5.a = "im_prefs";
                aVar5.b = str3;
                ArrayList arrayList = aVar5.c;
                List<String> O0 = j5g.O0(sharedPreferences.getAll().keySet());
                ArrayList arrayList2 = new ArrayList(c5g.u(O0, 10));
                for (String str4 : O0) {
                    oxc0.b.a aVar6 = new oxc0.b.a();
                    aVar6.b = str4;
                    aVar6.a = str4;
                    arrayList2.add(aVar6.a());
                }
                arrayList.addAll(arrayList2);
                return aVar5;
            case 12:
                Uri uri = (Uri) this.c;
                Context context2 = (Context) this.d;
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                if (epx.f(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    mediaMetadataRetriever.setDataSource(context2, uri);
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        return s3q0.a;
                    }
                    mediaMetadataRetriever.setDataSource(path);
                }
                return s3q0.a;
            case 13:
                com.vk.ml.b bVar2 = (com.vk.ml.b) this.c;
                AccountModelDto accountModelDto = (AccountModelDto) this.d;
                Pair pair = (Pair) obj;
                String str5 = (String) pair.d();
                String str6 = (String) pair.g();
                if (str6.length() != 0) {
                    File file = new File(str6);
                    String C = com.vk.core.files.a.C(file);
                    str = C != null ? C : "";
                    vhk0.b(file);
                }
                String str7 = str;
                String g = accountModelDto.g();
                int i6 = accountModelDto.i();
                Integer f = accountModelDto.f();
                zb00 zb00Var = new zb00(i6, g, str5, str7, accountModelDto.d(), f != null ? f.intValue() : 0);
                j330 j330Var = bVar2.d;
                if (j330Var != null) {
                    return Long.valueOf(j330Var.a(zb00Var));
                }
                return null;
            case 14:
                ?? r1 = (NewsEntry) this.c;
                fw60 fw60Var = (fw60) this.d;
                sl60.a aVar7 = (sl60.a) obj;
                r1.d = true;
                String str8 = aVar7.d;
                fw60Var.getClass();
                r7 = r1 instanceof l490 ? (l490) r1 : 0;
                if (r7 != 0 && (s = r7.s()) != null) {
                    s.h = str8;
                }
                return new tl60(aVar7.a, aVar7.b, aVar7.c, aVar7.d, aVar7.e, true, ((r1 instanceof InfoBlock) || (r1 instanceof DzenArticlesBlock)) ? NewsfeedNewsfeedItemTypeDto.INFO_BLOCK : r1 instanceof Videos ? ((Videos) r1).Ea() ? NewsfeedNewsfeedItemTypeDto.CLIP : NewsfeedNewsfeedItemTypeDto.VIDEO : r1 instanceof Post ? ((Post) r1).gc() ? NewsfeedNewsfeedItemTypeDto.CLIP : NewsfeedNewsfeedItemTypeDto.POST : NewsfeedNewsfeedItemTypeDto.POST);
            case 15:
                li70 li70Var = (li70) this.c;
                Context context3 = (Context) this.d;
                NotificationEntity notificationEntity = (NotificationEntity) obj;
                c970 c970Var = li70Var.N;
                if (c970Var != null) {
                    c970.d(c970Var, context3, notificationEntity, null, 12);
                }
                li70Var.d("attachments");
                return s3q0.a;
            case 16:
                wu70 wu70Var = (wu70) this.c;
                UserId userId = (UserId) this.d;
                pzw pzwVar = (pzw) obj;
                pzwVar.a = new rm0(21, wu70Var, userId);
                pzwVar.c = new jz1(i, userId, wu70Var);
                return s3q0.a;
            case 17:
                jd80 jd80Var = (jd80) this.c;
                uk ukVar = (uk) this.d;
                ((Boolean) obj).getClass();
                jd80Var.a.r();
                ukVar.invoke();
                return s3q0.a;
            case 18:
                arg0 arg0Var = (arg0) this.c;
                lrg0 lrg0Var = (lrg0) this.d;
                Object d = ((Result) obj).d();
                Throwable a = Result.a(d);
                return a == null ? new io.reactivex.rxjava3.internal.operators.single.b(new zqg0(arg0Var, lrg0Var, (ReviewInfo) d)) : io.reactivex.rxjava3.core.x.i(arg0.a(a));
            case 19:
                mfi0 mfi0Var = (mfi0) this.c;
                rb80 rb80Var = (rb80) this.d;
                plc0.b bVar3 = (plc0.b) mfi0Var.m;
                if (bVar3 instanceof plc0.b.C3517b) {
                    String str9 = ((plc0.b.C3517b) bVar3).b;
                    rb80Var.b(mfi0Var.getAbsoluteAdapterPosition());
                } else if (bVar3 instanceof plc0.b.c) {
                    long j2 = ((plc0.b.c) bVar3).b;
                    rb80Var.f(mfi0Var.getAbsoluteAdapterPosition());
                } else {
                    if (!(bVar3 instanceof plc0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rb80Var.g();
                }
                return s3q0.a;
            case 20:
                gm50.a.a((vwi0) this.c, ((ywi0.d) obj).a, new gqe0((kxi0) this.d, i));
                return s3q0.a;
            case 21:
                c1j0 c1j0Var = (c1j0) this.c;
                c1j0Var.m.invoke((String) obj, ((MixCategory) this.d).b, Integer.valueOf(c1j0Var.getLayoutPosition()));
                return s3q0.a;
            case 22:
                ((aej0) this.c).E.a(((Integer) obj).intValue(), (ShitAttachment) this.d);
                return s3q0.a;
            case 23:
                VkSegmentedControl vkSegmentedControl = (VkSegmentedControl) this.c;
                xam0 xam0Var = (xam0) this.d;
                ReactionView reactionView = xam0Var.h;
                if (((Integer) obj).intValue() == 0) {
                    f4m.x(0, vkSegmentedControl.getIndicator());
                    reactionView.setBubbleBackground(ReactionView.Background.BLACK);
                    yam0 yam0Var = xam0Var.j;
                    if (yam0Var != null) {
                        yam0Var.e = true;
                    }
                } else {
                    f4m.x(cn70.b(8), vkSegmentedControl.getIndicator());
                    reactionView.setBubbleBackground(ReactionView.Background.WHITE);
                    yam0 yam0Var2 = xam0Var.j;
                    if (yam0Var2 != null) {
                        yam0Var2.e = false;
                    }
                }
                return s3q0.a;
            case 24:
                ((tem0) this.c).b.h((hyg0) obj, (uem0) this.d);
                return s3q0.a;
            case 25:
                UserProfileAdapterItem.MainInfo.c cVar = (UserProfileAdapterItem.MainInfo.c) this.c;
                vrq0 vrq0Var = (vrq0) this.d;
                com.vk.profile.design.view.profileheader.a aVar8 = (com.vk.profile.design.view.profileheader.a) obj;
                if (aVar8.equals(a.AbstractC1667a.C1668a.a)) {
                    bVar = UserProfileAction.s.d.a.b;
                } else if (aVar8.equals(a.AbstractC1667a.b.a)) {
                    bVar = UserProfileAction.s.d.b.b;
                } else if (aVar8.equals(a.AbstractC1667a.c.a)) {
                    bVar = UserProfileAction.s.d.c.b;
                } else if (aVar8.equals(a.AbstractC1667a.d.a)) {
                    bVar = UserProfileAction.s.d.C1697d.b;
                } else if (aVar8.equals(a.b.C1669a.a)) {
                    ImageStatus imageStatus = cVar.d;
                    if (imageStatus != null) {
                        bVar = new UserProfileAction.s.f.a(imageStatus);
                    }
                } else {
                    if (!aVar8.equals(a.b.C1670b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MusicTrack musicTrack = cVar.e;
                    if (musicTrack != null) {
                        bVar = new UserProfileAction.s.f.b(musicTrack);
                    }
                }
                if (bVar != null) {
                    vrq0Var.o.a(bVar);
                }
                return s3q0.a;
            case 26:
                ddr0 ddr0Var = (ddr0) this.c;
                ufu0 ufu0Var = (ufu0) this.d;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                fvv0 fvv0Var = ddr0Var.b;
                fvv0Var.C(webApiApplication);
                qxv0 qxv0Var = ddr0Var.a;
                FrameLayout c = qxv0Var.c();
                if (c != null) {
                    f4m.j(c);
                }
                ViewGroup d2 = qxv0Var.d();
                if (d2 != null) {
                    d2.setVisibility(0);
                }
                ufu0Var.invoke();
                mfu0 mfu0Var = ddr0Var.c;
                String str10 = webApiApplication.D;
                Map<String, String> j3 = fvv0Var.j();
                if (j3 == null) {
                    j3 = jgp.b;
                }
                mfu0Var.v(str10, j3, false);
                VkBridgeAnalytics E = fvv0Var.E();
                if (E != null) {
                    E.j(VkBridgeAnalytics.InstallScreenEvent.LAUNCH_APP);
                }
                return s3q0.a;
            case 27:
                ((LinksBridgeComponent) ((k7m) m7m.c((View) this.c)).a(fpf0.a(LinksBridgeComponent.class))).p().getBrowser().i(((glu0) this.d).requireContext(), Uri.parse((String) obj), LaunchContext.A, null);
                return s3q0.a;
            case 28:
                myc0.h((yvj) this.c, null, null, new p9v0.a((z4p0) obj, (wh50) this.d, null), 3);
                return s3q0.a;
            default:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) this.c;
                VoipCallServiceFragment.c cVar2 = (VoipCallServiceFragment.c) this.d;
                bjw0.b.a aVar9 = (bjw0.b.a) obj;
                int i7 = VoipCallServiceFragment.Y;
                VoipCallServiceFragment.c.a aVar10 = cVar2.b;
                f4m.j(aVar10.a);
                VkPlaceholder vkPlaceholder = aVar10.b;
                int i8 = 14;
                if (aVar9.a) {
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, (tlo0) r7), new VkPlaceholder.b.C0859b(i8, tq.h(tlo0.Companion, R.string.voip_vkapp_services_empty_search_description))));
                    VkPlaceholder.a.C0857a c0857a = null;
                    vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.voip_vkapp_services_empty_search_button), (gzs) new o8u0(voipCallServiceFragment, 5), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, (VkButton.Mode) null, (VkButton.Appearance) null, false, 476), c0857a, c0857a, false ? 1 : 0, 8));
                } else {
                    boolean z = aVar9.b;
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.voip_vkapp_services_empty_friends_sync_contacts_title)), new VkPlaceholder.b.C0859b(i8, new tlo0.f(R.string.voip_vkapp_services_empty_friends_sync_contacts_description))));
                    if (z) {
                        VkPlaceholder.a.C0857a c0857a2 = null;
                        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.voip_vkapp_services_empty_friends_sync_contacts_button), (gzs) new hbw0(voipCallServiceFragment, i3), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, (VkButton.Mode) null, (VkButton.Appearance) null, false, 476), c0857a2, c0857a2, false ? 1 : 0, 8));
                    } else {
                        vkPlaceholder.setBottom((VkPlaceholder.a) null);
                    }
                }
                return s3q0.a;
        }
    }
}
