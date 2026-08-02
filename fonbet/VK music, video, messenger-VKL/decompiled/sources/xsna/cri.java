package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: ComposeUiNode.kt */
/* loaded from: classes11.dex */
public interface cri {
    public static final a h7 = a.a;

    /* compiled from: ComposeUiNode.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final LayoutNode.a b = LayoutNode.T;
        public static final f c = f.i;
        public static final d d = d.i;
        public static final e e = e.i;
        public static final c f = c.i;
        public static final b g = b.i;
        public static final C2678a h = C2678a.i;

        /* compiled from: ComposeUiNode.kt */
        /* renamed from: xsna.cri$a$a, reason: collision with other inner class name */
        public static final class C2678a extends Lambda implements izs<cri, s3q0> {
            public static final C2678a i = new C2678a(1);

            @Override // xsna.izs
            public final s3q0 invoke(cri criVar) {
                cri criVar2 = criVar;
                LayoutNode layoutNode = criVar2 instanceof LayoutNode ? (LayoutNode) criVar2 : null;
                if (layoutNode != null && layoutNode.R) {
                    uzw.b("Apply is called on deactivated node " + criVar2);
                }
                return s3q0.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        public static final class b extends Lambda implements wzs<cri, Integer, s3q0> {
            public static final b i = new b(2);

            @Override // xsna.wzs
            public final s3q0 invoke(cri criVar, Integer num) {
                criVar.i(num.intValue());
                return s3q0.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        public static final class c extends Lambda implements wzs<cri, cp10, s3q0> {
            public static final c i = new c(2);

            @Override // xsna.wzs
            public final s3q0 invoke(cri criVar, cp10 cp10Var) {
                criVar.n(cp10Var);
                return s3q0.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        public static final class d extends Lambda implements wzs<cri, q630, s3q0> {
            public static final d i = new d(2);

            @Override // xsna.wzs
            public final s3q0 invoke(cri criVar, q630 q630Var) {
                criVar.p(q630Var);
                return s3q0.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        public static final class e extends Lambda implements wzs<cri, svi, s3q0> {
            public static final e i = new e(2);

            @Override // xsna.wzs
            public final s3q0 invoke(cri criVar, svi sviVar) {
                criVar.b(sviVar);
                return s3q0.a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        public static final class f extends Lambda implements gzs<LayoutNode> {
            public static final f i = new f(0);

            @Override // xsna.gzs
            public final LayoutNode invoke() {
                return new LayoutNode(2);
            }
        }

        public static C2678a a() {
            return h;
        }

        public static LayoutNode.a b() {
            return b;
        }

        public static b c() {
            return g;
        }

        public static c d() {
            return f;
        }

        public static d e() {
            return d;
        }

        public static e f() {
            return e;
        }
    }

    void b(svi sviVar);

    void i(int i);

    void n(cp10 cp10Var);

    void p(q630 q630Var);
}
