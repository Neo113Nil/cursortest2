package xsna;

import android.content.Context;
import android.view.View;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import xsna.hgh;

/* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
/* loaded from: classes5.dex */
public final class jgh implements VkCell.e {
    public final /* synthetic */ hgh.c a;

    /* compiled from: CommunityProfileContentClipsPlaylistsAdapter.kt */
    public static final class a implements VkCell.d {
        public final VkPicture a;
        public final /* synthetic */ hgh.c b;

        public a(Context context, hgh.c cVar) {
            this.b = cVar;
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setContentDescription(cVar.g6(R.string.community_content_playlist_cover_accessibility));
            this.a = vkPicture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            hgh.c.a aVar = fVar instanceof hgh.c.a ? (hgh.c.a) fVar : null;
            if (aVar != null) {
                String str = aVar.a;
                iso0 s = com.vk.toggle.d.s();
                int i = hgh.c.p;
                String str2 = ((ClipsPlaylist) this.b.m).h;
                CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                coreFeatures.getClass();
                String b = s.b(str2, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
                VkPicture vkPicture = this.a;
                if (b != null) {
                    vkPicture.setThumbHash(b);
                }
                vkPicture.o0(str, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    public jgh(hgh.c cVar) {
        this.a = cVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(context, this.a);
    }
}
