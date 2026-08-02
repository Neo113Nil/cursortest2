package xsna;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;

/* compiled from: AlbumsAdapter.kt */
/* loaded from: classes3.dex */
public final class dm1 extends zoj0<PhotoAlbum, a> implements nd90<PhotoAlbum> {
    public final el1 e;
    public final izs<View, s3q0> f;
    public final izs<PhotoAlbum, s3q0> g;

    /* compiled from: AlbumsAdapter.kt */
    public final class a extends vif0<PhotoAlbum> {
        public final VKImageView n;
        public final TextView o;
        public final TextView p;
        public final ImageView q;
        public final hny r;
        public final hny s;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.album_pager_item, 0);
            this.n = (VKImageView) this.itemView.findViewById(R.id.cover);
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.q = (ImageView) this.itemView.findViewById(R.id.privacy_icon);
            hny hnyVar = new hny(this.itemView.getContext());
            hnyVar.c(iah0.b(4.0f), R.attr.vk_ui_image_placeholder);
            hnyVar.d(R.drawable.vk_icon_camera_48, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
            this.r = hnyVar;
            hny hnyVar2 = new hny(this.itemView.getContext());
            hnyVar2.c(iah0.b(4.0f), R.attr.vk_ui_image_placeholder);
            this.s = hnyVar2;
            izs<View, s3q0> izsVar = dm1.this.f;
            if (izsVar != null) {
                izsVar.invoke(this.itemView);
            }
        }

        @Override // xsna.vif0
        /* renamed from: q6, reason: merged with bridge method [inline-methods] */
        public final void i6(PhotoAlbum photoAlbum) {
            PhotoRestriction photoRestriction = photoAlbum.s;
            VKImageView vKImageView = this.n;
            if (photoRestriction != null) {
                vKImageView.setPlaceholderImage(this.s);
                String str = myc0.f(photoAlbum.l) ? photoAlbum.l : photoAlbum.k;
                nr4.a().getClass();
                odg0.a.k(vKImageView, photoAlbum.s, false, false, new jhg(str, 2));
            } else {
                vKImageView.setPlaceholderImage(this.r);
                nr4.a().getClass();
                odg0.a.getClass();
                odg0.l(vKImageView);
                sr10 sr10Var = dy2.a;
                if (!(sr10Var != null ? sr10Var.c() : true) && myc0.f(photoAlbum.l)) {
                    vKImageView.load(photoAlbum.l);
                } else if (photoAlbum.m > 0) {
                    vKImageView.load(photoAlbum.k);
                } else {
                    vKImageView.clear();
                }
            }
            dm1 dm1Var = dm1.this;
            this.q.setVisibility(dm1Var.e.a(photoAlbum) ? 0 : 8);
            this.o.setText(photoAlbum.g);
            TextView textView = this.p;
            Resources resources = textView.getContext().getResources();
            int i = photoAlbum.f;
            textView.setText(resources.getQuantityString(R.plurals.album_numphotos, i, Integer.valueOf(i)));
            this.itemView.setOnClickListener(new cm1(0, dm1Var, photoAlbum));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dm1(el1 el1Var, izs<? super View, s3q0> izsVar, izs<? super PhotoAlbum, s3q0> izsVar2) {
        this.e = el1Var;
        this.f = izsVar;
        this.g = izsVar2;
    }

    public final void K0(PhotoAlbum photoAlbum) {
        uuk uukVar = this.c;
        ListDataSet listDataSet = (ListDataSet) uukVar;
        int size = listDataSet.d.size();
        for (int i = 0; i < size; i++) {
            if (((PhotoAlbum) uukVar.c(i)).b > 0) {
                ((ListDataSet) uukVar).x(i, photoAlbum);
                return;
            }
        }
        listDataSet.x(listDataSet.d.size(), photoAlbum);
    }

    public final void U(int i, String str) {
        H0(new wl1(i, 0), new yl1(str, 0));
    }

    public final void X(PhotoAlbum photoAlbum) {
        H0(new ul1(photoAlbum, 0), new qu(photoAlbum, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).i6((PhotoAlbum) this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = new a(viewGroup);
        aVar.itemView.setOnClickListener(new o44(0));
        return aVar;
    }
}
