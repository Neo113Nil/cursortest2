package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.tlo0;

/* compiled from: CommunityProfileContentPhotoAlbumsAdapter.kt */
/* loaded from: classes5.dex */
public final class zjh extends zoj0<PhotoAlbum, c> {
    public final kdg0 e;
    public final vs f;
    public boolean g;

    /* compiled from: CommunityProfileContentPhotoAlbumsAdapter.kt */
    public static final class a implements VkTile.h {
        public final PhotoAlbum a;
        public final boolean b;

        public a(PhotoAlbum photoAlbum, boolean z) {
            this.a = photoAlbum;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumVisualContentParams(album=");
            sb.append(this.a);
            sb.append(", itemsFillParent=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityProfileContentPhotoAlbumsAdapter.kt */
    public static final class b implements VkTile.g {
        public final VkPicture a;
        public final kdg0 b;
        public final VkPicture c;

        public b(VkPicture vkPicture, kdg0 kdg0Var) {
            this.a = vkPicture;
            this.b = kdg0Var;
            this.c = vkPicture;
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            PhotoAlbum photoAlbum;
            a aVar = hVar instanceof a ? (a) hVar : null;
            if (aVar == null || (photoAlbum = aVar.a) == null) {
                return;
            }
            VkPicture vkPicture = this.a;
            Context context = vkPicture.getContext();
            iso0 s = com.vk.toggle.d.s();
            String str = photoAlbum.v;
            CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
            coreFeatures.getClass();
            String b = s.b(str, com.vk.toggle.b.A.a(coreFeatures) && com.vk.toggle.d.s().d);
            if (b != null) {
                vkPicture.setThumbHash(b);
            }
            PhotoRestriction photoRestriction = photoAlbum.s;
            if (photoRestriction == null) {
                this.b.f(vkPicture);
                if (photoAlbum.f == 0) {
                    Drawable a = m33.a(R.drawable.album_empty_photo_placeholder, context);
                    vkPicture.setImageDrawable(a != null ? sjo.e(a, context, Collections.singletonList(Integer.valueOf(R.id.album_empty_icon)), R.attr.vk_ui_icon_secondary) : null);
                } else {
                    bwt0.S(vkPicture, new bp7(8, this, photoAlbum));
                }
            } else {
                this.b.d(vkPicture, photoRestriction, false, true, new akh(this, photoAlbum));
            }
            VkPicture vkPicture2 = this.c;
            ViewGroup.LayoutParams layoutParams = vkPicture2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = ((a) hVar).b ? 0 : cn70.b(128);
            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
            bVar.G = "1.32f";
            vkPicture2.setLayoutParams(bVar);
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.c;
        }
    }

    /* compiled from: CommunityProfileContentPhotoAlbumsAdapter.kt */
    public final class c extends vif0<PhotoAlbum> {
        public final VkTile n;

        public c(VkTile vkTile) {
            super(vkTile);
            this.n = vkTile;
            VkPicture vkPicture = new VkPicture(vkTile.getContext(), null, 6, 0);
            vkPicture.setId(R.id.community_profile_item_album_iv_cover);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Medium);
            vkPicture.y0(cn70.a() * 0.5f, krv0.m(R.attr.vk_ui_image_border_alpha, vkPicture.getContext()));
            vkPicture.setContentDescription(vkPicture.getContext().getString(R.string.accessibility_album_photo));
            vkTile.setVisualContentController(new b(vkPicture, zjh.this.e));
            vkTile.setTextAlignment(VkTile.TextAlignment.Start);
            jjc.g(this.itemView, new b1a(7, zjh.this, this));
        }

        @Override // xsna.vif0
        public final void i6(PhotoAlbum photoAlbum) {
            PhotoAlbum photoAlbum2 = photoAlbum;
            zjh zjhVar = zjh.this;
            boolean z = zjhVar.g;
            VkTile vkTile = this.n;
            if (z) {
                vkTile.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            } else {
                vkTile.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, photoAlbum2.g), 0, null, null, null, null, null, 510));
            int i = photoAlbum2.f;
            vkTile.setSubtitle(new VkTile.d(new tlo0.h(i == 0 ? this.itemView.getContext().getString(R.string.profile_content_photos_zero_count) : enj.f(R.plurals.profile_content_photos_in_album_count, i, this.itemView.getContext())), 0, null, null, null, null, 62));
            vkTile.setVisualContentParams(new a(photoAlbum2, zjhVar.g));
        }
    }

    public zjh(kdg0 kdg0Var, vs vsVar) {
        this.e = kdg0Var;
        this.f = vsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((c) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(new VkTile(viewGroup.getContext(), null, 6));
    }
}
