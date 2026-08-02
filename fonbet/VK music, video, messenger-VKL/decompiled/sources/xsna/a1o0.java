package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: TaggedItemsAction.kt */
/* loaded from: classes18.dex */
public interface a1o0 extends kj50 {

    /* compiled from: TaggedItemsAction.kt */
    public interface a extends a1o0 {

        /* compiled from: TaggedItemsAction.kt */
        /* renamed from: xsna.a1o0$a$a, reason: collision with other inner class name */
        public static final class C2517a implements a {
            public final long b;
            public final UserId c;
            public final int d;

            public C2517a(UserId userId, long j, int i) {
                this.b = j;
                this.c = userId;
                this.d = i;
            }
        }

        /* compiled from: TaggedItemsAction.kt */
        public static final class b implements a {
            public final long b;
            public final UserId c;
            public final int d;
            public final String e;

            public b(int i, long j, UserId userId, String str) {
                this.b = j;
                this.c = userId;
                this.d = i;
                this.e = str;
            }
        }
    }

    /* compiled from: TaggedItemsAction.kt */
    public static final class b implements a1o0 {
        public static final b b = new b();
    }

    /* compiled from: TaggedItemsAction.kt */
    public static final class c implements a1o0 {
        public static final c b = new c();
    }
}
