package xsna;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: AlbumPickerAdapter.kt */
/* loaded from: classes5.dex */
public final class jj1 extends zoj0<PhotoAlbum, a> {
    public final tl9 e;
    public final com.vk.posting.presentation.album.d f;

    /* compiled from: AlbumPickerAdapter.kt */
    public static final class a extends vif0<PhotoAlbum> {
        public static int v = iah0.f().widthPixels / 2;
        public final tl9 n;
        public final kj1 o;
        public final VKImageView p;
        public final TextView q;
        public final TextView r;
        public final View s;
        public final hny t;
        public final hny u;

        public a(tl9 tl9Var, com.vk.posting.presentation.album.d dVar, ViewGroup viewGroup) {
            super(viewGroup, R.layout.holder_album_picker, 0);
            this.n = tl9Var;
            this.o = dVar;
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.album_image);
            this.p = vKImageView;
            this.q = (TextView) this.itemView.findViewById(R.id.album_name);
            this.r = (TextView) this.itemView.findViewById(R.id.album_count_photo);
            this.s = this.itemView.findViewById(R.id.album_lock);
            bwt0.i0(this.itemView, new t40(this, 2));
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!vKImageView.isLaidOut()) {
                vKImageView.addOnLayoutChangeListener(new ij1(this));
            } else if (vKImageView.getWidth() > 0) {
                v = vKImageView.getWidth();
            }
            hny hnyVar = new hny(this.itemView.getContext());
            hnyVar.c(iah0.b(8.0f), R.attr.vk_ui_image_placeholder);
            hnyVar.d(R.drawable.vk_icon_camera_48, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
            this.t = hnyVar;
            hny hnyVar2 = new hny(this.itemView.getContext());
            hnyVar2.c(iah0.b(8.0f), R.attr.vk_ui_image_placeholder);
            this.u = hnyVar2;
        }

        @Override // xsna.vif0
        public final void i6(PhotoAlbum photoAlbum) {
            PhotoAlbum photoAlbum2 = photoAlbum;
            PhotoRestriction photoRestriction = photoAlbum2.s;
            Object obj = null;
            tl9 tl9Var = this.n;
            VKImageView vKImageView = this.p;
            if (photoRestriction != null) {
                vKImageView.setPlaceholderImage(this.u);
                String str = myc0.f(photoAlbum2.l) ? photoAlbum2.l : photoAlbum2.k;
                tl9Var.getClass();
                odg0.a.k(vKImageView, photoAlbum2.s, false, false, new jhg(str, 2));
            } else {
                vKImageView.setPlaceholderImage(this.t);
                tl9Var.getClass();
                odg0.a.getClass();
                odg0.l(vKImageView);
                ImageSize Cb = photoAlbum2.u.Cb(v, false, false);
                vKImageView.load(Cb != null ? Cb.d.d : null);
            }
            List<PrivacySetting.PrivacyRule> list = photoAlbum2.i;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((PrivacySetting.PrivacyRule) next).zb().get(0).equals("only_me")) {
                        obj = next;
                        break;
                    }
                }
                obj = (PrivacySetting.PrivacyRule) obj;
            }
            bwt0.p0(this.s, obj != null);
            this.q.setText(photoAlbum2.g);
            TextView textView = this.r;
            Resources resources = textView.getContext().getResources();
            int i = photoAlbum2.f;
            textView.setText(resources.getQuantityString(R.plurals.album_count_photos, i, Integer.valueOf(i)));
        }
    }

    public jj1(tl9 tl9Var, com.vk.posting.presentation.album.d dVar) {
        this.e = tl9Var;
        this.f = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.e, this.f, viewGroup);
    }
}
