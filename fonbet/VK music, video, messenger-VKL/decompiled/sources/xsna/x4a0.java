package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;

/* compiled from: PhotoAlbumHeaderItem.kt */
/* loaded from: classes3.dex */
public final class x4a0 extends we6 {
    public final uq50 g;
    public final int h = -1;

    /* compiled from: PhotoAlbumHeaderItem.kt */
    public final class a extends vif0<x4a0> {
        public final TextView n;
        public final TextView o;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.photo_album_header_item, 0);
            this.n = (TextView) this.itemView.findViewById(R.id.title);
            this.o = (TextView) this.itemView.findViewById(R.id.description);
        }

        @Override // xsna.vif0
        public final void i6(x4a0 x4a0Var) {
            PhotoAlbum photoAlbum = (PhotoAlbum) x4a0.this.g.invoke();
            TextView textView = this.n;
            TextView textView2 = this.o;
            if (photoAlbum == null) {
                textView.setText((CharSequence) null);
                textView2.setVisibility(8);
                return;
            }
            textView.setText(photoAlbum.g);
            if (TextUtils.isEmpty(photoAlbum.h)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(xwk.d().a().m(photoAlbum.h));
            }
        }
    }

    public x4a0(uq50 uq50Var) {
        this.g = uq50Var;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.h;
    }
}
