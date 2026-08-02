package xsna;

/* compiled from: DialogsListConfig.kt */
/* loaded from: classes18.dex */
public interface esm {

    /* compiled from: DialogsListConfig.kt */
    public static final class a {
        public static final a d = new a(true, true, true);
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public static a a(int i, boolean z, boolean z2) {
            return new a((i & 256) != 0, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(false) * 31, 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, true), 31, this.a), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogViewConfig(useChatsMembersCountAsDialogDescription=false, isPinDialogsEnabled=true, isPreviewEnabled=true, isDialogsBirthdayCakeEnabled=true, showStatus=true, showTime=true, showMuted=true, isLongClickEnabled=true, isEmptyListInfoAvailable=");
            sb.append(this.a);
            sb.append(", isContactsAvailable=");
            sb.append(this.b);
            sb.append(", isStoriesAvailable=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    jtm a();

    m5e0 b();

    default a c() {
        return a.d;
    }

    fo50 d();

    g6o0 e();

    mo8 f();

    bfz g();

    nsm h();

    io.reactivex.rxjava3.core.q<io8> i();

    io.reactivex.rxjava3.core.q<ng20> j();

    default boolean k() {
        return false;
    }

    int l();

    drz<xrm> m();

    k9q0 n();

    int o();
}
