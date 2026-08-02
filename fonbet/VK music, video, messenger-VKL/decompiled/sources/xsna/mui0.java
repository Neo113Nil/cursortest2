package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.usi0;

/* compiled from: SessionReadOnlyRepository.kt */
/* loaded from: classes11.dex */
public interface mui0 {

    /* compiled from: SessionReadOnlyRepository.kt */
    public static final class a {
        public static ArrayList a(mui0 mui0Var) {
            List<usi0> g = mui0Var.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : g) {
                if (obj instanceof usi0.a) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static ArrayList b(mui0 mui0Var) {
            ArrayList e = mui0Var.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((usi0.a) it.next()).c().b());
            }
            return arrayList;
        }
    }

    UserId a();

    boolean b();

    void c();

    ArrayList d();

    ArrayList e();

    void f(ayi0 ayi0Var);

    List<usi0> g();

    usi0.a i();

    void k(ayi0 ayi0Var);
}
