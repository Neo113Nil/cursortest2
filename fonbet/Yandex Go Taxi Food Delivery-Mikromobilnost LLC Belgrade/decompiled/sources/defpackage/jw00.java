package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class jw00 extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;
    public final tls w;

    public jw00(int i, int i2, int i3, tls tlsVar, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        tlsVar = (i4 & 8) != 0 ? new ws00(5) : tlsVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        if (((Boolean) this.w.invoke(Integer.valueOf(recyclerView.getChildAdapterPosition(view)))).booleanValue()) {
            rect.top = this.a;
            WeakHashMap weakHashMap = b.a;
            int layoutDirection = view.getLayoutDirection();
            int i = this.c;
            int i2 = this.b;
            if (layoutDirection == 1) {
                rect.right = i2;
                rect.left = i;
            } else {
                rect.left = i2;
                rect.right = i;
            }
        }
    }

    public jw00() {
        this(0, 0, 0, null, 15);
    }
}
