package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;

/* compiled from: TargetsLoader.java */
/* loaded from: classes5.dex */
public final class n4o0 implements hx2<ArrayList<Group>> {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ l4o0 c;

    /* compiled from: TargetsLoader.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
        @Override // java.lang.Runnable
        public final void run() {
            ?? r0 = n4o0.this.c.h;
            if (r0 != 0) {
                r0.c0();
            }
        }
    }

    public n4o0(l4o0 l4o0Var, UserId userId) {
        this.c = l4o0Var;
        this.b = userId;
    }

    @Override // xsna.hx2
    public final void b(ArrayList<Group> arrayList) {
        t6g0 t6g0Var = t6g0.b;
        t6g0.b().S(2, new m4o0(this, arrayList));
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        l4o0 l4o0Var = this.c;
        l4o0Var.f();
        l4o0Var.g.post(new a());
    }
}
