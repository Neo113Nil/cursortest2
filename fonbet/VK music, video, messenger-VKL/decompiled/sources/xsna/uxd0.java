package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.common.MemberAction;
import java.util.List;

/* compiled from: ProfileInfoModelEvent.kt */
/* loaded from: classes2.dex */
public abstract class uxd0 {

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class a extends uxd0 {
        public final izs<InterfaceC3848a, gzs<s3q0>> a;

        /* compiled from: ProfileInfoModelEvent.kt */
        /* renamed from: xsna.uxd0$a$a, reason: collision with other inner class name */
        public interface InterfaceC3848a {
            io.reactivex.rxjava3.internal.operators.completable.h o(io.reactivex.rxjava3.internal.operators.observable.l0 l0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super InterfaceC3848a, ? extends gzs<s3q0>> izsVar) {
            this.a = izsVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class a0 extends uxd0 {
        public static final a0 a = new a0();
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class b extends uxd0 {
        public final Peer a;
        public final boolean b;

        public b() {
            this(0);
        }

        public b(Peer peer, boolean z) {
            this.a = peer;
            this.b = z;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            this(Peer.Unknown.e, false);
            Serializer.c<Peer> cVar = Peer.CREATOR;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class b0 extends uxd0 {
        public final DialogExt a;
        public final in0 b;

        public b0(DialogExt dialogExt, in0 in0Var) {
            this.a = dialogExt;
            this.b = in0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class c extends uxd0 {
        public static final c a = new c();
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class c0 extends uxd0 {
        public final DialogExt a;
        public final ng1 b;

        public c0(DialogExt dialogExt, ng1 ng1Var) {
            this.a = dialogExt;
            this.b = ng1Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class d extends uxd0 {
        public final bb a;

        public d(bb bbVar) {
            this.a = bbVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class d0 extends uxd0 {
        public final List<MemberAction> a;
        public final boolean b;
        public final kp5 c;

        public d0(List list, boolean z, kp5 kp5Var) {
            this.a = list;
            this.b = z;
            this.c = kp5Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class e extends uxd0 {
        public final int a = 250;
        public final itb b;
        public final jtb c;

        public e(itb itbVar, jtb jtbVar) {
            this.b = itbVar;
            this.c = jtbVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class e0 extends uxd0 {
        public final boolean a;

        public e0(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class f extends uxd0 {
        public final boolean a;
        public final avj0 b;

        public f(boolean z, avj0 avj0Var) {
            this.a = z;
            this.b = avj0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class f0 extends uxd0 {
        public final int a = 5;
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class g extends uxd0 {
        public final CharSequence a;
        public final ji0 b;

        public g(String str, ji0 ji0Var) {
            this.a = str;
            this.b = ji0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class g0 extends uxd0 {
        public final cck0 a;

        public g0(cck0 cck0Var) {
            this.a = cck0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class h extends uxd0 {
        public static final h a = new h();
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class h0 extends uxd0 {
        public final CharSequence a;
        public final defpackage.e b;

        public h0(String str, defpackage.e eVar) {
            this.a = str;
            this.b = eVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class i extends uxd0 {
        public final izs<Integer, s3q0> a;

        public i(izs izsVar) {
            this.a = izsVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class i0 extends uxd0 {
        public final DialogExt a;
        public final defpackage.i b;

        public i0(DialogExt dialogExt, defpackage.i iVar) {
            this.a = dialogExt;
            this.b = iVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class j extends uxd0 {
        public final l1 a;

        public j(l1 l1Var) {
            this.a = l1Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class j0 extends uxd0 {
        public final j1 a;

        public j0(j1 j1Var) {
            this.a = j1Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class k extends uxd0 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1244366153;
        }

        public final String toString() {
            return "ShowCallOptionsDialog";
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class k0 extends uxd0 {
        public final ww a;

        public k0(ww wwVar) {
            this.a = wwVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class l extends uxd0 {
        public final CharSequence a;
        public final g4 b;

        public l(String str, g4 g4Var) {
            this.a = str;
            this.b = g4Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class l0 extends uxd0 {
        public final w40 a;

        public l0(w40 w40Var) {
            this.a = w40Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class m extends uxd0 {
        public final CharSequence a;
        public final h4 b;

        public m(String str, h4 h4Var) {
            this.a = str;
            this.b = h4Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class m0 extends uxd0 {
        public final v6 a;

        public m0(v6 v6Var) {
            this.a = v6Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class n extends uxd0 {
        public final long a;

        public n(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ShowComplainToChannelMiniApp(channelId="));
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class n0 extends uxd0 {
        public final rj1 a;

        public n0(rj1 rj1Var) {
            this.a = rj1Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class o extends uxd0 {
        public final hd a;

        public o(hd hdVar) {
            this.a = hdVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class o0 extends uxd0 {
        public final uho0 a;

        public o0(uho0 uho0Var) {
            this.a = uho0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class p extends uxd0 {
        public final yc a;

        public p(yc ycVar) {
            this.a = ycVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class p0 extends uxd0 {
        public final hk70 a;

        public p0(hk70 hk70Var) {
            this.a = hk70Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class q extends uxd0 {
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static abstract class q0 extends uxd0 {

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class a extends q0 {
            public final yc a;

            public a(yc ycVar) {
                this.a = ycVar;
            }
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class b extends q0 {
            public static final b a = new b();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class c extends q0 {
            public static final c a = new c();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class d extends q0 {
            public static final d a = new d();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class e extends q0 {
            public static final e a = new e();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class f extends q0 {
            public static final f a = new f();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class g extends q0 {
            public static final g a = new g();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class h extends q0 {
            public static final h a = new h();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class i extends q0 {
            public final String a;
            public final ie3 b;

            public i(String str, ie3 ie3Var) {
                this.a = str;
                this.b = ie3Var;
            }
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class j extends q0 {
            public static final j a = new j();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class k extends q0 {
            public static final k a = new k();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class l extends q0 {
            public static final l a = new l();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class m extends q0 {
            public static final m a = new m();
        }

        /* compiled from: ProfileInfoModelEvent.kt */
        public static final class n extends q0 {
            public static final n a = new n();
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class r extends uxd0 {
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class r0 extends uxd0 {
        public static final r0 a = new r0();
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class s extends uxd0 {
        public final CharSequence a;
        public final mh b;

        public s(String str, mh mhVar) {
            this.a = str;
            this.b = mhVar;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class t extends uxd0 {
        public final DialogExt a;
        public final CharSequence b;

        public t(DialogExt dialogExt, String str) {
            this.a = dialogExt;
            this.b = str;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class u extends uxd0 {
        public final DialogExt a;
        public final CharSequence b;

        public u(DialogExt dialogExt, String str) {
            this.a = dialogExt;
            this.b = str;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class v extends uxd0 {
        public final CharSequence a;
        public final ry0 b;

        public v(String str, ry0 ry0Var) {
            this.a = str;
            this.b = ry0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class w extends uxd0 {
        public final Throwable a;

        public w(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class x extends uxd0 {
        public final ProfilesInfo a;
        public final String b;

        public x(ProfilesInfo profilesInfo, String str) {
            this.a = profilesInfo;
            this.b = str;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class y extends uxd0 {
        public final rs0 a;

        public y(rs0 rs0Var) {
            this.a = rs0Var;
        }
    }

    /* compiled from: ProfileInfoModelEvent.kt */
    public static final class z extends uxd0 {
        public final sx0 a;

        public z(sx0 sx0Var) {
            this.a = sx0Var;
        }
    }
}
