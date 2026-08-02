package xsna;

import com.vk.dto.polls.Poll;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollV3SideEffect.kt */
/* loaded from: classes4.dex */
public interface tsb0 {

    /* compiled from: PollV3SideEffect.kt */
    public static final class a implements tsb0 {
        public final PollAttachment a;

        public a(PollAttachment pollAttachment) {
            this.a = pollAttachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.f.hashCode();
        }

        public final String toString() {
            return "FireEvent(attachment=" + this.a + ')';
        }
    }

    /* compiled from: PollV3SideEffect.kt */
    public static final class b implements tsb0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -682682671;
        }

        public final String toString() {
            return "HideLoading";
        }
    }

    /* compiled from: PollV3SideEffect.kt */
    public static final class c implements tsb0 {
        public final PollAttachment a;

        public c(PollAttachment pollAttachment) {
            this.a = pollAttachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.f.hashCode();
        }

        public final String toString() {
            return "OpenPollEditorModal(attachment=" + this.a + ')';
        }
    }

    /* compiled from: PollV3SideEffect.kt */
    public static final class d implements tsb0 {
        public final Poll a;

        public d(Poll poll) {
            this.a = poll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenResults(poll=" + this.a + ')';
        }
    }

    /* compiled from: PollV3SideEffect.kt */
    public static final class e implements tsb0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -174112586;
        }

        public final String toString() {
            return "ShowLoading";
        }
    }
}
