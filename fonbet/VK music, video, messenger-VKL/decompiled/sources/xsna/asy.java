package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.voip.ui.permissions.OverlayPermissionFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.cuy;
import xsna.cwb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class asy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ asy(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
                List list2 = (List) this.d;
                mry mryVar = (mry) this.f;
                cuy.c cVar = (cuy.c) obj;
                int b = cVar.b();
                int i = 0;
                for (int i2 = 0; i2 < b; i2++) {
                    i += (int) (mryVar.q == Orientation.Vertical ? cVar.a(i2) & 4294967295L : cVar.a(i2) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(i));
                }
                if (ref$IntRef.element != list2.size()) {
                    ref$IntRef.element++;
                }
                break;
            case 1:
                kmp kmpVar = (kmp) this.c;
                com.vk.photo.editor.features.mlenhance.c cVar2 = (com.vk.photo.editor.features.mlenhance.c) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                Bitmap bitmap2 = (Bitmap) this.f;
                v3p v3pVar = cVar2.c;
                ConstraintLayout constraintLayout = kmpVar.c;
                fyt0.c(constraintLayout, new ihb(kmpVar, bitmap, bitmap2, 4));
                constraintLayout.setPadding(0, v3pVar.h().b - ((int) Math.floor(10 * Resources.getSystem().getDisplayMetrics().density)), 0, v3pVar.h().d - ((int) Math.floor(52 * Resources.getSystem().getDisplayMetrics().density)));
                fyt0.d(kmpVar, new p5(14, cVar2, (View) obj), 1);
                break;
            case 2:
                rnm0 rnm0Var = (rnm0) this.c;
                Context context = (Context) this.d;
                x9l0 x9l0Var = (x9l0) this.e;
                mcj0 mcj0Var = (mcj0) this.f;
                List<PhotosPhotoAlbumFullDto> d = ((PhotosGetAlbumsResponseDto) obj).d();
                tfa0 tfa0Var = tfa0.a;
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto : d) {
                    tfa0Var.getClass();
                    arrayList.add(tfa0.a(photosPhotoAlbumFullDto));
                }
                PhotoAlbum photoAlbum = (PhotoAlbum) j5g.a0(arrayList);
                if (photoAlbum == null) {
                    mcj0Var.invoke(new Exception());
                    break;
                } else {
                    oga0.a(rnm0Var.c, context, photoAlbum, null, 28);
                    x9l0Var.invoke();
                    break;
                }
            default:
                Integer num = (Integer) this.c;
                gvw0 gvw0Var = (gvw0) this.d;
                gzs gzsVar = (gzs) this.e;
                gzs gzsVar2 = (gzs) this.f;
                OverlayPermissionFragment overlayPermissionFragment = (OverlayPermissionFragment) obj;
                fgu0 fgu0Var = new fgu0(2, gvw0Var, gzsVar);
                fww0 fww0Var = new fww0(1, gvw0Var, gzsVar2);
                gvw0 gvw0Var2 = overlayPermissionFragment.N;
                if (gvw0Var2 == null || !Settings.canDrawOverlays(gvw0Var2.a)) {
                    overlayPermissionFragment.P = fgu0Var;
                    overlayPermissionFragment.Q = fww0Var;
                    bzb0 bzb0Var = overlayPermissionFragment.O;
                    if (bzb0Var != null) {
                        bzb0.d(bzb0Var, new cwb0.a1(0, null, num != null ? num.intValue() : R.string.voip_permission_required_content, null, R.string.voip_go_to_settings, null, R.string.cancel, null, null, cwb0.c1.c.a, 427), new f550(overlayPermissionFragment, 9), new y4(16, fww0Var, overlayPermissionFragment), new cm(23, fww0Var, overlayPermissionFragment), 16);
                    }
                } else {
                    fgu0Var.invoke();
                    overlayPermissionFragment.tn();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ asy(ArrayList arrayList, Ref$IntRef ref$IntRef, List list, int i, mry mryVar) {
        this.b = 0;
        this.c = arrayList;
        this.e = ref$IntRef;
        this.d = list;
        this.f = mryVar;
    }
}
