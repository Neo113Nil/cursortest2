package xsna;

import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.log.L;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ncl0;
import xsna.oml0;
import xsna.svq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fl30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((srg) obj2).invoke(obj);
                break;
            case 1:
                ((qw30) obj2).invoke(obj);
                break;
            case 2:
                ((com.vk.movika.sdk.base.ui.s0) obj2).invoke(obj);
                break;
            case 3:
                ((com.vk.movika.sdk.base.ui.s0) obj2).invoke(obj);
                break;
            case 4:
                ((nk) obj2).invoke(obj);
                break;
            case 5:
                ((wo40) obj2).invoke(obj);
                break;
            case 6:
                ((jca) obj2).invoke(obj);
                break;
            case 7:
                ((qw30) obj2).invoke(obj);
                break;
            case 8:
                ((qgg) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h) obj2).e(new d.c.b((Throwable) obj));
                break;
            case 10:
                PhotoListFragment photoListFragment = (PhotoListFragment) obj2;
                int i2 = PhotoListFragment.S0;
                ArrayList<T> arrayList = photoListFragment.v0;
                if (!(obj instanceof s4a0)) {
                    if (obj instanceof zaa0) {
                        zaa0 zaa0Var = (zaa0) obj;
                        if (zaa0Var.a == photoListFragment.I0.b) {
                            int i3 = zaa0Var.b;
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Photo photo = (Photo) it.next();
                                    if (photo.c == i3) {
                                        arrayList.remove(photo);
                                        PhotoAlbum photoAlbum = photoListFragment.I0;
                                        photoAlbum.f--;
                                    }
                                }
                            }
                            photoListFragment.Ko();
                            photoListFragment.q();
                            photoListFragment.Mo();
                            break;
                        }
                    }
                } else {
                    s4a0 s4a0Var = (s4a0) obj;
                    if (s4a0Var.a == photoListFragment.I0.b) {
                        arrayList.add(s4a0Var.b);
                        photoListFragment.Ko();
                        photoListFragment.I0.f++;
                        photoListFragment.q();
                        break;
                    }
                }
                break;
            case 11:
                int i4 = PictureInPictureOverlayService.g;
                ((ebx) obj2).invoke(obj);
                break;
            case 12:
                ((ebx) obj2).invoke(obj);
                break;
            case 13:
                ((wo40) obj2).invoke(obj);
                break;
            case 14:
                ((ebx) obj2).invoke(obj);
                break;
            case 15:
                ((ebx) obj2).invoke(obj);
                break;
            case 16:
                ((com.vk.movika.sdk.base.ui.s0) obj2).invoke(obj);
                break;
            case 17:
                ((ebx) obj2).invoke(obj);
                break;
            case 18:
                ((wne0) obj2).invoke(obj);
                break;
            case 19:
                ((m0i) obj2).invoke(obj);
                break;
            case 20:
                ((wo40) obj2).invoke(obj);
                break;
            case 21:
                ((wo40) obj2).invoke(obj);
                break;
            case 22:
                ((wo40) obj2).invoke(obj);
                break;
            case 23:
                ((ncl0.c) obj2).invoke(obj);
                break;
            case 24:
                ((fpl0) obj2).e(new oml0.l((apl0) obj));
                break;
            case 25:
                ((t50) obj2).invoke(obj);
                break;
            case 26:
                ((com.vk.movika.sdk.base.ui.s0) obj2).invoke(obj);
                break;
            case 27:
                ((ptl0) obj2).invoke(obj);
                break;
            case 28:
                ((wo40) obj2).invoke(obj);
                break;
            default:
                isq0 isq0Var = (isq0) obj2;
                Throwable th = (Throwable) obj;
                if (((dwq0) isq0Var.b.getCurrentState()).q.b.a.isEmpty()) {
                    isq0Var.c(svq0.b.n.a);
                }
                isq0Var.t();
                L.e(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
        }
    }
}
