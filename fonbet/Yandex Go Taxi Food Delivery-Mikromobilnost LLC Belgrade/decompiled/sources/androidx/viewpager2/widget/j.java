package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bx60;
import defpackage.k751;
import defpackage.n751;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class j implements bx60 {
    public static void a(ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT < 30 || applicationInfo.targetSdkVersion < 30) {
            j jVar = new j();
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.o(viewPager2, jVar);
        }
    }

    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        n751 k = androidx.core.view.b.k(viewPager2, n751Var);
        k751 k751Var = k.a;
        if (k751Var.o()) {
            return k;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.core.view.b.d(recyclerView.getChildAt(i), new n751(k));
        }
        n751 n751Var2 = n751.b;
        return n751Var2.g() != null ? n751Var2 : k751Var.c().a.b();
    }
}
