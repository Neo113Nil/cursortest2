package xsna;

import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PhotoParamsExt.kt */
/* loaded from: classes15.dex */
public final class laa0 {
    public static final MobileOfficialAppsCorePhotoEditorStat$PhotoParams a(paa0 paa0Var) {
        haa0 haa0Var = paa0Var.b;
        boolean z = haa0Var.a;
        boolean z2 = haa0Var.b;
        boolean z3 = haa0Var.c;
        Long valueOf = haa0Var.d != null ? Long.valueOf(r4.intValue()) : null;
        Integer num = haa0Var.e;
        boolean z4 = haa0Var.f;
        Integer num2 = haa0Var.g;
        boolean z5 = haa0Var.h;
        String str = haa0Var.i;
        Integer num3 = haa0Var.j;
        CropStatEvent.Format format = haa0Var.k;
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio a = format != null ? dik.a(format) : null;
        int i = haa0Var.t;
        int i2 = haa0Var.u;
        String str2 = haa0Var.l;
        Integer num4 = haa0Var.n;
        Integer num5 = haa0Var.o;
        String str3 = haa0Var.p;
        boolean z6 = !haa0Var.s.isEmpty();
        List<f5l0> list = haa0Var.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            boolean z7 = z2;
            boolean z8 = z3;
            if (obj instanceof VkStickerMeta) {
                arrayList.add(obj);
            }
            z2 = z7;
            z3 = z8;
        }
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = !arrayList.isEmpty();
        boolean z12 = !haa0Var.r.isEmpty();
        List<TextStatEvent.e> list2 = haa0Var.r;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(vlo0.a((TextStatEvent.e) it.next()));
        }
        List<DrawStatEvent.b> list3 = haa0Var.s;
        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(pio.a((DrawStatEvent.b) it2.next()));
        }
        List<f5l0> list4 = haa0Var.q;
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList5 = arrayList2;
            MobileOfficialAppsCorePhotoEditorStat$StickerData a2 = a7l0.a((f5l0) it3.next());
            if (a2 != null) {
                arrayList4.add(a2);
            }
            arrayList2 = arrayList5;
        }
        return new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(Boolean.valueOf(z), Boolean.valueOf(z9), Boolean.valueOf(z10), valueOf, num, Boolean.valueOf(z4), num2, Boolean.valueOf(z5), str, null, null, num3, a, Integer.valueOf(i), Integer.valueOf(i2), null, null, str2, num4, num5, str3, null, Boolean.valueOf(z12), Boolean.valueOf(z11), Boolean.valueOf(z6), arrayList3, arrayList2, arrayList4, haa0Var.v, haa0Var.w, Boolean.valueOf(haa0Var.x), 2196992, null);
    }
}
