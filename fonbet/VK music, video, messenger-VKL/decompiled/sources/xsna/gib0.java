package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderBrandedVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsRowView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.utils.newtork.d;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.translate.impl.models.LanguageModel;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.fxk0;
import xsna.r1k0;
import xsna.s7d0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gib0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gib0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r2v51, types: [android.view.ViewTreeObserver$OnPreDrawListener, xsna.ytt0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LanguageModel languageModel;
        io.reactivex.rxjava3.core.q T;
        int i = this.b;
        int i2 = 6;
        int i3 = 11;
        int i4 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((hib0) obj2).b();
                return s3q0.a;
            case 1:
                final y8c0 y8c0Var = (y8c0) obj2;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                com.vk.mvi.binder.c.a(cVar, f9t.w(y8c0Var.c()), new iyp() { // from class: xsna.t8c0
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        y8c0 y8c0Var2 = y8c0.this;
                        mga0 mga0Var = y8c0Var2.g;
                        d5c0 d5c0Var = (d5c0) pk50Var;
                        if (d5c0Var instanceof y4c0) {
                            y4c0 y4c0Var = (y4c0) d5c0Var;
                            NewsEntry newsEntry = y4c0Var.a;
                            String str = y4c0Var.b;
                            AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) y8c0Var2.r.getValue();
                            String str2 = (String) ((AtomicReference) y8c0Var2.k.getValue()).get();
                            io.reactivex.rxjava3.disposables.b bVar = y8c0Var2.u;
                            if (newsEntry instanceof Post) {
                                String str3 = com.vk.newsfeed.common.util.k.a;
                                com.vk.newsfeed.common.util.k.p((Post) newsEntry, 0, str2);
                            } else if (newsEntry instanceof PromoPost) {
                                String str4 = com.vk.newsfeed.common.util.k.a;
                                com.vk.newsfeed.common.util.k.p(((PromoPost) newsEntry).n, 0, str2);
                            }
                            List<String> g = di60.g(newsEntry);
                            List<String> list = g;
                            if (list != null && !list.isEmpty()) {
                                io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(nr2.v(sa4.a(newsEntry, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST), g, audienceResearchComponent.Z2()), new oyr(new i0b0(audienceResearchComponent, 3), 14));
                                asu0.a.getClass();
                                bVar.b(sVar.q(asu0.i()).subscribe());
                                List<NewsfeedResearchEvent> f = di60.f(newsEntry);
                                List<NewsfeedResearchEvent> list2 = f;
                                if (list2 != null && !list2.isEmpty()) {
                                    bVar.b(pq3.r(audienceResearchComponent.b(), f).q(asu0.i()).subscribe());
                                }
                            }
                            mga0Var.invoke(new gbg(str, newsEntry));
                            return;
                        }
                        if (d5c0Var instanceof z4c0) {
                            mga0Var.invoke(hbg.a);
                            return;
                        }
                        if (d5c0Var instanceof x4c0) {
                            mga0Var.invoke(fbg.a);
                            return;
                        }
                        if (d5c0Var instanceof b5c0) {
                            mga0Var.invoke(new kbg(((b5c0) d5c0Var).a));
                            return;
                        }
                        if (d5c0Var instanceof a5c0) {
                            mga0Var.invoke(new ibg());
                            return;
                        }
                        if (d5c0Var instanceof e5c0) {
                            mga0Var.invoke(new jbg(((e5c0) d5c0Var).a));
                            return;
                        }
                        if (d5c0Var instanceof w4c0) {
                            mga0Var.invoke(new ebg(((w4c0) d5c0Var).a));
                            return;
                        }
                        if (d5c0Var instanceof c5c0) {
                            c5c0 c5c0Var = (c5c0) d5c0Var;
                            mga0Var.invoke(new lbg(c5c0Var.a, c5c0Var.b));
                            return;
                        }
                        t2c0 t2c0Var = (t2c0) y8c0Var2.E.getValue();
                        r1c0 a = y8c0Var2.a();
                        FragmentImpl fragmentImpl = y8c0Var2.c;
                        Activity activity = (Activity) y8c0Var2.i.get();
                        RecyclerView recyclerView = y8c0Var2.A;
                        t2c0Var.getClass();
                        t2c0.a(a, fragmentImpl, activity, recyclerView, d5c0Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(y8c0Var.c()), new bws(i3)), new fe60(y8c0Var, i2));
                return s3q0.a;
            case 2:
                PostingFragment postingFragment = (PostingFragment) obj2;
                com.vk.core.utils.newtork.d dVar = (com.vk.core.utils.newtork.d) obj;
                int i5 = PostingFragment.L0;
                if (dVar instanceof d.a) {
                    postingFragment.getFeature().C(new PostingAction.NetworkStateChanged(true));
                } else {
                    if (!(dVar instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    postingFragment.getFeature().C(new PostingAction.NetworkStateChanged(false));
                }
                return s3q0.a;
            case 3:
                wgc0 wgc0Var = (wgc0) obj2;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    wgc0Var.a.d(new PostingAction.Editing.Text.ParsedAttachmentsByLinks(list));
                }
                return s3q0.a;
            case 4:
                PostingSettingsUserView.a aVar = ((PostingSettingsUserView) obj2).w;
                if (aVar != null) {
                    aVar.c();
                }
                return s3q0.a;
            case 5:
                ((Boolean) obj).booleanValue();
                ((m8d0) obj2).g().invoke(s7d0.d.a);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((xle0) obj2).b.contains(fpf0.a(obj.getClass())));
            case 7:
                gzs<s3q0> gzsVar = ((eye0) obj2).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 8:
                i9i0 i9i0Var = (i9i0) obj2;
                LanguageModel languageModel2 = i9i0Var.h;
                if (languageModel2 != null && (languageModel = i9i0Var.i) != null) {
                    i9i0Var.b.X0(languageModel2, languageModel);
                }
                return s3q0.a;
            case 9:
                ((e8j0) obj2).hide();
                return s3q0.a;
            case 10:
                lwk0 lwk0Var = ((com.vk.clips.sdk.shared.item.static_ads.d) obj2).d;
                lwk0Var.getClass();
                return new fxk0.b(((tj50.a) obj).a(new b140(lwk0Var, 22), ao8.d));
            case 11:
                L.g("Can't unban author of question", (Throwable) obj);
                ((sbl0) obj2).b();
                return s3q0.a;
            case 12:
                Throwable th = (Throwable) obj;
                StickersRouletteFragment stickersRouletteFragment = ((rcl0) obj2).b;
                String message = th.getMessage();
                stickersRouletteFragment.ro(message != null ? message : "");
                L.i(th);
                return s3q0.a;
            case 13:
                float floatValue = ((Number) ((if2) obj).d()).floatValue();
                ConcurrentHashMap concurrentHashMap = ofl0.k;
                ((vak0) ((ofl0) obj2).h).g(floatValue);
                return s3q0.a;
            case 14:
                ((com.vk.stories.design.view.stats.tabs.viewers.mvi.b) obj2).T(new e.b.c((Throwable) obj));
                return s3q0.a;
            case 15:
                ((ffo0) obj2).b.invoke(new meo0((Bitmap) obj));
                return s3q0.a;
            case 16:
                wzo0 wzo0Var = (wzo0) obj2;
                int i6 = ((ModalActionSheetListItem) obj).a;
                if (i6 == AvatarAction.CHANGE_BY_GALLERY.ordinal()) {
                    wzo0Var.l.e();
                } else if (i6 == AvatarAction.CHANGE_BY_MINI_APP.ordinal()) {
                    wzo0Var.l.b();
                } else if (i6 == AvatarAction.CHANGE_BY_CAMERA.ordinal()) {
                    wzo0Var.l.d();
                } else if (i6 == AvatarAction.REMOVE.ordinal()) {
                    wzo0Var.l.h();
                }
                return s3q0.a;
            case 17:
                ModalSettingsRowView modalSettingsRowView = (ModalSettingsRowView) obj2;
                modalSettingsRowView.setHint("");
                j03.j(modalSettingsRowView.getContext(), (Throwable) obj);
                return s3q0.a;
            case 18:
                ((emq0) obj2).n.invoke(new UserProfileAction.b.a((String) obj));
                return s3q0.a;
            case 19:
                Throwable th2 = (Throwable) obj;
                a780 a780Var = ((VKAnimationView) obj2).p;
                if (a780Var != null) {
                    a780Var.a();
                }
                L.g("error: ", th2);
                return s3q0.a;
            case 20:
                Long l = (Long) obj2;
                if (l == null || l.longValue() != 0) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PHONE_REUSE_REQUESTED, null, null, null, null, null, null, 254);
                }
                return s3q0.a;
            case 21:
                gzs<s3q0> gzsVar2 = ((VideoCatalogHeaderBrandedVh) obj2).f;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 22:
                gzs gzsVar3 = (gzs) obj2;
                int i7 = VideoNewProfileHeaderViewV2.y;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                }
                return s3q0.a;
            case 23:
                return new io.reactivex.rxjava3.internal.operators.single.v(new os2(((wys0) ((com.vk.libvideo.offline.ui.a) obj2).m).a.I0, 4));
            case 24:
                ((h9t0) obj2).e.invoke(f.h.c.b);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                ((VideoRelatedVideosFragment) obj2).Z = null;
                return s3q0.a;
            case 26:
                hht0 hht0Var = (hht0) obj2;
                VideoFile videoFile = (VideoFile) obj;
                io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar2 = hht0Var.d;
                cyh0 cyh0Var = new cyh0(new b1o0(5), 7);
                dVar2.getClass();
                io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar2, cyh0Var).U(new d810(new n1g0(i3), 13));
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar2);
                uk40 uk40Var = new uk40(new ght0(i4, videoFile), 26);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                io.reactivex.rxjava3.internal.operators.observable.b0 E = yVar.E(uk40Var, lVar, kVar, kVar);
                i8p0 i8p0Var = hht0Var.c;
                int o0 = videoFile.o0();
                UserId I0 = videoFile.I0();
                String C1 = videoFile.C1();
                boolean c0 = videoFile.c0();
                int c1 = videoFile.c1();
                VideoRestriction O = videoFile.O();
                boolean z = (O == null || O.f) ? false : true;
                yps0 yps0Var = new yps0(o0, I0, C1, !z, c0, c1, videoFile.s(), videoFile.M0());
                i8p0Var.b.getClass();
                if (z) {
                    T = io.reactivex.rxjava3.core.q.T(Optional.empty());
                } else {
                    dz2 x = yfb.x(tft0.C(i8p0Var.c.a, o0, I0, C1, Boolean.FALSE, null, 0, 10, VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST, Collections.singletonList("photo_base"), Boolean.TRUE, null, null, 12544));
                    ahn.D(x);
                    T = new io.reactivex.rxjava3.internal.operators.observable.p1(rsg0.y0(x, null, null, 3).U(new cfz(new h2h0(12), 19)).a0(asu0.a.c()).y0(30L, TimeUnit.SECONDS), new wga0(new viu(28), i2)).U(new tuz(new lx60(14, i8p0Var, yps0Var), 17));
                }
                return io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.y(T, qVar, aVar2).r0(asu0.a.c()), E, new cmc0(new gre(hht0Var), 8)).p0(r1k0.b.c.a);
            case 27:
                final xqo xqoVar = (xqo) obj2;
                final View value = xqoVar.a.getValue();
                if (value == null) {
                    return new ztt0();
                }
                ?? r2 = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.ytt0
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        xqo xqoVar2 = xqo.this;
                        wh50 wh50Var = xqoVar2.g;
                        ulo uloVar = (ulo) ((zak0) wh50Var).getValue();
                        if (uloVar == null) {
                            return true;
                        }
                        if (!uloVar.a.e()) {
                            ((zak0) wh50Var).setValue(null);
                            return true;
                        }
                        View view = value;
                        but0.b(view, xqoVar2, uloVar);
                        jxs.a(view.getContext(), uloVar.c, ((vak0) xqoVar2.d).getFloatValue());
                        ((zak0) wh50Var).setValue(uloVar);
                        return true;
                    }
                };
                ViewTreeObserver viewTreeObserver = value.getViewTreeObserver();
                if (viewTreeObserver != 0) {
                    viewTreeObserver.addOnPreDrawListener(r2);
                }
                return new aut0(value, r2);
            case 28:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i8 = kw0.l;
                x1c0 x1c0Var = ((uxt0) obj2).f0;
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                x1c0Var.getClass();
                View inflate = from.inflate(R.layout.fullscreen_ads_item_controls, viewGroup, false);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return new kw0(inflate);
            default:
                gzs<s3q0> gzsVar4 = ((VkSearchQueryVh) obj2).f;
                if (gzsVar4 != null) {
                    gzsVar4.invoke();
                }
                return Boolean.TRUE;
        }
    }
}
