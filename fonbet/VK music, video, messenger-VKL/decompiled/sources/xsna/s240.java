package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.t240;
import xsna.usi0;
import xsna.wxi0;
import xsna.yre0;

/* compiled from: MultiAccountQueue.kt */
/* loaded from: classes.dex */
public final class s240 {
    public final mui0 a;
    public final yre0 b;
    public final io.reactivex.rxjava3.subjects.f<a> c;
    public final io.reactivex.rxjava3.subjects.f d;
    public final ConcurrentHashMap<UserId, sq9> e;

    /* compiled from: MultiAccountQueue.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final UserId a;
        public final t240.a b;

        public a(UserId userId, t240.a aVar) {
            this.a = userId;
            this.b = aVar;
        }

        public final t240.a a() {
            return this.b;
        }

        public final UserId b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "MultiAccountChange(userId=" + this.a + ", info=" + this.b + ')';
        }
    }

    /* compiled from: MultiAccountQueue.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public s240(mui0 mui0Var, yre0 yre0Var) {
        this.a = mui0Var;
        this.b = yre0Var;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        this.d = fVar;
        this.e = new ConcurrentHashMap<>();
        mui0Var.f(new ayi0() { // from class: xsna.r240
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                wxi0 a2 = new vxi0(uxi0Var).a();
                boolean z = a2 instanceof wxi0.a;
                s240 s240Var = s240.this;
                if (z) {
                    s240Var.a(((wxi0.a) a2).a());
                    return;
                }
                if (!(a2 instanceof wxi0.c)) {
                    if (!(a2 instanceof wxi0.d) && !epx.f(a2, wxi0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    sq9 remove = s240Var.e.remove(((wxi0.c) a2).a());
                    if (remove == null || remove.isCancelled()) {
                        return;
                    }
                    remove.cancel();
                }
            }
        });
        ArrayList e = mui0Var.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((usi0.a) it.next()).c().b());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((UserId) it2.next());
        }
    }

    public final void a(UserId userId) {
        ConcurrentHashMap<UserId, sq9> concurrentHashMap = this.e;
        sq9 remove = concurrentHashMap.remove(userId);
        if (remove != null && !remove.isCancelled()) {
            remove.cancel();
        }
        concurrentHashMap.put(userId, vre0.e(this.b.b(new yre0.a.C4133a(new xis(userId, 20))), new t240(userId), "multiaccount_tag", null, new cq3(20, this, userId), null, new b(L.a), 44));
    }
}
