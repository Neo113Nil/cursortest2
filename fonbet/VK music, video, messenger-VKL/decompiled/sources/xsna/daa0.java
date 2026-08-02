package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.f5h0;

/* compiled from: PhotoListAdapter.kt */
/* loaded from: classes3.dex */
public final class daa0 extends zoj0<Photo, a> implements nd90<Photo>, zzc0, w8i {
    public final izs<Photo, s3q0> e;
    public final izs<List<? extends Photo>, s3q0> f;
    public final int g;
    public final PhotoAlbum h;
    public final Object i;
    public int j;

    /* compiled from: PhotoListAdapter.kt */
    public final class a extends vif0<Photo> implements UsableRecyclerView.e {
        public static final /* synthetic */ int q = 0;
        public final gk n;
        public final StringBuilder o;

        /* compiled from: PhotoListAdapter.kt */
        /* renamed from: xsna.daa0$a$a, reason: collision with other inner class name */
        public static final class C2715a extends VKImageView {
            public final /* synthetic */ daa0 m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2715a(daa0 daa0Var, Context context) {
                super(context, null, 6, 0);
                this.m = daa0Var;
            }

            @Override // xsna.zjt, android.widget.ImageView, android.view.View
            public final void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                daa0 daa0Var = this.m;
                daa0Var.j = size;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(daa0Var.j, 1073741824));
            }
        }

        public a(ViewGroup viewGroup) {
            super(new C2715a(daa0.this, viewGroup.getContext()));
            this.n = new gk(this.itemView.getContext());
            this.o = new StringBuilder();
            View view = this.itemView;
            view.setLayoutParams(new RecyclerView.p(-1, -2));
            VKImageView vKImageView = (VKImageView) view;
            vKImageView.setActualScaleType(f5h0.f.a);
            vKImageView.setPlaceholderImage(new zoo(R.attr.vk_ui_image_placeholder));
            if (vKImageView.getContentDescription() == null) {
                vKImageView.setContentDescription(vKImageView.getContext().getString(R.string.accessibility_photo));
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vif0
        public final void i6(Photo photo) {
            Photo photo2 = photo;
            daa0 daa0Var = daa0.this;
            ((kdg0) daa0Var.i.getValue()).i((VKImageView) this.itemView, photo2, false, new eaa0(3, this, a.class, "getUrlToLoad", "getUrlToLoad(Lcom/vk/dto/photo/Photo;II)Ljava/lang/String;", 0));
            this.itemView.setTag(photo2);
            View view = this.itemView;
            PhotoAlbum photoAlbum = daa0Var.h;
            view.setContentDescription(PickVKPhotoFragment.no(view.getContext(), photo2, (photoAlbum != null ? photoAlbum.r : null) != null ? photoAlbum.g : null, this.o, this.n));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            if (jjc.b()) {
                return;
            }
            daa0.this.e.invoke(this.m);
        }
    }

    public daa0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public daa0(izs izsVar, izs izsVar2, PhotoAlbum photoAlbum, int i) {
        super(r1);
        int i2 = (i & 4) != 0 ? 1 : 2;
        com.vk.lists.a aVar = new com.vk.lists.a(new y5a0());
        photoAlbum = (i & 16) != 0 ? null : photoAlbum;
        this.e = izsVar;
        this.f = izsVar2;
        this.g = i2;
        this.h = photoAlbum;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new lo10(this, 15));
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        if (this.j == 0) {
            return null;
        }
        Photo photo = (Photo) this.c.c(i);
        int i3 = this.j;
        return photo.Ab(i3, i3).d.d;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.g;
    }

    @Override // xsna.zoj0, xsna.nd90
    public final void h0(List<Photo> list) {
        if (list == null) {
            return;
        }
        n0(list);
        this.f.invoke(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
