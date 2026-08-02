package defpackage;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class ezr {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile pnt0 b = new pnt0((Object) null);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(HProv.PP_CACHE_SIZE, new fzr(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new fzr(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new fzr(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(SubsamplingScaleImageView.ORIENTATION_180, new fzr(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new fzr(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        kxv.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static dzr a(float f) {
        float c2;
        dzr dzrVar;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        dzr dzrVar2 = (dzr) b.b(i);
        if (dzrVar2 != null) {
            return dzrVar2;
        }
        pnt0 pnt0Var = b;
        if (pnt0Var.a) {
            kp50.a(pnt0Var);
        }
        int c3 = cvw.c(pnt0Var.b, pnt0Var.w, i);
        if (c3 >= 0) {
            return (dzr) b.f(c3);
        }
        int i2 = -(c3 + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            fzr fzrVar = new fzr(new float[]{1.0f}, new float[]{f});
            b(f, fzrVar);
            return fzrVar;
        }
        if (i3 < 0) {
            dzrVar = new fzr(fArr, fArr);
            c2 = 1.0f;
        } else {
            c2 = b.c(i3) / 100.0f;
            dzrVar = (dzr) b.f(i3);
        }
        float c4 = ijb1.c(0.0f, 1.0f, c2, b.c(i2) / 100.0f, f);
        dzr dzrVar3 = (dzr) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = ijb1.d(dzrVar.b(f2), dzrVar3.b(f2), c4);
        }
        fzr fzrVar2 = new fzr(fArr, fArr2);
        b(f, fzrVar2);
        return fzrVar2;
    }

    public static void b(float f, fzr fzrVar) {
        synchronized (c) {
            pnt0 clone = b.clone();
            clone.d((int) (f * 100.0f), fzrVar);
            b = clone;
        }
    }
}
