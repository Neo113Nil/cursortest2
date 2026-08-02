package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Objects;

/* compiled from: QueueSyncManagerHolder.kt */
/* loaded from: classes.dex */
public interface yre0 {

    /* compiled from: QueueSyncManagerHolder.kt */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* compiled from: QueueSyncManagerHolder.kt */
        /* renamed from: xsna.yre0$a$a, reason: collision with other inner class name */
        public static final class C4133a extends a {
            public final gzs<UserId> a;

            public C4133a(gzs<UserId> gzsVar) {
                this.a = gzsVar;
            }

            public final gzs<UserId> a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                C4133a c4133a = obj instanceof C4133a ? (C4133a) obj : null;
                if (c4133a == null) {
                    return false;
                }
                return c4133a == this || epx.f(c4133a.a.invoke(), this.a.invoke());
            }

            public final int hashCode() {
                return Objects.hash(this.a.invoke());
            }
        }

        /* compiled from: QueueSyncManagerHolder.kt */
        public static final class b extends a {
            public static final b c = new b(new nm0(27), new kk1(25));
            public final gzs<UserId> a;
            public final gzs<String> b;

            /* compiled from: QueueSyncManagerHolder.kt */
            /* renamed from: xsna.yre0$a$b$a, reason: collision with other inner class name */
            public static final class C4134a {
                public static b a() {
                    return b.c;
                }
            }

            public b(gzs<UserId> gzsVar, gzs<String> gzsVar2) {
                this.a = gzsVar;
                this.b = gzsVar2;
            }

            public final gzs<String> a() {
                return this.b;
            }

            public final gzs<UserId> b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar == null) {
                    return false;
                }
                if (bVar != this) {
                    return epx.f(bVar.a.invoke(), this.a.invoke()) && epx.f(bVar.b.invoke(), this.b.invoke());
                }
                return true;
            }

            public final int hashCode() {
                return Objects.hash(this.a.invoke(), this.b.invoke());
            }
        }
    }

    ure0 a(a.b bVar);

    vre0 b(a aVar);
}
