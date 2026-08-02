package xsna;

import com.vk.geo.api.data.IconDrawConfig;

/* compiled from: IconSizeCalculator.kt */
/* loaded from: classes2.dex */
public abstract class crv {
    public final float a;
    public final float b;

    public crv(IconDrawConfig iconDrawConfig) {
        this.a = iconDrawConfig.c * 2.0f * 0.13f * iconDrawConfig.e;
        this.b = iconDrawConfig.d * 2.0f * 0.13f * iconDrawConfig.j;
    }

    public abstract long a(int i, CharSequence charSequence);

    public abstract long b(int i, CharSequence charSequence);

    public abstract long c();

    public y8x d() {
        return null;
    }

    public abstract long e();

    public crv() {
        this(IconDrawConfig.x);
    }
}
