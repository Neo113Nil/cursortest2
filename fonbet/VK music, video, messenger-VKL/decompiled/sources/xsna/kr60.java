package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.kr60;
import xsna.yo60;

/* compiled from: NewsfeedListOptionsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class kr60 extends evg0<ur60, on50, ds60.e, ds60, qr60, yo60> {
    public final com.vk.channels.impl.channel_screen.send_msg.c f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final b k;

    /* compiled from: NewsfeedListOptionsTaskExecutor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedNewsfeedItemTypeDto.values().length];
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewsfeedNewsfeedItemTypeDto.INFO_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: NewsfeedListOptionsTaskExecutor.kt */
    public static final class b implements bq60 {
        public b() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            kr60.this.c(yo60Var);
        }
    }

    public kr60(com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy<? extends NewsFeedComponent> lazy, Lazy<? extends BridgeComponent> lazy2, Lazy<? extends LinksGeneratorComponent> lazy3, Lazy<? extends VideoShareComponent> lazy4, jm50 jm50Var, nn50<ur60, on50, ds60, qr60, yo60> nn50Var) {
        super(jm50Var, nn50Var);
        this.f = cVar;
        this.g = lazy2;
        this.h = lazy3;
        this.i = lazy;
        this.j = lazy4;
        this.k = new b();
    }

    public static FaveMarketItem t(NewsEntry newsEntry) {
        if (!(newsEntry instanceof FaveEntry)) {
            return null;
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (gmqVar instanceof FaveMarketItem) {
            return (FaveMarketItem) gmqVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mn50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zvg0 d(ds60.e eVar) {
        ajx c;
        ajx c2;
        ajx c3;
        ajx c4;
        Owner s;
        UserId userId;
        Owner s2;
        UserId userId2;
        Owner s3;
        UserId userId3;
        boolean z = eVar instanceof ds60.e.j;
        Lazy lazy = this.g;
        if (z) {
            ds60.e.j jVar = (ds60.e.j) eVar;
            NewsEntry newsEntry = jVar.b;
            c(new zo60(newsEntry, Integer.valueOf(jVar.c)));
            String b2 = new mc0(((BridgeComponent) lazy.getValue()).s(), ((LinksGeneratorComponent) this.h.getValue()).N7(), ((VideoShareComponent) this.j.getValue()).S()).b(newsEntry);
            if (b2 != null) {
                c(new sp60(b2));
                return null;
            }
        } else {
            boolean z2 = eVar instanceof ds60.e.u;
            int i = 7;
            b bVar = this.k;
            com.vk.channels.impl.channel_screen.send_msg.c cVar = this.f;
            if (z2) {
                final ds60.e.u uVar = (ds60.e.u) eVar;
                final NewsEntry newsEntry2 = uVar.b;
                if (sl60.F0(newsEntry2)) {
                    c(new yo60.c.AbstractC4116c.a(uVar.d, newsEntry2));
                    if (newsEntry2 instanceof Digest) {
                        c(new yo60.c.b.a((Digest) newsEntry2));
                    } else if (!(newsEntry2 instanceof PlaylistsCarousel) && (newsEntry2 instanceof UxPollsEntry)) {
                        c(new aq60(((UxPollsEntry) newsEntry2).i));
                    }
                    return g(wdq.c(v().Aa().i(newsEntry2, uVar.c, cVar.a()), bVar), new rt10(this, i), new io.reactivex.rxjava3.functions.f() { // from class: xsna.jr60
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            tl60 tl60Var = (tl60) obj;
                            boolean z3 = tl60Var.f;
                            kr60 kr60Var = kr60.this;
                            NewsEntry newsEntry3 = newsEntry2;
                            if (z3) {
                                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.f0(newsEntry3)));
                            } else {
                                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.r(newsEntry3)));
                            }
                            if (!tl60Var.f || (uVar.c instanceof DiscoverMediaBlock)) {
                                int i2 = kr60.a.$EnumSwitchMapping$0[tl60Var.g.ordinal()];
                                kr60Var.c(new yo60.g.c(i2 != 1 ? i2 != 2 ? i2 != 3 ? R.string.hide_not_interesting_toast : 0 : R.string.hide_not_interesting_toast_videos : R.string.hide_not_interesting_toast_clips));
                            }
                        }
                    });
                }
            } else {
                int i2 = 8;
                int i3 = 1;
                if (eVar instanceof ds60.e.g0) {
                    NewsEntry newsEntry3 = ((ds60.e.g0) eVar).b;
                    l490 l490Var = newsEntry3 instanceof l490 ? (l490) newsEntry3 : null;
                    if (l490Var != null && (s3 = l490Var.s()) != null && (userId3 = s3.b) != null && fkq0.c(userId3) && !((BridgeComponent) lazy.getValue()).s().a(userId3)) {
                        return h(wdq.b(w().k(userId3, newsEntry3.Cb().b), bVar), new xk30(this, i2), new z2t(i3, newsEntry3, this));
                    }
                } else {
                    int i4 = 14;
                    if (eVar instanceof ds60.e.h0) {
                        NewsEntry newsEntry4 = ((ds60.e.h0) eVar).b;
                        l490 l490Var2 = newsEntry4 instanceof l490 ? (l490) newsEntry4 : null;
                        if (l490Var2 != null && (s2 = l490Var2.s()) != null && (userId2 = s2.b) != null && fkq0.c(userId2) && !((BridgeComponent) lazy.getValue()).s().a(userId2)) {
                            return h(wdq.b(w().o(userId2, newsEntry4.Cb().b), bVar), new ljs(this, i4), new c05(i3, newsEntry4, this));
                        }
                    } else if (eVar instanceof ds60.e.f) {
                        ds60.e.f fVar = (ds60.e.f) eVar;
                        NewsEntry newsEntry5 = fVar.b;
                        l490 l490Var3 = newsEntry5 instanceof l490 ? (l490) newsEntry5 : null;
                        if (l490Var3 != null && (s = l490Var3.s()) != null && (userId = s.b) != null) {
                            c(new yo60.c.AbstractC4116c.a(fVar.c, newsEntry5));
                            a(new ds60.c.a(userId, newsEntry5));
                            return null;
                        }
                    } else {
                        int i5 = 2;
                        if (eVar instanceof ds60.e.C2751e) {
                            ds60.e.C2751e c2751e = (ds60.e.C2751e) eVar;
                            NewsEntry newsEntry6 = c2751e.b;
                            Post post = newsEntry6 instanceof Post ? (Post) newsEntry6 : null;
                            if (post != null) {
                                c(new yo60.c.AbstractC4116c.a(c2751e.c, post));
                                LinkedHashMap t = fvr.t(post);
                                if (t.size() < 2) {
                                    a(new ds60.c.a(post.m, post));
                                    return null;
                                }
                                c(new yo60.e.h(post, t));
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.p) {
                            ds60.e.p pVar = (ds60.e.p) eVar;
                            NewsEntry newsEntry7 = pVar.b;
                            ShitAttachment shitAttachment = newsEntry7 instanceof ShitAttachment ? (ShitAttachment) newsEntry7 : null;
                            if (shitAttachment != null) {
                                x(shitAttachment, new aw0(shitAttachment.i, shitAttachment.j, shitAttachment.v, shitAttachment.X, shitAttachment.W), pVar.c);
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.s) {
                            NewsEntry newsEntry8 = ((ds60.e.s) eVar).b;
                            if ((newsEntry8 instanceof OptionalNativeAdEntry) || (newsEntry8 instanceof YandexNativeAdEntry)) {
                                a(new ds60.c.f(newsEntry8));
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.q) {
                            ds60.e.q qVar = (ds60.e.q) eVar;
                            NewsEntry newsEntry9 = qVar.b;
                            Html5Entry html5Entry = newsEntry9 instanceof Html5Entry ? (Html5Entry) newsEntry9 : null;
                            if (html5Entry != null) {
                                x(html5Entry, new aw0(html5Entry.i, html5Entry.j, html5Entry.x, html5Entry.E, html5Entry.D), qVar.c);
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.t) {
                            ds60.e.t tVar = (ds60.e.t) eVar;
                            NewsEntry newsEntry10 = tVar.b;
                            PromoPost promoPost = newsEntry10 instanceof PromoPost ? (PromoPost) newsEntry10 : null;
                            if (promoPost != null) {
                                x(promoPost, new aw0(promoPost.i, promoPost.j, promoPost.l, promoPost.z, promoPost.y), tVar.c);
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.r) {
                            NewsEntry newsEntry11 = ((ds60.e.r) eVar).b;
                            MyTargetNativeAdEntry myTargetNativeAdEntry = newsEntry11 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry11 : null;
                            if (myTargetNativeAdEntry != null) {
                                if (myTargetNativeAdEntry.y) {
                                    a(new ds60.c.e(myTargetNativeAdEntry));
                                    return null;
                                }
                                a(new ds60.b(new NewsfeedExternalAction.c.x(newsEntry11, MyTargetNativeAdEntry.Eb(myTargetNativeAdEntry, null, null, null, true, null, null, null, 2064383))));
                                return null;
                            }
                        } else if (eVar instanceof ds60.e.w0) {
                            NewsEntry newsEntry12 = ((ds60.e.w0) eVar).b;
                            MyTargetNativeAdEntry myTargetNativeAdEntry2 = newsEntry12 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry12 : null;
                            if (myTargetNativeAdEntry2 != null) {
                                a(new ds60.b(new NewsfeedExternalAction.c.x(newsEntry12, MyTargetNativeAdEntry.Eb(myTargetNativeAdEntry2, null, null, null, false, null, null, null, 2064383))));
                                return null;
                            }
                        } else {
                            int i6 = 0;
                            if (eVar instanceof ds60.e.m) {
                                ds60.e.m mVar = (ds60.e.m) eVar;
                                NewsEntry newsEntry13 = mVar.b;
                                c(new cp60(newsEntry13, Integer.valueOf(mVar.c)));
                                Post post2 = newsEntry13 instanceof Post ? (Post) newsEntry13 : null;
                                if (post2 != null) {
                                    UserId userId4 = post2.m;
                                    return g(wdq.c(myc0.f(post2.Z) ? v().ze().m(Collections.singletonList(post2.Bb())) : io.reactivex.rxjava3.core.x.k(Collections.singletonList(post2)), bVar).l(new o40(new tcu(13), 25)), new g600(this, i2), new gr60(i6, this, (post2.oc() && fkq0.d(userId4)) ? PostingCreationEntryPoint.ProfilePostponedPostsThreePoints : (post2.oc() && fkq0.b(userId4)) ? PostingCreationEntryPoint.GroupPostponedPostsThreePoints : post2.Z1() ? PostingCreationEntryPoint.FeedEditDraftThreeDots : PostingCreationEntryPoint.PostThreeDotMenuEditItem));
                                }
                            } else {
                                if (eVar instanceof ds60.e.l0) {
                                    ds60.e.l0 l0Var = (ds60.e.l0) eVar;
                                    NewsEntry newsEntry14 = l0Var.b;
                                    c(new gp60(newsEntry14, l0Var.c, cVar.a()));
                                    c(new yo60.f.o(cVar.a(), newsEntry14));
                                    return null;
                                }
                                if (eVar instanceof ds60.e.e0) {
                                    ds60.e.e0 e0Var = (ds60.e.e0) eVar;
                                    NewsEntry newsEntry15 = e0Var.b;
                                    c(new hp60(newsEntry15, Integer.valueOf(e0Var.c)));
                                    Post post3 = newsEntry15 instanceof Post ? (Post) newsEntry15 : null;
                                    if (post3 != null) {
                                        d4c0 w = w();
                                        cVar.getClass();
                                        UiTracker uiTracker = UiTracker.a;
                                        return g(wdq.c(w.p(UiTracker.d(), post3), bVar), new lw30(this, i5), new ir60(i6, this, post3));
                                    }
                                } else if (eVar instanceof ds60.e.s0) {
                                    NewsEntry newsEntry16 = ((ds60.e.s0) eVar).b;
                                    Post post4 = newsEntry16 instanceof Post ? (Post) newsEntry16 : null;
                                    if (post4 != null) {
                                        return h(wdq.b(post4.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) ? w().r(post4) : w().t(post4), bVar), new c2y(this, i4), new pk8(i3, this, post4));
                                    }
                                } else if (eVar instanceof ds60.e.o0) {
                                    NewsEntry newsEntry17 = ((ds60.e.o0) eVar).b;
                                    if (newsEntry17 instanceof MyTargetNativeAdEntry) {
                                        gjx gjxVar = ((MyTargetNativeAdEntry) newsEntry17).B;
                                        if (gjxVar != null && (c4 = up50.c(gjxVar, "debug")) != null) {
                                            v().ib().b(gjxVar).b(c4);
                                            return null;
                                        }
                                    } else {
                                        String str = newsEntry17 instanceof PromoPost ? ((PromoPost) newsEntry17).r : newsEntry17 instanceof ShitAttachment ? ((ShitAttachment) newsEntry17).P : null;
                                        if (str != null) {
                                            c(new yo60.e.b(str));
                                            return null;
                                        }
                                    }
                                } else if (eVar instanceof ds60.e.q0) {
                                    NewsEntry newsEntry18 = ((ds60.e.q0) eVar).b;
                                    Post post5 = newsEntry18 instanceof Post ? (Post) newsEntry18 : null;
                                    if (post5 != null) {
                                        return h(wdq.b(post5.Lb() ? w().g(post5) : w().d(post5), bVar), new j3z(this, i), new fwc(this, post5, i5));
                                    }
                                } else {
                                    if (eVar instanceof ds60.e.r0) {
                                        c(new up60(((ds60.e.r0) eVar).b, null));
                                        return null;
                                    }
                                    if (eVar instanceof ds60.e.a) {
                                        NewsEntry newsEntry19 = ((ds60.e.a) eVar).b;
                                        Post post6 = newsEntry19 instanceof Post ? (Post) newsEntry19 : null;
                                        if (post6 != null) {
                                            return h(wdq.b(w().q(post6), bVar), new lkz(this, i2), new hr60(i6, post6, this));
                                        }
                                    } else if (eVar instanceof ds60.e.j0) {
                                        NewsEntry newsEntry20 = ((ds60.e.j0) eVar).b;
                                        Post post7 = newsEntry20 instanceof Post ? (Post) newsEntry20 : null;
                                        if (post7 != null) {
                                            return h(wdq.b(w().s(post7), bVar), new tmz(this, i), new fr60(i6, this, post7));
                                        }
                                    } else if (eVar instanceof ds60.e.l) {
                                        NewsEntry newsEntry21 = ((ds60.e.l) eVar).b;
                                        Post post8 = newsEntry21 instanceof Post ? (Post) newsEntry21 : null;
                                        if (post8 != null) {
                                            return h(v().Aa().a(post8), new ow40(this, 5), new ek5(this, 3));
                                        }
                                    } else if (eVar instanceof ds60.e.f0) {
                                        ds60.e.f0 f0Var = (ds60.e.f0) eVar;
                                        NewsEntry newsEntry22 = f0Var.b;
                                        c(new ip60(newsEntry22, Integer.valueOf(f0Var.c)));
                                        Post post9 = newsEntry22 instanceof Post ? (Post) newsEntry22 : null;
                                        if (post9 != null) {
                                            d4c0 w2 = w();
                                            cVar.getClass();
                                            UiTracker uiTracker2 = UiTracker.a;
                                            return g(wdq.c(w2.y(UiTracker.d(), post9), bVar), new tl30(this, 6), new wv(i3, this, post9));
                                        }
                                    } else if (eVar instanceof ds60.e.d0) {
                                        ds60.e.d0 d0Var = (ds60.e.d0) eVar;
                                        NewsEntry newsEntry23 = d0Var.b;
                                        c(new dp60(newsEntry23, Integer.valueOf(d0Var.c)));
                                        Post post10 = newsEntry23 instanceof Post ? (Post) newsEntry23 : null;
                                        if (post10 != null) {
                                            if (post10.Sb()) {
                                                c(new yo60.e.d(post10));
                                                return null;
                                            }
                                            a(new ds60.c.i(post10));
                                            return null;
                                        }
                                    } else {
                                        if (eVar instanceof ds60.e.n) {
                                            ds60.e.n nVar = (ds60.e.n) eVar;
                                            c(new bp60(nVar.b, Integer.valueOf(nVar.c)));
                                            c(yo60.c.d.a.a);
                                            c(yo60.f.s.a.a);
                                            return null;
                                        }
                                        if (eVar instanceof ds60.e.x0) {
                                            ds60.e.x0 x0Var = (ds60.e.x0) eVar;
                                            NewsEntry newsEntry24 = x0Var.b;
                                            c(new ep60(newsEntry24, Integer.valueOf(x0Var.c)));
                                            c(new yo60.f.g(newsEntry24));
                                            return null;
                                        }
                                        if (eVar instanceof ds60.e.p0) {
                                            ds60.e.p0 p0Var = (ds60.e.p0) eVar;
                                            NewsEntry newsEntry25 = p0Var.b;
                                            c(new yo60.c.a.C4115c(newsEntry25, Integer.valueOf(p0Var.c)));
                                            if (newsEntry25 instanceof MyTargetNativeAdEntry) {
                                                gjx gjxVar2 = ((MyTargetNativeAdEntry) newsEntry25).B;
                                                if (gjxVar2 != null && (c3 = up50.c(gjxVar2, "show_advertiser_info")) != null) {
                                                    v().ib().b(gjxVar2).b(c3);
                                                    return null;
                                                }
                                            } else {
                                                String e = di60.e(newsEntry25);
                                                if (e != null) {
                                                    c(new yo60.f.r(e));
                                                    return null;
                                                }
                                            }
                                        } else if (eVar instanceof ds60.e.h) {
                                            ds60.e.h hVar = (ds60.e.h) eVar;
                                            NewsEntry newsEntry26 = hVar.b;
                                            c(new yo60.c.a.C4114a(newsEntry26, Integer.valueOf(hVar.c)));
                                            if (newsEntry26 instanceof MyTargetNativeAdEntry) {
                                                gjx gjxVar3 = ((MyTargetNativeAdEntry) newsEntry26).B;
                                                if (gjxVar3 != null && (c2 = up50.c(gjxVar3, "ad_marker_template")) != null) {
                                                    v().ib().b(gjxVar3).b(c2);
                                                    return null;
                                                }
                                            } else {
                                                String b3 = di60.b(newsEntry26);
                                                if (b3 != null) {
                                                    c(new qp60(b3));
                                                    return null;
                                                }
                                            }
                                        } else {
                                            if (eVar instanceof ds60.e.v0) {
                                                final ds60.e.v0 v0Var = (ds60.e.v0) eVar;
                                                return g(wdq.c(v().Aa().j(v0Var.b), bVar), new o3y(this, 9), new io.reactivex.rxjava3.functions.f() { // from class: xsna.er60
                                                    @Override // io.reactivex.rxjava3.functions.f
                                                    public final void accept(Object obj) {
                                                        kr60.this.c(new yo60.h(new NewsfeedExternalAction.c.x(v0Var.b, (NewsEntry) obj)));
                                                    }
                                                });
                                            }
                                            if (eVar instanceof ds60.e.w) {
                                                ds60.e.w wVar = (ds60.e.w) eVar;
                                                a(new ds60.c.h(wVar.b, wVar.c));
                                                return null;
                                            }
                                            if (eVar instanceof ds60.e.n0) {
                                                ds60.e.n0 n0Var = (ds60.e.n0) eVar;
                                                c(new yo60.f.q(n0Var.b, n0Var.c));
                                                return null;
                                            }
                                            if (eVar instanceof ds60.e.v) {
                                                c(new pp60(((ds60.e.v) eVar).b));
                                                return null;
                                            }
                                            if (eVar instanceof ds60.e.m0) {
                                                ds60.e.m0 m0Var = (ds60.e.m0) eVar;
                                                NewsEntry newsEntry27 = m0Var.b;
                                                c(new jp60(newsEntry27, Integer.valueOf(m0Var.c)));
                                                Badgeable badgeable = newsEntry27 instanceof Badgeable ? (Badgeable) newsEntry27 : null;
                                                if (badgeable != null) {
                                                    c(new yo60.f.e(badgeable));
                                                    return null;
                                                }
                                            } else {
                                                if (eVar instanceof ds60.e.i0) {
                                                    ds60.e.i0 i0Var = (ds60.e.i0) eVar;
                                                    NewsEntry newsEntry28 = i0Var.b;
                                                    if (newsEntry28 instanceof Post) {
                                                        Post post11 = (Post) newsEntry28;
                                                        boolean zb = post11.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                                        if (!((BridgeComponent) lazy.getValue()).s().a(post11.p)) {
                                                            if (!((BridgeComponent) lazy.getValue()).s().a(post11.m)) {
                                                                i3 = 0;
                                                            }
                                                        }
                                                        if (zb && i3 == 0) {
                                                            c(new ap60(newsEntry28, Integer.valueOf(i0Var.c)));
                                                            a(new ds60.c.j(newsEntry28));
                                                            return null;
                                                        }
                                                    }
                                                    c(new yo60.e.i(newsEntry28));
                                                    return null;
                                                }
                                                if (eVar instanceof ds60.e.z) {
                                                    FaveMarketItem t2 = t(((ds60.e.z) eVar).b);
                                                    if (t2 != null) {
                                                        c(new yo60.f.c.d(t2.b));
                                                        return null;
                                                    }
                                                } else if (eVar instanceof ds60.e.x) {
                                                    NewsEntry newsEntry29 = ((ds60.e.x) eVar).b;
                                                    FaveMarketItem t3 = t(newsEntry29);
                                                    if (t3 != null) {
                                                        c(new yo60.f.c.a(t3.b, newsEntry29));
                                                        return null;
                                                    }
                                                } else if (eVar instanceof ds60.e.a0) {
                                                    FaveMarketItem t4 = t(((ds60.e.a0) eVar).b);
                                                    if (t4 != null) {
                                                        Good good = t4.b;
                                                        CallProducerButton callProducerButton = t4.c;
                                                        c(new yo60.f.c.e(good, callProducerButton != null ? callProducerButton.k : null));
                                                        return null;
                                                    }
                                                } else if (eVar instanceof ds60.e.y) {
                                                    FaveMarketItem t5 = t(((ds60.e.y) eVar).b);
                                                    if (t5 != null) {
                                                        c(new yo60.f.c.b(t5.b, t5.c));
                                                        return null;
                                                    }
                                                } else if (eVar instanceof ds60.e.b0) {
                                                    FaveMarketItem t6 = t(((ds60.e.b0) eVar).b);
                                                    if (t6 != null) {
                                                        c(new yo60.f.c.C4119c(t6.b));
                                                        return null;
                                                    }
                                                } else if (eVar instanceof ds60.e.i) {
                                                    NewsEntry newsEntry30 = ((ds60.e.i) eVar).b;
                                                    if (newsEntry30 instanceof MyTargetNativeAdEntry) {
                                                        gjx gjxVar4 = ((MyTargetNativeAdEntry) newsEntry30).B;
                                                        if (gjxVar4 != null && (c = up50.c(gjxVar4, "ads_copy_url")) != null) {
                                                            v().ib().b(gjxVar4).b(c);
                                                            return null;
                                                        }
                                                    } else {
                                                        String d = di60.d(newsEntry30);
                                                        if (d != null) {
                                                            c(new rp60(d));
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    if (eVar instanceof ds60.e.k) {
                                                        c(new yo60.f.i(((ds60.e.k) eVar).b, cVar.a(), null));
                                                        return null;
                                                    }
                                                    if (eVar instanceof ds60.e.c0) {
                                                        c(new tp60(((ds60.e.c0) eVar).b));
                                                        return null;
                                                    }
                                                    if (eVar instanceof ds60.e.g) {
                                                        NewsEntry newsEntry31 = ((ds60.e.g) eVar).b;
                                                        Post post12 = newsEntry31 instanceof Post ? (Post) newsEntry31 : null;
                                                        if (post12 != null) {
                                                            a(new ds60.c.b(post12));
                                                            return null;
                                                        }
                                                    } else {
                                                        if (!(eVar instanceof ds60.e.u0)) {
                                                            if ((eVar instanceof ds60.e.k0) || (eVar instanceof ds60.e.b) || (eVar instanceof ds60.e.t0) || (eVar instanceof ds60.e.d) || (eVar instanceof ds60.e.c) || (eVar instanceof ds60.e.o)) {
                                                                return null;
                                                            }
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        NewsEntry newsEntry32 = ((ds60.e.u0) eVar).b;
                                                        Post post13 = newsEntry32 instanceof Post ? (Post) newsEntry32 : null;
                                                        if (post13 != null) {
                                                            a(new ds60.c.k(post13));
                                                            return null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final NewsFeedComponent v() {
        return (NewsFeedComponent) this.i.getValue();
    }

    public final d4c0 w() {
        return v().ze();
    }

    public final void x(NewsEntry newsEntry, aw0 aw0Var, int i) {
        c(new yo60.c.AbstractC4116c.a(i, newsEntry));
        a(new ds60.c.d(newsEntry, aw0Var));
    }
}
