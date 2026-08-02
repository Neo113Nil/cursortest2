package xsna;

import android.graphics.RectF;
import com.vk.core.tips.Tooltip;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class f4p0 implements gzs {
    public final /* synthetic */ gzs b;
    public final /* synthetic */ RectF c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Tooltip f;

    public /* synthetic */ f4p0(gzs gzsVar, RectF rectF, int i, boolean z, Tooltip tooltip) {
        this.b = gzsVar;
        this.c = rectF;
        this.d = i;
        this.e = z;
        this.f = tooltip;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RectF rectF = (RectF) this.b.invoke();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.d;
        float f4 = f2 - f3;
        float f5 = rectF.right;
        float f6 = rectF.bottom + f3;
        RectF rectF2 = this.c;
        rectF2.set(f, f4, f5, f6);
        if (this.e) {
            float f7 = rectF2.left;
            float f8 = this.f.k.j;
            rectF2.left = f7 - f8;
            rectF2.right += f8;
        }
        return rectF2;
    }
}
