package xsna;

import android.view.View;
import java.util.Iterator;
import xsna.m6e;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class k6e implements View.OnLayoutChangeListener {
    public final /* synthetic */ m6e.a b;
    public final /* synthetic */ int c;

    public k6e(m6e.a aVar, int i) {
        this.b = aVar;
        this.c = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        androidx.recyclerview.widget.o0 o0Var = this.b.d;
        r0f r0fVar = o0Var instanceof r0f ? (r0f) o0Var : null;
        if (r0fVar != null) {
            Iterator it = r0fVar.e.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(Integer.valueOf(this.c));
            }
        }
    }
}
