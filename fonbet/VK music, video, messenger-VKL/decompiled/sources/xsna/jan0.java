package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.api.newsfeed.WallAdsEasyPromoteUrlBuilder;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cox0;
import xsna.dxq0;
import xsna.eys0;
import xsna.svq0;
import xsna.wlc;
import xsna.xn50;
import xsna.yo60;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jan0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jan0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kan0 kan0Var = (kan0) obj2;
                Object obj3 = kan0Var.l;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                WebAction webAction = ((lan0) obj4).e.u;
                if (webAction != null) {
                    u7n0 u7n0Var = kan0Var.p;
                    Context context = kan0Var.itemView.getContext();
                    Object obj5 = kan0Var.l;
                    u7n0Var.Z(context, webAction, ((lan0) (obj5 != null ? obj5 : null)).e);
                }
                break;
            case 1:
                g0o0 g0o0Var = (g0o0) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.i(g0o0Var.itemView.getContext(), (VKApiExecutionException) th);
                }
                break;
            case 2:
                Drawable drawable = (Drawable) obj2;
                oio oioVar = (oio) obj;
                yq9 a = oioVar.a0().a();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (oioVar.d() >> 32)), (int) Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)));
                Canvas canvas = e52.a;
                drawable.draw(((d52) a).a);
                break;
            case 3:
                ((x6p0) obj2).e(((Number) ((zak0) ((gq2) obj).e).getValue()).floatValue());
                break;
            case 4:
                ((woq0) obj2).n.a(UserProfileAction.h.a.b.b);
                break;
            case 5:
                final vxq0 vxq0Var = (vxq0) obj2;
                foq0 foq0Var = vxq0Var.j;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                com.vk.mvi.binder.c.a(cVar, f9t.w(vxq0Var.q()), new iyp() { // from class: xsna.uxq0
                    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        Videos videos;
                        UserId c;
                        Owner s;
                        UserId userId;
                        String Bb;
                        vxq0 vxq0Var2 = vxq0.this;
                        foq0 foq0Var2 = vxq0Var2.j;
                        ?? r2 = vxq0Var2.A;
                        svq0 svq0Var = (svq0) pk50Var;
                        if (svq0Var instanceof svq0.a) {
                            mvq0 mvq0Var = (mvq0) vxq0Var2.y.getValue();
                            kvq0 n = ((vxq0) mvq0Var.a.c).n();
                            nvq0 nvq0Var = n.y;
                            FragmentImpl fragmentImpl = ((vxq0) mvq0Var.b.c).b;
                            Activity invoke = mvq0Var.c.invoke();
                            RecyclerView invoke2 = mvq0Var.d.invoke();
                            nvq0Var.getClass();
                            fq60 a2 = n.a();
                            mo60 mo60Var = n.a;
                            yo60 yo60Var = ((svq0.a) svq0Var).a;
                            if (!(yo60Var instanceof yo60.j)) {
                                a2.b(mo60Var, fragmentImpl, invoke, invoke2, yo60Var);
                                return;
                            }
                            gq60 gq60Var = mo60Var.i0;
                            a2.getClass();
                            fq60.c((yo60.j) yo60Var, gq60Var);
                            s3q0 s3q0Var = s3q0.a;
                            return;
                        }
                        if (!(svq0Var instanceof svq0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        svq0.b bVar = (svq0.b) svq0Var;
                        boolean z = false;
                        if (bVar instanceof svq0.b.a) {
                            foq0Var2.x6(new dxq0.a.b(false));
                            return;
                        }
                        if (bVar instanceof svq0.b.h) {
                            foq0Var2.t6();
                            return;
                        }
                        if (bVar instanceof svq0.b.m) {
                            vxq0Var2.n().a.n.i(new j8n0(vxq0Var2, 5));
                            return;
                        }
                        if (bVar instanceof svq0.b.n) {
                            if (vxq0Var2.q().getCurrentState().p) {
                                return;
                            }
                            foq0Var2.x6(dxq0.a.C2768a.a);
                            return;
                        }
                        if (bVar instanceof svq0.b.r) {
                            svq0.b.r rVar = (svq0.b.r) bVar;
                            foq0Var2.x6(new dxq0.a.g(rVar.a, rVar.b));
                            return;
                        }
                        if (bVar instanceof svq0.b.t) {
                            foq0Var2.x6(new dxq0.a.i(0));
                            return;
                        }
                        if (bVar instanceof svq0.b.s) {
                            foq0Var2.x6(new dxq0.a.h(0));
                            return;
                        }
                        if (bVar instanceof svq0.b.q) {
                            foq0Var2.x6(new dxq0.a.e(0));
                            return;
                        }
                        if (bVar instanceof svq0.b.g) {
                            xxq0 a3 = yxq0.a(vxq0Var2.q().getCurrentState());
                            if (a3.i) {
                                return;
                            }
                            foq0Var2.x6(new dxq0.a.f());
                            boolean z2 = a3.h;
                            if (z2) {
                                foq0Var2.x6(dxq0.a.C2768a.a);
                                return;
                            } else {
                                vxq0Var2.r(new eip(a3.c, a3.d, a3.b, a3.i, z2));
                                return;
                            }
                        }
                        if (bVar instanceof svq0.b.p) {
                            svq0.b.p pVar = (svq0.b.p) bVar;
                            foq0Var2.x6(new dxq0.a.d(pVar.a, pVar.b));
                            return;
                        }
                        if (bVar instanceof svq0.b.k) {
                            vxq0Var2.j();
                            return;
                        }
                        if (bVar instanceof svq0.b.j) {
                            vxq0Var2.i();
                            return;
                        }
                        if (bVar instanceof svq0.b.e) {
                            ar60 o = vxq0Var2.o();
                            o.i.a();
                            ehv ehvVar = (ehv) o.b().p.b;
                            if (ehvVar != null) {
                                ehvVar.m();
                            }
                            o.b().p.a().c();
                            ((w5r0) o.b().q.getValue()).a();
                            return;
                        }
                        if (bVar instanceof svq0.b.i) {
                            wwq0 wwq0Var = (wwq0) vxq0Var2.u.getValue();
                            svq0.b.i iVar = (svq0.b.i) bVar;
                            if (wwq0Var.d) {
                                return;
                            }
                            wwq0Var.f = iVar;
                            wwq0Var.d();
                            return;
                        }
                        if (bVar instanceof svq0.b.l) {
                            dpq0 dpq0Var = (dpq0) r2.getValue();
                            NewsEntry newsEntry = ((svq0.b.l) bVar).a;
                            FragmentActivity activity = dpq0Var.b.getActivity();
                            if (activity == null) {
                                return;
                            }
                            ((NewsFeedComponent) dpq0Var.a.a(fpf0.a(NewsFeedComponent.class))).n0();
                            iuc0 iuc0Var = iuc0.b;
                            UserId o2 = k9q0.o(newsEntry);
                            if (newsEntry instanceof Post) {
                                iuc0Var.A(activity, o2, (Post) newsEntry);
                                return;
                            } else {
                                if (newsEntry instanceof Videos) {
                                    iuc0Var.Q(activity, o2, (Videos) newsEntry);
                                    return;
                                }
                                return;
                            }
                        }
                        if (bVar instanceof svq0.b.C3691b) {
                            dpq0 dpq0Var2 = (dpq0) r2.getValue();
                            NewsEntry newsEntry2 = ((svq0.b.C3691b) bVar).a;
                            if (!(newsEntry2 instanceof Post)) {
                                dpq0Var2.getClass();
                                return;
                            }
                            FragmentActivity activity2 = dpq0Var2.b.getActivity();
                            if (activity2 == null) {
                                return;
                            }
                            ((NewsFeedComponent) dpq0Var2.a.a(fpf0.a(NewsFeedComponent.class))).n0();
                            Post post = (Post) newsEntry2;
                            iuc0.b.o(activity2, post.m, post);
                            return;
                        }
                        if (bVar instanceof svq0.b.o) {
                            NewsEntry newsEntry3 = ((svq0.b.o) bVar).a;
                            FragmentImpl fragmentImpl2 = vxq0Var2.b;
                            FragmentActivity activity3 = fragmentImpl2.getActivity();
                            if (activity3 == null) {
                                return;
                            }
                            NewsFeedComponent newsFeedComponent = (NewsFeedComponent) m7m.d(fragmentImpl2).a(fpf0.a(NewsFeedComponent.class));
                            newsFeedComponent.n0();
                            vxq0Var2.a(iuc0.b.b0(activity3, k9q0.o(newsEntry3), newsEntry3).subscribe(new z6w(2, newsFeedComponent, newsEntry3), new uk40(new xlq0(1), 20)));
                            return;
                        }
                        if (bVar instanceof svq0.b.d) {
                            dpq0 dpq0Var3 = (dpq0) r2.getValue();
                            NewsEntry newsEntry4 = ((svq0.b.d) bVar).a;
                            h7m h7mVar = dpq0Var3.a;
                            FragmentActivity activity4 = dpq0Var3.b.getActivity();
                            if (activity4 == null || (Bb = newsEntry4.Bb()) == null) {
                                return;
                            }
                            boolean d = fkq0.d(k9q0.o(newsEntry4));
                            ((AdsComponent) h7mVar.mo408a(fpf0.a(AdsComponent.class))).getClass();
                            gd60 Ad = ((NewsFeedBridgeComponent) h7mVar.a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
                            boolean z3 = newsEntry4 instanceof Post;
                            yv0 yv0Var = yv0.a;
                            if (z3) {
                                Ad.G(activity4, InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, yv0Var.a(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_POST_ACTION_MENU : WallAdsEasyPromoteUrlBuilder.From.COM_POST_ACTION_MENU));
                                return;
                            } else {
                                if (newsEntry4 instanceof Videos) {
                                    Ad.G(activity4, InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, yv0Var.b(Bb, d ? WallAdsEasyPromoteUrlBuilder.From.PROFILE_CLIP_ACTION_MENU : WallAdsEasyPromoteUrlBuilder.From.COM_CLIP_ACTION_MENU));
                                    return;
                                }
                                return;
                            }
                        }
                        if (!(bVar instanceof svq0.b.c)) {
                            if (!(bVar instanceof svq0.b.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dpq0 dpq0Var4 = (dpq0) r2.getValue();
                            NewsEntry newsEntry5 = ((svq0.b.f) bVar).a;
                            dpq0Var4.getClass();
                            videos = newsEntry5 instanceof Videos ? (Videos) newsEntry5 : null;
                            if (videos == null) {
                                return;
                            }
                            c63 c63Var = c63.a;
                            Activity b = c63.b();
                            VideoAttachment Nb = videos.Nb();
                            if (b == null || Nb == null) {
                                return;
                            }
                            xlc q5 = ((ClipActionsComponent) dpq0Var4.a.mo408a(fpf0.a(ClipActionsComponent.class))).q5();
                            if (videos.Ea()) {
                                q5.e(b, new wlc.c(Nb.k, false));
                                return;
                            }
                            return;
                        }
                        dpq0 dpq0Var5 = (dpq0) r2.getValue();
                        NewsEntry newsEntry6 = ((svq0.b.c) bVar).a;
                        dpq0Var5.getClass();
                        videos = newsEntry6 instanceof Videos ? (Videos) newsEntry6 : null;
                        if (videos == null) {
                            return;
                        }
                        c63 c63Var2 = c63.a;
                        Activity b2 = c63.b();
                        VideoAttachment Nb2 = videos.Nb();
                        if (b2 == null || Nb2 == null) {
                            return;
                        }
                        xlc q52 = ((ClipActionsComponent) dpq0Var5.a.mo408a(fpf0.a(ClipActionsComponent.class))).q5();
                        if (videos.Ea()) {
                            q52.a(b2, new wlc.a(Nb2.k, false));
                            return;
                        }
                        if (fxc0.B().J().i1() && (s = Nb2.k.s()) != null && (userId = s.b) != null && fkq0.b(userId) && Nb2.k.t0()) {
                            z = true;
                        }
                        if (Nb2.k.t0()) {
                            Owner s2 = Nb2.k.s();
                            if (s2 == null || (c = s2.b) == null) {
                                c = UserId.d;
                            }
                        } else {
                            c = ((b25) dpq0Var5.c.getValue()).c();
                        }
                        if (z) {
                            fxc0.B().getClass();
                        } else {
                            fxc0.B().k0(b2, Nb2.k, false, c, null);
                        }
                    }
                });
                xxq0 a2 = yxq0.a(vxq0Var.q().getCurrentState());
                if (!a2.i) {
                    foq0Var.x6(new dxq0.a.f());
                    if (a2.h) {
                        foq0Var.x6(dxq0.a.C2768a.a);
                    }
                }
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(vxq0Var.q()), new n0m0(8)), new xhb0(vxq0Var, 10));
                break;
            case 6:
                skj0 skj0Var = (skj0) obj2;
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                int i2 = videoListWithTotalCount.d;
                Integer valueOf = i2 > -1 ? Integer.valueOf(i2) : null;
                skj0Var.invoke(new rbt0(valueOf != null ? valueOf.intValue() : 0, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                break;
            case 7:
                break;
            case 8:
                fys0 fys0Var = (fys0) obj2;
                int i3 = fys0.j1;
                fys0Var.getClass();
                xn50.a.c(fys0Var, eys0.b.b);
                break;
            case 9:
                ((q4t0) obj2).k.invoke((com.vk.catalog2.common.ui.holders.video.playlist.cover.a) obj);
                break;
            case 10:
                ((odt0) obj2).b.invoke();
                break;
            case 11:
                ((rzq0) obj).b((List) obj2, gcd0.e);
                break;
            case 12:
                ((mov0) obj2).c.j(JsApiMethodType.SHOW_GOODS_ORDER_BOX, VkAppsErrors.b((Throwable) obj));
                break;
            case 13:
                kkw0 kkw0Var = (kkw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    eo9 eo9Var = kkw0Var.g;
                    ViewGroup viewGroup = kkw0Var.c;
                    if (eo9Var != null) {
                        viewGroup.getWidth();
                        eo9Var.c(viewGroup.getHeight());
                    }
                } else {
                    eo9 eo9Var2 = kkw0Var.g;
                    if (eo9Var2 != null) {
                        eo9Var2.c(0);
                    }
                }
                break;
            case 14:
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                ((puw0) obj2).l.b(new zhg.a(th2));
                break;
            case 15:
                ((VoipSelectEffectInCallFragment) obj2).P.a((Intent) obj);
                break;
            case 16:
                arj arjVar = ((ycx0) obj2).d.c;
                if (arjVar != null) {
                    arjVar.a();
                }
                break;
            case 17:
                WebViewFragment webViewFragment = (WebViewFragment) obj2;
                Throwable th3 = (Throwable) obj;
                int i4 = WebViewFragment.O0;
                webViewFragment.getClass();
                L.j(th3, "webViewWrapperLoader.setErrorHandler");
                if (th3 instanceof Exception) {
                    webViewFragment.onError((Exception) th3);
                }
                break;
            case 18:
                ((xnx0) obj2).T(new cox0.a.C2674a((Throwable) obj));
                break;
            default:
                ((pnr0) obj2).invoke();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jan0(skj0 skj0Var, com.vk.video.ui.discovery.minimizable.related_videos.d dVar) {
        this.b = 6;
        this.c = skj0Var;
    }
}
