package xsna;

import android.graphics.PorterDuffColorFilter;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.photos.root.presentation.b;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.stickers.views.VKStickerImageView;
import java.util.Iterator;
import xsna.dv70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k130 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k130(Object obj, int i) {
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
                ((eiz) obj2).invoke(obj);
                break;
            case 1:
                int i3 = MoneyTransferLinkFragment.u0;
                ((eiz) obj2).invoke(obj);
                break;
            case 2:
                ((q8w) obj2).invoke(obj);
                break;
            case 3:
                ((eiz) obj2).invoke(obj);
                break;
            case 4:
                ((eiz) obj2).invoke(obj);
                break;
            case 5:
                ((eiz) obj2).invoke(obj);
                break;
            case 6:
                ((eiz) obj2).invoke(obj);
                break;
            case 7:
                ((bk30) obj2).invoke(obj);
                break;
            case 8:
                ((hl1) obj2).invoke(obj);
                break;
            case 9:
                ((el50) obj2).W().c(dv70.a.a);
                break;
            case 10:
                ((xz70) obj2).b(false);
                break;
            case 11:
                ((b.a) obj2).invoke(obj);
                break;
            case 12:
                ((q8w) obj2).invoke(obj);
                break;
            case 13:
                ((eiz) obj2).invoke(obj);
                break;
            case 14:
                ((eiz) obj2).invoke(obj);
                break;
            case 15:
                ((hl1) obj2).invoke(obj);
                break;
            case 16:
                ((eiz) obj2).invoke(obj);
                break;
            case 17:
                kyd0 kyd0Var = (kyd0) obj2;
                if (obj instanceof zaa0) {
                    kyd0Var.l.getClass();
                    int i4 = ((zaa0) obj).b;
                    androidx.lifecycle.f fVar = kyd0Var.c;
                    Iterator<ProfilePhotoTag> it = kyd0Var.m.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (it.next().b.c != i4) {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        gyd0 gyd0Var = (gyd0) fVar;
                        gyd0Var.xj(kyd0Var.m.remove(i2));
                        gyd0Var.I0();
                        break;
                    }
                }
                break;
            case 18:
                int i5 = RestoreSearchFragment.h0;
                ((o8) obj2).invoke(obj);
                break;
            case 19:
                ((e9i0) obj2).invoke(obj);
                break;
            case 20:
                ((prd0) obj2).invoke(obj);
                break;
            case 21:
                ((e9i0) obj2).invoke(obj);
                break;
            case 22:
                ((r6i0) obj2).invoke(obj);
                break;
            case 23:
                ((b8j0) obj2).invoke(obj);
                break;
            case 24:
                ((v0o0) obj2).invoke(obj);
                break;
            case 25:
                ((wkh) obj2).invoke(obj);
                break;
            case 26:
                ((e9i0) obj2).invoke(obj);
                break;
            case 27:
                PorterDuffColorFilter porterDuffColorFilter = VKStickerImageView.p;
                ((e9i0) obj2).invoke(obj);
                break;
            case 28:
                ((e9i0) obj2).invoke(obj);
                break;
            default:
                ((prd0) obj2).invoke(obj);
                break;
        }
    }
}
