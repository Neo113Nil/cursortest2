package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.AwayLink;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.Artist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.header.EntryHeader;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FaveConverterImpl.kt */
/* loaded from: classes18.dex */
public final class gnq implements fnq {
    public static final gnq a = new gnq();

    /* compiled from: FaveConverterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveType.values().length];
            try {
                iArr[FaveType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaveType.ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaveType.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaveType.PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FaveType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FaveType.CLIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FaveType.PODCAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FaveType.NARRATIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EntryHeader b(gmq gmqVar) {
        return gmqVar instanceof wsx0 ? ((wsx0) gmqVar).getHeader() : pwu.b(c(gmqVar));
    }

    public static Owner c(gmq gmqVar) {
        Image image;
        ImageSize Cb;
        if (gmqVar instanceof ArticleAttachment) {
            return ((ArticleAttachment) gmqVar).f.h;
        }
        String str = null;
        if (!(gmqVar instanceof VideoAttachment)) {
            if (gmqVar instanceof FaveMarketItem) {
                return ((FaveMarketItem) gmqVar).b.M;
            }
            if (gmqVar instanceof MarketFavable) {
                return ((MarketFavable) gmqVar).d;
            }
            if (gmqVar instanceof PodcastAttachment) {
                return ((PodcastAttachment) gmqVar).g;
            }
            if (gmqVar instanceof Narrative) {
                return ((Narrative) gmqVar).f;
            }
            if (gmqVar instanceof l490) {
                return ((l490) gmqVar).s();
            }
            return null;
        }
        Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
        owner.b = videoAttachment.k.I0();
        Owner s = videoAttachment.k.s();
        boolean z = false;
        owner.q = s != null && s.q;
        VideoFile videoFile = videoAttachment.k;
        if (videoFile instanceof MusicVideoFile) {
            List<Artist> list = ((MusicVideoFile) videoFile).B1;
            Artist artist = list != null ? (Artist) j5g.a0(list) : null;
            owner.c = artist != null ? artist.c : null;
            List<Artist> list2 = ((MusicVideoFile) videoAttachment.k).B1;
            Artist artist2 = list2 != null ? (Artist) j5g.a0(list2) : null;
            if (artist2 != null && (image = artist2.f) != null && (Cb = image.Cb(300, true, false)) != null) {
                str = Cb.d.d;
            }
            owner.e = str;
            owner.g(32, true);
        } else {
            owner.c = videoFile.P();
            owner.e = videoAttachment.k.M0();
        }
        Owner s2 = videoAttachment.k.s();
        if (s2 != null && s2.i(1024)) {
            z = true;
        }
        owner.B(z);
        return owner;
    }

    public static UserId d(gmq gmqVar) {
        if (gmqVar instanceof Post) {
            return ((Post) gmqVar).m;
        }
        if (gmqVar instanceof ArticleAttachment) {
            return ((ArticleAttachment) gmqVar).f.c;
        }
        if ((gmqVar instanceof SnippetAttachment) || (gmqVar instanceof LinkAttachment) || (gmqVar instanceof abz)) {
            return null;
        }
        if (gmqVar instanceof FaveMarketItem) {
            return ((FaveMarketItem) gmqVar).b.c;
        }
        if (gmqVar instanceof VideoAttachment) {
            return ((VideoAttachment) gmqVar).k.I0();
        }
        if (gmqVar instanceof PodcastAttachment) {
            return ((PodcastAttachment) gmqVar).f.c;
        }
        if (gmqVar instanceof Narrative) {
            return ((Narrative) gmqVar).c;
        }
        if (gmqVar instanceof MarketFavable) {
            return ((MarketFavable) gmqVar).c;
        }
        return null;
    }

    public static FaveType e(gmq gmqVar) {
        if (gmqVar instanceof Post) {
            return FaveType.POST;
        }
        if (gmqVar instanceof ArticleAttachment) {
            return FaveType.ARTICLE;
        }
        if (gmqVar instanceof SnippetAttachment) {
            return FaveType.LINK;
        }
        if (gmqVar instanceof VideoAttachment) {
            return ((VideoAttachment) gmqVar).C2() ? FaveType.CLIP : FaveType.VIDEO;
        }
        if ((gmqVar instanceof FaveMarketItem) || (gmqVar instanceof MarketFavable)) {
            return FaveType.PRODUCT;
        }
        if (gmqVar instanceof LinkAttachment) {
            return FaveType.LINK;
        }
        if (gmqVar instanceof abz) {
            return FaveType.LINK;
        }
        if (gmqVar instanceof e9z) {
            return FaveType.LINK;
        }
        if (gmqVar instanceof PodcastAttachment) {
            return FaveType.PODCAST;
        }
        if (gmqVar instanceof Narrative) {
            return FaveType.NARRATIVE;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String f(gmq gmqVar, boolean z) {
        if (gmqVar instanceof Post) {
            return String.valueOf(((Post) gmqVar).n);
        }
        if (gmqVar instanceof ArticleAttachment) {
            return String.valueOf(((ArticleAttachment) gmqVar).f.b);
        }
        if (gmqVar instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) gmqVar;
            return z ? snippetAttachment.f.b : snippetAttachment.x;
        }
        if (gmqVar instanceof LinkAttachment) {
            return ((LinkAttachment) gmqVar).f.b;
        }
        if (gmqVar instanceof abz) {
            return null;
        }
        if (gmqVar instanceof FaveMarketItem) {
            return String.valueOf(((FaveMarketItem) gmqVar).b.b);
        }
        if (gmqVar instanceof VideoAttachment) {
            return String.valueOf(((VideoAttachment) gmqVar).k.o0());
        }
        if (gmqVar instanceof PodcastAttachment) {
            return String.valueOf(((PodcastAttachment) gmqVar).f.b);
        }
        if (gmqVar instanceof Narrative) {
            return String.valueOf(((Narrative) gmqVar).b);
        }
        if (gmqVar instanceof MarketFavable) {
            return String.valueOf(((MarketFavable) gmqVar).b);
        }
        return null;
    }

    public static final SnippetAttachment g(Photo photo, String str, boolean z) {
        return new SnippetAttachment("", "", "", new AwayLink(str, null, 2, null), "", photo, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, z, null, false, null, null, null, null, null, null, null, 0, null);
    }

    @Override // xsna.fnq
    public final FavePage a(ExtendedUserProfile extendedUserProfile) {
        UserProfile userProfile = extendedUserProfile.a;
        String str = userProfile.C() ? "group" : "user";
        xuo0.a.getClass();
        return new FavePage(str, null, xuo0.c(), extendedUserProfile.a.l0(), userProfile.C() ? userProfile.e : userProfile.d, userProfile.n, extendedUserProfile.l, EmptyList.b);
    }
}
