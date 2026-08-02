package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.internal.jobs.dialogs.DialogArchiveUnarchiveJob;
import com.vk.internal.api.GsonHolder;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vkontakte.android.attachments.GeoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gfc0;
import xsna.ldm;
import xsna.omt0;
import xsna.r2c;
import xsna.rdm0;
import xsna.tmt0;
import xsna.x7j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class eo3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eo3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03cd, code lost:
    
        if (r4 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [xsna.e5z, xsna.qmt0] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        sxp e480Var;
        long executeInsert;
        Set set;
        List<? extends hfz> list;
        List<? extends hfz> list2;
        Integer num;
        int i;
        PostingOrd postingOrd;
        List<ImageCropData> list3;
        String str;
        String str2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                Article article = (Article) obj4;
                ArticleFragment articleFragment = (ArticleFragment) obj3;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                int i3 = ArticleFragment.E0;
                article.n = !article.n;
                articleFragment.po(article);
                if (articleFragment.mo(article)) {
                    articleFragment.xo(fragmentActivity);
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) obj4;
                u1x u1xVar = (u1x) obj3;
                wh50 wh50Var = (wh50) obj2;
                tho0 tho0Var = (tho0) obj;
                String str3 = ((tho0) wh50Var.getValue()).a.c;
                us2 us2Var = tho0Var.a;
                if (!epx.f(str3, us2Var.c)) {
                    izsVar.invoke(new r2c.z(u1xVar.b, us2Var.c, r2c.z.a.c.a));
                }
                wh50Var.setValue(tho0Var);
                return s3q0.a;
            case 2:
                ((ebd) obj4).p((ClipsAuthor) obj3, (String) obj2);
                return s3q0.a;
            case 3:
                v3e v3eVar = (v3e) obj3;
                ((p3e) obj4).l.invoke(new a.b.c(v3eVar.b, v3eVar.c, (String) obj2));
                return s3q0.a;
            case 4:
                DialogArchiveUnarchiveJob dialogArchiveUnarchiveJob = (DialogArchiveUnarchiveJob) obj3;
                Peer peer = dialogArchiveUnarchiveJob.c;
                w2w w2wVar = (w2w) obj2;
                int i4 = DialogArchiveUnarchiveJob.a.$EnumSwitchMapping$0[((DialogArchiveUnarchiveJob.Action) obj4).ordinal()];
                if (i4 == 1) {
                    e480Var = new e480(peer, dialogArchiveUnarchiveJob);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e480Var = new o480(peer, dialogArchiveUnarchiveJob);
                }
                w2wVar.e1(dialogArchiveUnarchiveJob, e480Var);
                return s3q0.a;
            case 5:
                ldm ldmVar = (ldm) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                e0w e0wVar = (e0w) obj;
                bpn0 bpn0Var = new bpn0(new uh3(13, e0wVar, ldmVar));
                bpn0 bpn0Var2 = new bpn0(new vq6(9, e0wVar, ldmVar));
                for (rdm rdmVar : (Iterable) obj4) {
                    int i5 = rdmVar.a;
                    String str4 = rdmVar.b;
                    if (i5 == 0) {
                        ((SQLiteStatement) bpn0Var2.getValue()).clearBindings();
                        ((SQLiteStatement) bpn0Var2.getValue()).bindString(1, str4);
                        executeInsert = ((SQLiteStatement) bpn0Var2.getValue()).executeInsert();
                    } else {
                        ((SQLiteStatement) bpn0Var.getValue()).clearBindings();
                        ((SQLiteStatement) bpn0Var.getValue()).bindLong(ldm.a.ID.ordinal() + 1, rdmVar.a);
                        ((SQLiteStatement) bpn0Var.getValue()).bindString(ldm.a.NAME.ordinal() + 1, str4);
                        ((SQLiteStatement) bpn0Var.getValue()).bindString(ldm.a.TYPE.ordinal() + 1, rdmVar.c.j());
                        ((SQLiteStatement) bpn0Var.getValue()).bindLong(ldm.a.FLAGS.ordinal() + 1, rdmVar.d);
                        executeInsert = ((SQLiteStatement) bpn0Var.getValue()).executeInsert();
                    }
                    Long valueOf = Long.valueOf(executeInsert);
                    if (executeInsert == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(Long.valueOf(valueOf.longValue()));
                    }
                }
                return s3q0.a;
            case 6:
                jlr jlrVar = (jlr) obj4;
                List list4 = (List) obj;
                ((StoryViewerRouter) jlrVar.X.getValue()).h((Activity) obj3, list4, ((StoriesContainer) list4.get(0)).Ob(), null, (r42 & 16) != 0, MobileOfficialAppsConStoriesStat$ViewEntryPoint.COMMENT_AVATAR, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, jlrVar.U, null, (r42 & 512) != 0 ? null : null, new q40((View) obj2, 26), (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : null, (r42 & 4096) != 0 ? new com.vk.story.api.a() : null, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                return s3q0.a;
            case 7:
                mtk0 mtk0Var = (mtk0) obj4;
                fg90 fg90Var = (fg90) obj3;
                fg90 fg90Var2 = (fg90) obj2;
                ggj ggjVar = (ggj) obj;
                long j = ((ncv) mtk0Var.getValue()).a;
                if (Float.intBitsToFloat((int) (j >> 32)) >= Float.intBitsToFloat((int) j)) {
                    ggjVar.s1();
                } else {
                    yq9 a = ggjVar.a0().a();
                    try {
                        a.r(p490.e(0L, ggjVar.d()), fg90Var);
                        ggjVar.s1();
                        a.i(Float.intBitsToFloat((int) (((ncv) mtk0Var.getValue()).a >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) ((ncv) mtk0Var.getValue()).a), Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)), fg90Var2);
                    } finally {
                        a.a();
                    }
                }
                return s3q0.a;
            case 8:
                b600 b600Var = (b600) obj3;
                a600 a600Var = (a600) obj2;
                List list5 = (List) obj;
                gzs gzsVar = (gzs) ((Ref$ObjectRef) obj4).element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                com.vk.lists.c cVar = b600Var.u;
                if (cVar != null) {
                    b600Var.t.setLoadingHoldersCount(Math.min(cVar.k(), b600Var.v - cVar.i()));
                }
                odm0 odm0Var = a600Var.g;
                if (odm0Var != null) {
                    ListBuilder e = e43.e();
                    odm0 odm0Var2 = a600Var.g;
                    if (odm0Var2 != null && (list2 = odm0Var2.h) != null) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            e.add((hfz) it.next());
                        }
                    }
                    odm0 odm0Var3 = a600Var.g;
                    if (odm0Var3 != null && (list = odm0Var3.h) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof rdm0.b) {
                                arrayList2.add(obj5);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(Long.valueOf(((rdm0.b) it2.next()).b));
                        }
                        set = j5g.S0(arrayList3);
                        break;
                    }
                    set = EmptySet.b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list5) {
                        if (!set.contains(Long.valueOf(((Group) obj6).c.b))) {
                            arrayList4.add(obj6);
                        }
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Group group = (Group) it3.next();
                        UserId userId = group.c;
                        e.add(new rdm0.b(userId.b, group.e, "", epx.f(a600Var.h, userId), new x7j0.a(group), group.d, 32));
                    }
                    odm0Var.setItems(e.g());
                }
                return s3q0.a;
            case 9:
                ((aoj) obj).a(new lo50((izs) obj4, (ko50) obj3, (wh50) obj2));
                return s3q0.a;
            case 10:
                String str5 = (String) obj4;
                Uri uri = (Uri) obj3;
                Uri uri2 = (Uri) obj2;
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"Failed to copy " + uri + " to " + uri2 + ". Exception: " + mnh0.A(th)});
                }
                return new gfc0.b(str5, false);
            case 11:
                flc0 flc0Var = (flc0) obj3;
                List list6 = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj2);
                ((com.vk.newsfeed.impl.posting.a) obj4).getClass();
                UserId userId2 = flc0Var.o;
                NewsEntry newsEntry = flc0Var.p;
                if (userId2 != null) {
                    if (!fkq0.c(userId2)) {
                        userId2 = null;
                        break;
                    }
                }
                userId2 = flc0Var.a();
                String g0 = list6.isEmpty() ? " " : j5g.g0(list6, StringUtils.COMMA, null, null, 0, null, 62);
                m660 m660Var = new m660("channels.sendMessage", linkedHashMap);
                UiTrackingScreen b = UiTracker.j.b();
                m660Var.K0((b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen));
                m660Var.K("message", flc0Var.a);
                m660Var.K("attachments", g0);
                if (fkq0.c(userId2)) {
                    m660Var.F(userId2, "owner_id");
                }
                if (flc0Var.d) {
                    m660Var.C(1, "friends_only");
                }
                boolean z = flc0Var.e;
                LinkedHashMap<String, String> linkedHashMap2 = m660Var.j;
                if (z) {
                    m660Var.K("services", (!linkedHashMap2.containsKey("services") || (str2 = linkedHashMap2.get("services")) == null || str2.length() == 0) ? "facebook" : i5s.a(new StringBuilder(), linkedHashMap2.get("services"), ",facebook"));
                }
                if (flc0Var.f) {
                    m660Var.K("services", (!linkedHashMap2.containsKey("services") || (str = linkedHashMap2.get("services")) == null || str.length() == 0) ? "twitter" : i5s.a(new StringBuilder(), linkedHashMap2.get("services"), ",twitter"));
                }
                if (flc0Var.g) {
                    boolean z2 = flc0Var.h;
                    m660Var.C(1, "from_group");
                    m660Var.K("signed", z2 ? "1" : "0");
                }
                int i6 = flc0Var.k;
                if (i6 >= 0) {
                    m660Var.C(i6, "situational_suggest_id");
                }
                m660Var.K("mute_notifications", flc0Var.m ? "1" : "0");
                if (flc0Var.l) {
                    i860.H0(m660Var);
                }
                String str6 = flc0Var.t;
                if (str6 != null) {
                    m660Var.K("copyright", str6);
                }
                Integer num2 = flc0Var.u;
                if (num2 != null) {
                    m660Var.C(num2.intValue(), "donut_paid_duration");
                }
                if (flc0Var.v) {
                    m660Var.C(1, "best_friends_only");
                }
                if (flc0Var.y) {
                    m660Var.C(0, "check_sign");
                }
                String str7 = flc0Var.z;
                String str8 = flc0Var.A;
                m660Var.K("link_title", str7);
                if (str8 != null) {
                    m660Var.K("link_photo_id", str8);
                }
                Date date = flc0Var.i;
                if (date != null) {
                    m660Var.D(date.getTime() / 1000, "publish_date");
                }
                PostingPrimaryMode postingPrimaryMode = flc0Var.x;
                if (postingPrimaryMode != null) {
                    m660Var.K("primary_attachments_mode", postingPrimaryMode.i());
                }
                GeoAttachment geoAttachment = flc0Var.j;
                if (geoAttachment != null) {
                    int i7 = geoAttachment.k;
                    if (i7 <= 0) {
                        double d = geoAttachment.f;
                        double d2 = geoAttachment.g;
                        m660Var.K(O6.s, String.valueOf(d));
                        m660Var.K("long", String.valueOf(d2));
                    } else {
                        m660Var.C(i7, "place_id");
                    }
                }
                boolean z3 = flc0Var.w;
                String str9 = flc0Var.s;
                if (z3) {
                    if (epx.f(str9, "newsfeed")) {
                        str9 = "newsfeed_from_plus";
                    } else if (epx.f(str9, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                        str9 = "profile_from_plus";
                    }
                }
                if (str9 != null) {
                    m660Var.K("ref", str9);
                }
                kfk kfkVar = flc0Var.C;
                if (kfkVar != null && (list3 = kfkVar.a) != null) {
                    m660Var.K("photo_attachments_crop", GsonHolder.a().toJson(list3));
                    m660Var.K("primary_attachments_ratio", kfkVar.b);
                }
                if (newsEntry == null && (postingOrd = flc0Var.B) != null) {
                    boolean z4 = postingOrd.b;
                    String str10 = postingOrd.d;
                    String str11 = postingOrd.c;
                    m660Var.R("mark_as_ads", z4);
                    if (str10 != null) {
                        m660Var.K("ord_erid", str10);
                    }
                    if (str11 != null) {
                        m660Var.K("ord_external_id", str11);
                    }
                }
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                if (post != null && (i = post.n) > 0 && (!flc0Var.q || o25.a().a(post.o.b))) {
                    m660Var.b = "channels.editMessage";
                    m660Var.C(i, "post_id");
                }
                aac0 aac0Var = flc0Var.n;
                if (aac0Var != null && (num = aac0Var.a) != null) {
                    UserId userId3 = aac0Var.c;
                    int intValue = num.intValue();
                    String str12 = aac0Var.f;
                    if (str12 == null) {
                        str12 = "";
                    }
                    m660Var.F(userId3, "poster_bkg_owner_id");
                    m660Var.C(intValue, "poster_bkg_id");
                    m660Var.K("poster_bkg_access_hash", str12);
                }
                m660Var.K("new_posting", "0");
                return rsg0.y0(m660Var, null, null, 3);
            case 12:
                l1h0 l1h0Var = (l1h0) obj4;
                p1h0 p1h0Var = (p1h0) obj2;
                ph50<Object, m1h0> ph50Var = l1h0Var.c;
                if (ph50Var.a(obj3)) {
                    throw new IllegalArgumentException(so.a(obj3, "Key ", " was used multiple times ").toString());
                }
                l1h0Var.b.remove(obj3);
                ph50Var.p(obj3, p1h0Var);
                return new k1h0(l1h0Var, obj3, p1h0Var);
            case 13:
                Context context = (Context) obj4;
                String str13 = (String) obj3;
                gzs gzsVar2 = (gzs) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    gzsVar2.invoke();
                } else if (!fvr.v(context, str13, false)) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 14:
                Lifecycle lifecycle = (Lifecycle) obj4;
                final izs izsVar2 = (izs) obj3;
                final vmt0 vmt0Var = (vmt0) obj2;
                ?? r0 = new androidx.lifecycle.l() { // from class: xsna.qmt0
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                        izs.this.invoke(new omt0.b(vmt0Var.b, event.h()));
                    }
                };
                lifecycle.addObserver(r0);
                return new tmt0.b(lifecycle, r0, izsVar2, vmt0Var);
            default:
                int i8 = VoipHistoryFriendsFragment.U;
                bwt0.p0((View) obj4, true);
                bwt0.p0((CustomSwipeRefreshLayout) obj3, false);
                bwt0.p0((View) obj2, false);
                return s3q0.a;
        }
    }
}
