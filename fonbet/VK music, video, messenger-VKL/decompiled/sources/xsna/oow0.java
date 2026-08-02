package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VoipGroupSelectorAction.kt */
/* loaded from: classes7.dex */
public abstract class oow0 implements kj50 {

    /* compiled from: VoipGroupSelectorAction.kt */
    public static abstract class a extends oow0 {

        /* compiled from: VoipGroupSelectorAction.kt */
        /* renamed from: xsna.oow0$a$a, reason: collision with other inner class name */
        public static final class C3458a extends a {
            public static final C3458a b = new C3458a();
        }
    }

    /* compiled from: VoipGroupSelectorAction.kt */
    public static final class b extends oow0 {
        public static final b b = new b();
    }

    /* compiled from: VoipGroupSelectorAction.kt */
    public static abstract class c extends oow0 {

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class a extends c {
            public static final a b = new a();
        }
    }

    /* compiled from: VoipGroupSelectorAction.kt */
    public static abstract class d extends oow0 {

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class a extends d {
            public static final a b = new a();
        }
    }

    /* compiled from: VoipGroupSelectorAction.kt */
    public static abstract class e extends oow0 {

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class a extends e {
            public static final a b = new a();
        }

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class b extends e {
            public final CharSequence b;

            public b(CharSequence charSequence) {
                this.b = charSequence;
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
                return thl0.a(new StringBuilder("Query(query="), this.b, ')');
            }
        }

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class c extends e {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipGroupSelectorAction.kt */
    public static abstract class f extends oow0 {

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class a extends f {
            public static final a b = new a();
        }

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class b extends f {
            public static final b b = new b();
        }

        /* compiled from: VoipGroupSelectorAction.kt */
        public static final class c extends f {
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
