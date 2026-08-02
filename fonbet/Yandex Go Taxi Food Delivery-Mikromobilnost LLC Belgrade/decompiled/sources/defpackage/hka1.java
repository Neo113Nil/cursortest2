package defpackage;

import android.content.Context;
import com.yandex.go.address.models.FavoriteAddressDatumType;

/* loaded from: classes7.dex */
public abstract class hka1 {
    public static mgv a;

    public static final int a(Context context) {
        Integer num;
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        if (a2 == null || (num = a2.u0) == null) {
            return 1;
        }
        if (num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final String b(FavoriteAddressDatumType favoriteAddressDatumType) {
        int i = favoriteAddressDatumType == null ? -1 : xcp.a[favoriteAddressDatumType.ordinal()];
        if (i == -1) {
            return "unknown";
        }
        if (i == 1) {
            return "regular";
        }
        if (i == 2) {
            return "geo_point";
        }
        w511.b();
        return null;
    }

    public static final String c(FavoriteAddressDatumType favoriteAddressDatumType) {
        int i = favoriteAddressDatumType == null ? -1 : xcp.a[favoriteAddressDatumType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return "regular";
        }
        if (i == 2) {
            return "geo_point";
        }
        w511.b();
        return null;
    }
}
