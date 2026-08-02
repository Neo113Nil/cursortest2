package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
/* loaded from: classes11.dex */
public final class lew0 {
    public final int a;
    public final int b;
    public final kew0 c;
    public final io.reactivex.rxjava3.subjects.f<List<iew0>> d;
    public final io.reactivex.rxjava3.subjects.d<b> e;
    public io.reactivex.rxjava3.disposables.c f;
    public final LinkedList<a> g;

    /* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final CallMemberId a;
        public final String b;
        public final StringBuilder c;

        public a(CallMemberId callMemberId, String str, StringBuilder sb) {
            this.a = callMemberId;
            this.b = str;
            this.c = sb;
        }

        public final String a() {
            return this.b;
        }

        public final StringBuilder b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            CallMemberId callMemberId = this.a;
            return this.c.hashCode() + urd0.a((callMemberId == null ? 0 : callMemberId.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return "Text(memberId=" + this.a + ", memberName=" + this.b + ", text=" + ((Object) this.c) + ')';
        }
    }

    /* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
    /* loaded from: classes7.dex */
    public interface b {

        /* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
        public static final class a implements b {
            public final jew0 a;

            public a(jew0 jew0Var) {
                this.a = jew0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Command(command=" + this.a + ')';
            }
        }

        /* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
        /* renamed from: xsna.lew0$b$b, reason: collision with other inner class name */
        public static final class C3264b implements b {
            public static final C3264b a = new C3264b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3264b);
            }

            public final int hashCode() {
                return -1554457031;
            }

            public final String toString() {
                return "Init";
            }
        }

        /* compiled from: VoipAsrOnlineTextHandlerImpl.kt */
        public static final class c implements b {
            public final eew0 a;

            public c(eew0 eew0Var) {
                this.a = eew0Var;
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
                return "TextChunk(text=" + this.a + ')';
            }
        }
    }

    public lew0(int i) {
        kew0 kew0Var = new kew0();
        this.a = 1000;
        this.b = 20;
        this.c = kew0Var;
        this.d = new io.reactivex.rxjava3.subjects.f<>();
        this.e = io.reactivex.rxjava3.subjects.d.N0();
        this.g = new LinkedList<>();
    }

    public final void a() {
        LinkedList<a> linkedList = this.g;
        ArrayList arrayList = new ArrayList(c5g.u(linkedList, 10));
        for (a aVar : linkedList) {
            arrayList.add(new iew0(aVar.a(), aVar.b().toString()));
        }
        this.d.onNext(arrayList);
    }
}
