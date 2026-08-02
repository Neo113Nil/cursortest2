package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;

/* compiled from: PollEditorSideEffect.kt */
/* loaded from: classes4.dex */
public interface qpb0 {

    /* compiled from: PollEditorSideEffect.kt */
    public interface a extends qpb0 {

        /* compiled from: PollEditorSideEffect.kt */
        /* renamed from: xsna.qpb0$a$a, reason: collision with other inner class name */
        public static final class C3567a implements a {
            public final PickerTechMetrics a;

            public C3567a(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3567a) && epx.f(this.a, ((C3567a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AnimatedCloseWithoutResult(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class b implements a {
            public final PickerTechMetrics a;

            public b(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CloseWithRemovePoll(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class c implements a {
            public final PostingPollDto a;
            public final PickerTechMetrics b;

            public c(PostingPollDto postingPollDto, PickerTechMetrics pickerTechMetrics) {
                this.a = postingPollDto;
                this.b = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "CloseWithResult(poll=" + this.a + ", techMetrics=" + this.b + ')';
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class d implements a {
            public final PickerTechMetrics a;

            public d(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
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
                return "CloseWithoutAnimation(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class e implements a {
            public final PickerTechMetrics a;

            public e(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Dismiss(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 79369175;
            }

            public final String toString() {
                return "ExpandModalBottomSheet";
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class g implements a {
            public final long a;

            public g(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("OpenDatePicker(dateMs="));
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class h implements a {
            public final long a;

            public h(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("OpenTimePicker(dateMs="));
            }
        }

        /* compiled from: PollEditorSideEffect.kt */
        public static final class i implements a {
            public final Throwable a;
            public final int b;

            public i(Throwable th, int i) {
                this.a = th;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && this.b == iVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowSnackbarError(throwable=");
                sb.append(this.a);
                sb.append(", errorStringResId=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }
}
