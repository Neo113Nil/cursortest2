package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.go.pin.api.v1.AnimatedParams$Index;

/* loaded from: classes13.dex */
public final class nf2 {
    public static final AccelerateDecelerateInterpolator b = new AccelerateDecelerateInterpolator();
    public final mf2[] a;

    public nf2(boolean z) {
        int size = AnimatedParams$Index.a().size();
        mf2[] mf2VarArr = new mf2[size];
        for (int i = 0; i < size; i++) {
            mf2 mf2Var = new mf2();
            mf2Var.a = i;
            mf2Var.d = b;
            mf2Var.f = z;
            mf2Var.b = z ? new float[0] : new float[1];
            mf2Var.e = z ? 300L : 1000L;
            mf2VarArr[i] = mf2Var;
        }
        this.a = mf2VarArr;
    }

    public final void a(long j) {
        int size = AnimatedParams$Index.a().size();
        for (int i = 0; i < size; i++) {
            this.a[i].e = j;
        }
    }

    public final void b(AnimatedParams$Index animatedParams$Index, float... fArr) {
        this.a[animatedParams$Index.ordinal()].b = fArr;
    }

    public final void c() {
        b(AnimatedParams$Index.EYE_ALPHA, 1.0f);
        b(AnimatedParams$Index.EYE_CLIP, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        b(AnimatedParams$Index.EYE_OFFSET, 0.5f);
    }
}
