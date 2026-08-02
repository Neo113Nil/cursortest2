package defpackage;

import android.os.Handler;
import android.os.Looper;
import yads.nu3;

/* loaded from: classes7.dex */
public final class pn61 implements jh71 {
    public static pn61 e;
    public float a = 0.0f;
    public final kg81 b;
    public nu3 c;
    public kb71 d;

    public pn61(kg81 kg81Var) {
        this.b = kg81Var;
    }

    @Override // defpackage.jh71
    public final void a(boolean z) {
        if (!z) {
            oo61.f.getClass();
            Handler handler = oo61.h;
            if (handler != null) {
                handler.removeCallbacks(oo61.j);
                oo61.h = null;
                return;
            }
            return;
        }
        oo61.f.getClass();
        if (oo61.h == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            oo61.h = handler2;
            handler2.post(oo61.i);
            oo61.h.postDelayed(oo61.j, 200L);
        }
    }

    public static pn61 a() {
        if (e == null) {
            kg81 kg81Var = new kg81();
            new pd81();
            e = new pn61(kg81Var);
        }
        return e;
    }
}
