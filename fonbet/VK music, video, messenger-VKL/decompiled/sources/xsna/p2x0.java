package xsna;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VoipToolTipFeature.kt */
/* loaded from: classes7.dex */
public final class p2x0 {
    public final t2x0 a;
    public final io.reactivex.rxjava3.subjects.d<c> b = io.reactivex.rxjava3.subjects.d.O0(c.b.a);
    public final io.reactivex.rxjava3.subjects.f<b> c;
    public final io.reactivex.rxjava3.disposables.b d;

    /* compiled from: VoipToolTipFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<b, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b bVar) {
            b bVar2 = bVar;
            p2x0 p2x0Var = (p2x0) this.receiver;
            t2x0 t2x0Var = p2x0Var.a;
            io.reactivex.rxjava3.subjects.d<c> dVar = p2x0Var.b;
            if (bVar2 instanceof b.C3489b) {
                c P0 = dVar.P0();
                b.C3489b c3489b = (b.C3489b) bVar2;
                String str = c3489b.a;
                if (P0.equals(c.b.a) && t2x0Var.b(str)) {
                    dVar.onNext(new c.C3490c(str, c3489b.b));
                }
            } else if (bVar2 instanceof b.c) {
                c P02 = dVar.P0();
                b.c cVar = (b.c) bVar2;
                if (P02 instanceof c.C3490c) {
                    c.C3490c c3490c = (c.C3490c) P02;
                    dVar.onNext(new c.d(cVar.a, c3490c.a, c3490c.b));
                }
            } else {
                if (!(bVar2 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c P03 = dVar.P0();
                if (P03 instanceof c.d) {
                    t2x0Var.c(((c.d) P03).a);
                    dVar.onNext(c.a.a);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipToolTipFeature.kt */
    public interface b {

        /* compiled from: VoipToolTipFeature.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: VoipToolTipFeature.kt */
        /* renamed from: xsna.p2x0$b$b, reason: collision with other inner class name */
        public static final class C3489b implements b {
            public final String a;
            public final String b;

            public C3489b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3489b)) {
                    return false;
                }
                C3489b c3489b = (C3489b) obj;
                return epx.f(this.a, c3489b.a) && epx.f(this.b, c3489b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Request(key=");
                sb.append(this.a);
                sb.append(", message=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: VoipToolTipFeature.kt */
        public static final class c implements b {
            public final View a;

            public c(View view) {
                this.a = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return br.b(new StringBuilder("Show(anchor="), this.a, ')');
            }
        }
    }

    /* compiled from: VoipToolTipFeature.kt */
    public interface c {

        /* compiled from: VoipToolTipFeature.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: VoipToolTipFeature.kt */
        public static final class b implements c {
            public static final b a = new b();
        }

        /* compiled from: VoipToolTipFeature.kt */
        /* renamed from: xsna.p2x0$c$c, reason: collision with other inner class name */
        public static final class C3490c implements c {
            public final String a;
            public final String b;

            public C3490c(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3490c)) {
                    return false;
                }
                C3490c c3490c = (C3490c) obj;
                return epx.f(this.a, c3490c.a) && epx.f(this.b, c3490c.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Requested(key=");
                sb.append(this.a);
                sb.append(", message=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: VoipToolTipFeature.kt */
        public static final class d implements c {
            public final String a;
            public final View b;
            public final String c;

            public d(View view, String str, String str2) {
                this.a = str;
                this.b = view;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(key=");
                sb.append(this.a);
                sb.append(", anchor=");
                sb.append(this.b);
                sb.append(", message=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    public p2x0(t2x0 t2x0Var) {
        this.a = t2x0Var;
        io.reactivex.rxjava3.subjects.f<b> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        bVar.b(fVar.a0(asu0.a.d()).subscribe(new bpt0(new a(1, this, p2x0.class, "accept", "accept(Lcom/vk/voip/ui/tooltip/feature/VoipToolTipFeature$Event;)V", 0), 5)));
    }
}
