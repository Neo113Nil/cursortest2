package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.playlist.MarusiaTrackSource;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.engine.di.event.ImCoroutinesEventObserverScopedComponentImpl;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.core.picker.GroupPickerActivity;
import com.vk.superapp.core.js.bridge.api.di.JsCoreDelegateComponent;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import xsna.a1w;
import xsna.ghw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class odm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ odm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        VideoFile A;
        VideoRestriction O;
        RestrictionButton restrictionButton;
        VideoFile A2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new f0s(((pdm) obj).b);
            case 1:
                return new VkFadeText(((egm) obj).d, null, 6, 0);
            case 2:
                wtm wtmVar = (wtm) obj;
                boolean b = wtmVar.b();
                ltm ltmVar = wtmVar.c;
                if (b) {
                    ltmVar.c();
                    ltmVar.b(wtmVar.b);
                } else {
                    wtmVar.a();
                }
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return ((DiscoverMediaTabFragment2) obj).On();
            case 4:
                VkAuthPhoneView vkAuthPhoneView = ((dpp) obj).t;
                return String.valueOf((vkAuthPhoneView != null ? vkAuthPhoneView : null).getCountry().b);
            case 5:
                return ((AudienceResearchComponent) ((k7m) m7m.f((EntriesListPresenter) obj)).a(fpf0.a(AudienceResearchComponent.class))).b();
            case 6:
                return go9.b("Getting data bytes failed: ", ((Throwable) obj).getMessage());
            case 7:
                ViewPager2 viewPager2 = ((t1s) obj).q;
                if (viewPager2 != null) {
                    return viewPager2;
                }
                return null;
            case 8:
                int i2 = FriendRequestsFragment.d0;
                return ((NotificationsComponent) m7m.d((FriendRequestsFragment) obj).a(fpf0.a(NotificationsComponent.class))).b();
            case 9:
                int i3 = FriendsCatalogFragment.V;
                return ((SearchParamsComponent) m7m.d((FriendsCatalogFragment) obj).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 10:
                int i4 = GalleryFragmentImpl.R0;
                return Integer.valueOf(((com.vk.attachpicker.b) obj).k());
            case 11:
                return Integer.valueOf(((mc90) obj).k());
            case 12:
                int i5 = GroupPickerActivity.G;
                return ((SharingComponent) ((GroupPickerActivity) obj).D.getValue()).c();
            case 13:
                mtk0<? extends Object> mtk0Var = ((w1v) obj).w;
                if (mtk0Var == null) {
                    throw jq.f("Font resolution state is not set.");
                }
                mtk0Var.getValue();
                return s3q0.a;
            case 14:
                int i6 = HighlightEditFragment.h0;
                return ((NarrativeComponent) m7m.d((HighlightEditFragment) obj).a(fpf0.a(NarrativeComponent.class))).n4();
            case 15:
                gzs<Boolean> gzsVar = ((bcv) obj).a.f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 16:
                return ((CommonEditorComponent) ((k7m) m7m.c((quv) obj)).a(fpf0.a(CommonEditorComponent.class))).Ha();
            case 17:
                ImCoroutinesEventObserverScopedComponentImpl imCoroutinesEventObserverScopedComponentImpl = (ImCoroutinesEventObserverScopedComponentImpl) obj;
                acw acwVar = imCoroutinesEventObserverScopedComponentImpl.a;
                return acwVar.a ? new yzv(sdy.n(acwVar)) : ((ImCoroutinesEventObserverComponent) imCoroutinesEventObserverScopedComponentImpl.b.getValue()).l();
            case 18:
                return "Ignoring request to startLongPoll for ImEnvironment. Reason: already started before with same bgSyncMode (" + ((a1w.c) obj).c + ')';
            case 19:
                ImItemListFragment imItemListFragment = (ImItemListFragment) obj;
                qcy<Object>[] qcyVarArr2 = ImItemListFragment.S;
                return "ImItemList.Debug Binding Navigation events with resumePauseMode (fragmentLifecycle=" + imItemListFragment.getLifecycle().getCurrentState() + ", viewLifecycle=" + imItemListFragment.getViewLifecycleOwner().getLifecycle().getCurrentState() + ')';
            case 20:
                r6y r6yVar = (r6y) obj;
                com.vk.superapp.core.js.bridge.api.di.b na = ((JsCoreDelegateComponent) x6y.H().a(fpf0.a(JsCoreDelegateComponent.class))).na();
                fvv0 M = r6yVar.M();
                fvv0 M2 = r6yVar.M();
                return na.a(M, r6yVar, M2 != null ? M2.d() : null, new os9(r6yVar, 11), new awz());
            case 21:
                tdz tdzVar = (tdz) obj;
                return new pvu(tdzVar.a, tdzVar.b);
            case 22:
                yl50 yl50Var = (yl50) obj;
                return "[apply patch] New MVI patch [" + fpf0.a(yl50Var.getClass()).l() + "] with data: " + yl50Var + ' ' + x100.a(null);
            case 23:
                ((u59) obj).d.a(ghw0.c.a);
                return s3q0.a;
            case 24:
                Serializer.c<MarusiaTrackSource> cVar = MarusiaTrackSource.CREATOR;
                return new JSONObject(((MarusiaTrackSource) obj).b);
            case 25:
                gr20 gr20Var = (gr20) obj;
                VideoMinimizableState videoMinimizableState = gr20Var.q;
                if ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState instanceof VideoMinimizableState.Pip)) {
                    return null;
                }
                l5o wb = gr20Var.d.d.wb();
                yg5 yg5Var = gr20Var.s;
                DonutVideoUiModel a = wb.a((yg5Var == null || (A2 = yg5Var.A()) == null) ? null : nkt0.a(A2), DonutVideoCardSource.PLAYER);
                if (a == null) {
                    return null;
                }
                DonutVideoUiModel.PreviewBadge previewBadge = a.b;
                yg5 yg5Var2 = gr20Var.s;
                if (yg5Var2 == null || (A = yg5Var2.A()) == null || (O = A.O()) == null || (restrictionButton = O.e) == null || (str = restrictionButton.c) == null) {
                    if (previewBadge != null) {
                        str = previewBadge.b;
                    } else {
                        DonutVideoUiModel.DescriptionChip descriptionChip = a.c;
                        str = descriptionChip != null ? descriptionChip.b : null;
                    }
                }
                return new czn(str, previewBadge != null ? previewBadge.c : null, previewBadge != null ? previewBadge.d : null);
            case 26:
                iy30 iy30Var = (iy30) obj;
                ViewPager viewPager = iy30Var.n;
                if (viewPager == null) {
                    viewPager = null;
                }
                viewPager.setVisibility(0);
                ViewPager viewPager3 = iy30Var.n;
                (viewPager3 != null ? viewPager3 : null).setAlpha(1.0f);
                LinkedHashMap linkedHashMap = iy30Var.a().e;
                if (!linkedHashMap.isEmpty()) {
                    for (b0i0 b0i0Var : linkedHashMap.values()) {
                        RecyclerView recyclerView = b0i0Var.d;
                        View view = b0i0Var.a;
                        if (f4m.g(view)) {
                            d3m.c(b0i0Var.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        recyclerView.setVisibility(4);
                        recyclerView.stopScroll();
                        view.setVisibility(0);
                        b0i0Var.b.setVisibility(4);
                        b0i0Var.c.setVisibility(4);
                    }
                }
                return s3q0.a;
            case 27:
                return ((NewsFeedComponent) ((k7m) m7m.c(((pq50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 28:
                bp50 bp50Var = (bp50) obj;
                if (bp50Var != null) {
                    bp50Var.a();
                }
                return s3q0.a;
            default:
                return m33.a(R.drawable.vk_icon_illustration_disclaimer_credits_feed_360w, ((bv50) obj).b.getContext());
        }
    }

    public /* synthetic */ odm(yl50 yl50Var, x100 x100Var) {
        this.b = 22;
        this.c = yl50Var;
    }
}
