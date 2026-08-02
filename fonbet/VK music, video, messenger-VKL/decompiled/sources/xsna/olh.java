package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.nlh;

/* compiled from: CommunityProfileContentVideoAlbumsAdapter.kt */
/* loaded from: classes5.dex */
public final class olh implements VkTile.g {
    public final View a;
    public final VkImage b;
    public final VideoOverlayView c;
    public final /* synthetic */ nlh.b d;

    public olh(nlh.b bVar) {
        this.d = bVar;
        View inflate = LayoutInflater.from(bVar.itemView.getContext()).inflate(R.layout.community_item_content_video_album_item_visual_content, (ViewGroup) null, false);
        this.a = inflate;
        this.b = (VkImage) inflate.findViewById(R.id.community_profile_video_album_item_iv_preview);
        this.c = (VideoOverlayView) inflate.findViewById(R.id.community_profile_video_album_item_vo_overlay);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        nlh.b bVar = this.d;
        View view = bVar.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        View view2 = this.a;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        Pair<Integer, Integer> pair = nlh.b.s;
        ((ViewGroup.MarginLayoutParams) bVar2).width = iah0.a(pair.i().intValue());
        ((ViewGroup.MarginLayoutParams) bVar2).height = iah0.a(pair.j().intValue());
        bVar2.G = "";
        view2.setLayoutParams(bVar2);
        jwx jwxVar = null;
        if ((hVar instanceof nlh.b.a ? (nlh.b.a) hVar : null) != null) {
            nlh.b.a aVar = (nlh.b.a) hVar;
            VideoRestriction videoRestriction = aVar.a;
            boolean z = false;
            VideoOverlayView videoOverlayView = this.c;
            VkImage vkImage = this.b;
            if (videoRestriction != null) {
                videoOverlayView.setVisibility(0);
                vkImage.setVisibility(4);
                videoOverlayView.Z4((i1t0) bVar.p.getValue(), new VideoOverlayView.c.j(((a390) bVar.q.getValue()).a(((VideoAlbum) bVar.m).o), ((s290) bVar.r.getValue()).a(((VideoAlbum) bVar.m).h), null, null));
                return;
            }
            vkImage.setVisibility(0);
            f4m.j(videoOverlayView);
            iso0 s = com.vk.toggle.d.s();
            String str = ((VideoAlbum) bVar.m).s;
            CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
            coreFeatures.getClass();
            if (com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d) {
                z = true;
            }
            String b = s.b(str, z);
            if (b != null) {
                vkImage.setThumbHash(b);
            }
            if (aVar.c) {
                bpn0 bpn0Var = VideoOverlayView.I;
                jwxVar = VideoOverlayView.b.c();
            }
            kci.o(vkImage, jwxVar);
            bwt0.S(vkImage, new defpackage.m(10, this, aVar));
        }
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.a;
    }
}
