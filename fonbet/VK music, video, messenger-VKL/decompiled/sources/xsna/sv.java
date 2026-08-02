package xsna;

import android.os.Parcelable;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.PhotoUploadExtraParams;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import java.util.List;
import xsna.fl6;
import xsna.nlk;
import xsna.xyb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((fw) obj2).d(false);
                break;
            case 1:
                ((sz) obj2).invoke(obj);
                break;
            case 2:
                ((sz) obj2).invoke(obj);
                break;
            case 3:
                qo1 qo1Var = (qo1) obj2;
                AlbumsListFragment albumsListFragment = qo1Var.b;
                if (!(obj instanceof zaa0)) {
                    if (!(obj instanceof paq0)) {
                        if (!(obj instanceof bf1)) {
                            if (!(obj instanceof ok1)) {
                                if (obj instanceof cl1) {
                                    PhotoAlbum photoAlbum = ((cl1) obj).a;
                                    dm1 dm1Var = albumsListFragment.Y;
                                    (dm1Var != null ? dm1Var : null).X(photoAlbum);
                                    break;
                                }
                            } else {
                                int i3 = ((ok1) obj).a;
                                dm1 dm1Var2 = albumsListFragment.Y;
                                dm1 dm1Var3 = dm1Var2 != null ? dm1Var2 : null;
                                dm1Var3.getClass();
                                dm1Var3.C0(new am1(i3));
                                break;
                            }
                        } else {
                            bf1 bf1Var = (bf1) obj;
                            int i4 = bf1Var.a;
                            String str = bf1Var.b;
                            dm1 dm1Var4 = albumsListFragment.Y;
                            (dm1Var4 != null ? dm1Var4 : null).U(i4, str);
                            break;
                        }
                    } else {
                        Parcelable parcelable = ((paq0) obj).b;
                        if (parcelable != null && (parcelable instanceof PhotoUploadExtraParams)) {
                            UserId userId = qo1Var.d;
                            UserId userId2 = ((PhotoUploadExtraParams) parcelable).c;
                            if (epx.f(userId, userId2) || (!fkq0.c(qo1Var.d) && o25.a().a(userId2))) {
                                qo1Var.b(true);
                                break;
                            }
                        }
                    }
                } else {
                    qo1Var.b(true);
                    break;
                }
                break;
            case 4:
                ((tn0) obj2).invoke(obj);
                break;
            case 5:
                ((sz) obj2).invoke(obj);
                break;
            case 6:
                ((ec) obj2).invoke(obj);
                break;
            case 7:
                ((fl6.d) obj2).invoke(obj);
                break;
            case 8:
                ((sz) obj2).invoke(obj);
                break;
            case 9:
                ((y8) obj2).invoke(obj);
                break;
            case 10:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj2;
                bVar.q(new d37(4));
                bVar.u((Throwable) obj);
                break;
            case 11:
                ((sz) obj2).invoke(obj);
                break;
            case 12:
                ((xyb.b) obj2).invoke(obj);
                break;
            case 13:
                ((ak) obj2).invoke(obj);
                break;
            case 14:
                ((on) obj2).invoke(obj);
                break;
            case 15:
                ((tn0) obj2).invoke(obj);
                break;
            case 16:
                ((ea3) obj2).invoke(obj);
                break;
            case 17:
                int i5 = ClipsGridDraftsListFragment.l0;
                ((com.vk.movika.sdk.base.observable.q) obj2).invoke(obj);
                break;
            case 18:
                ((sm) obj2).invoke(obj);
                break;
            case 19:
                ((sm) obj2).invoke(obj);
                break;
            case 20:
                ((sm) obj2).invoke(obj);
                break;
            case 21:
                ((sm) obj2).invoke(obj);
                break;
            case 22:
                ((gph) obj2).invoke(obj);
                break;
            case 23:
                ((sz) obj2).invoke(obj);
                break;
            case 24:
                ((nlk.a) obj2).invoke(obj);
                break;
            case 25:
                psm psmVar = (psm) obj2;
                psmVar.q(new z5a(8, (gtm) obj, psmVar));
                break;
            case 26:
                ((pwk) obj2).invoke(obj);
                break;
            case 27:
                ((pwk) obj2).invoke(obj);
                break;
            case 28:
                ((pwk) obj2).invoke(obj);
                break;
            default:
                ((pzr) obj2).q(new ozr((List) obj, i2));
                break;
        }
    }
}
