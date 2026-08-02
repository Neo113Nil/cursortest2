package xsna;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ironsource.T3;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.holders.OpenInfoPopupVh;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.ui.fragments.PhonebookContactFragment;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.offline.api.model.moosic.VkMusicOldPlaylistEntity;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.reefton.Reef;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.pn60;
import xsna.qbk;
import xsna.rfa0.a;
import xsna.u1h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hp30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hp30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        nyt0 a;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ip30) obj).a().getString(R.string.vkim_accessibility_icon_pause);
            case 1:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((uo40) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                StringBuilder sb = new StringBuilder("Playlists and albums for local import: ");
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((VkMusicOldPlaylistEntity) it.next()).b));
                }
                sb.append(j5g.g0(arrayList2, null, null, null, 0, null, 63));
                return sb.toString();
            case 3:
                qo50 qo50Var = (qo50) obj;
                qo50Var.j.setAdapter(qo50Var.l);
                ym40 C0 = qo50Var.j.C0();
                int i2 = C0.j;
                if (i2 == 0) {
                    i2 = 100;
                }
                C0.tn(0, i2, true);
                return null;
            case 4:
                ((NewsFeedComponent) ((k7m) m7m.c(((hs50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 5:
                return ((DocumentsComponent) ((k7m) m7m.f((fa60) obj)).mo408a(fpf0.a(DocumentsComponent.class))).F7();
            case 6:
                return (CartComponent) ((mo60) obj).c().a(fpf0.a(CartComponent.class));
            case 7:
                qcy<Object>[] qcyVarArr = OpenInfoPopupVh.d;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 8:
                int i3 = PhonebookContactFragment.S;
                return ((ImExperimentsComponent) m7m.d((PhonebookContactFragment) obj).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
            case 9:
                return ((rfa0) obj).new a();
            case 10:
                PollsWebView pollsWebView = (PollsWebView) obj;
                int i4 = PollsWebView.h;
                return new com.vk.uxpolls.presentation.view.b(new kx1(pollsWebView), new ofy0(9), new ytb0(pollsWebView));
            case 11:
                return ((ClipsViewerComponent) ((k7m) m7m.f((com.vk.newsfeed.common.util.j) obj)).a(fpf0.a(ClipsViewerComponent.class))).pe();
            case 12:
                int i5 = PostPreviewFragment.g0;
                return ((NewsfeedMappersComponent) m7m.d((PostPreviewFragment) obj).mo408a(fpf0.a(NewsfeedMappersComponent.class))).X8();
            case 13:
                RectF o = zjq.o(((enc0) obj).m.getRightMainRect().i(f4m.e(bwt0.A(r5.m)).left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                Rect rect = new Rect();
                o.roundOut(rect);
                return rect;
            case 14:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) obj;
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) postponedPostsFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                postponedPostsFragment.P = qn60Var;
                ?? r0 = postponedPostsFragment.eo().b;
                s1c0 s1c0Var = (s1c0) postponedPostsFragment.R.getValue();
                String str = postponedPostsFragment.m0.get();
                AtomicReference<String> atomicReference = postponedPostsFragment.n0;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, str, atomicReference.get()), r0);
                postponedPostsFragment.Q = pn60Var;
                rn60.a(qn60Var);
                PostponedPostsFragment.d dVar = new PostponedPostsFragment.d(atomicReference);
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) dVar);
                return new rsc0(new ftc0(qn60Var, pn60Var, eh60Var, new s1v(), postponedPostsFragment.eo().a, new AtomicReference(new wn60((byte) 0)), new s1v(), (drc0) postponedPostsFragment.N.getValue(), new esc0(new ctc0(), new msc0(), new xrc0()), cVar, fs60.a(qn60Var, pn60Var, cVar, postponedPostsFragment.eo().a)));
            case 15:
                return new bbd(((tid0) obj).a);
            case 16:
                int i6 = ProfileFriendsFragment.k0;
                return ((PostingComponent) m7m.d((ProfileFriendsFragment) obj).mo408a(fpf0.a(PostingComponent.class))).H6().f();
            case 17:
                return new bzb0(((j5e0) obj).a);
            case 18:
                com.vk.reefton.c cVar2 = (com.vk.reefton.c) obj;
                AtomicLong atomicLong = cVar2.l;
                qof0 qof0Var = cVar2.a;
                iof0 iof0Var = qof0Var.p;
                if (iof0Var == null) {
                    iof0Var = qof0Var.q.invoke();
                    qof0Var.p = iof0Var;
                }
                if (iof0Var != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(iof0Var.b());
                        if (jSONObject.has("lost_snapshots")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("lost_snapshots");
                            cVar2.d.set(jSONObject2.optLong(X3.i.l));
                            cVar2.c.set(jSONObject2.optLong("queue_limit"));
                            cVar2.e.set(jSONObject2.optLong("offline"));
                            cVar2.f.set(jSONObject2.optLong("wifi"));
                            cVar2.g.set(jSONObject2.optLong("2g"));
                            cVar2.h.set(jSONObject2.optLong(T3.a));
                            cVar2.i.set(jSONObject2.optLong("4g"));
                            cVar2.j.set(jSONObject2.optLong("cellular_unknown"));
                            cVar2.k.set(jSONObject2.optLong("other"));
                            atomicLong.set(jSONObject2.optLong("app_restart"));
                        }
                        if (jSONObject.has("snapshots_queue_length")) {
                            atomicLong.addAndGet(jSONObject.optLong("snapshots_queue_length"));
                        }
                        if (jSONObject.has("psl_errors")) {
                            cVar2.m.addAndGet(jSONObject.optLong("psl_errors"));
                        }
                    } catch (Throwable th) {
                        qof0Var.b().b();
                        AtomicInteger atomicInteger = Reef.i;
                        Reef.a.a(th);
                    }
                }
                return s3q0.a;
            case 19:
                u1h0 u1h0Var = (u1h0) obj;
                xyt0 xyt0Var = u1h0Var.b;
                String str2 = u1h0Var.a;
                vyt0 vyt0Var = new vyt0(xyt0Var.getViewModelStore(), new b2h0(u1h0Var.c, new fuc0(u1h0Var, 7)), xyt0Var instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelCreationExtras() : qbk.a.b);
                if (str2 != null) {
                    a = vyt0Var.a(str2, fpf0.a(u1h0.a.class));
                } else {
                    rfc a2 = fpf0.a(u1h0.a.class);
                    String h = a2.h();
                    if (h == null) {
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    }
                    a = vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
                }
                return ((u1h0.a) a).d;
            case 20:
                return (TextView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.error_text);
            case 21:
                return Integer.valueOf(((List) obj).size());
            case 22:
                return new xjs(new byo(27), new mi10((odk0) obj, 24));
            case 23:
                return bpl0.a(((cpl0) obj).getCurrentState());
            case 24:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj;
                float f = 36;
                int i7 = -iah0.a(f);
                int a3 = iah0.a(f);
                swipeRefreshLayout.s = true;
                swipeRefreshLayout.y = i7;
                swipeRefreshLayout.z = a3;
                swipeRefreshLayout.J = true;
                swipeRefreshLayout.h();
                swipeRefreshLayout.d = false;
                return s3q0.a;
            case 25:
                return Integer.valueOf(e3m.a(R.dimen.vk_ui_spacing_size_xs, ((mtq0) obj).itemView.getContext()));
            case 26:
                return ((CommunityNewsfeedComponent) ((kvq0) obj).a.c().mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
            case 27:
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                return s3q0.a;
            case 28:
                hzr0 hzr0Var = (hzr0) obj;
                hzr0Var.d = true;
                hzr0Var.c.f();
                SharedPreferences.Editor edit = hzr0Var.f().edit();
                edit.putLong("pref_key_last_ad_free_popup_show", System.currentTimeMillis());
                edit.apply();
                return s3q0.a;
            default:
                ((pas0) obj).b = null;
                return s3q0.a;
        }
    }

    public /* synthetic */ hp30(bpl0 bpl0Var, cpl0 cpl0Var) {
        this.b = 23;
        this.c = cpl0Var;
    }
}
