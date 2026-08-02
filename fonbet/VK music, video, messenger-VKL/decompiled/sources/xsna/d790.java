package xsna;

import android.content.Context;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PackWithStyles.kt */
/* loaded from: classes6.dex */
public final class d790 {
    public final StickerStockItem a;
    public final ArrayList b;

    public d790(StickerStockItem stickerStockItem, ArrayList arrayList) {
        this.a = stickerStockItem;
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((StickerStockItem) it.next()).O;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Object a0 = j5g.a0(arrayList2);
        a0 = a0 == null ? this.a.O : a0;
        if (a0 != null) {
            String str2 = (String) a0;
            this.a.O = str2;
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((StickerStockItem) it2.next()).O = str2;
            }
        }
    }

    public final boolean a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() && this.a.A) {
            return true;
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((StickerStockItem) it.next()).A) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Price.PriceInfo Eb;
        StickerStockItem stickerStockItem = this.a;
        int zb = (stickerStockItem.h || (Eb = stickerStockItem.n.Eb()) == null) ? 0 : Eb.zb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (!((StickerStockItem) obj).h) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Price.PriceInfo Eb2 = ((StickerStockItem) it.next()).n.Eb();
            i += Eb2 != null ? Eb2.zb() : 0;
        }
        return i + zb;
    }

    public final String c(Context context) {
        int b = b();
        return context.getResources().getQuantityString(R.plurals.balance_votes, b, Integer.valueOf(b));
    }

    public final int d() {
        Price.PriceInfo Fb = this.a.n.Fb();
        int zb = Fb != null ? Fb.zb() : 0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (((StickerStockItem) obj).A) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Price.PriceInfo Fb2 = ((StickerStockItem) it.next()).n.Fb();
            i += Fb2 != null ? Fb2.zb() : 0;
        }
        return i + zb;
    }

    public final String e(Context context) {
        int d = d();
        return context.getResources().getQuantityString(R.plurals.balance_votes, d, Integer.valueOf(d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d790)) {
            return false;
        }
        d790 d790Var = (d790) obj;
        return epx.f(this.a, d790Var.a) && epx.f(this.b, d790Var.b);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        arrayList.addAll(this.b);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((StickerStockItem) next).A) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((StickerStockItem) it2.next()).b));
        }
        return arrayList3;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        arrayList.addAll(this.b);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            StickerStockItem stickerStockItem = (StickerStockItem) next;
            if (!stickerStockItem.h && stickerStockItem.i) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        StickerStockItem stickerStockItem = this.a;
        if (!stickerStockItem.i && !stickerStockItem.h) {
            arrayList.add(stickerStockItem);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.b) {
            StickerStockItem stickerStockItem2 = (StickerStockItem) obj;
            if (!stickerStockItem2.i && !stickerStockItem2.h) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i() {
        int zb;
        Iterator it;
        int zb2;
        StickerStockItem stickerStockItem = this.a;
        if (!stickerStockItem.h) {
            boolean Fb = stickerStockItem.Fb();
            Price price = stickerStockItem.n;
            if (Fb) {
                Price.PriceInfo Bb = price.Bb();
                if (Bb != null) {
                    zb = Bb.zb();
                }
            } else {
                Price.PriceInfo Eb = price.Eb();
                if (Eb != null) {
                    zb = Eb.zb();
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.b) {
                if (!((StickerStockItem) obj).h) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                StickerStockItem stickerStockItem2 = (StickerStockItem) it.next();
                boolean Fb2 = stickerStockItem2.Fb();
                Price price2 = stickerStockItem2.n;
                if (Fb2) {
                    Price.PriceInfo Bb2 = price2.Bb();
                    if (Bb2 != null) {
                        zb2 = Bb2.zb();
                    }
                    zb2 = 0;
                } else {
                    Price.PriceInfo Eb2 = price2.Eb();
                    if (Eb2 != null) {
                        zb2 = Eb2.zb();
                    }
                    zb2 = 0;
                }
                i += zb2;
            }
            return i + zb;
        }
        zb = 0;
        ArrayList arrayList2 = new ArrayList();
        while (r3.hasNext()) {
        }
        it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
        }
        return i2 + zb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r7.equals(0) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0096 A[EDGE_INSN: B:144:0x0096->B:145:0x0096 BREAK  A[LOOP:1: B:26:0x0060->B:143:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(Context context) {
        boolean z;
        boolean z2;
        Iterator it;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (!((StickerStockItem) obj).h) {
                arrayList.add(obj);
            }
        }
        StickerStockItem stickerStockItem = this.a;
        boolean z3 = stickerStockItem.h;
        boolean z4 = stickerStockItem.m;
        Price price = stickerStockItem.n;
        boolean z5 = stickerStockItem.h;
        boolean z6 = true;
        if (!z3) {
            if (!z4) {
                Object Eb = price.Eb();
                if (Eb == null) {
                    Eb = 0;
                }
            }
            z = true;
            if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((StickerStockItem) it.next()).m) {
                        Iterator it2 = arrayList.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            Price.PriceInfo Eb2 = ((StickerStockItem) it2.next()).n.Eb();
                            i += Eb2 != null ? Eb2.zb() : 0;
                        }
                        if (i != 0) {
                            z2 = false;
                        }
                    }
                }
            }
            z2 = true;
            if (!z && z2) {
                if (!z5) {
                    sb.append(context.getString(R.string.stickers_price_summary_stickers));
                }
                if (!arrayList.isEmpty()) {
                    if (!z5) {
                        sb.append(' ');
                        sb.append(context.getString(R.string.stickers_price_summary_and));
                    }
                    if (arrayList.size() == 1) {
                        sb.append(context.getString(R.string.stickers_price_summary_style));
                    } else {
                        sb.append(enj.f(R.plurals.styles_to_purchase, arrayList.size(), context));
                    }
                }
                sb.append(' ');
                sb.append(context.getString(R.string.stickers_price_summary_free));
                return brm0.o(sb.toString());
            }
            if (!z5) {
                sb.append(context.getString(R.string.stickers_price_summary_stickers));
                if (!z4) {
                    Price.PriceInfo Eb3 = price.Eb();
                    if ((Eb3 != null ? Eb3.zb() : 0) != 0) {
                        Price.PriceInfo Eb4 = price.Eb();
                        if (Eb4 != null) {
                            int zb = Eb4.zb();
                            sb.append(' ');
                            sb.append(enj.f(R.plurals.for_votes, zb, context));
                        }
                    }
                }
                sb.append(' ');
                sb.append(context.getString(R.string.stickers_price_summary_free));
            }
            if (!arrayList.isEmpty()) {
                if (!z5) {
                    sb.append(", ");
                }
                if (arrayList.size() == 1) {
                    sb.append(context.getString(R.string.stickers_price_summary_style));
                } else {
                    sb.append(enj.f(R.plurals.styles_to_purchase, arrayList.size(), context));
                }
                if (!z5 && !z4) {
                    Object Eb5 = price.Eb();
                    if (Eb5 == null) {
                        Eb5 = 0;
                    }
                    if (!Eb5.equals(0)) {
                        Iterator it3 = arrayList.iterator();
                        int i2 = 0;
                        while (it3.hasNext()) {
                            Price.PriceInfo Eb6 = ((StickerStockItem) it3.next()).n.Eb();
                            i2 += Eb6 != null ? Eb6.zb() : 0;
                        }
                        sb.append(context.getString(R.string.stickers_price_summary_dash));
                        sb.append(" ");
                        if (i2 == 0) {
                            sb.append(context.getString(R.string.stickers_price_summary_free));
                        } else {
                            sb.append(i2);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (!((StickerStockItem) it4.next()).m) {
                            z6 = false;
                            break;
                        }
                    }
                }
                if (!z6) {
                    Iterator it5 = arrayList.iterator();
                    int i3 = 0;
                    while (it5.hasNext()) {
                        Price.PriceInfo Eb7 = ((StickerStockItem) it5.next()).n.Eb();
                        i3 += Eb7 != null ? Eb7.zb() : 0;
                    }
                    if (i3 != 0) {
                        Iterator it6 = arrayList.iterator();
                        int i4 = 0;
                        while (it6.hasNext()) {
                            Price.PriceInfo Eb8 = ((StickerStockItem) it6.next()).n.Eb();
                            i4 += Eb8 != null ? Eb8.zb() : 0;
                        }
                        sb.append(' ');
                        sb.append(enj.f(R.plurals.for_votes, i4, context));
                    }
                }
                sb.append(context.getString(R.string.stickers_price_summary_dash));
                sb.append(context.getString(R.string.stickers_price_summary_free));
            }
            return brm0.o(sb.toString());
        }
        if (!z5) {
            z = false;
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
            }
            z2 = true;
            if (!z) {
            }
            if (!z5) {
            }
            if (!arrayList.isEmpty()) {
            }
            return brm0.o(sb.toString());
        }
        z = true;
        if (!arrayList.isEmpty()) {
        }
        z2 = true;
        if (!z) {
        }
        if (!z5) {
        }
        if (!arrayList.isEmpty()) {
        }
        return brm0.o(sb.toString());
    }

    public final boolean k() {
        StickerStockItem stickerStockItem = this.a;
        if (!stickerStockItem.h && stickerStockItem.Fb()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (!((StickerStockItem) obj).h) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((StickerStockItem) it.next()).Fb()) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        if (this.a.Gb()) {
            return true;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((StickerStockItem) it.next()).Gb()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() && this.a.i) {
            return true;
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((StickerStockItem) it.next()).i) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        if (!this.a.m) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((StickerStockItem) it.next()).m) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        if (!this.a.h) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((StickerStockItem) it.next()).h) {
                return false;
            }
        }
        return true;
    }

    public final boolean p() {
        if (!this.a.h) {
            return true;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((StickerStockItem) it.next()).h) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        Price.PriceInfo Eb;
        Price.PriceInfo Eb2;
        StickerStockItem stickerStockItem = this.a;
        boolean z = stickerStockItem.h;
        if (!z && (z || (Eb2 = stickerStockItem.n.Eb()) == null || Eb2.zb() != 0)) {
            return false;
        }
        ArrayList<StickerStockItem> arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        for (StickerStockItem stickerStockItem2 : arrayList) {
            boolean z2 = stickerStockItem2.h;
            if (!z2 && (z2 || (Eb = stickerStockItem2.n.Eb()) == null || Eb.zb() != 0)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackWithStyles(basePack=");
        sb.append(this.a);
        sb.append(", styles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }

    public /* synthetic */ d790(StickerStockItem stickerStockItem) {
        this(stickerStockItem, new ArrayList());
    }
}
