package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* compiled from: CallbackRegistration.java */
/* loaded from: classes8.dex */
public final class tb9 {
    public static final Logger f = Logger.getLogger(tb9.class.getName());
    public final zro0 a = new zro0(f);
    public final List<jkh0> b;
    public final Runnable c;
    public final List<m8x> d;
    public final boolean e;

    public tb9(List<jkh0> list, Runnable runnable) {
        this.b = list;
        this.c = runnable;
        List<m8x> list2 = (List) list.stream().map(new pb9(0)).collect(Collectors.toList());
        this.d = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        this.e = list.stream().flatMap(new qb9(0)).findAny().isPresent();
    }

    public final void a(final lqf0 lqf0Var, final long j, final long j2) {
        sb9 sb9Var;
        if (this.e) {
            Consumer consumer = new Consumer() { // from class: xsna.rb9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    lqf0 lqf0Var2 = lqf0.this;
                    long j3 = j;
                    long j4 = j2;
                    jkh0 jkh0Var = (jkh0) obj;
                    jkh0Var.d = lqf0Var2;
                    Iterator it = jkh0Var.c.iterator();
                    while (it.hasNext()) {
                        m04 m04Var = (m04) it.next();
                        if (m04Var.c.equals(jkh0Var.d)) {
                            m04Var.s = m04Var.e == AggregationTemporality.DELTA ? m04Var.c.d : j3;
                            m04Var.t = j4;
                        }
                    }
                }
            };
            List<jkh0> list = this.b;
            list.forEach(consumer);
            try {
                this.c.run();
                sb9Var = new sb9();
            } catch (Throwable th) {
                try {
                    if (th instanceof VirtualMachineError) {
                        throw ((VirtualMachineError) th);
                    }
                    if (th instanceof ThreadDeath) {
                        throw ((ThreadDeath) th);
                    }
                    if (th instanceof LinkageError) {
                        throw ((LinkageError) th);
                    }
                    this.a.a(Level.WARNING, "An exception occurred invoking callback for " + this + ".", th);
                    sb9Var = new sb9();
                } catch (Throwable th2) {
                    list.forEach(new sb9());
                    throw th2;
                }
            }
            list.forEach(sb9Var);
        }
    }

    public final String toString() {
        return vp.b("}", new StringBuilder("CallbackRegistration{instrumentDescriptors="), this.d);
    }
}
