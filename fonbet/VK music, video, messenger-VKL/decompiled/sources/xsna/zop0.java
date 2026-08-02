package xsna;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import xsna.eo5;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class zop0 {
    public static volatile dsk e;
    public final zuf a;
    public final zuf b;
    public final a8h0 c;
    public final qdq0 d;

    public zop0(zuf zufVar, zuf zufVar2, a8h0 a8h0Var, qdq0 qdq0Var, final uvx0 uvx0Var) {
        this.a = zufVar;
        this.b = zufVar2;
        this.c = a8h0Var;
        this.d = qdq0Var;
        uvx0Var.a.execute(new Runnable() { // from class: xsna.tvx0
            @Override // java.lang.Runnable
            public final void run() {
                uvx0 uvx0Var2 = uvx0.this;
                uvx0Var2.d.b(new or20(uvx0Var2, 27));
            }
        });
    }

    public static zop0 a() {
        dsk dskVar = e;
        if (dskVar != null) {
            return dskVar.h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (zop0.class) {
                try {
                    if (e == null) {
                        ny8 ny8Var = new ny8();
                        context.getClass();
                        ny8Var.a = context;
                        e = ny8Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final uop0 c(qip qipVar) {
        Set unmodifiableSet = qipVar != null ? Collections.unmodifiableSet(qipVar.a()) : Collections.singleton(new ijp("proto"));
        eo5.a a = sop0.a();
        qipVar.getClass();
        a.a = "cct";
        a.b = qipVar.getExtras();
        return new uop0(unmodifiableSet, a.a(), this);
    }
}
