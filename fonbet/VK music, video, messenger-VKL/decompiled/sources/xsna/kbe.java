package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllHighlightVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsVh;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.documents.impl.di.DocumentsComponentImpl;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.lists.c;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import xsna.aue;
import xsna.dai;
import xsna.egm;
import xsna.nbp;
import xsna.rjh;
import xsna.u4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kbe implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kbe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gzs gzsVar;
        int i;
        l7m a;
        SakAnalyticsComponent sakAnalyticsComponent;
        nbp y5;
        String a2;
        ExposedFunction invoke$lambda$1;
        switch (this.b) {
            case 0:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) this.c;
                return new sae(bVar, new mbe(1, bVar.getFeature(), com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
            case 1:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return (ClipsEntryPointsComponent) m7m.d(clipsGridFragment).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
            case 2:
                return Boolean.valueOf(((zde) this.c).l.invoke().intValue() > 1);
            case 3:
                return new bue(((aue.c) this.c).b);
            case 4:
                return ((CommunityNotificationSettingsFragment) this.c).X.y0();
            case 5:
                ((rjh.a) this.c).n.invoke();
                return s3q0.a;
            case 6:
                return ((ClassifiedsComponent) ((h7m) this.c).a(fpf0.a(ClassifiedsComponent.class))).dc();
            case 7:
                com.vk.profile.community.impl.ui.profile.c cVar = (com.vk.profile.community.impl.ui.profile.c) this.c;
                CommunityProfileFragment communityProfileFragment = cVar.a;
                ynh ynhVar = cVar.d;
                return new iph(communityProfileFragment, (kbj0) ynhVar.A0.getValue(), ynhVar.f(), cVar);
            case 8:
                ((com.vk.profile.community.impl.ui.profile.f) this.c).d.a(new CommunityProfileAction.g.b(false));
                return s3q0.a;
            case 9:
                o1i o1iVar = (o1i) this.c;
                ((w1h) o1iVar.D.getValue()).f(o1iVar.q, fkq0.a(o1iVar.c.a.c));
                return s3q0.a;
            case 10:
                wh50 wh50Var = ((dai.c) this.c).b;
                if (wh50Var != null && (gzsVar = (gzs) wh50Var.getValue()) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 11:
                ComposeHeaderIconShowAllBadgeVh composeHeaderIconShowAllBadgeVh = (ComposeHeaderIconShowAllBadgeVh) this.c;
                int i2 = ComposeHeaderIconShowAllBadgeVh.A;
                if (!jjc.d().a()) {
                    int i3 = ComposeHeaderIconShowAllBadgeVh.A;
                    composeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 12:
                return (TextView) ((l2j) this.c).itemView.findViewById(R.id.voip_participants_section_count);
            case 13:
                ((baj) this.c).invoke();
                return s3q0.a;
            case 14:
                egm egmVar = (egm) this.c;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                boolean z = egmVar.c;
                omw.d(vkImageSimple, z ? R.drawable.vk_icon_clock_outline_16 : R.drawable.vk_icon_deprecated_vkim_ic_msg_sending, z ? R.attr.vk_ui_icon_tertiary : R.attr.vk_ui_icon_medium);
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar2 = egmVar.m;
                int i4 = (bVar2 != null ? bVar2 : null).i;
                if (z) {
                    i = (bVar2 != null ? bVar2 : null).i;
                } else {
                    i = -2;
                }
                vkImageSimple.setLayoutParams(egm.W(egmVar, i4, i, z ? 0 : cn70.b(8), 0, z ? cn70.b(6) : 0, 0, 40));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 15:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) this.c;
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return new AtomicReference(discoverMediaTabFragment2.eo().a);
            case 16:
                return ((DocumentsComponentImpl) this.c).a.invoke();
            case 17:
                return ((w3p) this.c).u;
            case 18:
                FragmentActivity fragmentActivity = ((ubp) this.c).a;
                return (fragmentActivity == null || (a = m7m.a(fragmentActivity)) == null || (sakAnalyticsComponent = (SakAnalyticsComponent) a.a(fpf0.a(SakAnalyticsComponent.class))) == null || (y5 = sakAnalyticsComponent.y5()) == null) ? nbp.a.a.getSTUB() : y5;
            case 19:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((EntriesListPresenter) this.c)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 20:
                q7r q7rVar = (q7r) this.c;
                jz50 jz50Var = q7rVar.r0;
                StoryEntry currentStory = q7rVar.i0.getCurrentStory();
                if (currentStory == null || (a2 = currentStory.T) == null) {
                    a2 = i5s.a(new StringBuilder("https://"), a0a.d, "/app54168556");
                }
                jz50Var.b(true, null, a2);
                return s3q0.a;
            case 21:
                return zr.a("appendOneLogEvent: append event ", ((yi80) this.c).a, " failed");
            case 22:
                i4p i4pVar = ((EditorState) ((v3p) this.c).d().b.b.getValue()).a;
                if (i4pVar != null) {
                    return i4pVar.b;
                }
                return null;
            case 23:
                return new hv1((com.vk.folders.impl.configure.h) this.c, 7);
            case 24:
                return ((FrescoImageView) this.c).r;
            case 25:
                com.vk.attachpicker.b bVar3 = ((GalleryFragmentImpl) this.c).Q;
                return Integer.valueOf(bVar3 != null ? bVar3.k() : 0);
            case 26:
                GlobalSearchFeatureCatalogRootVh globalSearchFeatureCatalogRootVh = (GlobalSearchFeatureCatalogRootVh) this.c;
                SearchRequestFactory i0 = globalSearchFeatureCatalogRootVh.i0();
                sok0 j0 = globalSearchFeatureCatalogRootVh.j0();
                u4a u4aVar = globalSearchFeatureCatalogRootVh.m;
                u4a.a aVar = u4aVar.b;
                CatalogConfiguration catalogConfiguration = aVar.s;
                kea keaVar = new kea(i0, catalogConfiguration.K(u4aVar), u4aVar, new vd7(aVar.e), false, null, null, false, null, null, u4aVar.b.H, new oz4(globalSearchFeatureCatalogRootVh.p, 2), null, false, null, 118720);
                pr prVar = new pr(17);
                c.h hVar = new c.h((c.m) keaVar);
                hVar.o = prVar;
                VerticalStackedListVh verticalStackedListVh = new VerticalStackedListVh(catalogConfiguration, hVar, keaVar, globalSearchFeatureCatalogRootVh.m, globalSearchFeatureCatalogRootVh.N(), R.layout.catalog_search_all_discover_search_result_list_vertical, new VerticalListVh.a(new z3v(false), null, null, 52), j0, 352);
                return new Pair(new SearchFeatureResultsVh(verticalStackedListVh, catalogConfiguration), new cmg(keaVar, i0, verticalStackedListVh));
            case 27:
                invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$1;
            case 28:
                HeaderShowAllHighlightVh headerShowAllHighlightVh = (HeaderShowAllHighlightVh) this.c;
                SchemeStat$EventItem schemeStat$EventItem = HeaderShowAllHighlightVh.D;
                TextView textView = headerShowAllHighlightVh.g;
                (textView != null ? textView : null).setTextColor(dhr0.t.c(R.attr.vk_ui_text_contrast));
                return s3q0.a;
            default:
                return go9.b("#doStopBgSync. Cause: ", (String) this.c);
        }
    }
}
