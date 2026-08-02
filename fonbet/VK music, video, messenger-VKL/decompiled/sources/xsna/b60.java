package xsna;

import com.vk.channels.impl.list.g;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.music.playlist.display.domain.b;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import xsna.qvs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((a60) obj2).invoke(obj);
                break;
            case 1:
                ((a60) obj2).invoke(obj);
                break;
            case 2:
                ((gr3) obj2).invoke(obj);
                break;
            case 3:
                ((a60) obj2).invoke(obj);
                break;
            case 4:
                ((ai6) obj2).invoke(obj);
                break;
            case 5:
                wj6 wj6Var = (wj6) obj2;
                BasePhotoListFragment basePhotoListFragment = wj6Var.c;
                if (!(obj instanceof s4a0)) {
                    if (!(obj instanceof zaa0)) {
                        if (obj instanceof cl1) {
                            cl1 cl1Var = (cl1) obj;
                            PhotoAlbum photoAlbum = wj6Var.h;
                            if (photoAlbum != null) {
                                PhotoAlbum photoAlbum2 = cl1Var.a;
                                if (photoAlbum.b == photoAlbum2.b) {
                                    wj6Var.h = photoAlbum2;
                                    basePhotoListFragment.I0();
                                    break;
                                }
                            }
                        }
                    } else {
                        zaa0 zaa0Var = (zaa0) obj;
                        PhotoAlbum photoAlbum3 = wj6Var.h;
                        if (photoAlbum3 != null) {
                            int i2 = zaa0Var.a;
                            UserId userId = zaa0Var.c;
                            int i3 = photoAlbum3.b;
                            if (i2 == i3 || (i3 == -9002 && epx.f(photoAlbum3.c, userId) && i2 != -15)) {
                                int i4 = zaa0Var.b;
                                photoAlbum3.f--;
                                basePhotoListFragment.r0(i4);
                                wj6Var.i.removeIf(new qj6(new pj6(i4), 0));
                                break;
                            }
                        }
                    }
                } else {
                    s4a0 s4a0Var = (s4a0) obj;
                    PhotoAlbum photoAlbum4 = wj6Var.h;
                    if (photoAlbum4 != null && s4a0Var.a == photoAlbum4.b) {
                        Photo photo = s4a0Var.b;
                        photoAlbum4.f++;
                        basePhotoListFragment.g1(photo);
                        break;
                    }
                }
                break;
            case 6:
                ((gr3) obj2).invoke(obj);
                break;
            case 7:
                ((gr3) obj2).invoke(obj);
                break;
            case 8:
                ((t9) obj2).invoke(obj);
                break;
            case 9:
                ((j20) obj2).invoke(obj);
                break;
            case 10:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new com.vk.movika.sdk.base.model.props.a(3));
                bVar.n(new g.b(th));
                break;
            case 11:
                ((gr3) obj2).invoke(obj);
                break;
            case 12:
                ((a60) obj2).invoke(obj);
                break;
            case 13:
                ((a60) obj2).invoke(obj);
                break;
            case 14:
                int i5 = c2h.p1;
                ((gr3) obj2).invoke(obj);
                break;
            case 15:
                ((a60) obj2).invoke(obj);
                break;
            case 16:
                ((gr3) obj2).invoke(obj);
                break;
            case 17:
                ((xxh) obj2).invoke(obj);
                break;
            case 18:
                ((j20) obj2).invoke(obj);
                break;
            case 19:
                ((n3i) obj2).invoke(obj);
                break;
            case 20:
                ((i4e) obj2).invoke(obj);
                break;
            case 21:
                ((wam) obj2).invoke(obj);
                break;
            case 22:
                ((n3i) obj2).invoke(obj);
                break;
            case 23:
                ((n3i) obj2).invoke(obj);
                break;
            case 24:
                ((b.a) obj2).invoke(obj);
                break;
            case 25:
                ((n3i) obj2).invoke(obj);
                break;
            case 26:
                ((qvs.a) obj2).invoke(obj);
                break;
            case 27:
                ((n3i) obj2).invoke(obj);
                break;
            case 28:
                ((z4v) obj2).invoke(obj);
                break;
            default:
                ((n3i) obj2).invoke(obj);
                break;
        }
    }
}
