package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class m5b0 {
    public final o1b0 a;
    public final at2 b;
    public final Looper c;
    public r0 d;
    public final i3y e = a.a(new ak80(28, this));
    public final k5b0 f;

    public m5b0(o1b0 o1b0Var, at2 at2Var, Looper looper) {
        this.a = o1b0Var;
        this.b = at2Var;
        this.c = looper;
        this.f = at2Var.o();
    }

    public final void a(Set set) {
        z83.b(null, Looper.myLooper(), this.c);
        Iterator it = set.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            long longValue = ((Number) it.next()).longValue();
            z83.h(null, longValue > 0);
            if (longValue < ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET) {
                z = true;
            }
            z83.h(null, z);
        }
        if (b().containsAll(set)) {
            return;
        }
        Set g = v4r0.g(set, b());
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it2 = g.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            String str = this.a.b;
            arrayList.add(new l5b0(0L, str, longValue2, ChatId.Companion.f(str)));
        }
        ikw0 startTransaction = this.b.startTransaction();
        try {
            ((Set) this.e.getValue()).addAll(arrayList);
            r0 r0Var = this.d;
            if (r0Var != null) {
                r0Var.m(null, b());
            }
            k5b0 k5b0Var = this.f;
            androidx.room.util.a.b(k5b0Var.a, false, true, new ww90(6, k5b0Var, arrayList));
            startTransaction.s();
            ooc.g(startTransaction, null);
        } finally {
        }
    }

    public final TreeSet b() {
        Set set = (Set) this.e.getValue();
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((l5b0) it.next()).c));
        }
        return new TreeSet(arrayList);
    }

    public final void c(long j) {
        int i;
        z83.b(null, Looper.myLooper(), this.c);
        if (j > 0 && !b().isEmpty()) {
            TreeSet b = b();
            if (b.isEmpty()) {
                i = 0;
            } else {
                Iterator it = b.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((Number) it.next()).longValue() <= j && (i = i + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
            }
            if (i == 0) {
                return;
            }
            ikw0 startTransaction = this.b.startTransaction();
            try {
                Iterator it2 = ((Set) this.e.getValue()).iterator();
                while (it2.hasNext()) {
                    if (((l5b0) it2.next()).c <= j) {
                        it2.remove();
                    }
                }
                r0 r0Var = this.d;
                if (r0Var != null) {
                    r0Var.m(null, b());
                }
                ((Number) androidx.room.util.a.b(this.f.a, false, true, new qo6(this.a.b, j, 20))).intValue();
                z83.i();
                startTransaction.s();
                ooc.g(startTransaction, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(startTransaction, th);
                    throw th2;
                }
            }
        }
    }

    public final void d(long j) {
        z83.b(null, Looper.myLooper(), this.c);
        if (j > 0 && b().contains(Long.valueOf(j))) {
            ikw0 startTransaction = this.b.startTransaction();
            try {
                Iterator it = ((Set) this.e.getValue()).iterator();
                while (it.hasNext()) {
                    if (((l5b0) it.next()).c == j) {
                        it.remove();
                    }
                }
                r0 r0Var = this.d;
                if (r0Var != null) {
                    r0Var.m(null, b());
                }
                ((Number) androidx.room.util.a.b(this.f.a, false, true, new qo6(this.a.b, j, 21))).intValue();
                z83.i();
                startTransaction.s();
                ooc.g(startTransaction, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(startTransaction, th);
                    throw th2;
                }
            }
        }
    }
}
