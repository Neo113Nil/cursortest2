package xsna;

/* compiled from: CallStateInteractor.kt */
/* loaded from: classes7.dex */
public interface ea9 {

    /* compiled from: CallStateInteractor.kt */
    public interface a {

        /* compiled from: CallStateInteractor.kt */
        /* renamed from: xsna.ea9$a$a, reason: collision with other inner class name */
        public static final class C2789a implements a {
            public final String a;

            public C2789a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2789a) && epx.f(this.a, ((C2789a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("InCall(callId="), this.a, ')');
            }
        }

        /* compiled from: CallStateInteractor.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    io.reactivex.rxjava3.internal.operators.observable.m1 b();
}
