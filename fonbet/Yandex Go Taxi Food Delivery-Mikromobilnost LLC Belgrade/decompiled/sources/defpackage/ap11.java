package defpackage;

import com.yandex.plus.core.graphql.type.HorizontalAlignment;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ap11 implements b70 {
    public static final List a = Collections.singletonList("horizontalContentAlignment");

    public static wo11 c(xdx xdxVar) {
        HorizontalAlignment horizontalAlignment;
        HorizontalAlignment horizontalAlignment2 = null;
        while (xdxVar.h2(a) == 0) {
            String nextString = xdxVar.nextString();
            HorizontalAlignment.Companion.getClass();
            HorizontalAlignment[] values = HorizontalAlignment.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    horizontalAlignment = null;
                    break;
                }
                horizontalAlignment = values[i];
                if (jl40.l(horizontalAlignment.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            horizontalAlignment2 = horizontalAlignment == null ? HorizontalAlignment.UNKNOWN__ : horizontalAlignment;
        }
        return new wo11(horizontalAlignment2);
    }
}
