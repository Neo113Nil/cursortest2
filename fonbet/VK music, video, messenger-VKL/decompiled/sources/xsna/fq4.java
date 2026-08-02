package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: AudioLongtapQueueSourceImpl.kt */
/* loaded from: classes3.dex */
public final class fq4 {
    public final Object a;
    public final Object b;

    public fq4(a000 a000Var, a000 a000Var2) {
        this.a = a000Var;
        this.b = a000Var2;
    }

    public zzz a() {
        return (a000) this.a;
    }

    public View b() {
        return (View) this.a;
    }

    public fq4(lx4 lx4Var) {
        this.a = lx4Var;
        this.b = new io.reactivex.rxjava3.disposables.g();
    }

    public fq4(izs izsVar, Context context, wzs wzsVar) {
        this.b = wzsVar;
        this.a = (View) izsVar.invoke(context);
    }
}
