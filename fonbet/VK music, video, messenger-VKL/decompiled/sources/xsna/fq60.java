package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedInteractionItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwy;
import xsna.h7u0;
import xsna.ikv0;
import xsna.yo60;

/* compiled from: NewsfeedListEventsHandler.kt */
/* loaded from: classes4.dex */
public final class fq60 {
    public final AtomicReference<String> a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final jd60 f = new jd60();
    public final Object g;
    public final Object h;
    public final bpn0 i;
    public final bpn0 j;
    public final utx k;

    public fq60(AtomicReference atomicReference, io.reactivex.rxjava3.disposables.b bVar, FullSourceJoinApi.EntryServiceType entryServiceType, Lazy lazy, Lazy lazy2, bpn0 bpn0Var, Lazy lazy3, Lazy lazy4) {
        this.a = atomicReference;
        this.b = bVar;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy4;
        hn9 hn9Var = new hn9(21, this, lazy);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, hn9Var);
        this.h = msy.a(lazyThreadSafetyMode, new x550(lazy, 6));
        this.i = new bpn0(new pk(14, bpn0Var, lazy3));
        this.j = new bpn0(new e20(20));
        this.k = new utx(entryServiceType);
    }

    public static io.reactivex.rxjava3.internal.operators.completable.u a(final Activity activity, final String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.dq60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fvr.l(activity, str);
                return s3q0.a;
            }
        }).o(asu0.a.d());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public static void c(yo60.j jVar, gq60 gq60Var) {
        fh9 fh9Var = gq60Var.d;
        if (jVar instanceof yo60.j.c) {
            ((w5r0) gq60Var.e.getValue()).a();
            ehv ehvVar = (ehv) fh9Var.b;
            if (ehvVar != null) {
                ehvVar.m();
            }
            fh9Var.a().c();
            ((awy) gq60Var.c.getValue()).a();
        } else if (jVar instanceof yo60.j.a) {
            bs60 bs60Var = (bs60) gq60Var.a.getValue();
            if (!bs60Var.a.e) {
                ks60 ks60Var = bs60Var.o;
                if (ks60Var != null) {
                    ks60Var.q = 0;
                    ks60Var.r = null;
                }
                rwc0<? extends pwc0> rwc0Var = bs60Var.p;
                if (rwc0Var != null) {
                    rwc0Var.c();
                }
            }
        }
        ((or60) gq60Var.b.getValue()).l(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mo60 mo60Var, FragmentImpl fragmentImpl, final Activity activity, RecyclerView recyclerView, yo60 yo60Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        VideoAttachment Nb;
        boolean z6;
        VideoAttachment Nb2;
        Owner owner;
        aud audVar = mo60Var.h0;
        if (yo60Var instanceof yo60.g) {
            if (activity == null) {
                return null;
            }
            d(activity, (yo60.g) yo60Var);
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.f) {
            if (activity == null) {
                return null;
            }
            cr60 cr60Var = (cr60) mo60Var.P.getValue();
            cr60Var.getClass();
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new ufz(cr60Var, activity, fragmentImpl, (yo60.f) yo60Var, 1));
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.a) {
            if (activity == null) {
                return null;
            }
            this.k.a((yo60.a) yo60Var);
            return s3q0.a;
        }
        int i = 3;
        int i2 = 14;
        int i3 = 19;
        if (yo60Var instanceof yo60.e) {
            if (activity == null) {
                return null;
            }
            final wo60 wo60Var = (wo60) mo60Var.R.getValue();
            yo60.e eVar = (yo60.e) yo60Var;
            la60 la60Var = wo60Var.c;
            bpn0 bpn0Var = wo60Var.f;
            Lazy lazy = wo60Var.d;
            if (eVar instanceof yo60.e.C4117e) {
                yo60.e.C4117e c4117e = (yo60.e.C4117e) eVar;
                NewsEntry newsEntry = c4117e.b;
                NewsEntry newsEntry2 = c4117e.c;
                boolean z7 = !(newsEntry instanceof DiscoverMediaBlock) && (newsEntry2 instanceof DiscoverMediaBlock);
                boolean z8 = newsEntry2 instanceof DiscoverMediaBlock;
                s1c0 s1c0Var = c4117e.e;
                boolean z9 = s1c0Var.v;
                boolean z10 = s1c0Var.M;
                boolean z11 = z9 || s1c0Var.w;
                UserId c = ((BridgeComponent) lazy.getValue()).s().c();
                la60 la60Var2 = wo60Var.c;
                View view = c4117e.a;
                NewsEntry newsEntry3 = c4117e.c;
                boolean z12 = s1c0Var.E && sl60.F0(newsEntry);
                boolean z13 = s1c0Var.o;
                boolean z14 = s1c0Var.D;
                if (s1c0Var.F) {
                    Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                    if (!epx.f(c, (post == null || (owner = post.o) == null) ? null : owner.b)) {
                        z = true;
                        boolean z15 = s1c0Var.K;
                        boolean z16 = s1c0Var.L;
                        if (z10) {
                            z2 = z8;
                        } else {
                            if (newsEntry instanceof Videos) {
                                Videos videos = (Videos) newsEntry;
                                if (videos.Ea() && (Nb2 = videos.Nb()) != null) {
                                    z2 = z8;
                                    z6 = ((ClipActionsComponent) bpn0Var.getValue()).q5().d(Nb2.k);
                                    if (z6) {
                                        z3 = true;
                                        if (z10) {
                                            if (newsEntry instanceof Videos) {
                                                Videos videos2 = (Videos) newsEntry;
                                                if (videos2.Ea() && (Nb = videos2.Nb()) != null) {
                                                    z5 = ((ClipActionsComponent) bpn0Var.getValue()).q5().c(Nb.k);
                                                    if (z5) {
                                                        z4 = true;
                                                        wo60Var.g = la60.e(la60Var2, view, new xm60(newsEntry, newsEntry3, null, z12, z2, z7, z13, c, z11, z15, z, z14, z16, z3, z4, 196), new uo60(wo60Var, newsEntry, c4117e), new uq50(wo60Var, 4), 16);
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            if (z5) {
                                            }
                                        }
                                        z4 = false;
                                        wo60Var.g = la60.e(la60Var2, view, new xm60(newsEntry, newsEntry3, null, z12, z2, z7, z13, c, z11, z15, z, z14, z16, z3, z4, 196), new uo60(wo60Var, newsEntry, c4117e), new uq50(wo60Var, 4), 16);
                                    }
                                }
                            }
                            z2 = z8;
                            z6 = false;
                            if (z6) {
                            }
                        }
                        z3 = false;
                        if (z10) {
                        }
                        z4 = false;
                        wo60Var.g = la60.e(la60Var2, view, new xm60(newsEntry, newsEntry3, null, z12, z2, z7, z13, c, z11, z15, z, z14, z16, z3, z4, 196), new uo60(wo60Var, newsEntry, c4117e), new uq50(wo60Var, 4), 16);
                    }
                }
                z = false;
                boolean z152 = s1c0Var.K;
                boolean z162 = s1c0Var.L;
                if (z10) {
                }
                z3 = false;
                if (z10) {
                }
                z4 = false;
                wo60Var.g = la60.e(la60Var2, view, new xm60(newsEntry, newsEntry3, null, z12, z2, z7, z13, c, z11, z152, z, z14, z162, z3, z4, 196), new uo60(wo60Var, newsEntry, c4117e), new uq50(wo60Var, 4), 16);
            } else if (eVar instanceof yo60.e.i) {
                yo60.e.i iVar = (yo60.e.i) eVar;
                NewsEntry newsEntry4 = iVar.a;
                UserId c2 = ((BridgeComponent) lazy.getValue()).s().c();
                wx0 wx0Var = new wx0(15, wo60Var, iVar);
                la60Var.getClass();
                la60.c(activity, newsEntry4, c2, false, wx0Var);
            } else if (eVar instanceof yo60.e.j) {
                yo60.e.j jVar = (yo60.e.j) eVar;
                CharSequence charSequence = jVar.b;
                if (charSequence == null) {
                    charSequence = jVar.a.s;
                }
                cx cxVar = new cx(13, wo60Var, jVar);
                la60Var.getClass();
                la60.f(activity, charSequence, cxVar);
            } else if (eVar instanceof yo60.e.l) {
                final yo60.e.l lVar = (yo60.e.l) eVar;
                hz20 hz20Var = new hz20() { // from class: xsna.vo60
                    @Override // xsna.hz20
                    public final void a(int i4) {
                        wo60.this.b.a(lVar);
                    }
                };
                la60Var.getClass();
                la60.h(activity, hz20Var);
            } else if (eVar instanceof yo60.e.b) {
                String str = ((yo60.e.b) eVar).a;
                la60Var.getClass();
                la60.a(activity, str);
            } else if (eVar instanceof yo60.e.d) {
                com.vk.voip.a aVar = new com.vk.voip.a(i3, wo60Var, (yo60.e.d) eVar);
                la60Var.getClass();
                la60.b(activity, aVar);
            } else if (eVar instanceof yo60.e.h) {
                yo60.e.h hVar = (yo60.e.h) eVar;
                LinkedHashMap linkedHashMap = hVar.b;
                String[] strArr = (String[]) linkedHashMap.values().toArray(new String[0]);
                UserId[] userIdArr = (UserId[]) linkedHashMap.keySet().toArray(new UserId[0]);
                d50 d50Var = new d50(17, wo60Var, hVar);
                la60Var.getClass();
                int i4 = h7u0.p;
                h7u0.a a = h7u0.b.a(activity);
                a.g0(R.string.hide_from_newsfeed);
                a.T(strArr, new b10(1, d50Var, userIdArr));
                a.m();
            } else if (eVar instanceof yo60.e.k) {
                NewsEntry newsEntry5 = ((yo60.e.k) eVar).a;
                la60Var.getClass();
                la60.g(activity, newsEntry5);
            } else if (eVar instanceof yo60.e.g) {
                ((NewsFeedBridgeComponent) wo60Var.e.getValue()).Ad().S(activity);
            } else {
                if (eVar instanceof yo60.e.c) {
                    throw null;
                }
                if (eVar instanceof yo60.e.f) {
                    yo60.e.f fVar = (yo60.e.f) eVar;
                    long j = fVar.a;
                    io.reactivex.rxjava3.disposables.c cVar = fVar.b;
                    la60Var.getClass();
                    com.vk.core.view.components.spinner.c e = qv20.e(activity, Integer.valueOf(R.string.rx_loading));
                    e.setCancelable(true);
                    e.create();
                    Handler handler = la60Var.b;
                    qro0.b(handler, new com.vk.movika.sdk.base.ui.r0(18, e, cVar));
                    la60Var.a = e;
                    try {
                        bpn0 bpn0Var2 = qro0.a;
                        qro0.d(new jl4(i2, la60Var, activity), j, handler);
                    } catch (Exception e2) {
                        L.i(e2);
                    }
                } else {
                    if (!(eVar instanceof yo60.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Handler handler2 = la60Var.b;
                    try {
                        handler2.removeCallbacksAndMessages(null);
                        handler2.post(new qc9(la60Var, i));
                    } catch (Exception e3) {
                        L.i(e3);
                    }
                }
            }
            return s3q0.a;
        }
        if (yo60Var instanceof vp60) {
            qhh0 qhh0Var = fragmentImpl instanceof qhh0 ? (qhh0) fragmentImpl : null;
            if (qhh0Var != null) {
                return Boolean.valueOf(qhh0Var.s());
            }
            return null;
        }
        if (yo60Var instanceof xp60) {
            xp60 xp60Var = (xp60) yo60Var;
            int i5 = xp60Var.a;
            int i6 = xp60Var.b;
            ohh0 ohh0Var = fragmentImpl instanceof ohh0 ? (ohh0) fragmentImpl : null;
            if (ohh0Var != null) {
                ohh0Var.Y1(i5, i6);
            }
            return s3q0.a;
        }
        if (yo60Var instanceof wp60) {
            int layoutPosition = ((wp60) yo60Var).a.getLayoutPosition();
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null;
            if (valueOf != null && layoutPosition == valueOf.intValue()) {
                int i7 = layoutPosition - 1;
                recyclerView.scrollToPosition(i7 < 0 ? 0 : i7);
            }
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.k) {
            mo60Var.S.a(((yo60.k) yo60Var).a);
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.h) {
            ii60 ii60Var = (ii60) this.h.getValue();
            NewsfeedExternalAction newsfeedExternalAction = ((yo60.h) yo60Var).a;
            ii60Var.getClass();
            ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.c(new ew3(16, newsfeedExternalAction, ii60Var));
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.d.a) {
            yo60.d dVar = (yo60.d) yo60Var;
            if (!(dVar instanceof yo60.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yo60.d.a aVar2 = (yo60.d.a) dVar;
            this.f.a(aVar2.a, aVar2.b);
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.c) {
            mc60 mc60Var = (mc60) this.g.getValue();
            yo60.c cVar2 = (yo60.c) yo60Var;
            mc60Var.getClass();
            if (cVar2.equals(yo60.c.d.a.a)) {
                ((NewsFeedComponent) mc60Var.b.getValue()).Vb().a(MobileOfficialAppsCoreNavStat$EventScreen.FEED);
            } else if (cVar2 instanceof yo60.c.AbstractC4116c.a) {
                yo60.c.AbstractC4116c.a aVar3 = (yo60.c.AbstractC4116c.a) cVar2;
                PostInteract Ab = PostInteract.Ab((String) mc60Var.a.get(), aVar3.a);
                if (Ab != null) {
                    Ab.n = aVar3.b;
                    Ab.zb(PostInteract.Type.hide);
                }
            } else if (cVar2 instanceof yo60.c.b.a) {
                Digest digest = ((yo60.c.b.a) cVar2).a;
                b.d dVar2 = new b.d("digest_hide");
                dVar2.b(digest.o, "track_code");
                dVar2.e();
            } else if (cVar2 instanceof yo60.c.a.b) {
            } else if (cVar2 instanceof yo60.c.a.C4115c) {
                yo60.c.a.C4115c c4115c = (yo60.c.a.C4115c) cVar2;
                mc60Var.a(c4115c.a, c4115c.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.OPEN_ADVERTISER_INFO);
            } else if (cVar2 instanceof yo60.c.a.C4114a) {
                yo60.c.a.C4114a c4114a = (yo60.c.a.C4114a) cVar2;
                mc60Var.a(c4114a.a, c4114a.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.COPY_ERID);
            } else if (cVar2 instanceof zo60) {
                zo60 zo60Var = (zo60) cVar2;
                mc60Var.a(zo60Var.a, zo60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.COPY_LINK);
            } else if (cVar2 instanceof jp60) {
                jp60 jp60Var = (jp60) cVar2;
                mc60Var.a(jp60Var.a, jp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.SEND_DONUT);
            } else if (cVar2 instanceof ap60) {
                ap60 ap60Var = (ap60) cVar2;
                mc60Var.a(ap60Var.a, ap60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.DECLINE_SUGGESTED_POST);
            } else if (cVar2 instanceof bp60) {
                bp60 bp60Var = (bp60) cVar2;
                mc60Var.a(bp60Var.a, bp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.EDIT_BEST_FRIENDS_LIST);
            } else if (cVar2 instanceof cp60) {
                cp60 cp60Var = (cp60) cVar2;
                mc60Var.a(cp60Var.a, cp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.EDIT_POST);
            } else if (cVar2 instanceof fp60) {
                fp60 fp60Var = (fp60) cVar2;
                mc60Var.a(fp60Var.a, fp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.OPEN_ORIGINAL);
            } else if (cVar2 instanceof kp60) {
                kp60 kp60Var = (kp60) cVar2;
                mc60Var.a(kp60Var.a, kp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.POST_STAT);
            } else if (cVar2 instanceof dp60) {
                dp60 dp60Var = (dp60) cVar2;
                mc60Var.a(dp60Var.a, dp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.MAKE_DONUT_POST_PUBLIC);
            } else if (cVar2 instanceof ep60) {
                ep60 ep60Var = (ep60) cVar2;
                mc60Var.a(ep60Var.a, ep60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.MESSAGE_AUTHOR);
            } else if (cVar2 instanceof ip60) {
                ip60 ip60Var = (ip60) cVar2;
                mc60Var.a(ip60Var.a, ip60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.POST_SUGGESTED_POST);
            } else if (cVar2 instanceof hp60) {
                hp60 hp60Var = (hp60) cVar2;
                mc60Var.a(hp60Var.a, hp60Var.b, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.PUBLISH_DELAYED_POST);
            } else if (cVar2 instanceof lp60) {
                mc60Var.a(null, null, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.UNSUBSCRIBE_COMMENTS);
            } else {
                if (!(cVar2 instanceof gp60)) {
                    throw new NoWhenBranchMatchedException();
                }
                gp60 gp60Var = (gp60) cVar2;
                NewsEntry newsEntry6 = gp60Var.a;
                p4r.f(MobileOfficialAppsFeedStat$TypeFeedInteractionItem.Item.REPORT_MENU_ITEM, newsEntry6.Cb().b, newsEntry6.Db(), gp60Var.b, gp60Var.c);
            }
            return s3q0.a;
        }
        if (yo60Var instanceof yp60) {
            mo60Var.f().d().b();
            return s3q0.a;
        }
        if (yo60Var instanceof zp60) {
            bs60.b(mo60Var.f());
            return s3q0.a;
        }
        if (yo60Var instanceof aq60) {
            aq60 aq60Var = (aq60) yo60Var;
            if (activity != null) {
                ((w5r0) audVar.b.getValue()).b(activity, aq60Var.a).hide();
            }
            return s3q0.a;
        }
        if (yo60Var instanceof op60) {
            ((fh9) audVar.a).a().a(null);
            return s3q0.a;
        }
        if (yo60Var instanceof mp60) {
            ehv ehvVar = (ehv) ((fh9) audVar.a).b;
            if (ehvVar != null) {
                ehvVar.h.add(null);
            }
            return s3q0.a;
        }
        if (yo60Var instanceof np60) {
            ehv ehvVar2 = (ehv) ((fh9) audVar.a).b;
            if (ehvVar2 != null) {
                ehvVar2.l(null, null);
            }
            return s3q0.a;
        }
        if (yo60Var instanceof yo60.i.a) {
            ((NewsfeedOptionalAdsComponent) mo60Var.Y.getValue()).Wa(((yo60.i.a) yo60Var).a);
            return s3q0.a;
        }
        if (yo60Var instanceof pp60) {
            awy d = mo60Var.d();
            NewsEntry newsEntry7 = ((pp60) yo60Var).a;
            d.getClass();
            newsEntry7.e = true;
            newsEntry7.f = bwy.d.a;
            d.b(newsEntry7);
            return s3q0.a;
        }
        boolean z17 = yo60Var instanceof qp60;
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        if (z17) {
            if (activity == null) {
                return null;
            }
            bVar.b(a(activity, ((qp60) yo60Var).a).subscribe(new l060(1, this, activity), new afs(new com.vk.movika.sdk.base.logic.processor.d(21, this, activity), i2)));
            return s3q0.a;
        }
        if (!(yo60Var instanceof up60)) {
            if (yo60Var instanceof sp60) {
                if (activity == null) {
                    return null;
                }
                bVar.b(a(activity, ((sp60) yo60Var).a).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.cq60
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        fq60.this.d(activity, new yo60.g.c(R.string.link_copied));
                    }
                }, new ubq(new l22(22, this, activity), i3)));
                return s3q0.a;
            }
            if (yo60Var instanceof rp60) {
                if (activity == null) {
                    return null;
                }
                bVar.b(a(activity, ((rp60) yo60Var).a).subscribe(new isa(5, this, activity), new zyu(new qt5(i3, this, activity), 11)));
                return s3q0.a;
            }
            if (yo60Var instanceof tp60) {
                if (activity == null) {
                    return null;
                }
                NewsEntry newsEntry8 = ((tp60) yo60Var).a;
                if (newsEntry8 instanceof Post) {
                    UiTracker uiTracker = UiTracker.a;
                    iuc0.b.G(activity, (Post) newsEntry8, new z6c0(false, null, UiTracker.d(), 3), null);
                }
                return s3q0.a;
            }
            if (yo60Var instanceof yo60.j) {
                c((yo60.j) yo60Var, mo60Var.i0);
                return s3q0.a;
            }
            if (!(yo60Var instanceof yo60.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((hm60) mo60Var.f0.getValue()).t = true;
            return s3q0.a;
        }
        if (activity == null) {
            return null;
        }
        NewsEntry newsEntry9 = ((up60) yo60Var).a;
        if (newsEntry9 instanceof FaveEntry) {
            Object obj = ((FaveEntry) newsEntry9).i.f;
            if (obj instanceof NewsEntry) {
                newsEntry9 = (NewsEntry) obj;
            }
        }
        String str2 = this.a.get();
        if (newsEntry9 instanceof Post) {
            ((i08) this.j.getValue()).getClass();
            i08.a(activity, (Post) newsEntry9, str2, null);
        } else {
            boolean z18 = newsEntry9 instanceof PromoPost;
            Lazy lazy2 = this.d;
            if (z18) {
                gd60 Ad = ((NewsFeedBridgeComponent) lazy2.getValue()).Ad();
                PromoPost promoPost = (PromoPost) newsEntry9;
                Ad.w1(activity, promoPost.n, null, str2, promoPost.r());
            } else if (newsEntry9 instanceof Videos) {
                Videos videos3 = (Videos) newsEntry9;
                VideoAttachment Nb3 = videos3.Nb();
                if (Nb3 != null) {
                    ((NewsFeedBridgeComponent) lazy2.getValue()).Ad().w1(activity, Nb3, null, str2, videos3.r());
                }
            } else {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"Can't add to fave " + newsEntry9});
                }
            }
        }
        if (newsEntry9 instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry9;
            if (shitAttachment.Gb()) {
                ((NewsFeedComponent) this.c.getValue()).X5().e(shitAttachment);
            }
        }
        return s3q0.a;
    }

    public final void d(Context context, yo60.g gVar) {
        ku60 ku60Var = (ku60) this.i.getValue();
        if (gVar instanceof yo60.g.a) {
            o2i ge = ku60Var.a.getValue().ge();
            Throwable th = ((yo60.g.a) gVar).a;
            if (ge.d(th, true)) {
                return;
            }
            h03.b(th);
            return;
        }
        ku60Var.getClass();
        int i = 0;
        if (gVar instanceof yo60.g.c) {
            int i2 = ((yo60.g.c) gVar).a;
            if (i2 != 0) {
                cvk.u(i2, false);
                return;
            }
            return;
        }
        if (!(gVar instanceof yo60.g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        yo60.g.b bVar = (yo60.g.b) gVar;
        boolean z = bVar instanceof yo60.g.b.C4121b;
        if (z) {
            i = R.drawable.vk_icon_check_circle_filled_blue_24;
        } else if (bVar instanceof yo60.g.b.c) {
            i = R.drawable.vk_icon_error_outline_28;
        }
        boolean z2 = bVar instanceof yo60.g.b.c;
        Integer valueOf = z2 ? Integer.valueOf(R.attr.vk_ui_icon_accent) : null;
        ikv0.a aVar = new ikv0.a(context);
        if (!(bVar instanceof yo60.g.b.a) && !z && !z2) {
            throw new NoWhenBranchMatchedException();
        }
        if (i != 0) {
            aVar.t = new ikv0.c.C3058c(i, valueOf, (Size) null, 12);
        }
        aVar.u = new ikv0.d(new ikv0.d.c(y8g0.e(bVar.a), 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.n();
    }
}
