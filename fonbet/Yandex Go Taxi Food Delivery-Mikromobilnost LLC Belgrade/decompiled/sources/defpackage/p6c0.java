package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.go.places.map.ui.configs.cluster.a;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes13.dex */
public final class p6c0 extends ImageProvider {
    public final /* synthetic */ a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public p6c0(a aVar, String str, int i, ArrayList arrayList, ArrayList arrayList2) {
        this.a = aVar;
        this.b = str;
        this.c = i;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return "cluster:" + this.a.e.getThemeType() + ":" + this.b + ":" + this.c + ":" + kotlin.collections.a.X(this.d, ",", null, null, null, 62);
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        float f;
        String quantityString;
        Bitmap bitmap;
        int i;
        List list;
        a aVar = this.a;
        ArrayList arrayList = this.e;
        int i2 = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            kn00 kn00Var = (kn00) obj;
            hn00 hn00Var = kn00Var instanceof hn00 ? (hn00) kn00Var : null;
            if ((hn00Var != null ? hn00Var.h : null) instanceof xn00) {
                arrayList2.add(obj);
            }
        }
        List A0 = kotlin.collections.a.A0(arrayList2, Math.min(3, i2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = A0.iterator();
        while (it.hasNext()) {
            zwy0 b = a.b((kn00) it.next());
            Bitmap b2 = b != null ? aVar.a.f.b(b, 1.0f) : null;
            if (b2 != null) {
                arrayList3.add(b2);
            }
        }
        List list2 = arrayList3.size() >= 2 ? arrayList3 : null;
        if (list2 == null) {
            ListBuilder a = rcc.a();
            Bitmap bitmap2 = aVar.f;
            if (bitmap2 != null) {
                a.add(bitmap2);
            }
            a.addAll(arrayList3);
            list2 = a.j();
        }
        if (list2.size() < 2) {
            return (Bitmap) aVar.c.c.getValue();
        }
        e8c e8cVar = aVar.b;
        CharSequence a2 = aVar.a(arrayList);
        int i3 = i2 - 1;
        Paint paint = e8c.f;
        int i4 = e8cVar.c;
        int i5 = e8cVar.d;
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            ny61.p();
            return null;
        }
        int width = ((Bitmap) it2.next()).getWidth();
        while (it2.hasNext()) {
            int width2 = ((Bitmap) it2.next()).getWidth();
            if (width < width2) {
                width = width2;
            }
        }
        Iterator it3 = list2.iterator();
        if (!it3.hasNext()) {
            ny61.p();
            return null;
        }
        int height = ((Bitmap) it3.next()).getHeight();
        while (it3.hasNext()) {
            int height2 = ((Bitmap) it3.next()).getHeight();
            if (height < height2) {
                height = height2;
            }
        }
        int size = list2.size();
        Float valueOf = Float.valueOf(5.0f);
        Float valueOf2 = Float.valueOf(-5.0f);
        List g = size == 2 ? scc.g(valueOf2, valueOf) : scc.g(valueOf2, Float.valueOf(0.0f), valueOf);
        int size2 = list2.size();
        Pair b3 = e8c.b(width, height);
        int intValue = ((Number) b3.getFirst()).intValue();
        int intValue2 = ((Number) b3.getSecond()).intValue();
        float f2 = width;
        int i6 = (int) (f2 * 0.65f);
        Pair pair = new Pair(Integer.valueOf((intValue * 2) + g8e.d(size2, 1, i6 < 1 ? 1 : i6, width)), Integer.valueOf(intValue2 + height + (size2 == 3 ? Math.max(intValue2, i5) : intValue2)));
        int intValue3 = ((Number) pair.getFirst()).intValue();
        int intValue4 = ((Number) pair.getSecond()).intValue();
        if (i3 <= 0) {
            f = f2;
            quantityString = null;
        } else {
            f = f2;
            quantityString = e8cVar.a.getResources().getQuantityString(bwh0.discovery_cluster_extra_places, i3, Integer.valueOf(i3));
        }
        wcc0 a3 = e8cVar.a(a2, quantityString);
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(intValue3, a3 != null ? a3.a : 0), (a3 != null ? a3.b + i4 : 0) + intValue4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (i6 < 1) {
            i6 = 1;
        }
        float f3 = (r2 - intValue3) / 2.0f;
        Pair b4 = e8c.b(width, height);
        int intValue5 = ((Number) b4.getFirst()).intValue();
        int intValue6 = ((Number) b4.getSecond()).intValue();
        int size3 = list2.size();
        if (size3 == 3) {
            bitmap = createBitmap;
            i = 1;
            list = scc.g(0, 2, 1);
        } else {
            bitmap = createBitmap;
            i = 1;
            ArrayList arrayList4 = new ArrayList(size3);
            int i7 = 0;
            while (i7 < size3) {
                arrayList4.add(Integer.valueOf(i7));
                i7++;
                size3 = size3;
            }
            list = arrayList4;
        }
        int i8 = list2.size() == 3 ? i : -1;
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            int intValue7 = ((Number) it4.next()).intValue();
            Iterator it5 = it4;
            float f4 = f3 + intValue5 + (intValue7 * i6);
            int i9 = intValue5;
            int i10 = i8;
            float f5 = intValue6 + (intValue7 == i8 ? i5 : 0);
            float f6 = (f / 2.0f) + f4;
            int i11 = i6;
            float f7 = (height / 2.0f) + f5;
            int i12 = i5;
            int save = canvas.save();
            try {
                List list3 = g;
                canvas.rotate(((Number) g.get(intValue7)).floatValue(), f6, f7);
                canvas.drawBitmap((Bitmap) list2.get(intValue7), f4, f5, paint);
                canvas.restoreToCount(save);
                it4 = it5;
                intValue5 = i9;
                i8 = i10;
                i6 = i11;
                i5 = i12;
                g = list3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        if (a3 != null) {
            canvas.drawBitmap(((ddc0) e8cVar.b.getValue()).b(a3), (r2 - r0.getWidth()) / 2.0f, intValue4 + i4, paint);
        }
        return bitmap;
    }
}
