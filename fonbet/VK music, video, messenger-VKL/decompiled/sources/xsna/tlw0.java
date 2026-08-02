package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipChangeNameAction.kt */
/* loaded from: classes7.dex */
public abstract class tlw0 implements kj50 {

    /* compiled from: VoipChangeNameAction.kt */
    public static abstract class a extends tlw0 {

        /* compiled from: VoipChangeNameAction.kt */
        /* renamed from: xsna.tlw0$a$a, reason: collision with other inner class name */
        public static final class C3757a extends a {
            public static final C3757a b = new C3757a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3757a);
            }

            public final int hashCode() {
                return -231942376;
            }

            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: VoipChangeNameAction.kt */
        public static final class b extends a {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("NameChanged(name="), this.b, ')');
            }
        }
    }

    /* compiled from: VoipChangeNameAction.kt */
    public static final class b extends tlw0 {
        public static final b b = new b();
    }

    /* compiled from: VoipChangeNameAction.kt */
    public static abstract class c extends tlw0 {

        /* compiled from: VoipChangeNameAction.kt */
        public static final class a extends c {
            public static final a b = new a();
        }
    }

    /* compiled from: VoipChangeNameAction.kt */
    public static final class d extends tlw0 {
        public static final d b = new d();
    }

    /* compiled from: VoipChangeNameAction.kt */
    public static abstract class e extends tlw0 {

        /* compiled from: VoipChangeNameAction.kt */
        public static final class a extends e {
            public static final a b = new a();
        }

        /* compiled from: VoipChangeNameAction.kt */
        public static final class b extends e {
            public static final b b = new b();
        }

        /* compiled from: VoipChangeNameAction.kt */
        public static final class c extends e {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Group(groupId="), this.b, ')');
            }
        }
    }
}
