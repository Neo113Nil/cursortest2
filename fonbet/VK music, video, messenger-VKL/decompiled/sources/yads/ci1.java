package yads;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;

/* loaded from: classes10.dex */
public final class ci1 {
    public static final Object f = new Object();
    public static volatile ci1 g;
    public final fi1 a;
    public final ei1 b;
    public final hx2 c;
    public final sy2 d;
    public final Context e;

    public ci1(Context context, fi1 fi1Var, ei1 ei1Var, hx2 hx2Var, sy2 sy2Var) {
        this.a = fi1Var;
        this.b = ei1Var;
        this.c = hx2Var;
        this.d = sy2Var;
        this.e = uz.a(context);
    }

    public final Location a() {
        Location location;
        synchronized (f) {
            try {
                if (this.c.a()) {
                    sy2 sy2Var = this.d;
                    Context context = this.e;
                    sy2Var.getClass();
                    if (!sy2.a(context)) {
                        ei1 ei1Var = this.b;
                        Context context2 = this.e;
                        ei1Var.getClass();
                        ArrayList a = ei1.a(context2);
                        ListBuilder e = e43.e();
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            Location a2 = ((di1) it.next()).a();
                            if (a2 != null) {
                                e.add(a2);
                            }
                        }
                        location = this.a.a(e.g());
                    }
                }
                location = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return location;
    }
}
