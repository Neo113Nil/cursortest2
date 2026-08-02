package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.Constants$CounterNames;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: FirebasePerfTraceValidator.java */
/* loaded from: classes13.dex */
public final class jjr extends xv90 {
    public static final ra2 b = ra2.d();
    public final com.google.firebase.perf.v1.i a;

    public jjr(@NonNull com.google.firebase.perf.v1.i iVar) {
        this.a = iVar;
    }

    public static boolean d(@Nullable com.google.firebase.perf.v1.i iVar, int i) {
        if (iVar != null) {
            ra2 ra2Var = b;
            if (i > 1) {
                ra2Var.h();
                return false;
            }
            for (Map.Entry<String, Long> entry : iVar.s().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String trim = key.trim();
                    if (trim.isEmpty()) {
                        ra2Var.h();
                    } else if (trim.length() > 100) {
                        ra2Var.h();
                    } else if (entry.getValue() == null) {
                        Objects.toString(entry.getValue());
                        ra2Var.h();
                        return false;
                    }
                }
                entry.getKey();
                ra2Var.h();
                return false;
            }
            Iterator<E> it = iVar.x().iterator();
            while (it.hasNext()) {
                if (!d((com.google.firebase.perf.v1.i) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(@Nullable com.google.firebase.perf.v1.i iVar, int i) {
        Long l;
        ra2 ra2Var = b;
        if (iVar == null) {
            ra2Var.h();
            return false;
        }
        if (i > 1) {
            ra2Var.h();
            return false;
        }
        String name = iVar.getName();
        if (name != null) {
            String trim = name.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (iVar.v() <= 0) {
                    ra2Var.h();
                    return false;
                }
                if (!iVar.y()) {
                    ra2Var.h();
                    return false;
                }
                if (iVar.getName().startsWith("_st_") && ((l = iVar.s().get(Constants$CounterNames.FRAMES_TOTAL.toString())) == null || l.compareTo((Long) 0L) <= 0)) {
                    ra2Var.h();
                    return false;
                }
                Iterator<E> it = iVar.x().iterator();
                while (it.hasNext()) {
                    if (!e((com.google.firebase.perf.v1.i) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : iVar.t().entrySet()) {
                    try {
                        xv90.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        e.getLocalizedMessage();
                        ra2Var.h();
                        return false;
                    }
                }
                return true;
            }
        }
        ra2Var.h();
        return false;
    }

    @Override // xsna.xv90
    public final boolean a() {
        com.google.firebase.perf.v1.i iVar = this.a;
        boolean e = e(iVar, 0);
        ra2 ra2Var = b;
        if (!e) {
            iVar.getName();
            ra2Var.h();
            return false;
        }
        if (iVar.r() <= 0) {
            Iterator<E> it = iVar.x().iterator();
            while (it.hasNext()) {
                if (((com.google.firebase.perf.v1.i) it.next()).r() > 0) {
                }
            }
            return true;
        }
        if (d(iVar, 0)) {
            return true;
        }
        ra2Var.h();
        return false;
    }
}
