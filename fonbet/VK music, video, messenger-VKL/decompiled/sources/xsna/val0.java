package xsna;

import com.vk.dto.stories.model.StoryQuestionEntry;

/* compiled from: StickersListItem.kt */
/* loaded from: classes6.dex */
public final class val0 implements hfz {
    public final StoryQuestionEntry b;
    public final a c;

    /* compiled from: StickersListItem.kt */
    public interface a {

        /* compiled from: StickersListItem.kt */
        /* renamed from: xsna.val0$a$a, reason: collision with other inner class name */
        public static final class C3878a implements a {
            public final boolean a;

            public C3878a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3878a) && this.a == ((C3878a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Multi(isSelected="), this.a, ')');
            }
        }

        /* compiled from: StickersListItem.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1440744629;
            }

            public final String toString() {
                return "Single";
            }
        }
    }

    public val0(StoryQuestionEntry storyQuestionEntry, a aVar) {
        this.b = storyQuestionEntry;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof val0)) {
            return false;
        }
        val0 val0Var = (val0) obj;
        return epx.f(this.b, val0Var.b) && epx.f(this.c, val0Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "QuestionItem(storyQuestionEntry=" + this.b + ", selectionMode=" + this.c + ')';
    }
}
