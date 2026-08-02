package xsna;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import xsna.eyx;
import xsna.y8v;

/* compiled from: Modifier.kt */
/* loaded from: classes11.dex */
public interface q630 {

    /* compiled from: Modifier.kt */
    public interface b extends q630 {
        @Override // xsna.q630
        default <R> R a(R r, wzs<? super R, ? super b, ? extends R> wzsVar) {
            return wzsVar.invoke(r, this);
        }

        @Override // xsna.q630
        default boolean b(izs<? super b, Boolean> izsVar) {
            return izsVar.invoke(this).booleanValue();
        }
    }

    <R> R a(R r, wzs<? super R, ? super b, ? extends R> wzsVar);

    boolean b(izs<? super b, Boolean> izsVar);

    default q630 g(q630 q630Var) {
        return q630Var == a.a ? this : new bag(this, q630Var);
    }

    /* compiled from: Modifier.kt */
    public static abstract class c implements htl {
        public hpj c;
        public int d;
        public c f;
        public c g;
        public jr70 h;
        public androidx.compose.ui.node.o i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public y8v.a n;
        public boolean o;
        public c b = this;
        public int e = -1;

        public final yvj W1() {
            hpj hpjVar = this.c;
            if (hpjVar != null) {
                return hpjVar;
            }
            hpj a = zvj.a(itl.g(this).getCoroutineContext().plus(new gyx((eyx) itl.g(this).getCoroutineContext().get(eyx.a.b))));
            this.c = a;
            return a;
        }

        public boolean X1() {
            return !(this instanceof dx5);
        }

        public void Y1() {
            if (this.o) {
                uzw.b("node attached multiple times");
            }
            if (this.i == null) {
                uzw.b("attach invoked on a node without a coordinator");
            }
            this.o = true;
            this.l = true;
        }

        public void Z1() {
            if (!this.o) {
                uzw.b("Cannot detach a node that is not attached");
            }
            if (this.l) {
                uzw.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.m) {
                uzw.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.o = false;
            hpj hpjVar = this.c;
            if (hpjVar != null) {
                zvj.c(hpjVar, new ModifierNodeDetachedCancellationException());
                this.c = null;
            }
        }

        public void d2() {
            if (!this.o) {
                uzw.b("reset() called on an unattached node");
            }
            c2();
        }

        public void e2() {
            if (!this.o) {
                uzw.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.l) {
                uzw.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.l = false;
            a2();
            this.m = true;
        }

        public void f2() {
            if (!this.o) {
                uzw.b("node detached multiple times");
            }
            if (this.i == null) {
                uzw.b("detach invoked on a node without a coordinator");
            }
            if (!this.m) {
                uzw.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.m = false;
            y8v.a aVar = this.n;
            if (aVar != null) {
                aVar.invoke();
            }
            b2();
        }

        public void g2(c cVar) {
            this.b = cVar;
        }

        public void h2(androidx.compose.ui.node.o oVar) {
            this.i = oVar;
        }

        @Override // xsna.htl
        public final c z() {
            return this.b;
        }

        public void a2() {
        }

        public void b2() {
        }

        public void c2() {
        }
    }

    /* compiled from: Modifier.kt */
    public static final class a implements q630 {
        public static final /* synthetic */ a a = new a();

        @Override // xsna.q630
        public final boolean b(izs<? super b, Boolean> izsVar) {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // xsna.q630
        public final q630 g(q630 q630Var) {
            return q630Var;
        }

        @Override // xsna.q630
        public final <R> R a(R r, wzs<? super R, ? super b, ? extends R> wzsVar) {
            return r;
        }
    }
}
