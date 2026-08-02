package xsna;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: AudioSnippetQueueSourceImpl.kt */
/* loaded from: classes3.dex */
public final class vx4 implements fjx {
    public final Object a;
    public final Object b;
    public final Object c;

    public vx4(View view, m960 m960Var, tbe0 tbe0Var) {
        this.a = m960Var;
        this.b = tbe0Var;
        this.c = new WeakReference(view);
    }

    @Override // xsna.fjx
    public View a() {
        return (View) ((WeakReference) this.c).get();
    }

    @Override // xsna.fjx
    public float getDuration() {
        return ((Number) ((tbe0) this.b).invoke()).floatValue();
    }

    @Override // xsna.fjx
    public float getProgress() {
        float floatValue = ((Number) ((m960) this.a).invoke()).floatValue();
        float floatValue2 = ((Number) ((tbe0) this.b).invoke()).floatValue();
        return ((double) floatValue) >= ((double) floatValue2) * 0.97d ? floatValue2 : floatValue;
    }

    public vx4(lx4 lx4Var, m200 m200Var) {
        this.a = lx4Var;
        this.b = new io.reactivex.rxjava3.disposables.g();
        this.c = new io.reactivex.rxjava3.disposables.g();
    }
}
