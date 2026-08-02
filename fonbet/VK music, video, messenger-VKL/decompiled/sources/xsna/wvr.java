package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: FocusMeteringAction.java */
/* loaded from: classes11.dex */
public final class wvr {
    public final List<ej20> a;
    public final List<ej20> b;
    public final List<ej20> c;
    public final long d;

    /* compiled from: FocusMeteringAction.java */
    public static class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final long d = 5000;

        public a(@NonNull ej20 ej20Var) {
            a(ej20Var, 1);
        }

        @NonNull
        public final void a(@NonNull ej20 ej20Var, int i) {
            obr.a("Invalid metering mode " + i, i >= 1 && i <= 7);
            if ((i & 1) != 0) {
                this.a.add(ej20Var);
            }
            if ((i & 2) != 0) {
                this.b.add(ej20Var);
            }
        }
    }

    public wvr(a aVar) {
        this.a = Collections.unmodifiableList(aVar.a);
        this.b = Collections.unmodifiableList(aVar.b);
        this.c = Collections.unmodifiableList(aVar.c);
        this.d = aVar.d;
    }
}
