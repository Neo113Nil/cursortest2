package xsna;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AbstractPollBackgroundAdapter.kt */
/* loaded from: classes4.dex */
public abstract class ng<T> extends zoj0<T, RecyclerView.e0> {
    public final FunctionReferenceImpl e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public ng(gzs<s3q0> gzsVar) {
        this.e = (FunctionReferenceImpl) gzsVar;
    }

    public abstract Object K0();

    public void L0(int i) {
        this.f = 0;
    }

    public abstract void N0(Object obj);

    public int getCurrentPosition() {
        return this.f;
    }
}
