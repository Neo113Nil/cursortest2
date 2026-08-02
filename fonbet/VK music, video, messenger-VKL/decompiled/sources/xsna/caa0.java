package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: PhotoLikeViewHolder.kt */
/* loaded from: classes4.dex */
public final class caa0 extends vif0<Photo> {
    public static final int r = iah0.a(112);
    public final mfa0 n;
    public final VKImageView o;
    public ImageViewer.c<?> p;
    public final bpn0 q;

    public caa0(ViewGroup viewGroup, mfa0 mfa0Var) {
        super(viewGroup, R.layout.photos_like_block_view_holder, 0);
        this.n = mfa0Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photos_like_image_view);
        this.o = vKImageView;
        this.q = new bpn0(new l1i(this, 23));
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        bwt0.i0(vKImageView, new m360(this, 6));
    }

    @Override // xsna.vif0
    public final void i6(Photo photo) {
        Photo photo2 = photo;
        int i = r;
        ImageSize Db = photo2.Db(i, false);
        int g = swe0.g(an10.b(Db.E0() * i), 0, iah0.f().widthPixels);
        VKImageView vKImageView = this.o;
        bwt0.r0(g, vKImageView);
        if (photo2.Ib()) {
            odg0 odg0Var = odg0.a;
            odg0Var.getClass();
            odg0Var.k(vKImageView, photo2.L, true, false, new gd70(photo2.y, 22));
        } else {
            odg0.a.getClass();
            odg0.l(vKImageView);
            vKImageView.load(Db.d.d);
        }
    }

    /* compiled from: PhotoLikeViewHolder.kt */
    public final class a implements ImageViewer.a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            ViewGroup viewGroup = caa0.this.l;
            RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = recyclerView.getChildAt(i2);
                    RecyclerView.e0 childViewHolder = recyclerView.getChildViewHolder(childAt);
                    if (childViewHolder instanceof caa0) {
                        caa0 caa0Var = (caa0) childViewHolder;
                        Photo photo = (Photo) caa0Var.m;
                        if (((ListDataSet) caa0Var.n.c).v(photo) == i) {
                            if (!photo.Ib()) {
                                return childAt;
                            }
                        }
                    }
                    i2++;
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            ViewGroup viewGroup = caa0.this.l;
            if (viewGroup != null) {
                return bwt0.F(viewGroup);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            caa0.this.p = null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
