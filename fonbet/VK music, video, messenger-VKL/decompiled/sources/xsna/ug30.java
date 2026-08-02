package xsna;

import android.view.View;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: MsgAction.kt */
/* loaded from: classes18.dex */
public abstract class ug30 {

    /* compiled from: MsgAction.kt */
    public static final class a extends ug30 {
        public static final a a = new a();
    }

    /* compiled from: MsgAction.kt */
    public static final class a0 extends ug30 {
        public static final a0 a = new a0();
    }

    /* compiled from: MsgAction.kt */
    public static final class b extends ug30 {
        public static final b a = new b();
    }

    /* compiled from: MsgAction.kt */
    public static final class b0 extends ug30 {
        public static final b0 a = new b0();
    }

    /* compiled from: MsgAction.kt */
    public static final class c extends ug30 {
        public static final c a = new c();
    }

    /* compiled from: MsgAction.kt */
    public static final class c0<PayloadType> extends ug30 {
        public static final c0 c;
        public final Peer a;
        public final PayloadType b;

        static {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            c = new c0(Peer.Unknown.e, null);
        }

        public c0(Peer peer, PayloadType payloadtype) {
            this.a = peer;
            this.b = payloadtype;
        }
    }

    /* compiled from: MsgAction.kt */
    public static final class d extends ug30 {
        public final String a;

        public d() {
            this(0);
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
            return ho8.a(new StringBuilder("CopyErid(erid="), this.a, ')');
        }

        public d(String str) {
            this.a = str;
        }

        public /* synthetic */ d(int i) {
            this("");
        }
    }

    /* compiled from: MsgAction.kt */
    public static final class d0 extends ug30 {
        public static final d0 a = new d0();
    }

    /* compiled from: MsgAction.kt */
    public static final class e extends ug30 {
        public static final e a = new e();
    }

    /* compiled from: MsgAction.kt */
    public static final class e0 extends ug30 {
        public static final e0 a = new e0();
    }

    /* compiled from: MsgAction.kt */
    public static final class f extends ug30 {
        public static final f a = new f();
    }

    /* compiled from: MsgAction.kt */
    public static final class g extends ug30 {
        public static final g a = new g();
    }

    /* compiled from: MsgAction.kt */
    public static final class h extends ug30 {
        public static final h a = new h();
    }

    /* compiled from: MsgAction.kt */
    public static final class i extends ug30 {
        public static final i a = new i();
    }

    /* compiled from: MsgAction.kt */
    public static final class j extends ug30 {
        public static final j a = new j();
    }

    /* compiled from: MsgAction.kt */
    public static final class k extends ug30 {
        public static final k a = new k();
    }

    /* compiled from: MsgAction.kt */
    public static final class l extends ug30 {
        public static final l a = new l();
    }

    /* compiled from: MsgAction.kt */
    public static final class m extends ug30 {
        public static final m a = new m();
    }

    /* compiled from: MsgAction.kt */
    public static final class n extends ug30 {
        public static final n a = new n();
    }

    /* compiled from: MsgAction.kt */
    public static final class o extends ug30 {
        public static final o a = new o();
    }

    /* compiled from: MsgAction.kt */
    public static final class p extends ug30 {
        public static final p a = new p();
    }

    /* compiled from: MsgAction.kt */
    public static final class q extends ug30 {
        public static final q a = new q();
    }

    /* compiled from: MsgAction.kt */
    public static final class r extends ug30 {
        public static final r a = new r();
    }

    /* compiled from: MsgAction.kt */
    public static final class s extends ug30 {
        public static final s a = new s();
    }

    /* compiled from: MsgAction.kt */
    public static final class t extends ug30 {
        public static final t a = new t();
    }

    /* compiled from: MsgAction.kt */
    public static final class u extends ug30 {
        public static final u a = new u();
    }

    /* compiled from: MsgAction.kt */
    public static final class v extends ug30 {
        public static final v a = new v();
    }

    /* compiled from: MsgAction.kt */
    public static final class y extends ug30 {
        public static final y a = new y();
    }

    /* compiled from: MsgAction.kt */
    public static final class z extends ug30 {
        public final Peer a;
        public final boolean b;
        public final View c;

        public z(Peer peer, boolean z, View view) {
            this.a = peer;
            this.b = z;
            this.c = view;
        }
    }

    /* compiled from: MsgAction.kt */
    public static final class w extends ug30 {
        public final boolean a;

        public w(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShareFile(isEnabled="), this.a, ')');
        }

        public w() {
            this(true);
        }
    }

    /* compiled from: MsgAction.kt */
    public static final class x extends ug30 {
        public final boolean a;

        public x(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.a == ((x) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShareFiles(isEnabled="), this.a, ')');
        }

        public x() {
            this(true);
        }
    }
}
