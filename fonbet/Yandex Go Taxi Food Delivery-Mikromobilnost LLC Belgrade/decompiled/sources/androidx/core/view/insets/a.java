package androidx.core.view.insets;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import defpackage.a2x0;
import defpackage.cuf0;
import defpackage.n2v0;
import defpackage.u1w;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class a {
    public final View a;
    public final ArrayList b = new ArrayList();
    public u1w c;
    public u1w d;
    public int e;

    public a(final ViewGroup viewGroup) {
        u1w u1wVar = u1w.e;
        this.c = u1wVar;
        this.d = u1wVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        final Context context = viewGroup.getContext();
        View view = new View(context) { // from class: androidx.core.view.insets.SystemBarStateMonitor$1
            @Override // android.view.View
            public void onConfigurationChanged(Configuration configuration) {
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                a aVar = a.this;
                if (aVar.e != color) {
                    aVar.e = color;
                    for (int size = aVar.b.size() - 1; size >= 0; size--) {
                        ((cuf0) a.this.b.get(size)).b(color);
                    }
                }
            }
        };
        this.a = view;
        view.setWillNotDraw(true);
        n2v0 n2v0Var = new n2v0(6, this);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(view, n2v0Var);
        b.u(view, new a2x0(this));
        viewGroup.addView(view, 0);
    }
}
