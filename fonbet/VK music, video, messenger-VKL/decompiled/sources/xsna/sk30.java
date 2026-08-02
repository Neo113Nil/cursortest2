package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: MsgListBubbleStyleBuilder.kt */
/* loaded from: classes2.dex */
public final class sk30 {
    public final hk30 a;
    public final a b;

    /* compiled from: MsgListBubbleStyleBuilder.kt */
    public static final class a {
        public ProfilesInfo a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(new StringBuilder("MsgListBubbleStyleState(profiles="), this.a, ')');
        }

        public a(int i) {
            this.a = new ProfilesInfo();
        }
    }

    public sk30(hk30 hk30Var) {
        a1w a1wVar = q1w.a;
        (a1wVar == null ? null : a1wVar).getClass();
        this.a = hk30Var;
        this.b = new a(0);
    }
}
