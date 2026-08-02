package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;

/* loaded from: classes7.dex */
public final class b6t0 implements vh4 {
    public final int a;
    public final float b;
    public final Object c;
    public final Object d;

    public b6t0(Paint paint, CashbackHorizontalView cashbackHorizontalView, int i, int i2, float f) {
        this.c = paint;
        this.d = cashbackHorizontalView;
        this.a = i2;
        this.b = f;
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
    }

    public static b6t0 c(dl81 dl81Var) {
        b6t0 b6t0Var;
        int i;
        try {
            dl81Var.m(dl81Var.b + 21);
            int s = dl81Var.s() & 3;
            int s2 = dl81Var.s();
            int i2 = dl81Var.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < s2; i5++) {
                dl81Var.m(dl81Var.b + 1);
                int x = dl81Var.x();
                for (int i6 = 0; i6 < x; i6++) {
                    int x2 = dl81Var.x();
                    i4 += x2 + 4;
                    dl81Var.m(dl81Var.b + x2);
                }
            }
            dl81Var.m(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            int i7 = 0;
            int i8 = 0;
            String str = null;
            while (i7 < s2) {
                int s3 = dl81Var.s() & HProv.PP_VERSION_TIMESTAMP;
                int x3 = dl81Var.x();
                int i9 = i3;
                while (i9 < x3) {
                    int x4 = dl81Var.x();
                    b6t0Var = null;
                    try {
                        System.arraycopy(sba1.a, i3, bArr, i8, 4);
                        int i10 = i8 + 4;
                        System.arraycopy(dl81Var.a, dl81Var.b, bArr, i10, x4);
                        if (s3 == 33 && i9 == 0) {
                            xy61 d = sba1.d(i10, i10 + x4, bArr);
                            f = d.g;
                            i = s;
                            str = qfa1.a(d.a, d.b, d.c, d.d, d.e, d.f);
                        } else {
                            i = s;
                        }
                        i8 = i10 + x4;
                        dl81Var.m(dl81Var.b + x4);
                        i9++;
                        s = i;
                        i3 = 0;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e = e;
                        dy31.g(e, "Error parsing HEVC config");
                        return b6t0Var;
                    }
                }
                i7++;
                i3 = 0;
            }
            b6t0Var = null;
            return new b6t0(f, s + 1, str, i4 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr));
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            b6t0Var = null;
        }
    }

    @Override // defpackage.vh4
    public int a() {
        return ((CashbackHorizontalView) this.d).getPaddingTop();
    }

    @Override // defpackage.vh4
    public int b() {
        return this.a;
    }

    @Override // defpackage.vh4
    public void draw(Canvas canvas) {
        CashbackHorizontalView cashbackHorizontalView = (CashbackHorizontalView) this.d;
        float paddingTop = cashbackHorizontalView.getPaddingTop();
        float width = cashbackHorizontalView.getWidth();
        float paddingTop2 = cashbackHorizontalView.getPaddingTop() + this.a;
        Paint paint = (Paint) this.c;
        float f = this.b;
        canvas.drawRoundRect(0.0f, paddingTop, width, paddingTop2, f, f, paint);
    }

    public b6t0(float f, int i, String str, List list) {
        this.c = list;
        this.a = i;
        this.b = f;
        this.d = str;
    }
}
