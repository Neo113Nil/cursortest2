package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import com.vk.im.engine.models.dialogs.DialogExt;
import xsna.jxb;
import xsna.xxd0;

/* compiled from: DelegationChatProfileInfoModel.kt */
/* loaded from: classes2.dex */
public final class rul extends fl6 implements jxb.a {
    public final kxb t;
    public volatile jxb u;

    public rul(DialogExt dialogExt, a1w a1wVar, mxv mxvVar, b25 b25Var, kxb kxbVar) {
        super(dialogExt, a1wVar, mxvVar, b25Var);
        this.t = kxbVar;
        n(dialogExt);
        io.reactivex.rxjava3.core.q k = j() ? io.reactivex.rxjava3.core.q.k(this.j, this.k, (io.reactivex.rxjava3.subjects.d) this.p.getValue(), (io.reactivex.rxjava3.subjects.d) this.o.getValue(), (io.reactivex.rxjava3.subjects.d) this.q.getValue(), new x34(new cl6(), 2)) : io.reactivex.rxjava3.core.q.k(this.j, this.k, (io.reactivex.rxjava3.subjects.d) this.m.getValue(), (io.reactivex.rxjava3.subjects.d) this.l.getValue(), (io.reactivex.rxjava3.subjects.d) this.n.getValue(), new y34(new dl6(), 3));
        k.getClass();
        h(new io.reactivex.rxjava3.internal.operators.observable.y(k, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new com.vk.movika.sdk.base.flow.binding.c(new k9(this, 10), 5)).r0(asu0.a.c()).subscribe(new bw(this, 9), new cw(new mx4(1, this, fl6.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0, 1), 4)));
    }

    @Override // xsna.jxb.a
    public final xxd0 c() {
        xxd0 P0 = getState().P0();
        return P0 == null ? xxd0.c.a : P0;
    }

    @Override // xsna.fl6
    public final void k(sxp sxpVar) {
        super.k(sxpVar);
        jxb jxbVar = this.u;
        if (jxbVar != null) {
            jxbVar.a(sxpVar);
        }
    }

    public final synchronized void n(DialogExt dialogExt) {
        try {
            if (dialogExt.Cb() == null) {
                return;
            }
            jxb jxbVar = this.u;
            if (jxbVar == null) {
                this.u = this.t.a(dialogExt, this);
            } else {
                jxbVar.d(dialogExt);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.fl6, xsna.txd0
    public final void onActivityResult(int i, int i2, Intent intent) {
        jxb jxbVar = this.u;
        if (jxbVar != null) {
            jxbVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // xsna.fl6, xsna.txd0
    public final void onConfigurationChanged(Configuration configuration) {
        jxb jxbVar = this.u;
        if (jxbVar != null) {
            jxbVar.onConfigurationChanged(configuration);
        }
    }

    @Override // xsna.fl6, xsna.txd0
    public final void t() {
        super.t();
        jxb jxbVar = this.u;
        if (jxbVar != null) {
            jxbVar.t();
        }
    }
}
