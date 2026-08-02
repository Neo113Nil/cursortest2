package xsna;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import okhttp3.o;

/* compiled from: OkHttpKnetEngine.kt */
/* loaded from: classes.dex */
public final class by70 implements kjy {
    public final ArrayList b;

    /* compiled from: OkHttpKnetEngine.kt */
    public static final class a {
        public boolean d;
        public o.a a = new o.a();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public Executor e = new ddk();

        public final void a(ojv ojvVar) {
            this.c.add(ojvVar);
        }
    }

    public by70(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.kjy
    public final mkv a(ckv ckvVar, yjv yjvVar) {
        return zjv.a(yjvVar.c(), this, ckvVar, this.b).c(ckvVar);
    }

    @Override // xsna.kjy
    public final String getId() {
        return "OKHTTP";
    }
}
