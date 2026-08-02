package xsna;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase_Impl;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.core.tips.TipAnchorView;
import com.vk.core.view.components.button.VkButton;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.SearchGroupsFeatureCatalogFragment;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.cca0;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tu80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tu80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                return ((MarketComponent) ((k7m) m7m.f((OrderFragment) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 1:
                return Integer.valueOf(((mc90) obj).o());
            case 2:
                return ((PhotoEditorView) obj).c.u;
            case 3:
                return new com.vk.attachpicker.stat.data.d((PhotoParamsDatabase_Impl) obj);
            case 4:
                ((jca0) obj).a.getFeature().C(cca0.a.b);
                return s3q0.a;
            case 5:
                return ((MarketPhotoviewerComponent) ((k7m) m7m.f((pha0) obj)).mo408a(fpf0.a(MarketPhotoviewerComponent.class))).G5();
            case 6:
                return Boolean.valueOf(((dpa0) obj).d.b);
            case 7:
                ((m4b0) obj).b();
                return s3q0.a;
            case 8:
                return ((ocb0) obj).c.hd(EmptyList.b).a(null, 0);
            case 9:
                ((NewsFeedComponent) ((k7m) m7m.f((j1c0) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 10:
                PostingFragment postingFragment = (PostingFragment) obj;
                int i2 = PostingFragment.s0;
                h7u0.a aVar = new h7u0.a(postingFragment.requireContext());
                aVar.g0(R.string.confirm);
                aVar.U(R.string.confirm_close_post);
                aVar.c0(R.string.delete, (DialogInterface.OnClickListener) postingFragment.r0.getValue());
                aVar.W(R.string.cancel, null);
                return aVar;
            case 11:
                return Boolean.valueOf(((com.vk.newsfeed.impl.items.posting.item.modals.b) obj).a.b);
            case 12:
                qcy<Object>[] qcyVarArr2 = lqc0.q1;
                return new wcc0(((NewsFeedComponent) m7m.d((lqc0) obj).a(fpf0.a(NewsFeedComponent.class))).oc(), new com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a());
            case 13:
                return ((ReviewsComponent) ((rkd0) obj).h.getValue()).Md();
            case 14:
                e3e0 e3e0Var = (e3e0) obj;
                sqt0 sqt0Var = e3e0Var.a;
                ProgressBar progressBar = new ProgressBar(sqt0Var.getContext());
                progressBar.setId(R.id.progress_pip_view);
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(-1));
                progressBar.setVisibility(8);
                e3e0Var.b.getClass();
                Integer num = -1;
                sqt0Var.addView(progressBar, num.intValue(), new ViewGroup.LayoutParams(-2, -2));
                f4m.m(17, progressBar);
                return progressBar;
            case 15:
                ((joe0) obj).un();
                return s3q0.a;
            case 16:
                int i3 = QuestionsListFragment.f0;
                return ((StoriesComponent) m7m.d((QuestionsListFragment) obj).a(fpf0.a(StoriesComponent.class))).w();
            case 17:
                return Boolean.valueOf(((d0g0) obj).f() != null);
            case 18:
                rzg0 rzg0Var = (rzg0) obj;
                rzg0Var.b.a();
                rzg0Var.a.invalidateItemDecorations();
                return s3q0.a;
            case 19:
                SearchGroupsFeatureCatalogFragment searchGroupsFeatureCatalogFragment = (SearchGroupsFeatureCatalogFragment) obj;
                int i4 = SearchGroupsFeatureCatalogFragment.U;
                return ((SearchUiComponent) ((k7m) m7m.f(searchGroupsFeatureCatalogFragment)).a(fpf0.a(SearchUiComponent.class))).h5(searchGroupsFeatureCatalogFragment.go(), new VkGroupsSearchParams());
            case 20:
                j43 j43Var = (j43) obj;
                Set b = ((hw3) j43Var.a).b();
                ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pll) j43Var.b).h((SupportedTranslateLanguage) it.next()));
                }
                return arrayList;
            case 21:
                return new ov70(((ov70) ((mtk0) obj).getValue()).a);
            case 22:
                return ((NarrativeComponent) m7m.d((e8j0) obj).a(fpf0.a(NarrativeComponent.class))).V7();
            case 23:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.targets_recycler_overlay);
            case 24:
                return (ModerationComponent) ((k7m) m7m.f((cvj0) obj)).mo408a(fpf0.a(ModerationComponent.class));
            case 25:
                int i5 = StoryBottomViewGroup.P;
                return ((StoryReactionsComponent) ((k7m) m7m.c((StoryBottomViewGroup) obj)).mo408a(fpf0.a(StoryReactionsComponent.class))).b();
            case 26:
                ((TabsOrListVh) obj).m.d();
                return s3q0.a;
            case 27:
                ((com.vk.im.ui.components.theme_chooser.c) obj).a.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                return linearLayoutManager;
            case 28:
                int i6 = TimelineBottomActionsView.z;
                return (VkButton) ((TimelineBottomActionsView) obj).findViewById(R.id.timeline_accept);
            default:
                int i7 = TipAnchorView.m;
                ((Handler) obj).removeCallbacksAndMessages(null);
                return s3q0.a;
        }
    }
}
