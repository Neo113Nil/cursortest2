package xsna;

import android.os.Parcelable;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ds60;
import xsna.ecq0;
import xsna.oml0;
import xsna.zsc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o330 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o330(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016c, code lost:
    
        if (r7.Fb(604, false) != null) goto L97;
     */
    @Override // io.reactivex.rxjava3.functions.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        int i;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((n330) obj2).invoke(obj);
                break;
            case 1:
                ((vam) obj2).invoke(obj);
                break;
            case 2:
                ((ng3) obj2).invoke(obj);
                break;
            case 3:
                ((n330) obj2).invoke(obj);
                break;
            case 4:
                ((ng3) obj2).invoke(obj);
                break;
            case 5:
                ((oqu) obj2).invoke(obj);
                break;
            case 6:
                ((u3z) obj2).invoke(obj);
                break;
            case 7:
                PhotoAlbumListFragment photoAlbumListFragment = (PhotoAlbumListFragment) obj2;
                int i3 = PhotoAlbumListFragment.O0;
                ArrayList<T> arrayList = photoAlbumListFragment.v0;
                int i4 = 0;
                if (!(obj instanceof s4a0)) {
                    if (!(obj instanceof zaa0)) {
                        if (!(obj instanceof bf1)) {
                            if (!(obj instanceof ok1)) {
                                if (obj instanceof cl1) {
                                    PhotoAlbum photoAlbum = ((cl1) obj).a;
                                    while (i4 < arrayList.size()) {
                                        if (photoAlbum.b == ((PhotoAlbum) arrayList.get(i4)).b && photoAlbum.c == ((PhotoAlbum) arrayList.get(i4)).c) {
                                            arrayList.set(i4, photoAlbum);
                                            photoAlbumListFragment.M0.notifyItemChanged(i4);
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                ok1 ok1Var = (ok1) obj;
                                int i5 = ok1Var.a;
                                UserId userId = ok1Var.b;
                                while (i4 < arrayList.size()) {
                                    if (i5 == ((PhotoAlbum) arrayList.get(i4)).b && userId.equals(((PhotoAlbum) arrayList.get(i4)).c)) {
                                        arrayList.remove(i4);
                                        photoAlbumListFragment.M0.notifyItemRemoved(i4);
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                break;
                            }
                        } else {
                            bf1 bf1Var = (bf1) obj;
                            int i6 = bf1Var.a;
                            String str = bf1Var.b;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                PhotoAlbum photoAlbum2 = (PhotoAlbum) it.next();
                                if (photoAlbum2.b == i6) {
                                    photoAlbum2.k = str;
                                    break;
                                }
                            }
                            break;
                        }
                    } else {
                        int i7 = ((zaa0) obj).a;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            PhotoAlbum photoAlbum3 = (PhotoAlbum) it2.next();
                            if (i7 == photoAlbum3.b) {
                                photoAlbumListFragment.M0.notifyItemChanged(arrayList.indexOf(photoAlbum3));
                            }
                        }
                        break;
                    }
                } else {
                    s4a0 s4a0Var = (s4a0) obj;
                    int i8 = s4a0Var.a;
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        PhotoAlbum photoAlbum4 = (PhotoAlbum) it3.next();
                        if (i8 == photoAlbum4.b) {
                            if (photoAlbum4.q) {
                                int i9 = iah0.f().density >= 1.5f ? 320 : 200;
                                if (iah0.f().density >= 2.0f) {
                                    i9 = 510;
                                }
                                Photo photo = s4a0Var.b;
                                if (photo.Fb(i9, false) != null) {
                                    photoAlbum4.k = photo.Fb(i9, false).d.d;
                                } else {
                                    if (iah0.f().density >= 2.0f) {
                                        r6m.a.getClass();
                                        if (r6m.k()) {
                                            i = 604;
                                            break;
                                        }
                                    }
                                    i = 130;
                                    photoAlbum4.k = photo.Fb(i, false).d.d;
                                }
                            }
                            photoAlbumListFragment.M0.notifyItemChanged(arrayList.indexOf(photoAlbum4));
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((i750) obj2).invoke(obj);
                break;
            case 9:
                ((xc50) obj2).invoke(obj);
                break;
            case 10:
                ((i750) obj2).invoke(obj);
                break;
            case 11:
                ((i750) obj2).invoke(obj);
                break;
            case 12:
                ((i750) obj2).invoke(obj);
                break;
            case 13:
                ((isc0) obj2).a(new zsc0.a.b(ds60.f.b.b));
                break;
            case 14:
                ((i750) obj2).invoke(obj);
                break;
            case 15:
                fpl0 fpl0Var = (fpl0) obj2;
                List list = (List) obj;
                z7p0 z7p0Var = ((apl0) fpl0Var.b.getCurrentState()).e;
                fpl0Var.e(new oml0.a(z7p0Var != null ? Integer.valueOf(z7p0Var.b) : null, list));
                break;
            case 16:
                ((qjl0) obj2).invoke(obj);
                break;
            case 17:
                ((t2m0) obj2).invoke(obj);
                break;
            case 18:
                ((rvm0) obj2).invoke(obj);
                break;
            case 19:
                ((snb) obj2).invoke(obj);
                break;
            case 20:
                ((qjl0) obj2).invoke(obj);
                break;
            case 21:
                ((qjl0) obj2).invoke(obj);
                break;
            case 22:
                ecq0 ecq0Var = (ecq0) obj2;
                ecq0.a aVar = ecq0Var.a;
                if (((h7o0) obj).a == ecq0Var.b) {
                    if (!(obj instanceof hcq0)) {
                        if (!(obj instanceof paq0)) {
                            if (obj instanceof abq0) {
                                ((abq0) obj).getClass();
                                aVar.b();
                                io.reactivex.rxjava3.disposables.c cVar = ecq0Var.c;
                                if (cVar != null) {
                                    cVar.dispose();
                                    ecq0Var.c = null;
                                    break;
                                }
                            }
                        } else {
                            Parcelable parcelable = ((paq0) obj).b;
                            if (parcelable instanceof Attachment) {
                                aVar.a((Attachment) parcelable);
                            } else {
                                aVar.a(null);
                            }
                            io.reactivex.rxjava3.disposables.c cVar2 = ecq0Var.c;
                            if (cVar2 != null) {
                                cVar2.dispose();
                                ecq0Var.c = null;
                                break;
                            }
                        }
                    } else {
                        int i10 = ((hcq0) obj).b;
                        break;
                    }
                }
                break;
            case 23:
                ((qjl0) obj2).invoke(obj);
                break;
            case 24:
                int i11 = VideoCatalogRootVh.M0;
                ((u2k0) obj2).invoke(obj);
                break;
            case 25:
                ((qjl0) obj2).invoke(obj);
                break;
            case 26:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                ((qjl0) obj2).invoke(obj);
                break;
            case 27:
                ((cue0) obj2).invoke(obj);
                break;
            case 28:
                ((fov0) obj2).invoke(obj);
                break;
            default:
                ((kxv0) obj2).invoke(obj);
                break;
        }
    }
}
