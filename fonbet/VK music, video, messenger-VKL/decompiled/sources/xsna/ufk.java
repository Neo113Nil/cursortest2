package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicKidsCollectionVh;
import com.vk.catalog2.feature.music.ui.holder.MusicSingleCatalogRootVh;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vkontakte.android.R;
import java.util.List;
import xsna.k840;
import xsna.p1s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ufk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ufk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        x64 x64Var;
        String string;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CropEditorFragment.W;
                return ((PhotoEditorComponent) m7m.d((CropEditorFragment) obj).a(fpf0.a(PhotoEditorComponent.class))).k4();
            case 1:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_muted_icon);
                omw.d(vkImageSimple, R.drawable.vk_icon_muted_16, R.attr.vk_ui_icon_tertiary);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(16), cn70.b(4), (int) (cn70.a() * 1.8f), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 2:
                int i2 = DiscoverSearchFragment.s0;
                return ((SearchParamsComponent) m7m.d((DiscoverSearchFragment) obj).a(fpf0.a(SearchParamsComponent.class))).C4();
            case 3:
                return (ViewGroup) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).c.findViewById(R.id.vk_ecoplate_shimmer_layout);
            case 4:
                return ((AdsSdkComponent) ((k7m) m7m.f((EntriesListPresenter) obj)).mo408a(fpf0.a(AdsSdkComponent.class))).A1();
            case 5:
                return go9.b("Restoring file failed: ", ((Throwable) obj).getMessage());
            case 6:
                ((t1s) obj).O(new p1s.a(true));
                return s3q0.a;
            case 7:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj;
                return new uq60(geoPostsFragment, geoPostsFragment.W, geoPostsFragment.eo().a.Y, geoPostsFragment.eo().f);
            case 8:
                int i3 = ImCreateChatControlParamsFragment.b0;
                ((ImCreateChatControlParamsFragment) obj).requireContext();
                return Boolean.FALSE;
            case 9:
                ykw ykwVar = (ykw) obj;
                Attachment attachment = ykwVar.c;
                if (attachment != null && (x64Var = ykwVar.q) != null) {
                    x64Var.c(attachment);
                }
                return s3q0.a;
            case 10:
                r6y r6yVar = (r6y) obj;
                return new i3y(r6yVar, (i2y) r6yVar.D.getValue());
            case 11:
                t3z t3zVar = (t3z) ((k3z) obj).a;
                if (t3zVar != null) {
                    t3zVar.e();
                }
                return s3q0.a;
            case 12:
                tny tnyVar = (tny) ((zak0) ((nc00) obj).B).getValue();
                return new ov70(tnyVar != null ? tnyVar.D(0L) : 9205357640488583168L);
            case 13:
                return Integer.valueOf(((List) obj).size());
            case 14:
                Context context = ((up30) obj).e;
                return new fk30(context != null ? context : null);
            case 15:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 16:
                return ((BridgeComponent) ((k7m) m7m.f((vf40) obj)).a(fpf0.a(BridgeComponent.class))).F();
            case 17:
                return ((BridgeComponent) ((k7m) m7m.f((MusicKidsCollectionVh) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 18:
                return new laa(k840.a.d(), (df5) k840.a.q.getValue(), k840.a.i, ((uo40) obj).E, k840.a.d(), new r9a(new bpn0(new af0(28)), new ida[0]));
            case 19:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((MusicSingleCatalogRootVh) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 20:
                RecyclerView recyclerView = ((rm60) obj).a;
                elg0 elg0Var = new elg0(recyclerView);
                ren renVar = new ren(recyclerView, elg0Var);
                sen senVar = new sen(recyclerView, renVar, elg0Var);
                FeedRecyclerView feedRecyclerView = (FeedRecyclerView) recyclerView;
                feedRecyclerView.e.b.add(renVar);
                feedRecyclerView.setDisplayItemsRippleEffectTouchListener(senVar);
                return renVar;
            case 21:
                return new g3f0(new y6f0(!new h170().b(), 8388607), new y2f0((d3f0) obj));
            case 22:
                ib80 ib80Var = (ib80) obj;
                ib80Var.g = null;
                ib80Var.q();
                return s3q0.a;
            case 23:
                Object obj2 = ((vl90) obj).o;
                ((tl90) (obj2 != null ? obj2 : null)).d();
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.CHAT_LIST_OPEN_TO_RENDER));
            case 25:
                return (TextView) ((x2a0) obj).itemView.findViewById(R.id.video_single_clip_owner);
            case 26:
                int i4 = PhotoFlowFragment.m0;
                return (PhotosComponent) m7m.d((PhotoFlowFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 27:
                ((e2b0) obj).q();
                return s3q0.a;
            case 28:
                return (NestedScrollView) ((hpb0) obj).g(R.id.poll_create_scroll_view);
            default:
                int i5 = PollPickerFragment.W;
                Bundle arguments = ((PollPickerFragment) obj).getArguments();
                return (arguments == null || (string = arguments.getString("ref", "poll")) == null) ? "poll" : string;
        }
    }
}
