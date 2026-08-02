package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: StickersQuestionOptionsItem.kt */
/* loaded from: classes6.dex */
public abstract class vbl0 {
    public final tlo0 a;
    public final int b;

    /* compiled from: StickersQuestionOptionsItem.kt */
    public static abstract class a extends vbl0 {

        /* compiled from: StickersQuestionOptionsItem.kt */
        /* renamed from: xsna.vbl0$a$a, reason: collision with other inner class name */
        public static final class C3881a extends a {
            public static final C3881a c = new C3881a(tq.h(tlo0.Companion, R.string.story_question_option_block_user));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3881a);
            }

            public final int hashCode() {
                return -2119160914;
            }

            public final String toString() {
                return "Block";
            }
        }

        /* compiled from: StickersQuestionOptionsItem.kt */
        public static final class b extends a {
            public static final b c = new b(tq.h(tlo0.Companion, R.string.story_question_option_delete_question));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1218772310;
            }

            public final String toString() {
                return "Delete";
            }
        }

        /* compiled from: StickersQuestionOptionsItem.kt */
        public static final class c extends a {
            public static final c c = new c(tq.h(tlo0.Companion, R.string.story_question_option_report));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -817835469;
            }

            public final String toString() {
                return "Report";
            }
        }

        /* compiled from: StickersQuestionOptionsItem.kt */
        public static final class d extends a {
            public static final d c = new d(tq.h(tlo0.Companion, R.string.story_question_option_unblock_user));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -970911627;
            }

            public final String toString() {
                return "Unblock";
            }
        }

        public a(tlo0.f fVar) {
            super(R.attr.vk_ui_text_negative, fVar);
        }
    }

    /* compiled from: StickersQuestionOptionsItem.kt */
    public static abstract class b extends vbl0 {

        /* compiled from: StickersQuestionOptionsItem.kt */
        public static final class a extends b {
            public static final a c = new a(tq.h(tlo0.Companion, R.string.story_question_option_answer_to_message));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1154288639;
            }

            public final String toString() {
                return "AnswerToMessage";
            }
        }

        /* compiled from: StickersQuestionOptionsItem.kt */
        /* renamed from: xsna.vbl0$b$b, reason: collision with other inner class name */
        public static final class C3882b extends b {
            public final String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3882b(String str) {
                super(tlo0.a.c(R.string.story_question_option_go_to_profile, str));
                tlo0.Companion.getClass();
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3882b) && epx.f(this.c, ((C3882b) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenProfile(userName="), this.c, ')');
            }
        }

        public b(tlo0 tlo0Var) {
            super(R.attr.vk_ui_text_primary, tlo0Var);
        }
    }

    public vbl0(int i, tlo0 tlo0Var) {
        this.a = tlo0Var;
        this.b = i;
    }
}
