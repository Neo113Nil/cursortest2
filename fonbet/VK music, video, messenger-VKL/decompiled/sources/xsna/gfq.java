package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.log.L;
import com.vk.uxpolls.presentation.view.PollsWebView;

/* compiled from: ExternalNpsPollController.kt */
/* loaded from: classes16.dex */
public final class gfq {
    public final PollsWebView a;
    public final bfq b;
    public final io.reactivex.rxjava3.subjects.d<b> c = io.reactivex.rxjava3.subjects.d.N0();
    public final io.reactivex.rxjava3.subjects.d<Integer> d = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: ExternalNpsPollController.kt */
    public static abstract class b {

        /* compiled from: ExternalNpsPollController.kt */
        public static final class a extends b {
            public final ExternalNpsCondition a;

            public a(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            @Override // xsna.gfq.b
            public final ExternalNpsCondition a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Init(condition=" + this.a + ')';
            }
        }

        /* compiled from: ExternalNpsPollController.kt */
        /* renamed from: xsna.gfq$b$b, reason: collision with other inner class name */
        public static final class C2941b extends b {
            public final ExternalNpsCondition a;

            public C2941b(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            @Override // xsna.gfq.b
            public final ExternalNpsCondition a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2941b) && this.a == ((C2941b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PollCompleted(condition=" + this.a + ')';
            }
        }

        /* compiled from: ExternalNpsPollController.kt */
        public static final class c extends b {
            public final ExternalNpsCondition a;

            public c(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            @Override // xsna.gfq.b
            public final ExternalNpsCondition a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PollError(condition=" + this.a + ')';
            }
        }

        /* compiled from: ExternalNpsPollController.kt */
        public static final class d extends b {
            public final ExternalNpsCondition a;

            public d(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            @Override // xsna.gfq.b
            public final ExternalNpsCondition a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PollLoading(condition=" + this.a + ')';
            }
        }

        /* compiled from: ExternalNpsPollController.kt */
        public static final class e extends b {
            public final ExternalNpsCondition a;

            public e(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            @Override // xsna.gfq.b
            public final ExternalNpsCondition a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PollReady(condition=" + this.a + ')';
            }
        }

        public abstract ExternalNpsCondition a();
    }

    public gfq(PollsWebView pollsWebView, bfq bfqVar) {
        this.a = pollsWebView;
        this.b = bfqVar;
    }

    /* compiled from: ExternalNpsPollController.kt */
    public static final class a implements dub0 {
        public final ExternalNpsCondition b;
        public final bfq c;
        public final io.reactivex.rxjava3.core.v<b> d;
        public final io.reactivex.rxjava3.core.v<Integer> e;

        public a(ExternalNpsCondition externalNpsCondition, bfq bfqVar, io.reactivex.rxjava3.core.v<b> vVar, io.reactivex.rxjava3.core.v<Integer> vVar2) {
            this.b = externalNpsCondition;
            this.c = bfqVar;
            this.d = vVar;
            this.e = vVar2;
        }

        @Override // xsna.dub0
        public final void Gk() {
            L.e("CLIPS_NPS", "onPollInited");
            this.d.onNext(new b.e(this.b));
        }

        @Override // xsna.dub0
        public final void J6(Throwable th) {
            L.e("CLIPS_NPS", ms9.b("onPollError: ", th));
            this.d.onNext(new b.c(this.b));
        }

        @Override // xsna.dub0
        public final void i1() {
            L.e("CLIPS_NPS", "onPollCompleted");
            bfq bfqVar = this.c;
            ExternalNpsCondition externalNpsCondition = this.b;
            bfqVar.e(externalNpsCondition);
            this.d.onNext(new b.C2941b(externalNpsCondition));
        }

        @Override // xsna.dub0
        public final void on() {
            L.e("CLIPS_NPS", "onPollHidden");
            bfq bfqVar = this.c;
            ExternalNpsCondition externalNpsCondition = this.b;
            bfqVar.e(externalNpsCondition);
            this.d.onNext(new b.C2941b(externalNpsCondition));
        }

        @Override // xsna.dub0
        public final void v9(int i) {
            L.e("CLIPS_NPS", lhg.a(i, "onPollResized: "));
            this.e.onNext(Integer.valueOf(iah0.a(i)));
        }

        @Override // xsna.dub0
        public final void A9() {
        }
    }
}
