package xsna;

import com.vk.dto.attaches.CarouselRatio;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CarouselFlexLayoutStrategy1Ratio.kt */
/* loaded from: classes4.dex */
public final class ou9 implements npr {
    public final Object b;
    public final Object c;

    public ou9(kbz0 kbz0Var, Runnable runnable) {
        this.b = kbz0Var;
        this.c = runnable;
    }

    @Override // xsna.npr
    public lpr a(uor uorVar) {
        lpr lprVar = (lpr) this.c;
        lprVar.c.clear();
        int i = uorVar.c - (uorVar.f * 2);
        lprVar.a = i;
        lprVar.b = (int) Math.floor(i / ((CarouselRatio) ((gzs) this.b).invoke()).c);
        int i2 = 0;
        for (Object obj : uorVar.e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            List<u0u0> list = lprVar.c;
            int i4 = ((s0u0) obj).a;
            int i5 = uorVar.f;
            list.add(new u0u0(i4, i5, i5 + i, lprVar.b, 4, 0));
            i2 = i3;
        }
        return lprVar;
    }

    public ou9(gzs gzsVar) {
        this.b = gzsVar;
        this.c = new lpr(0, 0, new ArrayList());
    }
}
