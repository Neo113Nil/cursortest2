package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListShowAllVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.channels.impl.channel_screen.footer.b;
import com.vk.channels.impl.channel_screen.footer.k;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.design.view.LoadProgressView;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.utils.resulter.ActivityResultType;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItemId;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.ea7;
import xsna.gm50;
import xsna.lbf;
import xsna.q22;
import xsna.qn60;
import xsna.r7r;
import xsna.t0d;
import xsna.u4a;
import xsna.v1j;
import xsna.wwh;
import xsna.yls;
import xsna.ypf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x05c9, code lost:
    
        if (r1 != null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019d, code lost:
    
        if (r4 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        Object parcelableExtra;
        Iterable iterable;
        Object obj3;
        Object parcelableExtra2;
        ClickableSticker clickableSticker;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        Object obj4;
        ClickableStickers clickableStickers2;
        List<ClickableSticker> list2;
        Object obj5;
        ClickableStickers clickableStickers3;
        List<ClickableSticker> list3;
        Object obj6;
        String str2;
        int i = 4;
        int i2 = 2;
        int i3 = 1;
        int i4 = 3;
        int i5 = 0;
        r8 = null;
        r8 = null;
        ClickableSticker clickableSticker2 = null;
        switch (this.b) {
            case 0:
                x.b bVar = (x.b) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                Context h = e3m.h(bVar.itemView.getContext());
                if (h == null && (h = g2u0.c(bVar.itemView)) == null) {
                    h = bVar.itemView.getContext();
                }
                ydt0.f(fxc0.B().Y(), h, videoFile, null, null, null, 28);
                return s3q0.a;
            case 1:
                com.vk.catalog2.common.ui.mvp.auto.a aVar = (com.vk.catalog2.common.ui.mvp.auto.a) this.c;
                q22.b bVar2 = (q22.b) this.d;
                List list4 = (List) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(list4);
                bn40.f("Curator's popular successfully loaded");
                aVar.f(bVar2.d, musicTrack, list4, bVar2.c, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, ShuffleMode.SHUFFLE_AUTO);
                return s3q0.a;
            case 2:
                return ((st2) this.c).z.a((Context) this.d, (String) obj);
            case 3:
                ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) this.c;
                artistBiographyVh.N6((UIBlockArtistBio) this.d);
                artistBiographyVh.b(false);
                return s3q0.a;
            case 4:
                izs izsVar = (izs) this.c;
                Object obj7 = ((ip5) this.d).l;
                izsVar.invoke(((gp5) (obj7 != null ? obj7 : null)).a);
                return s3q0.a;
            case 5:
                String str3 = (String) this.c;
                w89 w89Var = (w89) this.d;
                dz2 x = yfb.x(sg20.q((sg20) obj, str3, null, null, 30));
                x.c = true;
                return rsg0.w0(x).l(new v34(new fk2(i3, str3, w89Var), i));
            case 6:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                un9 un9Var = (un9) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                float f = CameraUIView.w1;
                if (!booleanValue) {
                    cameraUIView.post(new id(un9Var, 3));
                }
                return s3q0.a;
            case 7:
                ((com.vk.channels.impl.channel_screen.footer.i) this.c).O(new b.c(((k.d) this.d).a.a));
                return s3q0.a;
            case 8:
                ttb ttbVar = (ttb) this.c;
                qtd0 qtd0Var = (qtd0) this.d;
                bzb0 bzb0Var = (bzb0) ttbVar.p.getValue();
                Context context = ttbVar.b.getContext();
                if (qtd0Var == null || (str = qtd0Var.name()) == null) {
                    str = "…";
                }
                bzb0.d(bzb0Var, new cwb0.u(0, null, 0, context.getString(R.string.vkim_popup_chat_request_decline_submit_desc, str), 0, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_popup_chat_request_decline_submit_yes)), 0, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_popup_chat_request_decline_submit_no)), null, null, 855), new com.vk.movika.sdk.base.ui.g(ttbVar, 22), new m1(ttbVar, 16), null, 24);
                return s3q0.a;
            case 9:
                h420 c = ((l3n0) ((u5f) this.c).a).c((f420) obj, e3m.a(R.dimen.clips_suggestions_block_height, ((mqd) this.d).getContext()));
                c.n = 3.5f;
                return c;
            case 10:
                lbf.b.d dVar = lbf.b.d.b;
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.c;
                hjf hjfVar = (hjf) this.d;
                eb0 eb0Var = (eb0) obj;
                String str4 = ClipsUploadFragmentImpl.a0;
                ActivityResultType activityResultType = eb0Var.a;
                Intent intent = eb0Var.c;
                int i6 = eb0Var.b;
                int i7 = ClipsUploadFragmentImpl.e.$EnumSwitchMapping$0[activityResultType.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                ((pef) clipsUploadFragmentImpl.W.getValue()).getClass();
                                lbf.a.j.C3247a c3247a = lbf.a.j.C3247a.b;
                                if (i6 == -1) {
                                    ClipUploadData clipUploadData = intent != null ? (ClipUploadData) intent.getParcelableExtra("result_upload_data") : null;
                                    if (clipUploadData != null) {
                                        hjfVar.b(new lbf.a.j.b(clipUploadData));
                                    } else {
                                        hjfVar.b(c3247a);
                                    }
                                } else if (intent == null || !intent.getBooleanExtra("exit_creation_flow", false)) {
                                    hjfVar.b(c3247a);
                                } else {
                                    hjfVar.b(dVar);
                                }
                            } else {
                                if (i7 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (i6 == -1 && intent != null) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        parcelableExtra2 = intent.getParcelableExtra("clip_preview_edit_result_key", ClipsChoosePreviewResult.class);
                                        obj3 = (Parcelable) parcelableExtra2;
                                    } else {
                                        Object parcelableExtra3 = intent.getParcelableExtra("clip_preview_edit_result_key");
                                        obj3 = (ClipsChoosePreviewResult) (parcelableExtra3 instanceof ClipsChoosePreviewResult ? parcelableExtra3 : null);
                                    }
                                    ClipsChoosePreviewResult clipsChoosePreviewResult = (ClipsChoosePreviewResult) obj3;
                                    if (clipsChoosePreviewResult != null) {
                                        hjfVar.b(new lbf.a.b(clipsChoosePreviewResult));
                                    }
                                }
                            }
                        } else if (i6 == -1) {
                            if (intent != null) {
                                ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("extra_configure_item_list_selected_goods_key", ConfigureItem.class) : intent.getParcelableArrayListExtra("extra_configure_item_list_selected_goods_key");
                                if (parcelableArrayListExtra != null) {
                                    iterable = j5g.O0(parcelableArrayListExtra);
                                    break;
                                }
                            }
                            iterable = EmptyList.b;
                            Iterable<ConfigureItem> iterable2 = iterable;
                            ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                            for (ConfigureItem configureItem : iterable2) {
                                ConfigureItemId configureItemId = configureItem.b;
                                long j = configureItemId.b;
                                UserId userId = configureItemId.c;
                                String str5 = configureItem.c;
                                Currency currency = new Currency(i5, "", "");
                                ConfigureItem.ProductPrice productPrice = configureItem.d;
                                Price price = new Price(0L, 0L, currency, productPrice.b, productPrice.c, productPrice.e, "", productPrice.d, null, 256, null);
                                Image image = configureItem.e;
                                int i8 = configureItem.f ? 0 : i2;
                                ConfigureItem.Rating rating = configureItem.k;
                                MarketItemRating marketItemRating = rating != null ? new MarketItemRating(rating.b, rating.c, rating.d) : null;
                                boolean z = configureItem.g;
                                String str6 = configureItem.h;
                                ConfigureItem.Owner owner = configureItem.j;
                                Owner owner2 = owner != null ? new Owner(owner.b, owner.c, null, null, new VerifyInfo(owner.d, false, false, false, false, false, 62, null), null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194284, null) : null;
                                String str7 = configureItem.i;
                                ConfigureItem.Moderation moderation = configureItem.l;
                                arrayList.add(new Good(j, userId, str5, null, null, price, 0, null, 0, null, false, image, 0, i8, null, null, marketItemRating, null, null, null, null, 0, 0, null, null, false, false, false, 0, 0, null, 0, 0, z, str6, null, owner2, null, null, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, false, null, null, 0, 0, null, null, null, str7, null, null, moderation.c, moderation.b, moderation.d, null, null, null, null, null, null, null));
                                i2 = 2;
                                i5 = 0;
                            }
                            hjfVar.b(new lbf.c.l.b(arrayList));
                        }
                    } else if (i6 == -1 && intent != null) {
                        int intExtra = intent.getIntExtra("preview_result_key", -1);
                        if (intExtra == 1) {
                            hjfVar.b(dVar);
                        } else if (intExtra == 2) {
                            hjfVar.b(lbf.b.f.b);
                        }
                    }
                } else if (i6 == -1 && intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("clips_video_attachment_result", ClipsVideoAttachmentData.class);
                        obj2 = (Parcelable) parcelableExtra;
                    } else {
                        Object parcelableExtra4 = intent.getParcelableExtra("clips_video_attachment_result");
                        obj2 = (ClipsVideoAttachmentData) (!(parcelableExtra4 instanceof ClipsVideoAttachmentData) ? null : parcelableExtra4);
                    }
                    ClipsVideoAttachmentData clipsVideoAttachmentData = (ClipsVideoAttachmentData) obj2;
                    if (clipsVideoAttachmentData != null) {
                        hjfVar.b(new lbf.c.v.C3257c(clipsVideoAttachmentData));
                    }
                }
                return s3q0.a;
            case 11:
                ypf ypfVar = (ypf) this.c;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                wuf wufVar = (wuf) obj;
                int i9 = ClipsWrapperFragment.Q0;
                boolean z2 = ypfVar instanceof ypf.d;
                if (z2 || (ypfVar instanceof ypf.b)) {
                    ((LoadProgressView) wufVar.o().a()).setOnCancelClick(new oo(clipsWrapperFragment, 24));
                }
                xpf xpfVar = clipsWrapperFragment.y0;
                c1u0 o = wufVar.o();
                xpfVar.getClass();
                if (z2) {
                    ((LoadProgressView) o.a()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    d3m.c(o.a(), (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    if (!(ypfVar instanceof ypf.b)) {
                        if (!(ypfVar instanceof ypf.a)) {
                            if (!ypfVar.equals(ypf.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ypf ypfVar2 = xpfVar.a;
                            if (ypfVar2 != null && !ypfVar2.equals(ypfVar)) {
                                ((LoadProgressView) o.a()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                d3m.e(o.a(), (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                            }
                            return s3q0.a;
                        }
                        ypf ypfVar3 = xpfVar.a;
                        if (ypfVar3 != null && !ypfVar3.equals(ypfVar)) {
                            ((LoadProgressView) o.a()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            d3m.e(o.a(), (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                            int i10 = ClipsWrapperFragment.Q0;
                            ClipFeedListFragment lo = clipsWrapperFragment.lo();
                            if (lo != null) {
                                hwc hwcVar = (hwc) lo.s0.getValue();
                                if (hwcVar.b()) {
                                    SdkExternalNpsCondition sdkExternalNpsCondition = SdkExternalNpsCondition.CLIP_DOWNLOADED;
                                    if (hwcVar.b.d(sdkExternalNpsCondition)) {
                                        hwcVar.a.c(sdkExternalNpsCondition);
                                    }
                                }
                            }
                            s3q0 s3q0Var = s3q0.a;
                        }
                        return s3q0.a;
                    }
                    if (o.a().getVisibility() != 0) {
                        d3m.c(o.a(), (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ((LoadProgressView) o.a()).setProgress(((ypf.b) ypfVar).b);
                }
                xpfVar.a = ypfVar;
                return s3q0.a;
            case 12:
                mdg mdgVar = (mdg) this.c;
                iag iagVar = (iag) this.d;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 104) {
                        UserProfile userProfile = new UserProfile();
                        userProfile.c = iagVar.getUid();
                        userProfile.e = iagVar.y1();
                        userProfile.h = iagVar.va();
                        mdgVar.g8(userProfile);
                    } else {
                        j03.a.getClass();
                        j03.k(vKApiExecutionException);
                    }
                }
                return s3q0.a;
            case 13:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.c;
                lfg lfgVar = (lfg) this.d;
                NewsEntry newsEntry = (NewsEntry) j5g.a0((List) obj);
                if (newsEntry != null && (newsEntry instanceof Post)) {
                    lfgVar.h0.J4((Post) newsEntry);
                }
                return qVar;
            case 14:
                lhh lhhVar = (lhh) this.c;
                sun sunVar = (sun) this.d;
                List<Document> list5 = sunVar.j;
                if (list5 == null || list5.isEmpty()) {
                    lhh.v(lhhVar, sunVar, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    lhh.v(lhhVar, sunVar, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            case 15:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.c;
                View view = (View) this.d;
                wwh.a aVar2 = (wwh.a) obj;
                int i11 = CommunityRepliesFragment.d0;
                mzp0 mzp0Var = communityRepliesFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(view);
                }
                communityRepliesFragment.On().a();
                RepliesView repliesView = communityRepliesFragment.S;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = communityRepliesFragment.S;
                if (repliesView2 != null) {
                    repliesView2.c();
                }
                NestedScrollView nestedScrollView = communityRepliesFragment.R;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(8);
                }
                RepliesView repliesView3 = communityRepliesFragment.S;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(0);
                }
                VkSpinner vkSpinner = communityRepliesFragment.T;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(8);
                }
                RepliesView repliesView4 = communityRepliesFragment.S;
                if (repliesView4 != null) {
                    repliesView4.setVisibility(0);
                }
                gm50.a.a(communityRepliesFragment, aVar2.a, new rmg(communityRepliesFragment, i4));
                gm50.a.a(communityRepliesFragment, aVar2.e, new lbe(communityRepliesFragment, 11));
                gm50.a.a(communityRepliesFragment, aVar2.b, new yve(communityRepliesFragment, 9));
                gm50.a.a(communityRepliesFragment, aVar2.d, new l5(communityRepliesFragment, 28));
                gm50.a.a(communityRepliesFragment, aVar2.c, new po1(communityRepliesFragment, 27));
                gm50.a.a(communityRepliesFragment, aVar2.f, new yte(communityRepliesFragment, 3));
                return s3q0.a;
            case 16:
                k2j k2jVar = (k2j) this.c;
                g2j g2jVar = (g2j) this.d;
                if (((View) obj).isEnabled()) {
                    k2jVar.l.invoke(new v1j.k(g2jVar.b.a.a));
                }
                return s3q0.a;
            case 17:
                nik nikVar = (nik) this.c;
                o8 o8Var = (o8) this.d;
                typ0 typ0Var = nikVar.m;
                if (typ0Var != null) {
                    o8Var.invoke(typ0Var);
                }
                return s3q0.a;
            case 18:
                return ((psm) this.c).w(oum.a((oum) obj, null, null, null, null, null, null, null, null, null, null, null, (i5e0) this.d, 2047), EmptySet.b);
            case 19:
                Context context2 = (Context) this.c;
                t0d.k.b bVar3 = (t0d.k.b) this.d;
                ((ikv0) obj).a();
                maz e = xwk.d().e();
                StringBuilder sb = new StringBuilder();
                sb.append("https://" + a0a.d + "/app6363684#?act=clip&clip_id=");
                sb.append(bVar3.a().a1());
                maz.c(e, context2, sb.toString(), LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 20:
                izs izsVar2 = (izs) this.c;
                Owner owner3 = (Owner) this.d;
                h03.b((Throwable) obj);
                if (izsVar2 != null) {
                    izsVar2.invoke(owner3.b);
                }
                return s3q0.a;
            case 21:
                qn60.c cVar = (qn60.c) obj;
                return new drq(cVar.a, cVar.b, (ArrayList) this.c, (String) this.d);
            case 22:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.c;
                io.reactivex.rxjava3.core.q qVar2 = (io.reactivex.rxjava3.core.q) this.d;
                Throwable th2 = (Throwable) obj;
                if (feedAnimatedView.k.get() < 3) {
                    return io.reactivex.rxjava3.core.q.H(th2);
                }
                com.vk.core.utils.newtork.b.a.getClass();
                return com.vk.core.utils.newtork.b.f().t0(1L).L(new vj0(new lbe(qVar2, 23), 18), false);
            case 23:
                MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType = (MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType) this.c;
                b.d dVar2 = (b.d) obj;
                StoryEntry currentStory = ((q7r) this.d).i0.getCurrentStory();
                dVar2.b(currentStory != null ? currentStory.e : null, "story_type");
                int i12 = r7r.a.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i12 == 1) {
                    if (currentStory != null && (clickableStickers2 = currentStory.X) != null && (list2 = clickableStickers2.d) != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj5 = it.next();
                                if (obj5 instanceof ClickablePost) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        if (!(obj5 instanceof ClickablePost)) {
                            obj5 = null;
                        }
                        clickableSticker = (ClickablePost) obj5;
                        break;
                    }
                    if (currentStory != null && (clickableStickers = currentStory.X) != null && (list = clickableStickers.d) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj4 = it2.next();
                                if (obj4 instanceof ClickablePhoto) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        clickableSticker2 = (ClickablePhoto) (obj4 instanceof ClickablePhoto ? obj4 : null);
                    }
                    clickableSticker = clickableSticker2;
                    if (clickableSticker != null) {
                        dVar2.b(clickableSticker.zb().zb(), "clickable_sticker");
                    }
                } else if (i12 == 2 && currentStory != null && (clickableStickers3 = currentStory.X) != null && (list3 = clickableStickers3.d) != null) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj6 = it3.next();
                            if (obj6 instanceof ClickableClip) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    ClickableClip clickableClip = (ClickableClip) (obj6 instanceof ClickableClip ? obj6 : null);
                    if (clickableClip != null) {
                        dVar2.b(clickableClip.zb().zb(), "clickable_sticker");
                    }
                }
                return s3q0.a;
            case 24:
                ((yls.b) this.c).d.invoke(((ea7.b) this.d).a.a);
                return s3q0.a;
            case 25:
                j05 j05Var = (j05) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                ((k5h) j05Var.b).invoke();
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return s3q0.a;
            case 26:
                l7v l7vVar = (l7v) this.c;
                String str8 = (String) this.d;
                l7vVar.a.b((com.vk.dto.hints.a) obj);
                l7vVar.w(str8, false);
                return s3q0.a;
            case 27:
                HorizontalListShowAllVh horizontalListShowAllVh = (HorizontalListShowAllVh) this.c;
                UIBlockList uIBlockList = (UIBlockList) this.d;
                Context context3 = (Context) obj;
                int i13 = HorizontalListShowAllVh.B;
                u4a.a aVar3 = horizontalListShowAllVh.e.b;
                SearchStatsLoggingInfo b = aVar3.m.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
                UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockList.F;
                if (uIBlockActionOpenSection != null) {
                    aVar3.f.a(new cfp0(uIBlockActionOpenSection, null));
                }
                nda ndaVar = aVar3.b;
                CatalogConfiguration catalogConfiguration = horizontalListShowAllVh.c;
                String str9 = (uIBlockActionOpenSection == null || (str2 = uIBlockActionOpenSection.B) == null) ? "" : str2;
                String str10 = uIBlockList.z;
                nda.e(ndaVar, context3, catalogConfiguration, str9, str10 == null ? "" : str10, uIBlockActionOpenSection != null ? uIBlockActionOpenSection.E : null, b, null, PsExtractor.AUDIO_STREAM);
                return s3q0.a;
            case 28:
                ((v3y) this.c).a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), (String) this.d, 1, null));
                return s3q0.a;
            default:
                l2y0 l2y0Var = (l2y0) this.c;
                hoz hozVar = (hoz) this.d;
                l2y0Var.w0();
                ((wmf) hozVar.a).uc((VideoFile) obj);
                return s3q0.a;
        }
    }
}
