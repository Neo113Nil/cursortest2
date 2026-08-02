package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.common.Good;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.actions.Action;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.actions.ActionOpenCopyright;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.ActionRemote;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.yzk0;

/* compiled from: NewsfeedExt.kt */
/* loaded from: classes4.dex */
public final class di60 {

    /* compiled from: NewsfeedExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerType.values().length];
            try {
                iArr[DisclaimerType.SUPPLEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerType.DRUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerType.CREDITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerType.BANKRUPTCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisclaimerType.ENERGETICS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean A(VerifyInfo verifyInfo) {
        return verifyInfo.b || verifyInfo.g;
    }

    public static final boolean B(NewsEntry newsEntry) {
        Post R = R(newsEntry);
        if (R != null) {
            BadgesSet badgesSet = R.X;
            boolean z = (badgesSet == null || badgesSet.e.isEmpty() || badgesSet.f <= 0) ? false : true;
            if (R.o1() && !z) {
                return true;
            }
        }
        return false;
    }

    public static final boolean C(NewsEntry newsEntry) {
        Post R;
        Flags flags;
        return (newsEntry == null || (R = R(newsEntry)) == null || (flags = R.l) == null || !flags.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean D(NewsEntry newsEntry) {
        Owner s;
        EntryHeader header;
        HeaderTitle headerTitle;
        if (!(newsEntry instanceof wsx0) || (header = ((wsx0) newsEntry).getHeader()) == null || (headerTitle = header.c) == null || !headerTitle.f) {
            return (newsEntry instanceof l490) && (s = ((l490) newsEntry).s()) != null && s.i(256);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean E(NewsEntry newsEntry) {
        Owner s;
        EntryHeader header;
        HeaderTitle headerTitle;
        return ((newsEntry instanceof wsx0) && (header = ((wsx0) newsEntry).getHeader()) != null && (headerTitle = header.c) != null && headerTitle.h) || ((newsEntry instanceof l490) && (s = ((l490) newsEntry).s()) != null && s.i(16384));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean F(NewsEntry newsEntry) {
        Owner s;
        EntryHeader header;
        HeaderTitle headerTitle;
        if (!(newsEntry instanceof wsx0) || (header = ((wsx0) newsEntry).getHeader()) == null || (headerTitle = header.c) == null || !headerTitle.g) {
            return (newsEntry instanceof l490) && (s = ((l490) newsEntry).s()) != null && s.i(8192);
        }
        return true;
    }

    public static final boolean G(VideoAttachment videoAttachment) {
        ClickableStickers clickableStickers;
        ClickableMarketItem Bb;
        Good good;
        VideoFile videoFile = videoAttachment.k;
        MarketItemType marketItemType = null;
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        if (clipVideoFile != null && (clickableStickers = clipVideoFile.C1) != null && (Bb = clickableStickers.Bb()) != null && (good = Bb.j) != null) {
            marketItemType = good.f;
        }
        return marketItemType == MarketItemType.OZON;
    }

    public static final boolean H(NewsEntry newsEntry) {
        return (newsEntry instanceof ShitAttachment) && ((ShitAttachment) newsEntry).Gb();
    }

    public static final boolean I(NewsEntry newsEntry) {
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post != null ? post.Tb() : false) {
            return ((newsEntry instanceof Post) && ((Post) newsEntry).jc()) ? false : true;
        }
        Object Q = newsEntry != null ? Q(newsEntry) : null;
        o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
        return o2f0Var != null && o2f0Var.T8();
    }

    public static final boolean J(Videos videos) {
        Caption caption = videos.p;
        return epx.f(caption != null ? caption.b : null, "recommended_clip") || videos.Ea();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (xsna.epx.f(r6.o, r6.Q) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if ((((com.vk.dto.newsfeed.entries.Videos) r5).y & 2) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean K(NewsEntry newsEntry, s1c0 s1c0Var) {
        boolean zb;
        if (s1c0Var == null || s1c0Var.n) {
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                if (post.l.zb(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
                }
                zb = false;
            } else {
                if (!(newsEntry instanceof Videos)) {
                    if (newsEntry instanceof ShitAttachment) {
                        zb = ((ShitAttachment) newsEntry).e0.zb(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED);
                    }
                }
                zb = false;
            }
            if (zb && (e(newsEntry) == null || H(newsEntry))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean L(NewsEntry newsEntry) {
        ArrayList<EntryAttachment> arrayList;
        return (newsEntry instanceof Videos) && (arrayList = ((Videos) newsEntry).o) != null && arrayList.size() == 1;
    }

    public static final boolean M(NewsEntry newsEntry) {
        Post R;
        Flags flags;
        return (newsEntry == null || (R = R(newsEntry)) == null || (flags = R.l) == null || !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) ? false : true;
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.j1 N(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var, izs izsVar) {
        return m1Var.U(new j630(new b140(izsVar), 6));
    }

    public static final boolean O(HeaderAction headerAction, Context context, NewsEntry newsEntry) {
        if (headerAction instanceof ActionOpenCopyright) {
            Post R = newsEntry != null ? R(newsEntry) : null;
            if (R == null) {
                return false;
            }
            new mtj().a(context, R);
            return true;
        }
        if (headerAction instanceof ActionOpenModal) {
            new yzk0.a(context, (ActionOpenModal) headerAction).I0(null);
            return true;
        }
        if (!(headerAction instanceof ActionRemote)) {
            return false;
        }
        Action action = ((ActionRemote) headerAction).b;
        return (action != null ? w(action, context, null, null, null, null, 62) : null) != null;
    }

    public static final void P(HeaderTooltip headerTooltip, View view) {
        Tooltip.l(new Tooltip(view.getContext(), null, headerTooltip.b, null, null, null, null, e3m.f(R.attr.vk_ui_background_modal_inverse, view.getContext()), view.getContext().getColor(dhr0.M() ? R.color.vk_black : R.color.vk_white), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -392, 15), view.getContext(), new RectF(f4m.e(view)), false, false, false, false, 236);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c6z Q(NewsEntry newsEntry) {
        ShitAttachment shitAttachment;
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        if (newsEntry instanceof c6z) {
            return (c6z) newsEntry;
        }
        if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof VideoAttachment) {
                return ((VideoAttachment) gmqVar).k.Pa();
            }
            if (gmqVar instanceof Post) {
                return (c6z) gmqVar;
            }
        } else if ((newsEntry instanceof ShitAttachment) && (videoAttachment = (shitAttachment = (ShitAttachment) newsEntry).I) != null && (videoFile = videoAttachment.k) != null) {
            if (!shitAttachment.Gb()) {
                videoFile = null;
            }
            if (videoFile != null) {
                return videoFile.Pa();
            }
        }
        return null;
    }

    public static final Post R(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            return (Post) newsEntry;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).n;
        }
        if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                return (Post) gmqVar;
            }
        }
        return null;
    }

    public static final AdsChoices a(NewsEntry newsEntry) {
        if (newsEntry instanceof Html5Entry) {
            return ((Html5Entry) newsEntry).I;
        }
        if (newsEntry instanceof ShitAttachment) {
            return ((ShitAttachment) newsEntry).f0;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).E;
        }
        if (newsEntry instanceof MyTargetNativeAdEntry) {
            return up50.a((MyTargetNativeAdEntry) newsEntry);
        }
        return null;
    }

    public static final String b(NewsEntry newsEntry) {
        if (newsEntry instanceof ShitAttachment) {
            return ((ShitAttachment) newsEntry).U;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).x;
        }
        if (newsEntry instanceof Html5Entry) {
            return ((Html5Entry) newsEntry).C;
        }
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).H;
        }
        return null;
    }

    public static final ArrayList c(String str, NewsEntry newsEntry) {
        AdsChoices a2 = a(newsEntry);
        List<AdsChoicesOptions> list = a2 != null ? a2.f : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AdsChoicesOptions adsChoicesOptions : list) {
                Integer num = newsEntry instanceof MyTargetNativeAdEntry ? -1 : adsChoicesOptions.h;
                String str2 = adsChoicesOptions.d;
                String str3 = adsChoicesOptions.b;
                if (epx.f(adsChoicesOptions.c, str) && num != null && str2 != null && str3 != null) {
                    arrayList.add(new MyTargetAdsComplainOptions(num.intValue(), str2, str3));
                }
            }
        }
        return arrayList;
    }

    public static final String d(NewsEntry newsEntry) {
        if (newsEntry instanceof ShitAttachment) {
            return ((ShitAttachment) newsEntry).c0;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).D;
        }
        if (newsEntry instanceof Html5Entry) {
            return ((Html5Entry) newsEntry).H;
        }
        return null;
    }

    public static final String e(NewsEntry newsEntry) {
        if (newsEntry instanceof ShitAttachment) {
            return ((ShitAttachment) newsEntry).T;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).w;
        }
        if (newsEntry instanceof Html5Entry) {
            return ((Html5Entry) newsEntry).B;
        }
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).G;
        }
        return null;
    }

    public static final List<NewsfeedResearchEvent> f(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            NewsfeedResearch newsfeedResearch = ((Post) newsEntry).g0;
            if (newsfeedResearch != null) {
                return newsfeedResearch.c;
            }
            return null;
        }
        if (newsEntry instanceof DzenNews) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = ((DzenNews) newsEntry).j.iterator();
            while (it.hasNext()) {
                List<NewsfeedResearchEvent> f = f(((DzenNewsItem) it.next()).e);
                if (f != null) {
                    arrayList.addAll(f);
                }
            }
            return arrayList;
        }
        if (newsEntry instanceof DzenStory) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = ((DzenStory) newsEntry).j.iterator();
            while (it2.hasNext()) {
                NewsfeedResearch newsfeedResearch2 = ((DzenStory.DzenStoryItem) it2.next()).h;
                if (newsfeedResearch2 != null) {
                    arrayList2.addAll(newsfeedResearch2.c);
                }
            }
            return arrayList2;
        }
        if (newsEntry instanceof DzenArticlesBlock) {
            ArrayList arrayList3 = new ArrayList();
            if (com.vk.toggle.d.G()) {
                Iterator<T> it3 = ((DzenArticlesBlock) newsEntry).k.iterator();
                while (it3.hasNext()) {
                    NewsfeedResearch newsfeedResearch3 = ((DzenArticleBlockItem) it3.next()).g;
                    if (newsfeedResearch3 != null) {
                        arrayList3.addAll(newsfeedResearch3.c);
                    }
                }
            }
            return arrayList3;
        }
        if (newsEntry instanceof DiscoverMediaBlock) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = ((DiscoverMediaBlock) newsEntry).j.iterator();
            while (it4.hasNext()) {
                List<NewsfeedResearchEvent> f2 = f(((DiscoverGridItem) it4.next()).c);
                if (f2 != null) {
                    arrayList4.addAll(f2);
                }
            }
            return arrayList4;
        }
        if (!(newsEntry instanceof Digest)) {
            return null;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it5 = ((Digest) newsEntry).m.iterator();
        while (it5.hasNext()) {
            NewsfeedResearch newsfeedResearch4 = ((DigestItem) it5.next()).g.g0;
            if (newsfeedResearch4 != null) {
                arrayList5.addAll(newsfeedResearch4.c);
            }
        }
        return arrayList5;
    }

    public static final List<String> g(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            NewsfeedResearch newsfeedResearch = ((Post) newsEntry).g0;
            if (newsfeedResearch != null) {
                return newsfeedResearch.b;
            }
            return null;
        }
        if (newsEntry instanceof DzenNews) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = ((DzenNews) newsEntry).j.iterator();
            while (it.hasNext()) {
                List<String> g = g(((DzenNewsItem) it.next()).e);
                if (g != null) {
                    arrayList.addAll(g);
                }
            }
            return arrayList;
        }
        if (newsEntry instanceof DzenStory) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = ((DzenStory) newsEntry).j.iterator();
            while (it2.hasNext()) {
                NewsfeedResearch newsfeedResearch2 = ((DzenStory.DzenStoryItem) it2.next()).h;
                if (newsfeedResearch2 != null) {
                    arrayList2.addAll(newsfeedResearch2.b);
                }
            }
            return arrayList2;
        }
        if (newsEntry instanceof DzenArticlesBlock) {
            ArrayList arrayList3 = new ArrayList();
            if (com.vk.toggle.d.G()) {
                Iterator<T> it3 = ((DzenArticlesBlock) newsEntry).k.iterator();
                while (it3.hasNext()) {
                    NewsfeedResearch newsfeedResearch3 = ((DzenArticleBlockItem) it3.next()).g;
                    if (newsfeedResearch3 != null) {
                        arrayList3.addAll(newsfeedResearch3.b);
                    }
                }
            }
            return arrayList3;
        }
        if (newsEntry instanceof DiscoverMediaBlock) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = ((DiscoverMediaBlock) newsEntry).j.iterator();
            while (it4.hasNext()) {
                List<String> g2 = g(((DiscoverGridItem) it4.next()).c);
                if (g2 != null) {
                    arrayList4.addAll(g2);
                }
            }
            return arrayList4;
        }
        if (!(newsEntry instanceof Digest)) {
            return null;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it5 = ((Digest) newsEntry).m.iterator();
        while (it5.hasNext()) {
            NewsfeedResearch newsfeedResearch4 = ((DigestItem) it5.next()).g.g0;
            if (newsfeedResearch4 != null) {
                arrayList5.addAll(newsfeedResearch4.b);
            }
        }
        return arrayList5;
    }

    public static final float h(NewsEntry newsEntry) {
        AttachmentsMeta attachmentsMeta;
        Float f = null;
        if (newsEntry instanceof FaveEntry) {
            Object obj = ((FaveEntry) newsEntry).i.f;
            NewsEntry newsEntry2 = obj instanceof NewsEntry ? (NewsEntry) obj : null;
            if (newsEntry2 != null) {
                f = Float.valueOf(h(newsEntry2));
            }
        } else if (newsEntry instanceof Post) {
            AttachmentsMeta attachmentsMeta2 = ((Post) newsEntry).A;
            if (attachmentsMeta2 != null) {
                f = Float.valueOf(attachmentsMeta2.c);
            }
        } else if ((newsEntry instanceof PromoPost) && (attachmentsMeta = ((PromoPost) newsEntry).n.A) != null) {
            f = Float.valueOf(attachmentsMeta.c);
        }
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public static final VideoAttachment i(Post post) {
        Object obj;
        Iterator<T> it = post.z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EntryAttachment) obj).b instanceof VideoAttachment) {
                break;
            }
        }
        EntryAttachment entryAttachment = (EntryAttachment) obj;
        Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        if (videoAttachment == null || !videoAttachment.C2()) {
            videoAttachment = null;
        }
        if (videoAttachment != null) {
            return videoAttachment;
        }
        Post post2 = post.D;
        if (post2 != null) {
            return i(post2);
        }
        return null;
    }

    public static final VideoAttachment j(Videos videos) {
        EntryAttachment entryAttachment;
        ArrayList<EntryAttachment> arrayList = videos.o;
        Attachment attachment = (arrayList == null || (entryAttachment = (EntryAttachment) j5g.a0(arrayList)) == null) ? null : entryAttachment.b;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        if ((videoAttachment != null ? videoAttachment.k : null) instanceof ClipVideoFile) {
            return videoAttachment;
        }
        return null;
    }

    public static final VideoAttachment k(FaveEntry faveEntry) {
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof VideoAttachment) {
            return (VideoAttachment) gmqVar;
        }
        return null;
    }

    public static final VideoAttachment l(NewsEntry newsEntry) {
        if (newsEntry instanceof Videos) {
            return j((Videos) newsEntry);
        }
        if (newsEntry instanceof FaveEntry) {
            return k((FaveEntry) newsEntry);
        }
        if (newsEntry instanceof Post) {
            return i((Post) newsEntry);
        }
        return null;
    }

    public static final String m(DisclaimerData disclaimerData, Context context) {
        int i = a.$EnumSwitchMapping$0[disclaimerData.b.ordinal()];
        if (i == 1) {
            return context.getString(R.string.accessibility_disclaimer_supplement);
        }
        if (i == 2) {
            return context.getString(R.string.accessibility_disclaimer_drug);
        }
        if (i == 3) {
            return context.getString(R.string.accessibility_disclaimer_loan);
        }
        if (i == 4) {
            return context.getString(R.string.accessibility_disclaimer_bankruptcy);
        }
        if (i == 5) {
            return context.getString(R.string.accessibility_disclaimer_energetics);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int n(NewsEntry newsEntry) {
        Integer num;
        VideoFile videoFile;
        Photo photo;
        if (newsEntry instanceof Post) {
            num = Integer.valueOf(((Post) newsEntry).n);
        } else if (newsEntry instanceof PromoPost) {
            num = Integer.valueOf(((PromoPost) newsEntry).n.n);
        } else if (newsEntry instanceof Photos) {
            PhotoAttachment Mb = ((Photos) newsEntry).Mb();
            if (Mb != null && (photo = Mb.l) != null) {
                num = Integer.valueOf(photo.c);
            }
            num = null;
        } else if (newsEntry instanceof Videos) {
            VideoAttachment Nb = ((Videos) newsEntry).Nb();
            if (Nb != null && (videoFile = Nb.k) != null) {
                num = Integer.valueOf(videoFile.o0());
            }
            num = null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final boolean o(wsx0 wsx0Var) {
        SourcePhoto sourcePhoto;
        List<Owner> list;
        EntryHeader header = wsx0Var.getHeader();
        return ((header == null || (sourcePhoto = header.b) == null || (list = sourcePhoto.b) == null) ? 0 : list.size()) > 1;
    }

    public static final boolean p(Post post) {
        if (post == null || M(post)) {
            return false;
        }
        Post R = R(post);
        return ("topic".equals(R != null ? R.t : null) || post.Ub() || C(post)) ? false : true;
    }

    public static final boolean q(NewsEntry newsEntry) {
        if (newsEntry != null) {
            int zb = newsEntry.zb();
            if (zb != 0) {
                if (zb != 1) {
                    if (zb == 2) {
                        return L(newsEntry);
                    }
                    if (zb != 5) {
                        if (zb != 7 && zb != 9) {
                            if (zb != 14 && zb != 17 && zb != 22 && zb != 64) {
                                if (zb == 11) {
                                    return H(newsEntry);
                                }
                                if (zb != 12) {
                                }
                            }
                        }
                    }
                }
                return (newsEntry instanceof Photos) && ((Photos) newsEntry).q.size() == 1;
            }
            return true;
        }
        return false;
    }

    public static final AttachmentsMeta.PrimaryMode r(NewsEntry newsEntry) {
        if (newsEntry instanceof FaveEntry) {
            Object obj = ((FaveEntry) newsEntry).i.f;
            NewsEntry newsEntry2 = obj instanceof NewsEntry ? (NewsEntry) obj : null;
            if (newsEntry2 != null) {
                return r(newsEntry2);
            }
            return null;
        }
        if (newsEntry instanceof Post) {
            AttachmentsMeta attachmentsMeta = ((Post) newsEntry).A;
            if (attachmentsMeta != null) {
                return attachmentsMeta.b;
            }
            return null;
        }
        if (!(newsEntry instanceof PromoPost)) {
            if (newsEntry instanceof AttachmentsNewsEntry) {
                return AttachmentsMeta.PrimaryMode.SINGLE;
            }
            return null;
        }
        AttachmentsMeta attachmentsMeta2 = ((PromoPost) newsEntry).n.A;
        if (attachmentsMeta2 != null) {
            return attachmentsMeta2.b;
        }
        return null;
    }

    public static final Float s(NewsEntry newsEntry) {
        AttachmentsMeta attachmentsMeta;
        if (newsEntry instanceof FaveEntry) {
            Object obj = ((FaveEntry) newsEntry).i.f;
            NewsEntry newsEntry2 = obj instanceof NewsEntry ? (NewsEntry) obj : null;
            if (newsEntry2 != null) {
                return s(newsEntry2);
            }
            return null;
        }
        if (newsEntry instanceof Post) {
            AttachmentsMeta attachmentsMeta2 = ((Post) newsEntry).A;
            if (attachmentsMeta2 != null) {
                return attachmentsMeta2.e;
            }
            return null;
        }
        if (!(newsEntry instanceof PromoPost) || (attachmentsMeta = ((PromoPost) newsEntry).n.A) == null) {
            return null;
        }
        return attachmentsMeta.e;
    }

    public static final String t(NewsEntry newsEntry) {
        if (newsEntry instanceof ShitAttachment) {
            return ((ShitAttachment) newsEntry).b0;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).C;
        }
        if (newsEntry instanceof Html5Entry) {
            return ((Html5Entry) newsEntry).G;
        }
        return null;
    }

    public static final int u(NewsEntry newsEntry) {
        VideoFileOld videoFileOld;
        Integer num;
        Integer num2;
        if (newsEntry instanceof Post) {
            return rv60.f(newsEntry) ? rv60.c((Post) newsEntry, true) : n(newsEntry);
        }
        if (!(newsEntry instanceof Videos)) {
            return n(newsEntry);
        }
        ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            VideoAttachment Nb = ((Videos) newsEntry).Nb();
            Parcelable parcelable = Nb != null ? Nb.k : null;
            videoFileOld = parcelable instanceof VideoFileOld ? (VideoFileOld) parcelable : null;
            return (videoFileOld == null || (num2 = videoFileOld.x1) == null) ? n(newsEntry) : num2.intValue();
        }
        VideoAttachment Nb2 = ((Videos) newsEntry).Nb();
        VideoFile videoFile = Nb2 != null ? Nb2.k : null;
        videoFileOld = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        return (videoFileOld == null || (num = videoFileOld.x1) == null) ? n(newsEntry) : num.intValue();
    }

    public static final boolean v(NewsEntry newsEntry) {
        return newsEntry instanceof Html5Entry ? ((Html5Entry) newsEntry).I != null : newsEntry instanceof ShitAttachment ? ((ShitAttachment) newsEntry).f0 != null : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).E != null : (newsEntry instanceof MyTargetNativeAdEntry) && up50.a((MyTargetNativeAdEntry) newsEntry) != null;
    }

    public static s3q0 w(Action action, Context context, NewsEntry newsEntry, String str, String str2, List list, int i) {
        NewsEntry newsEntry2 = (i & 2) != 0 ? null : newsEntry;
        String str3 = (i & 4) != 0 ? null : str;
        String str4 = (i & 8) != 0 ? null : str2;
        List list2 = (i & 16) != 0 ? null : list;
        if (action == null) {
            return null;
        }
        hd60.a().v(action, context, (r20 & 4) != 0 ? null : newsEntry2, (r20 & 8) != 0 ? null : str3, (r20 & 16) != 0 ? null : str4, (r20 & 32) != 0 ? null : list2, null, (r20 & 128) != 0 ? null : 423);
        return s3q0.a;
    }

    public static final boolean x(NewsEntry newsEntry) {
        if (newsEntry != null) {
            return newsEntry.zb() == 12 || newsEntry.zb() == 11 || newsEntry.zb() == 29 || newsEntry.zb() == 67 || newsEntry.zb() == 69 || newsEntry.zb() == 66;
        }
        return false;
    }

    public static final boolean y(NewsEntry newsEntry) {
        if (!(newsEntry instanceof PromoPost)) {
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post == null || !post.F) {
                return false;
            }
        }
        return true;
    }

    public static final boolean z(NewsEntry newsEntry) {
        Caption caption;
        if (newsEntry instanceof Videos) {
            caption = ((Videos) newsEntry).p;
        } else {
            Post R = R(newsEntry);
            caption = R != null ? R.x : null;
        }
        return epx.f(caption != null ? caption.b : null, "fake_news");
    }
}
