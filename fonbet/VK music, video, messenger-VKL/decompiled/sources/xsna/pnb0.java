package xsna;

import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import java.util.List;
import java.util.Map;

/* compiled from: PollEditorAction.kt */
/* loaded from: classes4.dex */
public interface pnb0 extends kj50 {

    /* compiled from: PollEditorAction.kt */
    public interface a extends pnb0 {

        /* compiled from: PollEditorAction.kt */
        /* renamed from: xsna.pnb0$a$a, reason: collision with other inner class name */
        public static final class C3521a implements a {
            public final PostingPollDto b;

            public C3521a(PostingPollDto postingPollDto) {
                this.b = postingPollDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3521a) && epx.f(this.b, ((C3521a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "CloseWithResult(poll=" + this.b + ')';
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class b implements a {
            public final PostingPollDto b;
            public final PollEditorUiConfig c;
            public final gob0 d;

            public b(PostingPollDto postingPollDto, PollEditorUiConfig pollEditorUiConfig, gob0 gob0Var) {
                this.b = postingPollDto;
                this.c = pollEditorUiConfig;
                this.d = gob0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "EditPoll(poll=" + this.b + ", config=" + this.c + ", changes=" + this.d + ')';
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class c implements a {
            public final yrb0 b;
            public final List c;
            public final List d;
            public final Map e;

            public c(yrb0 yrb0Var, List list, List list2, Map map) {
                this.b = yrb0Var;
                this.c = list;
                this.d = list2;
                this.e = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NewPollUiState(state=");
                sb.append(this.b);
                sb.append(", items=");
                mr.c(", visible=", sb, this.c);
                mr.c(", answers=", sb, this.d);
                sb.append((Object) bpw.a(this.e));
                sb.append(')');
                return sb.toString();
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class d implements a {
            public final long b;

            public d(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("PickPollEditDate(endDateMs="));
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class e implements a {
            public final PostingPollDto b;
            public final PollEditorUiConfig c;

            public e(PostingPollDto postingPollDto, PollEditorUiConfig pollEditorUiConfig) {
                this.b = postingPollDto;
                this.c = pollEditorUiConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "SavePoll(poll=" + this.b + ", config=" + this.c + ')';
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class f implements a {
            public final List<Long> b;

            public f(List<Long> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("UpdateDeletedAnswers(deletedAnswers="), this.b);
            }
        }
    }

    /* compiled from: PollEditorAction.kt */
    public static final class b implements pnb0 {
        public final PollEditorModalBottomSheet.PollEditorArguments b;

        public b(PollEditorModalBottomSheet.PollEditorArguments pollEditorArguments) {
            this.b = pollEditorArguments;
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
            return "Init(arguments=" + this.b + ')';
        }
    }

    /* compiled from: PollEditorAction.kt */
    public interface c extends pnb0 {

        /* compiled from: PollEditorAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 998783727;
            }

            public final String toString() {
                return "AnimatedCloseWithoutResult";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1409745561;
            }

            public final String toString() {
                return "CloseInCurrentStep";
            }
        }

        /* compiled from: PollEditorAction.kt */
        /* renamed from: xsna.pnb0$c$c, reason: collision with other inner class name */
        public static final class C3522c implements c {
            public static final C3522c b = new C3522c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3522c);
            }

            public final int hashCode() {
                return -1519189405;
            }

            public final String toString() {
                return "CloseWithRemove";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class d implements c {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1341158997;
            }

            public final String toString() {
                return "CloseWithoutAnimation";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class e implements c {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -547454048;
            }

            public final String toString() {
                return "DismissProgressDialog";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class f implements c {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -144337965;
            }

            public final String toString() {
                return "DontShowExitDialog";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class g implements c {
            public final PollEditorScreen b;

            public g(PollEditorScreen pollEditorScreen) {
                this.b = pollEditorScreen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenInCurrentStep(screen=" + this.b + ')';
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class h implements c {
            public final boolean b;

            public h(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.b == ((h) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("RequestCloseBottomSheet(shouldExpandOnCancel="), this.b, ')');
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class i implements c {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1566884145;
            }

            public final String toString() {
                return "ShowProgressDialog";
            }
        }

        /* compiled from: PollEditorAction.kt */
        public static final class j implements c {
            public final Throwable b;
            public final int c;

            public j(Throwable th, int i) {
                this.b = th;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.b, jVar.b) && this.c == jVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowSnackbarError(throwable=");
                sb.append(this.b);
                sb.append(", errorStringResId=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }
}
