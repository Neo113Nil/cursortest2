package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerUtilsItemVisibilityCheckStrategy.kt */
@ozl
/* loaded from: classes17.dex */
public final class mjf0 implements pvx {
    public final boolean a;
    public final float b = 0.5f;

    public mjf0(boolean z, int i) {
        this.a = z;
    }

    @Override // xsna.pvx
    public final boolean b(RecyclerView recyclerView, View view) {
        return fco0.f(recyclerView, view, 0.5f, this.b, this.a);
    }

    @Override // xsna.pvx
    public final void a() {
    }
}
