package xsna;

import android.util.SparseArray;
import com.vk.dto.stickers.PackPreviewItem;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.dto.stickers.StyleIcons;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.kcl0;

/* compiled from: SuggestsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class s6n0 implements kcl0.c {
    public final p9l0 a;
    public final p6n0 b = new p6n0();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final fiy f = new fiy();
    public volatile Object g = jgp.b;

    public s6n0(p9l0 p9l0Var) {
        this.a = p9l0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, com.vk.dto.stickers.StickersDictionaryItemLight>] */
    @Override // xsna.kcl0.c
    public final Map<String, StickersDictionaryItemLight> a() {
        return this.g;
    }

    @Override // xsna.kcl0.c
    public final ArrayList b(String str) {
        int i;
        StickerStockItem stickerStockItem;
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p9l0 p9l0Var = this.a;
        ArrayList a = i7o0.a(p9l0Var.f);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            StickerStockItem stickerStockItem2 = (StickerStockItem) next;
            List a2 = n6j.a(0, "\\s+", stickerStockItem2.d.toLowerCase(Locale.ROOT));
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                Iterator it2 = a2.iterator();
                while (it2.hasNext()) {
                    if (epx.f((String) it2.next(), lowerCase)) {
                        break;
                    }
                }
            }
            String str2 = stickerStockItem2.d;
            Locale locale = Locale.ROOT;
            if (!str2.toLowerCase(locale).equals(lowerCase) && !stickerStockItem2.f.toLowerCase(locale).equals(lowerCase)) {
                String lowerCase2 = stickerStockItem2.e.toLowerCase(locale);
                ArrayList arrayList3 = new ArrayList(lowerCase2.length());
                for (int i2 = 0; i2 < lowerCase2.length(); i2++) {
                    char charAt = lowerCase2.charAt(i2);
                    arrayList3.add(Boolean.valueOf(Character.isLetter(charAt) || ro.j(charAt)));
                }
                if (epx.f(arrayList3.toString(), lowerCase)) {
                }
            }
            arrayList2.add(next);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            StickerStockItem stickerStockItem3 = (StickerStockItem) it3.next();
            int i3 = stickerStockItem3.b;
            StickerStockItemPreviewImage stickerStockItemPreviewImage = stickerStockItem3.C;
            boolean z = stickerStockItem3.k;
            List<Integer> list = stickerStockItem3.J;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                int intValue = ((Number) it4.next()).intValue();
                SparseArray<StickerStockItem> sparseArray = p9l0Var.h;
                int size = sparseArray.size();
                int i4 = i;
                while (true) {
                    if (i4 >= size) {
                        stickerStockItem = null;
                        break;
                    }
                    stickerStockItem = sparseArray.valueAt(i4);
                    if (stickerStockItem.b == intValue) {
                        break;
                    }
                    i4++;
                }
                StickerStockItem stickerStockItem4 = stickerStockItem;
                StyleIcons styleIcons = stickerStockItem4 != null ? new StyleIcons(stickerStockItem4.b, stickerStockItem4.C, stickerStockItem4.k) : null;
                if (styleIcons != null) {
                    arrayList4.add(styleIcons);
                }
                i = 0;
            }
            arrayList.add(new PackPreviewItem(i3, stickerStockItemPreviewImage, z, arrayList4, stickerStockItem3.d, epx.f(stickerStockItem3.T, Boolean.TRUE)));
            i = 0;
        }
        return arrayList;
    }

    @Override // xsna.kcl0.c
    public final StickersDictionaryItem c(StickersDictionaryItemLight stickersDictionaryItemLight) {
        StickerItem Db;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StickersDictionaryItemLight.DictionaryStickerModel dictionaryStickerModel : stickersDictionaryItemLight.zb()) {
            StickerStockItem stickerStockItem = this.a.h.get(dictionaryStickerModel.zb());
            if (stickerStockItem == null) {
                arrayList.add(new StickerItem(dictionaryStickerModel.o2(), dictionaryStickerModel.zb(), null, null, null, null, false, null, null, null, 1020, null));
            } else if (stickerStockItem.h && (Db = stickerStockItem.Db(dictionaryStickerModel.o2())) != null) {
                arrayList2.add(Db);
            }
        }
        return new StickersDictionaryItem(stickersDictionaryItemLight.Ab(), arrayList2, arrayList, null, stickersDictionaryItemLight.Bb(), 8, null);
    }
}
