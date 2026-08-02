package xsna;

import android.content.Context;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vk.webapp.fragments.CommunityManageFragment;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.g8i;
import xsna.hxo;
import xsna.num;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l9h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l9h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n9h n9hVar = ((CommunityManageFragment) obj).g0;
                int i2 = n9hVar.d;
                if (i2 > 0) {
                    com.vk.upload.impl.a.b(i2, null);
                    n9hVar.d = -1;
                }
                return s3q0.a;
            case 1:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj;
                communityNotificationSettingsFragment.a0 = true;
                communityNotificationSettingsFragment.io();
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = CommunityProfileLinksFragment.P;
                return ((LinksBridgeComponent) m7m.d((CommunityProfileLinksFragment) obj).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 3:
                return ((BridgeComponent) m7m.d(((o1i) obj).b).a(fpf0.a(BridgeComponent.class))).O();
            case 4:
                return ((oaj) obj).itemView.getContext().getString(R.string.vkim_contact_already_in_chat);
            case 5:
                PinDotsView pinDotsView = ((bbk) obj).m;
                (pinDotsView != null ? pinDotsView : null).a();
                return s3q0.a;
            case 6:
                return jgz.i;
            case 7:
                efm efmVar = ((cfm) obj).e;
                if (efmVar != null) {
                    efmVar.p();
                }
                return s3q0.a;
            case 8:
                Context context = ((ggm) obj).d;
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.ic_call_badge_active_26, context);
            case 9:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 10:
                ((psm) obj).n(num.c.a);
                return s3q0.a;
            case 11:
                ((h3o) obj).q6();
                return s3q0.a;
            case 12:
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) obj;
                int i3 = EcosystemProfileView.m;
                a.b bVar = a.b.b;
                ecosystemProfileView.getClass();
                xn50.a.c(ecosystemProfileView, bVar);
                ecosystemProfileView.i.s(hxo.f.b);
                return s3q0.a;
            case 13:
                cvk.u(R.string.picker_image_format_invalid, false);
                com.vk.attachpicker.screen.h.n((com.vk.attachpicker.screen.h) obj);
                return s3q0.a;
            case 14:
                return ((tgl0) ((nt8) obj).b).I0().k();
            case 15:
                return (ClipsPlaylistsComponentImpl) ((k7m) m7m.f((EmptyPlaylistBottomSheet) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 16:
                FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = (FirstPinnedTabLayoutVh) obj;
                firstPinnedTabLayoutVh.y = null;
                firstPinnedTabLayoutVh.e();
                return s3q0.a;
            case 17:
                return ((l0s) obj).a.a(OpenChatListReporter.Span.LOAD_FOLDERS);
            case 18:
                return ((BridgeComponent) ((k7m) m7m.f((c4s) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 19:
                mss mssVar = (mss) obj;
                return new t7k0(mssVar.h, mssVar.b, mssVar.f.a.T(), mssVar);
            case 20:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj;
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                return geoPostsFragment;
            case 21:
                return ((SearchParamsComponent) ((k7m) m7m.f((GlobalSearchGroupsCatalogRootVh) obj)).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 22:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj;
                int i4 = HighlightEditFragment.h0;
                ((j6v) highlightEditFragment.g0.getValue()).d(NarrativePublishEventType.CLOSE, (String) highlightEditFragment.f0.getValue(), null);
                highlightEditFragment.finish();
                return s3q0.a;
            case 23:
                StringBuilder sb = new StringBuilder("    awaitSuccessful = ");
                sb.append(((g8i.a) obj).d == null);
                return sb.toString();
            case 24:
                return ((l4y) obj).o(VkWorkoutBridgeDelegatesFactory.DelegateType.ASK_WORKOUT_PERMISSION_HC);
            case 25:
                return new j6y((r6y) obj);
            case 26:
                x7y x7yVar = (x7y) obj;
                return new dv1(new y7y(x7yVar, x7y.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0), x7yVar.f, x7yVar.X0(), x7yVar.L0());
            case 27:
                String[] strArr = LibverifyPresenter.d0;
                y2z y2zVar = (y2z) ((LibverifyPresenter) obj).a;
                if (y2zVar != null) {
                    y2zVar.e();
                }
                return s3q0.a;
            case 28:
                kz20 kz20Var = ((i8z) obj).j;
                return Boolean.valueOf((kz20Var == null || kz20Var.b()) ? false : true);
            default:
                return "state=" + ((ry40) obj);
        }
    }
}
