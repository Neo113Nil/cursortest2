package defpackage;

import com.yandex.plus.core.graphql.type.VerticalAlignment;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class bp11 implements b70 {
    public static final List a = Collections.singletonList("verticalContentAlignment");

    public static xo11 c(xdx xdxVar) {
        VerticalAlignment verticalAlignment;
        VerticalAlignment verticalAlignment2 = null;
        while (xdxVar.h2(a) == 0) {
            String nextString = xdxVar.nextString();
            VerticalAlignment.Companion.getClass();
            VerticalAlignment[] values = VerticalAlignment.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    verticalAlignment = null;
                    break;
                }
                verticalAlignment = values[i];
                if (jl40.l(verticalAlignment.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            verticalAlignment2 = verticalAlignment == null ? VerticalAlignment.UNKNOWN__ : verticalAlignment;
        }
        return new xo11(verticalAlignment2);
    }
}
