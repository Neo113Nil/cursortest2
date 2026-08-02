package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MetricStorageRegistry.java */
/* loaded from: classes8.dex */
public final class gl20 {
    public static final Logger c = Logger.getLogger(gl20.class.getName());
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    public final <I extends fl20> I a(I i) {
        zk20 d = i.d();
        synchronized (this.a) {
            I i2 = (I) this.b.computeIfAbsent(d, new fx6(i, 1));
            if (i == i2 && c.isLoggable(Level.WARNING)) {
                Iterator it = new ArrayList(this.b.values()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fl20 fl20Var = (fl20) it.next();
                    if (fl20Var != i) {
                        zk20 d2 = fl20Var.d();
                        if (d2.c().equalsIgnoreCase(d.c())) {
                            Logger logger = c;
                            Level level = Level.WARNING;
                            StringBuilder sb = new StringBuilder("Found duplicate metric definition: ");
                            sb.append(d2.c());
                            sb.append("\n");
                            if (d.c().equals(d.d().b())) {
                                sb.append(d.d().a.h());
                                sb.append("\n");
                            } else {
                                sb.append("\tVIEW defined\n");
                                ngk0 ngk0Var = d.a.get();
                                if (ngk0Var == null) {
                                    ngk0Var = f470.INSTANCE;
                                }
                                sb.append(ngk0Var.h());
                                sb.append("\tFROM instrument ");
                                sb.append(d.d().b());
                                sb.append("\n");
                                sb.append(d.d().a.h());
                            }
                            sb.append("Causes\n");
                            if (!d2.c().equals(d.c())) {
                                sb.append("- Name [");
                                sb.append(d.c());
                                sb.append("] does not match [");
                                sb.append(d2.c());
                                sb.append("]\n");
                            }
                            if (!d2.b().equals(d.b())) {
                                sb.append("- Description [");
                                sb.append(d.b());
                                sb.append("] does not match [");
                                sb.append(d2.b());
                                sb.append("]\n");
                            }
                            if (!ob1.a(d2.e().b()).equals(ob1.a(d.e().b()))) {
                                sb.append("- Aggregation [");
                                sb.append(ob1.a(d.e().b()));
                                sb.append("] does not match [");
                                sb.append(ob1.a(d2.e().b()));
                                sb.append("]\n");
                            }
                            if (!d2.d().b().equals(d.d().b())) {
                                sb.append("- InstrumentName [");
                                sb.append(d.d().b());
                                sb.append("] does not match [");
                                sb.append(d2.d().b());
                                sb.append("]\n");
                            }
                            if (!d2.d().a().equals(d.d().a())) {
                                sb.append("- InstrumentDescription [");
                                sb.append(d.d().a());
                                sb.append("] does not match [");
                                sb.append(d2.d().a());
                                sb.append("]\n");
                            }
                            if (!d2.d().d().equals(d.d().d())) {
                                sb.append("- InstrumentUnit [");
                                sb.append(d.d().d());
                                sb.append("] does not match [");
                                sb.append(d2.d().d());
                                sb.append("]\n");
                            }
                            if (!d2.d().c().equals(d.d().c())) {
                                sb.append("- InstrumentType [");
                                sb.append(d.d().c());
                                sb.append("] does not match [");
                                sb.append(d2.d().c());
                                sb.append("]\n");
                            }
                            if (!d2.d().e().equals(d.d().e())) {
                                sb.append("- InstrumentValueType [");
                                sb.append(d.d().e());
                                sb.append("] does not match [");
                                sb.append(d2.d().e());
                                sb.append("]\n");
                            }
                            if (d2.c().equals(d2.d().b())) {
                                sb.append("Original instrument registered with same name but is incompatible.\n");
                                sb.append(d2.d().a.h());
                                sb.append("\n");
                            } else {
                                sb.append("Conflicting view registered.\n");
                                ngk0 ngk0Var2 = d2.a.get();
                                if (ngk0Var2 == null) {
                                    ngk0Var2 = f470.INSTANCE;
                                }
                                sb.append(ngk0Var2.h());
                                sb.append("FROM instrument ");
                                sb.append(d2.d().b());
                                sb.append("\n");
                                sb.append(d2.d().a.h());
                                sb.append("\n");
                            }
                            logger.log(level, sb.toString());
                        }
                    }
                }
                return i2;
            }
            return i2;
        }
    }
}
