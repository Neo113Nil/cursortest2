package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jdc {
    public final int a;

    public static String a(int i) {
        return ShimmerDivHandler.NUMBER_SING.concat(evu0.N(MoneyInputEditView.DEFAULT_VALUE, 8, Integer.toHexString(i)).toUpperCase(Locale.ROOT));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jdc) {
            return this.a == ((jdc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
