package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class adi0 {
    public final ndi0 a;
    public final tdi0 b;
    public final Object c = new Object();

    public adi0(ndi0 ndi0Var, tdi0 tdi0Var) {
        this.a = ndi0Var;
        this.b = tdi0Var;
    }

    public final ji10 a(ii10 ii10Var) {
        ji10 ji10Var;
        ji10 ji10Var2;
        synchronized (this.c) {
            try {
                kdi0 kdi0Var = (kdi0) ((LinkedHashMap) ((mdi0) this.a.c).c).get(ii10Var);
                ji10Var = kdi0Var != null ? new ji10(kdi0Var.a, kdi0Var.b) : null;
                if (ji10Var == null) {
                    tdi0 tdi0Var = this.b;
                    ArrayList arrayList = (ArrayList) tdi0Var.a.get(ii10Var);
                    if (arrayList == null) {
                        ji10Var = null;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                ji10Var2 = null;
                                break;
                            }
                            rdi0 rdi0Var = (rdi0) arrayList.get(i);
                            q7v q7vVar = (q7v) rdi0Var.a.get();
                            ji10Var2 = q7vVar != null ? new ji10(q7vVar, rdi0Var.b) : null;
                            if (ji10Var2 != null) {
                                break;
                            }
                            i++;
                        }
                        tdi0Var.a();
                        ji10Var = ji10Var2;
                    }
                }
                if (ji10Var != null && !ji10Var.a.a()) {
                    synchronized (this.c) {
                        mdi0 mdi0Var = (mdi0) this.a.c;
                        Object remove = ((LinkedHashMap) mdi0Var.c).remove(ii10Var);
                        if (remove != null) {
                            mdi0Var.b = mdi0Var.b() - mdi0Var.c(ii10Var, remove);
                            mdi0Var.a(ii10Var, remove, null);
                        }
                        if (remove != null) {
                        }
                        if (this.b.a.remove(ii10Var) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ji10Var;
    }

    public final void b(ii10 ii10Var, ji10 ji10Var) {
        synchronized (this.c) {
            long size = ji10Var.a.getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.a.c(ii10Var, ji10Var.a, ji10Var.b, size);
        }
    }
}
