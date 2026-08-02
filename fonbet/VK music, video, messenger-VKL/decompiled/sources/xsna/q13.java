package xsna;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AppBarOffsetHelper.kt */
/* loaded from: classes13.dex */
public final class q13 {
    public final Context a;
    public final List<View> b;
    public final List<u980> c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;

    public q13(int i, Context context, List list) {
        EmptyList emptyList = EmptyList.b;
        this.a = context;
        this.b = list;
        this.c = emptyList;
        this.h = i;
    }

    public final void a(Context context) {
        this.d = ((this.h - this.g) - (context.getTheme().resolveAttribute(R.attr.actionBarSize, new TypedValue(), true) ? TypedValue.complexToDimensionPixelSize(r1.data, context.getResources().getDisplayMetrics()) : 0)) / 2;
    }

    public final void b(NonBouncedAppBarLayout nonBouncedAppBarLayout, boolean z) {
        this.e = z;
        if (!z) {
            c((int) (Resources.getSystem().getDisplayMetrics().density * 24), nonBouncedAppBarLayout);
        } else {
            nonBouncedAppBarLayout.setExpandingBlocked(true);
        }
    }

    public final void c(int i, View view) {
        if (this.e || this.f) {
            return;
        }
        this.g = i;
        a(this.a);
        for (View view2 : this.b) {
            if (view2 != null) {
                view2.setTranslationY(-this.d);
            }
        }
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((u980) it.next()).a();
        }
        this.f = true;
        final lz0 lz0Var = new lz0(this, 1);
        if (view instanceof AppBarLayout) {
            ((AppBarLayout) view).a(new AppBarLayout.f() { // from class: xsna.o13
                @Override // com.google.android.material.appbar.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout, int i2) {
                    lz0.this.invoke(Integer.valueOf(i2));
                }
            });
        }
        if (view instanceof NonBouncedAppBarLayout) {
            ((NonBouncedAppBarLayout) view).a(new NonBouncedAppBarLayout.d() { // from class: xsna.p13
                @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
                public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i2) {
                    lz0.this.invoke(Integer.valueOf(i2));
                }
            });
        }
    }
}
