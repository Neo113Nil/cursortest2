package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.photos.ui.PhotoUploadExtraParams;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import xsna.mce;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Parcelable parcelable;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((p60) obj2).invoke(obj);
                break;
            case 1:
                ((dg) obj2).invoke(obj);
                break;
            case 2:
                ((jy) obj2).invoke(obj);
                break;
            case 3:
                ((dg) obj2).invoke(obj);
                break;
            case 4:
                vj6 vj6Var = (vj6) obj2;
                BasePhotoListFragment basePhotoListFragment = vj6Var.c;
                if (!(obj instanceof s4a0)) {
                    if (!(obj instanceof zaa0)) {
                        if (!(obj instanceof paq0)) {
                            if (obj instanceof cl1) {
                                cl1 cl1Var = (cl1) obj;
                                PhotoAlbum photoAlbum = vj6Var.g;
                                if (photoAlbum != null) {
                                    PhotoAlbum photoAlbum2 = cl1Var.a;
                                    if (photoAlbum.b == photoAlbum2.b) {
                                        vj6Var.g = photoAlbum2;
                                        basePhotoListFragment.I0();
                                        break;
                                    }
                                }
                            }
                        } else {
                            paq0 paq0Var = (paq0) obj;
                            PhotoAlbum photoAlbum3 = vj6Var.g;
                            if (photoAlbum3 != null && (parcelable = paq0Var.b) != null && (parcelable instanceof PhotoUploadExtraParams)) {
                                int i2 = photoAlbum3.b;
                                if (i2 != -9002) {
                                    if (i2 == ((PhotoUploadExtraParams) parcelable).b) {
                                        vj6Var.h();
                                        break;
                                    }
                                } else {
                                    UserId userId = photoAlbum3.c;
                                    UserId userId2 = ((PhotoUploadExtraParams) parcelable).c;
                                    if (epx.f(userId, userId2) || (!fkq0.c(photoAlbum3.c) && o25.a().a(userId2))) {
                                        vj6Var.h();
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        zaa0 zaa0Var = (zaa0) obj;
                        PhotoAlbum photoAlbum4 = vj6Var.g;
                        if (photoAlbum4 != null) {
                            int i3 = zaa0Var.a;
                            UserId userId3 = zaa0Var.c;
                            int i4 = photoAlbum4.b;
                            if (i3 == i4 || (i4 == -9002 && epx.f(photoAlbum4.c, userId3) && i3 != -15)) {
                                photoAlbum4.f--;
                                basePhotoListFragment.r0(zaa0Var.b);
                                break;
                            }
                        }
                    }
                } else {
                    s4a0 s4a0Var = (s4a0) obj;
                    PhotoAlbum photoAlbum5 = vj6Var.g;
                    if (photoAlbum5 != null && s4a0Var.a == photoAlbum5.b) {
                        Photo photo = s4a0Var.b;
                        photoAlbum5.f++;
                        basePhotoListFragment.g1(photo);
                        break;
                    }
                }
                break;
            case 5:
                ((dg) obj2).invoke(obj);
                break;
            case 6:
                ((x50) obj2).invoke(obj);
                break;
            case 7:
                ((iea) obj2).invoke(obj);
                break;
            case 8:
                ((sa) obj2).invoke(obj);
                break;
            case 9:
                ((yx0) obj2).invoke(obj);
                break;
            case 10:
                ((dg) obj2).invoke(obj);
                break;
            case 11:
                ((dg) obj2).invoke(obj);
                break;
            case 12:
                ((ClassifiedsCatalogBaseRootVh.c) obj2).invoke(obj);
                break;
            case 13:
                ((dg) obj2).invoke(obj);
                break;
            case 14:
                ((dg) obj2).invoke(obj);
                break;
            case 15:
                ((mce.b) obj2).invoke(obj);
                break;
            case 16:
                ((qt5) obj2).invoke(obj);
                break;
            case 17:
                int i5 = CommunityWidgetPreviewFragment.U;
                ((zqh) obj2).invoke(obj);
                break;
            case 18:
                ((zqh) obj2).invoke(obj);
                break;
            case 19:
                ((zqh) obj2).invoke(obj);
                break;
            case 20:
                ((zqh) obj2).invoke(obj);
                break;
            case 21:
                ((zqh) obj2).invoke(obj);
                break;
            case 22:
                ((ae8) obj2).invoke(obj);
                break;
            case 23:
                ((t9e) obj2).invoke(obj);
                break;
            case 24:
                ((qt5) obj2).invoke(obj);
                break;
            case 25:
                ((x50) obj2).invoke(obj);
                break;
            case 26:
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                ((wd8) obj2).invoke(obj);
                break;
            case 27:
                ((zqh) obj2).invoke(obj);
                break;
            case 28:
                ((thu) obj2).invoke(obj);
                break;
            default:
                ((zqh) obj2).invoke(obj);
                break;
        }
    }
}
