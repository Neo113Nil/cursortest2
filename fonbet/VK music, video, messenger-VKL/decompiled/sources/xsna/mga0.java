package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.likes.LikesGetList;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.style.PodcastSliderViewStyle;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.channels.impl.post_settings.e;
import com.vk.clips.design.view.QRSharingView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.Onboarding;
import com.vk.posting.presentation.model.VideoAttachParams;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a9j0;
import xsna.c9x0;
import xsna.fh8;
import xsna.hbs0;
import xsna.kxb0;
import xsna.lgj0;
import xsna.m3b0;
import xsna.mno0;
import xsna.p9i0;
import xsna.rmw;
import xsna.tj50;
import xsna.tlo0;
import xsna.vpc0;
import xsna.x9m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mga0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mga0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    private final Object a(Object obj) {
        com.vk.movika.sdk.base.observable.a aVar = ((com.vk.voip.ui.settings.participants_view.k) this.c).l;
        if (aVar != null) {
            aVar.invoke(j.d.c.a);
        }
        return s3q0.a;
    }

    private final Object c(Object obj) {
        gzs<s3q0> gzsVar = ((VideoCatalogHeaderDebrandedVh) this.c).e;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06e1 A[LOOP:0: B:229:0x06db->B:231:0x06e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x057e  */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Activity h;
        UserId userId;
        String str;
        String str2;
        VkTopBar vkTopBar;
        RecyclerView recyclerView;
        u3g0 u3g0Var;
        u3g0 u3g0Var2;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        m3g0 m3g0Var;
        PhotoAttachment Mb;
        Photo photo;
        List<PhotoTag> list;
        Context mo2getContext;
        Activity h2;
        String str3;
        NewsEntry.TrackData trackData;
        String str4;
        boolean z;
        int zb;
        UserId userId2;
        int zb2;
        int i;
        LikesGetList.Type type;
        Badgeable badgeable;
        Videos videos;
        VideoStatistic videoStatistic;
        lfg lfgVar;
        ArrayList<EntryAttachment> arrayList;
        Iterator<T> it;
        Iterator it2;
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        BadgesSet u0;
        boolean z2;
        BadgeInfo p6;
        boolean z3;
        boolean z4;
        Flags flags;
        VideoFile videoFile2;
        EntryAttachment entryAttachment;
        VideoAttachment Nb;
        int i2 = this.b;
        int i3 = 13;
        int i4 = 11;
        int i5 = 14;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((com.vk.photos.root.presentation.h) obj2).l.setUserInputEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 1:
                tj50.a aVar = (tj50.a) obj;
                irt irtVar = new irt(10);
                ao8 ao8Var = ao8.d;
                return new m3b0.b(aVar.a(irtVar, ao8Var), aVar.a(new juz(9), ao8Var), aVar.a(new bws(9), ao8Var), aVar.a(new q520(12), ao8Var), aVar.a(new f1s(18), ao8Var), aVar.a(new bgy((k3b0) obj2, 23), ao8Var), aVar.a(new x620(i3), ao8Var), aVar.a(new kl60(8), ao8Var), aVar.a(new sux(13), ao8Var), aVar.a(new y510(12), ao8Var));
            case 2:
                bi20 bi20Var = (bi20) obj2;
                String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
                PodcastSliderViewStyle.Style.Companion.getClass();
                return hgb0.a(bi20Var, (Podcast) obj, new PodcastSliderViewStyle(PodcastSliderViewStyle.Style.a.a(string)));
            case 3:
                ((sxb0) obj2).c.invoke(kxb0.a.b);
                return s3q0.a;
            case 4:
                PostFragment postFragment = (PostFragment) obj2;
                obg obgVar = (obg) obj;
                int i6 = PostFragment.S0;
                if (obgVar instanceof gbg) {
                    gbg gbgVar = (gbg) obgVar;
                    NewsEntry newsEntry = gbgVar.a;
                    String str5 = gbgVar.b;
                    mzp0 mzp0Var = postFragment.J;
                    if (mzp0Var != null) {
                        mzp0Var.c(false);
                    }
                    a1c0 a1c0Var = postFragment.K0;
                    if (a1c0Var == null) {
                        a1c0Var = null;
                    }
                    if (a1c0Var != null) {
                        a1c0Var.d = newsEntry;
                        a1c0Var.e = str5;
                        f0c0 zo = postFragment.zo();
                        PostFragment postFragment2 = a1c0Var.b;
                        Bundle bundle = new Bundle();
                        boolean z5 = newsEntry instanceof Videos;
                        boolean z6 = z5 && (Nb = ((Videos) newsEntry).Nb()) != null && Nb.C2();
                        if (z6) {
                            str3 = zo.t;
                        } else {
                            Post R = di60.R(newsEntry);
                            str3 = (R == null || (trackData = R.L) == null) ? null : trackData.b;
                        }
                        boolean z7 = newsEntry instanceof c6z;
                        c6z c6zVar = z7 ? (c6z) newsEntry : null;
                        bundle.putBoolean("arg_can_comment", c6zVar != null && c6zVar.l0());
                        bundle.putBoolean("arg_show_only_comments", postFragment2.M0().d);
                        if (z5) {
                            ArrayList<EntryAttachment> arrayList2 = ((Videos) newsEntry).o;
                            boolean z8 = arrayList2 != null && arrayList2.size() == 1;
                            Attachment attachment = (arrayList2 == null || (entryAttachment = (EntryAttachment) j5g.a0(arrayList2)) == null) ? null : entryAttachment.b;
                            VideoAttachment videoAttachment2 = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
                            boolean z9 = (videoAttachment2 == null || (videoFile2 = videoAttachment2.k) == null || !videoFile2.C5()) ? false : true;
                            if (z8 && z9) {
                                str4 = "comment_in_sport_broadcast";
                                bundle.putString("arg_on_comment_mytracker_event", str4);
                                Post R2 = di60.R(newsEntry);
                                bundle.putBoolean("arg_can_group_comment", R2 == null && (flags = R2.l) != null && flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI));
                                z = newsEntry instanceof Post;
                                bundle.putBoolean("arg_can_share_comments", (z || !((Post) newsEntry).l.zb(512L)) && z7 && ((c6z) newsEntry).b9());
                                zb = newsEntry.zb();
                                if (zb != 9) {
                                    zb = 1;
                                } else if (z6) {
                                    zb = 6;
                                }
                                bundle.putBoolean("arg_can_share_comments_link", zb != 6);
                                bundle.putBoolean("arg_dismiss_on_opening_video", postFragment2.M0().e);
                                bundle.putInt("id", di60.n(newsEntry));
                                bundle.putParcelable("owner_id", b1c0.a(newsEntry));
                                bundle.putInt("arg_start_comment_id", zo.e);
                                bundle.putInt("arg_parent_comment_id", zo.f);
                                int zb3 = newsEntry.zb();
                                bundle.putInt("type", zb3 != 9 ? 1 : z6 ? 6 : zb3);
                                if (newsEntry instanceof l490) {
                                    userId2 = UserId.d;
                                } else {
                                    Owner s = ((l490) newsEntry).s();
                                    if (s == null || (userId2 = s.b) == null) {
                                        userId2 = UserId.d;
                                    }
                                }
                                bundle.putParcelable("uid", userId2);
                                zb2 = newsEntry.zb();
                                if (z) {
                                    i = 1;
                                } else {
                                    Post post = ((Post) newsEntry).D;
                                    if (post != null) {
                                        i = 1;
                                        if (post.hc()) {
                                            z4 = true;
                                            if (z4) {
                                                type = LikesGetList.Type.COMMENT;
                                                bundle.putString("arg_item_likes_type", type.i());
                                                bundle.putString("access_key", a1c0Var.e);
                                                bundle.putString("ref_source", zo.A);
                                                bundle.putString("referrer", zo.m);
                                                bundle.putString("track_code", str3);
                                                bundle.putBoolean("scroll_to_comments", zo.y);
                                                bundle.putBoolean("arg_can_share_on_wall", zo.z);
                                                bundle.putBoolean("arg_start_from_parent", zo.F);
                                                badgeable = newsEntry instanceof Badgeable ? (Badgeable) newsEntry : null;
                                                if (badgeable != null && (u0 = badgeable.u0()) != null) {
                                                    bundle.putInt("arg_badgeable_post_type", u0.d);
                                                    if (!u0.h) {
                                                        if (z) {
                                                            BadgeInfo badgeInfo = ((Post) newsEntry).d0;
                                                            if (badgeInfo != null) {
                                                                z3 = badgeInfo.b;
                                                                if (!z3) {
                                                                    z2 = false;
                                                                    bundle.putBoolean("arg_badgeable_disabled", z2);
                                                                    bundle.putParcelable("arg_badgeable_info", z ? ((Post) newsEntry).d0 : newsEntry instanceof iag ? ((iag) newsEntry).p6() : null);
                                                                }
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                            }
                                                        } else {
                                                            if ((newsEntry instanceof iag) && (p6 = ((iag) newsEntry).p6()) != null) {
                                                                z3 = p6.b;
                                                                if (!z3) {
                                                                }
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                            }
                                                        }
                                                    }
                                                    z2 = true;
                                                    bundle.putBoolean("arg_badgeable_disabled", z2);
                                                    bundle.putParcelable("arg_badgeable_info", z ? ((Post) newsEntry).d0 : newsEntry instanceof iag ? ((iag) newsEntry).p6() : null);
                                                }
                                                videos = z5 ? (Videos) newsEntry : null;
                                                if (videos != null && (arrayList = videos.o) != null) {
                                                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                                                    it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList3.add(((EntryAttachment) it.next()).b);
                                                    }
                                                    ArrayList arrayList4 = new ArrayList();
                                                    it2 = arrayList3.iterator();
                                                    while (it2.hasNext()) {
                                                        Object next = it2.next();
                                                        if (next instanceof VideoAttachment) {
                                                            arrayList4.add(next);
                                                        }
                                                    }
                                                    videoAttachment = (VideoAttachment) j5g.a0(arrayList4);
                                                    if (videoAttachment != null && (videoFile = videoAttachment.k) != null) {
                                                        pkt0.a.getClass();
                                                        videoStatistic = pkt0.a(videoFile);
                                                        if (videoStatistic != null) {
                                                            bundle.putParcelable("video_statistic", videoStatistic);
                                                        }
                                                        lfgVar = a1c0Var.i;
                                                        if (lfgVar != null) {
                                                            lfgVar.onCreate(bundle);
                                                        }
                                                        if (z) {
                                                            a1c0Var.z((Post) newsEntry);
                                                        }
                                                    }
                                                }
                                                videoStatistic = null;
                                                if (videoStatistic != null) {
                                                }
                                                lfgVar = a1c0Var.i;
                                                if (lfgVar != null) {
                                                }
                                                if (z) {
                                                }
                                            }
                                        }
                                    } else {
                                        i = 1;
                                    }
                                    z4 = false;
                                    if (z4) {
                                    }
                                }
                                if (zb2 == 0) {
                                    if (zb2 != i) {
                                        if (zb2 == 2) {
                                            type = LikesGetList.Type.VIDEO;
                                        } else if (zb2 != 7 && zb2 != 9) {
                                            type = zb2 != 12 ? LikesGetList.Type.POST : LikesGetList.Type.POST_ADS;
                                        }
                                    }
                                    type = LikesGetList.Type.PHOTO;
                                } else {
                                    type = LikesGetList.Type.POST;
                                }
                                bundle.putString("arg_item_likes_type", type.i());
                                bundle.putString("access_key", a1c0Var.e);
                                bundle.putString("ref_source", zo.A);
                                bundle.putString("referrer", zo.m);
                                bundle.putString("track_code", str3);
                                bundle.putBoolean("scroll_to_comments", zo.y);
                                bundle.putBoolean("arg_can_share_on_wall", zo.z);
                                bundle.putBoolean("arg_start_from_parent", zo.F);
                                if (newsEntry instanceof Badgeable) {
                                }
                                if (badgeable != null) {
                                    bundle.putInt("arg_badgeable_post_type", u0.d);
                                    if (!u0.h) {
                                    }
                                    z2 = true;
                                    bundle.putBoolean("arg_badgeable_disabled", z2);
                                    bundle.putParcelable("arg_badgeable_info", z ? ((Post) newsEntry).d0 : newsEntry instanceof iag ? ((iag) newsEntry).p6() : null);
                                }
                                if (z5) {
                                }
                                if (videos != null) {
                                    ArrayList arrayList32 = new ArrayList(c5g.u(arrayList, 10));
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                    }
                                    ArrayList arrayList42 = new ArrayList();
                                    it2 = arrayList32.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    videoAttachment = (VideoAttachment) j5g.a0(arrayList42);
                                    if (videoAttachment != null) {
                                        pkt0.a.getClass();
                                        videoStatistic = pkt0.a(videoFile);
                                        if (videoStatistic != null) {
                                        }
                                        lfgVar = a1c0Var.i;
                                        if (lfgVar != null) {
                                        }
                                        if (z) {
                                        }
                                    }
                                }
                                videoStatistic = null;
                                if (videoStatistic != null) {
                                }
                                lfgVar = a1c0Var.i;
                                if (lfgVar != null) {
                                }
                                if (z) {
                                }
                            }
                        }
                        str4 = null;
                        bundle.putString("arg_on_comment_mytracker_event", str4);
                        Post R22 = di60.R(newsEntry);
                        bundle.putBoolean("arg_can_group_comment", R22 == null && (flags = R22.l) != null && flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI));
                        z = newsEntry instanceof Post;
                        bundle.putBoolean("arg_can_share_comments", (z || !((Post) newsEntry).l.zb(512L)) && z7 && ((c6z) newsEntry).b9());
                        zb = newsEntry.zb();
                        if (zb != 9) {
                        }
                        bundle.putBoolean("arg_can_share_comments_link", zb != 6);
                        bundle.putBoolean("arg_dismiss_on_opening_video", postFragment2.M0().e);
                        bundle.putInt("id", di60.n(newsEntry));
                        bundle.putParcelable("owner_id", b1c0.a(newsEntry));
                        bundle.putInt("arg_start_comment_id", zo.e);
                        bundle.putInt("arg_parent_comment_id", zo.f);
                        int zb32 = newsEntry.zb();
                        bundle.putInt("type", zb32 != 9 ? 1 : z6 ? 6 : zb32);
                        if (newsEntry instanceof l490) {
                        }
                        bundle.putParcelable("uid", userId2);
                        zb2 = newsEntry.zb();
                        if (z) {
                        }
                        if (zb2 == 0) {
                        }
                        bundle.putString("arg_item_likes_type", type.i());
                        bundle.putString("access_key", a1c0Var.e);
                        bundle.putString("ref_source", zo.A);
                        bundle.putString("referrer", zo.m);
                        bundle.putString("track_code", str3);
                        bundle.putBoolean("scroll_to_comments", zo.y);
                        bundle.putBoolean("arg_can_share_on_wall", zo.z);
                        bundle.putBoolean("arg_start_from_parent", zo.F);
                        if (newsEntry instanceof Badgeable) {
                        }
                        if (badgeable != null) {
                        }
                        if (z5) {
                        }
                        if (videos != null) {
                        }
                        videoStatistic = null;
                        if (videoStatistic != null) {
                        }
                        lfgVar = a1c0Var.i;
                        if (lfgVar != null) {
                        }
                        if (z) {
                        }
                    }
                    Bundle arguments = postFragment.getArguments();
                    boolean f = epx.f(arguments != null ? arguments.getString("post_action", "") : null, "edit");
                    c9x0.b bVar = c9x0.b.b;
                    if ((f ? bVar : c9x0.c.b).equals(bVar)) {
                        Bundle arguments2 = postFragment.getArguments();
                        if (arguments2 != null) {
                            arguments2.remove("post_action");
                        }
                        if (newsEntry instanceof Post) {
                            Post post2 = (Post) newsEntry;
                            if ((rv60.a(post2) || rv60.b(post2)) && (mo2getContext = postFragment.mo2getContext()) != null && (h2 = e3m.h(mo2getContext)) != null) {
                                iuc0.b.c(4328, h2, post2, PostingCreationEntryPoint.Other);
                            }
                        }
                    }
                    y8c0 Bo = postFragment.Bo();
                    Photos photos = newsEntry instanceof Photos ? (Photos) newsEntry : null;
                    ((jn60) Bo.a().a.r.getValue()).a().p.N = (photos == null || (Mb = photos.Mb()) == null || (photo = Mb.l) == null || (list = photo.b) == null || !(list.isEmpty() ^ true)) ? false : true;
                    RecyclerPaginatedView recyclerPaginatedView = postFragment.W;
                    if (recyclerPaginatedView != null) {
                        recyclerPaginatedView.f0();
                    }
                    RecyclerPaginatedView recyclerPaginatedView2 = postFragment.W;
                    if (recyclerPaginatedView2 != null) {
                        recyclerPaginatedView2.gl();
                    }
                    u3g0 u3g0Var3 = postFragment.X;
                    if (u3g0Var3 != null && (m3g0Var = u3g0Var3.c) != null) {
                        b3g0 b3g0Var = m3g0Var.b;
                        n3g0 n3g0Var = m3g0Var.l;
                        if (n3g0Var != null) {
                            n3g0Var.b(b3g0Var.p());
                            n3g0Var.f(b3g0Var.i0());
                            n3g0Var.d(b3g0Var.f0());
                            n3g0Var.a();
                        }
                    }
                    PostViewFragmentTimeSpentTracker Co = postFragment.Co();
                    if (Co != null) {
                        Co.c = newsEntry;
                    }
                    RecyclerPaginatedView recyclerPaginatedView3 = postFragment.W;
                    if (recyclerPaginatedView3 != null && (recyclerView3 = recyclerPaginatedView3.getRecyclerView()) != null) {
                        recyclerView3.post(new uv6(7, postFragment, recyclerView3));
                    }
                    lfg lfgVar2 = postFragment.J0;
                    if (lfgVar2 == null) {
                        lfgVar2 = null;
                    }
                    if (lfgVar2.w) {
                        postFragment.y2();
                    } else {
                        postFragment.k0();
                    }
                    postFragment.L0 = new GestureDetector(postFragment.getActivity(), postFragment.M0);
                    RecyclerPaginatedView recyclerPaginatedView4 = postFragment.W;
                    if (recyclerPaginatedView4 != null && (recyclerView2 = recyclerPaginatedView4.getRecyclerView()) != null) {
                        recyclerView2.addOnItemTouchListener(new f3c0(postFragment));
                    }
                    if (postFragment.zo().G && (u3g0Var2 = postFragment.X) != null) {
                        c3g0.gg(u3g0Var2, null, 3);
                    }
                    if (!postFragment.zo().H && (u3g0Var = postFragment.X) != null) {
                        u3g0Var.l();
                    }
                } else if (obgVar instanceof kbg) {
                    NewsEntry newsEntry2 = ((kbg) obgVar).a;
                    if (newsEntry2 instanceof Post) {
                        Post post3 = (Post) newsEntry2;
                        if (!post3.l0()) {
                            postFragment.Ic(true);
                            postFragment.d0();
                        }
                        a1c0 a1c0Var2 = postFragment.K0;
                        if (a1c0Var2 == null) {
                            a1c0Var2 = null;
                        }
                        if (a1c0Var2 != null) {
                            PostFragment postFragment3 = a1c0Var2.b;
                            if (epx.f(a1c0Var2.d, post3)) {
                                a1c0Var2.d = post3;
                                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                                postFragment3.E3(NewsfeedData.a.d(post3));
                                lfg lfgVar3 = a1c0Var2.i;
                                if (lfgVar3 != null) {
                                    lfgVar3.k8(post3.l0());
                                }
                                a1c0Var2.z(post3);
                                if (post3.l0()) {
                                    postFragment3.y2();
                                } else {
                                    postFragment3.k0();
                                }
                            }
                        }
                    }
                    a1c0 a1c0Var3 = postFragment.K0;
                    if (a1c0Var3 == null) {
                        a1c0Var3 = null;
                    }
                    if (a1c0Var3 != null) {
                        ListDataSet<u1c0> listDataSet = a1c0Var3.j;
                        yfg yfgVar = a1c0Var3.h;
                        yfgVar.a = a1c0Var3.g();
                        yfgVar.b = a1c0Var3.f;
                        NewsEntry newsEntry3 = a1c0Var3.d;
                        Videos videos2 = newsEntry3 instanceof Videos ? (Videos) newsEntry3 : null;
                        if (videos2 != null) {
                            VideoAttachment Nb2 = videos2.Nb();
                            VideoFile videoFile3 = Nb2 != null ? Nb2.k : null;
                            if (videoFile3 != null) {
                                a1c0Var3.m.b((videoFile3.C2() ? rsg0.w0(yfb.x(lgj0.a.c(Collections.singletonList(videoFile3.a1()), null))).l(new pi40(new com(29), 4)) : rsg0.w0(new gns0(videoFile3.I0(), videoFile3.o0(), videoFile3.C1())).l(new tuz(new zsw(i5), 6))).m(asu0.a.d()).subscribe(new rt10(new bl30(i4, videoFile3, a1c0Var3), i4), new rkz(new yo20(L.a, 4), 16)));
                            }
                        }
                        int w = listDataSet.w(new i44(2));
                        if (w < 0 || a1c0Var3.g() <= 1) {
                            a1c0Var3.x(yfgVar.c, yfgVar.d);
                        } else {
                            listDataSet.d(w);
                        }
                    }
                } else if (obgVar instanceof ibg) {
                    postFragment.finish();
                } else if (obgVar instanceof hbg) {
                    RecyclerPaginatedView recyclerPaginatedView5 = postFragment.W;
                    if (recyclerPaginatedView5 != null) {
                        recyclerPaginatedView5.e0();
                    }
                } else if (obgVar instanceof fbg) {
                    mzp0 mzp0Var2 = postFragment.J;
                    if (mzp0Var2 != null) {
                        mzp0Var2.f();
                    }
                    postFragment.On().stop();
                    RecyclerPaginatedView recyclerPaginatedView6 = postFragment.W;
                    if (recyclerPaginatedView6 != null) {
                        recyclerPaginatedView6.fj(null, postFragment.D0);
                    }
                    RecyclerPaginatedView recyclerPaginatedView7 = postFragment.W;
                    if (recyclerPaginatedView7 != null && (recyclerView = recyclerPaginatedView7.getRecyclerView()) != null) {
                        recyclerView.post(new tou(4, postFragment, recyclerView));
                        postFragment.A0.c();
                    }
                } else if (obgVar instanceof jbg) {
                    NewsEntry newsEntry4 = ((jbg) obgVar).a;
                    Context mo2getContext2 = postFragment.mo2getContext();
                    if (mo2getContext2 != null && e3m.h(mo2getContext2) != null && (vkTopBar = postFragment.r0) != null) {
                        y8c0 Bo2 = postFragment.Bo();
                        Context context = vkTopBar.getContext();
                        a.AbstractC1374a.C1375a c1375a = new a.AbstractC1374a.C1375a(zjq.n(vkTopBar.getRightMainRect()), vkTopBar);
                        Bo2.getClass();
                        com.vk.newsfeed.common.util.h hVar = new com.vk.newsfeed.common.util.h(newsEntry4, null);
                        hVar.b = new u8c0(Bo2, newsEntry4);
                        hVar.k = Bo2.s;
                        hVar.l = true;
                        hVar.n = true;
                        Bo2.p = hVar.a(context, c1375a).g();
                        p4r p4rVar = (p4r) Bo2.q.getValue();
                        UserId o = k9q0.o(newsEntry4);
                        int n = di60.n(newsEntry4);
                        String str6 = newsEntry4.Cb().b;
                        MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.CLICK_TO_DOTS;
                        Integer valueOf = Integer.valueOf(n);
                        p4rVar.getClass();
                        p4r.d(action, o, valueOf, str6, null);
                    }
                } else if (obgVar instanceof ebg) {
                    Context mo2getContext3 = postFragment.mo2getContext();
                    if (mo2getContext3 != null && (h = e3m.h(mo2getContext3)) != null) {
                        vz70 a = rfc0.a();
                        Post post4 = ((ebg) obgVar).a;
                        a.n().a.putParcelable("newsEntry", post4);
                        Flags flags2 = post4.l;
                        a.n().f();
                        Owner owner = post4.o;
                        if (owner == null || (userId = owner.b) == null) {
                            userId = UserId.d;
                        }
                        if (fkq0.d(userId)) {
                            a.n().h();
                        } else {
                            String str7 = (owner == null || (str2 = owner.c) == null) ? "" : str2;
                            String str8 = (owner == null || (str = owner.e) == null) ? "" : str;
                            boolean i7 = owner != null ? owner.i(2) : false;
                            Group C0 = t6g0.b().C0(fkq0.e(userId));
                            int i8 = C0 != null ? C0.s : 0;
                            boolean i9 = owner != null ? owner.i(128) : false;
                            boolean z10 = owner != null && owner.i(1024);
                            a.n().a();
                            PostDonut postDonut = post4.R;
                            if (postDonut != null) {
                                if (postDonut.d != null) {
                                    a.n().a.putBoolean("paywallDisabled", false);
                                    i9 = true;
                                }
                                DonutPostingSettings donutPostingSettings = postDonut.f;
                                if (donutPostingSettings != null) {
                                    a.n().a.putParcelable("donutEditingSettings", donutPostingSettings);
                                }
                                a.n().a.putString("donutEditMode", postDonut.e);
                            }
                            a.n().c(i8, fkq0.a(userId), str7, str8, i7, i9, z10);
                        }
                        if (post4.oc()) {
                            a.n().a.putBoolean(BuildConfig.SDK_BUILD_FLAVOR, true);
                        } else {
                            a.n().g();
                        }
                        if (!post4.oc() || !epx.f(t11.b(), post4.m)) {
                            a.n().i();
                        }
                        if (post4.Lb() || flags2.zb(16777216L)) {
                            a.n().b();
                            if (flags2.zb(16777216L)) {
                                a.n().a.putBoolean("commentsClosed", true);
                            }
                        }
                        a.n().d();
                        a.m();
                        a.i(PostingCreationEntryPoint.PostThreeDotMenuEditItem);
                        a.b.h(h, 4328);
                    }
                } else if (obgVar instanceof lbg) {
                    lfg lfgVar4 = postFragment.J0;
                    lbg lbgVar = (lbg) obgVar;
                    (lfgVar4 == null ? null : lfgVar4).u8(lbgVar.a, lbgVar.b);
                } else if (obgVar instanceof nbg) {
                    postFragment.Il(((nbg) obgVar).a);
                } else {
                    if (!(obgVar instanceof mbg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    postFragment.ym(((mbg) obgVar).a);
                }
                return s3q0.a;
            case 5:
                gu80 gu80Var = (gu80) obj;
                ((com.vk.channels.impl.post_settings.b) obj2).C(new e.a(gu80Var.b, gu80Var.c, gu80Var.a));
                return s3q0.a;
            case 6:
                VideoFile videoFile4 = (VideoFile) obj;
                z84 z84Var = ((scc0) obj2).f;
                return Boolean.valueOf(z84Var == null || !z84Var.p0(videoFile4));
            case 7:
                ptk ptkVar = (ptk) obj;
                ((xgc0) obj2).e = new VideoAttachParams(((ExtendedUserProfile) ptkVar.a).Z0.get("videos"), ((ExtendedUserProfile) ptkVar.a).Z0.get("video_playlists"), null, null, 12, null);
                return s3q0.a;
            case 8:
                ((qkc0) obj2).d.getClass();
                int i10 = vpc0.a.$EnumSwitchMapping$1[((PostingState.Editing) obj).i.C.ordinal()];
                if (i10 == 1) {
                    return Onboarding.NONE;
                }
                if (i10 == 2) {
                    return Onboarding.TITLE;
                }
                if (i10 == 3) {
                    return Onboarding.SUBTITLE;
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                int i11 = QRSharingView.g;
                ((QRSharingView) obj2).a(false);
                return s3q0.a;
            case 10:
                Intent intent = (Intent) ((it80) obj).a;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.D0();
                ((sd1) obj2).invoke(intent);
                return s3q0.a;
            case 11:
                u4a u4aVar = (u4a) obj;
                return new umh0(com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), u4aVar.b.I, (AudienceResearchComponent) ((osh0) obj2).D.getValue());
            case 12:
                ((o0i0) obj2).l((String) obj, SearchInputMethod.QueryViewClick);
                return s3q0.a;
            case 13:
                ((po5) obj2).invoke(p9i0.c.b);
                return s3q0.a;
            case 14:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((l8j0) obj2).m.b(new a9j0.h(th));
                return s3q0.a;
            case 15:
                ((clj0) obj2).e.invoke(new fh8.l((hd8) ((it80) obj).a));
                return s3q0.a;
            case 16:
                f3l0 f3l0Var = (f3l0) obj2;
                f3l0Var.getClass();
                return new x690(f3l0Var.i, (ViewGroup) obj);
            case 17:
                kxl0 kxl0Var = (kxl0) obj2;
                if (kxl0Var.u) {
                    kxl0Var.o.getClass();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    kxl0Var.t.toggle();
                }
                return Boolean.TRUE;
            case 18:
                myl0 myl0Var = (myl0) obj2;
                t2l0 t2l0Var = (t2l0) obj;
                ImageView imageView = myl0Var.e;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageDrawable(null);
                ImageView imageView2 = myl0Var.e;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                bwt0.p0(imageView2, false);
                myl0Var.l = null;
                myl0Var.c(t2l0Var);
                gyl0 presenter = myl0Var.getPresenter();
                if (presenter != null) {
                    presenter.c6();
                }
                return s3q0.a;
            case 19:
                ((p9m0) obj2).T(new x9m0.b((List) obj));
                return s3q0.a;
            case 20:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).T(new e.a.b((Throwable) obj));
                return s3q0.a;
            case 21:
                i0q0.j(new vo2(4, (io.reactivex.rxjava3.functions.f) obj2, obj));
                return s3q0.a;
            case 22:
                com.vk.superapp.ui.a aVar2 = (com.vk.superapp.ui.a) obj2;
                QueueParams queueParams = (QueueParams) obj;
                if (com.vk.superapp.ui.a.S1().z() != null) {
                    yan0 yan0Var = aVar2.D;
                    if (yan0Var.b == null) {
                        yan0Var.b = new fpx0(yan0Var.a, yan0Var);
                    }
                    fpx0 fpx0Var = yan0Var.b;
                    if (fpx0Var != null) {
                        String str9 = queueParams.d;
                        if (str9.length() > 0) {
                            fpx0Var.d = queueParams;
                            fpx0Var.b();
                            c63 c63Var = c63.a;
                            c63.a(new epx0(fpx0Var));
                        } else if (fpx0Var.a == null) {
                            fpx0Var.c.e(str9, true);
                        }
                    }
                }
                return s3q0.a;
            case 23:
                qgi0.s((tgi0) obj, new us2(((AuthorHeaderConfig.Info.InfoSlotData.TrustTag) ((zak0) ((esp0) obj2).a).getValue()).a));
                return s3q0.a;
            case 24:
                dw20 dw20Var = ((q4q0) obj2).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 25:
                r0e0 r0e0Var = ((vmq0) obj2).c;
                yj40 yj40Var = (yj40) obj;
                return Boolean.valueOf(((yj40Var instanceof fa50) || (yj40Var instanceof yd50)) ? epx.f(((mb50) yj40Var).a.c, r0e0Var.a()) : yj40Var instanceof a9b0 ? epx.f(((a9b0) yj40Var).a.c, r0e0Var.a()) : false);
            case 26:
                ((ubr0) obj2).c.j(JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 27:
                return a(obj);
            case 28:
                return c(obj);
            default:
                hbs0.a.b bVar2 = new hbs0.a.b("Default");
                hbs0.a.C2985a c2985a = new hbs0.a.C2985a(new nmc(PreviewViewState.g.b(new rmw.h("https://sun9-36.userapi.com/impg/uoylUYgGai1P-T6FC76bTFh7fXamBXKGumFakQ/B2vpu1KwArk.jpg?size=405x720&quality=95&sign=3d4bd2da21f8afaaa866de6995b90c41&type=video_thumb"), null, hbs0.c(), 6)));
                hbs0.a.b bVar3 = new hbs0.a.b("No Image");
                hbs0.a.C2985a c2985a2 = new hbs0.a.C2985a(new nmc(PreviewViewState.g.b(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), null, hbs0.c(), 6)));
                hbs0.a.b bVar4 = new hbs0.a.b("Centered");
                rmw.h hVar2 = new rmw.h("https://sun9-36.userapi.com/impg/uoylUYgGai1P-T6FC76bTFh7fXamBXKGumFakQ/B2vpu1KwArk.jpg?size=405x720&quality=95&sign=3d4bd2da21f8afaaa866de6995b90c41&type=video_thumb");
                tlo0.a aVar3 = tlo0.Companion;
                hbs0.a.C2985a c2985a3 = new hbs0.a.C2985a(new nmc(PreviewViewState.g.b(hVar2, null, new PreviewViewState.i(new w7d(oq.d(aVar3, "2,8К"))), 6)));
                hbs0.a.b bVar5 = new hbs0.a.b("Centered / No Image");
                rmw.h hVar3 = new rmw.h("https://sun9-67.userapi.com/no_image.jpg");
                aVar3.getClass();
                List l = e43.l(bVar2, c2985a, bVar3, c2985a2, bVar4, c2985a3, bVar5, new hbs0.a.C2985a(new nmc(PreviewViewState.g.b(hVar3, null, new PreviewViewState.i(new w7d(new tlo0.h("2,8К"))), 6))), new hbs0.a.b("Placeholder"), new hbs0.a.C2985a(new nmc(PreviewViewState.g.c(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_users_outline_28), new mno0.i("Только для подписчиков"), null, null, null, 28), null, null))), new hbs0.a.b("Placeholder / Schedule Timer"), new hbs0.a.C2985a(new nmc(PreviewViewState.g.c(new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_clock_outline_28), new mno0.i("Завтра в 08:30"), null, null, null, 28), new rmw.h("https://sun9-36.userapi.com/impg/uoylUYgGai1P-T6FC76bTFh7fXamBXKGumFakQ/B2vpu1KwArk.jpg?size=405x720&quality=95&sign=3d4bd2da21f8afaaa866de6995b90c41&type=video_thumb"), new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_more_vertical_24), null, null, VkColorToken.IconContrast, 6)))), new hbs0.a.b("Blur"), new hbs0.a.C2985a(new nmc(PreviewViewState.g.a(new rmw.h("https://sun9-36.userapi.com/impg/uoylUYgGai1P-T6FC76bTFh7fXamBXKGumFakQ/B2vpu1KwArk.jpg?size=405x720&quality=95&sign=3d4bd2da21f8afaaa866de6995b90c41&type=video_thumb"), new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_hide_outline_24), new mno0.i("Возможно, это неприятный контент"), null, null, null, 28)))), new hbs0.a.b("Skeleton"), new hbs0.a.C2985a(new nmc(PreviewViewState.g.d())));
                ((nvy) obj).e(l.size(), null, new ibs0(l), new jai(802480018, new jbs0(l, (hbs0) obj2), true));
                return s3q0.a;
        }
    }

    public /* synthetic */ mga0(rah0 rah0Var, sd1 sd1Var) {
        this.b = 10;
        this.c = sd1Var;
    }
}
