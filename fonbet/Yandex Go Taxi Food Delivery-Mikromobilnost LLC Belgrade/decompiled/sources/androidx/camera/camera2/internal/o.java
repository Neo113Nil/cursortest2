package androidx.camera.camera2.internal;

import defpackage.d6z;
import defpackage.dyq0;
import defpackage.i8j0;
import defpackage.j8j0;
import defpackage.jyq0;
import defpackage.k8j0;
import defpackage.q0r0;
import defpackage.q38;
import defpackage.q6x0;
import defpackage.q8n;
import defpackage.r38;
import defpackage.sgb1;
import defpackage.szd;
import defpackage.uo7;
import defpackage.yy40;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class o implements k8j0 {
    public s b;
    public List c;
    public volatile jyq0 e;
    public final Object a = new Object();
    public volatile boolean d = false;

    public o(s sVar, ArrayList arrayList) {
        d6z.m("CaptureSession state must be OPENED. Current state:" + sVar.j, sVar.j == CaptureSession$State.OPENED);
        this.b = sVar;
        this.c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final q0r0 a(int i) {
        synchronized (this.a) {
            try {
                List<q0r0> list = this.c;
                if (list == null) {
                    return null;
                }
                for (q0r0 q0r0Var : list) {
                    if (q0r0Var.p == i) {
                        return q0r0Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(j8j0 j8j0Var) {
        if (j8j0Var.getTargetOutputConfigIds().isEmpty()) {
            sgb1.d("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : j8j0Var.getTargetOutputConfigIds()) {
            if (a(num.intValue()) == null) {
                sgb1.d("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    public final int c(j8j0 j8j0Var, i8j0 i8j0Var) {
        synchronized (this.a) {
            try {
                if (!this.d && b(j8j0Var) && this.b != null) {
                    dyq0 dyq0Var = new dyq0();
                    dyq0Var.b.c = j8j0Var.getTemplateId();
                    szd parameters = j8j0Var.getParameters();
                    r38 r38Var = dyq0Var.b;
                    r38Var.getClass();
                    r38Var.b = yy40.p(parameters);
                    dyq0Var.a(new q38(new Camera2RequestProcessor$Camera2CallbackWrapper(this, j8j0Var, i8j0Var, true)));
                    if (this.e != null) {
                        Iterator it = this.e.g.e.iterator();
                        while (it.hasNext()) {
                            dyq0Var.a((uo7) it.next());
                        }
                        q6x0 q6x0Var = this.e.g.g;
                        for (String str : q6x0Var.a.keySet()) {
                            dyq0Var.b.g.a.put(str, q6x0Var.a.get(str));
                        }
                    }
                    Iterator it2 = j8j0Var.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        dyq0Var.c(a(((Integer) it2.next()).intValue()), q8n.d, -1);
                    }
                    return this.b.q(dyq0Var.d());
                }
                return -1;
            } finally {
            }
        }
    }

    public final void d() {
        s sVar;
        synchronized (this.a) {
            try {
                if (!this.d && (sVar = this.b) != null) {
                    sVar.s();
                }
            } finally {
            }
        }
    }

    public final int e(List list, i8j0 i8j0Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!b((j8j0) it.next())) {
                            }
                        } else if (this.b != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            boolean z = true;
                            while (it2.hasNext()) {
                                j8j0 j8j0Var = (j8j0) it2.next();
                                r38 r38Var = new r38();
                                r38Var.c = j8j0Var.getTemplateId();
                                r38Var.b = yy40.p(j8j0Var.getParameters());
                                r38Var.b(new q38(new Camera2RequestProcessor$Camera2CallbackWrapper(this, j8j0Var, i8j0Var, z)));
                                Iterator it3 = j8j0Var.getTargetOutputConfigIds().iterator();
                                while (it3.hasNext()) {
                                    r38Var.d(a(((Integer) it3.next()).intValue()));
                                }
                                arrayList.add(r38Var.e());
                                z = false;
                            }
                            return this.b.p(arrayList);
                        }
                    }
                }
                return -1;
            } finally {
            }
        }
    }
}
