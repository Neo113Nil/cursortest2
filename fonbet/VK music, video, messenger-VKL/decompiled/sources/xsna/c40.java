package xsna;

import com.vk.channels.impl.list.g;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import java.util.List;
import xsna.gx6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b40) obj2).invoke(obj);
                break;
            case 1:
                ((mm1) obj2).invoke(obj);
                break;
            case 2:
                ro1 ro1Var = (ro1) obj2;
                VkAlbumsFragment vkAlbumsFragment = ro1Var.b;
                if (!(obj instanceof zaa0)) {
                    if (!(obj instanceof bf1)) {
                        if (!(obj instanceof ok1)) {
                            if (obj instanceof cl1) {
                                PhotoAlbum photoAlbum = ((cl1) obj).a;
                                em1 em1Var = vkAlbumsFragment.U;
                                (em1Var != null ? em1Var : null).X(photoAlbum);
                                break;
                            }
                        } else {
                            int i2 = ((ok1) obj).a;
                            em1 em1Var2 = vkAlbumsFragment.U;
                            (em1Var2 != null ? em1Var2 : null).R(i2);
                            break;
                        }
                    } else {
                        bf1 bf1Var = (bf1) obj;
                        int i3 = bf1Var.a;
                        String str = bf1Var.b;
                        em1 em1Var3 = vkAlbumsFragment.U;
                        (em1Var3 != null ? em1Var3 : null).U(i3, str);
                        break;
                    }
                } else {
                    ro1Var.b(true);
                    break;
                }
                break;
            case 3:
                ((yu1) obj2).invoke(obj);
                break;
            case 4:
                ((nt2) obj2).invoke(obj);
                break;
            case 5:
                ((nn4) obj2).invoke(obj);
                break;
            case 6:
                ((lz0) obj2).invoke(obj);
                break;
            case 7:
                ((gx6.a) obj2).invoke(obj);
                break;
            case 8:
                ((lz0) obj2).invoke(obj);
                break;
            case 9:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new l35(4));
                bVar.n(new g.b(th));
                break;
            case 10:
                ((lz0) obj2).invoke(obj);
                break;
            case 11:
                xyb xybVar = (xyb) obj2;
                xybVar.p.compareAndSet(true, false);
                xyb.C.a((Throwable) obj);
                xybVar.Y0();
                break;
            case 12:
                ((j5) obj2).invoke(obj);
                break;
            case 13:
                ((mm1) obj2).invoke(obj);
                break;
            case 14:
                ((b40) obj2).invoke(obj);
                break;
            case 15:
                psm psmVar = (psm) obj2;
                psmVar.q(new b1a(12, psmVar, (io8) obj));
                break;
            case 16:
                ((lz0) obj2).invoke(obj);
                break;
            case 17:
                ((e4n) obj2).e((h4n) obj);
                break;
            case 18:
                ((o2e) obj2).invoke(obj);
                break;
            case 19:
                ((zxo) obj2).invoke(obj);
                break;
            case 20:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj2;
                dVar.q(new qd1(14, dVar, (List) obj));
                break;
            case 21:
                ((zxo) obj2).invoke(obj);
                break;
            case 22:
                ((eoh) obj2).invoke(obj);
                break;
            case 23:
                ((zxo) obj2).invoke(obj);
                break;
            case 24:
                ((zxo) obj2).invoke(obj);
                break;
            case 25:
                ((b40) obj2).invoke(obj);
                break;
            case 26:
                ((zxo) obj2).invoke(obj);
                break;
            case 27:
                int i4 = MarketEditAlbumCoverFragment.d0;
                ((u19) obj2).invoke(obj);
                break;
            case 28:
                ((oa10) obj2).invoke(obj);
                break;
            default:
                ((b40) obj2).invoke(obj);
                break;
        }
    }
}
