package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.LatestNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.lgj0;

/* compiled from: NewsfeedInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class em60 implements am60 {
    public final fw60 a;
    public final ss60 b;
    public final ce60 c;
    public final x19 d;
    public final Object e;

    public em60(fw60 fw60Var, ss60 ss60Var, rte0 rte0Var, kh60 kh60Var, ce60 ce60Var, x19 x19Var, lbs lbsVar) {
        yk60 yk60Var = yk60.a;
        this.a = fw60Var;
        this.b = ss60Var;
        this.c = ce60Var;
        this.d = x19Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new qo0(27));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.core.a a(Post post) {
        return io.reactivex.rxjava3.internal.operators.completable.i.b;
    }

    @Override // xsna.am60
    public final void b(int i, String str, boolean z, List list) {
        this.b.b.getClass();
        itg0.j(new io.reactivex.rxjava3.internal.operators.maybe.m(new io.reactivex.rxjava3.internal.operators.maybe.l(io.reactivex.rxjava3.subjects.c.b(asu0.a, new io.reactivex.rxjava3.internal.operators.single.v(new yd60(0))), new c8(new ulz(11), 25)), new j630(new zd60(i, str, z, list), 5)).g(new brq(1)), new q8(com.vk.metrics.eventtracking.b.a, 7), 1);
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.y c(iw60 iw60Var, jw60 jw60Var) {
        return new io.reactivex.rxjava3.internal.operators.single.n(wdq.a(this.a.a(iw60Var)), new tmz(new h1(25, jw60Var, iw60Var), 6)).l(new u5(new defpackage.s(24, iw60Var, jw60Var), 24));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.core.x<Boolean> d() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new bhe(this.b, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.am60
    public final io.reactivex.rxjava3.core.a e(NewsEntry newsEntry, UserId userId, String str, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        List singletonList;
        List list;
        String r = newsEntry instanceof c6z ? ((c6z) newsEntry).r() : null;
        if (fkq0.d(userId)) {
            list = Collections.singletonList(userId);
            singletonList = null;
        } else {
            singletonList = Collections.singletonList(fkq0.a(userId));
            list = null;
        }
        return rsg0.Z(yfb.x(new dz60().j(list, singletonList, str, r, newsfeedAddBanTypeDto)));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.r f(mu60 mu60Var) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new ps60(this.b, 0)), new jo3(new js00(7, this, mu60Var), 26));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.core.a g(boolean z) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new rs60(this.b, Boolean.valueOf(z), 0));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.y h(iw60 iw60Var, jw60 jw60Var) {
        io.reactivex.rxjava3.internal.operators.single.n nVar = new io.reactivex.rxjava3.internal.operators.single.n(wdq.a(this.a.a(iw60Var)), new tmz(new h1(25, jw60Var, iw60Var), 6));
        yk60 yk60Var = yk60.a;
        int i = iw60Var.c;
        return new io.reactivex.rxjava3.internal.operators.single.o(yk60.d(i, nVar), new ow40(new cm60(this, i), 4)).l(new u5(new defpackage.s(24, iw60Var, jw60Var), 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    @Override // xsna.am60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<tl60> i(NewsEntry newsEntry, NewsEntry newsEntry2, String str) {
        VideoAttachment Nb;
        long j;
        int i;
        VideoAttachment Nb2;
        int zb;
        String str2;
        if ((newsEntry2 instanceof DiscoverMediaBlock) && !(newsEntry instanceof DiscoverMediaBlock)) {
            DiscoverGridItem Eb = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
            VideoDiscoverGridItem videoDiscoverGridItem = Eb instanceof VideoDiscoverGridItem ? (VideoDiscoverGridItem) Eb : null;
            VideoAttachment videoAttachment = videoDiscoverGridItem != null ? videoDiscoverGridItem.j : null;
            if (videoAttachment != null && videoAttachment.C2()) {
                VideoFile videoFile = videoAttachment.k;
                return rsg0.w0(yfb.x(lgj0.a.m(videoFile.o0(), videoFile.I0(), null))).l(new hl30(new bzw(newsEntry, 13), 5));
            }
        }
        boolean z = newsEntry instanceof Post;
        UserId userId = z ? ((Post) newsEntry).m : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n.m : newsEntry instanceof Photos ? new UserId(((Photos) newsEntry).n) : (!(newsEntry instanceof Videos) || (Nb = ((Videos) newsEntry).Nb()) == null) ? t11.b() : Nb.k.I0();
        if (z) {
            i = ((Post) newsEntry).n;
        } else if (newsEntry instanceof PromoPost) {
            i = ((PromoPost) newsEntry).n.n;
        } else if (newsEntry instanceof Photos) {
            i = ((Photos) newsEntry).m;
        } else if ((newsEntry instanceof Videos) && (Nb2 = ((Videos) newsEntry).Nb()) != null) {
            i = Nb2.k.o0();
        } else {
            if (!(newsEntry instanceof LatestNews)) {
                j = t11.b().b;
                long j2 = j;
                if (z || !((Post) newsEntry).l.zb(256L)) {
                    zb = newsEntry.zb();
                    if (zb == 0) {
                        if (zb != 1) {
                            if (zb == 7) {
                                str2 = "tag";
                            } else if (zb != 9) {
                                str2 = newsEntry.Db();
                            }
                        }
                        str2 = "photo";
                    } else {
                        str2 = "wall";
                    }
                } else {
                    str2 = "profilephoto";
                }
                return rsg0.w0(new sl60(j2, userId, str2, str, newsEntry.Cb().b)).l(new e4t(new aq1(14, newsEntry, this.a), 7));
            }
            i = ((LatestNews) newsEntry).i;
        }
        j = i;
        long j22 = j;
        if (z) {
        }
        zb = newsEntry.zb();
        if (zb == 0) {
        }
        return rsg0.w0(new sl60(j22, userId, str2, str, newsEntry.Cb().b)).l(new e4t(new aq1(14, newsEntry, this.a), 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063  */
    @Override // xsna.am60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.internal.operators.single.y j(NewsEntry newsEntry) {
        VideoAttachment Nb;
        VideoFile videoFile;
        UserId I0;
        UserId userId;
        Number valueOf;
        VideoFile videoFile2;
        String str;
        String r;
        io.reactivex.rxjava3.core.x w0;
        if (di60.x(newsEntry)) {
            w0 = io.reactivex.rxjava3.core.x.k(newsEntry);
        } else {
            UserId b = t11.b();
            boolean z = newsEntry instanceof Post;
            if (z) {
                b = ((Post) newsEntry).m;
            } else if (newsEntry instanceof PromoPost) {
                b = ((PromoPost) newsEntry).n.m;
            } else if (newsEntry instanceof Photos) {
                b = new UserId(((Photos) newsEntry).n);
            } else if ((newsEntry instanceof Videos) && (Nb = ((Videos) newsEntry).Nb()) != null && (videoFile = Nb.k) != null && (I0 = videoFile.I0()) != null) {
                userId = I0;
                long j = t11.b().b;
                if (!z) {
                    valueOf = Integer.valueOf(((Post) newsEntry).n);
                } else if (newsEntry instanceof PromoPost) {
                    valueOf = Integer.valueOf(((PromoPost) newsEntry).n.n);
                } else if (newsEntry instanceof Photos) {
                    valueOf = Integer.valueOf(((Photos) newsEntry).m);
                } else if (newsEntry instanceof Videos) {
                    VideoAttachment Nb2 = ((Videos) newsEntry).Nb();
                    valueOf = (Nb2 == null || (videoFile2 = Nb2.k) == null) ? Long.valueOf(j) : Integer.valueOf(videoFile2.o0());
                } else {
                    valueOf = newsEntry instanceof LatestNews ? Integer.valueOf(((LatestNews) newsEntry).i) : Long.valueOf(j);
                }
                long longValue = valueOf.longValue();
                if (!z ? ((Post) newsEntry).l.zb(256L) : false) {
                    int zb = newsEntry.zb();
                    if (zb != 0) {
                        if (zb != 1) {
                            if (zb == 7) {
                                str = "tag";
                            } else if (zb != 9) {
                                str = newsEntry.Db();
                            }
                        }
                        str = "photo";
                    } else {
                        str = "wall";
                    }
                } else {
                    str = "profilephoto";
                }
                String str2 = str;
                r = !(newsEntry instanceof PromoPost) ? ((PromoPost) newsEntry).r() : newsEntry.Cb().b;
                tfx tfxVar = new tfx("newsfeed.unignoreItem", new pr(28), new qr(22));
                tfx.o(tfxVar, "type", str2, 0, 0, 12);
                if (userId != null) {
                    tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                }
                tfx.m(tfxVar, "item_id", longValue, 0L, 8);
                if (r != null) {
                    tfx.o(tfxVar, "track_code", r, 0, 0, 12);
                }
                w0 = rsg0.w0(yfb.x(tfxVar));
            }
            userId = b;
            long j2 = t11.b().b;
            if (!z) {
            }
            long longValue2 = valueOf.longValue();
            if (!z ? ((Post) newsEntry).l.zb(256L) : false) {
            }
            String str22 = str;
            if (!(newsEntry instanceof PromoPost)) {
            }
            tfx tfxVar2 = new tfx("newsfeed.unignoreItem", new pr(28), new qr(22));
            tfx.o(tfxVar2, "type", str22, 0, 0, 12);
            if (userId != null) {
            }
            tfx.m(tfxVar2, "item_id", longValue2, 0L, 8);
            if (r != null) {
            }
            w0 = rsg0.w0(yfb.x(tfxVar2));
        }
        return w0.l(new zj0(new dm60(newsEntry), 19));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.y k(int i, boolean z, boolean z2) {
        io.reactivex.rxjava3.subjects.h hVar;
        yk60 yk60Var = yk60.a;
        ss60 ss60Var = this.b;
        ce60 ce60Var = ss60Var.b;
        io.reactivex.rxjava3.core.w wVar = ss60Var.c;
        ce60Var.getClass();
        io.reactivex.rxjava3.core.x K = ce60.h(i, wVar, z).y0(6L, TimeUnit.SECONDS).U(new or20(new pey(11), 7)).L(new xb20(new es00(ss60Var, 11), 7), false).U(new s7(new qey(16), 26)).K();
        if (yk60.k.get() && i == 0 && yk60.f.getAndIncrement() == 0 && (hVar = yk60.d.b) != null) {
            io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(hVar, new xb20(new jr3(29), 6)).C(new uk60()), io.reactivex.rxjava3.internal.functions.a.d, new vk60(0)).L(new ac20(new v4w(K, 11), 6), false);
            if (L != 0) {
                K = L.K().n(K);
            }
        }
        return K.l(new x34(new bm60(z, z2, this.d, this), 22));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.y l(iw60 iw60Var, jw60 jw60Var) {
        yk60 yk60Var = yk60.a;
        int i = iw60Var.c;
        return new io.reactivex.rxjava3.internal.operators.single.o(yk60.d(i, new io.reactivex.rxjava3.internal.operators.single.n(wdq.a(this.a.a(iw60Var)), new tmz(new h1(25, jw60Var, iw60Var), 6))), new ow40(new cm60(this, i), 4)).l(new u5(new defpackage.s(24, iw60Var, jw60Var), 24));
    }

    @Override // xsna.am60
    public final io.reactivex.rxjava3.internal.operators.single.d0 m(NewsfeedInitialPost newsfeedInitialPost) {
        StringBuilder sb = new StringBuilder();
        sb.append(newsfeedInitialPost.d());
        sb.append('_');
        sb.append(newsfeedInitialPost.g());
        return rsg0.w0(new i730(sb.toString())).o(EmptyList.b);
    }
}
