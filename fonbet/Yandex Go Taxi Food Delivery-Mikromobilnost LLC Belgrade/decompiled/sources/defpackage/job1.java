package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ext.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class job1 {
    public static final Object a(ThemedImageUrlEntity themedImageUrlEntity, Context context, vam vamVar, ContinuationImpl continuationImpl) {
        return a.c(b(themedImageUrlEntity, context), vamVar, context, true, continuationImpl);
    }

    public static final String b(ThemedImageUrlEntity themedImageUrlEntity, Context context) {
        return lob1.f(context) ? themedImageUrlEntity.getDarkUrl() : themedImageUrlEntity.getLightUrl();
    }

    public static int c(df90 df90Var, int i, int i2, int i3) {
        d6z.l(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (df90Var.b() < i) {
            return -1;
        }
        int g = df90Var.g(i);
        if (g == i4) {
            if (df90Var.b() < i2) {
                return -1;
            }
            int g2 = df90Var.g(i2);
            g += g2;
            if (g2 == i5) {
                if (df90Var.b() < i3) {
                    return -1;
                }
                return df90Var.g(i3) + g;
            }
        }
        return g;
    }

    public static void d(df90 df90Var) {
        df90Var.o(3);
        df90Var.o(8);
        boolean f = df90Var.f();
        boolean f2 = df90Var.f();
        if (f) {
            df90Var.o(5);
        }
        if (f2) {
            df90Var.o(6);
        }
    }

    public static void e(df90 df90Var) {
        int g;
        int g2 = df90Var.g(2);
        if (g2 == 0) {
            df90Var.o(6);
            return;
        }
        int c = c(df90Var, 5, 8, 16) + 1;
        if (g2 == 1) {
            df90Var.o(c * 7);
            return;
        }
        if (g2 == 2) {
            boolean f = df90Var.f();
            int i = f ? 1 : 5;
            int i2 = f ? 7 : 5;
            int i3 = f ? 8 : 6;
            int i4 = 0;
            while (i4 < c) {
                if (df90Var.f()) {
                    df90Var.o(7);
                    g = 0;
                } else {
                    if (df90Var.g(2) == 3 && df90Var.g(i2) * i != 0) {
                        df90Var.n();
                    }
                    g = df90Var.g(i3) * i;
                    if (g != 0 && g != 180) {
                        df90Var.n();
                    }
                    df90Var.n();
                }
                if (g != 0 && g != 180 && df90Var.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static final rbv f(ThemedImageUrlEntity themedImageUrlEntity, tls tlsVar) {
        return fob1.c(themedImageUrlEntity.getLightUrl(), themedImageUrlEntity.getDarkUrl(), new uwl0(25, tlsVar));
    }

    public static final int g(int i, float f) {
        return (i & 16777215) | (((int) (f * 255.0f)) << 24);
    }
}
