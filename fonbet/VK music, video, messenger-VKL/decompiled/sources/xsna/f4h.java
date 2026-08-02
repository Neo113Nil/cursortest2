package xsna;

import android.content.DialogInterface;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.album.PhotoAlbumFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f4h implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f4h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                gzs gzsVar2 = (gzs) this.c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            default:
                f5a0 f5a0Var = ((PhotoAlbumFragment) this.c).p0;
                PhotoAlbum photoAlbum = f5a0Var.g;
                if (photoAlbum != null) {
                    hg1.m(rsg0.y0(new sea0(photoAlbum.b, fkq0.b(f5a0Var.f) ? fkq0.e(f5a0Var.f) : UserId.d), null, null, 3), f5a0Var.c.getActivity(), 0L, false, 62).subscribe(new m20(new j20(3, photoAlbum, f5a0Var), 5), new n20(new gy(j03.a, 1), 6));
                    break;
                }
                break;
        }
    }
}
