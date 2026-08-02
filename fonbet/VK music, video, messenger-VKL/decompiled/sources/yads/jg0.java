package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class jg0 {
    public final lg0 a;
    public final zh1 b;

    public /* synthetic */ jg0() {
        this(new lg0(), new zh1());
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        return this.a.a(context).name().toLowerCase(Locale.ROOT);
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public jg0(lg0 lg0Var, zh1 zh1Var) {
        this.a = lg0Var;
        this.b = zh1Var;
    }
}
