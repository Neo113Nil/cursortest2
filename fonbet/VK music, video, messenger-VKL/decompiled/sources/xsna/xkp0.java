package xsna;

import android.view.ViewConfiguration;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Transformable.kt */
/* loaded from: classes11.dex */
public final class xkp0 extends ytl implements cmb0, nvi {
    public alp0 r;
    public izs<? super ov70, Boolean> s;
    public boolean t;
    public final gj80 u = new gj80(this, 25);
    public final nm8 v = w0b.a(Integer.MAX_VALUE, null, null, 6);
    public p62 w;
    public final tkn0 x;
    public cmb0 y;

    /* compiled from: Transformable.kt */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ afh0 b;

        public a(p62 p62Var) {
            this.b = p62Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object Z0 = dmb0Var.Z0(new ukp0(spjVar.getContext(), this.b, xkp0.this.v, null), spjVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (Z0 != coroutineSingletons) {
                Z0 = s3q0.a;
            }
            return Z0 == coroutineSingletons ? Z0 : s3q0.a;
        }
    }

    public xkp0(alp0 alp0Var, fyi0 fyi0Var, boolean z) {
        this.r = alp0Var;
        this.s = fyi0Var;
        this.t = z;
        xkn0 a2 = skn0.a(new ykp0(this));
        i2(a2);
        this.x = a2;
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        p62 p62Var = this.w;
        if (this.t) {
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (list.get(i).i != 2) {
                    i++;
                } else if (p62Var != null && this.y == null) {
                    xkn0 a2 = skn0.a(new a(p62Var));
                    i2(a2);
                    this.y = a2;
                }
            }
        }
        this.x.H(plb0Var, pointerEventPass, j);
        cmb0 cmb0Var = this.y;
        if (cmb0Var != null) {
            cmb0Var.H(plb0Var, pointerEventPass, j);
        }
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.w = new p62(ViewConfiguration.get(jtl.a(this).getContext()));
    }

    @Override // xsna.cmb0
    public final void h1() {
        this.x.h1();
        cmb0 cmb0Var = this.y;
        if (cmb0Var != null) {
            cmb0Var.h1();
        }
    }
}
