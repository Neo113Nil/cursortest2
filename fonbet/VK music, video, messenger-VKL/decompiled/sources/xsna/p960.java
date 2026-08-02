package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gd60;
import xsna.o0r0;

/* compiled from: NewsActionsController.kt */
/* loaded from: classes4.dex */
public final class p960 {
    public final Lazy a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new uz(16));

    public p960(Lazy<? extends NewsFeedComponent> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(p960 p960Var, Context context, NewsEntry newsEntry, String str, String str2, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, NewsEntry newsEntry2, int i) {
        NewsEntry newsEntry3 = (i & 32) != 0 ? null : newsEntry2;
        l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
        p960Var.c(context, newsEntry, str, str2, entryPoint, newsEntry3, l490Var != null ? l490Var.s() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r2 != 9) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(p960 p960Var, Context context, NewsEntry newsEntry, String str) {
        int zb = newsEntry.zb();
        String str2 = null;
        if (zb != 1) {
            if (zb == 2) {
                VideoAttachment Nb = ((Videos) newsEntry).Nb();
                VideoFile videoFile = Nb != null ? Nb.k : null;
                if (videoFile != null) {
                    str2 = videoFile.C1();
                }
            } else if (zb != 7) {
            }
            com.vk.newsfeed.common.helpers.a aVar = new com.vk.newsfeed.common.helpers.a(context);
            aVar.c = str;
            aVar.d = str2;
            aVar.e(newsEntry);
        }
        PhotoAttachment Mb = ((Photos) newsEntry).Mb();
        Photo photo = Mb != null ? Mb.l : null;
        if (photo != null) {
            str2 = photo.v;
        }
        com.vk.newsfeed.common.helpers.a aVar2 = new com.vk.newsfeed.common.helpers.a(context);
        aVar2.c = str;
        aVar2.d = str2;
        aVar2.e(newsEntry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, NewsEntry newsEntry, String str) {
        ReactionSet s4;
        c6z c6zVar = newsEntry instanceof c6z ? (c6z) newsEntry : null;
        if (c6zVar == null) {
            return;
        }
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        ReactionMeta d = (o2f0Var == null || (s4 = o2f0Var.s4()) == null) ? null : c2f0.d(s4, 0);
        boolean z = !c6zVar.J();
        String str2 = newsEntry.Cb().b;
        if (c6zVar instanceof bss0) {
            Serializer.c<Videos> cVar = Videos.CREATOR;
            c6zVar = Videos.a.a(((bss0) c6zVar).t());
        }
        l6z l6zVar = new l6z(c6zVar, z, d, str, str2, null);
        ((NewsFeedComponent) this.a.getValue()).n0();
        iuc0.b.f(context, l6zVar, null, null);
    }

    public final void b(Context context, NewsEntry newsEntry, NewsEntry newsEntry2, String str, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        if (!(newsEntry2 instanceof DiscoverMediaBlock)) {
            d(this, context, newsEntry, str, newsEntry.Cb().b, entryPoint, null, 64);
            return;
        }
        DiscoverGridItem Eb = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
        if (!(Eb instanceof VideoDiscoverGridItem)) {
            d(this, context, newsEntry, str, newsEntry.Cb().b, entryPoint, null, 64);
            return;
        }
        VideoFile videoFile = ((VideoDiscoverGridItem) Eb).j.k;
        if (videoFile instanceof MusicVideoFile) {
            fl4.y(lyd.g(), context, videoFile, null, 12);
        } else {
            xwk.e().m(context, fkq0.c(videoFile.getUid()) ? videoFile.getUid() : videoFile.I0(), new o0r0.a(false, str, null, null, null, null, null, false, false, false, false, null, null, null, 65533));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, NewsEntry newsEntry, String str, String str2, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint, NewsEntry newsEntry2, Owner owner) {
        UserId userId;
        boolean z;
        VideoFile videoFile;
        String str3;
        VideoFile videoFile2;
        SourcePhoto sourcePhoto;
        Owner d;
        HeaderTitle headerTitle;
        Long l = null;
        Long valueOf = null;
        wsx0 wsx0Var = newsEntry instanceof wsx0 ? (wsx0) newsEntry : null;
        EntryHeader header = wsx0Var != null ? wsx0Var.getHeader() : null;
        Post R = di60.R(newsEntry);
        if (R == null || (userId = R.m) == null || !di60.C(newsEntry)) {
            userId = null;
        }
        if (userId == null) {
            userId = owner != null ? owner.b : null;
            if (userId == null) {
                userId = (header == null || (headerTitle = header.c) == null) ? null : headerTitle.d();
                if (userId == null) {
                    userId = (header == null || (sourcePhoto = header.b) == null || (d = sourcePhoto.d()) == null) ? null : d.b;
                    if (userId == null) {
                        return;
                    }
                }
            }
        }
        UserId userId2 = userId;
        long j = userId2.b;
        boolean z2 = newsEntry instanceof Videos;
        if (z2) {
            Attachment R1 = ((Videos) newsEntry).R1();
            if (R1 instanceof VideoAttachment) {
                VideoAttachment videoAttachment = (VideoAttachment) R1;
                if (videoAttachment.k instanceof MusicVideoFile) {
                    fl4.y(lyd.g(), context, videoAttachment.k, null, 12);
                    return;
                }
            }
        } else {
            if (!(newsEntry instanceof FaveEntry)) {
                if (newsEntry instanceof Post) {
                    hd60.a().Z(context, userId2, str, str2, (Post) newsEntry, new gd60.b(owner != null ? owner.c : null, owner != null ? owner.e : null, owner != null ? owner.i(1024) : false, owner != null ? owner.q : false, null, null, 112));
                } else {
                    z = false;
                    if (newsEntry instanceof PromoPost) {
                        hd60.a().E(context, userId2, str, (PromoPost) newsEntry);
                    }
                    hd60.a().L(context, userId2, str, str2, new gd60.b(owner == null ? owner.c : null, owner == null ? owner.e : null, owner == null ? owner.i(1024) : z, owner == null ? owner.q : z, null, newsEntry.Db(), 80));
                }
                ?? r0 = this.b;
                if (newsEntry2 == null) {
                    Long z3 = nr2.z(newsEntry2);
                    UserId e = rv60.e(newsEntry2);
                    Long valueOf2 = e != null ? Long.valueOf(e.b) : null;
                    String str4 = newsEntry2.Cb().b;
                    if (fkq0.b(userId2)) {
                        p2r p2rVar = (p2r) r0.getValue();
                        Long z4 = nr2.z(newsEntry);
                        Integer valueOf3 = z4 != null ? Integer.valueOf((int) z4.longValue()) : null;
                        Long valueOf4 = Long.valueOf(j);
                        p2rVar.getClass();
                        p2r.d(z3, valueOf2, str4, entryPoint, valueOf3, valueOf4);
                    } else {
                        Long l2 = valueOf2;
                        p2r p2rVar2 = (p2r) r0.getValue();
                        Long z5 = nr2.z(newsEntry);
                        Integer valueOf5 = z5 != null ? Integer.valueOf((int) z5.longValue()) : null;
                        Long valueOf6 = Long.valueOf(j);
                        p2rVar2.getClass();
                        p2r.e(z3, l2, str4, entryPoint, valueOf5, valueOf6);
                    }
                } else {
                    long j2 = 0;
                    if (fkq0.b(userId2)) {
                        p2r p2rVar3 = (p2r) r0.getValue();
                        if (newsEntry instanceof Post) {
                            valueOf = Long.valueOf(((Post) newsEntry).n);
                        } else if (newsEntry instanceof PromoPost) {
                            valueOf = Long.valueOf(((PromoPost) newsEntry).n.n);
                        } else if (newsEntry instanceof Photos) {
                            valueOf = Long.valueOf(((Photos) newsEntry).m);
                        } else if (z2) {
                            VideoAttachment Nb = ((Videos) newsEntry).Nb();
                            if (Nb != null && (videoFile2 = Nb.k) != null) {
                                j2 = videoFile2.o0();
                            }
                            valueOf = Long.valueOf(j2);
                        }
                        Long valueOf7 = Long.valueOf(j);
                        Long valueOf8 = Long.valueOf(j);
                        String str5 = newsEntry.Cb().b;
                        str3 = str5 != null ? str5 : "";
                        p2rVar3.getClass();
                        p2r.c(valueOf, valueOf7, valueOf8, str3, entryPoint);
                    } else {
                        p2r p2rVar4 = (p2r) r0.getValue();
                        if (newsEntry instanceof Post) {
                            l = Long.valueOf(((Post) newsEntry).n);
                        } else if (newsEntry instanceof PromoPost) {
                            l = Long.valueOf(((PromoPost) newsEntry).n.n);
                        } else if (newsEntry instanceof Photos) {
                            l = Long.valueOf(((Photos) newsEntry).m);
                        } else if (z2) {
                            VideoAttachment Nb2 = ((Videos) newsEntry).Nb();
                            if (Nb2 != null && (videoFile = Nb2.k) != null) {
                                j2 = videoFile.o0();
                            }
                            l = Long.valueOf(j2);
                        }
                        Long valueOf9 = Long.valueOf(j);
                        Long valueOf10 = Long.valueOf(j);
                        String str6 = newsEntry.Cb().b;
                        str3 = str6 != null ? str6 : "";
                        p2rVar4.getClass();
                        p2r.f(l, valueOf9, valueOf10, str3, entryPoint);
                    }
                }
                if (newsEntry instanceof PromoPost) {
                    return;
                }
                com.vkontakte.android.data.b.o((DeprecatedStatisticInterface) newsEntry, "click_post_owner");
                return;
            }
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            VideoAttachment videoAttachment2 = gmqVar instanceof VideoAttachment ? (VideoAttachment) gmqVar : null;
            VideoFile videoFile3 = videoAttachment2 != null ? videoAttachment2.k : null;
            if (videoFile3 != null && (videoFile3 instanceof MusicVideoFile)) {
                fl4.y(lyd.g(), context, videoFile3, null, 12);
                return;
            }
        }
        z = false;
        hd60.a().L(context, userId2, str, str2, new gd60.b(owner == null ? owner.c : null, owner == null ? owner.e : null, owner == null ? owner.i(1024) : z, owner == null ? owner.q : z, null, newsEntry.Db(), 80));
        ?? r02 = this.b;
        if (newsEntry2 == null) {
        }
        if (newsEntry instanceof PromoPost) {
        }
    }

    public final void e(Context context, NewsEntry newsEntry, NewsEntry newsEntry2, String str) {
        if (!(newsEntry2 instanceof DiscoverMediaBlock)) {
            f(this, context, newsEntry, str);
            return;
        }
        DiscoverGridItem Eb = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
        if (!(Eb instanceof VideoDiscoverGridItem)) {
            f(this, context, newsEntry, str);
        } else {
            w1s0.k(xa4.L(context), ((VideoDiscoverGridItem) Eb).j.k, false);
        }
    }

    public final io.reactivex.rxjava3.disposables.c g(String str, NewsEntry newsEntry) {
        io.reactivex.rxjava3.disposables.c b;
        if (!(newsEntry instanceof FaveEntry)) {
            return EmptyDisposable.INSTANCE;
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (!(gmqVar instanceof VideoAttachment)) {
            return EmptyDisposable.INSTANCE;
        }
        VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
        VideoFile videoFile = videoAttachment.k;
        if (videoFile.j0()) {
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            kv7 kv7Var = new kv7(gmqVar, videoFile, this, 4);
            w1s0 w1s0Var = w1s0.b;
            b = w1s0.i(context2, videoFile, UserId.d, kv7Var);
        } else {
            Context context3 = e43.a;
            b = w1s0.b(context3 != null ? context3 : null, videoFile, str, videoAttachment.m, new cqg(gmqVar, videoFile, this, 5));
        }
        videoFile.Xa(!videoFile.j0());
        ((NewsFeedComponent) this.a.getValue()).w().e(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, newsEntry);
        return b;
    }
}
