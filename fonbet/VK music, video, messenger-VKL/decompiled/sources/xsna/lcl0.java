package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StickersRepositoryHelper.kt */
/* loaded from: classes5.dex */
public final class lcl0 {
    public final ncl0 a;

    public lcl0(ncl0 ncl0Var) {
        this.a = ncl0Var;
    }

    public final StickerStockItem a(StickerStockItem stickerStockItem) {
        List<Integer> list;
        if (stickerStockItem.k) {
            return stickerStockItem;
        }
        boolean Hb = stickerStockItem.Hb();
        ncl0 ncl0Var = this.a;
        Object obj = null;
        if (Hb) {
            List<Integer> list2 = stickerStockItem.J;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                StickerStockItem I = ncl0Var.I(((Number) it.next()).intValue());
                if (I != null) {
                    arrayList.add(I);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((StickerStockItem) next).k) {
                    obj = next;
                    break;
                }
            }
            return (StickerStockItem) obj;
        }
        Integer num = stickerStockItem.L;
        if (num == null) {
            return null;
        }
        StickerStockItem I2 = ncl0Var.I(num.intValue());
        if (I2 != null && I2.k) {
            return I2;
        }
        if (I2 == null || (list = I2.J) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            StickerStockItem I3 = ncl0Var.I(((Number) it3.next()).intValue());
            if (I3 != null) {
                arrayList2.add(I3);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (((StickerStockItem) next2).k) {
                obj = next2;
                break;
            }
        }
        return (StickerStockItem) obj;
    }

    public final boolean b(StickerStockItem stickerStockItem) {
        List<Integer> list;
        boolean Hb = stickerStockItem.Hb();
        ncl0 ncl0Var = this.a;
        if (Hb) {
            List<Integer> list2 = stickerStockItem.J;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                StickerStockItem I = ncl0Var.I(((Number) it.next()).intValue());
                if (I != null) {
                    arrayList.add(I);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                StickerStockItem stickerStockItem2 = (StickerStockItem) it2.next();
                if (stickerStockItem2.h && !ncl0Var.j(stickerStockItem2)) {
                    return true;
                }
            }
            return false;
        }
        Integer num = stickerStockItem.L;
        if (num == null) {
            return false;
        }
        StickerStockItem I2 = ncl0Var.I(num.intValue());
        if (!ncl0Var.j(I2)) {
            return true;
        }
        if (I2 == null || (list = I2.J) == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            StickerStockItem I3 = ncl0Var.I(((Number) it3.next()).intValue());
            if (I3 != null) {
                arrayList2.add(I3);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            StickerStockItem stickerStockItem3 = (StickerStockItem) it4.next();
            if (stickerStockItem3.h && !ncl0Var.j(stickerStockItem3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(StickerStockItem stickerStockItem) {
        VmojiAvatar vmojiAvatar;
        ncl0 ncl0Var = this.a;
        p9l0 p9l0Var = ncl0Var.f;
        return p9l0Var.f.contains(stickerStockItem) || ncl0Var.i0().contains(stickerStockItem) || (p9l0Var.d.contains(stickerStockItem) && stickerStockItem.k && (vmojiAvatar = stickerStockItem.H) != null && vmojiAvatar.Cb());
    }
}
