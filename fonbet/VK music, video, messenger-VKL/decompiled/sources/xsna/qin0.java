package xsna;

import com.vk.dto.common.ImageSizeKey;
import java.util.Locale;
import xsna.yin0;

/* compiled from: SupportSQLiteConnection.android.kt */
/* loaded from: classes.dex */
public final class qin0 implements hyg0 {
    public final sin0 b;

    public qin0(sin0 sin0Var) {
        this.b = sin0Var;
    }

    @Override // xsna.hyg0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yin0 V0(String str) {
        int i;
        String upperCase = drm0.p0(str).toString().toUpperCase(Locale.ROOT);
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (epx.g(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = drm0.L(upperCase, ImageSizeKey.SIZE_KEY_BASE, i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = drm0.L(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        sin0 sin0Var = this.b;
        if (substring == null) {
            return new yin0.b(sin0Var, str);
        }
        int hashCode = substring.hashCode();
        if (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) {
            return new yin0.b(sin0Var, str);
        }
        yin0.a aVar = new yin0.a(sin0Var, str);
        aVar.e = new int[0];
        aVar.f = new long[0];
        aVar.g = new double[0];
        aVar.h = new String[0];
        aVar.i = new byte[0][];
        return aVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
