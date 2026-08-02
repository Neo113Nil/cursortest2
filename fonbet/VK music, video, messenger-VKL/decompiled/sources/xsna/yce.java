package xsna;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.folders.root.b;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Source;
import com.vk.imageloader.ImageScreenSize;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.egm;
import xsna.ij20;
import xsna.v1j;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yce implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yce(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$19;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return (ClipsPlaylistsComponent) m7m.d((ClipsGridFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 1:
                return new nke((oke) obj);
            case 2:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj;
                int i2 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.getClass();
                xn50.a.c(clipsPlaylistPickerFragment, a.e.b);
                return s3q0.a;
            case 3:
                com.vk.clips.playlists.folders.root.a aVar = (com.vk.clips.playlists.folders.root.a) obj;
                ez20 ez20Var = aVar.g;
                if (ez20Var != null) {
                    ez20Var.Qc("ClipsPlaylistsFoldersMviBottomSheet");
                }
                aVar.g = null;
                aVar.h = null;
                aVar.b.invoke(b.c.b);
                return s3q0.a;
            case 4:
                int i3 = ClipsWrapperFragment.Q0;
                return ((ClipsWrapperFragment) obj).getParentFragment();
            case 5:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.b.a);
                return s3q0.a;
            case 6:
                return (VideoGrowthComponent) ((h7m) obj).a(fpf0.a(VideoGrowthComponent.class));
            case 7:
                com.vk.profile.community.impl.ui.profile.c cVar = (com.vk.profile.community.impl.ui.profile.c) obj;
                return new mrh(cVar.a, cVar.d);
            case 8:
                return (TextView) ((l2j) obj).itemView.findViewById(R.id.voip_participants_section_title);
            case 9:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) obj;
                com.vk.im.ui.components.contacts.b b1 = aVar2.b1();
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new k5h(b1, 4));
                aVar2.e1(Source.NETWORK, false);
                return s3q0.a;
            case 10:
                return (Conversation.State) ((AtomicReference) obj).get();
            case 11:
                final lak lakVar = (lak) obj;
                VoipActionMultiLineView voipActionMultiLineView = (VoipActionMultiLineView) lakVar.findViewById(R.id.voip_limit_working_time_switch);
                voipActionMultiLineView.setSwitchListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.jak
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        lak.this.r.invoke(new v1j.u(z));
                    }
                });
                return voipActionMultiLineView;
            case 12:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_unread_out_icon);
                boolean z = egmVar.c;
                Pair pair = z ? new Pair(Integer.valueOf(R.drawable.vk_icon_check_outline_16), Integer.valueOf(R.attr.vk_ui_icon_accent_themed)) : new Pair(Integer.valueOf(R.drawable.vk_icon_check_small_outline_20), Integer.valueOf(R.attr.vk_ui_icon_accent));
                omw.d(vkImageSimple, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vkImageSimple.setContentDescription(null);
                egm.b bVar = egmVar.m;
                vkImageSimple.setLayoutParams(egm.W(egmVar, (bVar != null ? bVar : null).i, 0, z ? 0 : cn70.b(8), 0, z ? cn70.b(6) : 0, 0, 42));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 13:
                return new bzb0(((asm) obj).a);
            case 14:
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                return new AtomicReference(((DiscoverMediaTabFragment2) obj).eo().a);
            case 15:
                int i4 = DiscoverSearchFragment.s0;
                f4m.j((View) obj);
                return s3q0.a;
            case 16:
                h5o h5oVar = (h5o) obj;
                DonutPostClickSource donutPostClickSource = DonutPostClickSource.Button;
                j5o j5oVar = (j5o) h5oVar.C;
                if (j5oVar != null) {
                    j1o.a(h5oVar, h5oVar.itemView.getContext(), j5oVar.l, (p4r) h5oVar.F.getValue(), donutPostClickSource);
                }
                return s3q0.a;
            case 17:
                return ((w3p) obj).c;
            case 18:
                ((EntriesListPresenter) obj).Y();
                return s3q0.a;
            case 19:
                return ((v3p) obj).u();
            case 20:
                gpr gprVar = (gpr) obj;
                return new jpr(gprVar.b, gprVar.c);
            case 21:
                return ((FrescoImageView) obj).r;
            case 22:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                GalleryRecyclerView galleryRecyclerView = galleryFragmentImpl.a0;
                if (galleryRecyclerView != null && galleryRecyclerView.getSpanCount() == 1) {
                    return ImageScreenSize.VERY_BIG;
                }
                GalleryRecyclerView galleryRecyclerView2 = galleryFragmentImpl.a0;
                if (galleryRecyclerView2 != null && galleryRecyclerView2.getSpanCount() == 2) {
                    return ImageScreenSize.BIG;
                }
                k9x k9xVar = new k9x(3, 5, 1);
                GalleryRecyclerView galleryRecyclerView3 = galleryFragmentImpl.a0;
                Integer valueOf = galleryRecyclerView3 != null ? Integer.valueOf(galleryRecyclerView3.getSpanCount()) : null;
                if (valueOf != null && k9xVar.e(valueOf.intValue())) {
                    return ImageScreenSize.MID;
                }
                k9x k9xVar2 = new k9x(6, 8, 1);
                GalleryRecyclerView galleryRecyclerView4 = galleryFragmentImpl.a0;
                Integer valueOf2 = galleryRecyclerView4 != null ? Integer.valueOf(galleryRecyclerView4.getSpanCount()) : null;
                return (valueOf2 == null || !k9xVar2.e(valueOf2.intValue())) ? ImageScreenSize.VERY_SMALL : ImageScreenSize.SMALL;
            case 23:
                GlobalSearchFeatureCatalogFragment globalSearchFeatureCatalogFragment = (GlobalSearchFeatureCatalogFragment) obj;
                int i5 = GlobalSearchFeatureCatalogFragment.R;
                return ((SearchUiComponent) ((k7m) m7m.f(globalSearchFeatureCatalogFragment)).a(fpf0.a(SearchUiComponent.class))).W(globalSearchFeatureCatalogFragment.go());
            case 24:
                invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$19;
            case 25:
                pav pavVar = (pav) obj;
                pavVar.getClass();
                ij20.a aVar3 = new ij20.a();
                aVar3.c = "messages.getCallInteractionConfig";
                aVar3.i = false;
                aVar3.g = 0;
                return (cxi) pavVar.a.d(new ij20(aVar3), oav.b);
            case 26:
                return new bzb0(((p7w) obj).e);
            case 27:
                w9w w9wVar = (w9w) obj;
                Context context = e43.a;
                return new ah30(context != null ? context : null, w9wVar.a, o25.a(), (yk70) w9wVar.b.getValue(), BuildInfo.a);
            case 28:
                return new w1y((r6y) obj);
            default:
                ((xgy) obj).h(null);
                return s3q0.a;
        }
    }
}
