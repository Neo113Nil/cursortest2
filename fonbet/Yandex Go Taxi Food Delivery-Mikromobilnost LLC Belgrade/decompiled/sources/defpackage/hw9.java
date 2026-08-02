package defpackage;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsInitialScreen;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;

/* loaded from: classes12.dex */
public final class hw9 {
    public final ChargersDiscountsListEntryPoint a;
    public final String b;
    public final tsa c;
    public final ir9 d;
    public final String e;
    public final ChargersDiscountsInitialScreen f;
    public final String g;

    public hw9(ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, String str, tsa tsaVar, ir9 ir9Var, String str2, ChargersDiscountsInitialScreen chargersDiscountsInitialScreen, String str3, int i) {
        str = (i & 2) != 0 ? null : str;
        tsaVar = (i & 4) != 0 ? null : tsaVar;
        ir9Var = (i & 8) != 0 ? null : ir9Var;
        str2 = (i & 16) != 0 ? null : str2;
        chargersDiscountsInitialScreen = (i & 32) != 0 ? ChargersDiscountsInitialScreen.LIST : chargersDiscountsInitialScreen;
        str3 = (i & 64) != 0 ? null : str3;
        this.a = chargersDiscountsListEntryPoint;
        this.b = str;
        this.c = tsaVar;
        this.d = ir9Var;
        this.e = str2;
        this.f = chargersDiscountsInitialScreen;
        this.g = str3;
    }
}
