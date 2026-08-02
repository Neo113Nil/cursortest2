package xsna;

import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class tl10 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tl10(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.google.android.material.datepicker.c) this.d).q.smoothScrollToPosition(this.c);
                return;
            default:
                int i = this.c;
                y301 y301Var = (y301) this.d;
                if (i != 0) {
                    a401 a401Var = y301Var.a;
                    a401Var.v = 1;
                    synchronized (a401Var.u) {
                        try {
                            Iterator it = a401Var.u.iterator();
                            while (it.hasNext()) {
                                ((gn01) it.next()).b(i);
                            }
                        } finally {
                        }
                    }
                    y301Var.a.d();
                    return;
                }
                a401 a401Var2 = y301Var.a;
                a401Var2.v = 3;
                a401Var2.c = true;
                a401Var2.d = true;
                synchronized (a401Var2.u) {
                    try {
                        Iterator it2 = a401Var2.u.iterator();
                        while (it2.hasNext()) {
                            ((gn01) it2.next()).a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
