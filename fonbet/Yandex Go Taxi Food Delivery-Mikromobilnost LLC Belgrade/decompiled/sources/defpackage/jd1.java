package defpackage;

import android.view.View;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class jd1 implements vt31 {
    public final wt31 a;
    public final iva0 b;
    public final fq31 c;
    public final w53 d = new w53();

    public jd1(wt31 wt31Var, iva0 iva0Var, fq31 fq31Var) {
        this.a = wt31Var;
        this.b = iva0Var;
        this.c = fq31Var;
    }

    @Override // defpackage.vt31
    public final void a(int i, String str) {
        synchronized (this.d) {
            Object obj = this.d.get(str);
            if (obj == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            ((id1) obj).j = i;
        }
    }

    @Override // defpackage.vt31
    public final View b(String str) {
        id1 id1Var;
        synchronized (this.d) {
            Object obj = this.d.get(str);
            if (obj == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            id1Var = (id1) obj;
        }
        return id1Var.a();
    }

    @Override // defpackage.vt31
    public final void c(String str, ar31 ar31Var, int i) {
        synchronized (this.d) {
            if (this.d.containsKey(str)) {
                return;
            }
            this.d.put(str, new id1(str, this.a, this.b, ar31Var, this.c, i));
        }
    }
}
