package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pkb implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pkb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                rkb rkbVar = (rkb) this.c;
                return rkbVar.b.b(aeb.e, rkbVar.g);
            case 1:
                smm0 smm0Var = (smm0) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"start processing load"});
                }
                CopyOnWriteArrayList<otz> copyOnWriteArrayList = smm0Var.i;
                ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
                g5g.L(arrayList, new tmm0(smm0Var));
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(arrayList);
                return s3q0.a;
            default:
                return ((ru.mail.libverify.requests.c) this.c).b();
        }
    }
}
