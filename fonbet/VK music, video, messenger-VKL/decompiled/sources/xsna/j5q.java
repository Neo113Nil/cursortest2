package xsna;

import android.content.Context;
import androidx.compose.material3.SheetValue;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.entries.Html5Action;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.instantjobs.InstantJob;
import com.vkontakte.android.data.b;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.awr0;
import xsna.khv;
import xsna.we20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j5q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j5q(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        w6x w6xVar;
        CountDownLatch e;
        Action action = null;
        switch (this.b) {
            case 0:
                ((k5q) this.c).j((soz) this.d, (or10) this.e, "fragment_error");
                return s3q0.a;
            case 1:
                a1w a1wVar = (a1w) this.c;
                return new z0s(a1wVar, zq70.t((yj50) this.d, (String) this.e, a1wVar));
            case 2:
                khv.b bVar = (khv.b) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                khv khvVar = (khv) this.e;
                String str = (String) ref$ObjectRef.element;
                Html5Entry html5Entry = khv.this.l;
                if (html5Entry != null) {
                    Iterator<Html5Action> it = html5Entry.w.h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Html5Action next = it.next();
                            if (next.b.equals(str)) {
                                action = next.c;
                            }
                        }
                    }
                }
                Action action2 = action;
                if (action2 == null) {
                    return s3q0.a;
                }
                Html5Entry html5Entry2 = khvVar.l;
                if (html5Entry2 == null) {
                    return s3q0.a;
                }
                Context context = bVar.c;
                if (context != null) {
                    String str2 = (String) ref$ObjectRef.element;
                    String str3 = com.vk.newsfeed.common.util.k.a;
                    b.d a = io.reactivex.rxjava3.processors.b.a("ads/html5_inapp_action", "action_name", str2);
                    a.b(html5Entry2.w.b, "track_code");
                    xuo0.a.getClass();
                    a.b(Long.valueOf(xuo0.c()), "at");
                    a.h();
                    di60.w(action2, context, null, null, null, null, 62);
                }
                return s3q0.a;
            case 3:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                InstantJob instantJob = (InstantJob) this.e;
                c7xVar.f(th);
                r6x e2 = c7xVar.e(th);
                synchronized (e2) {
                    try {
                        e2.b();
                        if (instantJob instanceof mkf) {
                            int hashCode = UUID.randomUUID().hashCode();
                            instantJob.b = Integer.valueOf(hashCode);
                            String str4 = e2.a;
                            xuo0.a.getClass();
                            w6xVar = new w6x(hashCode, str4, xuo0.a(), th, instantJob);
                        } else {
                            xuo0.a.getClass();
                            long a2 = xuo0.a();
                            jml jmlVar = e2.b;
                            String type = jmlVar.a(instantJob).getType();
                            ny90 ny90Var = new ny90();
                            jmlVar.b(instantJob, ny90Var);
                            t7x a3 = e2.c.a(a2, type, ny90Var.a.toString());
                            instantJob.b = Integer.valueOf(a3.a);
                            w6xVar = new w6x(a3.a, e2.a, a3.b, th, instantJob);
                        }
                        e = e2.e(w6xVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return e;
            case 4:
                return (we20.b) ((l7r0) this.c).d((ij20) this.d, (we20.a) this.e);
            case 5:
                gdj0 gdj0Var = (gdj0) this.c;
                yvj yvjVar = (yvj) this.d;
                gzs gzsVar = (gzs) this.e;
                if (gdj0Var.d.d.invoke(SheetValue.Hidden).booleanValue()) {
                    myc0.h(yvjVar, null, null, new hx20(gdj0Var, null), 3).E(new ut6(21, gdj0Var, gzsVar));
                }
                return s3q0.a;
            default:
                ((izs) this.c).invoke(new awr0.h(((dqt0) this.d).b, p490.C((tny) ((bpf0) this.e).a())));
                return s3q0.a;
        }
    }
}
