package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersPinToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersUnpinFromMainTabItemTypeDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.attachments.VideoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ej90;

/* compiled from: WallRemoteRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class eax0 implements cax0 {
    public final n9x0 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new ltb0(19));

    public eax0(n9x0 n9x0Var) {
        this.a = n9x0Var;
    }

    public static void w(Post post) {
        boolean zb = post.l.zb(33554432L);
        Flags flags = post.l;
        flags.Ab(2L, (zb || flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) ? false : true);
        flags.Ab(16777216L, zb);
        flags.Ab(33554432L, !zb);
    }

    public static void x(Post post, String str, ej90.b bVar) {
        ej90.c cVar = new ej90.c(0);
        post.s = str;
        if (post.P != null) {
            FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                return;
            }
            post.P = ej90.a.a(str, bVar, cVar);
            post.l.Ab(68719476736L, cVar.a);
        }
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.single.r a(Post post, String str, ObsceneTextFilter obsceneTextFilter, String str2) {
        ej90.b bVar = new ej90.b(post.K, post.N.d, null, obsceneTextFilter, null, 0, 0, null, null, 500);
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(lax0.l(new max0(), post.n, post.m, null, null, str, null, null, null, null, null, null, Integer.valueOf(post.r), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, -4116, 510))), new cxd0(new ix50(post, str, bVar, this), 19));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 b(String str, UserId userId, OwnersPinToMainTabItemTypeDto ownersPinToMainTabItemTypeDto) {
        tfx tfxVar = new tfx("owners.pinToMainTab", new pm0(25), new tf3(24));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", ownersPinToMainTabItemTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "item_id", str, 0, 0, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 c(String str, UserId userId, OwnersUnpinFromMainTabItemTypeDto ownersUnpinFromMainTabItemTypeDto) {
        tfx tfxVar = new tfx("owners.unpinFromMainTab", new eq0(22), new k73(25));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", ownersUnpinFromMainTabItemTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "item_id", str, 0, 0, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w d(Post post) {
        UserId userId = post.m;
        int i = post.n;
        tfx tfxVar = new tfx("wall.openComments", new bzk0(4), new n5e0(7));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        return rsg0.Z(yfb.x(tfxVar)).g(new lcb(this, post));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [xsna.i860, xsna.j960, xsna.rsg0] */
    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.single.y e(Post post, z6c0 z6c0Var) {
        v9x0 v9x0Var;
        int i = post.n;
        FeedFeatures feedFeatures = FeedFeatures.WALL_POST_ROLLBACK;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            UserId userId = post.m;
            ?? j960Var = new j960();
            j960Var.F(userId, "owner_id");
            j960Var.C(i, "post_id");
            j960Var.K0(z6c0Var.b);
            String str = z6c0Var.c;
            v9x0Var = j960Var;
            if (str != null) {
                j960Var.K("ref", str);
                v9x0Var = j960Var;
            }
        } else {
            v9x0Var = new v9x0(new bax0(post.m, null, null, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z6c0Var.b, z6c0Var.c, null, null, null, null, null, null, false, null, false, false, false, null, Integer.valueOf(i), null, null, null, null, null, null, null, null, null, -402653186, 523775));
        }
        return rsg0.W(v9x0Var, 7).l(new oe40(new qjl0(post, 23), 20));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 f(String str, UserId userId, OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto) {
        tfx tfxVar = new tfx("owners.addToMainTab", new cq(24), new dq(23));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", ownersAddToMainTabItemTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "item_id", str, 0, 0, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w g(Post post) {
        UserId userId = post.m;
        int i = post.n;
        tfx tfxVar = new tfx("wall.closeComments", new wga0(10), new uul0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        return rsg0.Z(yfb.x(tfxVar)).g(new cm4(this, post));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.cax0
    public final io.reactivex.rxjava3.core.a h(NewsEntry newsEntry, z6c0 z6c0Var) {
        rsg0 H0;
        boolean z = z6c0Var.a;
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            String str = post.t;
            int i = post.n;
            UserId userId = post.m;
            Integer num = post.u;
            if (num != null) {
                UserId userId2 = post.m;
                int i2 = post.n;
                int intValue = num.intValue();
                EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(post.z);
                Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
                VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
                H0 = new zh7(i2, intValue, 0, userId2, null, videoAttachment != null ? videoAttachment.l : null, null);
            } else if ("topic".equals(str)) {
                H0 = new zh7(fkq0.a(userId), i);
            } else if ("market".equals(str)) {
                H0 = yfb.y(((xd10) this.b.getValue()).c(i, userId), new dax0(0));
            } else {
                H0 = czk0.H0(newsEntry, Boolean.valueOf(z));
                String str2 = z6c0Var.b;
                if (str2 != null) {
                    H0.K("entry_point", str2);
                } else {
                    H0.getClass();
                }
                String str3 = z6c0Var.c;
                if (str3 != null) {
                    H0.K("ref", str3);
                }
            }
        } else {
            H0 = czk0.H0(newsEntry, Boolean.valueOf(z));
        }
        if (H0 != null) {
            return rsg0.Z(H0);
        }
        return io.reactivex.rxjava3.core.a.k(new IllegalArgumentException("Unsupported NewsEntry: " + newsEntry));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 i(String str, UserId userId, OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto) {
        tfx tfxVar = new tfx("owners.removeFromMainTab", new w11(28), new at(26));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", ownersRemoveFromMainTabItemTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "item_id", str, 0, 0, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.f0 j(UserId userId, UserId userId2) {
        return rsg0.W(yfb.x(new zqu().t(userId, userId2)), 7);
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 k(UserId userId, String str) {
        return rsg0.Z(yfb.x(new max0().b(userId, str)));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 l(int i, UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("wall.rejectCoOwnership", new caf0(6), new ck70(15));
        tfx.n(tfxVar, "post_owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        tfx.n(tfxVar, "co_owner_id", userId2, 0L, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.single.y m(List list) {
        return rsg0.w0(new i730(j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62))).l(new f0j0(new hcs0(6), 17));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 n(int i, UserId userId, UserId userId2) {
        tfx tfxVar = new tfx("wall.acceptCoOwnership", new iub0(7), new uga0(7));
        tfx.n(tfxVar, "post_owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        tfx.n(tfxVar, "co_owner_id", userId2, 0L, 0L, 12);
        return rsg0.Z(yfb.x(tfxVar));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 o(UserId userId, String str) {
        return rsg0.Z(yfb.x(lax0.g(new max0(), userId, str, 4)));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.single.y p(String str, Post post) {
        return rsg0.w0(yfb.x(lax0.n(new max0(), post.m, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(post.n), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, -524290, 2095103))).l(new xb20(new anw0(post, 3), 29));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w q(Post post) {
        int i = post.n;
        tfx tfxVar = new tfx("wall.archive", new bz60(14), new oyh0(6));
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        return rsg0.Z(yfb.x(tfxVar)).g(new dh1(post, 6));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w r(Post post) {
        if (rv60.f(post)) {
            int c = rv60.c(post, true);
            UserId d = rv60.d(post, true);
            tfx tfxVar = new tfx("wall.unpin", new ggj0(10), new bxj0(8));
            tfx.l(tfxVar, "post_id", c, 0, 0, 8);
            if (d != null) {
                tfx.n(tfxVar, "owner_id", d, 0L, 0L, 12);
            }
            return rsg0.Z(yfb.x(tfxVar)).g(new ahe(post, 6));
        }
        UserId userId = post.m;
        int i = post.n;
        tfx tfxVar2 = new tfx("wall.unpin", new ggj0(10), new bxj0(8));
        tfx.l(tfxVar2, "post_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
        }
        return rsg0.Z(yfb.x(tfxVar2)).g(new czw(post, 2));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w s(Post post) {
        return rsg0.Z(new com.vk.newsfeed.impl.requests.b(this.a, post.m, post.n)).g(new bpk(post, 7));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.completable.w t(Post post) {
        return rv60.f(post) ? rsg0.Z(new djl0(rv60.c(post, true), rv60.d(post, true))).g(new zm80(post, 5)) : rsg0.Z(new djl0(post.n, post.m)).g(new y96(post, 4));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.single.y u(String str, Post post) {
        return rsg0.w0(yfb.x(lax0.n(new max0(), post.m, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(post.n), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, -524290, 2095103))).l(new hi70(new ixu0(post, 8), 19));
    }

    @Override // xsna.cax0
    public final io.reactivex.rxjava3.internal.operators.observable.f0 v(UserId userId, UserId userId2) {
        return new com.vk.newsfeed.impl.helpers.a().a(userId, userId2, false).K();
    }
}
