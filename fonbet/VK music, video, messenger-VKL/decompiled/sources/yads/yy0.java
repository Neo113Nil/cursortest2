package yads;

import android.content.Context;
import android.location.Location;

/* loaded from: classes10.dex */
public final class yy0 implements di1 {
    public final ii1 a;
    public final Object b;

    public /* synthetic */ yy0(Context context, String str) {
        this(new ii1(context, str));
    }

    @Override // yads.di1
    public final Location a() {
        Location location;
        synchronized (this.b) {
            try {
                ii1 ii1Var = this.a;
                hi1 hi1Var = ii1Var.c;
                if (hi1Var == null) {
                    hi1Var = ii1Var.a();
                }
                if (hi1Var != null) {
                    Object a = pn2.a(hi1Var.a, "isComplete", new Object[0]);
                    Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                    if (bool != null && bool.booleanValue()) {
                        Object a2 = pn2.a(hi1Var.a, "getResult", new Object[0]);
                        location = a2 instanceof Location ? (Location) a2 : null;
                        ii1 ii1Var2 = this.a;
                        ii1Var2.c = ii1Var2.a();
                        ii1Var2.c = ii1Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return location;
    }

    public yy0(ii1 ii1Var) {
        this.a = ii1Var;
        this.b = new Object();
    }
}
