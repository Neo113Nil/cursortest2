package xsna;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes13.dex */
public final class rap extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float sin;
        float cos;
        RectF a = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a2 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a.left < a2.left) {
            double d = (f * 3.141592653589793d) / 2.0d;
            sin = (float) (1.0d - Math.cos(d));
            cos = (float) Math.sin(d);
        } else {
            double d2 = (f * 3.141592653589793d) / 2.0d;
            sin = (float) Math.sin(d2);
            cos = (float) (1.0d - Math.cos(d2));
        }
        drawable.setBounds(rq2.c((int) a.left, (int) a2.left, sin), drawable.getBounds().top, rq2.c((int) a.right, (int) a2.right, cos), drawable.getBounds().bottom);
    }
}
