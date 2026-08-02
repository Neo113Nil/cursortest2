package xsna;

import com.vk.push.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MergedPushMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class f920 implements zje0 {
    public final ArrayList a;
    public final hpj b;
    public final Logger c;
    public final nm8 d;

    public f920(ArrayList arrayList, Logger logger) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = arrayList;
        this.b = zvj.a(wglVar);
        this.c = logger.createLogger("MergedReceiver");
        this.d = w0b.a(-2, null, null, 6);
    }

    @Override // xsna.zje0
    public final void a() {
        Logger.DefaultImpls.debug$default(this.c, "Pause receive messages", null, 2, null);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zje0) it.next()).a();
        }
        iyx.d(this.b.b);
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zje0) it.next()).b(sj80Var);
        }
    }

    @Override // xsna.zje0
    public final b9f0 d() {
        return this.d;
    }

    @Override // xsna.zje0
    public final void e() {
        Logger.DefaultImpls.debug$default(this.c, "Stop receive messages", null, 2, null);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zje0) it.next()).e();
        }
        zvj.c(this.b, null);
    }

    @Override // xsna.zje0
    public final void g() {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zje0) it.next()).d());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            myc0.h(this.b, null, null, new e920((b9f0) it2.next(), this, null), 3);
        }
        Logger.DefaultImpls.debug$default(this.c, "Start receive messages", null, 2, null);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((zje0) it3.next()).g();
        }
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zje0) it.next()).h(sj80Var);
        }
    }
}
