package xsna;

import java.util.HashMap;
import java.util.Map;

/* compiled from: LayoutSnapshot.kt */
/* loaded from: classes7.dex */
public final class vpy {
    public final gzs<Map<uoy, upy>> a;
    public Map<uoy, upy> b = new HashMap();
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public vpy(gzs<? extends Map<uoy, upy>> gzsVar) {
        this.a = gzsVar;
    }

    public final Map<uoy, upy> a() {
        if (!this.c) {
            this.b = this.a.invoke();
            this.c = true;
        }
        return this.b;
    }
}
