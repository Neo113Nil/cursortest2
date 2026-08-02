package xsna;

import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: RotatableMaskViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class vmg0<T> extends vif0<T> implements tmg0 {
    public final zzz n;
    public final EmptyList o;
    public final List<View> p;

    public vmg0(View view, zzz zzzVar) {
        super(view);
        this.n = zzzVar;
        this.o = EmptyList.b;
        this.p = Collections.singletonList(view);
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.p;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.o;
    }

    @Override // xsna.vif0
    public final void l6() {
        this.n.d(this);
    }

    @Override // xsna.vif0
    public final void m6() {
        this.n.b(this);
    }

    @Override // xsna.vif0
    public void i6(T t) {
    }
}
