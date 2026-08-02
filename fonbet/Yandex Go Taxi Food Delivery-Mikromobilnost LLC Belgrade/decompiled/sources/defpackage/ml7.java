package defpackage;

import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class ml7 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ml7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ea20 ea20Var = nl7.y;
        if (ea20Var != null) {
            ea20Var.a("updateThemeMode", b.i(new Pair("isDarkTheme", Boolean.valueOf(this.a)), new Pair("isRtl", Boolean.valueOf(this.b))), null);
        }
    }
}
