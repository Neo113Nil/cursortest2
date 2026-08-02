package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class mtx0 {
    public static final Logger k = Logger.getLogger(mtx0.class.getName());
    public static final mtx0 l = new mtx0(new va90(new ag61(oyr.t(new StringBuilder(), bg61.b, " TaskRunner"), true)));
    public final va90 a;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final Logger b = k;
    public int c = 10000;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final mbs j = new mbs(8, this);

    public mtx0(va90 va90Var) {
        this.a = va90Var;
    }

    public static final void a(mtx0 mtx0Var, wsx0 wsx0Var, long j, boolean z) {
        TimeZone timeZone = bg61.a;
        htx0 htx0Var = wsx0Var.c;
        if (htx0Var.d != wsx0Var) {
            ny61.r("Check failed.");
            return;
        }
        boolean z2 = htx0Var.f;
        htx0Var.f = false;
        htx0Var.d = null;
        mtx0Var.h.remove(htx0Var);
        if (j != -1 && !z2 && !htx0Var.c) {
            htx0Var.f(wsx0Var, j, true);
        }
        if (htx0Var.e.isEmpty()) {
            return;
        }
        mtx0Var.i.add(htx0Var);
        if (z) {
            return;
        }
        mtx0Var.e();
    }

    public final wsx0 b() {
        boolean z;
        TimeZone timeZone = bg61.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            wsx0 wsx0Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                wsx0 wsx0Var2 = (wsx0) ((htx0) it.next()).e.get(0);
                long max = Math.max(0L, wsx0Var2.d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (wsx0Var != null) {
                        z = true;
                        break;
                    }
                    wsx0Var = wsx0Var2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (wsx0Var != null) {
                TimeZone timeZone2 = bg61.a;
                wsx0Var.d = -1L;
                htx0 htx0Var = wsx0Var.c;
                htx0Var.e.remove(wsx0Var);
                arrayList.remove(htx0Var);
                htx0Var.d = wsx0Var;
                arrayList2.add(htx0Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return wsx0Var;
            }
            if (!this.d) {
                this.d = true;
                this.e = nanoTime + j;
                try {
                    try {
                        TimeZone timeZone3 = bg61.a;
                        if (j > 0) {
                            long j2 = j / 1000000;
                            long j3 = j - (1000000 * j2);
                            if (j2 > 0 || j > 0) {
                                wait(j2, (int) j3);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = bg61.a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((htx0) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            htx0 htx0Var2 = (htx0) arrayList.get(size2);
                            htx0Var2.b();
                            if (htx0Var2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (j < this.e - nanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(htx0 htx0Var) {
        TimeZone timeZone = bg61.a;
        if (htx0Var.d == null) {
            boolean isEmpty = htx0Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(htx0Var);
            } else {
                byte[] bArr = yf61.a;
                if (!arrayList.contains(htx0Var)) {
                    arrayList.add(htx0Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final htx0 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new htx0(this, oyr.i(i, CA20Status.STATUS_REQUEST_Q));
    }

    public final void e() {
        TimeZone timeZone = bg61.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        ((ThreadPoolExecutor) this.a.a).execute(this.j);
    }
}
