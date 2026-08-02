package xsna;

import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.gxh;

/* compiled from: TargetsLoader.java */
/* loaded from: classes5.dex */
public final class m4o0 implements gxh.a {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ n4o0 b;

    /* compiled from: TargetsLoader.java */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
        @Override // java.lang.Runnable
        public final void run() {
            ?? r0 = m4o0.this.b.c.h;
            if (r0 != 0) {
                r0.Z(this.b);
            }
        }
    }

    /* compiled from: TargetsLoader.java */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
        @Override // java.lang.Runnable
        public final void run() {
            ?? r0 = m4o0.this.b.c.h;
            if (r0 != 0) {
                r0.c0();
            }
        }
    }

    public m4o0(n4o0 n4o0Var, ArrayList arrayList) {
        this.b = n4o0Var;
        this.a = arrayList;
    }

    @Override // xsna.gxh.a
    public final void a(@NonNull ArrayList<Group> arrayList) {
        Object obj;
        n4o0 n4o0Var = this.b;
        l4o0 l4o0Var = n4o0Var.c;
        l4o0Var.f();
        UserId userId = n4o0Var.b;
        UserId e = fkq0.e(userId);
        ArrayList arrayList2 = this.a;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Group group = (Group) obj;
            if (fkq0.b(group.c) ? epx.f(group.c, e) : epx.f(group.c, userId)) {
                break;
            }
        }
        if (((Group) obj) == null) {
            Iterator<Group> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Group next = it2.next();
                if (!fkq0.b(next.c)) {
                    next.c = fkq0.e(next.c);
                }
                if (epx.f(next.c, e)) {
                    arrayList2.add(next);
                    break;
                }
            }
        }
        l4o0Var.g.post(new a(l4o0.d(arrayList2)));
    }

    @Override // xsna.gxh.a
    public final void onError() {
        l4o0 l4o0Var = this.b.c;
        l4o0Var.f();
        l4o0Var.g.post(new b());
    }
}
