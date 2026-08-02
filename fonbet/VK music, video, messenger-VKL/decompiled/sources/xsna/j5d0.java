package xsna;

import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PreviewRatioFactory.kt */
/* loaded from: classes4.dex */
public final class j5d0 {
    public final PreviewRatio a;
    public final PreviewRatio b;
    public final PreviewRatio c;
    public final PreviewRatio d;
    public final ArrayList e;

    public j5d0() {
        new PreviewRatio(2, 3, false, R.drawable.vk_icon_vertical_rectangle_outline_20, 4, null);
        new PreviewRatio(4, 5, false, R.drawable.vk_icon_vertical_rectangle_outline_20, 4, null);
        PreviewRatio previewRatio = new PreviewRatio(3, 4, false, R.drawable.vk_icon_vertical_rectangle_outline_20, 4, null);
        this.a = previewRatio;
        PreviewRatio previewRatio2 = new PreviewRatio(4, 3, false, R.drawable.vk_icon_horizontal_rectangle_outline_20, 4, null);
        this.b = previewRatio2;
        PreviewRatio previewRatio3 = new PreviewRatio(1, 1, false, R.drawable.vk_icon_square_outline_20, 4, null);
        this.c = previewRatio3;
        PreviewRatio previewRatio4 = new PreviewRatio(16, 9, false, R.drawable.vk_icon_horizontal_rectangle_16x9_outline_20, 4, null);
        this.d = previewRatio4;
        this.e = e43.o(previewRatio, previewRatio2, previewRatio3, previewRatio4);
    }

    public final PreviewRatio a(float f) {
        return his0.m(0.75f, f) ? this.a : his0.m(1.3333334f, f) ? this.b : his0.m(1.0f, f) ? this.c : his0.m(1.7777778f, f) ? this.d : b(f);
    }

    public final PreviewRatio b(float f) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PreviewRatio previewRatio = (PreviewRatio) it.next();
            arrayList2.add(Float.valueOf(Math.abs((previewRatio.b() / previewRatio.a()) - f)));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it2.next()).floatValue());
        }
        return (PreviewRatio) arrayList.get(arrayList2.indexOf(Float.valueOf(floatValue)));
    }
}
