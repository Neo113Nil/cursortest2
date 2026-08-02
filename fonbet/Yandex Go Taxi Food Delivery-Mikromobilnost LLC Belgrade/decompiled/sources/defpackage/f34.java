package defpackage;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class f34 {
    public final c34 a;
    public final LinkedList b = new LinkedList();

    public f34(c34 c34Var) {
        this.a = c34Var;
    }

    public final boolean a(float f, w24 w24Var) {
        boolean z = ((double) f) > w24Var.g;
        c34 c34Var = this.a;
        c34Var.getClass();
        long j = z ? w24Var.f : w24Var.e;
        long j2 = z ? w24Var.d : w24Var.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.b;
        if (linkedList.size() < j) {
            linkedList.add(Long.valueOf(elapsedRealtime));
            Objects.toString(linkedList);
            c34Var.getClass();
            return true;
        }
        Long l = (Long) a.R(linkedList);
        if (l == null) {
            linkedList.add(Long.valueOf(elapsedRealtime));
            Objects.toString(linkedList);
            c34Var.getClass();
            return true;
        }
        if (elapsedRealtime - l.longValue() <= j2) {
            c34Var.getClass();
            return false;
        }
        linkedList.removeFirst();
        linkedList.add(Long.valueOf(elapsedRealtime));
        Objects.toString(linkedList);
        c34Var.getClass();
        return true;
    }
}
