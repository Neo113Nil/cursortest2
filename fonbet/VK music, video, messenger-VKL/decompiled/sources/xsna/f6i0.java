package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectAlbumAdapter.kt */
/* loaded from: classes4.dex */
public final class f6i0 extends androidx.recyclerview.widget.x<j6i0, RecyclerView.e0> implements vic {
    public final kdg0 c;
    public final el1 d;
    public final dn20 e;

    public f6i0(kdg0 kdg0Var, el1 el1Var, dn20 dn20Var) {
        super(g6i0.a);
        this.c = kdg0Var;
        this.d = el1Var;
        this.e = dn20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        j6i0 item = getItem(i);
        if (item instanceof PhotoAlbumWrapper.CommonPhotoAlbum) {
            return R.layout.selectable_album_item;
        }
        if (item instanceof PhotoAlbumWrapper.SpecialPhotoAlbum) {
            return R.layout.selectable_special_album_item;
        }
        if (epx.f(item, vvu.b)) {
            return R.layout.select_album_header_item;
        }
        if (epx.f(item, g270.b)) {
            return R.layout.albums_empty_view_owner;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == R.layout.select_album_header_item || itemViewType == R.layout.albums_empty_view_owner) {
            return;
        }
        if (itemViewType == R.layout.selectable_album_item) {
            ((p6i0) e0Var).V5((PhotoAlbumWrapper.CommonPhotoAlbum) getItem(i));
        } else {
            if (itemViewType != R.layout.selectable_special_album_item) {
                throw new IllegalStateException("Unsupported view type");
            }
            ((z9i0) e0Var).V5((PhotoAlbumWrapper.SpecialPhotoAlbum) getItem(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i, viewGroup, false);
        if (i == R.layout.select_album_header_item) {
            return new a(b);
        }
        if (i == R.layout.albums_empty_view_owner) {
            zhp zhpVar = new zhp(b);
            b.getLayoutParams().height = -2;
            ((TextView) b.findViewById(R.id.text)).setText(R.string.no_albums_in_albums_select_dialog);
            bwt0.p0(b.findViewById(R.id.image), false);
            return zhpVar;
        }
        dn20 dn20Var = this.e;
        if (i == R.layout.selectable_album_item) {
            return new p6i0(b, this.c, this.d, dn20Var);
        }
        if (i == R.layout.selectable_special_album_item) {
            return new z9i0(b, dn20Var);
        }
        throw new IllegalStateException("Unsupported view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (list.size() > 0) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == R.layout.select_album_header_item || itemViewType == R.layout.albums_empty_view_owner) {
                return;
            }
            if (itemViewType == R.layout.selectable_album_item) {
                ((p6i0) e0Var).W5((PhotoAlbumWrapper.CommonPhotoAlbum) getItem(i), j5g.Y(list));
                return;
            } else {
                if (itemViewType == R.layout.selectable_special_album_item) {
                    ((z9i0) e0Var).W5((PhotoAlbumWrapper.SpecialPhotoAlbum) getItem(i), j5g.Y(list));
                    return;
                }
                throw new IllegalStateException("Unsupported view type");
            }
        }
        onBindViewHolder(e0Var, i);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }

    /* compiled from: SelectAlbumAdapter.kt */
    public static final class a extends vif0<Object> {
        @Override // xsna.vif0
        public final void i6(Object obj) {
        }
    }
}
