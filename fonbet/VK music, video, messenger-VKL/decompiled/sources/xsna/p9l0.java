package xsna;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersProduct;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.images.ImagesConfigsSet;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StickersData.kt */
/* loaded from: classes5.dex */
public final class p9l0 {
    public final Object a;
    public VmojiAvatarModel b;
    public ImagesConfigsSet c;
    public final ArrayList d = new ArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final ArrayList g = new ArrayList();
    public final SparseArray<StickerStockItem> h = new SparseArray<>();
    public final jod i = new jod(1024);
    public final HashSet j = new HashSet();
    public final SparseIntArray k = new SparseIntArray();
    public final SparseIntArray l = new SparseIntArray();
    public final io.reactivex.rxjava3.subjects.f<StickersPromoModel> m = new io.reactivex.rxjava3.subjects.f<>();
    public StickersPromoModel n = new StickersPromoModel(0, 0, 0, null, null, null, 63, null);

    /* compiled from: StickersData.kt */
    public static final class a {
        public static final void a(CopyOnWriteArrayList copyOnWriteArrayList, StickerStockItem stickerStockItem, int i) {
            if (i < 0 || copyOnWriteArrayList.size() < i) {
                copyOnWriteArrayList.add(stickerStockItem);
            } else {
                copyOnWriteArrayList.add(i, stickerStockItem);
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((StickerStockItem) t).z), Integer.valueOf(((StickerStockItem) t2).z));
        }
    }

    public p9l0(Object obj) {
        this.a = obj;
    }

    public static SparseIntArray g(List list) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((StickersProduct) obj).e) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            StickersProduct stickersProduct = (StickersProduct) it.next();
            Integer num = stickersProduct.c;
            int intValue = num != null ? num.intValue() : stickersProduct.b;
            if (!arrayList.contains(Integer.valueOf(intValue)) && stickersProduct.f) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    StickersProduct stickersProduct2 = (StickersProduct) obj2;
                    Integer num2 = stickersProduct2.c;
                    if ((num2 != null ? num2.intValue() : stickersProduct2.b) == intValue) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((StickersProduct) it2.next()).f) {
                            arrayList.add(Integer.valueOf(intValue));
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                sparseIntArray.put(((StickersProduct) it3.next()).b, arrayList.indexOf(Integer.valueOf(intValue)));
                            }
                        }
                    }
                }
            }
        }
        return sparseIntArray;
    }

    public static SparseIntArray h(List list) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((StickersProduct) obj).e) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            StickersProduct stickersProduct = (StickersProduct) it.next();
            Integer num = stickersProduct.c;
            int intValue = num != null ? num.intValue() : stickersProduct.b;
            if (!arrayList.contains(Integer.valueOf(intValue))) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    StickersProduct stickersProduct2 = (StickersProduct) obj2;
                    Integer num2 = stickersProduct2.c;
                    if ((num2 != null ? num2.intValue() : stickersProduct2.b) == intValue) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((StickersProduct) it2.next()).f) {
                            break;
                        }
                    }
                }
                arrayList.add(Integer.valueOf(intValue));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    sparseIntArray.put(((StickersProduct) it3.next()).b, arrayList.indexOf(Integer.valueOf(intValue)));
                }
            }
        }
        return sparseIntArray;
    }

    public final void a(StickerStockItem stickerStockItem) {
        Object obj;
        boolean z = stickerStockItem.k;
        boolean z2 = stickerStockItem.Q;
        int i = stickerStockItem.b;
        boolean z3 = stickerStockItem.h;
        boolean z4 = stickerStockItem.l;
        if (z4 && !z3) {
            this.e.add(stickerStockItem);
        }
        Object obj2 = null;
        if (z2) {
            ArrayList arrayList = this.d;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((StickerStockItem) obj).b == i) {
                        break;
                    }
                }
            }
            int indexOf = arrayList.indexOf((StickerStockItem) obj);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, stickerStockItem);
            } else {
                arrayList.add(stickerStockItem);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((StickerStockItem) next).b == i) {
                    obj2 = next;
                    break;
                }
            }
            StickerStockItem stickerStockItem2 = (StickerStockItem) obj2;
            if (stickerStockItem2 != null) {
                copyOnWriteArrayList.remove(stickerStockItem2);
            }
        } else if (z && z3) {
            c(stickerStockItem, null);
        } else if (!z && z3) {
            d(stickerStockItem, null);
        }
        this.h.put(i, stickerStockItem);
        if (stickerStockItem.M && z3) {
            this.j.add(stickerStockItem);
        }
        if ((z && z3) || z4 || z2) {
            Iterator<T> it3 = stickerStockItem.g.iterator();
            while (it3.hasNext()) {
                this.i.put(Integer.valueOf(((StickerItem) it3.next()).b), Integer.valueOf(i));
            }
        }
    }

    public final void b(List<StickerStockItem> list) {
        synchronized (this.a) {
            try {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    StickerStockItem stickerStockItem = (StickerStockItem) it.next();
                    a(StickerStockItem.Ab(stickerStockItem, false, this.k.get(stickerStockItem.b, stickerStockItem.z), null, null, -16777217, 8191));
                }
                i();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder("Added items; active=");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((StickerStockItem) obj).k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((StickerStockItem) it2.next()).b));
        }
        sb.append(arrayList2);
        sb.append(" activated order={");
        sb.append(this.k);
        sb.append("}; final active={");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        ArrayList arrayList3 = new ArrayList(c5g.u(copyOnWriteArrayList, 10));
        Iterator it3 = copyOnWriteArrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((StickerStockItem) it3.next()).b));
        }
        L.e("[VkStickersData]", io.reactivex.rxjava3.internal.operators.mixed.j.b('}', sb, arrayList3));
    }

    public final void c(StickerStockItem stickerStockItem, Integer num) {
        Object obj;
        int i = stickerStockItem.b;
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((StickerStockItem) obj).b == i) {
                    break;
                }
            }
        }
        StickerStockItem stickerStockItem2 = (StickerStockItem) obj;
        if (stickerStockItem2 != null) {
            arrayList.remove(stickerStockItem2);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        int indexOf = copyOnWriteArrayList.indexOf(stickerStockItem);
        copyOnWriteArrayList.remove(stickerStockItem);
        if (num == null) {
            a.a(copyOnWriteArrayList, stickerStockItem, indexOf);
        } else if (num.intValue() == -1) {
            a.a(copyOnWriteArrayList, stickerStockItem, this.k.get(i, -1));
        } else {
            a.a(copyOnWriteArrayList, stickerStockItem, num.intValue());
        }
    }

    public final void d(StickerStockItem stickerStockItem, Integer num) {
        Object obj;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((StickerStockItem) obj).b == stickerStockItem.b) {
                    break;
                }
            }
        }
        StickerStockItem stickerStockItem2 = (StickerStockItem) obj;
        if (stickerStockItem2 != null) {
            copyOnWriteArrayList.remove(stickerStockItem2);
        }
        ArrayList arrayList = this.g;
        arrayList.remove(stickerStockItem);
        if (num == null) {
            arrayList.add(stickerStockItem);
        } else {
            arrayList.add(num.intValue(), stickerStockItem);
        }
    }

    public final void e() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.b = null;
        this.d.clear();
        this.h.clear();
        this.i.clear();
        this.k.clear();
        this.l.clear();
        this.j.clear();
        StickersPromoModel stickersPromoModel = new StickersPromoModel(0, 0, 0, null, null, null, 63, null);
        this.n = stickersPromoModel;
        this.m.onNext(stickersPromoModel);
    }

    public final boolean f() {
        return this.e.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && zik0.c(this.h);
    }

    public final void i() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        ArrayList arrayList = new ArrayList(c5g.u(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StickerStockItem) it.next()).b));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            int intValue = ((Number) next).intValue();
            SparseIntArray sparseIntArray = this.k;
            if (sparseIntArray.get(intValue) != i) {
                if (sparseIntArray.size() != 0) {
                    ArrayList arrayList2 = new ArrayList(c5g.u(copyOnWriteArrayList, 10));
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        StickerStockItem stickerStockItem = (StickerStockItem) it3.next();
                        arrayList2.add(StickerStockItem.Ab(stickerStockItem, false, sparseIntArray.get(stickerStockItem.b, stickerStockItem.z), null, null, -16777217, 8191));
                    }
                    List D0 = j5g.D0(new b(), arrayList2);
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(D0);
                    Iterator it4 = copyOnWriteArrayList.iterator();
                    while (it4.hasNext()) {
                        StickerStockItem stickerStockItem2 = (StickerStockItem) it4.next();
                        this.h.put(stickerStockItem2.b, stickerStockItem2);
                    }
                    return;
                }
                return;
            }
            i = i2;
        }
    }
}
