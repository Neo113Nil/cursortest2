package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FaveSource;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9x0;
import xsna.jnq;
import xsna.qr80;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ufz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ufz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gjx gjxVar;
        egz0 c;
        ArrayList arrayList;
        VideoFile videoFile;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((hg6) obj4).r(((Integer) obj3).intValue(), obj2, (jav) obj);
                return s3q0.a;
            case 1:
                cr60 cr60Var = (cr60) obj4;
                Lazy lazy = cr60Var.h;
                Lazy lazy2 = cr60Var.b;
                ?? r8 = cr60Var.e;
                Context context = (Context) obj3;
                Fragment fragment = (Fragment) obj2;
                yo60.f fVar = (yo60.f) obj;
                so60 so60Var = cr60Var.a;
                if (fVar instanceof yo60.f.r) {
                    maz.c(((BridgeComponent) cr60Var.c.getValue()).p().e(), context, ((yo60.f.r) fVar).a, LaunchContext.A, null, null, 24);
                } else if (fVar instanceof yo60.f.l) {
                    Post post = ((yo60.f.l) fVar).a;
                    NewsfeedRouter a = cr60Var.a();
                    if (post.sc()) {
                        VideoAttachment i2 = di60.i(post);
                        if (i2 != null && (videoFile = i2.k) != null) {
                            fxc0.B().Y().k(context, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                        }
                    } else {
                        NewsfeedRouter.w(a, context, post.Bb(), null, c9x0.c.b, null, 48);
                    }
                } else if (fVar instanceof yo60.f.s.c) {
                    yo60.f.s.c cVar = (yo60.f.s.c) fVar;
                    Post post2 = cVar.a;
                    PostingCreationEntryPoint postingCreationEntryPoint = cVar.b;
                    int i3 = rfc0.a;
                    q860 q860Var = new q860();
                    q860Var.f = epc0.EditPost;
                    q860Var.h = post2;
                    q860Var.k = !post2.Pb();
                    q860Var.g = postingCreationEntryPoint;
                    q860Var.p(-1, context);
                } else if (fVar instanceof yo60.f.s.b) {
                    yo60.f.s.b bVar = (yo60.f.s.b) fVar;
                    Post post3 = bVar.a;
                    PostingCreationEntryPoint postingCreationEntryPoint2 = bVar.b;
                    int i4 = rfc0.a;
                    q860 q860Var2 = new q860();
                    q860Var2.f = epc0.EditPost;
                    q860Var2.h = post3;
                    q860Var2.k = false;
                    q860Var2.g = postingCreationEntryPoint2;
                    q860Var2.p(-1, context);
                } else if (fVar instanceof yo60.f.s.d) {
                    yo60.f.s.d dVar = (yo60.f.s.d) fVar;
                    cr60Var.a().r(context, dVar.a, dVar.b);
                } else if (fVar instanceof yo60.f.s.a) {
                    NewsfeedRouter.D(cr60Var.a(), context, FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.POST);
                } else if (fVar instanceof yo60.f.o) {
                    yo60.f.o oVar = (yo60.f.o) fVar;
                    NewsEntry newsEntry = oVar.a;
                    String str = oVar.b;
                    AdsChoices a2 = di60.a(newsEntry);
                    String str2 = a2 != null ? a2.d : null;
                    MyTargetAdsComplainOptions[] myTargetAdsComplainOptionsArr = (MyTargetAdsComplainOptions[]) di60.c("complain", newsEntry).toArray(new MyTargetAdsComplainOptions[0]);
                    if (str2 != null && myTargetAdsComplainOptionsArr.length != 0) {
                        cr60Var.a().o(context, newsEntry, str2, myTargetAdsComplainOptionsArr);
                    } else if (!(newsEntry instanceof MyTargetNativeAdEntry) || (gjxVar = ((MyTargetNativeAdEntry) newsEntry).B) == null || (c = gjxVar.c()) == null || (arrayList = c.b) == null) {
                        ((NewsFeedBridgeComponent) r8.getValue()).Ad().J0(context, newsEntry, str, 1234);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((ajx) next).getType(), "complain")) {
                                arrayList2.add(next);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            String title = ((ajx) it2.next()).getTitle();
                            if (title != null) {
                                arrayList3.add(title);
                            }
                        }
                        cr60Var.a().U(context, newsEntry, (String[]) arrayList3.toArray(new String[0]));
                    }
                } else if (fVar instanceof yo60.f.p) {
                    ((yo60.f.p) fVar).getClass();
                    fxc0.B().d0(context, new wx30(2));
                } else if (fVar instanceof yo60.f.b) {
                    ((hu60) cr60Var.g.getValue()).b(context, ((yo60.f.b) fVar).a);
                } else if (fVar instanceof yo60.f.g) {
                    cr60Var.a().a(context, ((yo60.f.g) fVar).a);
                } else {
                    if (fVar instanceof yo60.f.d) {
                        mrp mrpVar = (mrp) cr60Var.f.getValue();
                        ((yo60.f.d) fVar).getClass();
                        mrpVar.getClass();
                        hd60.a();
                        throw null;
                    }
                    if (fVar instanceof yo60.f.e) {
                        cr60Var.a().v(context, ((yo60.f.e) fVar).a);
                    } else if (fVar instanceof yo60.f.t) {
                        yo60.f.t tVar = (yo60.f.t) fVar;
                        Fragment parentFragment = fragment.getParentFragment();
                        if (parentFragment instanceof hnv) {
                            ((hnv) parentFragment).F2(tVar.a);
                        }
                    } else if (fVar instanceof yo60.f.j) {
                        yo60.f.j jVar = (yo60.f.j) fVar;
                        ((p960) lazy2.getValue()).b(context, jVar.a, jVar.b, (String) so60Var.get(), jVar.d);
                    } else if (fVar instanceof yo60.f.q) {
                        yo60.f.q qVar = (yo60.f.q) fVar;
                        ((p960) lazy2.getValue()).e(context, qVar.a, qVar.b, (String) so60Var.get());
                    } else if (fVar instanceof yo60.f.m) {
                        Post post4 = ((yo60.f.m) fVar).a;
                        int i5 = post4.n;
                        UserId userId = post4.m;
                        ComFeatures comFeatures = ComFeatures.COM_POST_STATISTICS;
                        comFeatures.getClass();
                        if (com.vk.toggle.b.A.a(comFeatures) && fkq0.d(userId)) {
                            ((syk0) lazy.getValue()).a(i5, userId);
                        } else {
                            ((NewsFeedBridgeComponent) r8.getValue()).Ad().i1(i5, context, userId);
                        }
                    } else if (fVar instanceof yo60.f.h) {
                        VideoAttachment videoAttachment = ((yo60.f.h) fVar).a;
                        UserId I0 = videoAttachment.k.I0();
                        if (fkq0.d(I0)) {
                            ((syk0) lazy.getValue()).b(I0, Integer.valueOf(videoAttachment.k.o0()));
                        } else {
                            g620.f().m().b(context, I0, videoAttachment.k.a1(), false);
                        }
                    } else if (fVar instanceof yo60.f.k) {
                        Post post5 = ((yo60.f.k) fVar).a;
                        ((NewsFeedBridgeComponent) r8.getValue()).Ad().i1(post5.n, context, post5.m);
                    } else if (fVar instanceof yo60.f.c) {
                        tt60 tt60Var = (tt60) cr60Var.i.getValue();
                        yo60.f.c cVar2 = (yo60.f.c) fVar;
                        if (cVar2 instanceof yo60.f.c.d) {
                            tt60Var.a().e(context, ((yo60.f.c.d) cVar2).a);
                        } else if (cVar2 instanceof yo60.f.c.e) {
                            com.vk.ecomm.fave.api.di.a a3 = tt60Var.a();
                            yo60.f.c.e eVar = (yo60.f.c.e) cVar2;
                            Good good = eVar.a;
                            String str3 = eVar.b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            a3.d(good, str3, context);
                        } else if (cVar2 instanceof yo60.f.c.b) {
                            yo60.f.c.b bVar2 = (yo60.f.c.b) cVar2;
                            tt60Var.a().b(bVar2.b, bVar2.a, context);
                        } else if (cVar2 instanceof yo60.f.c.C4119c) {
                            tt60Var.a().c(context, ((yo60.f.c.C4119c) cVar2).a);
                        } else {
                            if (!(cVar2 instanceof yo60.f.c.a)) {
                                tt60Var.getClass();
                                throw new NoWhenBranchMatchedException();
                            }
                            yo60.f.c.a aVar = (yo60.f.c.a) cVar2;
                            tt60Var.a().a(aVar.a, aVar.b, context);
                        }
                    } else if (fVar instanceof yo60.f.n) {
                        yo60.f.n nVar = (yo60.f.n) fVar;
                        p960.d((p960) lazy2.getValue(), context, nVar.a, nVar.b, nVar.c, nVar.d, nVar.e, 64);
                    } else if (fVar instanceof yo60.f.a) {
                        yo60.f.a aVar2 = (yo60.f.a) fVar;
                        if (aVar2 instanceof yo60.f.a.C4118a) {
                            yo60.f.a.C4118a c4118a = (yo60.f.a.C4118a) aVar2;
                            NewsfeedRouter a4 = cr60Var.a();
                            NewsEntry newsEntry2 = c4118a.a;
                            Comment comment = c4118a.b;
                            String str4 = c4118a.c;
                            int i6 = comment.b;
                            qr80 qr80Var = c4118a.e;
                            if (qr80Var == null) {
                                qr80Var = new qr80.a(i6);
                            }
                            a4.i(context, newsEntry2, comment, str4, qr80Var);
                        } else if (aVar2 instanceof yo60.f.a.b) {
                            yo60.f.a.b bVar3 = (yo60.f.a.b) aVar2;
                            cr60Var.a().k(context, bVar3.a, bVar3.b, bVar3.c);
                        } else {
                            if (!(aVar2 instanceof yo60.f.a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cr60Var.a().M(context, ((yo60.f.a.c) aVar2).a);
                        }
                    } else if (fVar instanceof yo60.f.C4120f) {
                        yo60.f.C4120f c4120f = (yo60.f.C4120f) fVar;
                        Activity h = e3m.h(context);
                        if (h != null) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("id", c4120f.a);
                            bundle.putParcelable(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, c4120f.b);
                            ((NewsFeedBridgeComponent) r8.getValue()).Ad().b1(h, bundle);
                        }
                    } else {
                        if (!(fVar instanceof yo60.f.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yo60.f.i iVar = (yo60.f.i) fVar;
                        NewsEntry newsEntry3 = iVar.a;
                        FaveEntry faveEntry = newsEntry3 instanceof FaveEntry ? (FaveEntry) newsEntry3 : null;
                        if (faveEntry != null) {
                            String str5 = iVar.b;
                            FaveSource faveSource = iVar.c;
                            int i7 = jnq.i;
                            jnq.a.a(context, faveEntry, new pqq(null, str5, null, faveSource, 5));
                        }
                    }
                }
                return s3q0.a;
            default:
                jgt0 jgt0Var = (jgt0) obj;
                ((wh50) obj4).setValue(Boolean.FALSE);
                ((ViewGroup) obj3).removeView((ComposeView) obj2);
                jgt0Var.d.Qc("video_playback_settings_redesign");
                jgt0Var.f = null;
                return s3q0.a;
        }
    }
}
