package xsna;

import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;

/* compiled from: PollEditorPatch.kt */
/* loaded from: classes4.dex */
public interface yob0 extends xl50 {

    /* compiled from: PollEditorPatch.kt */
    public interface a extends yob0 {

        /* compiled from: PollEditorPatch.kt */
        /* renamed from: xsna.yob0$a$a, reason: collision with other inner class name */
        public static final class C4122a implements a {
            public final PostingPollDto b;
            public final PostingPollDto c;
            public final PollEditorMode d;
            public final PollEditorUiConfig e;
            public final long f;

            public C4122a(PostingPollDto postingPollDto, PostingPollDto postingPollDto2, PollEditorMode pollEditorMode, PollEditorUiConfig pollEditorUiConfig, long j) {
                this.b = postingPollDto;
                this.c = postingPollDto2;
                this.d = pollEditorMode;
                this.e = pollEditorUiConfig;
                this.f = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4122a)) {
                    return false;
                }
                C4122a c4122a = (C4122a) obj;
                return epx.f(this.b, c4122a.b) && epx.f(this.c, c4122a.c) && epx.f(this.d, c4122a.d) && epx.f(this.e, c4122a.e) && this.f == c4122a.f;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                PostingPollDto postingPollDto = this.c;
                return Long.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (postingPollDto == null ? 0 : postingPollDto.hashCode())) * 31)) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DataLoaded(poll=");
                sb.append(this.b);
                sb.append(", lastSavedPoll=");
                sb.append(this.c);
                sb.append(", mode=");
                sb.append(this.d);
                sb.append(", config=");
                sb.append(this.e);
                sb.append(", startScreenElapsedTime=");
                return vu5.a(')', this.f, sb);
            }
        }
    }

    /* compiled from: PollEditorPatch.kt */
    public interface b extends yob0 {

        /* compiled from: PollEditorPatch.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 359132959;
            }

            public final String toString() {
                return "CloseInCurrentStep";
            }
        }

        /* compiled from: PollEditorPatch.kt */
        /* renamed from: xsna.yob0$b$b, reason: collision with other inner class name */
        public static final class C4123b implements b {
            public static final C4123b b = new C4123b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4123b);
            }

            public final int hashCode() {
                return 1158780648;
            }

            public final String toString() {
                return "DismissProgressDialog";
            }
        }

        /* compiled from: PollEditorPatch.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1624540555;
            }

            public final String toString() {
                return "DontShowExitDialog";
            }
        }

        /* compiled from: PollEditorPatch.kt */
        public static final class d implements b {
            public final PollEditorScreen b;

            public d(PollEditorScreen pollEditorScreen) {
                this.b = pollEditorScreen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenInCurrentStep(step=" + this.b + ')';
            }
        }

        /* compiled from: PollEditorPatch.kt */
        public static final class e implements b {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -959204631;
            }

            public final String toString() {
                return "ShowProgressDialog";
            }
        }
    }
}
