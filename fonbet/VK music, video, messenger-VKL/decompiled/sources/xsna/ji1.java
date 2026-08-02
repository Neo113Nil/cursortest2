package xsna;

import android.view.View;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.core.content.albums.AlbumView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.kn1;

/* compiled from: AlbumHolder.kt */
/* loaded from: classes4.dex */
public class ji1 extends nn1 {
    public final ze1 n;
    public final kdg0 o;
    public final AlbumView p;

    /* compiled from: AlbumHolder.kt */
    public static final class a implements AlbumView.a {
        public a() {
        }

        @Override // com.vk.profile.core.content.albums.AlbumView.a
        public final void a(VKImageView vKImageView) {
            ji1.this.o.f(vKImageView);
        }

        @Override // com.vk.profile.core.content.albums.AlbumView.a
        public final void b(VKImageView vKImageView, PhotoRestriction photoRestriction, il1 il1Var) {
            ji1.this.o.d(vKImageView, photoRestriction, false, false, il1Var);
        }
    }

    public ji1(View view, ze1 ze1Var, kdg0 kdg0Var, el1 el1Var, float f) {
        super(view);
        this.n = ze1Var;
        this.o = kdg0Var;
        a aVar = new a();
        AlbumView albumView = (AlbumView) view.findViewById(R.id.album_view);
        this.p = albumView;
        albumView.setCornerRadius(f);
        albumView.setRestrictionsCallback(aVar);
        albumView.setAlbumUtils(el1Var);
        bwt0.i0(view, new iz0(this, 1));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ii1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                ji1 ji1Var = ji1.this;
                if (ji1Var.getAbsoluteAdapterPosition() == -1) {
                    return true;
                }
                ji1Var.n.b(((kn1.a) ji1Var.m).a, ji1Var.getAbsoluteAdapterPosition());
                return true;
            }
        });
    }

    @Override // xsna.vif0
    public final void i6(kn1 kn1Var) {
        this.p.setAlbum(((kn1.a) kn1Var).a);
    }

    @Override // xsna.vif0
    public final void j6(kn1 kn1Var, Object obj) {
        kn1.a aVar = (kn1.a) kn1Var;
        PhotoAlbum photoAlbum = aVar.a;
        List list = obj instanceof List ? (List) obj : null;
        Object b0 = list != null ? j5g.b0(0, list) : null;
        List list2 = b0 instanceof List ? (List) b0 : null;
        AlbumView albumView = this.p;
        if (list2 == null) {
            albumView.setAlbum(aVar.a);
            return;
        }
        if (list2.contains(w65.f)) {
            albumView.setTitle(photoAlbum);
        }
        if (list2.contains(kq01.g)) {
            albumView.setPhotosCount(photoAlbum);
        }
        if (list2.contains(p490.e)) {
            albumView.setImage(photoAlbum);
        }
        if (list2.contains(up2.e)) {
            albumView.setPrivacy(photoAlbum);
        }
    }
}
