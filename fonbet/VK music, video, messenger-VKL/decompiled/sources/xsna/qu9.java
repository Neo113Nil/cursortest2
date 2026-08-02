package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.galvitalayout.ChildSize;
import com.vk.dto.attaches.CarouselRatio;
import java.util.ArrayList;

/* compiled from: CarouselFlexLayoutStrategy.kt */
/* loaded from: classes4.dex */
public final class qu9 implements npr {
    public final gzs<CarouselRatio> b;
    public final lpr c = new lpr(0, 0, new ArrayList());

    public qu9(gzs<CarouselRatio> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.npr
    public final lpr a(uor uorVar) {
        float f;
        lpr lprVar = this.c;
        lprVar.c.clear();
        int i = uorVar.c - (uorVar.f * 4);
        int i2 = i / 4;
        int i3 = i - i2;
        if (uorVar.e.size() <= 1) {
            i2 = 0;
        }
        lprVar.a = (uorVar.e.size() * uorVar.f) + 1 + (uorVar.e.size() * (i - i2));
        CarouselRatio invoke = this.b.invoke();
        if (uorVar.e.isEmpty()) {
            f = 1.0f;
        } else {
            s0u0 s0u0Var = uorVar.e.get(0);
            if (invoke.b > invoke.c) {
                invoke = new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
            }
            ChildSize.Companion.getClass();
            f = swe0.f(ChildSize.a.a(s0u0Var.b / s0u0Var.c).h(), invoke.b, invoke.c);
        }
        lprVar.b = (int) Math.floor(i3 / f);
        int i4 = 0;
        for (Object obj : uorVar.e) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            int i6 = (uorVar.f * i5) + (i4 * i3);
            lprVar.c.add(new u0u0(((s0u0) obj).a, i6, i6 + i3, lprVar.b, 4, 0));
            i4 = i5;
        }
        int size = uorVar.e.size();
        int[] iArr = lprVar.d;
        iArr[0] = 0;
        int i7 = size - 1;
        iArr[1] = i7;
        iArr[2] = i7;
        iArr[3] = 0;
        return lprVar;
    }
}
