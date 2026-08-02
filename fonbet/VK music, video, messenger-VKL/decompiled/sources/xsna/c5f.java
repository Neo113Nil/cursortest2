package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.feature.news.holders.FeedVh;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponentImpl;
import com.vk.im.itemlist.api.di.ImItemListComponent;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dzh;
import xsna.e8v0;
import xsna.epx;
import xsna.fss;
import xsna.npl;
import xsna.nzt;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c5f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        nek0 nek0Var;
        MobileOfficialAppsCoreNavStat$EventScreen a;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                utx0 utx0Var = (utx0) obj;
                utx0Var.a.b = utx0Var.d();
                return s3q0.a;
            case 1:
                int i2 = ClipsTemplateEditorFragmentsBottomView.j;
                return ((ClipsTemplateEditorFragmentsBottomView) obj).findViewById(R.id.clips_template_editor_template_fragments_recycler_view_right_shadow);
            case 2:
                izg izgVar = (izg) obj;
                dw20 dw20Var = izgVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                izgVar.a.invoke();
                return s3q0.a;
            case 3:
                ((d4h) obj).i.invoke(new CommunityProfileAction.e.g.b(e8v0.m.b));
                return s3q0.a;
            case 4:
                ynh ynhVar = (ynh) obj;
                CommunityProfileFragment communityProfileFragment = ynhVar.a;
                vbs Ln = communityProfileFragment.Ln();
                WeakReference weakReference = new WeakReference(Ln != null ? Ln.h : null);
                String obj2 = ynhVar.toString();
                Context requireContext = communityProfileFragment.requireContext();
                HashSet hashSet = iah0.a;
                return new htq0(obj2, null, null, null, fnj.b(requireContext), null, false, new fy0(5, weakReference, ynhVar), 16238);
            case 5:
                return new pmh(((lrh) obj).s());
            case 6:
                ryh ryhVar = (ryh) obj;
                ryhVar.b.c(dzh.n.b.a);
                dw20 dw20Var2 = ryhVar.g;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                return s3q0.a;
            case 7:
                xn50.a.c((CommunityReviewsFragment) obj, new c.y(false));
                return s3q0.a;
            case 8:
                puj pujVar = (puj) obj;
                j1z j1zVar = pujVar.t;
                rwr rwrVar = pujVar.z;
                boolean z = pujVar.u;
                if (!j1zVar.b()) {
                    rwr.b(rwrVar);
                } else if (!z && (nek0Var = j1zVar.c) != null) {
                    nek0Var.show();
                }
                return Boolean.TRUE;
            case 9:
                return (TextView) ((lak) obj).findViewById(R.id.session_room_count_error);
            case 10:
                CreationOnboardingArguments creationOnboardingArguments = (CreationOnboardingArguments) obj;
                return new xck(creationOnboardingArguments.h, creationOnboardingArguments.b, creationOnboardingArguments.c, creationOnboardingArguments.d, creationOnboardingArguments.e, null, null, null);
            case 11:
                return ((mtm) obj).c.a(OpenChatListReporter.Span.LOADER_SPINNER);
            case 12:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                int i3 = 10;
                int i4 = 3;
                return new ewx(new ozf(discoverMediaTabFragment2, 18), new gbh(discoverMediaTabFragment2, i3), new k6k(discoverMediaTabFragment2, i4), new odm(discoverMediaTabFragment2, i4), new akh(discoverMediaTabFragment2, i3), new xyh(discoverMediaTabFragment2, 6), (AtomicReference) discoverMediaTabFragment2.c0.getValue());
            case 13:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) obj;
                int i5 = DisplayAudioBookChaptersFragment.b0;
                displayAudioBookChaptersFragment.ho();
                dw20 dw20Var3 = displayAudioBookChaptersFragment.R;
                if (dw20Var3 != null) {
                    dw20Var3.hide();
                }
                return s3q0.a;
            case 14:
                hao haoVar = (hao) obj;
                bhs0 bhs0Var = haoVar.i;
                float f = bhs0Var.d.b.h;
                fz5 fz5Var = fz5.d;
                Context context = haoVar.j;
                int bitrateEstimate = (int) (((jk80) fz5Var.j(context)).b.getBitrateEstimate() * f);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
                npl.d a2 = new ao80(context, haoVar.w, bhs0Var.d.a).a();
                a2.getClass();
                npl.d.a aVar = new npl.d.a(a2);
                aVar.d = bitrateEstimate;
                aVar.o = bitrateEstimate;
                aVar.a = max;
                aVar.b = max;
                aVar.v = true;
                return new npl.d(aVar);
            case 15:
                return ((xvy) obj).j();
            case 16:
                EntriesListFragment entriesListFragment = (EntriesListFragment) obj;
                return new mrp(entriesListFragment.W, entriesListFragment.X, entriesListFragment.Y);
            case 17:
                dha dhaVar = ((FeedVh) obj).d;
                return (dhaVar == null || (a = dhaVar.a()) == null) ? "" : com.vk.stat.scheme.t0.a(a);
            case 18:
                return ((ImItemListComponent) m7m.d(((l1s) obj).n).mo408a(fpf0.a(ImItemListComponent.class))).Ke();
            case 19:
                cjs cjsVar = (cjs) obj;
                cjsVar.n.a(new fss.c((RequestUserProfile) cjsVar.m, cjsVar.q));
                return s3q0.a;
            case 20:
                return ((evs) obj).q;
            case 21:
                final nzt nztVar = (nzt) obj;
                return new BroadcastReceiver() { // from class: com.vk.stickers.gifts.catalog.GiftsCatalogDelegate$giftSentEventReceiver$2$1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        String stringExtra = intent.getStringExtra("source_id");
                        nzt nztVar2 = nzt.this;
                        if (epx.f(nztVar2.d, stringExtra)) {
                            if (nztVar2.a || nztVar2.c) {
                                nztVar2.b.invoke();
                            } else {
                                nztVar2.c = false;
                            }
                        }
                    }
                };
            case 22:
                GlobalSearchWithParamsCatalogRootVh globalSearchWithParamsCatalogRootVh = (GlobalSearchWithParamsCatalogRootVh) obj;
                ysg0.b.a(globalSearchWithParamsCatalogRootVh.o0());
                globalSearchWithParamsCatalogRootVh.p0(null, true);
                return s3q0.a;
            case 23:
                return ((y4u) obj).h.S8();
            case 24:
                int i6 = GoodPreviewFragment.X;
                return new zqd0(m7m.d((GoodPreviewFragment) obj));
            case 25:
                ((GroupInviteVh) obj).a(true);
                return s3q0.a;
            case 26:
                ImConfigurationScopedComponentImpl imConfigurationScopedComponentImpl = (ImConfigurationScopedComponentImpl) obj;
                acw acwVar = imConfigurationScopedComponentImpl.a;
                return acwVar.a ? new g1w(sdy.n(acwVar)) : ((ImConfigurationComponent) imConfigurationScopedComponentImpl.b.getValue()).b0();
            case 27:
                ((mww) obj).b.invoke();
                return s3q0.a;
            case 28:
                ((fw20) obj).c.invoke();
                return Boolean.TRUE;
            default:
                return new ovp(((com.vk.superapp.vibration.js.bridge.impl.a) obj).b);
        }
    }
}
