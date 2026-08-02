package defpackage;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.a;

/* loaded from: classes11.dex */
public final class b090 extends ay4 {
    public final /* synthetic */ int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final DisplayMetrics h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b090(int i, int i2, int i3, int i4, DisplayMetrics displayMetrics, int i5) {
        super(i2, 5);
        this.c = i5;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = displayMetrics;
    }

    @Override // defpackage.ay4
    public final int g(int i) {
        switch (this.c) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                return Math.min(this.d + i, this.e - 1);
            default:
                if (this.b <= 0) {
                    return -1;
                }
                return (this.d + i) % this.e;
        }
    }

    @Override // defpackage.ay4
    public final int h(int i) {
        int i2 = this.c;
        int i3 = this.f;
        DisplayMetrics displayMetrics = this.h;
        int i4 = this.g;
        switch (i2) {
            case 0:
                return Math.min(Math.max(0, a.p(Integer.valueOf(i), displayMetrics) + i4), i3);
            default:
                int p = (a.p(Integer.valueOf(i), displayMetrics) + i4) % i3;
                return p < 0 ? p + i3 : p;
        }
    }

    @Override // defpackage.ay4
    public final int i(int i) {
        switch (this.c) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                return Math.max(0, this.d - i);
            default:
                if (this.b <= 0) {
                    return -1;
                }
                int i2 = this.d - i;
                int i3 = this.e;
                int i4 = i2 % i3;
                return (i3 & (((i4 ^ i3) & ((-i4) | i4)) >> 31)) + i4;
        }
    }
}
